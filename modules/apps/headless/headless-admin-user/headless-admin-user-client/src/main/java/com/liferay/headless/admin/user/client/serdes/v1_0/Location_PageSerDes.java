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
import com.liferay.headless.admin.user.client.dto.v1_0.Location_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Location_PageSerDes {

	public static Location_Page toDTO(String json) {
		Location_PageJSONParser location_PageJSONParser =
			new Location_PageJSONParser();

		return location_PageJSONParser.parseToDTO(json);
	}

	public static Location_Page[] toDTOs(String json) {
		Location_PageJSONParser location_PageJSONParser =
			new Location_PageJSONParser();

		return location_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Location_Page location_Page) {
		if (location_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (location_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < location_Page.getItems().length; i++) {
				sb.append(LocationSerDes.toJSON(location_Page.getItems()[i]));

				if ((i + 1) < location_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (location_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(location_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (location_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(location_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (location_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(location_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (location_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(location_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Location_PageJSONParser
		extends BaseJSONParser<Location_Page> {

		protected Location_Page createDTO() {
			return new Location_Page();
		}

		protected Location_Page[] createDTOArray(int size) {
			return new Location_Page[size];
		}

		protected void setField(
			Location_Page location_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					location_Page.setItems(
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
					location_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					location_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					location_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					location_Page.setTotalCount(
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