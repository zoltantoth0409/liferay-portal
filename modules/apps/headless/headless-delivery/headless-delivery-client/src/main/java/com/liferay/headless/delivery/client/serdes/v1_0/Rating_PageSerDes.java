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

import com.liferay.headless.delivery.client.dto.v1_0.Rating;
import com.liferay.headless.delivery.client.dto.v1_0.Rating_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Rating_PageSerDes {

	public static Rating_Page toDTO(String json) {
		Rating_PageJSONParser rating_PageJSONParser =
			new Rating_PageJSONParser();

		return rating_PageJSONParser.parseToDTO(json);
	}

	public static Rating_Page[] toDTOs(String json) {
		Rating_PageJSONParser rating_PageJSONParser =
			new Rating_PageJSONParser();

		return rating_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Rating_Page rating_Page) {
		if (rating_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (rating_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < rating_Page.getItems().length; i++) {
				sb.append(RatingSerDes.toJSON(rating_Page.getItems()[i]));

				if ((i + 1) < rating_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (rating_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(rating_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (rating_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(rating_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (rating_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(rating_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (rating_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(rating_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Rating_PageJSONParser
		extends BaseJSONParser<Rating_Page> {

		protected Rating_Page createDTO() {
			return new Rating_Page();
		}

		protected Rating_Page[] createDTOArray(int size) {
			return new Rating_Page[size];
		}

		protected void setField(
			Rating_Page rating_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					rating_Page.setItems(
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
					rating_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					rating_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					rating_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					rating_Page.setTotalCount(
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