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

import com.liferay.headless.admin.user.client.dto.v1_0.Role;
import com.liferay.headless.admin.user.client.dto.v1_0.Role_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Role_PageSerDes {

	public static Role_Page toDTO(String json) {
		Role_PageJSONParser role_PageJSONParser = new Role_PageJSONParser();

		return role_PageJSONParser.parseToDTO(json);
	}

	public static Role_Page[] toDTOs(String json) {
		Role_PageJSONParser role_PageJSONParser = new Role_PageJSONParser();

		return role_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Role_Page role_Page) {
		if (role_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (role_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < role_Page.getItems().length; i++) {
				sb.append(RoleSerDes.toJSON(role_Page.getItems()[i]));

				if ((i + 1) < role_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (role_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(role_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (role_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(role_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (role_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(role_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (role_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(role_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Role_PageJSONParser extends BaseJSONParser<Role_Page> {

		protected Role_Page createDTO() {
			return new Role_Page();
		}

		protected Role_Page[] createDTOArray(int size) {
			return new Role_Page[size];
		}

		protected void setField(
			Role_Page role_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					role_Page.setItems(
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
					role_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					role_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					role_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					role_Page.setTotalCount(
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