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
import com.liferay.headless.admin.user.client.dto.v1_0.Page_OrganizationBrief;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_OrganizationBriefSerDes {

	public static Page_OrganizationBrief toDTO(String json) {
		Page_OrganizationBriefJSONParser page_OrganizationBriefJSONParser =
			new Page_OrganizationBriefJSONParser();

		return page_OrganizationBriefJSONParser.parseToDTO(json);
	}

	public static Page_OrganizationBrief[] toDTOs(String json) {
		Page_OrganizationBriefJSONParser page_OrganizationBriefJSONParser =
			new Page_OrganizationBriefJSONParser();

		return page_OrganizationBriefJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_OrganizationBrief page_OrganizationBrief) {
		if (page_OrganizationBrief == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_OrganizationBrief.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_OrganizationBrief.getItems().length; i++) {
				sb.append(
					OrganizationBriefSerDes.toJSON(
						page_OrganizationBrief.getItems()[i]));

				if ((i + 1) < page_OrganizationBrief.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_OrganizationBrief.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_OrganizationBrief.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_OrganizationBrief.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_OrganizationBrief.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_OrganizationBrief.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_OrganizationBrief.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_OrganizationBrief.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_OrganizationBrief.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_OrganizationBriefJSONParser
		extends BaseJSONParser<Page_OrganizationBrief> {

		protected Page_OrganizationBrief createDTO() {
			return new Page_OrganizationBrief();
		}

		protected Page_OrganizationBrief[] createDTOArray(int size) {
			return new Page_OrganizationBrief[size];
		}

		protected void setField(
			Page_OrganizationBrief page_OrganizationBrief,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_OrganizationBrief.setItems(
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
					page_OrganizationBrief.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_OrganizationBrief.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_OrganizationBrief.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_OrganizationBrief.setTotalCount(
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