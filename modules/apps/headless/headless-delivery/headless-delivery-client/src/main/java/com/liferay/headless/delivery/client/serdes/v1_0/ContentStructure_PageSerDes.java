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

import com.liferay.headless.delivery.client.dto.v1_0.ContentStructure;
import com.liferay.headless.delivery.client.dto.v1_0.ContentStructure_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentStructure_PageSerDes {

	public static ContentStructure_Page toDTO(String json) {
		ContentStructure_PageJSONParser contentStructure_PageJSONParser =
			new ContentStructure_PageJSONParser();

		return contentStructure_PageJSONParser.parseToDTO(json);
	}

	public static ContentStructure_Page[] toDTOs(String json) {
		ContentStructure_PageJSONParser contentStructure_PageJSONParser =
			new ContentStructure_PageJSONParser();

		return contentStructure_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ContentStructure_Page contentStructure_Page) {
		if (contentStructure_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (contentStructure_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contentStructure_Page.getItems().length; i++) {
				sb.append(
					ContentStructureSerDes.toJSON(
						contentStructure_Page.getItems()[i]));

				if ((i + 1) < contentStructure_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (contentStructure_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructure_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (contentStructure_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructure_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (contentStructure_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructure_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (contentStructure_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentStructure_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ContentStructure_PageJSONParser
		extends BaseJSONParser<ContentStructure_Page> {

		protected ContentStructure_Page createDTO() {
			return new ContentStructure_Page();
		}

		protected ContentStructure_Page[] createDTOArray(int size) {
			return new ContentStructure_Page[size];
		}

		protected void setField(
			ContentStructure_Page contentStructure_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					contentStructure_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentStructureSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ContentStructure[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					contentStructure_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					contentStructure_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					contentStructure_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					contentStructure_Page.setTotalCount(
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