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

import com.liferay.headless.delivery.client.dto.v1_0.Page_Rating;
import com.liferay.headless.delivery.client.dto.v1_0.Rating;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_RatingSerDes {

	public static Page_Rating toDTO(String json) {
		Page_RatingJSONParser page_RatingJSONParser =
			new Page_RatingJSONParser();

		return page_RatingJSONParser.parseToDTO(json);
	}

	public static Page_Rating[] toDTOs(String json) {
		Page_RatingJSONParser page_RatingJSONParser =
			new Page_RatingJSONParser();

		return page_RatingJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Rating page_Rating) {
		if (page_Rating == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Rating.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Rating.getItems().length; i++) {
				sb.append(RatingSerDes.toJSON(page_Rating.getItems()[i]));

				if ((i + 1) < page_Rating.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Rating.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Rating.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Rating.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Rating.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Rating.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Rating.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Rating.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Rating.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_RatingJSONParser
		extends BaseJSONParser<Page_Rating> {

		protected Page_Rating createDTO() {
			return new Page_Rating();
		}

		protected Page_Rating[] createDTOArray(int size) {
			return new Page_Rating[size];
		}

		protected void setField(
			Page_Rating page_Rating, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Rating.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> RatingSerDes.toDTO((String)object)
						).toArray(
							size -> new Rating[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Rating.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Rating.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Rating.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Rating.setTotalCount(
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