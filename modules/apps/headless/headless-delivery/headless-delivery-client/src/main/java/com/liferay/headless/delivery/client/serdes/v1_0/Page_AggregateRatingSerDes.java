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

import com.liferay.headless.delivery.client.dto.v1_0.AggregateRating;
import com.liferay.headless.delivery.client.dto.v1_0.Page_AggregateRating;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_AggregateRatingSerDes {

	public static Page_AggregateRating toDTO(String json) {
		Page_AggregateRatingJSONParser page_AggregateRatingJSONParser =
			new Page_AggregateRatingJSONParser();

		return page_AggregateRatingJSONParser.parseToDTO(json);
	}

	public static Page_AggregateRating[] toDTOs(String json) {
		Page_AggregateRatingJSONParser page_AggregateRatingJSONParser =
			new Page_AggregateRatingJSONParser();

		return page_AggregateRatingJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_AggregateRating page_AggregateRating) {
		if (page_AggregateRating == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_AggregateRating.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_AggregateRating.getItems().length; i++) {
				sb.append(
					AggregateRatingSerDes.toJSON(
						page_AggregateRating.getItems()[i]));

				if ((i + 1) < page_AggregateRating.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_AggregateRating.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AggregateRating.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_AggregateRating.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AggregateRating.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_AggregateRating.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AggregateRating.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_AggregateRating.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AggregateRating.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_AggregateRatingJSONParser
		extends BaseJSONParser<Page_AggregateRating> {

		protected Page_AggregateRating createDTO() {
			return new Page_AggregateRating();
		}

		protected Page_AggregateRating[] createDTOArray(int size) {
			return new Page_AggregateRating[size];
		}

		protected void setField(
			Page_AggregateRating page_AggregateRating,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_AggregateRating.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> AggregateRatingSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new AggregateRating[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_AggregateRating.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_AggregateRating.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_AggregateRating.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_AggregateRating.setTotalCount(
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