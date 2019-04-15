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

import com.liferay.headless.form.client.dto.v1_0.Page_Row;
import com.liferay.headless.form.client.dto.v1_0.Row;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_RowSerDes {

	public static Page_Row toDTO(String json) {
		Page_RowJSONParser page_RowJSONParser = new Page_RowJSONParser();

		return page_RowJSONParser.parseToDTO(json);
	}

	public static Page_Row[] toDTOs(String json) {
		Page_RowJSONParser page_RowJSONParser = new Page_RowJSONParser();

		return page_RowJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Row page_Row) {
		if (page_Row == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Row.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Row.getItems().length; i++) {
				sb.append(RowSerDes.toJSON(page_Row.getItems()[i]));

				if ((i + 1) < page_Row.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Row.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Row.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Row.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Row.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Row.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Row.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Row.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Row.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_RowJSONParser extends BaseJSONParser<Page_Row> {

		protected Page_Row createDTO() {
			return new Page_Row();
		}

		protected Page_Row[] createDTOArray(int size) {
			return new Page_Row[size];
		}

		protected void setField(
			Page_Row page_Row, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Row.setItems(
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
					page_Row.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Row.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Row.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Row.setTotalCount(
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