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

package com.liferay.headless.admin.workflow.client.serdes.v1_0;

import com.liferay.headless.admin.workflow.client.dto.v1_0.ChangeTransition;
import com.liferay.headless.admin.workflow.client.dto.v1_0.ChangeTransition_Page;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ChangeTransition_PageSerDes {

	public static ChangeTransition_Page toDTO(String json) {
		ChangeTransition_PageJSONParser changeTransition_PageJSONParser =
			new ChangeTransition_PageJSONParser();

		return changeTransition_PageJSONParser.parseToDTO(json);
	}

	public static ChangeTransition_Page[] toDTOs(String json) {
		ChangeTransition_PageJSONParser changeTransition_PageJSONParser =
			new ChangeTransition_PageJSONParser();

		return changeTransition_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ChangeTransition_Page changeTransition_Page) {
		if (changeTransition_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (changeTransition_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < changeTransition_Page.getItems().length; i++) {
				sb.append(
					ChangeTransitionSerDes.toJSON(
						changeTransition_Page.getItems()[i]));

				if ((i + 1) < changeTransition_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (changeTransition_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(changeTransition_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (changeTransition_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(changeTransition_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (changeTransition_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(changeTransition_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (changeTransition_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(changeTransition_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ChangeTransition_PageJSONParser
		extends BaseJSONParser<ChangeTransition_Page> {

		protected ChangeTransition_Page createDTO() {
			return new ChangeTransition_Page();
		}

		protected ChangeTransition_Page[] createDTOArray(int size) {
			return new ChangeTransition_Page[size];
		}

		protected void setField(
			ChangeTransition_Page changeTransition_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					changeTransition_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ChangeTransitionSerDes.toDTO(
								(String)object)
						).toArray(
							size -> new ChangeTransition[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					changeTransition_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					changeTransition_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					changeTransition_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					changeTransition_Page.setTotalCount(
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