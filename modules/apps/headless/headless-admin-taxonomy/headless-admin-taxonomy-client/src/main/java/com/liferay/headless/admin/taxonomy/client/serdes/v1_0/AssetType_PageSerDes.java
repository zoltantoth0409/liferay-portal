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
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.AssetType_Page;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class AssetType_PageSerDes {

	public static AssetType_Page toDTO(String json) {
		AssetType_PageJSONParser assetType_PageJSONParser =
			new AssetType_PageJSONParser();

		return assetType_PageJSONParser.parseToDTO(json);
	}

	public static AssetType_Page[] toDTOs(String json) {
		AssetType_PageJSONParser assetType_PageJSONParser =
			new AssetType_PageJSONParser();

		return assetType_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(AssetType_Page assetType_Page) {
		if (assetType_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (assetType_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < assetType_Page.getItems().length; i++) {
				sb.append(AssetTypeSerDes.toJSON(assetType_Page.getItems()[i]));

				if ((i + 1) < assetType_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (assetType_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(assetType_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (assetType_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(assetType_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (assetType_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(assetType_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (assetType_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(assetType_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class AssetType_PageJSONParser
		extends BaseJSONParser<AssetType_Page> {

		protected AssetType_Page createDTO() {
			return new AssetType_Page();
		}

		protected AssetType_Page[] createDTOArray(int size) {
			return new AssetType_Page[size];
		}

		protected void setField(
			AssetType_Page assetType_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					assetType_Page.setItems(
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
					assetType_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					assetType_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					assetType_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					assetType_Page.setTotalCount(
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