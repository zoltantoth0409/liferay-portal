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
import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardMessage_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class MessageBoardMessage_PageSerDes {

	public static MessageBoardMessage_Page toDTO(String json) {
		MessageBoardMessage_PageJSONParser messageBoardMessage_PageJSONParser =
			new MessageBoardMessage_PageJSONParser();

		return messageBoardMessage_PageJSONParser.parseToDTO(json);
	}

	public static MessageBoardMessage_Page[] toDTOs(String json) {
		MessageBoardMessage_PageJSONParser messageBoardMessage_PageJSONParser =
			new MessageBoardMessage_PageJSONParser();

		return messageBoardMessage_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		MessageBoardMessage_Page messageBoardMessage_Page) {

		if (messageBoardMessage_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (messageBoardMessage_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < messageBoardMessage_Page.getItems().length;
				 i++) {

				sb.append(
					MessageBoardMessageSerDes.toJSON(
						messageBoardMessage_Page.getItems()[i]));

				if ((i + 1) < messageBoardMessage_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (messageBoardMessage_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardMessage_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (messageBoardMessage_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardMessage_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (messageBoardMessage_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardMessage_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (messageBoardMessage_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardMessage_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class MessageBoardMessage_PageJSONParser
		extends BaseJSONParser<MessageBoardMessage_Page> {

		protected MessageBoardMessage_Page createDTO() {
			return new MessageBoardMessage_Page();
		}

		protected MessageBoardMessage_Page[] createDTOArray(int size) {
			return new MessageBoardMessage_Page[size];
		}

		protected void setField(
			MessageBoardMessage_Page messageBoardMessage_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage_Page.setItems(
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
					messageBoardMessage_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					messageBoardMessage_Page.setTotalCount(
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