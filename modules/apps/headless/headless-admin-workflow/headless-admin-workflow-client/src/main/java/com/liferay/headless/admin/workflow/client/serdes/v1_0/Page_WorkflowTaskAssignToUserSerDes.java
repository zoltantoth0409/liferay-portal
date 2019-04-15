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

import com.liferay.headless.admin.workflow.client.dto.v1_0.Page_WorkflowTaskAssignToUser;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTaskAssignToUser;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_WorkflowTaskAssignToUserSerDes {

	public static Page_WorkflowTaskAssignToUser toDTO(String json) {
		Page_WorkflowTaskAssignToUserJSONParser
			page_WorkflowTaskAssignToUserJSONParser =
				new Page_WorkflowTaskAssignToUserJSONParser();

		return page_WorkflowTaskAssignToUserJSONParser.parseToDTO(json);
	}

	public static Page_WorkflowTaskAssignToUser[] toDTOs(String json) {
		Page_WorkflowTaskAssignToUserJSONParser
			page_WorkflowTaskAssignToUserJSONParser =
				new Page_WorkflowTaskAssignToUserJSONParser();

		return page_WorkflowTaskAssignToUserJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_WorkflowTaskAssignToUser page_WorkflowTaskAssignToUser) {

		if (page_WorkflowTaskAssignToUser == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_WorkflowTaskAssignToUser.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_WorkflowTaskAssignToUser.getItems().length;
				 i++) {

				sb.append(
					WorkflowTaskAssignToUserSerDes.toJSON(
						page_WorkflowTaskAssignToUser.getItems()[i]));

				if ((i + 1) < page_WorkflowTaskAssignToUser.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_WorkflowTaskAssignToUser.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToUser.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_WorkflowTaskAssignToUser.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToUser.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_WorkflowTaskAssignToUser.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToUser.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_WorkflowTaskAssignToUser.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToUser.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_WorkflowTaskAssignToUserJSONParser
		extends BaseJSONParser<Page_WorkflowTaskAssignToUser> {

		protected Page_WorkflowTaskAssignToUser createDTO() {
			return new Page_WorkflowTaskAssignToUser();
		}

		protected Page_WorkflowTaskAssignToUser[] createDTOArray(int size) {
			return new Page_WorkflowTaskAssignToUser[size];
		}

		protected void setField(
			Page_WorkflowTaskAssignToUser page_WorkflowTaskAssignToUser,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToUser.setItems(
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
					page_WorkflowTaskAssignToUser.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToUser.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToUser.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToUser.setTotalCount(
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