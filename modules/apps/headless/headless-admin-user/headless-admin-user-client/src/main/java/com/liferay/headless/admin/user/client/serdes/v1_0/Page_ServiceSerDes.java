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

import com.liferay.headless.admin.user.client.dto.v1_0.Page_Service;
import com.liferay.headless.admin.user.client.dto.v1_0.Service;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Page_ServiceSerDes {

	public static Page_Service toDTO(String json) {
		Page_ServiceJSONParser page_ServiceJSONParser =
			new Page_ServiceJSONParser();

		return page_ServiceJSONParser.parseToDTO(json);
	}

	public static Page_Service[] toDTOs(String json) {
		Page_ServiceJSONParser page_ServiceJSONParser =
			new Page_ServiceJSONParser();

		return page_ServiceJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Page_Service page_Service) {
		if (page_Service == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (page_Service.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < page_Service.getItems().length; i++) {
				sb.append(ServiceSerDes.toJSON(page_Service.getItems()[i]));

				if ((i + 1) < page_Service.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (page_Service.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Service.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (page_Service.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Service.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (page_Service.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Service.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (page_Service.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(page_Service.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Page_ServiceJSONParser
		extends BaseJSONParser<Page_Service> {

		protected Page_Service createDTO() {
			return new Page_Service();
		}

		protected Page_Service[] createDTOArray(int size) {
			return new Page_Service[size];
		}

		protected void setField(
			Page_Service page_Service, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					page_Service.setItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> ServiceSerDes.toDTO((String)object)
						).toArray(
							size -> new Service[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "lastPage")) {
				if (jsonParserFieldValue != null) {
					page_Service.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					page_Service.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					page_Service.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					page_Service.setTotalCount(
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