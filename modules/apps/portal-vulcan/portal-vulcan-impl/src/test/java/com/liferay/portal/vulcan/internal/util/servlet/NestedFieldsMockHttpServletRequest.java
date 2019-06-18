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

package com.liferay.portal.vulcan.internal.util.servlet;

import java.util.HashMap;
import java.util.Map;

import org.springframework.mock.web.MockHttpServletRequest;

/**
 * @author Ivica Cardic
 */
public class NestedFieldsMockHttpServletRequest extends MockHttpServletRequest {

	public NestedFieldsMockHttpServletRequest() {
	}

	public NestedFieldsMockHttpServletRequest(
		String fieldName, String... parameters) {

		for (int i = 0; i < (parameters.length - 1); i++) {
			_parameters.put(fieldName + "." + parameters[i], parameters[i + 1]);
		}
	}

	@Override
	public String getParameter(String name) {
		return _parameters.get(name);
	}

	private Map<String, String> _parameters = new HashMap<>();

}