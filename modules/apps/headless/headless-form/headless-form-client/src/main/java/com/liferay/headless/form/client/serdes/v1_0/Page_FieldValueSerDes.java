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

import com.liferay.headless.form.client.dto.v1_0.FieldValue;
import com.liferay.headless.form.client.dto.v1_0.Page_FieldValue;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FieldValueSerDes {

	public static Page_FieldValue toDTO(String json) {
		Page_FieldValueJSONParser page_FieldValueJSONParser =
			new Page_FieldValueJSONParser();

		return page_FieldValueJSONParser.parseToDTO(json);
	}

	public static Page_FieldValue[] toDTOs(String json) {
		Page_FieldValueJSONParser page_FieldValueJSONParser =
			new Page_FieldValueJSONParser();

		return page_FieldValueJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_FieldValue page_FieldValue) {
		if (page_FieldValue == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_FieldValue.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_FieldValue.getItems().length; i++) {
				sb.append(
					FieldValueSerDes.toJSON(page_FieldValue.getItems()[i]));

				if ((i + 1) < page_FieldValue.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_FieldValue.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FieldValue.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_FieldValue.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FieldValue.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_FieldValue.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FieldValue.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_FieldValue.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FieldValue.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FieldValueJSONParser
		extends BaseJSONParser<Page_FieldValue> {

		protected Page_FieldValue createDTO() {
			return new Page_FieldValue();
		}

		protected Page_FieldValue[] createDTOArray(int size) {
			return new Page_FieldValue[size];
		}

		protected void setField(
			Page_FieldValue page_FieldValue, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_FieldValue.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FieldValueSerDes.toDTO((String)object)
						).toArray(
							size -> new FieldValue[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_FieldValue.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_FieldValue.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_FieldValue.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_FieldValue.setTotalCount(
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