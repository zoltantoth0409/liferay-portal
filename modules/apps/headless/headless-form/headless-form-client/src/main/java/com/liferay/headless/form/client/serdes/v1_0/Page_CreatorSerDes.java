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

import com.liferay.headless.form.client.dto.v1_0.Creator;
import com.liferay.headless.form.client.dto.v1_0.Page_Creator;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_CreatorSerDes {

	public static Page_Creator toDTO(String json) {
		Page_CreatorJSONParser page_CreatorJSONParser =
			new Page_CreatorJSONParser();

		return page_CreatorJSONParser.parseToDTO(json);
	}

	public static Page_Creator[] toDTOs(String json) {
		Page_CreatorJSONParser page_CreatorJSONParser =
			new Page_CreatorJSONParser();

		return page_CreatorJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Creator page_Creator) {
		if (page_Creator == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Creator.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Creator.getItems().length; i++) {
				sb.append(CreatorSerDes.toJSON(page_Creator.getItems()[i]));

				if ((i + 1) < page_Creator.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Creator.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Creator.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Creator.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Creator.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Creator.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Creator.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Creator.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Creator.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_CreatorJSONParser
		extends BaseJSONParser<Page_Creator> {

		protected Page_Creator createDTO() {
			return new Page_Creator();
		}

		protected Page_Creator[] createDTOArray(int size) {
			return new Page_Creator[size];
		}

		protected void setField(
			Page_Creator page_Creator, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Creator.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> CreatorSerDes.toDTO((String)object)
						).toArray(
							size -> new Creator[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Creator.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Creator.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Creator.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Creator.setTotalCount(
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