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

package com.liferay.headless.web.experience.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.web.experience.dto.v1_0.Options;
import com.liferay.headless.web.experience.dto.v1_0.StructuredContentImage;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;

import java.net.URL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseStructuredContentImageResourceTestCase {

	@Before
	public void setUp() throws Exception {
		testGroup = GroupTestUtil.addGroup();

		_resourceURL = new URL(
			"http://localhost:8080/o/headless-web-experience/v1.0");
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testDeleteStructuredContentContentDocument() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetStructuredContentContentDocument() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetStructuredContentStructuredContentImagesPage()
		throws Exception {

		Assert.assertTrue(true);
	}

	protected void assertEquals(
		List<StructuredContentImage> structuredContentImages1,
		List<StructuredContentImage> structuredContentImages2) {

		Assert.assertEquals(
			structuredContentImages1.size(), structuredContentImages2.size());

		for (int i = 0; i < structuredContentImages1.size(); i++) {
			StructuredContentImage structuredContentImage1 =
				structuredContentImages1.get(i);
			StructuredContentImage structuredContentImage2 =
				structuredContentImages2.get(i);

			assertEquals(structuredContentImage1, structuredContentImage2);
		}
	}

	protected void assertEquals(
		StructuredContentImage structuredContentImage1,
		StructuredContentImage structuredContentImage2) {

		Assert.assertTrue(
			structuredContentImage1 + " does not equal " +
				structuredContentImage2,
			equals(structuredContentImage1, structuredContentImage2));
	}

	protected void assertEqualsIgnoringOrder(
		List<StructuredContentImage> structuredContentImages1,
		List<StructuredContentImage> structuredContentImages2) {

		Assert.assertEquals(
			structuredContentImages1.size(), structuredContentImages2.size());

		for (StructuredContentImage structuredContentImage1 :
				structuredContentImages1) {

			boolean contains = false;

			for (StructuredContentImage structuredContentImage2 :
					structuredContentImages2) {

				if (equals(structuredContentImage1, structuredContentImage2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				structuredContentImages2 + " does not contain " +
					structuredContentImage1,
				contains);
		}
	}

	protected void assertResponseCode(
		int expectedResponseCode, Http.Response actualResponse) {

		Assert.assertEquals(
			expectedResponseCode, actualResponse.getResponseCode());
	}

	protected boolean equals(
		StructuredContentImage structuredContentImage1,
		StructuredContentImage structuredContentImage2) {

		if (structuredContentImage1 == structuredContentImage2) {
			return true;
		}

		return false;
	}

	protected boolean invokeDeleteStructuredContentContentDocument(
			Long structuredContentId, Long contentDocumentId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setDelete(true);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/structured-contents/{structured-content-id}/structured-content-images/{content-document-id}",
					structuredContentId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), Boolean.class);
	}

	protected Http.Response
			invokeDeleteStructuredContentContentDocumentResponse(
				Long structuredContentId, Long contentDocumentId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setDelete(true);

		options.setLocation(
			_resourceURL +
				_toPath(
					"/structured-contents/{structured-content-id}/structured-content-images/{content-document-id}",
					structuredContentId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected StructuredContentImage invokeGetStructuredContentContentDocument(
			Long structuredContentId, Long contentDocumentId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/structured-contents/{structured-content-id}/structured-content-images/{content-document-id}",
					structuredContentId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), StructuredContentImage.class);
	}

	protected Http.Response invokeGetStructuredContentContentDocumentResponse(
			Long structuredContentId, Long contentDocumentId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/structured-contents/{structured-content-id}/structured-content-images/{content-document-id}",
					structuredContentId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Page<StructuredContentImage>
			invokeGetStructuredContentStructuredContentImagesPage(
				Long structuredContentId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/structured-contents/{structured-content-id}/structured-content-images",
					structuredContentId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<StructuredContentImage>>() {
			});
	}

	protected Http.Response
			invokeGetStructuredContentStructuredContentImagesPageResponse(
				Long structuredContentId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/structured-contents/{structured-content-id}/structured-content-images",
					structuredContentId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected StructuredContentImage randomStructuredContentImage() {
		return new StructuredContentImage() {
			{
				contentUrl = RandomTestUtil.randomString();
				dateCreated = RandomTestUtil.nextDate();
				dateModified = RandomTestUtil.nextDate();
				encodingFormat = RandomTestUtil.randomString();
				fileExtension = RandomTestUtil.randomString();
				id = RandomTestUtil.randomLong();
				title = RandomTestUtil.randomString();
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