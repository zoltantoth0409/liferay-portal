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

package com.liferay.headless.workflow.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.workflow.dto.v1_0.WorkflowLog;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.Base64;
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
public abstract class BaseWorkflowLogResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@Before
	public void setUp() throws Exception {
		testGroup = GroupTestUtil.addGroup();

		_resourceURL = new URL(
			"http://localhost:8080/o/headless-workflow/v1.0");
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testGetWorkflowLog() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetWorkflowTaskWorkflowLogsPage() throws Exception {
		Assert.assertTrue(true);
	}

	protected void assertEquals(
		List<WorkflowLog> workflowLogs1, List<WorkflowLog> workflowLogs2) {

		Assert.assertEquals(workflowLogs1.size(), workflowLogs2.size());

		for (int i = 0; i < workflowLogs1.size(); i++) {
			WorkflowLog workflowLog1 = workflowLogs1.get(i);
			WorkflowLog workflowLog2 = workflowLogs2.get(i);

			assertEquals(workflowLog1, workflowLog2);
		}
	}

	protected void assertEquals(
		WorkflowLog workflowLog1, WorkflowLog workflowLog2) {

		Assert.assertTrue(
			workflowLog1 + " does not equal " + workflowLog2,
			equals(workflowLog1, workflowLog2));
	}

	protected void assertEqualsIgnoringOrder(
		List<WorkflowLog> workflowLogs1, List<WorkflowLog> workflowLogs2) {

		Assert.assertEquals(workflowLogs1.size(), workflowLogs2.size());

		for (WorkflowLog workflowLog1 : workflowLogs1) {
			boolean contains = false;

			for (WorkflowLog workflowLog2 : workflowLogs2) {
				if (equals(workflowLog1, workflowLog2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				workflowLogs2 + " does not contain " + workflowLog1, contains);
		}
	}

	protected void assertResponseCode(
		int expectedResponseCode, Http.Response actualResponse) {

		Assert.assertEquals(
			expectedResponseCode, actualResponse.getResponseCode());
	}

	protected void assertValid(Page<WorkflowLog> page) {
		boolean valid = false;

		Collection<WorkflowLog> workflowLogs = page.getItems();

		int size = workflowLogs.size();

		if ((page.getItemsPerPage() > 0) && (page.getLastPageNumber() > 0) &&
			(page.getPageNumber() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected boolean equals(
		WorkflowLog workflowLog1, WorkflowLog workflowLog2) {

		if (workflowLog1 == workflowLog2) {
			return true;
		}

		return false;
	}

	protected WorkflowLog invokeGetWorkflowLog(Long workflowLogId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/workflow-logs/{workflow-log-id}", workflowLogId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options), WorkflowLog.class);
	}

	protected Http.Response invokeGetWorkflowLogResponse(Long workflowLogId)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath("/workflow-logs/{workflow-log-id}", workflowLogId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected Page<WorkflowLog> invokeGetWorkflowTaskWorkflowLogsPage(
			Long workflowTaskId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/workflow-logs",
					workflowTaskId));

		return _outputObjectMapper.readValue(
			HttpUtil.URLtoString(options),
			new TypeReference<Page<WorkflowLog>>() {
			});
	}

	protected Http.Response invokeGetWorkflowTaskWorkflowLogsPageResponse(
			Long workflowTaskId, Pagination pagination)
		throws Exception {

		Http.Options options = _createHttpOptions();

		options.setLocation(
			_resourceURL +
				_toPath(
					"/workflow-tasks/{workflow-task-id}/workflow-logs",
					workflowTaskId));

		HttpUtil.URLtoString(options);

		return options.getResponse();
	}

	protected WorkflowLog randomWorkflowLog() {
		return new WorkflowLog() {
			{
				auditPerson = RandomTestUtil.randomString();
				commentLog = RandomTestUtil.randomString();
				dateCreated = RandomTestUtil.nextDate();
				id = RandomTestUtil.randomLong();
				person = RandomTestUtil.randomString();
				previousPerson = RandomTestUtil.randomString();
				previousState = RandomTestUtil.randomString();
				state = RandomTestUtil.randomString();
				taskId = RandomTestUtil.randomLong();
				type = RandomTestUtil.randomString();
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