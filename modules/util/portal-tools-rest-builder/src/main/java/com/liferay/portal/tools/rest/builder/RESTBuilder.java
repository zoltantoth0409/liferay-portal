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

package com.liferay.portal.tools.rest.builder;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringUtil_IW;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.Validator_IW;
import com.liferay.portal.tools.ArgumentsUtil;
import com.liferay.portal.tools.rest.builder.internal.freemarker.tool.JavaTool;
import com.liferay.portal.tools.rest.builder.internal.freemarker.util.FreeMarkerUtil;
import com.liferay.portal.tools.rest.builder.internal.util.CamelCaseUtil;
import com.liferay.portal.tools.rest.builder.internal.util.FileUtil;
import com.liferay.portal.tools.rest.builder.internal.util.FormatUtil;
import com.liferay.portal.tools.rest.builder.internal.yaml.config.Application;
import com.liferay.portal.tools.rest.builder.internal.yaml.config.ConfigYAML;
import com.liferay.portal.tools.rest.builder.internal.yaml.openapi.Components;
import com.liferay.portal.tools.rest.builder.internal.yaml.openapi.Info;
import com.liferay.portal.tools.rest.builder.internal.yaml.openapi.OpenAPIYAML;
import com.liferay.portal.tools.rest.builder.internal.yaml.openapi.Schema;
import com.liferay.portal.tools.rest.builder.internal.yaml.util.YAMLUtil;

import java.io.File;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peter Shin
 */
public class RESTBuilder {

	public static void main(String[] args) throws Exception {
		Map<String, String> arguments = ArgumentsUtil.parseArguments(args);

		String copyrightFileName = GetterUtil.getString(
			arguments.get("copyright.file"));
		String restConfigDirName = GetterUtil.getString(
			arguments.get("rest.config.dir"),
			RESTBuilderArgs.REST_CONFIG_DIR_NAME);

		try {
			new RESTBuilder(copyrightFileName, restConfigDirName);
		}
		catch (Exception e) {
			ArgumentsUtil.processMainException(arguments, e);
		}
	}

	public RESTBuilder(String copyrightFileName, String restConfigDirName)
		throws Exception {

		_configDir = new File(restConfigDirName);
		_copyrightFileName = copyrightFileName;

		File configFile = new File(_configDir, _REST_CONFIG_FILE_NAME);

		_configYAML = YAMLUtil.loadConfigYAML(configFile);

		Map<String, Object> context = new HashMap<>();

		context.put("configYAML", _configYAML);
		context.put("javaTool", JavaTool.getInstance());
		context.put("stringUtil", StringUtil_IW.getInstance());
		context.put("validator", Validator_IW.getInstance());

		_createApplicationFile(context);

		File[] files = FileUtil.getFiles(_configDir, "rest-openapi", ".yaml");

		for (File file : files) {
			OpenAPIYAML openAPIYAML = YAMLUtil.loadOpenAPIYAML(file);

			Info info = openAPIYAML.getInfo();

			String version = info.getVersion();

			if (Validator.isNull(version)) {
				continue;
			}

			String versionDirName = "v" + version.replaceAll("\\D", "_");

			context.put("openAPIYAML", openAPIYAML);
			context.put("versionDirName", versionDirName);

			Components components = openAPIYAML.getComponents();

			Map<String, Schema> schemas = components.getSchemas();

			for (Map.Entry<String, Schema> entry : schemas.entrySet()) {
				context.put("schema", entry.getValue());

				String schemaName = entry.getKey();

				context.put("schemaName", schemaName);
				context.put(
					"schemaPath", CamelCaseUtil.fromCamelCase(schemaName));

				_createBaseResourceImplFile(
					context, schemaName, versionDirName);
				_createDTOFile(context, schemaName, versionDirName);
				_createPropertiesFile(context, schemaName, versionDirName);
				_createResourceFile(context, schemaName, versionDirName);
				_createResourceImplFile(context, schemaName, versionDirName);
			}
		}

		FileUtil.deleteFiles(_configYAML.getApiDir(), _START_TIME_MILLIS);

		FileUtil.deleteFiles(_configYAML.getImplDir(), _START_TIME_MILLIS);

		FileUtil.deleteFiles(
			_configYAML.getImplDir() + "/../resources/OSGI-INF/",
			_START_TIME_MILLIS);
	}

	private void _createApplicationFile(Map<String, Object> context)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/internal/jaxrs/application/");

		Application application = _configYAML.getApplication();

		sb.append(application.getClassName());

		sb.append(".java");

		FileUtil.write(
			sb.toString(),
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "application", context));
	}

	private void _createBaseResourceImplFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/internal/resource/");
		sb.append(versionDirName);
		sb.append("/Base");
		sb.append(schemaName);
		sb.append("ResourceImpl.java");

		FileUtil.write(
			sb.toString(),
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "base_resource_impl", context));
	}

	private void _createDTOFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getApiDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/dto/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(schemaName);
		sb.append(".java");

		FileUtil.write(
			sb.toString(),
			FreeMarkerUtil.processTemplate(_copyrightFileName, "dto", context));
	}

	private void _createPropertiesFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/../resources/OSGI-INF/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(CamelCaseUtil.fromCamelCase(schemaName));
		sb.append(".properties");

		FileUtil.write(
			sb.toString(),
			FreeMarkerUtil.processTemplate(null, "properties", context));
	}

	private void _createResourceFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getApiDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/resource/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(schemaName);
		sb.append("Resource.java");

		FileUtil.write(
			sb.toString(),
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "resource", context));
	}

	private void _createResourceImplFile(
			Map<String, Object> context, String schemaName,
			String versionDirName)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(_configYAML.getImplDir());
		sb.append("/");

		String apiPackagePath = _configYAML.getApiPackagePath();

		sb.append(apiPackagePath.replace('.', '/'));

		sb.append("/internal/resource/");
		sb.append(schemaName);
		sb.append("ResourceImpl.java");

		File oldFile = new File(sb.toString());

		sb.setLength(0);

		sb.append(_configYAML.getImplDir());
		sb.append("/");
		sb.append(apiPackagePath.replace('.', '/'));
		sb.append("/internal/resource/");
		sb.append(versionDirName);
		sb.append("/");
		sb.append(schemaName);
		sb.append("ResourceImpl.java");

		File newFile = new File(sb.toString());

		if (oldFile.exists()) {
			String content = FileUtil.read(oldFile);

			content = content.replace(
				apiPackagePath + ".dto",
				apiPackagePath + ".dto." + versionDirName);

			content = content.replace(
				".resource.", ".resource." + versionDirName + ".");

			content = content.replace(
				".internal.resource;",
				".internal.resource." + versionDirName + ";");

			content = content.replace(
				"properties = \"OSGI-INF/",
				"properties = \"OSGI-INF/" + versionDirName + "/");

			File dir = newFile.getParentFile();

			Files.createDirectories(dir.toPath());

			Files.write(
				newFile.toPath(), content.getBytes(StandardCharsets.UTF_8));

			FormatUtil.format(newFile);

			Files.delete(oldFile.toPath());

			System.out.println("Moving " + oldFile.getCanonicalPath());

			return;
		}

		if (newFile.exists()) {
			return;
		}

		FileUtil.write(
			sb.toString(),
			FreeMarkerUtil.processTemplate(
				_copyrightFileName, "resource_impl", context));
	}

	private static final String _REST_CONFIG_FILE_NAME = "rest-config.yaml";

	private static final long _START_TIME_MILLIS = System.currentTimeMillis();

	private final File _configDir;
	private final ConfigYAML _configYAML;
	private final String _copyrightFileName;

}