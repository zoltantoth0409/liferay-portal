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

import com.liferay.headless.admin.user.client.dto.v1_0.Email;
import com.liferay.headless.admin.user.client.dto.v1_0.Email_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Email_PageSerDes {

	public static Email_Page toDTO(String json) {
		Email_PageJSONParser email_PageJSONParser = new Email_PageJSONParser();

		return email_PageJSONParser.parseToDTO(json);
	}

	public static Email_Page[] toDTOs(String json) {
		Email_PageJSONParser email_PageJSONParser = new Email_PageJSONParser();

		return email_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Email_Page email_Page) {
		if (email_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (email_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < email_Page.getItems().length; i++) {
				sb.append(EmailSerDes.toJSON(email_Page.getItems()[i]));

				if ((i + 1) < email_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (email_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(email_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (email_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(email_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (email_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(email_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (email_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(email_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Email_PageJSONParser
		extends BaseJSONParser<Email_Page> {

		protected Email_Page createDTO() {
			return new Email_Page();
		}

		protected Email_Page[] createDTOArray(int size) {
			return new Email_Page[size];
		}

		protected void setField(
			Email_Page email_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					email_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> EmailSerDes.toDTO((String)object)
						).toArray(
							size -> new Email[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					email_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					email_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					email_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					email_Page.setTotalCount(
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