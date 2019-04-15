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

import com.liferay.headless.admin.workflow.client.dto.v1_0.Page_WorkflowTaskAssignToMe;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTaskAssignToMe;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_WorkflowTaskAssignToMeSerDes {

	public static Page_WorkflowTaskAssignToMe toDTO(String json) {
		Page_WorkflowTaskAssignToMeJSONParser
			page_WorkflowTaskAssignToMeJSONParser =
				new Page_WorkflowTaskAssignToMeJSONParser();

		return page_WorkflowTaskAssignToMeJSONParser.parseToDTO(json);
	}

	public static Page_WorkflowTaskAssignToMe[] toDTOs(String json) {
		Page_WorkflowTaskAssignToMeJSONParser
			page_WorkflowTaskAssignToMeJSONParser =
				new Page_WorkflowTaskAssignToMeJSONParser();

		return page_WorkflowTaskAssignToMeJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_WorkflowTaskAssignToMe page_WorkflowTaskAssignToMe) {

		if (page_WorkflowTaskAssignToMe == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_WorkflowTaskAssignToMe.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_WorkflowTaskAssignToMe.getItems().length;
				 i++) {

				sb.append(
					WorkflowTaskAssignToMeSerDes.toJSON(
						page_WorkflowTaskAssignToMe.getItems()[i]));

				if ((i + 1) < page_WorkflowTaskAssignToMe.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_WorkflowTaskAssignToMe.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToMe.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_WorkflowTaskAssignToMe.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToMe.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_WorkflowTaskAssignToMe.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToMe.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_WorkflowTaskAssignToMe.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTaskAssignToMe.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_WorkflowTaskAssignToMeJSONParser
		extends BaseJSONParser<Page_WorkflowTaskAssignToMe> {

		protected Page_WorkflowTaskAssignToMe createDTO() {
			return new Page_WorkflowTaskAssignToMe();
		}

		protected Page_WorkflowTaskAssignToMe[] createDTOArray(int size) {
			return new Page_WorkflowTaskAssignToMe[size];
		}

		protected void setField(
			Page_WorkflowTaskAssignToMe page_WorkflowTaskAssignToMe,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToMe.setItems(
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
					page_WorkflowTaskAssignToMe.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToMe.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToMe.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTaskAssignToMe.setTotalCount(
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