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

import com.liferay.headless.admin.user.client.dto.v1_0.RoleBrief;
import com.liferay.headless.admin.user.client.dto.v1_0.RoleBrief_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class RoleBrief_PageSerDes {

	public static RoleBrief_Page toDTO(String json) {
		RoleBrief_PageJSONParser roleBrief_PageJSONParser =
			new RoleBrief_PageJSONParser();

		return roleBrief_PageJSONParser.parseToDTO(json);
	}

	public static RoleBrief_Page[] toDTOs(String json) {
		RoleBrief_PageJSONParser roleBrief_PageJSONParser =
			new RoleBrief_PageJSONParser();

		return roleBrief_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(RoleBrief_Page roleBrief_Page) {
		if (roleBrief_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (roleBrief_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < roleBrief_Page.getItems().length; i++) {
				sb.append(RoleBriefSerDes.toJSON(roleBrief_Page.getItems()[i]));

				if ((i + 1) < roleBrief_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (roleBrief_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(roleBrief_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (roleBrief_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(roleBrief_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (roleBrief_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(roleBrief_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (roleBrief_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(roleBrief_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class RoleBrief_PageJSONParser
		extends BaseJSONParser<RoleBrief_Page> {

		protected RoleBrief_Page createDTO() {
			return new RoleBrief_Page();
		}

		protected RoleBrief_Page[] createDTOArray(int size) {
			return new RoleBrief_Page[size];
		}

		protected void setField(
			RoleBrief_Page roleBrief_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					roleBrief_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> RoleBriefSerDes.toDTO((String)object)
						).toArray(
							size -> new RoleBrief[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					roleBrief_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					roleBrief_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					roleBrief_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					roleBrief_Page.setTotalCount(
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