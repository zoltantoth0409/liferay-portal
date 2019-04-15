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

import com.liferay.headless.delivery.client.dto.v1_0.Image;
import com.liferay.headless.delivery.client.dto.v1_0.Page_Image;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ImageSerDes {

	public static Page_Image toDTO(String json) {
		Page_ImageJSONParser page_ImageJSONParser = new Page_ImageJSONParser();

		return page_ImageJSONParser.parseToDTO(json);
	}

	public static Page_Image[] toDTOs(String json) {
		Page_ImageJSONParser page_ImageJSONParser = new Page_ImageJSONParser();

		return page_ImageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Image page_Image) {
		if (page_Image == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Image.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Image.getItems().length; i++) {
				sb.append(ImageSerDes.toJSON(page_Image.getItems()[i]));

				if ((i + 1) < page_Image.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Image.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Image.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Image.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Image.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Image.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Image.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Image.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Image.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ImageJSONParser
		extends BaseJSONParser<Page_Image> {

		protected Page_Image createDTO() {
			return new Page_Image();
		}

		protected Page_Image[] createDTOArray(int size) {
			return new Page_Image[size];
		}

		protected void setField(
			Page_Image page_Image, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Image.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ImageSerDes.toDTO((String)object)
						).toArray(
							size -> new Image[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Image.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Image.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Image.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Image.setTotalCount(
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