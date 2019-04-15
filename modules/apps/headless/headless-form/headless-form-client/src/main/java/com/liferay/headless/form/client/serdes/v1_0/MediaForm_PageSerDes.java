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
import com.liferay.headless.form.client.dto.v1_0.MediaForm_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class MediaForm_PageSerDes {

	public static MediaForm_Page toDTO(String json) {
		MediaForm_PageJSONParser mediaForm_PageJSONParser =
			new MediaForm_PageJSONParser();

		return mediaForm_PageJSONParser.parseToDTO(json);
	}

	public static MediaForm_Page[] toDTOs(String json) {
		MediaForm_PageJSONParser mediaForm_PageJSONParser =
			new MediaForm_PageJSONParser();

		return mediaForm_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(MediaForm_Page mediaForm_Page) {
		if (mediaForm_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (mediaForm_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < mediaForm_Page.getItems().length; i++) {
				sb.append(MediaFormSerDes.toJSON(mediaForm_Page.getItems()[i]));

				if ((i + 1) < mediaForm_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (mediaForm_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(mediaForm_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (mediaForm_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(mediaForm_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (mediaForm_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(mediaForm_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (mediaForm_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(mediaForm_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class MediaForm_PageJSONParser
		extends BaseJSONParser<MediaForm_Page> {

		protected MediaForm_Page createDTO() {
			return new MediaForm_Page();
		}

		protected MediaForm_Page[] createDTOArray(int size) {
			return new MediaForm_Page[size];
		}

		protected void setField(
			MediaForm_Page mediaForm_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					mediaForm_Page.setItems(
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
					mediaForm_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					mediaForm_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					mediaForm_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					mediaForm_Page.setTotalCount(
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