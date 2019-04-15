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

import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseAttachment;
import com.liferay.headless.delivery.client.dto.v1_0.Page_KnowledgeBaseAttachment;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_KnowledgeBaseAttachmentSerDes {

	public static Page_KnowledgeBaseAttachment toDTO(String json) {
		Page_KnowledgeBaseAttachmentJSONParser
			page_KnowledgeBaseAttachmentJSONParser =
				new Page_KnowledgeBaseAttachmentJSONParser();

		return page_KnowledgeBaseAttachmentJSONParser.parseToDTO(json);
	}

	public static Page_KnowledgeBaseAttachment[] toDTOs(String json) {
		Page_KnowledgeBaseAttachmentJSONParser
			page_KnowledgeBaseAttachmentJSONParser =
				new Page_KnowledgeBaseAttachmentJSONParser();

		return page_KnowledgeBaseAttachmentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_KnowledgeBaseAttachment page_KnowledgeBaseAttachment) {

		if (page_KnowledgeBaseAttachment == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_KnowledgeBaseAttachment.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_KnowledgeBaseAttachment.getItems().length;
				 i++) {

				sb.append(
					KnowledgeBaseAttachmentSerDes.toJSON(
						page_KnowledgeBaseAttachment.getItems()[i]));

				if ((i + 1) < page_KnowledgeBaseAttachment.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_KnowledgeBaseAttachment.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseAttachment.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_KnowledgeBaseAttachment.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseAttachment.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_KnowledgeBaseAttachment.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseAttachment.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_KnowledgeBaseAttachment.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_KnowledgeBaseAttachment.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_KnowledgeBaseAttachmentJSONParser
		extends BaseJSONParser<Page_KnowledgeBaseAttachment> {

		protected Page_KnowledgeBaseAttachment createDTO() {
			return new Page_KnowledgeBaseAttachment();
		}

		protected Page_KnowledgeBaseAttachment[] createDTOArray(int size) {
			return new Page_KnowledgeBaseAttachment[size];
		}

		protected void setField(
			Page_KnowledgeBaseAttachment page_KnowledgeBaseAttachment,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseAttachment.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> KnowledgeBaseAttachmentSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new KnowledgeBaseAttachment[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseAttachment.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseAttachment.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseAttachment.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_KnowledgeBaseAttachment.setTotalCount(
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