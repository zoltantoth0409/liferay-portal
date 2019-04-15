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
import com.liferay.headless.delivery.client.dto.v1_0.Image_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Image_PageSerDes {

	public static Image_Page toDTO(String json) {
		Image_PageJSONParser image_PageJSONParser = new Image_PageJSONParser();

		return image_PageJSONParser.parseToDTO(json);
	}

	public static Image_Page[] toDTOs(String json) {
		Image_PageJSONParser image_PageJSONParser = new Image_PageJSONParser();

		return image_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Image_Page image_Page) {
		if (image_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (image_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < image_Page.getItems().length; i++) {
				sb.append(ImageSerDes.toJSON(image_Page.getItems()[i]));

				if ((i + 1) < image_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (image_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(image_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (image_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(image_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (image_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(image_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (image_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(image_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Image_PageJSONParser
		extends BaseJSONParser<Image_Page> {

		protected Image_Page createDTO() {
			return new Image_Page();
		}

		protected Image_Page[] createDTOArray(int size) {
			return new Image_Page[size];
		}

		protected void setField(
			Image_Page image_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					image_Page.setItems(
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
					image_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					image_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					image_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					image_Page.setTotalCount(
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