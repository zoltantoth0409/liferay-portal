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
import com.liferay.headless.delivery.client.dto.v1_0.Page_MessageBoardThread;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_MessageBoardThreadSerDes {

	public static Page_MessageBoardThread toDTO(String json) {
		Page_MessageBoardThreadJSONParser page_MessageBoardThreadJSONParser =
			new Page_MessageBoardThreadJSONParser();

		return page_MessageBoardThreadJSONParser.parseToDTO(json);
	}

	public static Page_MessageBoardThread[] toDTOs(String json) {
		Page_MessageBoardThreadJSONParser page_MessageBoardThreadJSONParser =
			new Page_MessageBoardThreadJSONParser();

		return page_MessageBoardThreadJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_MessageBoardThread page_MessageBoardThread) {

		if (page_MessageBoardThread == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_MessageBoardThread.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_MessageBoardThread.getItems().length;
				 i++) {

				sb.append(
					MessageBoardThreadSerDes.toJSON(
						page_MessageBoardThread.getItems()[i]));

				if ((i + 1) < page_MessageBoardThread.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_MessageBoardThread.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardThread.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_MessageBoardThread.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardThread.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_MessageBoardThread.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardThread.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_MessageBoardThread.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MessageBoardThread.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_MessageBoardThreadJSONParser
		extends BaseJSONParser<Page_MessageBoardThread> {

		protected Page_MessageBoardThread createDTO() {
			return new Page_MessageBoardThread();
		}

		protected Page_MessageBoardThread[] createDTOArray(int size) {
			return new Page_MessageBoardThread[size];
		}

		protected void setField(
			Page_MessageBoardThread page_MessageBoardThread,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardThread.setItems(
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
					page_MessageBoardThread.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardThread.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardThread.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_MessageBoardThread.setTotalCount(
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