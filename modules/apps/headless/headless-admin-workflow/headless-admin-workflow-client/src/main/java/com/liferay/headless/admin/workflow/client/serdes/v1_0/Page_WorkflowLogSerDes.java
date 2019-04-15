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

import com.liferay.headless.admin.workflow.client.dto.v1_0.Page_WorkflowLog;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowLog;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_WorkflowLogSerDes {

	public static Page_WorkflowLog toDTO(String json) {
		Page_WorkflowLogJSONParser page_WorkflowLogJSONParser =
			new Page_WorkflowLogJSONParser();

		return page_WorkflowLogJSONParser.parseToDTO(json);
	}

	public static Page_WorkflowLog[] toDTOs(String json) {
		Page_WorkflowLogJSONParser page_WorkflowLogJSONParser =
			new Page_WorkflowLogJSONParser();

		return page_WorkflowLogJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_WorkflowLog page_WorkflowLog) {
		if (page_WorkflowLog == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_WorkflowLog.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_WorkflowLog.getItems().length; i++) {
				sb.append(
					WorkflowLogSerDes.toJSON(page_WorkflowLog.getItems()[i]));

				if ((i + 1) < page_WorkflowLog.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_WorkflowLog.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowLog.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_WorkflowLog.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowLog.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_WorkflowLog.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowLog.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_WorkflowLog.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowLog.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_WorkflowLogJSONParser
		extends BaseJSONParser<Page_WorkflowLog> {

		protected Page_WorkflowLog createDTO() {
			return new Page_WorkflowLog();
		}

		protected Page_WorkflowLog[] createDTOArray(int size) {
			return new Page_WorkflowLog[size];
		}

		protected void setField(
			Page_WorkflowLog page_WorkflowLog, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowLog.setItems(
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
					page_WorkflowLog.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowLog.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowLog.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowLog.setTotalCount(
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