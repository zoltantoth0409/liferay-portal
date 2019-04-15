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

import com.liferay.headless.form.client.dto.v1_0.Form;
import com.liferay.headless.form.client.dto.v1_0.Form_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Form_PageSerDes {

	public static Form_Page toDTO(String json) {
		Form_PageJSONParser form_PageJSONParser = new Form_PageJSONParser();

		return form_PageJSONParser.parseToDTO(json);
	}

	public static Form_Page[] toDTOs(String json) {
		Form_PageJSONParser form_PageJSONParser = new Form_PageJSONParser();

		return form_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Form_Page form_Page) {
		if (form_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (form_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < form_Page.getItems().length; i++) {
				sb.append(FormSerDes.toJSON(form_Page.getItems()[i]));

				if ((i + 1) < form_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (form_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(form_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (form_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(form_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (form_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(form_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (form_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(form_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Form_PageJSONParser extends BaseJSONParser<Form_Page> {

		protected Form_Page createDTO() {
			return new Form_Page();
		}

		protected Form_Page[] createDTOArray(int size) {
			return new Form_Page[size];
		}

		protected void setField(
			Form_Page form_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					form_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormSerDes.toDTO((String)object)
						).toArray(
							size -> new Form[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					form_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					form_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					form_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					form_Page.setTotalCount(
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