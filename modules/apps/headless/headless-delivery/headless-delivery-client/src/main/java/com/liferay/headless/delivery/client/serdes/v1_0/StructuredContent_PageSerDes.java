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

import com.liferay.headless.delivery.client.dto.v1_0.StructuredContent;
import com.liferay.headless.delivery.client.dto.v1_0.StructuredContent_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class StructuredContent_PageSerDes {

	public static StructuredContent_Page toDTO(String json) {
		StructuredContent_PageJSONParser structuredContent_PageJSONParser =
			new StructuredContent_PageJSONParser();

		return structuredContent_PageJSONParser.parseToDTO(json);
	}

	public static StructuredContent_Page[] toDTOs(String json) {
		StructuredContent_PageJSONParser structuredContent_PageJSONParser =
			new StructuredContent_PageJSONParser();

		return structuredContent_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(StructuredContent_Page structuredContent_Page) {
		if (structuredContent_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (structuredContent_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < structuredContent_Page.getItems().length; i++) {
				sb.append(
					StructuredContentSerDes.toJSON(
						structuredContent_Page.getItems()[i]));

				if ((i + 1) < structuredContent_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (structuredContent_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContent_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (structuredContent_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContent_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (structuredContent_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContent_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (structuredContent_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContent_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class StructuredContent_PageJSONParser
		extends BaseJSONParser<StructuredContent_Page> {

		protected StructuredContent_Page createDTO() {
			return new StructuredContent_Page();
		}

		protected StructuredContent_Page[] createDTOArray(int size) {
			return new StructuredContent_Page[size];
		}

		protected void setField(
			StructuredContent_Page structuredContent_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					structuredContent_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> StructuredContentSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new StructuredContent[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					structuredContent_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					structuredContent_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					structuredContent_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					structuredContent_Page.setTotalCount(
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