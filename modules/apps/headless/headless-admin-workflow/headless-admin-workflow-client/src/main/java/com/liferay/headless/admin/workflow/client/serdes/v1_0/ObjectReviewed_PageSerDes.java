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

import com.liferay.headless.admin.workflow.client.dto.v1_0.ObjectReviewed;
import com.liferay.headless.admin.workflow.client.dto.v1_0.ObjectReviewed_Page;
import com.liferay.headless.admin.workflow.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ObjectReviewed_PageSerDes {

	public static ObjectReviewed_Page toDTO(String json) {
		ObjectReviewed_PageJSONParser objectReviewed_PageJSONParser =
			new ObjectReviewed_PageJSONParser();

		return objectReviewed_PageJSONParser.parseToDTO(json);
	}

	public static ObjectReviewed_Page[] toDTOs(String json) {
		ObjectReviewed_PageJSONParser objectReviewed_PageJSONParser =
			new ObjectReviewed_PageJSONParser();

		return objectReviewed_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(ObjectReviewed_Page objectReviewed_Page) {
		if (objectReviewed_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (objectReviewed_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < objectReviewed_Page.getItems().length; i++) {
				sb.append(
					ObjectReviewedSerDes.toJSON(
						objectReviewed_Page.getItems()[i]));

				if ((i + 1) < objectReviewed_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (objectReviewed_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(objectReviewed_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (objectReviewed_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(objectReviewed_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (objectReviewed_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(objectReviewed_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (objectReviewed_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(objectReviewed_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ObjectReviewed_PageJSONParser
		extends BaseJSONParser<ObjectReviewed_Page> {

		protected ObjectReviewed_Page createDTO() {
			return new ObjectReviewed_Page();
		}

		protected ObjectReviewed_Page[] createDTOArray(int size) {
			return new ObjectReviewed_Page[size];
		}

		protected void setField(
			ObjectReviewed_Page objectReviewed_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					objectReviewed_Page.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ObjectReviewedSerDes.toDTO((String)object)
						).toArray(
							size -> new ObjectReviewed[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					objectReviewed_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					objectReviewed_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					objectReviewed_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					objectReviewed_Page.setTotalCount(
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