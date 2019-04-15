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

import com.liferay.headless.form.client.dto.v1_0.FormRecordForm;
import com.liferay.headless.form.client.dto.v1_0.FormRecordForm_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class FormRecordForm_PageSerDes {

	public static FormRecordForm_Page toDTO(String json) {
		FormRecordForm_PageJSONParser formRecordForm_PageJSONParser =
			new FormRecordForm_PageJSONParser();

		return formRecordForm_PageJSONParser.parseToDTO(json);
	}

	public static FormRecordForm_Page[] toDTOs(String json) {
		FormRecordForm_PageJSONParser formRecordForm_PageJSONParser =
			new FormRecordForm_PageJSONParser();

		return formRecordForm_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(FormRecordForm_Page formRecordForm_Page) {
		if (formRecordForm_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (formRecordForm_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < formRecordForm_Page.getItems().length; i++) {
				sb.append(
					FormRecordFormSerDes.toJSON(
						formRecordForm_Page.getItems()[i]));

				if ((i + 1) < formRecordForm_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (formRecordForm_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecordForm_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (formRecordForm_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecordForm_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (formRecordForm_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecordForm_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (formRecordForm_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(formRecordForm_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class FormRecordForm_PageJSONParser
		extends BaseJSONParser<FormRecordForm_Page> {

		protected FormRecordForm_Page createDTO() {
			return new FormRecordForm_Page();
		}

		protected FormRecordForm_Page[] createDTOArray(int size) {
			return new FormRecordForm_Page[size];
		}

		protected void setField(
			FormRecordForm_Page formRecordForm_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					formRecordForm_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormRecordFormSerDes.toDTO((String)object)
						).toArray(
							size -> new FormRecordForm[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					formRecordForm_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					formRecordForm_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					formRecordForm_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					formRecordForm_Page.setTotalCount(
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