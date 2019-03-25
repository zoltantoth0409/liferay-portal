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

import com.liferay.headless.web.experience.client.dto.v1_0.ContentStructureField;
import com.liferay.headless.web.experience.client.dto.v1_0.Option;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentStructureFieldParser {

	public static String toJSON(ContentStructureField contentStructureField) {
		if (contentStructureField == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String dataType = contentStructureField.getDataType();

		sb.append("\"dataType\": ");

		sb.append("\"");
		sb.append(dataType);
		sb.append("\"");
		sb.append(", ");

		String inputControl = contentStructureField.getInputControl();

		sb.append("\"inputControl\": ");

		sb.append("\"");
		sb.append(inputControl);
		sb.append("\"");
		sb.append(", ");

		String label = contentStructureField.getLabel();

		sb.append("\"label\": ");

		sb.append("\"");
		sb.append(label);
		sb.append("\"");
		sb.append(", ");

		Boolean localizable = contentStructureField.getLocalizable();

		sb.append("\"localizable\": ");

		sb.append(localizable);
		sb.append(", ");

		Boolean multiple = contentStructureField.getMultiple();

		sb.append("\"multiple\": ");

		sb.append(multiple);
		sb.append(", ");

		String name = contentStructureField.getName();

		sb.append("\"name\": ");

		sb.append("\"");
		sb.append(name);
		sb.append("\"");
		sb.append(", ");

		ContentStructureField[] nestedContentStructureFields =
			contentStructureField.getNestedContentStructureFields();

		sb.append("\"nestedContentStructureFields\": ");

		if (nestedContentStructureFields == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < nestedContentStructureFields.length; i++) {
				sb.append(nestedContentStructureFields[i]);

				if ((i + 1) < nestedContentStructureFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		Option[] options = contentStructureField.getOptions();

		sb.append("\"options\": ");

		if (options == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < options.length; i++) {
				sb.append(options[i]);

				if ((i + 1) < options.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		String predefinedValue = contentStructureField.getPredefinedValue();

		sb.append("\"predefinedValue\": ");

		sb.append("\"");
		sb.append(predefinedValue);
		sb.append("\"");
		sb.append(", ");

		Boolean repeatable = contentStructureField.getRepeatable();

		sb.append("\"repeatable\": ");

		sb.append(repeatable);
		sb.append(", ");

		Boolean required = contentStructureField.getRequired();

		sb.append("\"required\": ");

		sb.append(required);
		sb.append(", ");

		Boolean showLabel = contentStructureField.getShowLabel();

		sb.append("\"showLabel\": ");

		sb.append(showLabel);

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(
		Collection<ContentStructureField> contentStructureFields) {

		if (contentStructureFields == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (ContentStructureField contentStructureField :
				contentStructureFields) {

			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(contentStructureField));
		}

		sb.append("]");

		return sb.toString();
	}

	public static ContentStructureField toContentStructureField(String json) {
		return null;
	}

	public static ContentStructureField[] toContentStructureFields(
		String json) {

		return null;
	}

}