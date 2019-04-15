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

import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseFolder;
import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseFolder_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class KnowledgeBaseFolder_PageSerDes {

	public static KnowledgeBaseFolder_Page toDTO(String json) {
		KnowledgeBaseFolder_PageJSONParser knowledgeBaseFolder_PageJSONParser =
			new KnowledgeBaseFolder_PageJSONParser();

		return knowledgeBaseFolder_PageJSONParser.parseToDTO(json);
	}

	public static KnowledgeBaseFolder_Page[] toDTOs(String json) {
		KnowledgeBaseFolder_PageJSONParser knowledgeBaseFolder_PageJSONParser =
			new KnowledgeBaseFolder_PageJSONParser();

		return knowledgeBaseFolder_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		KnowledgeBaseFolder_Page knowledgeBaseFolder_Page) {

		if (knowledgeBaseFolder_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (knowledgeBaseFolder_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < knowledgeBaseFolder_Page.getItems().length;
				 i++) {

				sb.append(
					KnowledgeBaseFolderSerDes.toJSON(
						knowledgeBaseFolder_Page.getItems()[i]));

				if ((i + 1) < knowledgeBaseFolder_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (knowledgeBaseFolder_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseFolder_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (knowledgeBaseFolder_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseFolder_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (knowledgeBaseFolder_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseFolder_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (knowledgeBaseFolder_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseFolder_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class KnowledgeBaseFolder_PageJSONParser
		extends BaseJSONParser<KnowledgeBaseFolder_Page> {

		protected KnowledgeBaseFolder_Page createDTO() {
			return new KnowledgeBaseFolder_Page();
		}

		protected KnowledgeBaseFolder_Page[] createDTOArray(int size) {
			return new KnowledgeBaseFolder_Page[size];
		}

		protected void setField(
			KnowledgeBaseFolder_Page knowledgeBaseFolder_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseFolder_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> KnowledgeBaseFolderSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new KnowledgeBaseFolder[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseFolder_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseFolder_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseFolder_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseFolder_Page.setTotalCount(
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