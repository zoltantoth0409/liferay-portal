/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.arquillian.extension.junit.bridge.listener;

import com.liferay.arquillian.extension.junit.bridge.remote.manager.Registry;
import com.liferay.arquillian.extension.junit.bridge.result.TestResult;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.RunRules;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

/**
 * @author Shuyang Zhou
 */
public class ServerExecutorStatement extends Statement {

	public ServerExecutorStatement(
		Object target, Method method, Registry registry) {

		_target = target;
		_method = method;
		_registry = registry;
	}

	@Override
	public void evaluate() throws Throwable {
		Class<?> clazz = _target.getClass();

		Statement statement = new InvokeMethod(null, _target) {

			@Override
			public void evaluate() {
				TestResult testResult = TestResult.PASSED;

				Thread currentThread = Thread.currentThread();

				ClassLoader classLoader = currentThread.getContextClassLoader();

				currentThread.setContextClassLoader(clazz.getClassLoader());

				try {
					try {
						_method.invoke(_target);
					}
					catch (InvocationTargetException ite) {
						throw ite.getCause();
					}
				}
				catch (AssumptionViolatedException ave) {
					testResult = new TestResult(ave);
				}
				catch (Throwable t) {
					testResult = _processThrowable(t, _method);
				}
				finally {
					currentThread.setContextClassLoader(classLoader);
				}

				_registry.set(TestResult.class, testResult);
			}

		};

		TestClass testClass = new TestClass(clazz);

		statement = withBefores(statement, Before.class, testClass, _target);

		statement = withAfters(statement, After.class, testClass, _target);

		statement = withRules(
			statement, Rule.class, testClass, _target,
			Description.createTestDescription(
				clazz, _method.getName(), _method.getAnnotations()));

		List<FrameworkMethod> frameworkMethods = new ArrayList<>(
			testClass.getAnnotatedMethods(Test.class));

		frameworkMethods.removeAll(testClass.getAnnotatedMethods(Ignore.class));

		frameworkMethods.sort(Comparator.comparing(FrameworkMethod::getName));

		FrameworkMethod firstFrameworkMethod = frameworkMethods.get(0);

		boolean firstMethod = false;

		if (_method.equals(firstFrameworkMethod.getMethod())) {
			firstMethod = true;

			statement = withBefores(
				statement, BeforeClass.class, testClass, null);
		}

		FrameworkMethod lastFrameworkMethod = frameworkMethods.get(
			frameworkMethods.size() - 1);

		boolean lastMethod = false;

		if (_method.equals(lastFrameworkMethod.getMethod())) {
			lastMethod = true;

			statement = withAfters(
				statement, AfterClass.class, testClass, null);
		}

		evaluateWithClassRule(
			statement, testClass, _target,
			Description.createSuiteDescription(clazz), firstMethod, lastMethod);
	}

	protected void evaluateWithClassRule(
			Statement statement, TestClass junitTestClass, Object target,
			Description description, boolean firstMethod, boolean lastMethod)
		throws Throwable {

		if (!firstMethod && !lastMethod) {
			statement.evaluate();

			return;
		}

		List<TestRule> testRules = junitTestClass.getAnnotatedMethodValues(
			target, ClassRule.class, TestRule.class);

		testRules.addAll(
			junitTestClass.getAnnotatedFieldValues(
				target, ClassRule.class, TestRule.class));

		if (testRules.isEmpty()) {
			statement.evaluate();

			return;
		}

		handleClassRules(testRules, firstMethod, lastMethod, true);

		statement = new RunRules(statement, testRules, description);

		try {
			statement.evaluate();
		}
		finally {
			handleClassRules(testRules, firstMethod, lastMethod, false);
		}
	}

	protected void handleClassRules(
		List<TestRule> testRules, boolean firstMethod, boolean lastMethod,
		boolean enable) {

		for (TestRule testRule : testRules) {
			Class<?> testRuleClass = testRule.getClass();

			if (firstMethod) {
				try {
					Method handleBeforeClassMethod = testRuleClass.getMethod(
						"handleBeforeClass", boolean.class);

					handleBeforeClassMethod.invoke(testRule, enable);
				}
				catch (ReflectiveOperationException roe) {
					continue;
				}
			}

			if (lastMethod) {
				try {
					Method handleAfterClassMethod = testRuleClass.getMethod(
						"handleAfterClass", boolean.class);

					handleAfterClassMethod.invoke(testRule, enable);
				}
				catch (ReflectiveOperationException roe) {
					continue;
				}
			}
		}
	}

	protected Statement withAfters(
		Statement statement, Class<? extends Annotation> afterClass,
		TestClass junitTestClass, Object target) {

		List<FrameworkMethod> frameworkMethods =
			junitTestClass.getAnnotatedMethods(afterClass);

		if (!frameworkMethods.isEmpty()) {
			statement = new RunAfters(statement, frameworkMethods, target);
		}

		return statement;
	}

	protected Statement withBefores(
		Statement statement, Class<? extends Annotation> beforeClass,
		TestClass junitTestClass, Object target) {

		List<FrameworkMethod> frameworkMethods =
			junitTestClass.getAnnotatedMethods(beforeClass);

		if (!frameworkMethods.isEmpty()) {
			statement = new RunBefores(statement, frameworkMethods, target);
		}

		return statement;
	}

	protected Statement withRules(
		Statement statement, Class<? extends Annotation> ruleClass,
		TestClass junitTestClass, Object target, Description description) {

		List<TestRule> testRules = junitTestClass.getAnnotatedMethodValues(
			target, ruleClass, TestRule.class);

		testRules.addAll(
			junitTestClass.getAnnotatedFieldValues(
				target, ruleClass, TestRule.class));

		if (!testRules.isEmpty()) {
			statement = new RunRules(statement, testRules, description);
		}

		return statement;
	}

	private TestResult _processThrowable(Throwable throwable, Method method) {
		Test test = method.getAnnotation(Test.class);

		if (test == null) {
			return new TestResult(throwable);
		}

		Class<?> expected = test.expected();

		if (test.expected() == Test.None.class) {
			return new TestResult(throwable);
		}

		Class<?> clazz = throwable.getClass();

		if (!expected.isAssignableFrom(clazz)) {
			String message =
				"Unexpected exception, expected<" + expected.getName() +
					"> but was<" + clazz.getName() + ">";

			return new TestResult(new Exception(message));
		}

		return TestResult.PASSED;
	}

	private final Method _method;
	private final Registry _registry;
	private final Object _target;

}