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

import com.liferay.headless.admin.user.client.dto.v1_0.Segment;
import com.liferay.headless.admin.user.client.dto.v1_0.Segment_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Segment_PageSerDes {

	public static Segment_Page toDTO(String json) {
		Segment_PageJSONParser segment_PageJSONParser =
			new Segment_PageJSONParser();

		return segment_PageJSONParser.parseToDTO(json);
	}

	public static Segment_Page[] toDTOs(String json) {
		Segment_PageJSONParser segment_PageJSONParser =
			new Segment_PageJSONParser();

		return segment_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Segment_Page segment_Page) {
		if (segment_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (segment_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < segment_Page.getItems().length; i++) {
				sb.append(SegmentSerDes.toJSON(segment_Page.getItems()[i]));

				if ((i + 1) < segment_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (segment_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(segment_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (segment_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(segment_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (segment_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(segment_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (segment_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(segment_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Segment_PageJSONParser
		extends BaseJSONParser<Segment_Page> {

		protected Segment_Page createDTO() {
			return new Segment_Page();
		}

		protected Segment_Page[] createDTOArray(int size) {
			return new Segment_Page[size];
		}

		protected void setField(
			Segment_Page segment_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					segment_Page.setItems(
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
					segment_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					segment_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					segment_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					segment_Page.setTotalCount(
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