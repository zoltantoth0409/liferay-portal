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

package com.liferay.headless.web.experience.client.parser.v1_0;

import com.liferay.headless.web.experience.client.dto.v1_0.Option;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class OptionParser {

	public static String toJSON(Option option) {
		if (option == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String label = option.getLabel();

		sb.append("\"label\": ");

		sb.append("\"");
		sb.append(label);
		sb.append("\"");
		sb.append(", ");

		String value = option.getValue();

		sb.append("\"value\": ");

		sb.append("\"");
		sb.append(value);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<Option> options) {
		if (options == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (Option option : options) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(option));
		}

		sb.append("]");

		return sb.toString();
	}

	public static Option toOption(String json) {
		return null;
	}

	public static Option[] toOptions(String json) {
		return null;
	}

}