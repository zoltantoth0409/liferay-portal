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

import com.liferay.headless.admin.user.client.dto.v1_0.SiteBrief;
import com.liferay.headless.admin.user.client.dto.v1_0.SiteBrief_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class SiteBrief_PageSerDes {

	public static SiteBrief_Page toDTO(String json) {
		SiteBrief_PageJSONParser siteBrief_PageJSONParser =
			new SiteBrief_PageJSONParser();

		return siteBrief_PageJSONParser.parseToDTO(json);
	}

	public static SiteBrief_Page[] toDTOs(String json) {
		SiteBrief_PageJSONParser siteBrief_PageJSONParser =
			new SiteBrief_PageJSONParser();

		return siteBrief_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(SiteBrief_Page siteBrief_Page) {
		if (siteBrief_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (siteBrief_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < siteBrief_Page.getItems().length; i++) {
				sb.append(SiteBriefSerDes.toJSON(siteBrief_Page.getItems()[i]));

				if ((i + 1) < siteBrief_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (siteBrief_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(siteBrief_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (siteBrief_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(siteBrief_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (siteBrief_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(siteBrief_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (siteBrief_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(siteBrief_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class SiteBrief_PageJSONParser
		extends BaseJSONParser<SiteBrief_Page> {

		protected SiteBrief_Page createDTO() {
			return new SiteBrief_Page();
		}

		protected SiteBrief_Page[] createDTOArray(int size) {
			return new SiteBrief_Page[size];
		}

		protected void setField(
			SiteBrief_Page siteBrief_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					siteBrief_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> SiteBriefSerDes.toDTO((String)object)
						).toArray(
							size -> new SiteBrief[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					siteBrief_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					siteBrief_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					siteBrief_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					siteBrief_Page.setTotalCount(
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