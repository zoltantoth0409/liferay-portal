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

import com.liferay.headless.admin.workflow.client.dto.v1_0.Page_WorkflowTask;
import com.liferay.headless.admin.workflow.client.dto.v1_0.WorkflowTask;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_WorkflowTaskSerDes {

	public static Page_WorkflowTask toDTO(String json) {
		Page_WorkflowTaskJSONParser page_WorkflowTaskJSONParser =
			new Page_WorkflowTaskJSONParser();

		return page_WorkflowTaskJSONParser.parseToDTO(json);
	}

	public static Page_WorkflowTask[] toDTOs(String json) {
		Page_WorkflowTaskJSONParser page_WorkflowTaskJSONParser =
			new Page_WorkflowTaskJSONParser();

		return page_WorkflowTaskJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_WorkflowTask page_WorkflowTask) {
		if (page_WorkflowTask == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_WorkflowTask.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_WorkflowTask.getItems().length; i++) {
				sb.append(
					WorkflowTaskSerDes.toJSON(page_WorkflowTask.getItems()[i]));

				if ((i + 1) < page_WorkflowTask.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_WorkflowTask.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTask.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_WorkflowTask.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTask.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_WorkflowTask.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTask.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_WorkflowTask.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WorkflowTask.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_WorkflowTaskJSONParser
		extends BaseJSONParser<Page_WorkflowTask> {

		protected Page_WorkflowTask createDTO() {
			return new Page_WorkflowTask();
		}

		protected Page_WorkflowTask[] createDTOArray(int size) {
			return new Page_WorkflowTask[size];
		}

		protected void setField(
			Page_WorkflowTask page_WorkflowTask, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTask.setItems(
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
					page_WorkflowTask.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTask.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTask.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_WorkflowTask.setTotalCount(
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