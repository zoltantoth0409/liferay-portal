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

package com.liferay.headless.form.client.serdes.v1_0;

import com.liferay.headless.form.client.dto.v1_0.Column;
import com.liferay.headless.form.client.dto.v1_0.Page_Column;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ColumnSerDes {

	public static Page_Column toDTO(String json) {
		Page_ColumnJSONParser page_ColumnJSONParser =
			new Page_ColumnJSONParser();

		return page_ColumnJSONParser.parseToDTO(json);
	}

	public static Page_Column[] toDTOs(String json) {
		Page_ColumnJSONParser page_ColumnJSONParser =
			new Page_ColumnJSONParser();

		return page_ColumnJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Column page_Column) {
		if (page_Column == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Column.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Column.getItems().length; i++) {
				sb.append(ColumnSerDes.toJSON(page_Column.getItems()[i]));

				if ((i + 1) < page_Column.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Column.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Column.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Column.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Column.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Column.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Column.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Column.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Column.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ColumnJSONParser
		extends BaseJSONParser<Page_Column> {

		protected Page_Column createDTO() {
			return new Page_Column();
		}

		protected Page_Column[] createDTOArray(int size) {
			return new Page_Column[size];
		}

		protected void setField(
			Page_Column page_Column, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Column.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ColumnSerDes.toDTO((String)object)
						).toArray(
							size -> new Column[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Column.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Column.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Column.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Column.setTotalCount(
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