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

import com.liferay.headless.delivery.client.dto.v1_0.Option;
import com.liferay.headless.delivery.client.dto.v1_0.Page_Option;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_OptionSerDes {

	public static Page_Option toDTO(String json) {
		Page_OptionJSONParser page_OptionJSONParser =
			new Page_OptionJSONParser();

		return page_OptionJSONParser.parseToDTO(json);
	}

	public static Page_Option[] toDTOs(String json) {
		Page_OptionJSONParser page_OptionJSONParser =
			new Page_OptionJSONParser();

		return page_OptionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Option page_Option) {
		if (page_Option == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Option.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Option.getItems().length; i++) {
				sb.append(OptionSerDes.toJSON(page_Option.getItems()[i]));

				if ((i + 1) < page_Option.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Option.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Option.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Option.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Option.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Option.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Option.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Option.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Option.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_OptionJSONParser
		extends BaseJSONParser<Page_Option> {

		protected Page_Option createDTO() {
			return new Page_Option();
		}

		protected Page_Option[] createDTOArray(int size) {
			return new Page_Option[size];
		}

		protected void setField(
			Page_Option page_Option, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Option.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> OptionSerDes.toDTO((String)object)
						).toArray(
							size -> new Option[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Option.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Option.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Option.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Option.setTotalCount(
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