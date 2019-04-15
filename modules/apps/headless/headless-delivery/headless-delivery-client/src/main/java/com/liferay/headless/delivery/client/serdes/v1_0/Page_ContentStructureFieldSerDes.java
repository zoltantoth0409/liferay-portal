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

import com.liferay.headless.delivery.client.dto.v1_0.ContentStructureField;
import com.liferay.headless.delivery.client.dto.v1_0.Page_ContentStructureField;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ContentStructureFieldSerDes {

	public static Page_ContentStructureField toDTO(String json) {
		Page_ContentStructureFieldJSONParser
			page_ContentStructureFieldJSONParser =
				new Page_ContentStructureFieldJSONParser();

		return page_ContentStructureFieldJSONParser.parseToDTO(json);
	}

	public static Page_ContentStructureField[] toDTOs(String json) {
		Page_ContentStructureFieldJSONParser
			page_ContentStructureFieldJSONParser =
				new Page_ContentStructureFieldJSONParser();

		return page_ContentStructureFieldJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_ContentStructureField page_ContentStructureField) {

		if (page_ContentStructureField == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ContentStructureField.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ContentStructureField.getItems().length;
				 i++) {

				sb.append(
					ContentStructureFieldSerDes.toJSON(
						page_ContentStructureField.getItems()[i]));

				if ((i + 1) < page_ContentStructureField.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ContentStructureField.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructureField.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ContentStructureField.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructureField.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ContentStructureField.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructureField.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ContentStructureField.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructureField.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ContentStructureFieldJSONParser
		extends BaseJSONParser<Page_ContentStructureField> {

		protected Page_ContentStructureField createDTO() {
			return new Page_ContentStructureField();
		}

		protected Page_ContentStructureField[] createDTOArray(int size) {
			return new Page_ContentStructureField[size];
		}

		protected void setField(
			Page_ContentStructureField page_ContentStructureField,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructureField.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentStructureFieldSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ContentStructureField[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructureField.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructureField.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructureField.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructureField.setTotalCount(
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