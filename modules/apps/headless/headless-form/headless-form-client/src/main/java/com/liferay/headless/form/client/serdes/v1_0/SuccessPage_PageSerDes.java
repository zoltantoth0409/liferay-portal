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

package com.liferay.headless.form.client.serdes.v1_0;

import com.liferay.headless.form.client.dto.v1_0.SuccessPage;
import com.liferay.headless.form.client.dto.v1_0.SuccessPage_Page;
import com.liferay.headless.form.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class SuccessPage_PageSerDes {

	public static SuccessPage_Page toDTO(String json) {
		SuccessPage_PageJSONParser successPage_PageJSONParser =
			new SuccessPage_PageJSONParser();

		return successPage_PageJSONParser.parseToDTO(json);
	}

	public static SuccessPage_Page[] toDTOs(String json) {
		SuccessPage_PageJSONParser successPage_PageJSONParser =
			new SuccessPage_PageJSONParser();

		return successPage_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(SuccessPage_Page successPage_Page) {
		if (successPage_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (successPage_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < successPage_Page.getItems().length; i++) {
				sb.append(
					SuccessPageSerDes.toJSON(successPage_Page.getItems()[i]));

				if ((i + 1) < successPage_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (successPage_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(successPage_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (successPage_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(successPage_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (successPage_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(successPage_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (successPage_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(successPage_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class SuccessPage_PageJSONParser
		extends BaseJSONParser<SuccessPage_Page> {

		protected SuccessPage_Page createDTO() {
			return new SuccessPage_Page();
		}

		protected SuccessPage_Page[] createDTOArray(int size) {
			return new SuccessPage_Page[size];
		}

		protected void setField(
			SuccessPage_Page successPage_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					successPage_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> SuccessPageSerDes.toDTO((String)object)
						).toArray(
							size -> new SuccessPage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					successPage_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					successPage_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					successPage_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					successPage_Page.setTotalCount(
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