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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_Segment;
import com.liferay.headless.admin.user.client.dto.v1_0.Segment;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_SegmentSerDes {

	public static Page_Segment toDTO(String json) {
		Page_SegmentJSONParser page_SegmentJSONParser =
			new Page_SegmentJSONParser();

		return page_SegmentJSONParser.parseToDTO(json);
	}

	public static Page_Segment[] toDTOs(String json) {
		Page_SegmentJSONParser page_SegmentJSONParser =
			new Page_SegmentJSONParser();

		return page_SegmentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Segment page_Segment) {
		if (page_Segment == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Segment.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Segment.getItems().length; i++) {
				sb.append(SegmentSerDes.toJSON(page_Segment.getItems()[i]));

				if ((i + 1) < page_Segment.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Segment.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Segment.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Segment.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Segment.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Segment.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Segment.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Segment.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Segment.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_SegmentJSONParser
		extends BaseJSONParser<Page_Segment> {

		protected Page_Segment createDTO() {
			return new Page_Segment();
		}

		protected Page_Segment[] createDTOArray(int size) {
			return new Page_Segment[size];
		}

		protected void setField(
			Page_Segment page_Segment, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Segment.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> SegmentSerDes.toDTO((String)object)
						).toArray(
							size -> new Segment[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Segment.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Segment.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Segment.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Segment.setTotalCount(
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