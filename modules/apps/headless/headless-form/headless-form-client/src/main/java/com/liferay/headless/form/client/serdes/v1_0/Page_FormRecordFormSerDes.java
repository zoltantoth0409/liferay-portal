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
import com.liferay.headless.form.client.dto.v1_0.Page_FormRecordForm;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FormRecordFormSerDes {

	public static Page_FormRecordForm toDTO(String json) {
		Page_FormRecordFormJSONParser page_FormRecordFormJSONParser =
			new Page_FormRecordFormJSONParser();

		return page_FormRecordFormJSONParser.parseToDTO(json);
	}

	public static Page_FormRecordForm[] toDTOs(String json) {
		Page_FormRecordFormJSONParser page_FormRecordFormJSONParser =
			new Page_FormRecordFormJSONParser();

		return page_FormRecordFormJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_FormRecordForm page_FormRecordForm) {
		if (page_FormRecordForm == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_FormRecordForm.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_FormRecordForm.getItems().length; i++) {
				sb.append(
					FormRecordFormSerDes.toJSON(
						page_FormRecordForm.getItems()[i]));

				if ((i + 1) < page_FormRecordForm.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_FormRecordForm.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecordForm.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_FormRecordForm.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecordForm.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_FormRecordForm.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecordForm.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_FormRecordForm.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecordForm.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FormRecordFormJSONParser
		extends BaseJSONParser<Page_FormRecordForm> {

		protected Page_FormRecordForm createDTO() {
			return new Page_FormRecordForm();
		}

		protected Page_FormRecordForm[] createDTOArray(int size) {
			return new Page_FormRecordForm[size];
		}

		protected void setField(
			Page_FormRecordForm page_FormRecordForm, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_FormRecordForm.setItems(
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
					page_FormRecordForm.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_FormRecordForm.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_FormRecordForm.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_FormRecordForm.setTotalCount(
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