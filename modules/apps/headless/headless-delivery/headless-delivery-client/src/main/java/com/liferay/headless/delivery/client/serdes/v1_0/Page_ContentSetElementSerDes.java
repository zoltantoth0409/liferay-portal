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

import com.liferay.headless.delivery.client.dto.v1_0.ContentSetElement;
import com.liferay.headless.delivery.client.dto.v1_0.Page_ContentSetElement;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ContentSetElementSerDes {

	public static Page_ContentSetElement toDTO(String json) {
		Page_ContentSetElementJSONParser page_ContentSetElementJSONParser =
			new Page_ContentSetElementJSONParser();

		return page_ContentSetElementJSONParser.parseToDTO(json);
	}

	public static Page_ContentSetElement[] toDTOs(String json) {
		Page_ContentSetElementJSONParser page_ContentSetElementJSONParser =
			new Page_ContentSetElementJSONParser();

		return page_ContentSetElementJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_ContentSetElement page_ContentSetElement) {
		if (page_ContentSetElement == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ContentSetElement.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ContentSetElement.getItems().length; i++) {
				sb.append(
					ContentSetElementSerDes.toJSON(
						page_ContentSetElement.getItems()[i]));

				if ((i + 1) < page_ContentSetElement.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ContentSetElement.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentSetElement.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ContentSetElement.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentSetElement.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ContentSetElement.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentSetElement.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ContentSetElement.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContentSetElement.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ContentSetElementJSONParser
		extends BaseJSONParser<Page_ContentSetElement> {

		protected Page_ContentSetElement createDTO() {
			return new Page_ContentSetElement();
		}

		protected Page_ContentSetElement[] createDTOArray(int size) {
			return new Page_ContentSetElement[size];
		}

		protected void setField(
			Page_ContentSetElement page_ContentSetElement,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ContentSetElement.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContentSetElementSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ContentSetElement[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ContentSetElement.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ContentSetElement.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ContentSetElement.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ContentSetElement.setTotalCount(
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