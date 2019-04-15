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

import com.liferay.headless.delivery.client.dto.v1_0.BlogPosting;
import com.liferay.headless.delivery.client.dto.v1_0.Page_BlogPosting;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_BlogPostingSerDes {

	public static Page_BlogPosting toDTO(String json) {
		Page_BlogPostingJSONParser page_BlogPostingJSONParser =
			new Page_BlogPostingJSONParser();

		return page_BlogPostingJSONParser.parseToDTO(json);
	}

	public static Page_BlogPosting[] toDTOs(String json) {
		Page_BlogPostingJSONParser page_BlogPostingJSONParser =
			new Page_BlogPostingJSONParser();

		return page_BlogPostingJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_BlogPosting page_BlogPosting) {
		if (page_BlogPosting == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_BlogPosting.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_BlogPosting.getItems().length; i++) {
				sb.append(
					BlogPostingSerDes.toJSON(page_BlogPosting.getItems()[i]));

				if ((i + 1) < page_BlogPosting.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_BlogPosting.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPosting.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_BlogPosting.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPosting.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_BlogPosting.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPosting.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_BlogPosting.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPosting.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_BlogPostingJSONParser
		extends BaseJSONParser<Page_BlogPosting> {

		protected Page_BlogPosting createDTO() {
			return new Page_BlogPosting();
		}

		protected Page_BlogPosting[] createDTOArray(int size) {
			return new Page_BlogPosting[size];
		}

		protected void setField(
			Page_BlogPosting page_BlogPosting, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_BlogPosting.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> BlogPostingSerDes.toDTO((String)object)
						).toArray(
							size -> new BlogPosting[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_BlogPosting.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_BlogPosting.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_BlogPosting.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_BlogPosting.setTotalCount(
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