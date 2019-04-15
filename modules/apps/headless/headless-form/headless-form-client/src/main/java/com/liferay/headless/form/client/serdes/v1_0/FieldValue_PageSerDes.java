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
import com.liferay.headless.form.client.dto.v1_0.FieldValue_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class FieldValue_PageSerDes {

	public static FieldValue_Page toDTO(String json) {
		FieldValue_PageJSONParser fieldValue_PageJSONParser =
			new FieldValue_PageJSONParser();

		return fieldValue_PageJSONParser.parseToDTO(json);
	}

	public static FieldValue_Page[] toDTOs(String json) {
		FieldValue_PageJSONParser fieldValue_PageJSONParser =
			new FieldValue_PageJSONParser();

		return fieldValue_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(FieldValue_Page fieldValue_Page) {
		if (fieldValue_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (fieldValue_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < fieldValue_Page.getItems().length; i++) {
				sb.append(
					FieldValueSerDes.toJSON(fieldValue_Page.getItems()[i]));

				if ((i + 1) < fieldValue_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (fieldValue_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(fieldValue_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (fieldValue_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(fieldValue_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (fieldValue_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(fieldValue_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (fieldValue_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(fieldValue_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class FieldValue_PageJSONParser
		extends BaseJSONParser<FieldValue_Page> {

		protected FieldValue_Page createDTO() {
			return new FieldValue_Page();
		}

		protected FieldValue_Page[] createDTOArray(int size) {
			return new FieldValue_Page[size];
		}

		protected void setField(
			FieldValue_Page fieldValue_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					fieldValue_Page.setItems(
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
					fieldValue_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					fieldValue_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					fieldValue_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					fieldValue_Page.setTotalCount(
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