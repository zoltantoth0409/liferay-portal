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

import com.liferay.headless.admin.user.client.dto.v1_0.Phone;
import com.liferay.headless.admin.user.client.dto.v1_0.Phone_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Phone_PageSerDes {

	public static Phone_Page toDTO(String json) {
		Phone_PageJSONParser phone_PageJSONParser = new Phone_PageJSONParser();

		return phone_PageJSONParser.parseToDTO(json);
	}

	public static Phone_Page[] toDTOs(String json) {
		Phone_PageJSONParser phone_PageJSONParser = new Phone_PageJSONParser();

		return phone_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Phone_Page phone_Page) {
		if (phone_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (phone_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < phone_Page.getItems().length; i++) {
				sb.append(PhoneSerDes.toJSON(phone_Page.getItems()[i]));

				if ((i + 1) < phone_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (phone_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(phone_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (phone_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(phone_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (phone_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(phone_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (phone_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(phone_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Phone_PageJSONParser
		extends BaseJSONParser<Phone_Page> {

		protected Phone_Page createDTO() {
			return new Phone_Page();
		}

		protected Phone_Page[] createDTOArray(int size) {
			return new Phone_Page[size];
		}

		protected void setField(
			Phone_Page phone_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					phone_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> PhoneSerDes.toDTO((String)object)
						).toArray(
							size -> new Phone[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					phone_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					phone_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					phone_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					phone_Page.setTotalCount(
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