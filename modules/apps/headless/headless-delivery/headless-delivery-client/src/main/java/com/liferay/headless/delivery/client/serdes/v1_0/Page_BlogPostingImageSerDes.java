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

import com.liferay.headless.delivery.client.dto.v1_0.BlogPostingImage;
import com.liferay.headless.delivery.client.dto.v1_0.Page_BlogPostingImage;
import com.liferay.headless.delivery.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_BlogPostingImageSerDes {

	public static Page_BlogPostingImage toDTO(String json) {
		Page_BlogPostingImageJSONParser page_BlogPostingImageJSONParser =
			new Page_BlogPostingImageJSONParser();

		return page_BlogPostingImageJSONParser.parseToDTO(json);
	}

	public static Page_BlogPostingImage[] toDTOs(String json) {
		Page_BlogPostingImageJSONParser page_BlogPostingImageJSONParser =
			new Page_BlogPostingImageJSONParser();

		return page_BlogPostingImageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_BlogPostingImage page_BlogPostingImage) {
		if (page_BlogPostingImage == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_BlogPostingImage.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_BlogPostingImage.getItems().length; i++) {
				sb.append(
					BlogPostingImageSerDes.toJSON(
						page_BlogPostingImage.getItems()[i]));

				if ((i + 1) < page_BlogPostingImage.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_BlogPostingImage.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPostingImage.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_BlogPostingImage.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPostingImage.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_BlogPostingImage.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPostingImage.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_BlogPostingImage.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_BlogPostingImage.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_BlogPostingImageJSONParser
		extends BaseJSONParser<Page_BlogPostingImage> {

		protected Page_BlogPostingImage createDTO() {
			return new Page_BlogPostingImage();
		}

		protected Page_BlogPostingImage[] createDTOArray(int size) {
			return new Page_BlogPostingImage[size];
		}

		protected void setField(
			Page_BlogPostingImage page_BlogPostingImage,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_BlogPostingImage.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> BlogPostingImageSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new BlogPostingImage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_BlogPostingImage.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_BlogPostingImage.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_BlogPostingImage.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_BlogPostingImage.setTotalCount(
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