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

import com.liferay.headless.delivery.client.dto.v1_0.Creator;
import com.liferay.headless.delivery.client.dto.v1_0.Creator_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Creator_PageSerDes {

	public static Creator_Page toDTO(String json) {
		Creator_PageJSONParser creator_PageJSONParser =
			new Creator_PageJSONParser();

		return creator_PageJSONParser.parseToDTO(json);
	}

	public static Creator_Page[] toDTOs(String json) {
		Creator_PageJSONParser creator_PageJSONParser =
			new Creator_PageJSONParser();

		return creator_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Creator_Page creator_Page) {
		if (creator_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (creator_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < creator_Page.getItems().length; i++) {
				sb.append(CreatorSerDes.toJSON(creator_Page.getItems()[i]));

				if ((i + 1) < creator_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (creator_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(creator_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (creator_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(creator_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (creator_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(creator_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (creator_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(creator_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Creator_PageJSONParser
		extends BaseJSONParser<Creator_Page> {

		protected Creator_Page createDTO() {
			return new Creator_Page();
		}

		protected Creator_Page[] createDTOArray(int size) {
			return new Creator_Page[size];
		}

		protected void setField(
			Creator_Page creator_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					creator_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> CreatorSerDes.toDTO((String)object)
						).toArray(
							size -> new Creator[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					creator_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					creator_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					creator_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					creator_Page.setTotalCount(
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