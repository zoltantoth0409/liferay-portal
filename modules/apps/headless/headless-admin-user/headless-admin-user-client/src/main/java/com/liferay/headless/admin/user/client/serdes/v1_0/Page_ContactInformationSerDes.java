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

package com.liferay.headless.admin.user.client.serdes.v1_0;

import com.liferay.headless.admin.user.client.dto.v1_0.ContactInformation;
import com.liferay.headless.admin.user.client.dto.v1_0.Page_ContactInformation;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ContactInformationSerDes {

	public static Page_ContactInformation toDTO(String json) {
		Page_ContactInformationJSONParser page_ContactInformationJSONParser =
			new Page_ContactInformationJSONParser();

		return page_ContactInformationJSONParser.parseToDTO(json);
	}

	public static Page_ContactInformation[] toDTOs(String json) {
		Page_ContactInformationJSONParser page_ContactInformationJSONParser =
			new Page_ContactInformationJSONParser();

		return page_ContactInformationJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		Page_ContactInformation page_ContactInformation) {

		if (page_ContactInformation == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_ContactInformation.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_ContactInformation.getItems().length;
				 i++) {

				sb.append(
					ContactInformationSerDes.toJSON(
						page_ContactInformation.getItems()[i]));

				if ((i + 1) < page_ContactInformation.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_ContactInformation.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContactInformation.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_ContactInformation.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContactInformation.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_ContactInformation.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContactInformation.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_ContactInformation.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_ContactInformation.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ContactInformationJSONParser
		extends BaseJSONParser<Page_ContactInformation> {

		protected Page_ContactInformation createDTO() {
			return new Page_ContactInformation();
		}

		protected Page_ContactInformation[] createDTOArray(int size) {
			return new Page_ContactInformation[size];
		}

		protected void setField(
			Page_ContactInformation page_ContactInformation,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_ContactInformation.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ContactInformationSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ContactInformation[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_ContactInformation.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_ContactInformation.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_ContactInformation.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_ContactInformation.setTotalCount(
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