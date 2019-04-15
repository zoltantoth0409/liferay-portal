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

import com.liferay.headless.form.client.dto.v1_0.FormDocument;
import com.liferay.headless.form.client.dto.v1_0.Page_FormDocument;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FormDocumentSerDes {

	public static Page_FormDocument toDTO(String json) {
		Page_FormDocumentJSONParser page_FormDocumentJSONParser =
			new Page_FormDocumentJSONParser();

		return page_FormDocumentJSONParser.parseToDTO(json);
	}

	public static Page_FormDocument[] toDTOs(String json) {
		Page_FormDocumentJSONParser page_FormDocumentJSONParser =
			new Page_FormDocumentJSONParser();

		return page_FormDocumentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_FormDocument page_FormDocument) {
		if (page_FormDocument == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_FormDocument.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_FormDocument.getItems().length; i++) {
				sb.append(
					FormDocumentSerDes.toJSON(page_FormDocument.getItems()[i]));

				if ((i + 1) < page_FormDocument.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_FormDocument.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormDocument.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_FormDocument.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormDocument.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_FormDocument.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormDocument.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_FormDocument.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormDocument.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FormDocumentJSONParser
		extends BaseJSONParser<Page_FormDocument> {

		protected Page_FormDocument createDTO() {
			return new Page_FormDocument();
		}

		protected Page_FormDocument[] createDTOArray(int size) {
			return new Page_FormDocument[size];
		}

		protected void setField(
			Page_FormDocument page_FormDocument, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_FormDocument.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormDocumentSerDes.toDTO((String)object)
						).toArray(
							size -> new FormDocument[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_FormDocument.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_FormDocument.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_FormDocument.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_FormDocument.setTotalCount(
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