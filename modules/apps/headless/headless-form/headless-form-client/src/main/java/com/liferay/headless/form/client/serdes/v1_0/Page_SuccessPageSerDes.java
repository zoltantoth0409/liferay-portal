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

import com.liferay.headless.form.client.dto.v1_0.Page_SuccessPage;
import com.liferay.headless.form.client.dto.v1_0.SuccessPage;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_SuccessPageSerDes {

	public static Page_SuccessPage toDTO(String json) {
		Page_SuccessPageJSONParser page_SuccessPageJSONParser =
			new Page_SuccessPageJSONParser();

		return page_SuccessPageJSONParser.parseToDTO(json);
	}

	public static Page_SuccessPage[] toDTOs(String json) {
		Page_SuccessPageJSONParser page_SuccessPageJSONParser =
			new Page_SuccessPageJSONParser();

		return page_SuccessPageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_SuccessPage page_SuccessPage) {
		if (page_SuccessPage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_SuccessPage.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_SuccessPage.getItems().length; i++) {
				sb.append(
					SuccessPageSerDes.toJSON(page_SuccessPage.getItems()[i]));

				if ((i + 1) < page_SuccessPage.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_SuccessPage.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SuccessPage.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_SuccessPage.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SuccessPage.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_SuccessPage.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SuccessPage.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_SuccessPage.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SuccessPage.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_SuccessPageJSONParser
		extends BaseJSONParser<Page_SuccessPage> {

		protected Page_SuccessPage createDTO() {
			return new Page_SuccessPage();
		}

		protected Page_SuccessPage[] createDTOArray(int size) {
			return new Page_SuccessPage[size];
		}

		protected void setField(
			Page_SuccessPage page_SuccessPage, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_SuccessPage.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> SuccessPageSerDes.toDTO((String)object)
						).toArray(
							size -> new SuccessPage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_SuccessPage.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_SuccessPage.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_SuccessPage.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_SuccessPage.setTotalCount(
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