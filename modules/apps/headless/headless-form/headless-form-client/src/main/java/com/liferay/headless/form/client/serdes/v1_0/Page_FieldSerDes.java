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

import com.liferay.headless.form.client.dto.v1_0.Field;
import com.liferay.headless.form.client.dto.v1_0.Page_Field;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FieldSerDes {

	public static Page_Field toDTO(String json) {
		Page_FieldJSONParser page_FieldJSONParser = new Page_FieldJSONParser();

		return page_FieldJSONParser.parseToDTO(json);
	}

	public static Page_Field[] toDTOs(String json) {
		Page_FieldJSONParser page_FieldJSONParser = new Page_FieldJSONParser();

		return page_FieldJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Field page_Field) {
		if (page_Field == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Field.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Field.getItems().length; i++) {
				sb.append(FieldSerDes.toJSON(page_Field.getItems()[i]));

				if ((i + 1) < page_Field.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Field.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Field.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Field.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Field.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Field.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Field.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Field.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Field.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FieldJSONParser
		extends BaseJSONParser<Page_Field> {

		protected Page_Field createDTO() {
			return new Page_Field();
		}

		protected Page_Field[] createDTOArray(int size) {
			return new Page_Field[size];
		}

		protected void setField(
			Page_Field page_Field, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Field.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FieldSerDes.toDTO((String)object)
						).toArray(
							size -> new Field[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Field.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Field.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Field.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Field.setTotalCount(
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