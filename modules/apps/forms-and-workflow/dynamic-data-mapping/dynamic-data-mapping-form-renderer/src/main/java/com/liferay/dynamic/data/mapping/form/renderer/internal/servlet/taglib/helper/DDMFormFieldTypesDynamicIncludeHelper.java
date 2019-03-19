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

package com.liferay.dynamic.data.mapping.form.renderer.internal.servlet.taglib.helper;

import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldTypeServicesTracker;
import com.liferay.dynamic.data.mapping.form.renderer.internal.servlet.taglib.DDMFormFieldTypesDynamicInclude;
import com.liferay.dynamic.data.mapping.io.DDMFormFieldTypesJSONSerializer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.taglib.aui.ScriptData;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Bruno Basto
 */
@Component(
	immediate = true, service = DDMFormFieldTypesDynamicIncludeHelper.class
)
public class DDMFormFieldTypesDynamicIncludeHelper {

	public void include(
			HttpServletRequest request, HttpServletResponse response)
		throws IOException {

		ScriptData scriptData = new ScriptData();

		try {
			scriptData.append(
				null,
				StringUtil.replaceToStringBundler(
					_TMPL_CONTENT, StringPool.POUND, StringPool.POUND,
					Collections.singletonMap(
						"fieldTypes",
						_ddmFormFieldTypesJSONSerialize.serialize(
							_ddmFormFieldTypeServicesTracker.
								getDDMFormFieldTypes()))),
				_MODULES, ScriptData.ModulesType.AUI);
		}
		catch (PortalException pe) {
			if (_log.isDebugEnabled()) {
				_log.debug(pe);
			}
		}

		scriptData.writeTo(response.getWriter());
	}

	private static String _getTemplateContent() {
		if (Validator.isNull(_TMPL_CONTENT)) {
			try {
				return StringUtil.read(
					DDMFormFieldTypesDynamicInclude.class.getClassLoader(),
					"/META-INF/resources/dynamic_include/field_types.tmpl");
			}
			catch (IOException ioe) {
				if (_log.isDebugEnabled()) {
					_log.debug(ioe);
				}

				return StringPool.BLANK;
			}
		}

		return _TMPL_CONTENT;
	}

	private static final String _MODULES =
		"liferay-ddm-form-renderer-types,liferay-ddm-soy-template-util";

	private static final String _TMPL_CONTENT = _getTemplateContent();

	private static final Log _log = LogFactoryUtil.getLog(
		DDMFormFieldTypesDynamicIncludeHelper.class);

	@Reference
	private DDMFormFieldTypeServicesTracker _ddmFormFieldTypeServicesTracker;

	@Reference
	private DDMFormFieldTypesJSONSerializer _ddmFormFieldTypesJSONSerialize;

}