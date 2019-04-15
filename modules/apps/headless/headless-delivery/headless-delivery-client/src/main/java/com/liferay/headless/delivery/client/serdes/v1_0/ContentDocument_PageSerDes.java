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

import com.liferay.headless.delivery.client.dto.v1_0.ContentDocument;
import com.liferay.headless.delivery.client.dto.v1_0.ContentDocument_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentDocument_PageSerDes {

	public static ContentDocument_Page toDTO(String json) {
		ContentDocument_PageJSONParser contentDocument_PageJSONParser =
			new ContentDocument_PageJSONParser();

		return contentDocument_PageJSONParser.parseToDTO(json);
	}

	public static ContentDocument_Page[] toDTOs(String json) {
		ContentDocument_PageJSONParser contentDocument_PageJSONParser =
			new ContentDocument_PageJSONParser();

		return contentDocument_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ContentDocument_Page contentDocument_Page) {
		if (contentDocument_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (contentDocument_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contentDocument_Page.getItems().length; i++) {
				sb.append(
					ContentDocumentSerDes.toJSON(
						contentDocument_Page.getItems()[i]));

				if ((i + 1) < contentDocument_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (contentDocument_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentDocument_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (contentDocument_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentDocument_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (contentDocument_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentDocument_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (contentDocument_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentDocument_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ContentDocument_PageJSONParser
		extends BaseJSONParser<ContentDocument_Page> {

		protected ContentDocument_Page createDTO() {
			return new ContentDocument_Page();
		}

		protected ContentDocument_Page[] createDTOArray(int size) {
			return new ContentDocument_Page[size];
		}

		protected void setField(
			ContentDocument_Page contentDocument_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					contentDocument_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentDocumentSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ContentDocument[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					contentDocument_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					contentDocument_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					contentDocument_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					contentDocument_Page.setTotalCount(
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