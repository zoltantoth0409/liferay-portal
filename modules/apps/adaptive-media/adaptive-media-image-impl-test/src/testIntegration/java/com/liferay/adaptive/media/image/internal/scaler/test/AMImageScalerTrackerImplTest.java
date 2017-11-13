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

package com.liferay.adaptive.media.image.internal.scaler.test;

import com.liferay.adaptive.media.image.scaler.AMImageScaler;
import com.liferay.adaptive.media.image.scaler.AMImageScalerTracker;
import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.rule.Sync;
import com.liferay.portal.kernel.test.rule.SynchronousDestinationTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.test.log.CaptureAppender;
import com.liferay.portal.test.log.Log4JLoggerTestUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.registry.Registry;
import com.liferay.registry.RegistryUtil;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.runtime.ServiceComponentRuntime;
import org.osgi.service.component.runtime.dto.ComponentDescriptionDTO;
import org.osgi.util.promise.Promise;

/**
 * @author Sergio González
 */
@RunWith(Arquillian.class)
@Sync
public class AMImageScalerTrackerImplTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(),
			SynchronousDestinationTestRule.INSTANCE);

	@Test
	public void testAMImageScalerTrackerLogsWhenAMDefaultImageScalerNotAvailable()
		throws Exception {

		try (CaptureAppender captureAppender =
				Log4JLoggerTestUtil.configureLog4JLogger(
					_ADAPTIVE_MEDIA_IMAGE_SCALER_TRACKER_IMPL, Level.WARN)) {

			_disableAMDefaultImageScaler();

			_amImageScalerTracker.getAMImageScaler(
				RandomTestUtil.randomString());

			_enableAMDefaultImageScaler();

			List<LoggingEvent> loggingEvents =
				captureAppender.getLoggingEvents();

			Assert.assertEquals(
				loggingEvents.toString(), 1, loggingEvents.size());

			LoggingEvent loggingEvent = loggingEvents.get(0);

			Assert.assertEquals(
				"Unable to find default image scaler",
				loggingEvent.getMessage());
		}
	}

	@Test
	public void testAMImageScalerTrackerReturnsAMDefaultImageScalerWhenAsteriskMimeType()
		throws Exception {

		AMImageScaler amImageScaler = _amImageScalerTracker.getAMImageScaler(
			"*");

		Registry registry = RegistryUtil.getRegistry();

		AMImageScaler amDefaultImageScaler = registry.getService(
			_ADAPTIVE_MEDIA_DEFAULT_IMAGE_SCALER);

		Assert.assertEquals(amDefaultImageScaler, amImageScaler);
	}

	@Test
	public void testAMImageScalerTrackerReturnsAMDefaultImageScalerWhenRandomMimeType()
		throws Exception {

		AMImageScaler amImageScaler = _amImageScalerTracker.getAMImageScaler(
			RandomTestUtil.randomString());

		Registry registry = RegistryUtil.getRegistry();

		AMImageScaler amDefaultImageScaler = registry.getService(
			_ADAPTIVE_MEDIA_DEFAULT_IMAGE_SCALER);

		Assert.assertEquals(amDefaultImageScaler, amImageScaler);
	}

	@Test
	public void testAMImageScalerTrackerReturnsAMGIFImageScalerWhenGIFMimeType()
		throws Exception {

		AMImageScaler amImageScaler = _amImageScalerTracker.getAMImageScaler(
			"image/gif");

		Registry registry = RegistryUtil.getRegistry();

		AMImageScaler amGIFImageScaler = registry.getService(
			_ADAPTIVE_MEDIA_GIF_IMAGE_SCALER);

		Assert.assertEquals(amGIFImageScaler, amImageScaler);
	}

	@Test
	public void testAMImageScalerTrackerReturnsNullWhenAMDefaultImageScalerNotAvailable()
		throws Exception {

		try (CaptureAppender captureAppender =
				Log4JLoggerTestUtil.configureLog4JLogger(
					_ADAPTIVE_MEDIA_IMAGE_SCALER_TRACKER_IMPL, Level.WARN)) {

			_disableAMDefaultImageScaler();

			AMImageScaler amImageScaler =
				_amImageScalerTracker.getAMImageScaler(
					RandomTestUtil.randomString());

			Assert.assertNull(amImageScaler);

			_enableAMDefaultImageScaler();
		}
	}

	private void _disableAMDefaultImageScaler() throws Exception {
		Registry registry = RegistryUtil.getRegistry();

		ServiceComponentRuntime serviceComponentRuntime = registry.getService(
			ServiceComponentRuntime.class);

		Object service = registry.getService(
			_ADAPTIVE_MEDIA_IMAGE_SCALER_TRACKER);

		if (service == null) {
			return;
		}

		Bundle bundle = FrameworkUtil.getBundle(service.getClass());

		ComponentDescriptionDTO componentDescriptionDTO =
			serviceComponentRuntime.getComponentDescriptionDTO(
				bundle, _ADAPTIVE_MEDIA_DEFAULT_IMAGE_SCALER);

		Promise<Void> voidPromise = serviceComponentRuntime.disableComponent(
			componentDescriptionDTO);

		voidPromise.getValue();
	}

	private void _enableAMDefaultImageScaler() throws Exception {
		Registry registry = RegistryUtil.getRegistry();

		ServiceComponentRuntime serviceComponentRuntime = registry.getService(
			ServiceComponentRuntime.class);

		Object service = registry.getService(
			_ADAPTIVE_MEDIA_IMAGE_SCALER_TRACKER);

		if (service == null) {
			return;
		}

		Bundle bundle = FrameworkUtil.getBundle(service.getClass());

		ComponentDescriptionDTO componentDescriptionDTO =
			serviceComponentRuntime.getComponentDescriptionDTO(
				bundle, _ADAPTIVE_MEDIA_DEFAULT_IMAGE_SCALER);

		Promise<Void> voidPromise = serviceComponentRuntime.enableComponent(
			componentDescriptionDTO);

		voidPromise.getValue();
	}

	private static final String _ADAPTIVE_MEDIA_DEFAULT_IMAGE_SCALER =
		"com.liferay.adaptive.media.image.internal.scaler.AMDefaultImageScaler";

	private static final String _ADAPTIVE_MEDIA_GIF_IMAGE_SCALER =
		"com.liferay.adaptive.media.image.internal.scaler.AMGIFImageScaler";

	private static final String _ADAPTIVE_MEDIA_IMAGE_SCALER_TRACKER =
		"com.liferay.adaptive.media.image.scaler.AMImageScalerTracker";

	private static final String _ADAPTIVE_MEDIA_IMAGE_SCALER_TRACKER_IMPL =
		"com.liferay.adaptive.media.image.internal.scaler." +
			"AMImageScalerTrackerImpl";

	@Inject
	private AMImageScalerTracker _amImageScalerTracker;

}