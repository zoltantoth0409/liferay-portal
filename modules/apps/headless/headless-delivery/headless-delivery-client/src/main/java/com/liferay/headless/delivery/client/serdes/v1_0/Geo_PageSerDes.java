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
import com.liferay.headless.delivery.client.dto.v1_0.Geo_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Geo_PageSerDes {

	public static Geo_Page toDTO(String json) {
		Geo_PageJSONParser geo_PageJSONParser = new Geo_PageJSONParser();

		return geo_PageJSONParser.parseToDTO(json);
	}

	public static Geo_Page[] toDTOs(String json) {
		Geo_PageJSONParser geo_PageJSONParser = new Geo_PageJSONParser();

		return geo_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Geo_Page geo_Page) {
		if (geo_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (geo_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < geo_Page.getItems().length; i++) {
				sb.append(GeoSerDes.toJSON(geo_Page.getItems()[i]));

				if ((i + 1) < geo_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (geo_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(geo_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (geo_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(geo_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (geo_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(geo_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (geo_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(geo_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Geo_PageJSONParser extends BaseJSONParser<Geo_Page> {

		protected Geo_Page createDTO() {
			return new Geo_Page();
		}

		protected Geo_Page[] createDTOArray(int size) {
			return new Geo_Page[size];
		}

		protected void setField(
			Geo_Page geo_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					geo_Page.setItems(
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
					geo_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					geo_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					geo_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					geo_Page.setTotalCount(
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