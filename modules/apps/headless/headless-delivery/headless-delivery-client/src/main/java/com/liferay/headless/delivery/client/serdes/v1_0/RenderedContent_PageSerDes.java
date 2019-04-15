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

import com.liferay.headless.delivery.client.dto.v1_0.RenderedContent;
import com.liferay.headless.delivery.client.dto.v1_0.RenderedContent_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class RenderedContent_PageSerDes {

	public static RenderedContent_Page toDTO(String json) {
		RenderedContent_PageJSONParser renderedContent_PageJSONParser =
			new RenderedContent_PageJSONParser();

		return renderedContent_PageJSONParser.parseToDTO(json);
	}

	public static RenderedContent_Page[] toDTOs(String json) {
		RenderedContent_PageJSONParser renderedContent_PageJSONParser =
			new RenderedContent_PageJSONParser();

		return renderedContent_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(RenderedContent_Page renderedContent_Page) {
		if (renderedContent_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (renderedContent_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < renderedContent_Page.getItems().length; i++) {
				sb.append(
					RenderedContentSerDes.toJSON(
						renderedContent_Page.getItems()[i]));

				if ((i + 1) < renderedContent_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (renderedContent_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(renderedContent_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (renderedContent_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(renderedContent_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (renderedContent_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(renderedContent_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (renderedContent_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(renderedContent_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class RenderedContent_PageJSONParser
		extends BaseJSONParser<RenderedContent_Page> {

		protected RenderedContent_Page createDTO() {
			return new RenderedContent_Page();
		}

		protected RenderedContent_Page[] createDTOArray(int size) {
			return new RenderedContent_Page[size];
		}

		protected void setField(
			RenderedContent_Page renderedContent_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					renderedContent_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> RenderedContentSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new RenderedContent[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					renderedContent_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					renderedContent_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					renderedContent_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					renderedContent_Page.setTotalCount(
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