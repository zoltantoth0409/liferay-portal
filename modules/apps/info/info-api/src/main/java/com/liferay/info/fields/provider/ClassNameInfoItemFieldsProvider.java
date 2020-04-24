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

package com.liferay.info.fields.provider;

import com.liferay.info.display.contributor.InfoDisplayField;
import com.liferay.info.fields.InfoItemField;
import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.annotation.versioning.ProviderType;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * @author Jürgen Kappler
 */
@ProviderType
public interface ClassNameInfoItemFieldsProvider {

	public List<InfoItemField> getInfoItemFields(String className);

}