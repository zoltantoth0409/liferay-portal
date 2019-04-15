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

package com.liferay.headless.form.client.serdes.v1_0;

import com.liferay.headless.form.client.dto.v1_0.FormRecord;
import com.liferay.headless.form.client.dto.v1_0.Page_FormRecord;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_FormRecordSerDes {

	public static Page_FormRecord toDTO(String json) {
		Page_FormRecordJSONParser page_FormRecordJSONParser =
			new Page_FormRecordJSONParser();

		return page_FormRecordJSONParser.parseToDTO(json);
	}

	public static Page_FormRecord[] toDTOs(String json) {
		Page_FormRecordJSONParser page_FormRecordJSONParser =
			new Page_FormRecordJSONParser();

		return page_FormRecordJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_FormRecord page_FormRecord) {
		if (page_FormRecord == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_FormRecord.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_FormRecord.getItems().length; i++) {
				sb.append(
					FormRecordSerDes.toJSON(page_FormRecord.getItems()[i]));

				if ((i + 1) < page_FormRecord.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_FormRecord.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecord.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_FormRecord.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecord.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_FormRecord.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecord.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_FormRecord.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_FormRecord.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_FormRecordJSONParser
		extends BaseJSONParser<Page_FormRecord> {

		protected Page_FormRecord createDTO() {
			return new Page_FormRecord();
		}

		protected Page_FormRecord[] createDTOArray(int size) {
			return new Page_FormRecord[size];
		}

		protected void setField(
			Page_FormRecord page_FormRecord, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_FormRecord.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> FormRecordSerDes.toDTO((String)object)
						).toArray(
							size -> new FormRecord[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_FormRecord.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_FormRecord.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_FormRecord.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_FormRecord.setTotalCount(
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