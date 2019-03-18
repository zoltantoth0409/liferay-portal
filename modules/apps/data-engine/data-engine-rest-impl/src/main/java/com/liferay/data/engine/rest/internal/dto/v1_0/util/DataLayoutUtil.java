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

		dataLayout.setDefaultLanguageId(
			jsonObject.getString("defaultLanguageId"));
		dataLayout.setDataLayoutPages(
			_toDataLayoutPages(jsonObject.getJSONArray("pages")));
		dataLayout.setPaginationMode(jsonObject.getString("paginationMode"));

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

		return JSONUtil.put(
			"defaultLanguageId", defaultLanguageId
		).put(
			"pages", _toJSONArray(dataLayout.getDataLayoutPages())
		).put(
			"paginationMode", paginationMode
		).toString();
	}

	private static JSONObject _toJSONObject(DataLayoutPage dataLayoutPage)
		throws Exception {

		if (ArrayUtil.isEmpty(dataLayoutPage.getTitle())) {
			throw new Exception("Title is required");
		}

		return JSONUtil.put(
			"description", dataLayoutPage.getDescription()
		).put(
			"rows",
			_toJSONArray(dataLayoutPage.getDataLayoutRows())
		).put(
			"title", dataLayoutPage.getTitle()
		);
	}

	private static JSONArray _toJSONArray(DataLayoutPage[] dataLayoutPages)
		throws Exception {

		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (DataLayoutPage dataLayoutPage : dataLayoutPages) {
			jsonArray.put(_toJSONObject(dataLayoutPage));
		}

		return jsonArray;
	}

	private static DataLayoutPage _toDataLayoutPage(JSONObject jsonObject) {
		return new DataLayoutPage() {
			{
				dataLayoutRows = _toDataLayoutRows(
					jsonObject.getJSONArray("rows"));
				description = LocalizedValueUtil.toLocalizedValues(
					jsonObject.getJSONObject("description"));
				title = LocalizedValueUtil.toLocalizedValues(
					jsonObject.getJSONObject("title"));
			}
		};
	}

	private static DataLayoutPage[] _toDataLayoutPages(JSONArray jsonArray) {
		if (jsonArray == null) {
			return null;
		}

		List<DataLayoutPage> dataLayoutPages = new ArrayList<>();

		for (Object object : jsonArray) {
			JSONObject jsonObject = (JSONObject)object;

			dataLayoutPages.add(_toDataLayoutPage(jsonObject));
		}

		return dataLayoutPages.toArray(
			new DataLayoutPage[dataLayoutPages.size()]);
	}

	private static DataLayoutColumn _toDataLayoutColumn(
		JSONObject jsonObject) {

		return new DataLayoutColumn() {
			{
				columnSize = jsonObject.getInt("columnSize");
				fieldNames = JSONUtil.toStringArray(
					jsonObject.getJSONArray("fieldNames"));
			}
		};
	}

	private static DataLayoutColumn[] _toDataLayoutColumns(
		JSONArray jsonArray) {

		List<DataLayoutColumn> dataLayoutColumns = new ArrayList<>();

		for (Object object : jsonArray) {
			JSONObject jsonObject = (JSONObject)object;

			dataLayoutColumns.add(_toDataLayoutColumn(jsonObject));
		}

		return dataLayoutColumns.toArray(
			new DataLayoutColumn[dataLayoutColumns.size()]);
	}

	private static DataLayoutRow _toDataLayoutRow(JSONObject jsonObject) {
		return new DataLayoutRow() {
			{
				dataLayoutColums = _toDataLayoutColumns(
					jsonObject.getJSONArray("columns"));
			}
		};
	}

	private static DataLayoutRow[] _toDataLayoutRows(JSONArray jsonArray) {
		List<DataLayoutRow> dataLayoutRows = new ArrayList<>();

		for (Object object : jsonArray) {
			JSONObject jsonObject = (JSONObject)object;

			dataLayoutRows.add(_toDataLayoutRow(jsonObject));
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
			jsonArray.put(
				JSONUtil.put(
					"size", dataLayoutColumn.getColumnSize()
				).put(
					"fieldNames",
					JSONUtil.put(dataLayoutColumn.getFieldNames())
				));
		}

		return JSONUtil.put("columns", jsonArray);
	}

	private static final String[] _PAGINATION_MODES = {"wizard", "pagination"};

}