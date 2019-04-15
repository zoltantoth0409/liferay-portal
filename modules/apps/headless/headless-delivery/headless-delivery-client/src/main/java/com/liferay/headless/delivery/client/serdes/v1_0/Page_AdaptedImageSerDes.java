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

import com.liferay.headless.delivery.client.dto.v1_0.AdaptedImage;
import com.liferay.headless.delivery.client.dto.v1_0.Page_AdaptedImage;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_AdaptedImageSerDes {

	public static Page_AdaptedImage toDTO(String json) {
		Page_AdaptedImageJSONParser page_AdaptedImageJSONParser =
			new Page_AdaptedImageJSONParser();

		return page_AdaptedImageJSONParser.parseToDTO(json);
	}

	public static Page_AdaptedImage[] toDTOs(String json) {
		Page_AdaptedImageJSONParser page_AdaptedImageJSONParser =
			new Page_AdaptedImageJSONParser();

		return page_AdaptedImageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_AdaptedImage page_AdaptedImage) {
		if (page_AdaptedImage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_AdaptedImage.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_AdaptedImage.getItems().length; i++) {
				sb.append(
					AdaptedImageSerDes.toJSON(page_AdaptedImage.getItems()[i]));

				if ((i + 1) < page_AdaptedImage.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_AdaptedImage.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AdaptedImage.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_AdaptedImage.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AdaptedImage.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_AdaptedImage.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AdaptedImage.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_AdaptedImage.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AdaptedImage.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_AdaptedImageJSONParser
		extends BaseJSONParser<Page_AdaptedImage> {

		protected Page_AdaptedImage createDTO() {
			return new Page_AdaptedImage();
		}

		protected Page_AdaptedImage[] createDTOArray(int size) {
			return new Page_AdaptedImage[size];
		}

		protected void setField(
			Page_AdaptedImage page_AdaptedImage, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_AdaptedImage.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> AdaptedImageSerDes.toDTO((String)object)
						).toArray(
							size -> new AdaptedImage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_AdaptedImage.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_AdaptedImage.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_AdaptedImage.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_AdaptedImage.setTotalCount(
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