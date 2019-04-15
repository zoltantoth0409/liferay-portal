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

import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowLog;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowLog_Page;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class WorkflowLog_PageSerDes {

	public static WorkflowLog_Page toDTO(String json) {
		WorkflowLog_PageJSONParser workflowLog_PageJSONParser =
			new WorkflowLog_PageJSONParser();

		return workflowLog_PageJSONParser.parseToDTO(json);
	}

	public static WorkflowLog_Page[] toDTOs(String json) {
		WorkflowLog_PageJSONParser workflowLog_PageJSONParser =
			new WorkflowLog_PageJSONParser();

		return workflowLog_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(WorkflowLog_Page workflowLog_Page) {
		if (workflowLog_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (workflowLog_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < workflowLog_Page.getItems().length; i++) {
				sb.append(
					WorkflowLogSerDes.toJSON(workflowLog_Page.getItems()[i]));

				if ((i + 1) < workflowLog_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (workflowLog_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowLog_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (workflowLog_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowLog_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (workflowLog_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowLog_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (workflowLog_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowLog_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class WorkflowLog_PageJSONParser
		extends BaseJSONParser<WorkflowLog_Page> {

		protected WorkflowLog_Page createDTO() {
			return new WorkflowLog_Page();
		}

		protected WorkflowLog_Page[] createDTOArray(int size) {
			return new WorkflowLog_Page[size];
		}

		protected void setField(
			WorkflowLog_Page workflowLog_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					workflowLog_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> WorkflowLogSerDes.toDTO((String)object)
						).toArray(
							size -> new WorkflowLog[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					workflowLog_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					workflowLog_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					workflowLog_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					workflowLog_Page.setTotalCount(
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