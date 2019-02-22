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

import com.liferay.arquillian.extension.junit.bridge.protocol.jmx.JMXTestRunnerMBean;
import com.liferay.arquillian.extension.junit.bridge.remote.manager.Registry;
import com.liferay.arquillian.extension.junit.bridge.result.TestResult;
import com.liferay.petra.io.unsync.UnsyncByteArrayInputStream;

import java.io.InputStream;
import java.io.ObjectInputStream;

import java.lang.reflect.Method;

import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

import org.junit.runners.model.Statement;

/**
 * @author Shuyang Zhou
 */
public class ClientExecutorStatement extends Statement {

	public ClientExecutorStatement(
		Object target, Method method, Registry registry) {

		_target = target;
		_method = method;
		_registry = registry;
	}

	@Override
	public void evaluate() throws Throwable {
		Class<?> testClass = _target.getClass();

		JMXTestRunnerMBean jmxTestRunnerMBean =
			MBeanServerInvocationHandler.newProxyInstance(
				_registry.get(MBeanServerConnection.class), _objectName,
				JMXTestRunnerMBean.class, false);

		try {
			byte[] data = jmxTestRunnerMBean.runTestMethod(
				testClass.getName(), _method.getName());

			try (InputStream inputStream = new UnsyncByteArrayInputStream(data);
				ObjectInputStream oos = new ObjectInputStream(inputStream)) {

				_registry.set(TestResult.class, (TestResult)oos.readObject());
			}
		}
		catch (Throwable t) {
			_registry.set(TestResult.class, new TestResult(t));
		}
	}

	private static final ObjectName _objectName;

	static {
		try {
			_objectName = new ObjectName(JMXTestRunnerMBean.OBJECT_NAME);
		}
		catch (MalformedObjectNameException mone) {
			throw new ExceptionInInitializerError(mone);
		}
	}

	private final Method _method;
	private final Registry _registry;
	private final Object _target;

}