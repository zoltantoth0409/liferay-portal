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

import com.liferay.headless.form.client.dto.v1_0.Page_Validation;
import com.liferay.headless.form.client.dto.v1_0.Validation;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ValidationSerDes {

	public static Page_Validation toDTO(String json) {
		Page_ValidationJSONParser page_ValidationJSONParser =
			new Page_ValidationJSONParser();

		return page_ValidationJSONParser.parseToDTO(json);
	}

	public static Page_Validation[] toDTOs(String json) {
		Page_ValidationJSONParser page_ValidationJSONParser =
			new Page_ValidationJSONParser();

		return page_ValidationJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Validation page_Validation) {
		if (page_Validation == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Validation.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Validation.getItems().length; i++) {
				sb.append(
					ValidationSerDes.toJSON(page_Validation.getItems()[i]));

				if ((i + 1) < page_Validation.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Validation.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Validation.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Validation.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Validation.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Validation.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Validation.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Validation.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Validation.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ValidationJSONParser
		extends BaseJSONParser<Page_Validation> {

		protected Page_Validation createDTO() {
			return new Page_Validation();
		}

		protected Page_Validation[] createDTOArray(int size) {
			return new Page_Validation[size];
		}

		protected void setField(
			Page_Validation page_Validation, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Validation.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ValidationSerDes.toDTO((String)object)
						).toArray(
							size -> new Validation[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Validation.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Validation.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Validation.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Validation.setTotalCount(
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