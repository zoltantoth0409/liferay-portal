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

import com.liferay.headless.delivery.client.dto.v1_0.ParentKnowledgeBaseFolder;
import com.liferay.headless.delivery.client.dto.v1_0.ParentKnowledgeBaseFolder_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ParentKnowledgeBaseFolder_PageSerDes {

	public static ParentKnowledgeBaseFolder_Page toDTO(String json) {
		ParentKnowledgeBaseFolder_PageJSONParser
			parentKnowledgeBaseFolder_PageJSONParser =
				new ParentKnowledgeBaseFolder_PageJSONParser();

		return parentKnowledgeBaseFolder_PageJSONParser.parseToDTO(json);
	}

	public static ParentKnowledgeBaseFolder_Page[] toDTOs(String json) {
		ParentKnowledgeBaseFolder_PageJSONParser
			parentKnowledgeBaseFolder_PageJSONParser =
				new ParentKnowledgeBaseFolder_PageJSONParser();

		return parentKnowledgeBaseFolder_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		ParentKnowledgeBaseFolder_Page parentKnowledgeBaseFolder_Page) {

		if (parentKnowledgeBaseFolder_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (parentKnowledgeBaseFolder_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0;
				 i < parentKnowledgeBaseFolder_Page.getItems().length; i++) {

				sb.append(
					ParentKnowledgeBaseFolderSerDes.toJSON(
						parentKnowledgeBaseFolder_Page.getItems()[i]));

				if ((i + 1) <
						parentKnowledgeBaseFolder_Page.getItems().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (parentKnowledgeBaseFolder_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentKnowledgeBaseFolder_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (parentKnowledgeBaseFolder_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentKnowledgeBaseFolder_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (parentKnowledgeBaseFolder_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentKnowledgeBaseFolder_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (parentKnowledgeBaseFolder_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentKnowledgeBaseFolder_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ParentKnowledgeBaseFolder_PageJSONParser
		extends BaseJSONParser<ParentKnowledgeBaseFolder_Page> {

		protected ParentKnowledgeBaseFolder_Page createDTO() {
			return new ParentKnowledgeBaseFolder_Page();
		}

		protected ParentKnowledgeBaseFolder_Page[] createDTOArray(int size) {
			return new ParentKnowledgeBaseFolder_Page[size];
		}

		protected void setField(
			ParentKnowledgeBaseFolder_Page parentKnowledgeBaseFolder_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					parentKnowledgeBaseFolder_Page.setItems(
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
					parentKnowledgeBaseFolder_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					parentKnowledgeBaseFolder_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					parentKnowledgeBaseFolder_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					parentKnowledgeBaseFolder_Page.setTotalCount(
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