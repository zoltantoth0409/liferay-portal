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

import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTaskAssignToMe;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTaskAssignToMe_Page;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class WorkflowTaskAssignToMe_PageSerDes {

	public static WorkflowTaskAssignToMe_Page toDTO(String json) {
		WorkflowTaskAssignToMe_PageJSONParser
			workflowTaskAssignToMe_PageJSONParser =
				new WorkflowTaskAssignToMe_PageJSONParser();

		return workflowTaskAssignToMe_PageJSONParser.parseToDTO(json);
	}

	public static WorkflowTaskAssignToMe_Page[] toDTOs(String json) {
		WorkflowTaskAssignToMe_PageJSONParser
			workflowTaskAssignToMe_PageJSONParser =
				new WorkflowTaskAssignToMe_PageJSONParser();

		return workflowTaskAssignToMe_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		WorkflowTaskAssignToMe_Page workflowTaskAssignToMe_Page) {

		if (workflowTaskAssignToMe_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (workflowTaskAssignToMe_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < workflowTaskAssignToMe_Page.getItems().length;
				 i++) {

				sb.append(
					WorkflowTaskAssignToMeSerDes.toJSON(
						workflowTaskAssignToMe_Page.getItems()[i]));

				if ((i + 1) < workflowTaskAssignToMe_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (workflowTaskAssignToMe_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToMe_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (workflowTaskAssignToMe_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToMe_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (workflowTaskAssignToMe_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToMe_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (workflowTaskAssignToMe_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(workflowTaskAssignToMe_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class WorkflowTaskAssignToMe_PageJSONParser
		extends BaseJSONParser<WorkflowTaskAssignToMe_Page> {

		protected WorkflowTaskAssignToMe_Page createDTO() {
			return new WorkflowTaskAssignToMe_Page();
		}

		protected WorkflowTaskAssignToMe_Page[] createDTOArray(int size) {
			return new WorkflowTaskAssignToMe_Page[size];
		}

		protected void setField(
			WorkflowTaskAssignToMe_Page workflowTaskAssignToMe_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToMe_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> WorkflowTaskAssignToMeSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new WorkflowTaskAssignToMe[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToMe_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToMe_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToMe_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					workflowTaskAssignToMe_Page.setTotalCount(
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