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

import com.liferay.headless.admin.user.client.dto.v1_0.PostalAddress;
import com.liferay.headless.admin.user.client.dto.v1_0.PostalAddress_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class PostalAddress_PageSerDes {

	public static PostalAddress_Page toDTO(String json) {
		PostalAddress_PageJSONParser postalAddress_PageJSONParser =
			new PostalAddress_PageJSONParser();

		return postalAddress_PageJSONParser.parseToDTO(json);
	}

	public static PostalAddress_Page[] toDTOs(String json) {
		PostalAddress_PageJSONParser postalAddress_PageJSONParser =
			new PostalAddress_PageJSONParser();

		return postalAddress_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(PostalAddress_Page postalAddress_Page) {
		if (postalAddress_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (postalAddress_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < postalAddress_Page.getItems().length; i++) {
				sb.append(
					PostalAddressSerDes.toJSON(
						postalAddress_Page.getItems()[i]));

				if ((i + 1) < postalAddress_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (postalAddress_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(postalAddress_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (postalAddress_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(postalAddress_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (postalAddress_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(postalAddress_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (postalAddress_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(postalAddress_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class PostalAddress_PageJSONParser
		extends BaseJSONParser<PostalAddress_Page> {

		protected PostalAddress_Page createDTO() {
			return new PostalAddress_Page();
		}

		protected PostalAddress_Page[] createDTOArray(int size) {
			return new PostalAddress_Page[size];
		}

		protected void setField(
			PostalAddress_Page postalAddress_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					postalAddress_Page.setItems(
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
					postalAddress_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					postalAddress_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					postalAddress_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					postalAddress_Page.setTotalCount(
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