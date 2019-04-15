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
import com.liferay.headless.delivery.client.dto.v1_0.Page_KnowledgeBaseArticle;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_KnowledgeBaseArticleSerDes {

	public static Page_KnowledgeBaseArticle toDTO(String json) {
		Page_KnowledgeBaseArticleJSONParser
			page_KnowledgeBaseArticleJSONParser =
				new Page_KnowledgeBaseArticleJSONParser();

		return page_KnowledgeBaseArticleJSONParser.parseToDTO(json);
	}

	public static Page_KnowledgeBaseArticle[] toDTOs(String json) {
		Page_KnowledgeBaseArticleJSONParser
			page_KnowledgeBaseArticleJSONParser =
				new Page_KnowledgeBaseArticleJSONParser();

		return page_KnowledgeBaseArticleJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_KnowledgeBaseArticle page_KnowledgeBaseArticle) {

		if (page_KnowledgeBaseArticle == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_KnowledgeBaseArticle.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_KnowledgeBaseArticle.getItems().length;
				 i++) {

				sb.append(
					KnowledgeBaseArticleSerDes.toJSON(
						page_KnowledgeBaseArticle.getItems()[i]));

				if ((i + 1) < page_KnowledgeBaseArticle.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_KnowledgeBaseArticle.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseArticle.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_KnowledgeBaseArticle.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseArticle.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_KnowledgeBaseArticle.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseArticle.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_KnowledgeBaseArticle.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseArticle.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_KnowledgeBaseArticleJSONParser
		extends BaseJSONParser<Page_KnowledgeBaseArticle> {

		protected Page_KnowledgeBaseArticle createDTO() {
			return new Page_KnowledgeBaseArticle();
		}

		protected Page_KnowledgeBaseArticle[] createDTOArray(int size) {
			return new Page_KnowledgeBaseArticle[size];
		}

		protected void setField(
			Page_KnowledgeBaseArticle page_KnowledgeBaseArticle,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseArticle.setItems(
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
					page_KnowledgeBaseArticle.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseArticle.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseArticle.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseArticle.setTotalCount(
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