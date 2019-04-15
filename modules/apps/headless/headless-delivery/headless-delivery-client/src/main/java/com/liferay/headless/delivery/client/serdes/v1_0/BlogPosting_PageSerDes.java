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
import com.liferay.headless.delivery.client.dto.v1_0.BlogPosting_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class BlogPosting_PageSerDes {

	public static BlogPosting_Page toDTO(String json) {
		BlogPosting_PageJSONParser blogPosting_PageJSONParser =
			new BlogPosting_PageJSONParser();

		return blogPosting_PageJSONParser.parseToDTO(json);
	}

	public static BlogPosting_Page[] toDTOs(String json) {
		BlogPosting_PageJSONParser blogPosting_PageJSONParser =
			new BlogPosting_PageJSONParser();

		return blogPosting_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(BlogPosting_Page blogPosting_Page) {
		if (blogPosting_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (blogPosting_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < blogPosting_Page.getItems().length; i++) {
				sb.append(
					BlogPostingSerDes.toJSON(blogPosting_Page.getItems()[i]));

				if ((i + 1) < blogPosting_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (blogPosting_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPosting_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (blogPosting_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPosting_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (blogPosting_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPosting_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (blogPosting_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPosting_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class BlogPosting_PageJSONParser
		extends BaseJSONParser<BlogPosting_Page> {

		protected BlogPosting_Page createDTO() {
			return new BlogPosting_Page();
		}

		protected BlogPosting_Page[] createDTOArray(int size) {
			return new BlogPosting_Page[size];
		}

		protected void setField(
			BlogPosting_Page blogPosting_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					blogPosting_Page.setItems(
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
					blogPosting_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					blogPosting_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					blogPosting_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					blogPosting_Page.setTotalCount(
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