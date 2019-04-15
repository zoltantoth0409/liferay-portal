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
import com.liferay.headless.form.client.dto.v1_0.FormPage_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class FormPage_PageSerDes {

	public static FormPage_Page toDTO(String json) {
		FormPage_PageJSONParser formPage_PageJSONParser =
			new FormPage_PageJSONParser();

		return formPage_PageJSONParser.parseToDTO(json);
	}

	public static FormPage_Page[] toDTOs(String json) {
		FormPage_PageJSONParser formPage_PageJSONParser =
			new FormPage_PageJSONParser();

		return formPage_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(FormPage_Page formPage_Page) {
		if (formPage_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (formPage_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < formPage_Page.getItems().length; i++) {
				sb.append(FormPageSerDes.toJSON(formPage_Page.getItems()[i]));

				if ((i + 1) < formPage_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (formPage_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formPage_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (formPage_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formPage_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (formPage_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(formPage_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (formPage_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(formPage_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class FormPage_PageJSONParser
		extends BaseJSONParser<FormPage_Page> {

		protected FormPage_Page createDTO() {
			return new FormPage_Page();
		}

		protected FormPage_Page[] createDTOArray(int size) {
			return new FormPage_Page[size];
		}

		protected void setField(
			FormPage_Page formPage_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					formPage_Page.setItems(
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
					formPage_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					formPage_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					formPage_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					formPage_Page.setTotalCount(
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