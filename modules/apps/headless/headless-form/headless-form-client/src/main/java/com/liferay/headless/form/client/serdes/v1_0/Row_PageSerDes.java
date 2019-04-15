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

import com.liferay.headless.form.client.dto.v1_0.Row;
import com.liferay.headless.form.client.dto.v1_0.Row_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Row_PageSerDes {

	public static Row_Page toDTO(String json) {
		Row_PageJSONParser row_PageJSONParser = new Row_PageJSONParser();

		return row_PageJSONParser.parseToDTO(json);
	}

	public static Row_Page[] toDTOs(String json) {
		Row_PageJSONParser row_PageJSONParser = new Row_PageJSONParser();

		return row_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Row_Page row_Page) {
		if (row_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (row_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < row_Page.getItems().length; i++) {
				sb.append(RowSerDes.toJSON(row_Page.getItems()[i]));

				if ((i + 1) < row_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (row_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(row_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (row_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(row_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (row_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(row_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (row_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(row_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Row_PageJSONParser extends BaseJSONParser<Row_Page> {

		protected Row_Page createDTO() {
			return new Row_Page();
		}

		protected Row_Page[] createDTOArray(int size) {
			return new Row_Page[size];
		}

		protected void setField(
			Row_Page row_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					row_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> RowSerDes.toDTO((String)object)
						).toArray(
							size -> new Row[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					row_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					row_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					row_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					row_Page.setTotalCount(
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