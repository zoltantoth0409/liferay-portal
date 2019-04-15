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

import com.liferay.headless.form.client.dto.v1_0.FormStructure;
import com.liferay.headless.form.client.dto.v1_0.FormStructure_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class FormStructure_PageSerDes {

	public static FormStructure_Page toDTO(String json) {
		FormStructure_PageJSONParser formStructure_PageJSONParser =
			new FormStructure_PageJSONParser();

		return formStructure_PageJSONParser.parseToDTO(json);
	}

	public static FormStructure_Page[] toDTOs(String json) {
		FormStructure_PageJSONParser formStructure_PageJSONParser =
			new FormStructure_PageJSONParser();

		return formStructure_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(FormStructure_Page formStructure_Page) {
		if (formStructure_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (formStructure_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < formStructure_Page.getItems().length; i++) {
				sb.append(
					FormStructureSerDes.toJSON(
						formStructure_Page.getItems()[i]));

				if ((i + 1) < formStructure_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (formStructure_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formStructure_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (formStructure_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(formStructure_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (formStructure_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(formStructure_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (formStructure_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(formStructure_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class FormStructure_PageJSONParser
		extends BaseJSONParser<FormStructure_Page> {

		protected FormStructure_Page createDTO() {
			return new FormStructure_Page();
		}

		protected FormStructure_Page[] createDTOArray(int size) {
			return new FormStructure_Page[size];
		}

		protected void setField(
			FormStructure_Page formStructure_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					formStructure_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormStructureSerDes.toDTO((String)object)
						).toArray(
							size -> new FormStructure[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					formStructure_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					formStructure_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					formStructure_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					formStructure_Page.setTotalCount(
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