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

package com.liferay.data.engine.rest.internal.dto.v1_0.util;

import com.liferay.data.engine.rest.dto.v1_0.DataDefinition;
import com.liferay.data.engine.rest.dto.v1_0.DataDefinitionField;
import com.liferay.data.engine.rest.dto.v1_0.LocalizedValue;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jeyvison Nascimento
 */
public class DataDefinitionDeserializer {

	public static DataDefinition toDataDefinition(String json)
		throws Exception {

		return new DataDefinition() {
			{
				JSONObject jsonObject = JSONFactoryUtil.createJSONObject(json);

				dataDefinitionFields = _toDataDefinitionFields(
					jsonObject.getJSONArray("fields"));
			}
		};
	}

	private static DataDefinitionField _toDataDefinitionField(
			JSONObject jsonObject)
		throws Exception {

		return new DataDefinitionField() {
			{
				defaultValue = jsonObject.getString("defaultValue");

				if (!jsonObject.has("type")) {
					throw new Exception("Type is required");
				}

				fieldType = jsonObject.getString("type");

				indexable = jsonObject.getBoolean("indexable", true);

				if (!jsonObject.has("label")) {
					throw new Exception("Label is required");
				}

				label = _toLocalizedValues(jsonObject.getJSONObject("label"));

				localizable = jsonObject.getBoolean("localizable", false);

				if (!jsonObject.has("name")) {
					throw new Exception("Name is required");
				}

				name = jsonObject.getString("name");

				repeatable = jsonObject.getBoolean("repeatable", false);

				if (!jsonObject.has("tip")) {
					throw new Exception("Tip is required");
				}

				tip = _toLocalizedValues(jsonObject.getJSONObject("tip"));
			}
		};
	}

	private static DataDefinitionField[] _toDataDefinitionFields(
			JSONArray jsonArray)
		throws Exception {

		List<DataDefinitionField> dataDefinitionFields = new ArrayList<>(
			jsonArray.length());

		for (int i = 0; i < jsonArray.length(); i++) {
			DataDefinitionField dataDefinitionField = _toDataDefinitionField(
				jsonArray.getJSONObject(i));

			dataDefinitionFields.add(dataDefinitionField);
		}

		return dataDefinitionFields.toArray(
			new DataDefinitionField[dataDefinitionFields.size()]);
	}

	private static LocalizedValue[] _toLocalizedValues(JSONObject jsonObject) {
		List<LocalizedValue> localizedValues = new ArrayList<>();

		Iterator<String> keys = jsonObject.keys();

		while (keys.hasNext()) {
			LocalizedValue localizedValue = new LocalizedValue();

			String key = keys.next();

			localizedValue.setKey(key);
			localizedValue.setValue(jsonObject.getString(key));

			localizedValues.add(localizedValue);
		}

		return localizedValues.toArray(
			new LocalizedValue[localizedValues.size()]);
	}

}