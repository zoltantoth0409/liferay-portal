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

package com.liferay.headless.delivery.client.serdes.v1_0;

import com.liferay.headless.delivery.client.dto.v1_0.Page_StructuredContentLink;
import com.liferay.headless.delivery.client.dto.v1_0.StructuredContentLink;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_StructuredContentLinkSerDes {

	public static Page_StructuredContentLink toDTO(String json) {
		Page_StructuredContentLinkJSONParser
			page_StructuredContentLinkJSONParser =
				new Page_StructuredContentLinkJSONParser();

		return page_StructuredContentLinkJSONParser.parseToDTO(json);
	}

	public static Page_StructuredContentLink[] toDTOs(String json) {
		Page_StructuredContentLinkJSONParser
			page_StructuredContentLinkJSONParser =
				new Page_StructuredContentLinkJSONParser();

		return page_StructuredContentLinkJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_StructuredContentLink page_StructuredContentLink) {

		if (page_StructuredContentLink == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_StructuredContentLink.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_StructuredContentLink.getItems().length;
				 i++) {

				sb.append(
					StructuredContentLinkSerDes.toJSON(
						page_StructuredContentLink.getItems()[i]));

				if ((i + 1) < page_StructuredContentLink.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_StructuredContentLink.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContentLink.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_StructuredContentLink.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContentLink.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_StructuredContentLink.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContentLink.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_StructuredContentLink.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_StructuredContentLink.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_StructuredContentLinkJSONParser
		extends BaseJSONParser<Page_StructuredContentLink> {

		protected Page_StructuredContentLink createDTO() {
			return new Page_StructuredContentLink();
		}

		protected Page_StructuredContentLink[] createDTOArray(int size) {
			return new Page_StructuredContentLink[size];
		}

		protected void setField(
			Page_StructuredContentLink page_StructuredContentLink,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContentLink.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> StructuredContentLinkSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new StructuredContentLink[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContentLink.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContentLink.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContentLink.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_StructuredContentLink.setTotalCount(
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