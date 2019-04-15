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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_SiteBrief;
import com.liferay.headless.admin.user.client.dto.v1_0.SiteBrief;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_SiteBriefSerDes {

	public static Page_SiteBrief toDTO(String json) {
		Page_SiteBriefJSONParser page_SiteBriefJSONParser =
			new Page_SiteBriefJSONParser();

		return page_SiteBriefJSONParser.parseToDTO(json);
	}

	public static Page_SiteBrief[] toDTOs(String json) {
		Page_SiteBriefJSONParser page_SiteBriefJSONParser =
			new Page_SiteBriefJSONParser();

		return page_SiteBriefJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_SiteBrief page_SiteBrief) {
		if (page_SiteBrief == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_SiteBrief.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_SiteBrief.getItems().length; i++) {
				sb.append(SiteBriefSerDes.toJSON(page_SiteBrief.getItems()[i]));

				if ((i + 1) < page_SiteBrief.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_SiteBrief.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SiteBrief.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_SiteBrief.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SiteBrief.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_SiteBrief.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SiteBrief.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_SiteBrief.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SiteBrief.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_SiteBriefJSONParser
		extends BaseJSONParser<Page_SiteBrief> {

		protected Page_SiteBrief createDTO() {
			return new Page_SiteBrief();
		}

		protected Page_SiteBrief[] createDTOArray(int size) {
			return new Page_SiteBrief[size];
		}

		protected void setField(
			Page_SiteBrief page_SiteBrief, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_SiteBrief.setItems(
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
					page_SiteBrief.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_SiteBrief.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_SiteBrief.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_SiteBrief.setTotalCount(
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