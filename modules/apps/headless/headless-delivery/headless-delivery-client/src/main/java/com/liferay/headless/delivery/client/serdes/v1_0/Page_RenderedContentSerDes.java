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

import com.liferay.headless.delivery.client.dto.v1_0.Page_RenderedContent;
import com.liferay.headless.delivery.client.dto.v1_0.RenderedContent;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_RenderedContentSerDes {

	public static Page_RenderedContent toDTO(String json) {
		Page_RenderedContentJSONParser page_RenderedContentJSONParser =
			new Page_RenderedContentJSONParser();

		return page_RenderedContentJSONParser.parseToDTO(json);
	}

	public static Page_RenderedContent[] toDTOs(String json) {
		Page_RenderedContentJSONParser page_RenderedContentJSONParser =
			new Page_RenderedContentJSONParser();

		return page_RenderedContentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_RenderedContent page_RenderedContent) {
		if (page_RenderedContent == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_RenderedContent.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_RenderedContent.getItems().length; i++) {
				sb.append(
					RenderedContentSerDes.toJSON(
						page_RenderedContent.getItems()[i]));

				if ((i + 1) < page_RenderedContent.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_RenderedContent.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RenderedContent.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_RenderedContent.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RenderedContent.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_RenderedContent.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RenderedContent.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_RenderedContent.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_RenderedContent.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_RenderedContentJSONParser
		extends BaseJSONParser<Page_RenderedContent> {

		protected Page_RenderedContent createDTO() {
			return new Page_RenderedContent();
		}

		protected Page_RenderedContent[] createDTOArray(int size) {
			return new Page_RenderedContent[size];
		}

		protected void setField(
			Page_RenderedContent page_RenderedContent,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_RenderedContent.setItems(
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
					page_RenderedContent.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_RenderedContent.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_RenderedContent.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_RenderedContent.setTotalCount(
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