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

import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTaskAssignToUser;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTaskAssignToUser_Page;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class WorkflowTaskAssignToUser_PageSerDes {

	public static WorkflowTaskAssignToUser_Page toDTO(String json) {
		WorkflowTaskAssignToUser_PageJSONParser
			workflowTaskAssignToUser_PageJSONParser =
				new WorkflowTaskAssignToUser_PageJSONParser();

		return workflowTaskAssignToUser_PageJSONParser.parseToDTO(json);
	}

	public static WorkflowTaskAssignToUser_Page[] toDTOs(String json) {
		WorkflowTaskAssignToUser_PageJSONParser
			workflowTaskAssignToUser_PageJSONParser =
				new WorkflowTaskAssignToUser_PageJSONParser();

		return workflowTaskAssignToUser_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		WorkflowTaskAssignToUser_Page workflowTaskAssignToUser_Page) {

		if (workflowTaskAssignToUser_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (workflowTaskAssignToUser_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < workflowTaskAssignToUser_Page.getItems().length;
				 i++) {

				sb.append(
					WorkflowTaskAssignToUserSerDes.toJSON(
						workflowTaskAssignToUser_Page.getItems()[i]));

				if ((i + 1) < workflowTaskAssignToUser_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (workflowTaskAssignToUser_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToUser_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (workflowTaskAssignToUser_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToUser_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (workflowTaskAssignToUser_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToUser_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (workflowTaskAssignToUser_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToUser_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class WorkflowTaskAssignToUser_PageJSONParser
		extends BaseJSONParser<WorkflowTaskAssignToUser_Page> {

		protected WorkflowTaskAssignToUser_Page createDTO() {
			return new WorkflowTaskAssignToUser_Page();
		}

		protected WorkflowTaskAssignToUser_Page[] createDTOArray(int size) {
			return new WorkflowTaskAssignToUser_Page[size];
		}

		protected void setField(
			WorkflowTaskAssignToUser_Page workflowTaskAssignToUser_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToUser_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> WorkflowTaskAssignToUserSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new WorkflowTaskAssignToUser[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToUser_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToUser_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToUser_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToUser_Page.setTotalCount(
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