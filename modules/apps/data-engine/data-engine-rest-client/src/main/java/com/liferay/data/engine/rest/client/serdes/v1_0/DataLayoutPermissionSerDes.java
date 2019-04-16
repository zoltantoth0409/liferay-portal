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

import com.liferay.data.engine.rest.client.dto.v1_0.DataLayoutPermission;
import com.liferay.data.engine.rest.client.json.BaseJSONParser;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
public class DataLayoutPermissionSerDes {

	public static DataLayoutPermission toDTO(String json) {
		DataLayoutPermissionJSONParser dataLayoutPermissionJSONParser =
			new DataLayoutPermissionJSONParser();

		return dataLayoutPermissionJSONParser.parseToDTO(json);
	}

	public static DataLayoutPermission[] toDTOs(String json) {
		DataLayoutPermissionJSONParser dataLayoutPermissionJSONParser =
			new DataLayoutPermissionJSONParser();

		return dataLayoutPermissionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DataLayoutPermission dataLayoutPermission) {
		if (dataLayoutPermission == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"addDataLayout\": ");

		if (dataLayoutPermission.getAddDataLayout() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayoutPermission.getAddDataLayout());
		}

		sb.append(", ");

		sb.append("\"definePermissions\": ");

		if (dataLayoutPermission.getDefinePermissions() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayoutPermission.getDefinePermissions());
		}

		sb.append(", ");

		sb.append("\"delete\": ");

		if (dataLayoutPermission.getDelete() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayoutPermission.getDelete());
		}

		sb.append(", ");

		sb.append("\"roleNames\": ");

		if (dataLayoutPermission.getRoleNames() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < dataLayoutPermission.getRoleNames().length;
				 i++) {

				sb.append("\"");

				sb.append(dataLayoutPermission.getRoleNames()[i]);

				sb.append("\"");

				if ((i + 1) < dataLayoutPermission.getRoleNames().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"update\": ");

		if (dataLayoutPermission.getUpdate() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayoutPermission.getUpdate());
		}

		sb.append(", ");

		sb.append("\"view\": ");

		if (dataLayoutPermission.getView() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataLayoutPermission.getView());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, String> toMap(
		DataLayoutPermission dataLayoutPermission) {

		if (dataLayoutPermission == null) {
			return null;
		}

		Map<String, String> map = new HashMap<>();

		map.put(
			"addDataLayout",
			String.valueOf(dataLayoutPermission.getAddDataLayout()));

		map.put(
			"definePermissions",
			String.valueOf(dataLayoutPermission.getDefinePermissions()));

		map.put("delete", String.valueOf(dataLayoutPermission.getDelete()));

		map.put(
			"roleNames", String.valueOf(dataLayoutPermission.getRoleNames()));

		map.put("update", String.valueOf(dataLayoutPermission.getUpdate()));

		map.put("view", String.valueOf(dataLayoutPermission.getView()));

		return map;
	}

	private static class DataLayoutPermissionJSONParser
		extends BaseJSONParser<DataLayoutPermission> {

		@Override
		protected DataLayoutPermission createDTO() {
			return new DataLayoutPermission();
		}

		@Override
		protected DataLayoutPermission[] createDTOArray(int size) {
			return new DataLayoutPermission[size];
		}

		@Override
		protected void setField(
			DataLayoutPermission dataLayoutPermission,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "addDataLayout")) {
				if (jsonParserFieldValue != null) {
					dataLayoutPermission.setAddDataLayout(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "definePermissions")) {
				if (jsonParserFieldValue != null) {
					dataLayoutPermission.setDefinePermissions(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "delete")) {
				if (jsonParserFieldValue != null) {
					dataLayoutPermission.setDelete(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "roleNames")) {
				if (jsonParserFieldValue != null) {
					dataLayoutPermission.setRoleNames(
						toStrings((Object[])jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "update")) {
				if (jsonParserFieldValue != null) {
					dataLayoutPermission.setUpdate(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "view")) {
				if (jsonParserFieldValue != null) {
					dataLayoutPermission.setView((Boolean)jsonParserFieldValue);
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}