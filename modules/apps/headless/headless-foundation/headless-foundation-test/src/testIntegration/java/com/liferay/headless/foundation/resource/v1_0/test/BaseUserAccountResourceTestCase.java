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

package com.liferay.headless.foundation.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.foundation.dto.v1_0.UserAccount;
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
public abstract class BaseUserAccountResourceTestCase {

	@BeforeClass
	public static void setUpClass() {
		RestAssured.defaultParser = Parser.JSON;
	}

	@Before
	public void setUp() throws Exception {
		_resourceURL = new URL(
			_url.toExternalForm() + "/o/headless-foundation/v1.0");
	}

	@Test
	public void testDeleteUserAccounts() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetMyUserAccounts() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetMyUserAccountsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetOrganizationsUserAccountsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetUserAccounts() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetUserAccountsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetWebSitesUserAccountsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostUserAccounts() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostUserAccountsBatchCreate() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPutUserAccounts() throws Exception {
		Assert.assertTrue(true);
	}

	protected void invokeDeleteUserAccounts(Long userAccountId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/user-accounts/{user-account-id}");
	}

	protected void invokeGetMyUserAccounts(Long myUserAccountId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/my-user-accounts/{my-user-account-id}");
	}

	protected void invokeGetMyUserAccountsPage(Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/my-user-accounts");
	}

	protected void invokeGetOrganizationsUserAccountsPage(
			Long organizationId, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/organizations/{organization-id}/user-accounts");
	}

	protected void invokeGetUserAccounts(Long userAccountId) throws Exception {
		RequestSender requestSender = _createRequestSender();

			requestSender.post("/user-accounts/{user-account-id}");
	}

	protected void invokeGetUserAccountsPage(
			String fullnamequery, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/user-accounts");
	}

	protected void invokeGetWebSitesUserAccountsPage(
			Long webSiteId, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/web-sites/{web-site-id}/user-accounts");
	}

	protected void invokePostUserAccounts(UserAccount userAccount)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/user-accounts");
	}

	protected void invokePostUserAccountsBatchCreate(UserAccount userAccount)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/user-accounts/batch-create");
	}

	protected void invokePutUserAccounts(
			Long userAccountId, UserAccount userAccount)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/user-accounts/{user-account-id}");
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