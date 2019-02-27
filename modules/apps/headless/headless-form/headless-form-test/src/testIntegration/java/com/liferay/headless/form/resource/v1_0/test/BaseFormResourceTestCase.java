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

package com.liferay.headless.form.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.form.dto.v1_0.Form;
import com.liferay.headless.form.dto.v1_0.Options;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.net.URL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseFormResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		testGroup = GroupTestUtil.addGroup();

		_resourceURL = new URL("http://localhost:8080/o/headless-form/v1.0");
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testGetContentSpaceFormsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetForm() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetFormFetchLatestDraft() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostFormEvaluateContext() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostFormUploadFile() throws Exception {
		Assert.assertTrue(true);
	}

	protected void assertEquals(Form form1, Form form2) {
		Assert.assertTrue(
			form1 + " does not equal " + form2, equals(form1, form2));
	}

	protected void assertEquals(List<Form> forms1, List<Form> forms2) {
		Assert.assertEquals(forms1.size(), forms2.size());

		for (int i = 0; i < forms1.size(); i++) {
			Form form1 = forms1.get(i);
			Form form2 = forms2.get(i);

			assertEquals(form1, form2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<Form> forms1, List<Form> forms2) {

		Assert.assertEquals(forms1.size(), forms2.size());

		for (Form form1 : forms1) {
			boolean contains = false;

			for (Form form2 : forms2) {
				if (equals(form1, form2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(forms2 + " does not contain " + form1, contains);
		}
	}

	protected void assertResponseCode(
		int expectedResponseCode, Http.Response actualResponse) {

		Assert.assertEquals(
			expectedResponseCode, actualResponse.getResponseCode());
	}

	protected void assertValid(Page<Form> page) {
		boolean valid = false;

		Collection<Form> forms = page.getItems();

		int size = forms.size();

		if ((page.getItemsPerPage() > 0) && (page.getLastPageNumber() > 0) &&
			(page.getPageNumber() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected boolean equals(Form form1, Form form2) {
		if (form1 == form2) {
			return true;
		}

		return false;
	}

	protected Page<Form> invokeGetContentSpaceFormsPage(
			Long contentSpaceId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/content-spaces/{content-space-id}/form", contentSpaceId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<Form>>() {
			});
	}

	protected Http.Response invokeGetContentSpaceFormsPageResponse(
			Long contentSpaceId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/content-spaces/{content-space-id}/form", contentSpaceId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Form invokeGetForm(Long formId) throws Exception {
		Http.Options options = _createHttpOptions();

		options.setLocation(_resourceURL + _toPath("/forms/{form-id}", formId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Form.class);
	}

	protected Form invokeGetFormFetchLatestDraft(Long formId) throws Exception {
		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/forms/{form-id}/fetch-latest-draft", formId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Form.class);
	}

	protected Http.Response invokeGetFormFetchLatestDraftResponse(Long formId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/forms/{form-id}/fetch-latest-draft", formId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Http.Response invokeGetFormResponse(Long formId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(_resourceURL + _toPath("/forms/{form-id}", formId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Form invokePostFormEvaluateContext(Long formId, Form form)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(form),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath("/forms/{form-id}/evaluate-context", formId));

		options.setPost(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Form.class);
	}

	protected Http.Response invokePostFormEvaluateContextResponse(
			Long formId, Form form)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(form),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL +
				_toPath("/forms/{form-id}/evaluate-context", formId));

		options.setPost(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Form invokePostFormUploadFile(Long formId, Form form)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(form),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL + _toPath("/forms/{form-id}/upload-file", formId));

		options.setPost(true);

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Form.class);
	}

	protected Http.Response invokePostFormUploadFileResponse(
			Long formId, Form form)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setBody(
			_inputObjectMapper.writeValueAsString(form),
			ContentTypes.APPLICATION_JSON, StringPool.UTF8);

		options.setLocation(
			_resourceURL + _toPath("/forms/{form-id}/upload-file", formId));

		options.setPost(true);

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Form randomForm() {
		return new Form() {
			{
				contentSpace = RandomTestUtil.randomLong();
				dateCreated = RandomTestUtil.nextDate();
				dateModified = RandomTestUtil.nextDate();
				datePublished = RandomTestUtil.nextDate();
				defaultLanguage = RandomTestUtil.randomString();
				description = RandomTestUtil.randomString();
				id = RandomTestUtil.randomLong();
				name = RandomTestUtil.randomString();
				structureId = RandomTestUtil.randomLong();
			}
		};
	}

	protected Group testGroup;

	protected static class Page<T> {

		public Collection<T> getItems() {
			return new ArrayList<>(items);
		}

		public int getItemsPerPage() {
			return itemsPerPage;
		}

		public int getLastPageNumber() {
			return lastPageNumber;
		}

		public int getPageNumber() {
			return pageNumber;
		}

		public int getTotalCount() {
			return totalCount;
		}

		@JsonProperty
		protected Collection<T> items;

		@JsonProperty("pageSize")
		protected int itemsPerPage;

		@JsonProperty
		protected int lastPageNumber;

		@JsonProperty("page")
		protected int pageNumber;

		@JsonProperty
		protected int totalCount;

	}

	private Http.Options _createHttpOptions() {
		Http.Options options = new Http.Options();

		options.addHeader("Accept", "application/json");

		String userNameAndPassword = "test@liferay.com:test";

		String encodedUserNameAndPassword = Base64.encode(
			userNameAndPassword.getBytes());

		options.addHeader(
			"Authorization", "Basic " + encodedUserNameAndPassword);

		options.addHeader("Content-Type", "application/json");

		return options;
	}

	private String _toPath(String template, Object value) {
		return template.replaceFirst("\\{.*\\}", String.valueOf(value));
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
		}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

}