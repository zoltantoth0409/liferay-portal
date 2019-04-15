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

import com.liferay.headless.admin.user.client.dto.v1_0.SegmentUser;
import com.liferay.headless.admin.user.client.dto.v1_0.SegmentUser_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class SegmentUser_PageSerDes {

	public static SegmentUser_Page toDTO(String json) {
		SegmentUser_PageJSONParser segmentUser_PageJSONParser =
			new SegmentUser_PageJSONParser();

		return segmentUser_PageJSONParser.parseToDTO(json);
	}

	public static SegmentUser_Page[] toDTOs(String json) {
		SegmentUser_PageJSONParser segmentUser_PageJSONParser =
			new SegmentUser_PageJSONParser();

		return segmentUser_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(SegmentUser_Page segmentUser_Page) {
		if (segmentUser_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (segmentUser_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < segmentUser_Page.getItems().length; i++) {
				sb.append(
					SegmentUserSerDes.toJSON(segmentUser_Page.getItems()[i]));

				if ((i + 1) < segmentUser_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (segmentUser_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(segmentUser_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (segmentUser_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(segmentUser_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (segmentUser_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(segmentUser_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (segmentUser_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(segmentUser_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class SegmentUser_PageJSONParser
		extends BaseJSONParser<SegmentUser_Page> {

		protected SegmentUser_Page createDTO() {
			return new SegmentUser_Page();
		}

		protected SegmentUser_Page[] createDTOArray(int size) {
			return new SegmentUser_Page[size];
		}

		protected void setField(
			SegmentUser_Page segmentUser_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					segmentUser_Page.setItems(
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
					segmentUser_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					segmentUser_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					segmentUser_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					segmentUser_Page.setTotalCount(
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