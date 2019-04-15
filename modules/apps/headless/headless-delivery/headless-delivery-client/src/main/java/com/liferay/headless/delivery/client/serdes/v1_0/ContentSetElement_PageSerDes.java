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

import com.liferay.headless.delivery.client.dto.v1_0.ContentSetElement;
import com.liferay.headless.delivery.client.dto.v1_0.ContentSetElement_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentSetElement_PageSerDes {

	public static ContentSetElement_Page toDTO(String json) {
		ContentSetElement_PageJSONParser contentSetElement_PageJSONParser =
			new ContentSetElement_PageJSONParser();

		return contentSetElement_PageJSONParser.parseToDTO(json);
	}

	public static ContentSetElement_Page[] toDTOs(String json) {
		ContentSetElement_PageJSONParser contentSetElement_PageJSONParser =
			new ContentSetElement_PageJSONParser();

		return contentSetElement_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ContentSetElement_Page contentSetElement_Page) {
		if (contentSetElement_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (contentSetElement_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contentSetElement_Page.getItems().length; i++) {
				sb.append(
					ContentSetElementSerDes.toJSON(
						contentSetElement_Page.getItems()[i]));

				if ((i + 1) < contentSetElement_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (contentSetElement_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentSetElement_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (contentSetElement_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentSetElement_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (contentSetElement_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentSetElement_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (contentSetElement_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentSetElement_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ContentSetElement_PageJSONParser
		extends BaseJSONParser<ContentSetElement_Page> {

		protected ContentSetElement_Page createDTO() {
			return new ContentSetElement_Page();
		}

		protected ContentSetElement_Page[] createDTOArray(int size) {
			return new ContentSetElement_Page[size];
		}

		protected void setField(
			ContentSetElement_Page contentSetElement_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					contentSetElement_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentSetElementSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ContentSetElement[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					contentSetElement_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					contentSetElement_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					contentSetElement_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					contentSetElement_Page.setTotalCount(
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