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

package com.liferay.portal.aop.internal;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.HashMapDictionary;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.PrototypeServiceFactory;
import org.osgi.framework.ServiceObjects;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentConstants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 * Placeholder for AopServiceManager, only supports re-registration not aspects.
 *
 * @author Preston Crary
 */
@Component(immediate = true, service = {})
public class AopServiceManagerPlaceholder {

	@Activate
	public void activate(BundleContext bundleContext) {
		_serviceTracker = new ServiceTracker<>(
			bundleContext, AopService.class,
			new AopServiceHolderServiceTrackerCustomizer(bundleContext));

		_serviceTracker.open();
	}

	@Deactivate
	public void deactivate() {
		_serviceTracker.close();
	}

	private static Class<?>[] _getAopInterfaces(AopService aopService) {
		Class<?>[] aopInterfaces = aopService.getAopInterfaces();

		Class<? extends AopService> aopServiceClass = aopService.getClass();

		if (ArrayUtil.isEmpty(aopInterfaces)) {
			return ArrayUtil.remove(
				aopServiceClass.getInterfaces(), AopService.class);
		}

		for (Class<?> aopInterface : aopInterfaces) {
			if (!aopInterface.isInterface()) {
				throw new IllegalArgumentException(
					StringBundler.concat(
						"Unable to proxy ", aopServiceClass, " because ",
						aopInterface, " is not an interface"));
			}

			if (!aopInterface.isAssignableFrom(aopServiceClass)) {
				throw new IllegalArgumentException(
					StringBundler.concat(
						"Unable to proxy ", aopServiceClass, " because ",
						aopInterface, " is not implemented"));
			}

			if (aopInterface == AopService.class) {
				throw new IllegalArgumentException(
					"Do not include AopService in service interfaces");
			}
		}

		return Arrays.copyOf(aopInterfaces, aopInterfaces.length);
	}

	private static Dictionary<String, Object> _getProperties(
		AopService aopService, ServiceReference<AopService> serviceReference) {

		Dictionary<String, Object> properties = aopService.getProperties();

		if (properties == null) {
			for (String key : serviceReference.getPropertyKeys()) {
				if (_frameworkKeys.contains(key)) {
					continue;
				}

				if (properties == null) {
					properties = new HashMapDictionary<>();
				}

				properties.put(key, serviceReference.getProperty(key));
			}
		}

		return properties;
	}

	private static Object _getService(
		BundleContext bundleContext, AopService aopService,
		Class<?>[] aopServiceInterfaces,
		ServiceReference<AopService> serviceReference) {

		Object serviceScope = serviceReference.getProperty(
			Constants.SERVICE_SCOPE);

		if (Constants.SCOPE_PROTOTYPE.equals(serviceScope)) {
			ServiceObjects<AopService> serviceObjects =
				bundleContext.getServiceObjects(serviceReference);

			return new AopServicePrototypeServiceFactory(
				aopServiceInterfaces, serviceObjects);
		}

		aopService.setAopProxy(aopService);

		return aopService;
	}

	private static final Set<String> _frameworkKeys = new HashSet<>(
		Arrays.asList(
			ComponentConstants.COMPONENT_ID, ComponentConstants.COMPONENT_NAME,
			Constants.OBJECTCLASS, Constants.SERVICE_BUNDLEID,
			Constants.SERVICE_ID, Constants.SERVICE_SCOPE));

	private ServiceTracker<?, ?> _serviceTracker;

	private static class AopServiceHolder {

		private AopServiceHolder(
			AopService aopService, ServiceRegistration<?> serviceRegistration) {

			_aopService = aopService;
			_serviceRegistration = serviceRegistration;
		}

		private final AopService _aopService;
		private final ServiceRegistration<?> _serviceRegistration;

	}

	private static class AopServiceHolderServiceTrackerCustomizer
		implements ServiceTrackerCustomizer<AopService, AopServiceHolder> {

		@Override
		public AopServiceHolder addingService(
			ServiceReference<AopService> serviceReference) {

			AopService aopService = _bundleContext.getService(serviceReference);

			Class<?>[] aopInterfaces = _getAopInterfaces(aopService);

			if (aopInterfaces.length == 0) {
				throw new IllegalArgumentException(
					StringBundler.concat(
						"Unable to register ", aopService.getClass(),
						" without a service interface"));
			}

			String[] aopServiceNames = new String[aopInterfaces.length];

			for (int i = 0; i < aopInterfaces.length; i++) {
				aopServiceNames[i] = aopInterfaces[i].getName();
			}

			return new AopServiceHolder(
				aopService,
				_bundleContext.registerService(
					aopServiceNames,
					_getService(
						_bundleContext, aopService, aopInterfaces,
						serviceReference),
					_getProperties(aopService, serviceReference)));
		}

		@Override
		public void modifiedService(
			ServiceReference<AopService> serviceReference,
			AopServiceHolder aopServiceHolder) {

			aopServiceHolder._serviceRegistration.setProperties(
				_getProperties(aopServiceHolder._aopService, serviceReference));
		}

		@Override
		public void removedService(
			ServiceReference<AopService> serviceReference,
			AopServiceHolder aopServiceHolder) {

			aopServiceHolder._serviceRegistration.unregister();
		}

		private AopServiceHolderServiceTrackerCustomizer(
			BundleContext bundleContext) {

			_bundleContext = bundleContext;
		}

		private final BundleContext _bundleContext;

	}

	private static class AopServicePrototypeServiceFactory
		implements PrototypeServiceFactory<Object> {

		@Override
		public Object getService(
			Bundle bundle, ServiceRegistration<Object> serviceRegistration) {

			AopService aopService = _serviceObjects.getService();

			Class<?>[] aopInterfaces = aopService.getAopInterfaces();

			Class<? extends AopService> aopServiceClass = aopService.getClass();

			if (ArrayUtil.isEmpty(aopInterfaces)) {
				aopInterfaces = ArrayUtil.remove(
					aopServiceClass.getInterfaces(), AopService.class);
			}

			if (!Arrays.equals(_aopServiceInterfaces, aopInterfaces)) {
				throw new IllegalArgumentException(
					StringBundler.concat(
						"Prototype AopService ", aopService,
						" must have immutable AOP interfaces, expected ",
						Arrays.toString(_aopServiceInterfaces), " but was ",
						Arrays.toString(aopInterfaces)));
			}

			aopService.setAopProxy(aopService);

			return aopService;
		}

		@Override
		public void ungetService(
			Bundle bundle, ServiceRegistration<Object> serviceRegistration,
			Object aopService) {

			_serviceObjects.ungetService((AopService)aopService);
		}

		private AopServicePrototypeServiceFactory(
			Class<?>[] aopServiceInterfaces,
			ServiceObjects<AopService> serviceObjects) {

			_aopServiceInterfaces = aopServiceInterfaces;
			_serviceObjects = serviceObjects;
		}

		private final Class<?>[] _aopServiceInterfaces;
		private final ServiceObjects<AopService> _serviceObjects;

	}

}