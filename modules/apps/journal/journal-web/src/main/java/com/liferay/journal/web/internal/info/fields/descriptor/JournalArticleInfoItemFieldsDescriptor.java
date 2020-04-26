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

package com.liferay.journal.web.internal.info.fields.descriptor;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.dynamic.data.mapping.info.fields.provider.DDMStructureInfoItemFieldsProvider;
import com.liferay.dynamic.data.mapping.kernel.NoSuchStructureException;
import com.liferay.expando.info.fields.provider.ExpandoInfoItemFieldsProvider;
import com.liferay.info.display.contributor.InfoDisplayContributor;
import com.liferay.info.fields.InfoItemField;
import com.liferay.info.fields.descriptor.InfoItemFieldsDescriptor;
import com.liferay.info.fields.provider.ClassNameInfoItemFieldsProvider;
import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jürgen Kappler
 */
@Component(immediate = true, service = InfoDisplayContributor.class)
public class JournalArticleInfoItemFieldsDescriptor
	implements InfoItemFieldsDescriptor<JournalArticle> {

	@Override
	public List<InfoItemField> getInfoItemFields() {
		List<InfoItemField> infoItemFields = new ArrayList();

		// TODO: I'm not fully conviced of obtaining the asset related fields this way
		infoItemFields.addAll(
			_classNameInfoItemFieldsProvider.getInfoItemFields(
				AssetEntry.class.getName()));
		infoItemFields.addAll(
			_classNameInfoItemFieldsProvider.getInfoItemFields(
				JournalArticle.class.getName()));

		infoItemFields.addAll(
			_expandoInfoItemFieldsProvider.
				getInfoItemFields(JournalArticle.class.getName()));

		return infoItemFields;
	}

	public List<InfoItemField> getInfoItemFields(long structureId) {
		List<InfoItemField> infoItemFields = getInfoItemFields();

		try {
			infoItemFields.addAll(
				_ddmStructureInfoItemFieldsProvider.
					getInfoItemFields(structureId));
		}
		catch (NoSuchStructureException noSuchStructureException) {
			// TODO: Create NoSuchSubtypeException
			throw new RuntimeException(noSuchStructureException);
		}

		return infoItemFields;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		JournalArticleInfoItemFieldsDescriptor.class);

	@Reference
	private DDMStructureInfoItemFieldsProvider
		_ddmStructureInfoItemFieldsProvider;

	@Reference
	private ClassNameInfoItemFieldsProvider _classNameInfoItemFieldsProvider;

	@Reference
	private ExpandoInfoItemFieldsProvider _expandoInfoItemFieldsProvider;

}