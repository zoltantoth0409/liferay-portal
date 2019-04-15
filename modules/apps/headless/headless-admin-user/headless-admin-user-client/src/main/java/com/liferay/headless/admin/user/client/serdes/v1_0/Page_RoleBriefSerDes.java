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

package com.liferay.headless.admin.user.client.serdes.v1_0;

import com.liferay.headless.admin.user.client.dto.v1_0.Page_RoleBrief;
import com.liferay.headless.admin.user.client.dto.v1_0.RoleBrief;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_RoleBriefSerDes {

	public static Page_RoleBrief toDTO(String json) {
		Page_RoleBriefJSONParser page_RoleBriefJSONParser =
			new Page_RoleBriefJSONParser();

		return page_RoleBriefJSONParser.parseToDTO(json);
	}

	public static Page_RoleBrief[] toDTOs(String json) {
		Page_RoleBriefJSONParser page_RoleBriefJSONParser =
			new Page_RoleBriefJSONParser();

		return page_RoleBriefJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_RoleBrief page_RoleBrief) {
		if (page_RoleBrief == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_RoleBrief.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_RoleBrief.getItems().length; i++) {
				sb.append(RoleBriefSerDes.toJSON(page_RoleBrief.getItems()[i]));

				if ((i + 1) < page_RoleBrief.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_RoleBrief.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RoleBrief.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_RoleBrief.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RoleBrief.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_RoleBrief.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RoleBrief.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_RoleBrief.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RoleBrief.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_RoleBriefJSONParser
		extends BaseJSONParser<Page_RoleBrief> {

		protected Page_RoleBrief createDTO() {
			return new Page_RoleBrief();
		}

		protected Page_RoleBrief[] createDTOArray(int size) {
			return new Page_RoleBrief[size];
		}

		protected void setField(
			Page_RoleBrief page_RoleBrief, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_RoleBrief.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> RoleBriefSerDes.toDTO((String)object)
						).toArray(
							size -> new RoleBrief[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_RoleBrief.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_RoleBrief.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_RoleBrief.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_RoleBrief.setTotalCount(
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