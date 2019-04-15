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

package com.liferay.headless.admin.taxonomy.client.serdes.v1_0;

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Keyword;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Page_Keyword;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_KeywordSerDes {

	public static Page_Keyword toDTO(String json) {
		Page_KeywordJSONParser page_KeywordJSONParser =
			new Page_KeywordJSONParser();

		return page_KeywordJSONParser.parseToDTO(json);
	}

	public static Page_Keyword[] toDTOs(String json) {
		Page_KeywordJSONParser page_KeywordJSONParser =
			new Page_KeywordJSONParser();

		return page_KeywordJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Keyword page_Keyword) {
		if (page_Keyword == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Keyword.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Keyword.getItems().length; i++) {
				sb.append(KeywordSerDes.toJSON(page_Keyword.getItems()[i]));

				if ((i + 1) < page_Keyword.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Keyword.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Keyword.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Keyword.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Keyword.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Keyword.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Keyword.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Keyword.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Keyword.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_KeywordJSONParser
		extends BaseJSONParser<Page_Keyword> {

		protected Page_Keyword createDTO() {
			return new Page_Keyword();
		}

		protected Page_Keyword[] createDTOArray(int size) {
			return new Page_Keyword[size];
		}

		protected void setField(
			Page_Keyword page_Keyword, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Keyword.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> KeywordSerDes.toDTO((String)object)
						).toArray(
							size -> new Keyword[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Keyword.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Keyword.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Keyword.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Keyword.setTotalCount(
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