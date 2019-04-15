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
import com.liferay.headless.delivery.client.dto.v1_0.Page_ContentDocument;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ContentDocumentSerDes {

	public static Page_ContentDocument toDTO(String json) {
		Page_ContentDocumentJSONParser page_ContentDocumentJSONParser =
			new Page_ContentDocumentJSONParser();

		return page_ContentDocumentJSONParser.parseToDTO(json);
	}

	public static Page_ContentDocument[] toDTOs(String json) {
		Page_ContentDocumentJSONParser page_ContentDocumentJSONParser =
			new Page_ContentDocumentJSONParser();

		return page_ContentDocumentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_ContentDocument page_ContentDocument) {
		if (page_ContentDocument == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ContentDocument.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ContentDocument.getItems().length; i++) {
				sb.append(
					ContentDocumentSerDes.toJSON(
						page_ContentDocument.getItems()[i]));

				if ((i + 1) < page_ContentDocument.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ContentDocument.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentDocument.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ContentDocument.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentDocument.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ContentDocument.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentDocument.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ContentDocument.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentDocument.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ContentDocumentJSONParser
		extends BaseJSONParser<Page_ContentDocument> {

		protected Page_ContentDocument createDTO() {
			return new Page_ContentDocument();
		}

		protected Page_ContentDocument[] createDTOArray(int size) {
			return new Page_ContentDocument[size];
		}

		protected void setField(
			Page_ContentDocument page_ContentDocument,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ContentDocument.setItems(
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
					page_ContentDocument.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ContentDocument.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ContentDocument.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ContentDocument.setTotalCount(
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