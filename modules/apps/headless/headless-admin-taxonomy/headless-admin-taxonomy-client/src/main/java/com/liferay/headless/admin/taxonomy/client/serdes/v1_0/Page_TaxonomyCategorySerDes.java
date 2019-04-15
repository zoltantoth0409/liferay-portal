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

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Page_TaxonomyCategory;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.TaxonomyCategory;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_TaxonomyCategorySerDes {

	public static Page_TaxonomyCategory toDTO(String json) {
		Page_TaxonomyCategoryJSONParser page_TaxonomyCategoryJSONParser =
			new Page_TaxonomyCategoryJSONParser();

		return page_TaxonomyCategoryJSONParser.parseToDTO(json);
	}

	public static Page_TaxonomyCategory[] toDTOs(String json) {
		Page_TaxonomyCategoryJSONParser page_TaxonomyCategoryJSONParser =
			new Page_TaxonomyCategoryJSONParser();

		return page_TaxonomyCategoryJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_TaxonomyCategory page_TaxonomyCategory) {
		if (page_TaxonomyCategory == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_TaxonomyCategory.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_TaxonomyCategory.getItems().length; i++) {
				sb.append(
					TaxonomyCategorySerDes.toJSON(
						page_TaxonomyCategory.getItems()[i]));

				if ((i + 1) < page_TaxonomyCategory.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_TaxonomyCategory.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_TaxonomyCategory.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_TaxonomyCategory.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_TaxonomyCategory.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_TaxonomyCategory.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_TaxonomyCategory.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_TaxonomyCategory.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_TaxonomyCategory.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_TaxonomyCategoryJSONParser
		extends BaseJSONParser<Page_TaxonomyCategory> {

		protected Page_TaxonomyCategory createDTO() {
			return new Page_TaxonomyCategory();
		}

		protected Page_TaxonomyCategory[] createDTOArray(int size) {
			return new Page_TaxonomyCategory[size];
		}

		protected void setField(
			Page_TaxonomyCategory page_TaxonomyCategory,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_TaxonomyCategory.setItems(
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
					page_TaxonomyCategory.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_TaxonomyCategory.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_TaxonomyCategory.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_TaxonomyCategory.setTotalCount(
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