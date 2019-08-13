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

package com.liferay.portal.kernel.servlet;

import com.liferay.portal.kernel.portlet.MockLiferayPortletRequest;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.util.PortalImpl;

import javax.portlet.PortletRequest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;

/**
 * @author Alicia García García
 */
public class MultiSessionErrorsTest {

	@BeforeClass
	public static void setUpClass() throws Exception {
		PortalUtil portalUtil = new PortalUtil();

		portalUtil.setPortal(new PortalImpl());
	}

	@Test
	public void testClearHttpServletRequest() {
		String key = RandomTestUtil.randomString();

		SessionErrors.add(_mockHttpServletRequest, key);

		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);

		Assert.assertFalse(MultiSessionErrors.isEmpty(portletRequest));

		MultiSessionErrors.clear(portletRequest);

		Assert.assertTrue(MultiSessionErrors.isEmpty(portletRequest));
	}

	@Test
	public void testClearPortletRequest() {
		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);
		String key = RandomTestUtil.randomString();

		SessionErrors.add(portletRequest, key);

		Assert.assertFalse(MultiSessionErrors.isEmpty(portletRequest));

		MultiSessionErrors.clear(portletRequest);

		Assert.assertTrue(MultiSessionErrors.isEmpty(portletRequest));
	}

	@Test
	public void testContainsOnHttpServletRequest() {
		String key = RandomTestUtil.randomString();

		SessionErrors.add(_mockHttpServletRequest, key);

		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);

		Assert.assertTrue(MultiSessionErrors.contains(portletRequest, key));
	}

	@Test
	public void testContainsOnPortletRequest() {
		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);
		String key = RandomTestUtil.randomString();

		SessionErrors.add(portletRequest, key);

		Assert.assertTrue(MultiSessionErrors.contains(portletRequest, key));
	}

	@Test
	public void testGetFoundHttpServletRequest() {
		String key = RandomTestUtil.randomString();

		SessionErrors.add(_mockHttpServletRequest, key);

		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);

		Assert.assertEquals(
			key, MultiSessionErrors.get(portletRequest, key));
	}

	@Test
	public void testGetFoundPortletRequest() {
		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);
		String key = RandomTestUtil.randomString();

		SessionErrors.add(portletRequest, key);

		Assert.assertEquals(
			key, MultiSessionErrors.get(portletRequest, key));
	}

	@Test
	public void testGetNotFound() {
		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);

		Assert.assertNull(MultiSessionErrors.get(portletRequest, RandomTestUtil.randomString()));
	}

	@Test
	public void testIsEmpty() {
		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);

		Assert.assertTrue(MultiSessionErrors.isEmpty(portletRequest));
	}

	@Test
	public void testIsEmptyFalseByHttpServletRequest() {
		SessionErrors.add(_mockHttpServletRequest, RandomTestUtil.randomString());

		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);

		Assert.assertFalse(MultiSessionErrors.isEmpty(portletRequest));
	}

	@Test
	public void testIsEmptyFalseByPortletRequest() {
		PortletRequest portletRequest = new MockLiferayPortletRequest(
			_mockHttpServletRequest);

		SessionErrors.add(portletRequest, RandomTestUtil.randomString());

		Assert.assertFalse(MultiSessionErrors.isEmpty(portletRequest));
	}

	private MockHttpServletRequest _mockHttpServletRequest =
		new MockHttpServletRequest() {
			{
				setSession(new MockHttpSession());
			}
		};


}