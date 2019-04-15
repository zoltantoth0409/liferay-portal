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
import com.liferay.headless.form.client.dto.v1_0.Page_Grid;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_GridSerDes {

	public static Page_Grid toDTO(String json) {
		Page_GridJSONParser page_GridJSONParser = new Page_GridJSONParser();

		return page_GridJSONParser.parseToDTO(json);
	}

	public static Page_Grid[] toDTOs(String json) {
		Page_GridJSONParser page_GridJSONParser = new Page_GridJSONParser();

		return page_GridJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Grid page_Grid) {
		if (page_Grid == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Grid.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Grid.getItems().length; i++) {
				sb.append(GridSerDes.toJSON(page_Grid.getItems()[i]));

				if ((i + 1) < page_Grid.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Grid.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Grid.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Grid.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Grid.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Grid.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Grid.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Grid.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Grid.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_GridJSONParser extends BaseJSONParser<Page_Grid> {

		protected Page_Grid createDTO() {
			return new Page_Grid();
		}

		protected Page_Grid[] createDTOArray(int size) {
			return new Page_Grid[size];
		}

		protected void setField(
			Page_Grid page_Grid, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Grid.setItems(
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
					page_Grid.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Grid.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Grid.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Grid.setTotalCount(
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