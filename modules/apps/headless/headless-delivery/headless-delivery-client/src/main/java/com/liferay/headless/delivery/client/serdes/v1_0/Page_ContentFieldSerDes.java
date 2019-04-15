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

package com.liferay.headless.delivery.client.serdes.v1_0;

import com.liferay.headless.delivery.client.dto.v1_0.ContentField;
import com.liferay.headless.delivery.client.dto.v1_0.Page_ContentField;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ContentFieldSerDes {

	public static Page_ContentField toDTO(String json) {
		Page_ContentFieldJSONParser page_ContentFieldJSONParser =
			new Page_ContentFieldJSONParser();

		return page_ContentFieldJSONParser.parseToDTO(json);
	}

	public static Page_ContentField[] toDTOs(String json) {
		Page_ContentFieldJSONParser page_ContentFieldJSONParser =
			new Page_ContentFieldJSONParser();

		return page_ContentFieldJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_ContentField page_ContentField) {
		if (page_ContentField == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ContentField.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ContentField.getItems().length; i++) {
				sb.append(
					ContentFieldSerDes.toJSON(page_ContentField.getItems()[i]));

				if ((i + 1) < page_ContentField.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ContentField.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentField.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ContentField.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentField.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ContentField.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentField.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ContentField.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentField.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ContentFieldJSONParser
		extends BaseJSONParser<Page_ContentField> {

		protected Page_ContentField createDTO() {
			return new Page_ContentField();
		}

		protected Page_ContentField[] createDTOArray(int size) {
			return new Page_ContentField[size];
		}

		protected void setField(
			Page_ContentField page_ContentField, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ContentField.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentFieldSerDes.toDTO((String)object)
						).toArray(
							size -> new ContentField[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ContentField.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ContentField.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ContentField.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ContentField.setTotalCount(
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