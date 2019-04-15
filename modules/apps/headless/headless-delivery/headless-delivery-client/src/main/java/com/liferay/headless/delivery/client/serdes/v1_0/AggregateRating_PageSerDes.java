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
import com.liferay.headless.delivery.client.dto.v1_0.AggregateRating_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class AggregateRating_PageSerDes {

	public static AggregateRating_Page toDTO(String json) {
		AggregateRating_PageJSONParser aggregateRating_PageJSONParser =
			new AggregateRating_PageJSONParser();

		return aggregateRating_PageJSONParser.parseToDTO(json);
	}

	public static AggregateRating_Page[] toDTOs(String json) {
		AggregateRating_PageJSONParser aggregateRating_PageJSONParser =
			new AggregateRating_PageJSONParser();

		return aggregateRating_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(AggregateRating_Page aggregateRating_Page) {
		if (aggregateRating_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (aggregateRating_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < aggregateRating_Page.getItems().length; i++) {
				sb.append(
					AggregateRatingSerDes.toJSON(
						aggregateRating_Page.getItems()[i]));

				if ((i + 1) < aggregateRating_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (aggregateRating_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(aggregateRating_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (aggregateRating_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(aggregateRating_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (aggregateRating_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(aggregateRating_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (aggregateRating_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(aggregateRating_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class AggregateRating_PageJSONParser
		extends BaseJSONParser<AggregateRating_Page> {

		protected AggregateRating_Page createDTO() {
			return new AggregateRating_Page();
		}

		protected AggregateRating_Page[] createDTOArray(int size) {
			return new AggregateRating_Page[size];
		}

		protected void setField(
			AggregateRating_Page aggregateRating_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					aggregateRating_Page.setItems(
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
					aggregateRating_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					aggregateRating_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					aggregateRating_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					aggregateRating_Page.setTotalCount(
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