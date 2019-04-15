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

package com.liferay.headless.admin.workflow.client.serdes.v1_0;

import com.liferay.headless.admin.workflow.client.dto.v1_0.ObjectReviewed;
import com.liferay.headless.admin.workflow.client.dto.v1_0.Page_ObjectReviewed;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ObjectReviewedSerDes {

	public static Page_ObjectReviewed toDTO(String json) {
		Page_ObjectReviewedJSONParser page_ObjectReviewedJSONParser =
			new Page_ObjectReviewedJSONParser();

		return page_ObjectReviewedJSONParser.parseToDTO(json);
	}

	public static Page_ObjectReviewed[] toDTOs(String json) {
		Page_ObjectReviewedJSONParser page_ObjectReviewedJSONParser =
			new Page_ObjectReviewedJSONParser();

		return page_ObjectReviewedJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_ObjectReviewed page_ObjectReviewed) {
		if (page_ObjectReviewed == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ObjectReviewed.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ObjectReviewed.getItems().length; i++) {
				sb.append(
					ObjectReviewedSerDes.toJSON(
						page_ObjectReviewed.getItems()[i]));

				if ((i + 1) < page_ObjectReviewed.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ObjectReviewed.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ObjectReviewed.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ObjectReviewed.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ObjectReviewed.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ObjectReviewed.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ObjectReviewed.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ObjectReviewed.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ObjectReviewed.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ObjectReviewedJSONParser
		extends BaseJSONParser<Page_ObjectReviewed> {

		protected Page_ObjectReviewed createDTO() {
			return new Page_ObjectReviewed();
		}

		protected Page_ObjectReviewed[] createDTOArray(int size) {
			return new Page_ObjectReviewed[size];
		}

		protected void setField(
			Page_ObjectReviewed page_ObjectReviewed, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ObjectReviewed.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ObjectReviewedSerDes.toDTO((String)object)
						).toArray(
							size -> new ObjectReviewed[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ObjectReviewed.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ObjectReviewed.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ObjectReviewed.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ObjectReviewed.setTotalCount(
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