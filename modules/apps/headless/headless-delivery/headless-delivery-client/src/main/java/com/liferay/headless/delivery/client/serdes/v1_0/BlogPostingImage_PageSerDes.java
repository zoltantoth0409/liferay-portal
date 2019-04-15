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

import com.liferay.headless.delivery.client.dto.v1_0.BlogPostingImage;
import com.liferay.headless.delivery.client.dto.v1_0.BlogPostingImage_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class BlogPostingImage_PageSerDes {

	public static BlogPostingImage_Page toDTO(String json) {
		BlogPostingImage_PageJSONParser blogPostingImage_PageJSONParser =
			new BlogPostingImage_PageJSONParser();

		return blogPostingImage_PageJSONParser.parseToDTO(json);
	}

	public static BlogPostingImage_Page[] toDTOs(String json) {
		BlogPostingImage_PageJSONParser blogPostingImage_PageJSONParser =
			new BlogPostingImage_PageJSONParser();

		return blogPostingImage_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(BlogPostingImage_Page blogPostingImage_Page) {
		if (blogPostingImage_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (blogPostingImage_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < blogPostingImage_Page.getItems().length; i++) {
				sb.append(
					BlogPostingImageSerDes.toJSON(
						blogPostingImage_Page.getItems()[i]));

				if ((i + 1) < blogPostingImage_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (blogPostingImage_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPostingImage_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (blogPostingImage_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPostingImage_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (blogPostingImage_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPostingImage_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (blogPostingImage_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(blogPostingImage_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class BlogPostingImage_PageJSONParser
		extends BaseJSONParser<BlogPostingImage_Page> {

		protected BlogPostingImage_Page createDTO() {
			return new BlogPostingImage_Page();
		}

		protected BlogPostingImage_Page[] createDTOArray(int size) {
			return new BlogPostingImage_Page[size];
		}

		protected void setField(
			BlogPostingImage_Page blogPostingImage_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					blogPostingImage_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> BlogPostingImageSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new BlogPostingImage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					blogPostingImage_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					blogPostingImage_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					blogPostingImage_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					blogPostingImage_Page.setTotalCount(
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