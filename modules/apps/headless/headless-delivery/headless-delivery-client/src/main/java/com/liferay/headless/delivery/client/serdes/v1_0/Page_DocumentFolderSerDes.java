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
import com.liferay.headless.delivery.client.dto.v1_0.Page_DocumentFolder;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_DocumentFolderSerDes {

	public static Page_DocumentFolder toDTO(String json) {
		Page_DocumentFolderJSONParser page_DocumentFolderJSONParser =
			new Page_DocumentFolderJSONParser();

		return page_DocumentFolderJSONParser.parseToDTO(json);
	}

	public static Page_DocumentFolder[] toDTOs(String json) {
		Page_DocumentFolderJSONParser page_DocumentFolderJSONParser =
			new Page_DocumentFolderJSONParser();

		return page_DocumentFolderJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_DocumentFolder page_DocumentFolder) {
		if (page_DocumentFolder == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_DocumentFolder.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_DocumentFolder.getItems().length; i++) {
				sb.append(
					DocumentFolderSerDes.toJSON(
						page_DocumentFolder.getItems()[i]));

				if ((i + 1) < page_DocumentFolder.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_DocumentFolder.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_DocumentFolder.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_DocumentFolder.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_DocumentFolder.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_DocumentFolder.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_DocumentFolder.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_DocumentFolder.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_DocumentFolder.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_DocumentFolderJSONParser
		extends BaseJSONParser<Page_DocumentFolder> {

		protected Page_DocumentFolder createDTO() {
			return new Page_DocumentFolder();
		}

		protected Page_DocumentFolder[] createDTOArray(int size) {
			return new Page_DocumentFolder[size];
		}

		protected void setField(
			Page_DocumentFolder page_DocumentFolder, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_DocumentFolder.setItems(
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
					page_DocumentFolder.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_DocumentFolder.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_DocumentFolder.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_DocumentFolder.setTotalCount(
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