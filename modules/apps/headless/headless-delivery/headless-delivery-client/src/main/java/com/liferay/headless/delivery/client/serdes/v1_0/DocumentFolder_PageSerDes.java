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

import com.liferay.headless.delivery.client.dto.v1_0.DocumentFolder;
import com.liferay.headless.delivery.client.dto.v1_0.DocumentFolder_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class DocumentFolder_PageSerDes {

	public static DocumentFolder_Page toDTO(String json) {
		DocumentFolder_PageJSONParser documentFolder_PageJSONParser =
			new DocumentFolder_PageJSONParser();

		return documentFolder_PageJSONParser.parseToDTO(json);
	}

	public static DocumentFolder_Page[] toDTOs(String json) {
		DocumentFolder_PageJSONParser documentFolder_PageJSONParser =
			new DocumentFolder_PageJSONParser();

		return documentFolder_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DocumentFolder_Page documentFolder_Page) {
		if (documentFolder_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (documentFolder_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < documentFolder_Page.getItems().length; i++) {
				sb.append(
					DocumentFolderSerDes.toJSON(
						documentFolder_Page.getItems()[i]));

				if ((i + 1) < documentFolder_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (documentFolder_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(documentFolder_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (documentFolder_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(documentFolder_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (documentFolder_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(documentFolder_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (documentFolder_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(documentFolder_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class DocumentFolder_PageJSONParser
		extends BaseJSONParser<DocumentFolder_Page> {

		protected DocumentFolder_Page createDTO() {
			return new DocumentFolder_Page();
		}

		protected DocumentFolder_Page[] createDTOArray(int size) {
			return new DocumentFolder_Page[size];
		}

		protected void setField(
			DocumentFolder_Page documentFolder_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					documentFolder_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> DocumentFolderSerDes.toDTO((String)object)
						).toArray(
							size -> new DocumentFolder[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					documentFolder_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					documentFolder_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					documentFolder_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					documentFolder_Page.setTotalCount(
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