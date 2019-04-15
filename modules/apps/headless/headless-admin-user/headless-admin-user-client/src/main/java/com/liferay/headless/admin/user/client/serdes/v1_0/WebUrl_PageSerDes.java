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

import com.liferay.headless.admin.user.client.dto.v1_0.WebUrl;
import com.liferay.headless.admin.user.client.dto.v1_0.WebUrl_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class WebUrl_PageSerDes {

	public static WebUrl_Page toDTO(String json) {
		WebUrl_PageJSONParser webUrl_PageJSONParser =
			new WebUrl_PageJSONParser();

		return webUrl_PageJSONParser.parseToDTO(json);
	}

	public static WebUrl_Page[] toDTOs(String json) {
		WebUrl_PageJSONParser webUrl_PageJSONParser =
			new WebUrl_PageJSONParser();

		return webUrl_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(WebUrl_Page webUrl_Page) {
		if (webUrl_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (webUrl_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < webUrl_Page.getItems().length; i++) {
				sb.append(WebUrlSerDes.toJSON(webUrl_Page.getItems()[i]));

				if ((i + 1) < webUrl_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (webUrl_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(webUrl_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (webUrl_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(webUrl_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (webUrl_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(webUrl_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (webUrl_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(webUrl_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class WebUrl_PageJSONParser
		extends BaseJSONParser<WebUrl_Page> {

		protected WebUrl_Page createDTO() {
			return new WebUrl_Page();
		}

		protected WebUrl_Page[] createDTOArray(int size) {
			return new WebUrl_Page[size];
		}

		protected void setField(
			WebUrl_Page webUrl_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					webUrl_Page.setItems(
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
					webUrl_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					webUrl_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					webUrl_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					webUrl_Page.setTotalCount(
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