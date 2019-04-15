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

package com.liferay.headless.admin.user.client.serdes.v1_0;

import com.liferay.headless.admin.user.client.dto.v1_0.Location;
import com.liferay.headless.admin.user.client.dto.v1_0.Page_Location;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_LocationSerDes {

	public static Page_Location toDTO(String json) {
		Page_LocationJSONParser page_LocationJSONParser =
			new Page_LocationJSONParser();

		return page_LocationJSONParser.parseToDTO(json);
	}

	public static Page_Location[] toDTOs(String json) {
		Page_LocationJSONParser page_LocationJSONParser =
			new Page_LocationJSONParser();

		return page_LocationJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Location page_Location) {
		if (page_Location == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Location.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Location.getItems().length; i++) {
				sb.append(LocationSerDes.toJSON(page_Location.getItems()[i]));

				if ((i + 1) < page_Location.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Location.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Location.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Location.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Location.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Location.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Location.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Location.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Location.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_LocationJSONParser
		extends BaseJSONParser<Page_Location> {

		protected Page_Location createDTO() {
			return new Page_Location();
		}

		protected Page_Location[] createDTOArray(int size) {
			return new Page_Location[size];
		}

		protected void setField(
			Page_Location page_Location, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Location.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> LocationSerDes.toDTO((String)object)
						).toArray(
							size -> new Location[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Location.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Location.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Location.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Location.setTotalCount(
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