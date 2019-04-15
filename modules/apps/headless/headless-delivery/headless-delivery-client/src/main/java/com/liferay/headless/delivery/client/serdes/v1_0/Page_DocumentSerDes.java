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
import com.liferay.headless.delivery.client.dto.v1_0.Page_Document;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_DocumentSerDes {

	public static Page_Document toDTO(String json) {
		Page_DocumentJSONParser page_DocumentJSONParser =
			new Page_DocumentJSONParser();

		return page_DocumentJSONParser.parseToDTO(json);
	}

	public static Page_Document[] toDTOs(String json) {
		Page_DocumentJSONParser page_DocumentJSONParser =
			new Page_DocumentJSONParser();

		return page_DocumentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Document page_Document) {
		if (page_Document == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Document.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Document.getItems().length; i++) {
				sb.append(DocumentSerDes.toJSON(page_Document.getItems()[i]));

				if ((i + 1) < page_Document.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Document.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Document.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Document.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Document.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Document.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Document.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Document.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Document.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_DocumentJSONParser
		extends BaseJSONParser<Page_Document> {

		protected Page_Document createDTO() {
			return new Page_Document();
		}

		protected Page_Document[] createDTOArray(int size) {
			return new Page_Document[size];
		}

		protected void setField(
			Page_Document page_Document, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Document.setItems(
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
					page_Document.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Document.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Document.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Document.setTotalCount(
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