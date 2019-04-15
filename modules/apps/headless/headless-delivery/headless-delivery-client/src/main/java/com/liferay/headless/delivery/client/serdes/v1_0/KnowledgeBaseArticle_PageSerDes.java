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

import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseArticle;
import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseArticle_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class KnowledgeBaseArticle_PageSerDes {

	public static KnowledgeBaseArticle_Page toDTO(String json) {
		KnowledgeBaseArticle_PageJSONParser
			knowledgeBaseArticle_PageJSONParser =
				new KnowledgeBaseArticle_PageJSONParser();

		return knowledgeBaseArticle_PageJSONParser.parseToDTO(json);
	}

	public static KnowledgeBaseArticle_Page[] toDTOs(String json) {
		KnowledgeBaseArticle_PageJSONParser
			knowledgeBaseArticle_PageJSONParser =
				new KnowledgeBaseArticle_PageJSONParser();

		return knowledgeBaseArticle_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		KnowledgeBaseArticle_Page knowledgeBaseArticle_Page) {

		if (knowledgeBaseArticle_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (knowledgeBaseArticle_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < knowledgeBaseArticle_Page.getItems().length;
				 i++) {

				sb.append(
					KnowledgeBaseArticleSerDes.toJSON(
						knowledgeBaseArticle_Page.getItems()[i]));

				if ((i + 1) < knowledgeBaseArticle_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (knowledgeBaseArticle_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseArticle_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (knowledgeBaseArticle_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseArticle_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (knowledgeBaseArticle_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseArticle_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (knowledgeBaseArticle_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseArticle_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class KnowledgeBaseArticle_PageJSONParser
		extends BaseJSONParser<KnowledgeBaseArticle_Page> {

		protected KnowledgeBaseArticle_Page createDTO() {
			return new KnowledgeBaseArticle_Page();
		}

		protected KnowledgeBaseArticle_Page[] createDTOArray(int size) {
			return new KnowledgeBaseArticle_Page[size];
		}

		protected void setField(
			KnowledgeBaseArticle_Page knowledgeBaseArticle_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseArticle_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> KnowledgeBaseArticleSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new KnowledgeBaseArticle[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseArticle_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseArticle_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseArticle_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseArticle_Page.setTotalCount(
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