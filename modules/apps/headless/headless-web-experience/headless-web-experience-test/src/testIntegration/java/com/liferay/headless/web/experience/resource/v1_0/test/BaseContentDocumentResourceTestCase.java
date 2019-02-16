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
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.web.experience.dto.v1_0.ContentDocument;
import com.liferay.headless.web.experience.internal.dto.v1_0.ContentDocumentImpl;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URL;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseContentDocumentResourceTestCase {

	@BeforeClass
	public static void setUpClass() {
		RestAssured.defaultParser = Parser.JSON;
	}

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
	public void testDeleteContentDocument() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetContentDocument() throws Exception {
		Assert.assertTrue(true);
	}

	protected Response invokeDeleteContentDocument(Long contentDocumentId)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).delete(
				_resourceURL + "/content-documents/{content-document-id}",
				contentDocumentId
			);
	}

	protected Response invokeGetContentDocument(Long contentDocumentId)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).get(
				_resourceURL + "/content-documents/{content-document-id}",
				contentDocumentId
			);
	}

	protected ContentDocument randomContentDocument() {
		ContentDocument contentDocument = new ContentDocumentImpl();

contentDocument.setContentUrl(RandomTestUtil.randomString());
contentDocument.setDateCreated(RandomTestUtil.nextDate());
contentDocument.setDateModified(RandomTestUtil.nextDate());
contentDocument.setEncodingFormat(RandomTestUtil.randomString());
contentDocument.setFileExtension(RandomTestUtil.randomString());
contentDocument.setId(RandomTestUtil.randomLong());
contentDocument.setTitle(RandomTestUtil.randomString());
		return contentDocument;
	}

	protected Group testGroup;

	private RequestSpecification _createRequestSpecification() {
		return RestAssured.given(
		).auth(
		).preemptive(
		).basic(
			"test@liferay.com", "test"
		).header(
			"Accept", "application/json"
		).header(
			"Content-Type", "application/json"
		);
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

}