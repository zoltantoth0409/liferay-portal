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

import com.liferay.headless.form.client.dto.v1_0.Validation;
import com.liferay.headless.form.client.dto.v1_0.Validation_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Validation_PageSerDes {

	public static Validation_Page toDTO(String json) {
		Validation_PageJSONParser validation_PageJSONParser =
			new Validation_PageJSONParser();

		return validation_PageJSONParser.parseToDTO(json);
	}

	public static Validation_Page[] toDTOs(String json) {
		Validation_PageJSONParser validation_PageJSONParser =
			new Validation_PageJSONParser();

		return validation_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Validation_Page validation_Page) {
		if (validation_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (validation_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < validation_Page.getItems().length; i++) {
				sb.append(
					ValidationSerDes.toJSON(validation_Page.getItems()[i]));

				if ((i + 1) < validation_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (validation_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(validation_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (validation_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(validation_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (validation_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(validation_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (validation_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(validation_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Validation_PageJSONParser
		extends BaseJSONParser<Validation_Page> {

		protected Validation_Page createDTO() {
			return new Validation_Page();
		}

		protected Validation_Page[] createDTOArray(int size) {
			return new Validation_Page[size];
		}

		protected void setField(
			Validation_Page validation_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					validation_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ValidationSerDes.toDTO((String)object)
						).toArray(
							size -> new Validation[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					validation_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					validation_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					validation_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					validation_Page.setTotalCount(
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