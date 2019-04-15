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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_WebUrl;
import com.liferay.headless.admin.user.client.dto.v1_0.WebUrl;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_WebUrlSerDes {

	public static Page_WebUrl toDTO(String json) {
		Page_WebUrlJSONParser page_WebUrlJSONParser =
			new Page_WebUrlJSONParser();

		return page_WebUrlJSONParser.parseToDTO(json);
	}

	public static Page_WebUrl[] toDTOs(String json) {
		Page_WebUrlJSONParser page_WebUrlJSONParser =
			new Page_WebUrlJSONParser();

		return page_WebUrlJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_WebUrl page_WebUrl) {
		if (page_WebUrl == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_WebUrl.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_WebUrl.getItems().length; i++) {
				sb.append(WebUrlSerDes.toJSON(page_WebUrl.getItems()[i]));

				if ((i + 1) < page_WebUrl.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_WebUrl.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WebUrl.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_WebUrl.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WebUrl.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_WebUrl.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WebUrl.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_WebUrl.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_WebUrl.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_WebUrlJSONParser
		extends BaseJSONParser<Page_WebUrl> {

		protected Page_WebUrl createDTO() {
			return new Page_WebUrl();
		}

		protected Page_WebUrl[] createDTOArray(int size) {
			return new Page_WebUrl[size];
		}

		protected void setField(
			Page_WebUrl page_WebUrl, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_WebUrl.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> WebUrlSerDes.toDTO((String)object)
						).toArray(
							size -> new WebUrl[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_WebUrl.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_WebUrl.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_WebUrl.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_WebUrl.setTotalCount(
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