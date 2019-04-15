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

import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardThread;
import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardThread_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class MessageBoardThread_PageSerDes {

	public static MessageBoardThread_Page toDTO(String json) {
		MessageBoardThread_PageJSONParser messageBoardThread_PageJSONParser =
			new MessageBoardThread_PageJSONParser();

		return messageBoardThread_PageJSONParser.parseToDTO(json);
	}

	public static MessageBoardThread_Page[] toDTOs(String json) {
		MessageBoardThread_PageJSONParser messageBoardThread_PageJSONParser =
			new MessageBoardThread_PageJSONParser();

		return messageBoardThread_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		MessageBoardThread_Page messageBoardThread_Page) {

		if (messageBoardThread_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (messageBoardThread_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < messageBoardThread_Page.getItems().length;
				 i++) {

				sb.append(
					MessageBoardThreadSerDes.toJSON(
						messageBoardThread_Page.getItems()[i]));

				if ((i + 1) < messageBoardThread_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (messageBoardThread_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardThread_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (messageBoardThread_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardThread_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (messageBoardThread_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardThread_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (messageBoardThread_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardThread_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class MessageBoardThread_PageJSONParser
		extends BaseJSONParser<MessageBoardThread_Page> {

		protected MessageBoardThread_Page createDTO() {
			return new MessageBoardThread_Page();
		}

		protected MessageBoardThread_Page[] createDTOArray(int size) {
			return new MessageBoardThread_Page[size];
		}

		protected void setField(
			MessageBoardThread_Page messageBoardThread_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					messageBoardThread_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> MessageBoardThreadSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new MessageBoardThread[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					messageBoardThread_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					messageBoardThread_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					messageBoardThread_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					messageBoardThread_Page.setTotalCount(
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