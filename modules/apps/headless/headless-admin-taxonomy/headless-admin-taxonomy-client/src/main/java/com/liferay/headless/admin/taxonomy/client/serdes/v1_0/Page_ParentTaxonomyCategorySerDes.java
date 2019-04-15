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

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Page_ParentTaxonomyCategory;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.ParentTaxonomyCategory;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ParentTaxonomyCategorySerDes {

	public static Page_ParentTaxonomyCategory toDTO(String json) {
		Page_ParentTaxonomyCategoryJSONParser
			page_ParentTaxonomyCategoryJSONParser =
				new Page_ParentTaxonomyCategoryJSONParser();

		return page_ParentTaxonomyCategoryJSONParser.parseToDTO(json);
	}

	public static Page_ParentTaxonomyCategory[] toDTOs(String json) {
		Page_ParentTaxonomyCategoryJSONParser
			page_ParentTaxonomyCategoryJSONParser =
				new Page_ParentTaxonomyCategoryJSONParser();

		return page_ParentTaxonomyCategoryJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_ParentTaxonomyCategory page_ParentTaxonomyCategory) {

		if (page_ParentTaxonomyCategory == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ParentTaxonomyCategory.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ParentTaxonomyCategory.getItems().length;
				 i++) {

				sb.append(
					ParentTaxonomyCategorySerDes.toJSON(
						page_ParentTaxonomyCategory.getItems()[i]));

				if ((i + 1) < page_ParentTaxonomyCategory.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ParentTaxonomyCategory.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyCategory.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ParentTaxonomyCategory.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyCategory.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ParentTaxonomyCategory.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyCategory.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ParentTaxonomyCategory.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyCategory.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ParentTaxonomyCategoryJSONParser
		extends BaseJSONParser<Page_ParentTaxonomyCategory> {

		protected Page_ParentTaxonomyCategory createDTO() {
			return new Page_ParentTaxonomyCategory();
		}

		protected Page_ParentTaxonomyCategory[] createDTOArray(int size) {
			return new Page_ParentTaxonomyCategory[size];
		}

		protected void setField(
			Page_ParentTaxonomyCategory page_ParentTaxonomyCategory,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyCategory.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ParentTaxonomyCategorySerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ParentTaxonomyCategory[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyCategory.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyCategory.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyCategory.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyCategory.setTotalCount(
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