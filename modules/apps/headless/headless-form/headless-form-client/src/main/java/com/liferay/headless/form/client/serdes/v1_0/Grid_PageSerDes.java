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

package com.liferay.headless.form.client.serdes.v1_0;

import com.liferay.headless.form.client.dto.v1_0.Grid;
import com.liferay.headless.form.client.dto.v1_0.Grid_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Grid_PageSerDes {

	public static Grid_Page toDTO(String json) {
		Grid_PageJSONParser grid_PageJSONParser = new Grid_PageJSONParser();

		return grid_PageJSONParser.parseToDTO(json);
	}

	public static Grid_Page[] toDTOs(String json) {
		Grid_PageJSONParser grid_PageJSONParser = new Grid_PageJSONParser();

		return grid_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Grid_Page grid_Page) {
		if (grid_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (grid_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < grid_Page.getItems().length; i++) {
				sb.append(GridSerDes.toJSON(grid_Page.getItems()[i]));

				if ((i + 1) < grid_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (grid_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(grid_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (grid_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(grid_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (grid_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(grid_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (grid_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(grid_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Grid_PageJSONParser extends BaseJSONParser<Grid_Page> {

		protected Grid_Page createDTO() {
			return new Grid_Page();
		}

		protected Grid_Page[] createDTOArray(int size) {
			return new Grid_Page[size];
		}

		protected void setField(
			Grid_Page grid_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					grid_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> GridSerDes.toDTO((String)object)
						).toArray(
							size -> new Grid[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					grid_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					grid_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					grid_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					grid_Page.setTotalCount(
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