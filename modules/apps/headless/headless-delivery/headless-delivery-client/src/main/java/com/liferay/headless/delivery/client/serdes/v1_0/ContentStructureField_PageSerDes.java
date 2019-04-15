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

import com.liferay.headless.delivery.client.dto.v1_0.ContentStructureField;
import com.liferay.headless.delivery.client.dto.v1_0.ContentStructureField_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentStructureField_PageSerDes {

	public static ContentStructureField_Page toDTO(String json) {
		ContentStructureField_PageJSONParser
			contentStructureField_PageJSONParser =
				new ContentStructureField_PageJSONParser();

		return contentStructureField_PageJSONParser.parseToDTO(json);
	}

	public static ContentStructureField_Page[] toDTOs(String json) {
		ContentStructureField_PageJSONParser
			contentStructureField_PageJSONParser =
				new ContentStructureField_PageJSONParser();

		return contentStructureField_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		ContentStructureField_Page contentStructureField_Page) {

		if (contentStructureField_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (contentStructureField_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contentStructureField_Page.getItems().length;
				 i++) {

				sb.append(
					ContentStructureFieldSerDes.toJSON(
						contentStructureField_Page.getItems()[i]));

				if ((i + 1) < contentStructureField_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (contentStructureField_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructureField_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (contentStructureField_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructureField_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (contentStructureField_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructureField_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (contentStructureField_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructureField_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ContentStructureField_PageJSONParser
		extends BaseJSONParser<ContentStructureField_Page> {

		protected ContentStructureField_Page createDTO() {
			return new ContentStructureField_Page();
		}

		protected ContentStructureField_Page[] createDTOArray(int size) {
			return new ContentStructureField_Page[size];
		}

		protected void setField(
			ContentStructureField_Page contentStructureField_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					contentStructureField_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentStructureFieldSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ContentStructureField[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					contentStructureField_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					contentStructureField_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					contentStructureField_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					contentStructureField_Page.setTotalCount(
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