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

import com.liferay.headless.delivery.client.dto.v1_0.Page_Value;
import com.liferay.headless.delivery.client.dto.v1_0.Value;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ValueSerDes {

	public static Page_Value toDTO(String json) {
		Page_ValueJSONParser page_ValueJSONParser = new Page_ValueJSONParser();

		return page_ValueJSONParser.parseToDTO(json);
	}

	public static Page_Value[] toDTOs(String json) {
		Page_ValueJSONParser page_ValueJSONParser = new Page_ValueJSONParser();

		return page_ValueJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Value page_Value) {
		if (page_Value == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Value.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Value.getItems().length; i++) {
				sb.append(ValueSerDes.toJSON(page_Value.getItems()[i]));

				if ((i + 1) < page_Value.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Value.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Value.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Value.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Value.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Value.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Value.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Value.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Value.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ValueJSONParser
		extends BaseJSONParser<Page_Value> {

		protected Page_Value createDTO() {
			return new Page_Value();
		}

		protected Page_Value[] createDTOArray(int size) {
			return new Page_Value[size];
		}

		protected void setField(
			Page_Value page_Value, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Value.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ValueSerDes.toDTO((String)object)
						).toArray(
							size -> new Value[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Value.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Value.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Value.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Value.setTotalCount(
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