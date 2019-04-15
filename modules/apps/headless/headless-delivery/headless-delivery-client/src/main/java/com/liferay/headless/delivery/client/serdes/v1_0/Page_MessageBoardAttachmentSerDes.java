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
import com.liferay.headless.delivery.client.dto.v1_0.Page_MessageBoardAttachment;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_MessageBoardAttachmentSerDes {

	public static Page_MessageBoardAttachment toDTO(String json) {
		Page_MessageBoardAttachmentJSONParser
			page_MessageBoardAttachmentJSONParser =
				new Page_MessageBoardAttachmentJSONParser();

		return page_MessageBoardAttachmentJSONParser.parseToDTO(json);
	}

	public static Page_MessageBoardAttachment[] toDTOs(String json) {
		Page_MessageBoardAttachmentJSONParser
			page_MessageBoardAttachmentJSONParser =
				new Page_MessageBoardAttachmentJSONParser();

		return page_MessageBoardAttachmentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_MessageBoardAttachment page_MessageBoardAttachment) {

		if (page_MessageBoardAttachment == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_MessageBoardAttachment.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_MessageBoardAttachment.getItems().length;
				 i++) {

				sb.append(
					MessageBoardAttachmentSerDes.toJSON(
						page_MessageBoardAttachment.getItems()[i]));

				if ((i + 1) < page_MessageBoardAttachment.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_MessageBoardAttachment.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardAttachment.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_MessageBoardAttachment.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardAttachment.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_MessageBoardAttachment.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardAttachment.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_MessageBoardAttachment.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardAttachment.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_MessageBoardAttachmentJSONParser
		extends BaseJSONParser<Page_MessageBoardAttachment> {

		protected Page_MessageBoardAttachment createDTO() {
			return new Page_MessageBoardAttachment();
		}

		protected Page_MessageBoardAttachment[] createDTOArray(int size) {
			return new Page_MessageBoardAttachment[size];
		}

		protected void setField(
			Page_MessageBoardAttachment page_MessageBoardAttachment,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardAttachment.setItems(
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
					page_MessageBoardAttachment.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardAttachment.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardAttachment.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardAttachment.setTotalCount(
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