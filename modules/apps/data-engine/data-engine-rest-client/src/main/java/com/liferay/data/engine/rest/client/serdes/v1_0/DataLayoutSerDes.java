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

package com.liferay.data.engine.rest.client.serdes.v1_0;

import com.liferay.data.engine.rest.client.dto.v1_0.DataLayout;
import com.liferay.data.engine.rest.client.dto.v1_0.DataLayoutPage;
import com.liferay.data.engine.rest.client.dto.v1_0.LocalizedValue;
import com.liferay.data.engine.rest.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
public class DataLayoutSerDes {

	public static DataLayout toDTO(String json) {
		DataLayoutJSONParser dataLayoutJSONParser = new DataLayoutJSONParser();

		return dataLayoutJSONParser.parseToDTO(json);
	}

	public static DataLayout[] toDTOs(String json) {
		DataLayoutJSONParser dataLayoutJSONParser = new DataLayoutJSONParser();

		return dataLayoutJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DataLayout dataLayout) {
		if (dataLayout == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		sb.append("\"dataDefinitionId\": ");

		if (dataLayout.getDataDefinitionId() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayout.getDataDefinitionId());
		}

		sb.append(", ");

		sb.append("\"dataLayoutPages\": ");

		if (dataLayout.getDataLayoutPages() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataLayout.getDataLayoutPages().length; i++) {
				sb.append(
					DataLayoutPageSerDes.toJSON(
						dataLayout.getDataLayoutPages()[i]));

				if ((i + 1) < dataLayout.getDataLayoutPages().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"dateCreated\": ");

		if (dataLayout.getDateCreated() == null) {
			sb.append("null");
		}
		else {
			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(dataLayout.getDateCreated()));

			sb.append("\"");
		}

		sb.append(", ");

		sb.append("\"dateModified\": ");

		if (dataLayout.getDateModified() == null) {
			sb.append("null");
		}
		else {
			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(dataLayout.getDateModified()));

			sb.append("\"");
		}

		sb.append(", ");

		sb.append("\"defaultLanguageId\": ");

		if (dataLayout.getDefaultLanguageId() == null) {
			sb.append("null");
		}
		else {
			sb.append("\"");

			sb.append(dataLayout.getDefaultLanguageId());

			sb.append("\"");
		}

		sb.append(", ");

		sb.append("\"description\": ");

		if (dataLayout.getDescription() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataLayout.getDescription().length; i++) {
				sb.append(
					LocalizedValueSerDes.toJSON(
						dataLayout.getDescription()[i]));

				if ((i + 1) < dataLayout.getDescription().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"id\": ");

		if (dataLayout.getId() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayout.getId());
		}

		sb.append(", ");

		sb.append("\"name\": ");

		if (dataLayout.getName() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataLayout.getName().length; i++) {
				sb.append(LocalizedValueSerDes.toJSON(dataLayout.getName()[i]));

				if ((i + 1) < dataLayout.getName().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"paginationMode\": ");

		if (dataLayout.getPaginationMode() == null) {
			sb.append("null");
		}
		else {
			sb.append("\"");

			sb.append(dataLayout.getPaginationMode());

			sb.append("\"");
		}

		sb.append(", ");

		sb.append("\"userId\": ");

		if (dataLayout.getUserId() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayout.getUserId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, String> toMap(DataLayout dataLayout) {
		if (dataLayout == null) {
			return null;
		}

		Map<String, String> map = new HashMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		map.put(
			"dataDefinitionId",
			String.valueOf(dataLayout.getDataDefinitionId()));

		map.put(
			"dataLayoutPages", String.valueOf(dataLayout.getDataLayoutPages()));

		map.put(
			"dateCreated",
			liferayToJSONDateFormat.format(dataLayout.getDateCreated()));

		map.put(
			"dateModified",
			liferayToJSONDateFormat.format(dataLayout.getDateModified()));

		map.put(
			"defaultLanguageId",
			String.valueOf(dataLayout.getDefaultLanguageId()));

		map.put("description", String.valueOf(dataLayout.getDescription()));

		map.put("id", String.valueOf(dataLayout.getId()));

		map.put("name", String.valueOf(dataLayout.getName()));

		map.put(
			"paginationMode", String.valueOf(dataLayout.getPaginationMode()));

		map.put("userId", String.valueOf(dataLayout.getUserId()));

		return map;
	}

	private static class DataLayoutJSONParser
		extends BaseJSONParser<DataLayout> {

		@Override
		protected DataLayout createDTO() {
			return new DataLayout();
		}

		@Override
		protected DataLayout[] createDTOArray(int size) {
			return new DataLayout[size];
		}

		@Override
		protected void setField(
			DataLayout dataLayout, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dataDefinitionId")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setDataDefinitionId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dataLayoutPages")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setDataLayoutPages(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> DataLayoutPageSerDes.toDTO((String)object)
						).toArray(
							size -> new DataLayoutPage[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateCreated")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setDateCreated(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateModified")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setDateModified(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "defaultLanguageId")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setDefaultLanguageId(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setDescription(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> LocalizedValueSerDes.toDTO((String)object)
						).toArray(
							size -> new LocalizedValue[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setName(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> LocalizedValueSerDes.toDTO((String)object)
						).toArray(
							size -> new LocalizedValue[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "paginationMode")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setPaginationMode((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "userId")) {
				if (jsonParserFieldValue != null) {
					dataLayout.setUserId(
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