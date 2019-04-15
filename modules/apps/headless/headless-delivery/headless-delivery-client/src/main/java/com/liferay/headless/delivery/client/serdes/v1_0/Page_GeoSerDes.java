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

import com.liferay.headless.delivery.client.dto.v1_0.Geo;
import com.liferay.headless.delivery.client.dto.v1_0.Page_Geo;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_GeoSerDes {

	public static Page_Geo toDTO(String json) {
		Page_GeoJSONParser page_GeoJSONParser = new Page_GeoJSONParser();

		return page_GeoJSONParser.parseToDTO(json);
	}

	public static Page_Geo[] toDTOs(String json) {
		Page_GeoJSONParser page_GeoJSONParser = new Page_GeoJSONParser();

		return page_GeoJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Geo page_Geo) {
		if (page_Geo == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Geo.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Geo.getItems().length; i++) {
				sb.append(GeoSerDes.toJSON(page_Geo.getItems()[i]));

				if ((i + 1) < page_Geo.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Geo.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Geo.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Geo.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Geo.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Geo.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Geo.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Geo.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Geo.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_GeoJSONParser extends BaseJSONParser<Page_Geo> {

		protected Page_Geo createDTO() {
			return new Page_Geo();
		}

		protected Page_Geo[] createDTOArray(int size) {
			return new Page_Geo[size];
		}

		protected void setField(
			Page_Geo page_Geo, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Geo.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> GeoSerDes.toDTO((String)object)
						).toArray(
							size -> new Geo[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Geo.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Geo.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Geo.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Geo.setTotalCount(
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