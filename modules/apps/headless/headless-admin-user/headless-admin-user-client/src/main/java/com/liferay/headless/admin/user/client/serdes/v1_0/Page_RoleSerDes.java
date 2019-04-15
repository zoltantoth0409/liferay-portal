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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_Role;
import com.liferay.headless.admin.user.client.dto.v1_0.Role;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_RoleSerDes {

	public static Page_Role toDTO(String json) {
		Page_RoleJSONParser page_RoleJSONParser = new Page_RoleJSONParser();

		return page_RoleJSONParser.parseToDTO(json);
	}

	public static Page_Role[] toDTOs(String json) {
		Page_RoleJSONParser page_RoleJSONParser = new Page_RoleJSONParser();

		return page_RoleJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Role page_Role) {
		if (page_Role == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Role.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Role.getItems().length; i++) {
				sb.append(RoleSerDes.toJSON(page_Role.getItems()[i]));

				if ((i + 1) < page_Role.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Role.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Role.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Role.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Role.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Role.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Role.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Role.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Role.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_RoleJSONParser extends BaseJSONParser<Page_Role> {

		protected Page_Role createDTO() {
			return new Page_Role();
		}

		protected Page_Role[] createDTOArray(int size) {
			return new Page_Role[size];
		}

		protected void setField(
			Page_Role page_Role, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Role.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> RoleSerDes.toDTO((String)object)
						).toArray(
							size -> new Role[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Role.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Role.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Role.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Role.setTotalCount(
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