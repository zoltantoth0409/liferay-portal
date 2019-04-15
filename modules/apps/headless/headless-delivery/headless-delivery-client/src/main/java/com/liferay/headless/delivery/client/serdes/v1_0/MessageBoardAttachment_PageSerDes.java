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

import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardAttachment;
import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardAttachment_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class MessageBoardAttachment_PageSerDes {

	public static MessageBoardAttachment_Page toDTO(String json) {
		MessageBoardAttachment_PageJSONParser
			messageBoardAttachment_PageJSONParser =
				new MessageBoardAttachment_PageJSONParser();

		return messageBoardAttachment_PageJSONParser.parseToDTO(json);
	}

	public static MessageBoardAttachment_Page[] toDTOs(String json) {
		MessageBoardAttachment_PageJSONParser
			messageBoardAttachment_PageJSONParser =
				new MessageBoardAttachment_PageJSONParser();

		return messageBoardAttachment_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		MessageBoardAttachment_Page messageBoardAttachment_Page) {

		if (messageBoardAttachment_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (messageBoardAttachment_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < messageBoardAttachment_Page.getItems().length;
				 i++) {

				sb.append(
					MessageBoardAttachmentSerDes.toJSON(
						messageBoardAttachment_Page.getItems()[i]));

				if ((i + 1) < messageBoardAttachment_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (messageBoardAttachment_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardAttachment_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (messageBoardAttachment_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardAttachment_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (messageBoardAttachment_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardAttachment_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (messageBoardAttachment_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(messageBoardAttachment_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class MessageBoardAttachment_PageJSONParser
		extends BaseJSONParser<MessageBoardAttachment_Page> {

		protected MessageBoardAttachment_Page createDTO() {
			return new MessageBoardAttachment_Page();
		}

		protected MessageBoardAttachment_Page[] createDTOArray(int size) {
			return new MessageBoardAttachment_Page[size];
		}

		protected void setField(
			MessageBoardAttachment_Page messageBoardAttachment_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					messageBoardAttachment_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> MessageBoardAttachmentSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new MessageBoardAttachment[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					messageBoardAttachment_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					messageBoardAttachment_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					messageBoardAttachment_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					messageBoardAttachment_Page.setTotalCount(
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