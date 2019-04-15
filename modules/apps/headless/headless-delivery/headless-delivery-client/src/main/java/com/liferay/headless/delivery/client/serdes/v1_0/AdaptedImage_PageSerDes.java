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
import com.liferay.headless.delivery.client.dto.v1_0.AdaptedImage_Page;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class AdaptedImage_PageSerDes {

	public static AdaptedImage_Page toDTO(String json) {
		AdaptedImage_PageJSONParser adaptedImage_PageJSONParser =
			new AdaptedImage_PageJSONParser();

		return adaptedImage_PageJSONParser.parseToDTO(json);
	}

	public static AdaptedImage_Page[] toDTOs(String json) {
		AdaptedImage_PageJSONParser adaptedImage_PageJSONParser =
			new AdaptedImage_PageJSONParser();

		return adaptedImage_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(AdaptedImage_Page adaptedImage_Page) {
		if (adaptedImage_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (adaptedImage_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < adaptedImage_Page.getItems().length; i++) {
				sb.append(
					AdaptedImageSerDes.toJSON(adaptedImage_Page.getItems()[i]));

				if ((i + 1) < adaptedImage_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (adaptedImage_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(adaptedImage_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (adaptedImage_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(adaptedImage_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (adaptedImage_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(adaptedImage_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (adaptedImage_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(adaptedImage_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class AdaptedImage_PageJSONParser
		extends BaseJSONParser<AdaptedImage_Page> {

		protected AdaptedImage_Page createDTO() {
			return new AdaptedImage_Page();
		}

		protected AdaptedImage_Page[] createDTOArray(int size) {
			return new AdaptedImage_Page[size];
		}

		protected void setField(
			AdaptedImage_Page adaptedImage_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					adaptedImage_Page.setItems(
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
					adaptedImage_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					adaptedImage_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					adaptedImage_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					adaptedImage_Page.setTotalCount(
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