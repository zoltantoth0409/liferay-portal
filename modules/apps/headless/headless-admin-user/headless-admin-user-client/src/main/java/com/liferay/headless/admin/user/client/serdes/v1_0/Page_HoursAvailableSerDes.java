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
import com.liferay.headless.admin.user.client.dto.v1_0.Page_HoursAvailable;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_HoursAvailableSerDes {

	public static Page_HoursAvailable toDTO(String json) {
		Page_HoursAvailableJSONParser page_HoursAvailableJSONParser =
			new Page_HoursAvailableJSONParser();

		return page_HoursAvailableJSONParser.parseToDTO(json);
	}

	public static Page_HoursAvailable[] toDTOs(String json) {
		Page_HoursAvailableJSONParser page_HoursAvailableJSONParser =
			new Page_HoursAvailableJSONParser();

		return page_HoursAvailableJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_HoursAvailable page_HoursAvailable) {
		if (page_HoursAvailable == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_HoursAvailable.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_HoursAvailable.getItems().length; i++) {
				sb.append(
					HoursAvailableSerDes.toJSON(
						page_HoursAvailable.getItems()[i]));

				if ((i + 1) < page_HoursAvailable.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_HoursAvailable.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_HoursAvailable.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_HoursAvailable.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_HoursAvailable.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_HoursAvailable.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_HoursAvailable.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_HoursAvailable.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_HoursAvailable.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_HoursAvailableJSONParser
		extends BaseJSONParser<Page_HoursAvailable> {

		protected Page_HoursAvailable createDTO() {
			return new Page_HoursAvailable();
		}

		protected Page_HoursAvailable[] createDTOArray(int size) {
			return new Page_HoursAvailable[size];
		}

		protected void setField(
			Page_HoursAvailable page_HoursAvailable, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_HoursAvailable.setItems(
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
					page_HoursAvailable.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_HoursAvailable.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_HoursAvailable.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_HoursAvailable.setTotalCount(
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