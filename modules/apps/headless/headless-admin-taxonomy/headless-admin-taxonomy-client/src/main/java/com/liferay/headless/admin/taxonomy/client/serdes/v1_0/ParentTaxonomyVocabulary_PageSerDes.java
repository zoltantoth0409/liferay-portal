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

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.ParentTaxonomyVocabulary;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.ParentTaxonomyVocabulary_Page;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ParentTaxonomyVocabulary_PageSerDes {

	public static ParentTaxonomyVocabulary_Page toDTO(String json) {
		ParentTaxonomyVocabulary_PageJSONParser
			parentTaxonomyVocabulary_PageJSONParser =
				new ParentTaxonomyVocabulary_PageJSONParser();

		return parentTaxonomyVocabulary_PageJSONParser.parseToDTO(json);
	}

	public static ParentTaxonomyVocabulary_Page[] toDTOs(String json) {
		ParentTaxonomyVocabulary_PageJSONParser
			parentTaxonomyVocabulary_PageJSONParser =
				new ParentTaxonomyVocabulary_PageJSONParser();

		return parentTaxonomyVocabulary_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		ParentTaxonomyVocabulary_Page parentTaxonomyVocabulary_Page) {

		if (parentTaxonomyVocabulary_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (parentTaxonomyVocabulary_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < parentTaxonomyVocabulary_Page.getItems().length;
				 i++) {

				sb.append(
					ParentTaxonomyVocabularySerDes.toJSON(
						parentTaxonomyVocabulary_Page.getItems()[i]));

				if ((i + 1) < parentTaxonomyVocabulary_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (parentTaxonomyVocabulary_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyVocabulary_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (parentTaxonomyVocabulary_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyVocabulary_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (parentTaxonomyVocabulary_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyVocabulary_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (parentTaxonomyVocabulary_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(parentTaxonomyVocabulary_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ParentTaxonomyVocabulary_PageJSONParser
		extends BaseJSONParser<ParentTaxonomyVocabulary_Page> {

		protected ParentTaxonomyVocabulary_Page createDTO() {
			return new ParentTaxonomyVocabulary_Page();
		}

		protected ParentTaxonomyVocabulary_Page[] createDTOArray(int size) {
			return new ParentTaxonomyVocabulary_Page[size];
		}

		protected void setField(
			ParentTaxonomyVocabulary_Page parentTaxonomyVocabulary_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyVocabulary_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ParentTaxonomyVocabularySerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ParentTaxonomyVocabulary[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyVocabulary_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyVocabulary_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyVocabulary_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					parentTaxonomyVocabulary_Page.setTotalCount(
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