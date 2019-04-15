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

import com.liferay.headless.delivery.client.dto.v1_0.Page_ParentKnowledgeBaseFolder;
import com.liferay.headless.delivery.client.dto.v1_0.ParentKnowledgeBaseFolder;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ParentKnowledgeBaseFolderSerDes {

	public static Page_ParentKnowledgeBaseFolder toDTO(String json) {
		Page_ParentKnowledgeBaseFolderJSONParser
			page_ParentKnowledgeBaseFolderJSONParser =
				new Page_ParentKnowledgeBaseFolderJSONParser();

		return page_ParentKnowledgeBaseFolderJSONParser.parseToDTO(json);
	}

	public static Page_ParentKnowledgeBaseFolder[] toDTOs(String json) {
		Page_ParentKnowledgeBaseFolderJSONParser
			page_ParentKnowledgeBaseFolderJSONParser =
				new Page_ParentKnowledgeBaseFolderJSONParser();

		return page_ParentKnowledgeBaseFolderJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_ParentKnowledgeBaseFolder page_ParentKnowledgeBaseFolder) {

		if (page_ParentKnowledgeBaseFolder == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ParentKnowledgeBaseFolder.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0;
				 i < page_ParentKnowledgeBaseFolder.getItems().length; i++) {

				sb.append(
					ParentKnowledgeBaseFolderSerDes.toJSON(
						page_ParentKnowledgeBaseFolder.getItems()[i]));

				if ((i + 1) <
						page_ParentKnowledgeBaseFolder.getItems().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ParentKnowledgeBaseFolder.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentKnowledgeBaseFolder.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ParentKnowledgeBaseFolder.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentKnowledgeBaseFolder.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ParentKnowledgeBaseFolder.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentKnowledgeBaseFolder.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ParentKnowledgeBaseFolder.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentKnowledgeBaseFolder.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ParentKnowledgeBaseFolderJSONParser
		extends BaseJSONParser<Page_ParentKnowledgeBaseFolder> {

		protected Page_ParentKnowledgeBaseFolder createDTO() {
			return new Page_ParentKnowledgeBaseFolder();
		}

		protected Page_ParentKnowledgeBaseFolder[] createDTOArray(int size) {
			return new Page_ParentKnowledgeBaseFolder[size];
		}

		protected void setField(
			Page_ParentKnowledgeBaseFolder page_ParentKnowledgeBaseFolder,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ParentKnowledgeBaseFolder.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ParentKnowledgeBaseFolderSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ParentKnowledgeBaseFolder[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ParentKnowledgeBaseFolder.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ParentKnowledgeBaseFolder.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ParentKnowledgeBaseFolder.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ParentKnowledgeBaseFolder.setTotalCount(
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