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

import com.liferay.headless.delivery.client.dto.v1_0.StructuredContentLink;
import com.liferay.headless.delivery.client.dto.v1_0.StructuredContentLink_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class StructuredContentLink_PageSerDes {

	public static StructuredContentLink_Page toDTO(String json) {
		StructuredContentLink_PageJSONParser
			structuredContentLink_PageJSONParser =
				new StructuredContentLink_PageJSONParser();

		return structuredContentLink_PageJSONParser.parseToDTO(json);
	}

	public static StructuredContentLink_Page[] toDTOs(String json) {
		StructuredContentLink_PageJSONParser
			structuredContentLink_PageJSONParser =
				new StructuredContentLink_PageJSONParser();

		return structuredContentLink_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		StructuredContentLink_Page structuredContentLink_Page) {

		if (structuredContentLink_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (structuredContentLink_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < structuredContentLink_Page.getItems().length;
				 i++) {

				sb.append(
					StructuredContentLinkSerDes.toJSON(
						structuredContentLink_Page.getItems()[i]));

				if ((i + 1) < structuredContentLink_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (structuredContentLink_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentLink_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (structuredContentLink_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentLink_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (structuredContentLink_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentLink_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (structuredContentLink_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(structuredContentLink_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class StructuredContentLink_PageJSONParser
		extends BaseJSONParser<StructuredContentLink_Page> {

		protected StructuredContentLink_Page createDTO() {
			return new StructuredContentLink_Page();
		}

		protected StructuredContentLink_Page[] createDTOArray(int size) {
			return new StructuredContentLink_Page[size];
		}

		protected void setField(
			StructuredContentLink_Page structuredContentLink_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					structuredContentLink_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> StructuredContentLinkSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new StructuredContentLink[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					structuredContentLink_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					structuredContentLink_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					structuredContentLink_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					structuredContentLink_Page.setTotalCount(
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