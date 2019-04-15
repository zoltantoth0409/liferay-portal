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

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.TaxonomyCategory;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.TaxonomyCategory_Page;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class TaxonomyCategory_PageSerDes {

	public static TaxonomyCategory_Page toDTO(String json) {
		TaxonomyCategory_PageJSONParser taxonomyCategory_PageJSONParser =
			new TaxonomyCategory_PageJSONParser();

		return taxonomyCategory_PageJSONParser.parseToDTO(json);
	}

	public static TaxonomyCategory_Page[] toDTOs(String json) {
		TaxonomyCategory_PageJSONParser taxonomyCategory_PageJSONParser =
			new TaxonomyCategory_PageJSONParser();

		return taxonomyCategory_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(TaxonomyCategory_Page taxonomyCategory_Page) {
		if (taxonomyCategory_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (taxonomyCategory_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < taxonomyCategory_Page.getItems().length; i++) {
				sb.append(
					TaxonomyCategorySerDes.toJSON(
						taxonomyCategory_Page.getItems()[i]));

				if ((i + 1) < taxonomyCategory_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (taxonomyCategory_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(taxonomyCategory_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (taxonomyCategory_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(taxonomyCategory_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (taxonomyCategory_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(taxonomyCategory_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (taxonomyCategory_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(taxonomyCategory_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class TaxonomyCategory_PageJSONParser
		extends BaseJSONParser<TaxonomyCategory_Page> {

		protected TaxonomyCategory_Page createDTO() {
			return new TaxonomyCategory_Page();
		}

		protected TaxonomyCategory_Page[] createDTOArray(int size) {
			return new TaxonomyCategory_Page[size];
		}

		protected void setField(
			TaxonomyCategory_Page taxonomyCategory_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					taxonomyCategory_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> TaxonomyCategorySerDes.toDTO(
								(String)object)
						).toArray(
							size -> new TaxonomyCategory[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					taxonomyCategory_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					taxonomyCategory_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					taxonomyCategory_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					taxonomyCategory_Page.setTotalCount(
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