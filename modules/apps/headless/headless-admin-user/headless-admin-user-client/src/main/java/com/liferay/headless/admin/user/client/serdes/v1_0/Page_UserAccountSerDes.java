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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_UserAccount;
import com.liferay.headless.admin.user.client.dto.v1_0.UserAccount;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_UserAccountSerDes {

	public static Page_UserAccount toDTO(String json) {
		Page_UserAccountJSONParser page_UserAccountJSONParser =
			new Page_UserAccountJSONParser();

		return page_UserAccountJSONParser.parseToDTO(json);
	}

	public static Page_UserAccount[] toDTOs(String json) {
		Page_UserAccountJSONParser page_UserAccountJSONParser =
			new Page_UserAccountJSONParser();

		return page_UserAccountJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_UserAccount page_UserAccount) {
		if (page_UserAccount == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_UserAccount.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_UserAccount.getItems().length; i++) {
				sb.append(
					UserAccountSerDes.toJSON(page_UserAccount.getItems()[i]));

				if ((i + 1) < page_UserAccount.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_UserAccount.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_UserAccount.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_UserAccount.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_UserAccount.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_UserAccount.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_UserAccount.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_UserAccount.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_UserAccount.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_UserAccountJSONParser
		extends BaseJSONParser<Page_UserAccount> {

		protected Page_UserAccount createDTO() {
			return new Page_UserAccount();
		}

		protected Page_UserAccount[] createDTOArray(int size) {
			return new Page_UserAccount[size];
		}

		protected void setField(
			Page_UserAccount page_UserAccount, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_UserAccount.setItems(
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
					page_UserAccount.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_UserAccount.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_UserAccount.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_UserAccount.setTotalCount(
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