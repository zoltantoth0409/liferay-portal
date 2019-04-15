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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_SegmentUser;
import com.liferay.headless.admin.user.client.dto.v1_0.SegmentUser;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_SegmentUserSerDes {

	public static Page_SegmentUser toDTO(String json) {
		Page_SegmentUserJSONParser page_SegmentUserJSONParser =
			new Page_SegmentUserJSONParser();

		return page_SegmentUserJSONParser.parseToDTO(json);
	}

	public static Page_SegmentUser[] toDTOs(String json) {
		Page_SegmentUserJSONParser page_SegmentUserJSONParser =
			new Page_SegmentUserJSONParser();

		return page_SegmentUserJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_SegmentUser page_SegmentUser) {
		if (page_SegmentUser == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_SegmentUser.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_SegmentUser.getItems().length; i++) {
				sb.append(
					SegmentUserSerDes.toJSON(page_SegmentUser.getItems()[i]));

				if ((i + 1) < page_SegmentUser.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_SegmentUser.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SegmentUser.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_SegmentUser.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SegmentUser.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_SegmentUser.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SegmentUser.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_SegmentUser.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_SegmentUser.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_SegmentUserJSONParser
		extends BaseJSONParser<Page_SegmentUser> {

		protected Page_SegmentUser createDTO() {
			return new Page_SegmentUser();
		}

		protected Page_SegmentUser[] createDTOArray(int size) {
			return new Page_SegmentUser[size];
		}

		protected void setField(
			Page_SegmentUser page_SegmentUser, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_SegmentUser.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> SegmentUserSerDes.toDTO((String)object)
						).toArray(
							size -> new SegmentUser[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_SegmentUser.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_SegmentUser.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_SegmentUser.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_SegmentUser.setTotalCount(
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