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

import com.liferay.headless.form.client.dto.v1_0.MediaForm;
import com.liferay.headless.form.client.dto.v1_0.Page_MediaForm;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_MediaFormSerDes {

	public static Page_MediaForm toDTO(String json) {
		Page_MediaFormJSONParser page_MediaFormJSONParser =
			new Page_MediaFormJSONParser();

		return page_MediaFormJSONParser.parseToDTO(json);
	}

	public static Page_MediaForm[] toDTOs(String json) {
		Page_MediaFormJSONParser page_MediaFormJSONParser =
			new Page_MediaFormJSONParser();

		return page_MediaFormJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_MediaForm page_MediaForm) {
		if (page_MediaForm == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_MediaForm.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_MediaForm.getItems().length; i++) {
				sb.append(MediaFormSerDes.toJSON(page_MediaForm.getItems()[i]));

				if ((i + 1) < page_MediaForm.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_MediaForm.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MediaForm.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_MediaForm.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MediaForm.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_MediaForm.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MediaForm.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_MediaForm.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_MediaForm.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_MediaFormJSONParser
		extends BaseJSONParser<Page_MediaForm> {

		protected Page_MediaForm createDTO() {
			return new Page_MediaForm();
		}

		protected Page_MediaForm[] createDTOArray(int size) {
			return new Page_MediaForm[size];
		}

		protected void setField(
			Page_MediaForm page_MediaForm, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_MediaForm.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> MediaFormSerDes.toDTO((String)object)
						).toArray(
							size -> new MediaForm[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_MediaForm.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_MediaForm.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_MediaForm.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_MediaForm.setTotalCount(
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