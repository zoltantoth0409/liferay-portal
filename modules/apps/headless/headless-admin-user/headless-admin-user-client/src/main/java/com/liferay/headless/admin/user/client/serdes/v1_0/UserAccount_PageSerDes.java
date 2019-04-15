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

import com.liferay.headless.admin.user.client.dto.v1_0.UserAccount;
import com.liferay.headless.admin.user.client.dto.v1_0.UserAccount_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class UserAccount_PageSerDes {

	public static UserAccount_Page toDTO(String json) {
		UserAccount_PageJSONParser userAccount_PageJSONParser =
			new UserAccount_PageJSONParser();

		return userAccount_PageJSONParser.parseToDTO(json);
	}

	public static UserAccount_Page[] toDTOs(String json) {
		UserAccount_PageJSONParser userAccount_PageJSONParser =
			new UserAccount_PageJSONParser();

		return userAccount_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(UserAccount_Page userAccount_Page) {
		if (userAccount_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (userAccount_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < userAccount_Page.getItems().length; i++) {
				sb.append(
					UserAccountSerDes.toJSON(userAccount_Page.getItems()[i]));

				if ((i + 1) < userAccount_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (userAccount_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(userAccount_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (userAccount_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(userAccount_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (userAccount_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(userAccount_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (userAccount_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(userAccount_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class UserAccount_PageJSONParser
		extends BaseJSONParser<UserAccount_Page> {

		protected UserAccount_Page createDTO() {
			return new UserAccount_Page();
		}

		protected UserAccount_Page[] createDTOArray(int size) {
			return new UserAccount_Page[size];
		}

		protected void setField(
			UserAccount_Page userAccount_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					userAccount_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> UserAccountSerDes.toDTO((String)object)
						).toArray(
							size -> new UserAccount[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					userAccount_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					userAccount_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					userAccount_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					userAccount_Page.setTotalCount(
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