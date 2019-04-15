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
import com.liferay.headless.delivery.client.dto.v1_0.Option_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Option_PageSerDes {

	public static Option_Page toDTO(String json) {
		Option_PageJSONParser option_PageJSONParser =
			new Option_PageJSONParser();

		return option_PageJSONParser.parseToDTO(json);
	}

	public static Option_Page[] toDTOs(String json) {
		Option_PageJSONParser option_PageJSONParser =
			new Option_PageJSONParser();

		return option_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Option_Page option_Page) {
		if (option_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (option_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < option_Page.getItems().length; i++) {
				sb.append(OptionSerDes.toJSON(option_Page.getItems()[i]));

				if ((i + 1) < option_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (option_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(option_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (option_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(option_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (option_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(option_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (option_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(option_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Option_PageJSONParser
		extends BaseJSONParser<Option_Page> {

		protected Option_Page createDTO() {
			return new Option_Page();
		}

		protected Option_Page[] createDTOArray(int size) {
			return new Option_Page[size];
		}

		protected void setField(
			Option_Page option_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					option_Page.setItems(
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
					option_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					option_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					option_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					option_Page.setTotalCount(
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