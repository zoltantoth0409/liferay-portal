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
import com.liferay.headless.delivery.client.dto.v1_0.Page_ContentStructure;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ContentStructureSerDes {

	public static Page_ContentStructure toDTO(String json) {
		Page_ContentStructureJSONParser page_ContentStructureJSONParser =
			new Page_ContentStructureJSONParser();

		return page_ContentStructureJSONParser.parseToDTO(json);
	}

	public static Page_ContentStructure[] toDTOs(String json) {
		Page_ContentStructureJSONParser page_ContentStructureJSONParser =
			new Page_ContentStructureJSONParser();

		return page_ContentStructureJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_ContentStructure page_ContentStructure) {
		if (page_ContentStructure == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ContentStructure.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ContentStructure.getItems().length; i++) {
				sb.append(
					ContentStructureSerDes.toJSON(
						page_ContentStructure.getItems()[i]));

				if ((i + 1) < page_ContentStructure.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ContentStructure.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructure.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ContentStructure.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructure.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ContentStructure.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructure.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ContentStructure.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentStructure.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ContentStructureJSONParser
		extends BaseJSONParser<Page_ContentStructure> {

		protected Page_ContentStructure createDTO() {
			return new Page_ContentStructure();
		}

		protected Page_ContentStructure[] createDTOArray(int size) {
			return new Page_ContentStructure[size];
		}

		protected void setField(
			Page_ContentStructure page_ContentStructure,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructure.setItems(
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
					page_ContentStructure.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructure.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructure.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ContentStructure.setTotalCount(
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