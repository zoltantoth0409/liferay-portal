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
import com.liferay.headless.delivery.client.dto.v1_0.Page_Comment;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_CommentSerDes {

	public static Page_Comment toDTO(String json) {
		Page_CommentJSONParser page_CommentJSONParser =
			new Page_CommentJSONParser();

		return page_CommentJSONParser.parseToDTO(json);
	}

	public static Page_Comment[] toDTOs(String json) {
		Page_CommentJSONParser page_CommentJSONParser =
			new Page_CommentJSONParser();

		return page_CommentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Comment page_Comment) {
		if (page_Comment == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Comment.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Comment.getItems().length; i++) {
				sb.append(CommentSerDes.toJSON(page_Comment.getItems()[i]));

				if ((i + 1) < page_Comment.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Comment.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Comment.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Comment.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Comment.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Comment.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Comment.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Comment.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Comment.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_CommentJSONParser
		extends BaseJSONParser<Page_Comment> {

		protected Page_Comment createDTO() {
			return new Page_Comment();
		}

		protected Page_Comment[] createDTOArray(int size) {
			return new Page_Comment[size];
		}

		protected void setField(
			Page_Comment page_Comment, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Comment.setItems(
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
					page_Comment.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Comment.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Comment.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Comment.setTotalCount(
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