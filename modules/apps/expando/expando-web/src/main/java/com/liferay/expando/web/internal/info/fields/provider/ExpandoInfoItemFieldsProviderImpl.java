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

package com.liferay.expando.web.internal.info.fields.provider;

import com.liferay.expando.info.fields.provider.ExpandoInfoItemFieldsProvider;
import com.liferay.expando.info.fields.reader.ExpandoInfoItemFieldReader;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.info.fields.InfoItemField;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;

import org.osgi.service.component.annotations.Component;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Jürgen Kappler
 * @author Jorge Ferrer
 */
@Component(immediate = true, service = ExpandoInfoItemFieldsProvider.class)
public class ExpandoInfoItemFieldsProviderImpl
	implements ExpandoInfoItemFieldsProvider {

	@Override
	public List<InfoItemField> getInfoItemFields(
		String className) {
		
		List<InfoItemField> infoItemFields = new ArrayList<>();

		for (ExpandoInfoItemFieldReader expandoInfoItemFieldReader :
				_getExpandoInfoItemFieldReaders(className)) {

			InfoItemField infoItemField =
				expandoInfoItemFieldReader.getInfoItemField();

			infoItemFields.add(
				new InfoItemField(
					expandoInfoItemFieldReader.getKey(),
					expandoInfoItemFieldReader.getLabels(),
					infoItemField.getItemFieldType()));
		}

		return infoItemFields;
	}


	private List<ExpandoInfoItemFieldReader> _getExpandoInfoItemFieldReaders(
		String className) {

		List<ExpandoInfoItemFieldReader> expandoInfoItemFieldReaders =
			new ArrayList<>();

		ExpandoBridge expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(
			CompanyThreadLocal.getCompanyId(), className, 0L);

		Enumeration<String> attributeNames = expandoBridge.getAttributeNames();

		while (attributeNames.hasMoreElements()) {
			String attributeName = attributeNames.nextElement();

			expandoInfoItemFieldReaders.add(
				new ExpandoInfoItemFieldReader(
					attributeName, expandoBridge));
		}

		return expandoInfoItemFieldReaders;
	}
	
}