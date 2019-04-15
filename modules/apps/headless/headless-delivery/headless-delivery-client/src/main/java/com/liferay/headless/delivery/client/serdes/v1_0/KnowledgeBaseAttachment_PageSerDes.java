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
import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseAttachment_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class KnowledgeBaseAttachment_PageSerDes {

	public static KnowledgeBaseAttachment_Page toDTO(String json) {
		KnowledgeBaseAttachment_PageJSONParser
			knowledgeBaseAttachment_PageJSONParser =
				new KnowledgeBaseAttachment_PageJSONParser();

		return knowledgeBaseAttachment_PageJSONParser.parseToDTO(json);
	}

	public static KnowledgeBaseAttachment_Page[] toDTOs(String json) {
		KnowledgeBaseAttachment_PageJSONParser
			knowledgeBaseAttachment_PageJSONParser =
				new KnowledgeBaseAttachment_PageJSONParser();

		return knowledgeBaseAttachment_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		KnowledgeBaseAttachment_Page knowledgeBaseAttachment_Page) {

		if (knowledgeBaseAttachment_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (knowledgeBaseAttachment_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < knowledgeBaseAttachment_Page.getItems().length;
				 i++) {

				sb.append(
					KnowledgeBaseAttachmentSerDes.toJSON(
						knowledgeBaseAttachment_Page.getItems()[i]));

				if ((i + 1) < knowledgeBaseAttachment_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (knowledgeBaseAttachment_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseAttachment_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (knowledgeBaseAttachment_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseAttachment_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (knowledgeBaseAttachment_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseAttachment_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (knowledgeBaseAttachment_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(knowledgeBaseAttachment_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class KnowledgeBaseAttachment_PageJSONParser
		extends BaseJSONParser<KnowledgeBaseAttachment_Page> {

		protected KnowledgeBaseAttachment_Page createDTO() {
			return new KnowledgeBaseAttachment_Page();
		}

		protected KnowledgeBaseAttachment_Page[] createDTOArray(int size) {
			return new KnowledgeBaseAttachment_Page[size];
		}

		protected void setField(
			KnowledgeBaseAttachment_Page knowledgeBaseAttachment_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseAttachment_Page.setItems(
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
					knowledgeBaseAttachment_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseAttachment_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseAttachment_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					knowledgeBaseAttachment_Page.setTotalCount(
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