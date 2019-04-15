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

import com.liferay.headless.admin.taxonomy.client.dto.v1_0.Page_ParentTaxonomyVocabulary;
import com.liferay.headless.admin.taxonomy.client.dto.v1_0.ParentTaxonomyVocabulary;
import com.liferay.headless.admin.taxonomy.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ParentTaxonomyVocabularySerDes {

	public static Page_ParentTaxonomyVocabulary toDTO(String json) {
		Page_ParentTaxonomyVocabularyJSONParser
			page_ParentTaxonomyVocabularyJSONParser =
				new Page_ParentTaxonomyVocabularyJSONParser();

		return page_ParentTaxonomyVocabularyJSONParser.parseToDTO(json);
	}

	public static Page_ParentTaxonomyVocabulary[] toDTOs(String json) {
		Page_ParentTaxonomyVocabularyJSONParser
			page_ParentTaxonomyVocabularyJSONParser =
				new Page_ParentTaxonomyVocabularyJSONParser();

		return page_ParentTaxonomyVocabularyJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_ParentTaxonomyVocabulary page_ParentTaxonomyVocabulary) {

		if (page_ParentTaxonomyVocabulary == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ParentTaxonomyVocabulary.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ParentTaxonomyVocabulary.getItems().length;
				 i++) {

				sb.append(
					ParentTaxonomyVocabularySerDes.toJSON(
						page_ParentTaxonomyVocabulary.getItems()[i]));

				if ((i + 1) < page_ParentTaxonomyVocabulary.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ParentTaxonomyVocabulary.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyVocabulary.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ParentTaxonomyVocabulary.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyVocabulary.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ParentTaxonomyVocabulary.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyVocabulary.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ParentTaxonomyVocabulary.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ParentTaxonomyVocabulary.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ParentTaxonomyVocabularyJSONParser
		extends BaseJSONParser<Page_ParentTaxonomyVocabulary> {

		protected Page_ParentTaxonomyVocabulary createDTO() {
			return new Page_ParentTaxonomyVocabulary();
		}

		protected Page_ParentTaxonomyVocabulary[] createDTOArray(int size) {
			return new Page_ParentTaxonomyVocabulary[size];
		}

		protected void setField(
			Page_ParentTaxonomyVocabulary page_ParentTaxonomyVocabulary,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyVocabulary.setItems(
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
					page_ParentTaxonomyVocabulary.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyVocabulary.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyVocabulary.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ParentTaxonomyVocabulary.setTotalCount(
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