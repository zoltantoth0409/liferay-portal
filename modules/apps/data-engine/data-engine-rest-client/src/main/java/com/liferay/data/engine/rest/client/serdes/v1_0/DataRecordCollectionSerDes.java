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

import com.liferay.data.engine.rest.client.dto.v1_0.DataRecordCollection;
import com.liferay.data.engine.rest.client.dto.v1_0.LocalizedValue;
import com.liferay.data.engine.rest.client.json.BaseJSONParser;

import java.util.Objects;
import java.util.stream.Stream;

import javax.annotation.Generated;

/**
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
public class DataRecordCollectionSerDes {

	public static DataRecordCollection toDTO(String json) {
		DataRecordCollectionJSONParser dataRecordCollectionJSONParser =
			new DataRecordCollectionJSONParser();

		return dataRecordCollectionJSONParser.parseToDTO(json);
	}

	public static DataRecordCollection[] toDTOs(String json) {
		DataRecordCollectionJSONParser dataRecordCollectionJSONParser =
			new DataRecordCollectionJSONParser();

		return dataRecordCollectionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DataRecordCollection dataRecordCollection) {
		if (dataRecordCollection == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"dataDefinitionId\": ");

		if (dataRecordCollection.getDataDefinitionId() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollection.getDataDefinitionId());
		}

		sb.append(", ");

		sb.append("\"description\": ");

		if (dataRecordCollection.getDescription() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataRecordCollection.getDescription().length;
				 i++) {

				sb.append(
					LocalizedValueSerDes.toJSON(
						dataRecordCollection.getDescription()[i]));

				if ((i + 1) < dataRecordCollection.getDescription().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"id\": ");

		if (dataRecordCollection.getId() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollection.getId());
		}

		sb.append(", ");

		sb.append("\"name\": ");

		if (dataRecordCollection.getName() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataRecordCollection.getName().length; i++) {
				sb.append(
					LocalizedValueSerDes.toJSON(
						dataRecordCollection.getName()[i]));

				if ((i + 1) < dataRecordCollection.getName().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	private static class DataRecordCollectionJSONParser
		extends BaseJSONParser<DataRecordCollection> {

		@Override
		protected DataRecordCollection createDTO() {
			return new DataRecordCollection();
		}

		@Override
		protected DataRecordCollection[] createDTOArray(int size) {
			return new DataRecordCollection[size];
		}

		@Override
		protected void setField(
			DataRecordCollection dataRecordCollection,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "dataDefinitionId")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollection.setDataDefinitionId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollection.setDescription(
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
					dataRecordCollection.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollection.setName(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> LocalizedValueSerDes.toDTO((String)object)
						).toArray(
							size -> new LocalizedValue[size]
						));
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}