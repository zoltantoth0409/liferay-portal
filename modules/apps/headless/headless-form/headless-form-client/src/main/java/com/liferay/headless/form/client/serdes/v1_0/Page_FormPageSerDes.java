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

import com.liferay.headless.form.client.dto.v1_0.FormPage;
import com.liferay.headless.form.client.dto.v1_0.Page_FormPage;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FormPageSerDes {

	public static Page_FormPage toDTO(String json) {
		Page_FormPageJSONParser page_FormPageJSONParser =
			new Page_FormPageJSONParser();

		return page_FormPageJSONParser.parseToDTO(json);
	}

	public static Page_FormPage[] toDTOs(String json) {
		Page_FormPageJSONParser page_FormPageJSONParser =
			new Page_FormPageJSONParser();

		return page_FormPageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_FormPage page_FormPage) {
		if (page_FormPage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_FormPage.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_FormPage.getItems().length; i++) {
				sb.append(FormPageSerDes.toJSON(page_FormPage.getItems()[i]));

				if ((i + 1) < page_FormPage.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_FormPage.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormPage.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_FormPage.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormPage.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_FormPage.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormPage.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_FormPage.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormPage.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FormPageJSONParser
		extends BaseJSONParser<Page_FormPage> {

		protected Page_FormPage createDTO() {
			return new Page_FormPage();
		}

		protected Page_FormPage[] createDTOArray(int size) {
			return new Page_FormPage[size];
		}

		protected void setField(
			Page_FormPage page_FormPage, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_FormPage.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormPageSerDes.toDTO((String)object)
						).toArray(
							size -> new FormPage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_FormPage.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_FormPage.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_FormPage.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_FormPage.setTotalCount(
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