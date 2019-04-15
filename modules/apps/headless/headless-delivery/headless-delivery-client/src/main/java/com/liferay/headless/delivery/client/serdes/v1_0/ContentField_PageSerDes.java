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

import com.liferay.headless.delivery.client.dto.v1_0.ContentField;
import com.liferay.headless.delivery.client.dto.v1_0.ContentField_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentField_PageSerDes {

	public static ContentField_Page toDTO(String json) {
		ContentField_PageJSONParser contentField_PageJSONParser =
			new ContentField_PageJSONParser();

		return contentField_PageJSONParser.parseToDTO(json);
	}

	public static ContentField_Page[] toDTOs(String json) {
		ContentField_PageJSONParser contentField_PageJSONParser =
			new ContentField_PageJSONParser();

		return contentField_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ContentField_Page contentField_Page) {
		if (contentField_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (contentField_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contentField_Page.getItems().length; i++) {
				sb.append(
					ContentFieldSerDes.toJSON(contentField_Page.getItems()[i]));

				if ((i + 1) < contentField_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (contentField_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentField_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (contentField_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentField_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (contentField_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentField_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (contentField_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(contentField_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ContentField_PageJSONParser
		extends BaseJSONParser<ContentField_Page> {

		protected ContentField_Page createDTO() {
			return new ContentField_Page();
		}

		protected ContentField_Page[] createDTOArray(int size) {
			return new ContentField_Page[size];
		}

		protected void setField(
			ContentField_Page contentField_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					contentField_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentFieldSerDes.toDTO((String)object)
						).toArray(
							size -> new ContentField[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					contentField_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					contentField_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					contentField_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					contentField_Page.setTotalCount(
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