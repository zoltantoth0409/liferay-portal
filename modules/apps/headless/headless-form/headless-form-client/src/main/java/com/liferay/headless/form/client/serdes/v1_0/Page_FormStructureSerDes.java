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
import com.liferay.headless.form.client.dto.v1_0.Page_FormStructure;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FormStructureSerDes {

	public static Page_FormStructure toDTO(String json) {
		Page_FormStructureJSONParser page_FormStructureJSONParser =
			new Page_FormStructureJSONParser();

		return page_FormStructureJSONParser.parseToDTO(json);
	}

	public static Page_FormStructure[] toDTOs(String json) {
		Page_FormStructureJSONParser page_FormStructureJSONParser =
			new Page_FormStructureJSONParser();

		return page_FormStructureJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_FormStructure page_FormStructure) {
		if (page_FormStructure == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_FormStructure.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_FormStructure.getItems().length; i++) {
				sb.append(
					FormStructureSerDes.toJSON(
						page_FormStructure.getItems()[i]));

				if ((i + 1) < page_FormStructure.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_FormStructure.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormStructure.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_FormStructure.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormStructure.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_FormStructure.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormStructure.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_FormStructure.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormStructure.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FormStructureJSONParser
		extends BaseJSONParser<Page_FormStructure> {

		protected Page_FormStructure createDTO() {
			return new Page_FormStructure();
		}

		protected Page_FormStructure[] createDTOArray(int size) {
			return new Page_FormStructure[size];
		}

		protected void setField(
			Page_FormStructure page_FormStructure, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_FormStructure.setItems(
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
					page_FormStructure.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_FormStructure.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_FormStructure.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_FormStructure.setTotalCount(
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