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

package com.liferay.portal.vulcan.internal.context.provider.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.CompanyTestUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.UserTestUtil;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.cxf.interceptor.InterceptorChain;
import org.apache.cxf.jaxrs.ext.ContextProvider;
import org.apache.cxf.message.Attachment;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.Destination;

import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.mock.web.MockHttpServletRequest;

/**
 * @author Cristina González
 */
@RunWith(Arquillian.class)
public class CompanyContextProviderTest {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Test
	public void testCreateContextWithCustomCompany() throws Exception {
		Company actualCompany = CompanyTestUtil.addCompany();

		try {
			User user = UserTestUtil.addCompanyAdminUser(actualCompany);

			Group group = GroupTestUtil.addGroup(
				actualCompany.getCompanyId(), user.getUserId(), 0L);

			CompanyMockHttpServletRequest companyMockHttpServletRequest =
				new CompanyMockHttpServletRequest(actualCompany, group);

			Company finalCompany = _companyContextProvider.createContext(
				_createMessage(companyMockHttpServletRequest));

			Assert.assertEquals(actualCompany, finalCompany);
		}
		finally {
			CompanyLocalServiceUtil.deleteCompany(actualCompany.getCompanyId());
		}
	}

	private Message _createMessage(HttpServletRequest httpServletRequest) {
		return new Message() {

			@Override
			public void clear() {
			}

			@Override
			public boolean containsKey(Object key) {
				return false;
			}

			@Override
			public boolean containsValue(Object value) {
				return false;
			}

			@Override
			public Set<Entry<String, Object>> entrySet() {
				return null;
			}

			@Override
			public <T> T get(Class<T> clazz) {
				return null;
			}

			@Override
			public Object get(Object key) {
				return null;
			}

			@Override
			public Collection<Attachment> getAttachments() {
				return null;
			}

			@Override
			public <T> T getContent(Class<T> clazz) {
				return null;
			}

			@Override
			public Set<Class<?>> getContentFormats() {
				return null;
			}

			@Override
			public Object getContextualProperty(String contextProperty) {
				if (Objects.equals(contextProperty, "HTTP.REQUEST")) {
					return httpServletRequest;
				}

				return null;
			}

			@Override
			public Set<String> getContextualPropertyKeys() {
				return null;
			}

			@Override
			public Destination getDestination() {
				return null;
			}

			@Override
			public Exchange getExchange() {
				return null;
			}

			@Override
			public String getId() {
				return null;
			}

			@Override
			public InterceptorChain getInterceptorChain() {
				return null;
			}

			@Override
			public boolean isEmpty() {
				return false;
			}

			@Override
			public Set<String> keySet() {
				return null;
			}

			@Override
			public <T> void put(Class<T> clazz, T t) {
			}

			@Override
			public Object put(String key, Object value) {
				return null;
			}

			@Override
			public void putAll(Map<? extends String, ?> map) {
			}

			@Override
			public <T> T remove(Class<T> clazz) {
				return null;
			}

			@Override
			public Object remove(Object key) {
				return null;
			}

			@Override
			public <T> void removeContent(Class<T> clazz) {
			}

			@Override
			public void resetContextCache() {
			}

			@Override
			public void setAttachments(Collection<Attachment> collection) {
			}

			@Override
			public <T> void setContent(Class<T> clazz, Object object) {
			}

			@Override
			public void setExchange(Exchange exchange) {
			}

			@Override
			public void setId(String id) {
			}

			@Override
			public void setInterceptorChain(InterceptorChain interceptorChain) {
			}

			@Override
			public int size() {
				return 0;
			}

			@Override
			public Collection<Object> values() {
				return null;
			}

		};
	}

	@Inject(
		filter = "component.name=com.liferay.portal.vulcan.internal.context.provider.CompanyContextProvider"
	)
	private ContextProvider<Company> _companyContextProvider;

	private class CompanyMockHttpServletRequest extends MockHttpServletRequest {

		public CompanyMockHttpServletRequest(Company company, Group group)
			throws PortalException {

			addHeader("Host", company.getVirtualHostname());

			setRemoteHost(company.getPortalURL(group.getGroupId()));
		}

	}

}