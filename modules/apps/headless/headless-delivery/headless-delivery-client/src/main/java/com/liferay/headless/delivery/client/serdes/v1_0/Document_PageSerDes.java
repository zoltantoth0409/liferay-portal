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

import com.liferay.headless.delivery.client.dto.v1_0.Document;
import com.liferay.headless.delivery.client.dto.v1_0.Document_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Document_PageSerDes {

	public static Document_Page toDTO(String json) {
		Document_PageJSONParser document_PageJSONParser =
			new Document_PageJSONParser();

		return document_PageJSONParser.parseToDTO(json);
	}

	public static Document_Page[] toDTOs(String json) {
		Document_PageJSONParser document_PageJSONParser =
			new Document_PageJSONParser();

		return document_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Document_Page document_Page) {
		if (document_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (document_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < document_Page.getItems().length; i++) {
				sb.append(DocumentSerDes.toJSON(document_Page.getItems()[i]));

				if ((i + 1) < document_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (document_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(document_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (document_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(document_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (document_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(document_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (document_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(document_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Document_PageJSONParser
		extends BaseJSONParser<Document_Page> {

		protected Document_Page createDTO() {
			return new Document_Page();
		}

		protected Document_Page[] createDTOArray(int size) {
			return new Document_Page[size];
		}

		protected void setField(
			Document_Page document_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					document_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> DocumentSerDes.toDTO((String)object)
						).toArray(
							size -> new Document[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					document_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					document_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					document_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					document_Page.setTotalCount(
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