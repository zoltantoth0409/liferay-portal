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

package com.liferay.info.internal.fields.reader;

import com.liferay.info.fields.reader.InfoItemFieldReader;
import com.liferay.info.fields.reader.InfoItemFieldReaderTracker;
import com.liferay.portal.kernel.util.Validator;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Jürgen Kappler
 * @author Jorge Ferrer
 */
@Component(immediate = true, service = InfoItemFieldReaderTracker.class)
public class InfoItemFieldReaderTrackerImpl
	implements InfoItemFieldReaderTracker {

	@Override
	public List<InfoItemFieldReader> getInfoItemFieldReader(
		String key) {

		if (Validator.isNull(key)) {
			return Collections.emptyList();
		}

		return _infoItemFieldReaders.get(key);
	}

	@Reference(
		cardinality = ReferenceCardinality.MULTIPLE,
		policy = ReferencePolicy.DYNAMIC
	)
	protected void setInfoItemFieldReader(
		InfoItemFieldReader infoItemFieldReader,
		Map<String, Object> properties) {

		List<InfoItemFieldReader> infoItemFieldReaders =
			_infoItemFieldReaders.computeIfAbsent(
				infoItemFieldReader.getKey(), key -> new ArrayList<>());

		infoItemFieldReaders.add(infoItemFieldReader);
	}

	protected void unsetInfoItemFieldReader(
		InfoItemFieldReader infoItemFieldReader,
		Map<String, Object> properties) {

		List<InfoItemFieldReader> infoItemFieldReaders =
			_infoItemFieldReaders.get(infoItemFieldReader.getKey());

		if (infoItemFieldReaders != null) {
			infoItemFieldReaders.remove(infoItemFieldReader);
		}
	}

	private final Map<String, List<InfoItemFieldReader>>
		_infoItemFieldReaders = new ConcurrentHashMap<>();

}