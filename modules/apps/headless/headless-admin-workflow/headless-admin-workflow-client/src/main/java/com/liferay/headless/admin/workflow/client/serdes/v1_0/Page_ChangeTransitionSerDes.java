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

import com.liferay.headless.admin.workflow.client.dto.v1_0.ChangeTransition;
import com.liferay.headless.admin.workflow.client.dto.v1_0.Page_ChangeTransition;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ChangeTransitionSerDes {

	public static Page_ChangeTransition toDTO(String json) {
		Page_ChangeTransitionJSONParser page_ChangeTransitionJSONParser =
			new Page_ChangeTransitionJSONParser();

		return page_ChangeTransitionJSONParser.parseToDTO(json);
	}

	public static Page_ChangeTransition[] toDTOs(String json) {
		Page_ChangeTransitionJSONParser page_ChangeTransitionJSONParser =
			new Page_ChangeTransitionJSONParser();

		return page_ChangeTransitionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_ChangeTransition page_ChangeTransition) {
		if (page_ChangeTransition == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ChangeTransition.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ChangeTransition.getItems().length; i++) {
				sb.append(
					ChangeTransitionSerDes.toJSON(
						page_ChangeTransition.getItems()[i]));

				if ((i + 1) < page_ChangeTransition.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ChangeTransition.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ChangeTransition.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ChangeTransition.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ChangeTransition.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ChangeTransition.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ChangeTransition.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ChangeTransition.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ChangeTransition.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ChangeTransitionJSONParser
		extends BaseJSONParser<Page_ChangeTransition> {

		protected Page_ChangeTransition createDTO() {
			return new Page_ChangeTransition();
		}

		protected Page_ChangeTransition[] createDTOArray(int size) {
			return new Page_ChangeTransition[size];
		}

		protected void setField(
			Page_ChangeTransition page_ChangeTransition,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ChangeTransition.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ChangeTransitionSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ChangeTransition[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ChangeTransition.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ChangeTransition.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ChangeTransition.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ChangeTransition.setTotalCount(
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