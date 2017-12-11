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

package com.liferay.util.ant;

import java.io.File;
import java.io.IOException;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.DirSet;
import org.apache.tools.ant.types.FileSet;

/**
 * @author Lily Chi
 */
public class GetFileSetTask extends Task {

	@Override
	public void execute() throws BuildException {
		List<String> classNames = new ArrayList<>();

		Collections.addAll(classNames, _classNames.split(","));

		Set<String> invalidClassName = new HashSet<>();

		if (!_hasInvalidClassNames(classNames, invalidClassName)) {
			_LOGGER.log(
				Level.WARNING,
				"Input class names instead of test class names: {0}",
				invalidClassName.toString());

			return;
		}

		List<Path> classPaths = new ArrayList<>();
		List<Path> srcPaths = new ArrayList<>();

		File baseDir = new File(_rootDir);

		Set<String> missingClassNames = _getMissingClassNames(
			baseDir, classNames, classPaths, srcPaths);

		if (!missingClassNames.isEmpty()) {
			_LOGGER.log(
				Level.WARNING, "No class files found for: {0}",
				missingClassNames.toString());

			if (classPaths.isEmpty()) {
				return;
			}
		}

		Project project = getProject();

		FileSet classFileSet = new FileSet();

		classFileSet.setDir(baseDir);

		for (Path classPath : classPaths) {
			String classPathString = String.valueOf(classPath);

			classPathString = classPathString.substring(_rootDir.length() + 1);

			classFileSet.setIncludes(classPathString);
		}

		classFileSet.setProject(getProject());

		project.addReference("get.file.set.class.set", classFileSet);

		DirSet srcDirSet = new DirSet();

		srcDirSet.setDir(baseDir);

		for (Path srcPath : srcPaths) {
			String srcPathString = String.valueOf(srcPath);

			if (!_checkSrcPath(srcPathString, invalidClassName)) {
				_LOGGER.log(
					Level.WARNING,
					"Invalid class name: {0}",
					invalidClassName.toString());

				return;
			}

			int index = srcPathString.indexOf("src") + 3;

			if (srcPathString.contains(_MODULE_SRC_PARAMETER)) {
				index =
					srcPathString.indexOf(_MODULE_SRC_PARAMETER) +
						_MODULE_SRC_PARAMETER.length();
			}

			srcPathString = srcPathString.substring(
				_rootDir.length() + 1, index);

			srcDirSet.setIncludes(srcPathString);
		}

		srcDirSet.setProject(project);

		project.addReference("get.file.set.src.set", srcDirSet);
	}

	public void setClassNames(String classNames) {
		_classNames = classNames;
	}

	public void setRootDir(String rootDir) {
		_rootDir = rootDir;
	}

	private boolean _hasInvalidClassNames(
		List<String> classNames, Set<String> invalidClassName) {

		for (String className : classNames) {
			if (className.endsWith("Test")) {
				invalidClassName.add(className);
			}
		}

		if (!invalidClassName.isEmpty()) {
			return false;
		}

		return true;
	}

	private boolean _checkSrcPath(
		String absoluteFileName, Set<String> invalidClassName) {

		if (!absoluteFileName.contains("src")) {
			int startIndex = absoluteFileName.lastIndexOf(File.separator);
			int endIndex = absoluteFileName.lastIndexOf(".");

			invalidClassName.add(
				absoluteFileName.substring(startIndex + 1, endIndex));

			return false;
		}

		return true;
	}

	private Set<String> _getMissingClassNames(
		File baseDir, List<String> classNames, List<Path> classPaths,
		List<Path> srcPaths) {

		if (!baseDir.exists() || !baseDir.isDirectory()) {
			throw new BuildException();
		}

		Set<String> missingClassNames = new HashSet<>();

		missingClassNames.addAll(classNames);

		try {
			Files.walkFileTree(
				baseDir.toPath(),
				new SimpleFileVisitor<Path>() {

					@Override
					public FileVisitResult preVisitDirectory(
							Path path, BasicFileAttributes basicFileAttributes)
						throws IOException {

						Path fileNamePath = path.getFileName();

						String fileName = fileNamePath.toString();

						if (_isSkipDirectory(fileName)) {
							return FileVisitResult.SKIP_SUBTREE;
						}

						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFile(
							Path path, BasicFileAttributes basicFileAttributes)
						throws IOException {

						Path fileNamePath = path.getFileName();

						String fileName = fileNamePath.toString();

						for (String className : classNames) {
							if (_matchClassName(className, fileName)) {
								classPaths.add(path);

								missingClassNames.remove(className);
							}
							else if (fileName.equals(
										className.concat(".java"))) {

								srcPaths.add(path);
							}
						}

						return FileVisitResult.CONTINUE;
					}

				});
		}
		catch (IOException ioe) {
			throw new BuildException(ioe);
		}

		return missingClassNames;
	}

	private boolean _matchClassName(String className, String fileName) {
		if (fileName.equals(className.concat(".class"))) {
			return true;
		}

		if (fileName.startsWith(className.concat("$")) &&
			fileName.endsWith(".class")) {

			return true;
		}

		return false;
	}

	private boolean _isSkipDirectory(String fileName) {
		if (fileName.startsWith(".") || _skipList.contains(fileName)) {
			return true;
		}

		return false;
	}

	private static final Logger _LOGGER = Logger.getLogger(
		GetFileSetTask.class.getName());

	private static final String _MODULE_SRC_PARAMETER = String.valueOf(
		Paths.get("src", "main", "java"));

	private static final List<String> _skipList = Arrays.asList(
		"node_modules", "benchmarks", "definitions", "gradle", "lib",
		"nbproject", "oss-licenses", "portal-client", "readme", "sql", "tools");

	private String _classNames;
	private String _rootDir;

}