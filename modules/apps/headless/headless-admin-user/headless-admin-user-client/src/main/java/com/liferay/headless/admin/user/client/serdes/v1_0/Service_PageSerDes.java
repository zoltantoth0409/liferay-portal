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

import com.liferay.headless.admin.user.client.dto.v1_0.Service;
import com.liferay.headless.admin.user.client.dto.v1_0.Service_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Service_PageSerDes {

	public static Service_Page toDTO(String json) {
		Service_PageJSONParser service_PageJSONParser =
			new Service_PageJSONParser();

		return service_PageJSONParser.parseToDTO(json);
	}

	public static Service_Page[] toDTOs(String json) {
		Service_PageJSONParser service_PageJSONParser =
			new Service_PageJSONParser();

		return service_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Service_Page service_Page) {
		if (service_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (service_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < service_Page.getItems().length; i++) {
				sb.append(ServiceSerDes.toJSON(service_Page.getItems()[i]));

				if ((i + 1) < service_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (service_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(service_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (service_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(service_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (service_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(service_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (service_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(service_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class Service_PageJSONParser
		extends BaseJSONParser<Service_Page> {

		protected Service_Page createDTO() {
			return new Service_Page();
		}

		protected Service_Page[] createDTOArray(int size) {
			return new Service_Page[size];
		}

		protected void setField(
			Service_Page service_Page, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					service_Page.setItems(
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
					service_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					service_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					service_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					service_Page.setTotalCount(
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