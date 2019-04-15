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

import com.liferay.headless.delivery.client.dto.v1_0.Page_StructuredContent;
import com.liferay.headless.delivery.client.dto.v1_0.StructuredContent;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_StructuredContentSerDes {

	public static Page_StructuredContent toDTO(String json) {
		Page_StructuredContentJSONParser page_StructuredContentJSONParser =
			new Page_StructuredContentJSONParser();

		return page_StructuredContentJSONParser.parseToDTO(json);
	}

	public static Page_StructuredContent[] toDTOs(String json) {
		Page_StructuredContentJSONParser page_StructuredContentJSONParser =
			new Page_StructuredContentJSONParser();

		return page_StructuredContentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_StructuredContent page_StructuredContent) {
		if (page_StructuredContent == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_StructuredContent.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_StructuredContent.getItems().length; i++) {
				sb.append(
					StructuredContentSerDes.toJSON(
						page_StructuredContent.getItems()[i]));

				if ((i + 1) < page_StructuredContent.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_StructuredContent.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContent.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_StructuredContent.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContent.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_StructuredContent.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContent.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_StructuredContent.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContent.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_StructuredContentJSONParser
		extends BaseJSONParser<Page_StructuredContent> {

		protected Page_StructuredContent createDTO() {
			return new Page_StructuredContent();
		}

		protected Page_StructuredContent[] createDTOArray(int size) {
			return new Page_StructuredContent[size];
		}

		protected void setField(
			Page_StructuredContent page_StructuredContent,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContent.setItems(
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
					page_StructuredContent.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContent.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContent.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContent.setTotalCount(
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