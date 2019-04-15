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

import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardMessage;
import com.liferay.headless.delivery.client.dto.v1_0.Page_MessageBoardMessage;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_MessageBoardMessageSerDes {

	public static Page_MessageBoardMessage toDTO(String json) {
		Page_MessageBoardMessageJSONParser page_MessageBoardMessageJSONParser =
			new Page_MessageBoardMessageJSONParser();

		return page_MessageBoardMessageJSONParser.parseToDTO(json);
	}

	public static Page_MessageBoardMessage[] toDTOs(String json) {
		Page_MessageBoardMessageJSONParser page_MessageBoardMessageJSONParser =
			new Page_MessageBoardMessageJSONParser();

		return page_MessageBoardMessageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_MessageBoardMessage page_MessageBoardMessage) {

		if (page_MessageBoardMessage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_MessageBoardMessage.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_MessageBoardMessage.getItems().length;
				 i++) {

				sb.append(
					MessageBoardMessageSerDes.toJSON(
						page_MessageBoardMessage.getItems()[i]));

				if ((i + 1) < page_MessageBoardMessage.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_MessageBoardMessage.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardMessage.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_MessageBoardMessage.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardMessage.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_MessageBoardMessage.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardMessage.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_MessageBoardMessage.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardMessage.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_MessageBoardMessageJSONParser
		extends BaseJSONParser<Page_MessageBoardMessage> {

		protected Page_MessageBoardMessage createDTO() {
			return new Page_MessageBoardMessage();
		}

		protected Page_MessageBoardMessage[] createDTOArray(int size) {
			return new Page_MessageBoardMessage[size];
		}

		protected void setField(
			Page_MessageBoardMessage page_MessageBoardMessage,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardMessage.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> MessageBoardMessageSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new MessageBoardMessage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardMessage.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardMessage.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardMessage.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardMessage.setTotalCount(
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