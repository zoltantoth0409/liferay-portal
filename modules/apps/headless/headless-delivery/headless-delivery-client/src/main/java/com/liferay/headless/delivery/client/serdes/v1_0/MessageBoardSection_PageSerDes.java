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

import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardSection;
import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardSection_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class MessageBoardSection_PageSerDes {

	public static MessageBoardSection_Page toDTO(String json) {
		MessageBoardSection_PageJSONParser messageBoardSection_PageJSONParser =
			new MessageBoardSection_PageJSONParser();

		return messageBoardSection_PageJSONParser.parseToDTO(json);
	}

	public static MessageBoardSection_Page[] toDTOs(String json) {
		MessageBoardSection_PageJSONParser messageBoardSection_PageJSONParser =
			new MessageBoardSection_PageJSONParser();

		return messageBoardSection_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		MessageBoardSection_Page messageBoardSection_Page) {

		if (messageBoardSection_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (messageBoardSection_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < messageBoardSection_Page.getItems().length;
				 i++) {

				sb.append(
					MessageBoardSectionSerDes.toJSON(
						messageBoardSection_Page.getItems()[i]));

				if ((i + 1) < messageBoardSection_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (messageBoardSection_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardSection_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (messageBoardSection_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardSection_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (messageBoardSection_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardSection_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (messageBoardSection_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardSection_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class MessageBoardSection_PageJSONParser
		extends BaseJSONParser<MessageBoardSection_Page> {

		protected MessageBoardSection_Page createDTO() {
			return new MessageBoardSection_Page();
		}

		protected MessageBoardSection_Page[] createDTOArray(int size) {
			return new MessageBoardSection_Page[size];
		}

		protected void setField(
			MessageBoardSection_Page messageBoardSection_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					messageBoardSection_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> MessageBoardSectionSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new MessageBoardSection[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					messageBoardSection_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					messageBoardSection_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					messageBoardSection_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					messageBoardSection_Page.setTotalCount(
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