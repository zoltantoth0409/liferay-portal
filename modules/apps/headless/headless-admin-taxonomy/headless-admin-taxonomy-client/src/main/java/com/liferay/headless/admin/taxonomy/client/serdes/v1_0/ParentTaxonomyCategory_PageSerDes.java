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

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.ParentTaxonomyCategory;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.ParentTaxonomyCategory_Page;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ParentTaxonomyCategory_PageSerDes {

	public static ParentTaxonomyCategory_Page toDTO(String json) {
		ParentTaxonomyCategory_PageJSONParser
			parentTaxonomyCategory_PageJSONParser =
				new ParentTaxonomyCategory_PageJSONParser();

		return parentTaxonomyCategory_PageJSONParser.parseToDTO(json);
	}

	public static ParentTaxonomyCategory_Page[] toDTOs(String json) {
		ParentTaxonomyCategory_PageJSONParser
			parentTaxonomyCategory_PageJSONParser =
				new ParentTaxonomyCategory_PageJSONParser();

		return parentTaxonomyCategory_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		ParentTaxonomyCategory_Page parentTaxonomyCategory_Page) {

		if (parentTaxonomyCategory_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (parentTaxonomyCategory_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < parentTaxonomyCategory_Page.getItems().length;
				 i++) {

				sb.append(
					ParentTaxonomyCategorySerDes.toJSON(
						parentTaxonomyCategory_Page.getItems()[i]));

				if ((i + 1) < parentTaxonomyCategory_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (parentTaxonomyCategory_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyCategory_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (parentTaxonomyCategory_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyCategory_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (parentTaxonomyCategory_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyCategory_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (parentTaxonomyCategory_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyCategory_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ParentTaxonomyCategory_PageJSONParser
		extends BaseJSONParser<ParentTaxonomyCategory_Page> {

		protected ParentTaxonomyCategory_Page createDTO() {
			return new ParentTaxonomyCategory_Page();
		}

		protected ParentTaxonomyCategory_Page[] createDTOArray(int size) {
			return new ParentTaxonomyCategory_Page[size];
		}

		protected void setField(
			ParentTaxonomyCategory_Page parentTaxonomyCategory_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyCategory_Page.setItems(
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
					parentTaxonomyCategory_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyCategory_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyCategory_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyCategory_Page.setTotalCount(
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