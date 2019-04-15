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

package com.liferay.headless.admin.taxonomy.client.serdes.v1_0;

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.AssetType;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Page_AssetType;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_AssetTypeSerDes {

	public static Page_AssetType toDTO(String json) {
		Page_AssetTypeJSONParser page_AssetTypeJSONParser =
			new Page_AssetTypeJSONParser();

		return page_AssetTypeJSONParser.parseToDTO(json);
	}

	public static Page_AssetType[] toDTOs(String json) {
		Page_AssetTypeJSONParser page_AssetTypeJSONParser =
			new Page_AssetTypeJSONParser();

		return page_AssetTypeJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_AssetType page_AssetType) {
		if (page_AssetType == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_AssetType.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_AssetType.getItems().length; i++) {
				sb.append(AssetTypeSerDes.toJSON(page_AssetType.getItems()[i]));

				if ((i + 1) < page_AssetType.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_AssetType.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AssetType.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_AssetType.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AssetType.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_AssetType.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AssetType.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_AssetType.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_AssetType.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_AssetTypeJSONParser
		extends BaseJSONParser<Page_AssetType> {

		protected Page_AssetType createDTO() {
			return new Page_AssetType();
		}

		protected Page_AssetType[] createDTOArray(int size) {
			return new Page_AssetType[size];
		}

		protected void setField(
			Page_AssetType page_AssetType, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_AssetType.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> AssetTypeSerDes.toDTO((String)object)
						).toArray(
							size -> new AssetType[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_AssetType.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_AssetType.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_AssetType.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_AssetType.setTotalCount(
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