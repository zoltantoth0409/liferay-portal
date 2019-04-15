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

import com.liferay.headless.form.client.dto.v1_0.FormDocument;
import com.liferay.headless.form.client.dto.v1_0.FormDocument_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class FormDocument_PageSerDes {

	public static FormDocument_Page toDTO(String json) {
		FormDocument_PageJSONParser formDocument_PageJSONParser =
			new FormDocument_PageJSONParser();

		return formDocument_PageJSONParser.parseToDTO(json);
	}

	public static FormDocument_Page[] toDTOs(String json) {
		FormDocument_PageJSONParser formDocument_PageJSONParser =
			new FormDocument_PageJSONParser();

		return formDocument_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(FormDocument_Page formDocument_Page) {
		if (formDocument_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (formDocument_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < formDocument_Page.getItems().length; i++) {
				sb.append(
					FormDocumentSerDes.toJSON(formDocument_Page.getItems()[i]));

				if ((i + 1) < formDocument_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (formDocument_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formDocument_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (formDocument_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formDocument_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (formDocument_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(formDocument_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (formDocument_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(formDocument_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class FormDocument_PageJSONParser
		extends BaseJSONParser<FormDocument_Page> {

		protected FormDocument_Page createDTO() {
			return new FormDocument_Page();
		}

		protected FormDocument_Page[] createDTOArray(int size) {
			return new FormDocument_Page[size];
		}

		protected void setField(
			FormDocument_Page formDocument_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					formDocument_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormDocumentSerDes.toDTO((String)object)
						).toArray(
							size -> new FormDocument[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					formDocument_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					formDocument_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					formDocument_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					formDocument_Page.setTotalCount(
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