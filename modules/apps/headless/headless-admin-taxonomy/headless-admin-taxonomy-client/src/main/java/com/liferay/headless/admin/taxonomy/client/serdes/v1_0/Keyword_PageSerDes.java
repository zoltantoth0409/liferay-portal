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
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Keyword_Page;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Keyword_PageSerDes {

	public static Keyword_Page toDTO(String json) {
		Keyword_PageJSONParser keyword_PageJSONParser =
			new Keyword_PageJSONParser();

		return keyword_PageJSONParser.parseToDTO(json);
	}

	public static Keyword_Page[] toDTOs(String json) {
		Keyword_PageJSONParser keyword_PageJSONParser =
			new Keyword_PageJSONParser();

		return keyword_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Keyword_Page keyword_Page) {
		if (keyword_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (keyword_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < keyword_Page.getItems().length; i++) {
				sb.append(KeywordSerDes.toJSON(keyword_Page.getItems()[i]));

				if ((i + 1) < keyword_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (keyword_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(keyword_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (keyword_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(keyword_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (keyword_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(keyword_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (keyword_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(keyword_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Keyword_PageJSONParser
		extends BaseJSONParser<Keyword_Page> {

		protected Keyword_Page createDTO() {
			return new Keyword_Page();
		}

		protected Keyword_Page[] createDTOArray(int size) {
			return new Keyword_Page[size];
		}

		protected void setField(
			Keyword_Page keyword_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					keyword_Page.setItems(
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
					keyword_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					keyword_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					keyword_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					keyword_Page.setTotalCount(
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