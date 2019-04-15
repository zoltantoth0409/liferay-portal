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

import com.liferay.headless.form.client.dto.v1_0.FormRecord;
import com.liferay.headless.form.client.dto.v1_0.FormRecord_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class FormRecord_PageSerDes {

	public static FormRecord_Page toDTO(String json) {
		FormRecord_PageJSONParser formRecord_PageJSONParser =
			new FormRecord_PageJSONParser();

		return formRecord_PageJSONParser.parseToDTO(json);
	}

	public static FormRecord_Page[] toDTOs(String json) {
		FormRecord_PageJSONParser formRecord_PageJSONParser =
			new FormRecord_PageJSONParser();

		return formRecord_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(FormRecord_Page formRecord_Page) {
		if (formRecord_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (formRecord_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < formRecord_Page.getItems().length; i++) {
				sb.append(
					FormRecordSerDes.toJSON(formRecord_Page.getItems()[i]));

				if ((i + 1) < formRecord_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (formRecord_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecord_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (formRecord_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecord_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (formRecord_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecord_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (formRecord_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecord_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class FormRecord_PageJSONParser
		extends BaseJSONParser<FormRecord_Page> {

		protected FormRecord_Page createDTO() {
			return new FormRecord_Page();
		}

		protected FormRecord_Page[] createDTOArray(int size) {
			return new FormRecord_Page[size];
		}

		protected void setField(
			FormRecord_Page formRecord_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					formRecord_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormRecordSerDes.toDTO((String)object)
						).toArray(
							size -> new FormRecord[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					formRecord_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					formRecord_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					formRecord_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					formRecord_Page.setTotalCount(
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