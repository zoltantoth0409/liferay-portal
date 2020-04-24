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

package com.liferay.blogs.web.internal.info.fields;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.blogs.model.BlogsEntry;
import com.liferay.info.display.contributor.InfoDisplayContributor;
import com.liferay.info.fields.descriptor.InfoItemFieldsDescriptor;
import com.liferay.info.fields.InfoItemField;
import com.liferay.info.fields.provider.ClassNameInfoItemFieldsProvider;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alejandro Tardín
 */
@Component(service = InfoDisplayContributor.class)
public class BlogsEntryInfoItemFieldsDescriptor
	implements InfoItemFieldsDescriptor<BlogsEntry> {

	@Override
	public List<InfoItemField> getInfoDisplayFields() {
		List<InfoItemField> infoItemFields = new ArrayList();

		// TODO: I'm not fully conviced of obtaining the asset related fields this way
		infoItemFields.addAll(
			_classNameInfoItemFieldsProvider.getInfoItemFields(
				AssetEntry.class.getName()));
		infoItemFields.addAll(
			_classNameInfoItemFieldsProvider.getInfoItemFields(
				BlogsEntry.class.getName()));

		return infoItemFields;
	}

	@Reference
	private ClassNameInfoItemFieldsProvider _classNameInfoItemFieldsProvider;

}