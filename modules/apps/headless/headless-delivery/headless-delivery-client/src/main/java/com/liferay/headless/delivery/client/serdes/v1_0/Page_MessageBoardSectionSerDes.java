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

import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardSection;
import com.liferay.headless.delivery.client.dto.v1_0.Page_MessageBoardSection;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_MessageBoardSectionSerDes {

	public static Page_MessageBoardSection toDTO(String json) {
		Page_MessageBoardSectionJSONParser page_MessageBoardSectionJSONParser =
			new Page_MessageBoardSectionJSONParser();

		return page_MessageBoardSectionJSONParser.parseToDTO(json);
	}

	public static Page_MessageBoardSection[] toDTOs(String json) {
		Page_MessageBoardSectionJSONParser page_MessageBoardSectionJSONParser =
			new Page_MessageBoardSectionJSONParser();

		return page_MessageBoardSectionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_MessageBoardSection page_MessageBoardSection) {

		if (page_MessageBoardSection == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_MessageBoardSection.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_MessageBoardSection.getItems().length;
				 i++) {

				sb.append(
					MessageBoardSectionSerDes.toJSON(
						page_MessageBoardSection.getItems()[i]));

				if ((i + 1) < page_MessageBoardSection.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_MessageBoardSection.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardSection.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_MessageBoardSection.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardSection.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_MessageBoardSection.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardSection.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_MessageBoardSection.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardSection.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_MessageBoardSectionJSONParser
		extends BaseJSONParser<Page_MessageBoardSection> {

		protected Page_MessageBoardSection createDTO() {
			return new Page_MessageBoardSection();
		}

		protected Page_MessageBoardSection[] createDTOArray(int size) {
			return new Page_MessageBoardSection[size];
		}

		protected void setField(
			Page_MessageBoardSection page_MessageBoardSection,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardSection.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> MessageBoardSectionSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new MessageBoardSection[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardSection.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardSection.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardSection.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardSection.setTotalCount(
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