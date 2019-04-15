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

import com.liferay.headless.admin.user.client.dto.v1_0.Organization;
import com.liferay.headless.admin.user.client.dto.v1_0.Page_Organization;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_OrganizationSerDes {

	public static Page_Organization toDTO(String json) {
		Page_OrganizationJSONParser page_OrganizationJSONParser =
			new Page_OrganizationJSONParser();

		return page_OrganizationJSONParser.parseToDTO(json);
	}

	public static Page_Organization[] toDTOs(String json) {
		Page_OrganizationJSONParser page_OrganizationJSONParser =
			new Page_OrganizationJSONParser();

		return page_OrganizationJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Organization page_Organization) {
		if (page_Organization == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Organization.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Organization.getItems().length; i++) {
				sb.append(
					OrganizationSerDes.toJSON(page_Organization.getItems()[i]));

				if ((i + 1) < page_Organization.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Organization.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Organization.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Organization.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Organization.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Organization.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Organization.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Organization.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Organization.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_OrganizationJSONParser
		extends BaseJSONParser<Page_Organization> {

		protected Page_Organization createDTO() {
			return new Page_Organization();
		}

		protected Page_Organization[] createDTOArray(int size) {
			return new Page_Organization[size];
		}

		protected void setField(
			Page_Organization page_Organization, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Organization.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> OrganizationSerDes.toDTO((String)object)
						).toArray(
							size -> new Organization[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Organization.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Organization.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Organization.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Organization.setTotalCount(
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