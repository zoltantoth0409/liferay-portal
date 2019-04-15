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

package com.liferay.headless.admin.workflow.client.serdes.v1_0;

import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTask;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTask_Page;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class WorkflowTask_PageSerDes {

	public static WorkflowTask_Page toDTO(String json) {
		WorkflowTask_PageJSONParser workflowTask_PageJSONParser =
			new WorkflowTask_PageJSONParser();

		return workflowTask_PageJSONParser.parseToDTO(json);
	}

	public static WorkflowTask_Page[] toDTOs(String json) {
		WorkflowTask_PageJSONParser workflowTask_PageJSONParser =
			new WorkflowTask_PageJSONParser();

		return workflowTask_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(WorkflowTask_Page workflowTask_Page) {
		if (workflowTask_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (workflowTask_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < workflowTask_Page.getItems().length; i++) {
				sb.append(
					WorkflowTaskSerDes.toJSON(workflowTask_Page.getItems()[i]));

				if ((i + 1) < workflowTask_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (workflowTask_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTask_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (workflowTask_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTask_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (workflowTask_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTask_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (workflowTask_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTask_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class WorkflowTask_PageJSONParser
		extends BaseJSONParser<WorkflowTask_Page> {

		protected WorkflowTask_Page createDTO() {
			return new WorkflowTask_Page();
		}

		protected WorkflowTask_Page[] createDTOArray(int size) {
			return new WorkflowTask_Page[size];
		}

		protected void setField(
			WorkflowTask_Page workflowTask_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					workflowTask_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> WorkflowTaskSerDes.toDTO((String)object)
						).toArray(
							size -> new WorkflowTask[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					workflowTask_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					workflowTask_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					workflowTask_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					workflowTask_Page.setTotalCount(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}