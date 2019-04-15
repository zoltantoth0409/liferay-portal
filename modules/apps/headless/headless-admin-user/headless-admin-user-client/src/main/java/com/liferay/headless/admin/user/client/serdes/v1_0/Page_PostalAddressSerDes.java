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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_PostalAddress;
import com.liferay.headless.admin.user.client.dto.v1_0.PostalAddress;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_PostalAddressSerDes {

	public static Page_PostalAddress toDTO(String json) {
		Page_PostalAddressJSONParser page_PostalAddressJSONParser =
			new Page_PostalAddressJSONParser();

		return page_PostalAddressJSONParser.parseToDTO(json);
	}

	public static Page_PostalAddress[] toDTOs(String json) {
		Page_PostalAddressJSONParser page_PostalAddressJSONParser =
			new Page_PostalAddressJSONParser();

		return page_PostalAddressJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_PostalAddress page_PostalAddress) {
		if (page_PostalAddress == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_PostalAddress.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_PostalAddress.getItems().length; i++) {
				sb.append(
					PostalAddressSerDes.toJSON(
						page_PostalAddress.getItems()[i]));

				if ((i + 1) < page_PostalAddress.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_PostalAddress.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_PostalAddress.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_PostalAddress.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_PostalAddress.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_PostalAddress.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_PostalAddress.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_PostalAddress.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_PostalAddress.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_PostalAddressJSONParser
		extends BaseJSONParser<Page_PostalAddress> {

		protected Page_PostalAddress createDTO() {
			return new Page_PostalAddress();
		}

		protected Page_PostalAddress[] createDTOArray(int size) {
			return new Page_PostalAddress[size];
		}

		protected void setField(
			Page_PostalAddress page_PostalAddress, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_PostalAddress.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> PostalAddressSerDes.toDTO((String)object)
						).toArray(
							size -> new PostalAddress[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_PostalAddress.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_PostalAddress.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_PostalAddress.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_PostalAddress.setTotalCount(
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