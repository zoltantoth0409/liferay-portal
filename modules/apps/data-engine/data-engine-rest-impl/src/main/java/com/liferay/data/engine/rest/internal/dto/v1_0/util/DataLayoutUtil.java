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

import com.liferay.data.engine.rest.dto.v1_0.DataLayout;
import com.liferay.data.engine.rest.dto.v1_0.DataLayoutColumn;
import com.liferay.data.engine.rest.dto.v1_0.DataLayoutPage;
import com.liferay.data.engine.rest.dto.v1_0.DataLayoutRow;
import com.liferay.data.engine.rest.dto.v1_0.LocalizedValue;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeyvison Nascimento
 */
public class DataLayoutUtil {

	public static DataLayout toDataLayout(String json) throws Exception {
		DataLayout dataLayout = new DataLayout();

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(json);

		dataLayout.setPaginationMode(jsonObject.getString("paginationMode"));
		dataLayout.setDefaultLanguageId(
			jsonObject.getString("defaultLanguageId"));

		_createDEDataLayoutPages(dataLayout, jsonObject);

		return dataLayout;
	}

	public static String toJSON(DataLayout dataLayout) throws Exception {
		String defaultLanguageId = dataLayout.getDefaultLanguageId();

		if (Validator.isNull(defaultLanguageId)) {
			throw new Exception("Default language id cannot be null or empty");
		}

		String paginationMode = dataLayout.getPaginationMode();

		if (Validator.isNull(paginationMode) ||
			!ArrayUtil.contains(_PAGINATION_MODES, paginationMode)) {

			throw new Exception(
				"Pagination mode must be 'wizard' or 'pagination'");
		}

		DataLayoutPage[] dataLayoutPages = dataLayout.getDataLayoutPages();

		JSONArray pages = JSONFactoryUtil.createJSONArray();

		for (DataLayoutPage dataLayoutPage : dataLayoutPages) {
			LocalizedValue[] title = dataLayoutPage.getTitle();

			if (title.length < 1) {
				throw new Exception("Page title cannot be empty ");
			}

			JSONObject page = JSONFactoryUtil.createJSONObject();

			page.put("description", dataLayoutPage.getDescription());

			page.put("rows", _toJSONArray(dataLayoutPage.getDataLayoutRows()));

			page.put("title", title);

			pages.put(page);
		}

		return JSONUtil.put(
			"defaultLanguageId", defaultLanguageId
		).put(
			"pages", pages
		).put(
			"paginationMode", paginationMode
		).toString();
	}

	private static void _createDEDataLayoutPages(
		DataLayout dataLayout, JSONObject jsonObject) {

		if (jsonObject.has("pages")) {
			List<DataLayoutPage> dataLayoutPages = new ArrayList<>();

			JSONArray jsonArray = jsonObject.getJSONArray("pages");

			for (Object pageObject : jsonArray) {
				JSONObject page = (JSONObject)pageObject;

				DataLayoutPage dataLayoutPage = new DataLayoutPage();

				dataLayoutPage.setDescription(
					LocalizedValueUtil.toLocalizedValues(
						page.getJSONObject("description")));

				dataLayoutPage.setDataLayoutRows(
					_toDataLayoutRows(page.getJSONArray("rows")));

				dataLayoutPage.setTitle(
					LocalizedValueUtil.toLocalizedValues(
						page.getJSONObject("title")));

				dataLayoutPages.add(dataLayoutPage);
			}

			dataLayout.setDataLayoutPages(
				dataLayoutPages.toArray(
					new DataLayoutPage[dataLayoutPages.size()]));
		}
	}

	private static DataLayoutColumn[] _toDataLayoutColumns(
		JSONArray jsonArray) {

		List<DataLayoutColumn> dataLayoutColumns = new ArrayList<>();

		for (Object object : jsonArray) {
			DataLayoutColumn dataLayoutColumn = new DataLayoutColumn();

			JSONObject jsonObject = (JSONObject)object;

			dataLayoutColumn.setColumnSize(jsonObject.getInt("columnSize"));
			dataLayoutColumn.setFieldsName(
				JSONUtil.toStringArray(jsonObject.getJSONArray("fieldNames")));

			dataLayoutColumns.add(dataLayoutColumn);
		}

		return dataLayoutColumns.toArray(
			new DataLayoutColumn[dataLayoutColumns.size()]);
	}

	private static DataLayoutRow[] _toDataLayoutRows(JSONArray jsonArray) {
		List<DataLayoutRow> dataLayoutRows = new ArrayList<>();

		for (Object object : jsonArray) {
			DataLayoutRow dataLayoutRow = new DataLayoutRow();

			JSONObject jsonObject = (JSONObject)object;

			dataLayoutRow.setDataLayoutColums(
				_toDataLayoutColumns(jsonObject.getJSONArray("columns")));

			dataLayoutRows.add(dataLayoutRow);
		}

		return dataLayoutRows.toArray(new DataLayoutRow[dataLayoutRows.size()]);
	}

	private static JSONArray _toJSONArray(DataLayoutRow[] dataLayoutRows) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (DataLayoutRow dataLayoutRow : dataLayoutRows) {
			jsonArray.put(_toJSONObject(dataLayoutRow.getDataLayoutColums()));
		}

		return jsonArray;
	}

	private static JSONObject _toJSONObject(
		DataLayoutColumn[] dataLayoutColumns) {

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (DataLayoutColumn dataLayoutColumn : dataLayoutColumns) {
			JSONArray fieldNames = JSONFactoryUtil.createJSONArray();

			for (String fieldName : dataLayoutColumn.getFieldsName()) {
				fieldNames.put(fieldName);
			}

			jsonArray.put(
				JSONUtil.put(
					"size", dataLayoutColumn.getColumnSize()
				).put(
					"fieldNames", fieldNames
				));
		}

		return JSONUtil.put("columns", jsonArray);
	}

	private static final String[] _PAGINATION_MODES = {"wizard", "pagination"};

}