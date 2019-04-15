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
import com.liferay.headless.admin.user.client.dto.v1_0.Page_Email;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_EmailSerDes {

	public static Page_Email toDTO(String json) {
		Page_EmailJSONParser page_EmailJSONParser = new Page_EmailJSONParser();

		return page_EmailJSONParser.parseToDTO(json);
	}

	public static Page_Email[] toDTOs(String json) {
		Page_EmailJSONParser page_EmailJSONParser = new Page_EmailJSONParser();

		return page_EmailJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Email page_Email) {
		if (page_Email == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Email.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Email.getItems().length; i++) {
				sb.append(EmailSerDes.toJSON(page_Email.getItems()[i]));

				if ((i + 1) < page_Email.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Email.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Email.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Email.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Email.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Email.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Email.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Email.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Email.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_EmailJSONParser
		extends BaseJSONParser<Page_Email> {

		protected Page_Email createDTO() {
			return new Page_Email();
		}

		protected Page_Email[] createDTOArray(int size) {
			return new Page_Email[size];
		}

		protected void setField(
			Page_Email page_Email, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Email.setItems(
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
					page_Email.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Email.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Email.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Email.setTotalCount(
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