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

import com.liferay.headless.admin.user.client.dto.v1_0.OrganizationBrief;
import com.liferay.headless.admin.user.client.dto.v1_0.OrganizationBrief_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class OrganizationBrief_PageSerDes {

	public static OrganizationBrief_Page toDTO(String json) {
		OrganizationBrief_PageJSONParser organizationBrief_PageJSONParser =
			new OrganizationBrief_PageJSONParser();

		return organizationBrief_PageJSONParser.parseToDTO(json);
	}

	public static OrganizationBrief_Page[] toDTOs(String json) {
		OrganizationBrief_PageJSONParser organizationBrief_PageJSONParser =
			new OrganizationBrief_PageJSONParser();

		return organizationBrief_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(OrganizationBrief_Page organizationBrief_Page) {
		if (organizationBrief_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (organizationBrief_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < organizationBrief_Page.getItems().length; i++) {
				sb.append(
					OrganizationBriefSerDes.toJSON(
						organizationBrief_Page.getItems()[i]));

				if ((i + 1) < organizationBrief_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (organizationBrief_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(organizationBrief_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (organizationBrief_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(organizationBrief_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (organizationBrief_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(organizationBrief_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (organizationBrief_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(organizationBrief_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class OrganizationBrief_PageJSONParser
		extends BaseJSONParser<OrganizationBrief_Page> {

		protected OrganizationBrief_Page createDTO() {
			return new OrganizationBrief_Page();
		}

		protected OrganizationBrief_Page[] createDTOArray(int size) {
			return new OrganizationBrief_Page[size];
		}

		protected void setField(
			OrganizationBrief_Page organizationBrief_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					organizationBrief_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> OrganizationBriefSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new OrganizationBrief[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					organizationBrief_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					organizationBrief_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					organizationBrief_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					organizationBrief_Page.setTotalCount(
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