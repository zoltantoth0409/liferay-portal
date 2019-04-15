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
import com.liferay.headless.form.client.dto.v1_0.Page_Form;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FormSerDes {

	public static Page_Form toDTO(String json) {
		Page_FormJSONParser page_FormJSONParser = new Page_FormJSONParser();

		return page_FormJSONParser.parseToDTO(json);
	}

	public static Page_Form[] toDTOs(String json) {
		Page_FormJSONParser page_FormJSONParser = new Page_FormJSONParser();

		return page_FormJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Form page_Form) {
		if (page_Form == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Form.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Form.getItems().length; i++) {
				sb.append(FormSerDes.toJSON(page_Form.getItems()[i]));

				if ((i + 1) < page_Form.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Form.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Form.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Form.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Form.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Form.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Form.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Form.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Form.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FormJSONParser extends BaseJSONParser<Page_Form> {

		protected Page_Form createDTO() {
			return new Page_Form();
		}

		protected Page_Form[] createDTOArray(int size) {
			return new Page_Form[size];
		}

		protected void setField(
			Page_Form page_Form, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Form.setItems(
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
					page_Form.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Form.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Form.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Form.setTotalCount(
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