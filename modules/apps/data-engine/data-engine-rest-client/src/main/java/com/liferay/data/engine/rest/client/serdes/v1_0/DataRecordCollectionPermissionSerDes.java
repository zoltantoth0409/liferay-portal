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

import com.liferay.data.engine.rest.client.dto.v1_0.DataRecordCollectionPermission;
import com.liferay.data.engine.rest.client.json.BaseJSONParser;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
public class DataRecordCollectionPermissionSerDes {

	public static DataRecordCollectionPermission toDTO(String json) {
		DataRecordCollectionPermissionJSONParser
			dataRecordCollectionPermissionJSONParser =
				new DataRecordCollectionPermissionJSONParser();

		return dataRecordCollectionPermissionJSONParser.parseToDTO(json);
	}

	public static DataRecordCollectionPermission[] toDTOs(String json) {
		DataRecordCollectionPermissionJSONParser
			dataRecordCollectionPermissionJSONParser =
				new DataRecordCollectionPermissionJSONParser();

		return dataRecordCollectionPermissionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		DataRecordCollectionPermission dataRecordCollectionPermission) {

		if (dataRecordCollectionPermission == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"addDataRecord\": ");

		if (dataRecordCollectionPermission.getAddDataRecord() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getAddDataRecord());
		}

		sb.append(", ");

		sb.append("\"addDataRecordCollection\": ");

		if (dataRecordCollectionPermission.getAddDataRecordCollection() ==
				null) {

			sb.append("null");
		}
		else {
			sb.append(
				dataRecordCollectionPermission.getAddDataRecordCollection());
		}

		sb.append(", ");

		sb.append("\"definePermissions\": ");

		if (dataRecordCollectionPermission.getDefinePermissions() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getDefinePermissions());
		}

		sb.append(", ");

		sb.append("\"delete\": ");

		if (dataRecordCollectionPermission.getDelete() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getDelete());
		}

		sb.append(", ");

		sb.append("\"deleteDataRecord\": ");

		if (dataRecordCollectionPermission.getDeleteDataRecord() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getDeleteDataRecord());
		}

		sb.append(", ");

		sb.append("\"exportDataRecord\": ");

		if (dataRecordCollectionPermission.getExportDataRecord() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getExportDataRecord());
		}

		sb.append(", ");

		sb.append("\"roleNames\": ");

		if (dataRecordCollectionPermission.getRoleNames() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0;
				 i < dataRecordCollectionPermission.getRoleNames().length;
				 i++) {

				sb.append("\"");

				sb.append(dataRecordCollectionPermission.getRoleNames()[i]);

				sb.append("\"");

				if ((i + 1) <
						dataRecordCollectionPermission.getRoleNames().length) {

					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		sb.append("\"update\": ");

		if (dataRecordCollectionPermission.getUpdate() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getUpdate());
		}

		sb.append(", ");

		sb.append("\"updateDataRecord\": ");

		if (dataRecordCollectionPermission.getUpdateDataRecord() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getUpdateDataRecord());
		}

		sb.append(", ");

		sb.append("\"view\": ");

		if (dataRecordCollectionPermission.getView() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getView());
		}

		sb.append(", ");

		sb.append("\"viewDataRecord\": ");

		if (dataRecordCollectionPermission.getViewDataRecord() == null) {
			sb.append("null");
		}
		else {
			sb.append(dataRecordCollectionPermission.getViewDataRecord());
		}

		sb.append("}");

		return sb.toString();
	}

	private static class DataRecordCollectionPermissionJSONParser
		extends BaseJSONParser<DataRecordCollectionPermission> {

		@Override
		protected DataRecordCollectionPermission createDTO() {
			return new DataRecordCollectionPermission();
		}

		@Override
		protected DataRecordCollectionPermission[] createDTOArray(int size) {
			return new DataRecordCollectionPermission[size];
		}

		@Override
		protected void setField(
			DataRecordCollectionPermission dataRecordCollectionPermission,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "addDataRecord")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setAddDataRecord(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "addDataRecordCollection")) {

				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setAddDataRecordCollection(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "definePermissions")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setDefinePermissions(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "delete")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setDelete(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "deleteDataRecord")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setDeleteDataRecord(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "exportDataRecord")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setExportDataRecord(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "roleNames")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setRoleNames(
						toStrings((Object[])jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "update")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setUpdate(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "updateDataRecord")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setUpdateDataRecord(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "view")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setView(
						(Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "viewDataRecord")) {
				if (jsonParserFieldValue != null) {
					dataRecordCollectionPermission.setViewDataRecord(
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