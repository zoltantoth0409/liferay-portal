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

package com.liferay.info.fields;

import com.liferay.info.fields.type.InfoItemFieldType;
import com.liferay.petra.lang.HashUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/**
 * @author Jürgen Kappler
 */
public class InfoItemField {

	public InfoItemField(
		String key, Map<Locale, String> labels,
		InfoItemFieldType itemFieldType) {

		_key = key;
		_labels = labels;
		_itemFieldType = itemFieldType;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InfoItemField)) {
			return false;
		}

		InfoItemField infoDisplayField = (InfoItemField)obj;

		if (Objects.equals(_key, infoDisplayField._key) &&
			Objects.equals(_labels, infoDisplayField._labels) &&
			Objects.equals(_itemFieldType, infoDisplayField._itemFieldType)) {

			return true;
		}

		return false;
	}

	public String getKey() {
		return _key;
	}

	public String getLabel(Locale locale) {
		return _labels.get(locale);
	}

	public InfoItemFieldType getItemFieldType() {
		return _itemFieldType;
	}

	@Override
	public int hashCode() {
		int hash = HashUtil.hash(0, _key);

		hash = HashUtil.hash(hash, _labels);

		return HashUtil.hash(hash, _itemFieldType);
	}

	public JSONObject toJSONObject() {
		return JSONUtil.put(
			"key", getKey()
		).put(
			"labels", _labels   //TODO: Review
		).put(
			"type", _itemFieldType.getName()
		);
	}

	private final InfoItemFieldType _itemFieldType;
	private final String _key;
	private final Map<Locale, String> _labels;

}