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

import com.liferay.data.engine.rest.client.dto.v1_0.CustomProperty;
import com.liferay.data.engine.rest.client.dto.v1_0.DataDefinitionField;
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
public class DataDefinitionFieldSerDes {

	public static DataDefinitionField toDTO(String json) {
		DataDefinitionFieldJSONParser dataDefinitionFieldJSONParser =
			new DataDefinitionFieldJSONParser();

		return dataDefinitionFieldJSONParser.parseToDTO(json);
	}

	public static DataDefinitionField[] toDTOs(String json) {
		DataDefinitionFieldJSONParser dataDefinitionFieldJSONParser =
			new DataDefinitionFieldJSONParser();

		return dataDefinitionFieldJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DataDefinitionField dataDefinitionField) {
		if (dataDefinitionField == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"customProperties\": ");

		if (dataDefinitionField.getCustomProperties() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0;
				 i < dataDefinitionField.getCustomProperties().length; i++) {

				sb.append(
					CustomPropertySerDes.toJSON(
						dataDefinitionField.getCustomProperties()[i]));

				if ((i + 1) <
						dataDefinitionField.getCustomProperties().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"defaultValue\": ");

		if (dataDefinitionField.getDefaultValue() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataDefinitionField.getDefaultValue().length;
				 i++) {

				sb.append(
					LocalizedValueSerDes.toJSON(
						dataDefinitionField.getDefaultValue()[i]));

				if ((i + 1) < dataDefinitionField.getDefaultValue().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"fieldType\": ");

		if (dataDefinitionField.getFieldType() == null) {
			sb.append("null");
		}
		else {
			sb.append("\"");

			sb.append(dataDefinitionField.getFieldType());

			sb.append("\"");
		}

		sb.append(", ");

		sb.append("\"id\": ");

		if (dataDefinitionField.getId() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionField.getId());
		}

		sb.append(", ");

		sb.append("\"indexable\": ");

		if (dataDefinitionField.getIndexable() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionField.getIndexable());
		}

		sb.append(", ");

		sb.append("\"label\": ");

		if (dataDefinitionField.getLabel() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataDefinitionField.getLabel().length; i++) {
				sb.append(
					LocalizedValueSerDes.toJSON(
						dataDefinitionField.getLabel()[i]));

				if ((i + 1) < dataDefinitionField.getLabel().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"localizable\": ");

		if (dataDefinitionField.getLocalizable() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionField.getLocalizable());
		}

		sb.append(", ");

		sb.append("\"name\": ");

		if (dataDefinitionField.getName() == null) {
			sb.append("null");
		}
		else {
			sb.append("\"");

			sb.append(dataDefinitionField.getName());

			sb.append("\"");
		}

		sb.append(", ");

		sb.append("\"repeatable\": ");

		if (dataDefinitionField.getRepeatable() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionField.getRepeatable());
		}

		sb.append(", ");

		sb.append("\"tip\": ");

		if (dataDefinitionField.getTip() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataDefinitionField.getTip().length; i++) {
				sb.append(
					LocalizedValueSerDes.toJSON(
						dataDefinitionField.getTip()[i]));

				if ((i + 1) < dataDefinitionField.getTip().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	private static class DataDefinitionFieldJSONParser
		extends BaseJSONParser<DataDefinitionField> {

		@Override
		protected DataDefinitionField createDTO() {
			return new DataDefinitionField();
		}

		@Override
		protected DataDefinitionField[] createDTOArray(int size) {
			return new DataDefinitionField[size];
		}

		@Override
		protected void setField(
			DataDefinitionField dataDefinitionField, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "customProperties")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setCustomProperties(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> CustomPropertySerDes.toDTO((String)object)
						).toArray(
							size -> new CustomProperty[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "defaultValue")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setDefaultValue(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> LocalizedValueSerDes.toDTO((String)object)
						).toArray(
							size -> new LocalizedValue[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "fieldType")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setFieldType(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "indexable")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setIndexable(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "label")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setLabel(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> LocalizedValueSerDes.toDTO((String)object)
						).toArray(
							size -> new LocalizedValue[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "localizable")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setLocalizable(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "repeatable")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setRepeatable(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "tip")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionField.setTip(
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