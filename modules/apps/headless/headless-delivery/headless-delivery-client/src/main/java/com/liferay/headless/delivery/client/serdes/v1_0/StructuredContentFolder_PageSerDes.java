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

package com.liferay.headless.delivery.client.serdes.v1_0;

import com.liferay.headless.delivery.client.dto.v1_0.StructuredContentFolder;
import com.liferay.headless.delivery.client.dto.v1_0.StructuredContentFolder_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class StructuredContentFolder_PageSerDes {

	public static StructuredContentFolder_Page toDTO(String json) {
		StructuredContentFolder_PageJSONParser
			structuredContentFolder_PageJSONParser =
				new StructuredContentFolder_PageJSONParser();

		return structuredContentFolder_PageJSONParser.parseToDTO(json);
	}

	public static StructuredContentFolder_Page[] toDTOs(String json) {
		StructuredContentFolder_PageJSONParser
			structuredContentFolder_PageJSONParser =
				new StructuredContentFolder_PageJSONParser();

		return structuredContentFolder_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		StructuredContentFolder_Page structuredContentFolder_Page) {

		if (structuredContentFolder_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (structuredContentFolder_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < structuredContentFolder_Page.getItems().length;
				 i++) {

				sb.append(
					StructuredContentFolderSerDes.toJSON(
						structuredContentFolder_Page.getItems()[i]));

				if ((i + 1) < structuredContentFolder_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (structuredContentFolder_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentFolder_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (structuredContentFolder_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentFolder_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (structuredContentFolder_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentFolder_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (structuredContentFolder_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentFolder_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class StructuredContentFolder_PageJSONParser
		extends BaseJSONParser<StructuredContentFolder_Page> {

		protected StructuredContentFolder_Page createDTO() {
			return new StructuredContentFolder_Page();
		}

		protected StructuredContentFolder_Page[] createDTOArray(int size) {
			return new StructuredContentFolder_Page[size];
		}

		protected void setField(
			StructuredContentFolder_Page structuredContentFolder_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					structuredContentFolder_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> StructuredContentFolderSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new StructuredContentFolder[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					structuredContentFolder_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					structuredContentFolder_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					structuredContentFolder_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					structuredContentFolder_Page.setTotalCount(
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