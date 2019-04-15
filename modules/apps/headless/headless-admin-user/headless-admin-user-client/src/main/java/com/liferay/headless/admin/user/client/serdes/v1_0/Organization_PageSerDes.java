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
import com.liferay.headless.admin.user.client.dto.v1_0.Organization_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Organization_PageSerDes {

	public static Organization_Page toDTO(String json) {
		Organization_PageJSONParser organization_PageJSONParser =
			new Organization_PageJSONParser();

		return organization_PageJSONParser.parseToDTO(json);
	}

	public static Organization_Page[] toDTOs(String json) {
		Organization_PageJSONParser organization_PageJSONParser =
			new Organization_PageJSONParser();

		return organization_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Organization_Page organization_Page) {
		if (organization_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (organization_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < organization_Page.getItems().length; i++) {
				sb.append(
					OrganizationSerDes.toJSON(organization_Page.getItems()[i]));

				if ((i + 1) < organization_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (organization_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(organization_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (organization_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(organization_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (organization_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(organization_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (organization_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(organization_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Organization_PageJSONParser
		extends BaseJSONParser<Organization_Page> {

		protected Organization_Page createDTO() {
			return new Organization_Page();
		}

		protected Organization_Page[] createDTOArray(int size) {
			return new Organization_Page[size];
		}

		protected void setField(
			Organization_Page organization_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					organization_Page.setItems(
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
					organization_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					organization_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					organization_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					organization_Page.setTotalCount(
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