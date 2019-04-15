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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_Phone;
import com.liferay.headless.admin.user.client.dto.v1_0.Phone;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_PhoneSerDes {

	public static Page_Phone toDTO(String json) {
		Page_PhoneJSONParser page_PhoneJSONParser = new Page_PhoneJSONParser();

		return page_PhoneJSONParser.parseToDTO(json);
	}

	public static Page_Phone[] toDTOs(String json) {
		Page_PhoneJSONParser page_PhoneJSONParser = new Page_PhoneJSONParser();

		return page_PhoneJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Phone page_Phone) {
		if (page_Phone == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Phone.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Phone.getItems().length; i++) {
				sb.append(PhoneSerDes.toJSON(page_Phone.getItems()[i]));

				if ((i + 1) < page_Phone.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Phone.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Phone.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Phone.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Phone.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Phone.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Phone.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Phone.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Phone.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_PhoneJSONParser
		extends BaseJSONParser<Page_Phone> {

		protected Page_Phone createDTO() {
			return new Page_Phone();
		}

		protected Page_Phone[] createDTOArray(int size) {
			return new Page_Phone[size];
		}

		protected void setField(
			Page_Phone page_Phone, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Phone.setItems(
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
					page_Phone.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Phone.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Phone.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Phone.setTotalCount(
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