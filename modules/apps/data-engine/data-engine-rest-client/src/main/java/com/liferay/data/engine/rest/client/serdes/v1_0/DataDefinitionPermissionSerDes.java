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

import com.liferay.data.engine.rest.client.dto.v1_0.DataDefinitionPermission;
import com.liferay.data.engine.rest.client.json.BaseJSONParser;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
public class DataDefinitionPermissionSerDes {

	public static DataDefinitionPermission toDTO(String json) {
		DataDefinitionPermissionJSONParser dataDefinitionPermissionJSONParser =
			new DataDefinitionPermissionJSONParser();

		return dataDefinitionPermissionJSONParser.parseToDTO(json);
	}

	public static DataDefinitionPermission[] toDTOs(String json) {
		DataDefinitionPermissionJSONParser dataDefinitionPermissionJSONParser =
			new DataDefinitionPermissionJSONParser();

		return dataDefinitionPermissionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		DataDefinitionPermission dataDefinitionPermission) {

		if (dataDefinitionPermission == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"addDataDefinition\": ");

		if (dataDefinitionPermission.getAddDataDefinition() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionPermission.getAddDataDefinition());
		}

		sb.append(", ");

		sb.append("\"definePermissions\": ");

		if (dataDefinitionPermission.getDefinePermissions() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionPermission.getDefinePermissions());
		}

		sb.append(", ");

		sb.append("\"delete\": ");

		if (dataDefinitionPermission.getDelete() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionPermission.getDelete());
		}

		sb.append(", ");

		sb.append("\"roleNames\": ");

		if (dataDefinitionPermission.getRoleNames() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataDefinitionPermission.getRoleNames().length;
				 i++) {

				sb.append("\"");

				sb.append(dataDefinitionPermission.getRoleNames()[i]);

				sb.append("\"");

				if ((i + 1) < dataDefinitionPermission.getRoleNames().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"update\": ");

		if (dataDefinitionPermission.getUpdate() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionPermission.getUpdate());
		}

		sb.append(", ");

		sb.append("\"view\": ");

		if (dataDefinitionPermission.getView() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataDefinitionPermission.getView());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class DataDefinitionPermissionJSONParser
		extends BaseJSONParser<DataDefinitionPermission> {

		@Override
		protected DataDefinitionPermission createDTO() {
			return new DataDefinitionPermission();
		}

		@Override
		protected DataDefinitionPermission[] createDTOArray(int size) {
			return new DataDefinitionPermission[size];
		}

		@Override
		protected void setField(
			DataDefinitionPermission dataDefinitionPermission,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "addDataDefinition")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionPermission.setAddDataDefinition(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "definePermissions")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionPermission.setDefinePermissions(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "delete")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionPermission.setDelete(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "roleNames")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionPermission.setRoleNames(
						toStrings((Object[])jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "update")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionPermission.setUpdate(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "view")) {
				if (jsonParserFieldValue != null) {
					dataDefinitionPermission.setView(
						(Boolean)jsonParserFieldValue);
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}