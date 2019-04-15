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
import com.liferay.headless.admin.user.client.dto.v1_0.ContactInformation_Page;
import com.liferay.headless.admin.user.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContactInformation_PageSerDes {

	public static ContactInformation_Page toDTO(String json) {
		ContactInformation_PageJSONParser contactInformation_PageJSONParser =
			new ContactInformation_PageJSONParser();

		return contactInformation_PageJSONParser.parseToDTO(json);
	}

	public static ContactInformation_Page[] toDTOs(String json) {
		ContactInformation_PageJSONParser contactInformation_PageJSONParser =
			new ContactInformation_PageJSONParser();

		return contactInformation_PageJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		ContactInformation_Page contactInformation_Page) {

		if (contactInformation_Page == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"items\": ");

		if (contactInformation_Page.getItems() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contactInformation_Page.getItems().length;
				 i++) {

				sb.append(
					ContactInformationSerDes.toJSON(
						contactInformation_Page.getItems()[i]));

				if ((i + 1) < contactInformation_Page.getItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"lastPage\": ");

		if (contactInformation_Page.getLastPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contactInformation_Page.getLastPage());
		}

		sb.append(", ");

		sb.append("\"page\": ");

		if (contactInformation_Page.getPage() == null) {
			sb.append("null");
		}
		else {
			sb.append(contactInformation_Page.getPage());
		}

		sb.append(", ");

		sb.append("\"pageSize\": ");

		if (contactInformation_Page.getPageSize() == null) {
			sb.append("null");
		}
		else {
			sb.append(contactInformation_Page.getPageSize());
		}

		sb.append(", ");

		sb.append("\"totalCount\": ");

		if (contactInformation_Page.getTotalCount() == null) {
			sb.append("null");
		}
		else {
			sb.append(contactInformation_Page.getTotalCount());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class ContactInformation_PageJSONParser
		extends BaseJSONParser<ContactInformation_Page> {

		protected ContactInformation_Page createDTO() {
			return new ContactInformation_Page();
		}

		protected ContactInformation_Page[] createDTOArray(int size) {
			return new ContactInformation_Page[size];
		}

		protected void setField(
			ContactInformation_Page contactInformation_Page,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "items")) {
				if (jsonParserFieldValue != null) {
					contactInformation_Page.setItems(
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
					contactInformation_Page.setLastPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "page")) {
				if (jsonParserFieldValue != null) {
					contactInformation_Page.setPage(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pageSize")) {
				if (jsonParserFieldValue != null) {
					contactInformation_Page.setPageSize(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "totalCount")) {
				if (jsonParserFieldValue != null) {
					contactInformation_Page.setTotalCount(
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