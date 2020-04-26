/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.mapping.web.internal.info.fields.provider;

import com.liferay.dynamic.data.mapping.info.fields.provider.DDMStructureInfoItemFieldsProvider;
import com.liferay.dynamic.data.mapping.kernel.DDMFormField;
import com.liferay.dynamic.data.mapping.kernel.DDMStructure;
import com.liferay.dynamic.data.mapping.kernel.DDMStructureManagerUtil;
import com.liferay.dynamic.data.mapping.kernel.NoSuchStructureException;
import com.liferay.info.fields.InfoItemField;
import com.liferay.info.fields.type.InfoItemFieldType;
import com.liferay.info.fields.type.TextInfoItemFieldType;
import com.liferay.info.localization.LocalizedValue;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jorge Ferrer
 */
public class DDMStructureInfoItemFieldsProviderImpl
	implements DDMStructureInfoItemFieldsProvider {

	@Override
	public List<InfoItemField> getInfoItemFields(long ddmStructureId)
		throws NoSuchStructureException {

		List<InfoItemField> infoItemFields = new ArrayList<>();

		try {
			DDMStructure ddmStructure = DDMStructureManagerUtil.getStructure(
				ddmStructureId);

			List<DDMFormField> ddmFormFields =
				ddmStructure.getDDMFormFields(false);

			for (DDMFormField ddmFormField : ddmFormFields) {
				String indexType = ddmFormField.getIndexType();

				String type = ddmFormField.getType();

				if (Validator.isNull(indexType) ||
					!ArrayUtil.contains(
						_SELECTABLE_DDM_STRUCTURE_FIELDS, type)) {

					continue;
				}

				com.liferay.dynamic.data.mapping.kernel.LocalizedValue label =
					ddmFormField.getLabel();

				LocalizedValue labelLocalizedValue =
					LocalizedValue.builder().
						addValues(label.getValues()).
						defaultLocale(label.getDefaultLocale()).
						build();

				// TODO: This is what JournalArticleInfoDisplayContributor has, but it looses information about the real type. What about creating a DDMInfoItemFieldType?
				InfoItemFieldType itemFieldType = _ITEM_FIELD_TYPE_TEXT;

				infoItemFields.add(
					new InfoItemField(
						ddmFormField.getName(),
						labelLocalizedValue,
						itemFieldType));
			}
		}
		catch (NoSuchStructureException noSuchStructureException) {
			throw noSuchStructureException;
		}
		catch (PortalException portalException) {
			throw new RuntimeException("Unexpected exception", portalException);
		}

		return infoItemFields;
	}

	private static final TextInfoItemFieldType _ITEM_FIELD_TYPE_TEXT =
		new TextInfoItemFieldType();

	// TODO: Warning! Custom field types will not be shown!
	// This list was copied from DDMStructureClassType
	private static final String[] _SELECTABLE_DDM_STRUCTURE_FIELDS = {
		"checkbox", "ddm-date", "ddm-decimal", "ddm-image", "ddm-integer",
		"ddm-number", "ddm-text-html", "radio", "select", "text", "textarea"
	};

}

