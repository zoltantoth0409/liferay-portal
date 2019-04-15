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

import com.liferay.headless.admin.user.client.dto.v1_0.HoursAvailable;
import com.liferay.headless.admin.user.client.dto.v1_0.HoursAvailable_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class HoursAvailable_PageSerDes {

	public static HoursAvailable_Page toDTO(String json) {
		HoursAvailable_PageJSONParser hoursAvailable_PageJSONParser =
			new HoursAvailable_PageJSONParser();

		return hoursAvailable_PageJSONParser.parseToDTO(json);
	}

	public static HoursAvailable_Page[] toDTOs(String json) {
		HoursAvailable_PageJSONParser hoursAvailable_PageJSONParser =
			new HoursAvailable_PageJSONParser();

		return hoursAvailable_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(HoursAvailable_Page hoursAvailable_Page) {
		if (hoursAvailable_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (hoursAvailable_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < hoursAvailable_Page.getItems().length; i++) {
				sb.append(
					HoursAvailableSerDes.toJSON(
						hoursAvailable_Page.getItems()[i]));

				if ((i + 1) < hoursAvailable_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (hoursAvailable_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(hoursAvailable_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (hoursAvailable_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(hoursAvailable_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (hoursAvailable_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(hoursAvailable_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (hoursAvailable_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(hoursAvailable_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class HoursAvailable_PageJSONParser
		extends BaseJSONParser<HoursAvailable_Page> {

		protected HoursAvailable_Page createDTO() {
			return new HoursAvailable_Page();
		}

		protected HoursAvailable_Page[] createDTOArray(int size) {
			return new HoursAvailable_Page[size];
		}

		protected void setField(
			HoursAvailable_Page hoursAvailable_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					hoursAvailable_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> HoursAvailableSerDes.toDTO((String)object)
						).toArray(
							size -> new HoursAvailable[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					hoursAvailable_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					hoursAvailable_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					hoursAvailable_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					hoursAvailable_Page.setTotalCount(
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