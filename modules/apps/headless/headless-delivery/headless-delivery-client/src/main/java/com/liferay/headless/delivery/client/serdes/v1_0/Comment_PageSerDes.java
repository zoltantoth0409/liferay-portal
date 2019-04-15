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

import com.liferay.headless.delivery.client.dto.v1_0.Comment;
import com.liferay.headless.delivery.client.dto.v1_0.Comment_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Comment_PageSerDes {

	public static Comment_Page toDTO(String json) {
		Comment_PageJSONParser comment_PageJSONParser =
			new Comment_PageJSONParser();

		return comment_PageJSONParser.parseToDTO(json);
	}

	public static Comment_Page[] toDTOs(String json) {
		Comment_PageJSONParser comment_PageJSONParser =
			new Comment_PageJSONParser();

		return comment_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Comment_Page comment_Page) {
		if (comment_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (comment_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < comment_Page.getItems().length; i++) {
				sb.append(CommentSerDes.toJSON(comment_Page.getItems()[i]));

				if ((i + 1) < comment_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (comment_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(comment_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (comment_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(comment_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (comment_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(comment_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (comment_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(comment_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Comment_PageJSONParser
		extends BaseJSONParser<Comment_Page> {

		protected Comment_Page createDTO() {
			return new Comment_Page();
		}

		protected Comment_Page[] createDTOArray(int size) {
			return new Comment_Page[size];
		}

		protected void setField(
			Comment_Page comment_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					comment_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> CommentSerDes.toDTO((String)object)
						).toArray(
							size -> new Comment[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					comment_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					comment_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					comment_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					comment_Page.setTotalCount(
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