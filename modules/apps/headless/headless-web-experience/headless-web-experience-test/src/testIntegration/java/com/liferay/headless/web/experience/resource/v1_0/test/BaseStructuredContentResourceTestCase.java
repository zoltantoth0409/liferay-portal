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

import com.liferay.headless.web.experience.dto.v1_0.StructuredContent;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.pagination.Pagination;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSender;

import java.net.URL;

import javax.annotation.Generated;

import org.jboss.arquillian.test.api.ArquillianResource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseStructuredContentResourceTestCase {

	@BeforeClass
	public static void setUpClass() {
		RestAssured.defaultParser = Parser.JSON;
	}

	@Before
	public void setUp() throws Exception {
		_resourceURL = new URL(
			_url.toExternalForm() + "/o/headless-web-experience/v1.0");
	}

	@Test
	public void testDeleteStructuredContents() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetContentSpacesContentStructuresStructuredContentsPage()
		throws Exception {

			Assert.assertTrue(true);
	}

	@Test
	public void testGetContentSpacesStructuredContentsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetContentStructures() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetStructuredContents() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetStructuredContentsCategoriesPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPatchContentSpacesStructuredContents() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostContentSpacesStructuredContents() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostContentSpacesStructuredContentsBatchCreate()
		throws Exception {

			Assert.assertTrue(true);
	}

	@Test
	public void testPostStructuredContentsCategories() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostStructuredContentsCategoriesBatchCreate()
		throws Exception {

			Assert.assertTrue(true);
	}

	@Test
	public void testPutStructuredContents() throws Exception {
		Assert.assertTrue(true);
	}

	protected void invokeDeleteStructuredContents(Long structuredContentId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/structured-contents/{structured-content-id}");
	}

	protected void invokeGetContentSpacesContentStructuresStructuredContentsPage(
			Long contentSpaceId, Long contentStructureId, Filter filter,
			Pagination pagination, Sort[] sorts)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/content-structures/{content-structure-id}/structured-contents");
	}

	protected void invokeGetContentSpacesStructuredContentsPage(
			Long contentSpaceId, Filter filter, Pagination pagination,
			Sort[] sorts)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/structured-contents");
	}

	protected void invokeGetContentStructures(Long contentStructureId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/content-structures/{content-structure-id}");
	}

	protected void invokeGetStructuredContents(Long structuredContentId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/structured-contents/{structured-content-id}");
	}

	protected void invokeGetStructuredContentsCategoriesPage(
			Long structuredContentId, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/structured-contents/{structured-content-id}/categories");
	}

	protected void invokePatchContentSpacesStructuredContents(
			Long contentSpaceId, StructuredContent structuredContent)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/structured-contents");
	}

	protected void invokePostContentSpacesStructuredContents(
			Long contentSpaceId, StructuredContent structuredContent)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/structured-contents");
	}

	protected void invokePostContentSpacesStructuredContentsBatchCreate(
			Long contentSpaceId, StructuredContent structuredContent)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/content-spaces/{content-space-id}/structured-contents/batch-create");
	}

	protected void invokePostStructuredContentsCategories(
			Long structuredContentId, Long referenceId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/structured-contents/{structured-content-id}/categories");
	}

	protected void invokePostStructuredContentsCategoriesBatchCreate(
			Long structuredContentId, Long referenceId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/structured-contents/{structured-content-id}/categories/batch-create");
	}

	protected void invokePutStructuredContents(
			Long structuredContentId, StructuredContent structuredContent)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/structured-contents/{structured-content-id}");
	}

	private RequestSender _createRequestSender() {
		return RestAssured.given(
		).auth(
		).preemptive(
		).basic(
			"test@liferay.com", "test"
		).header(
			"Accept", "application/json"
		).header(
			"Content-Type", "application/json"
		).when();
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

	@ArquillianResource
	private URL _url;

}