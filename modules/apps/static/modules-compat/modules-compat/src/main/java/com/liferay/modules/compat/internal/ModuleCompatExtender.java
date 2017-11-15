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

package com.liferay.modules.compat.internal;

import com.liferay.modules.compat.internal.configuration.ModuleCompatExtenderConfiguration;
import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.net.URL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.wiring.FrameworkWiring;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.tracker.BundleTracker;

/**
 * @author Matthew Tambara
 */
@Component(
	configurationPid = "com.liferay.modules.compat.internal.configuration.ModuleCompatExtenderConfiguration",
	immediate = true
)
public class ModuleCompatExtender {

	@Activate
	protected void activate(
			BundleContext bundleContext, Map<String, String> properties)
		throws IOException {

		ModuleCompatExtenderConfiguration moduleCompatExtenderConfiguration =
			ConfigurableUtil.createConfigurable(
				ModuleCompatExtenderConfiguration.class, properties);

		if (!moduleCompatExtenderConfiguration.enabled()) {
			_uninstallBundles(bundleContext, null);

			return;
		}

		String regex = moduleCompatExtenderConfiguration.modulesWhitelist();

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher("");

		_uninstallBundles(bundleContext, matcher);

		Bundle moduleCompatBundle = bundleContext.getBundle();

		URL url = moduleCompatBundle.getEntry("META-INF/compat.properties");

		Properties compatProperties = new Properties();

		try (InputStream inputStream = url.openStream()) {
			compatProperties.load(inputStream);
		}

		BundleTracker<Void> bundleTracker = new BundleTracker<Void>(
			bundleContext, ~Bundle.UNINSTALLED, null) {

			@Override
			public Void addingBundle(Bundle bundle, BundleEvent event) {
				if (_compatBundles.containsKey(bundle)) {
					return null;
				}

				String symbolicName = bundle.getSymbolicName();

				matcher.reset(symbolicName);

				if (matcher.matches()) {
					String exportBundles = compatProperties.getProperty(
						symbolicName);

					if (Validator.isNull(exportBundles)) {
						return null;
					}

					_installCompatBundle(
						bundle, bundleContext,
						_generateExportString(
							moduleCompatBundle, exportBundles));
				}

				return null;
			}

		};

		bundleTracker.open();
	}

	@Deactivate
	protected void deactivate(BundleContext bundleContext) {
		_uninstallBundles(bundleContext, null);
	}

	private String _generateExportString(
		Bundle bundle, String exportedPackages) {

		String[] exports = exportedPackages.split(",");

		StringBundler sb = new StringBundler(exports.length * 4);

		for (String export : exports) {
			export = export.trim();

			sb.append(export);

			sb.append(";version=\"");

			String packageInfoPath = export.replace(
				StringPool.PERIOD, StringPool.SLASH);

			URL url = bundle.getEntry(packageInfoPath.concat("/packageinfo"));

			try (InputStreamReader inputStreamReader = new InputStreamReader(
					url.openStream());
				BufferedReader bufferedReader =
					new BufferedReader(inputStreamReader)) {

				String versionLine = bufferedReader.readLine();

				sb.append(versionLine.substring(8));
			}
			catch (IOException ioe) {
				ReflectionUtil.throwException(ioe);
			}

			sb.append("\",");
		}

		String exportString = sb.toString();

		return exportString.substring(0, exportString.length() - 1);
	}

	private void _installCompatBundle(
		Bundle bundle, BundleContext bundleContext, String exportBundles) {

		String symbolicName = bundle.getSymbolicName();

		try (UnsyncByteArrayOutputStream unsyncByteArrayOutputStream =
				new UnsyncByteArrayOutputStream()) {

			try (JarOutputStream jarOutputStream = new JarOutputStream(
					unsyncByteArrayOutputStream)) {

				Manifest manifest = new Manifest();

				Attributes attributes = manifest.getMainAttributes();

				attributes.putValue(Constants.BUNDLE_MANIFESTVERSION, "2");

				attributes.putValue(
					Constants.BUNDLE_SYMBOLICNAME,
					symbolicName.concat(".compat"));

				attributes.putValue(Constants.BUNDLE_VERSION, "1.0.0");
				attributes.putValue(Constants.EXPORT_PACKAGE, exportBundles);
				attributes.putValue(Constants.FRAGMENT_HOST, symbolicName);
				attributes.putValue("Manifest-Version", "2");

				jarOutputStream.putNextEntry(
					new ZipEntry(JarFile.MANIFEST_NAME));

				manifest.write(jarOutputStream);

				jarOutputStream.closeEntry();
			}

			String location = bundle.getLocation();

			Bundle compatBundle = bundleContext.installBundle(
				location.concat("-compat"),
				new UnsyncByteArrayInputStream(
					unsyncByteArrayOutputStream.unsafeGetByteArray(), 0,
					unsyncByteArrayOutputStream.size()));

			if (_log.isInfoEnabled()) {
				_log.info("Compat fragment " + compatBundle + " installed");
			}

			_refreshBundles(
				bundleContext, Collections.<Bundle>singleton(compatBundle));

			_compatBundles.put(bundle, compatBundle);
		}
		catch (Exception e) {
			_log.error("Unable to install compat fragment for " + bundle, e);
		}
	}

	private void _refreshBundles(
		BundleContext bundleContext, Collection<Bundle> bundles) {

		Bundle systemBundle = bundleContext.getBundle(0);

		FrameworkWiring frameworkWiring = systemBundle.adapt(
			FrameworkWiring.class);

		frameworkWiring.refreshBundles(bundles);
	}

	private void _uninstallBundles(
		BundleContext bundleContext, Matcher matcher) {

		if (_compatBundles.isEmpty()) {
			return;
		}

		List<Bundle> bundles = new ArrayList<>();

		for (Entry<Bundle, Bundle> entry : _compatBundles.entrySet()) {
			Bundle bundle = entry.getKey();

			if (matcher != null) {
				matcher.reset(bundle.getSymbolicName());

				if (matcher.matches()) {
					continue;
				}
			}

			Bundle compatBundle = entry.getValue();

			try {
				compatBundle.uninstall();

				_compatBundles.remove(bundle);
			}
			catch (BundleException be) {
				_log.error("Unable to uninstall " + compatBundle, be);
			}

			bundles.add(bundle);
		}

		_refreshBundles(bundleContext, bundles);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		ModuleCompatExtender.class.getName());

	private static final Map<Bundle, Bundle> _compatBundles = new HashMap<>();

}