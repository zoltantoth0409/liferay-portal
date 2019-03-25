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

package com.liferay.headless.web.experience.client.serdes.v1_0;

import com.liferay.headless.web.experience.client.dto.v1_0.ContentField;
import com.liferay.headless.web.experience.client.dto.v1_0.Value;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentFieldSerDes {

	public static String toJSON(ContentField contentField) {
		if (contentField == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String dataType = contentField.getDataType();

		sb.append("\"dataType\": ");

		sb.append("\"");
		sb.append(dataType);
		sb.append("\"");
		sb.append(", ");

		String inputControl = contentField.getInputControl();

		sb.append("\"inputControl\": ");

		sb.append("\"");
		sb.append(inputControl);
		sb.append("\"");
		sb.append(", ");

		String label = contentField.getLabel();

		sb.append("\"label\": ");

		sb.append("\"");
		sb.append(label);
		sb.append("\"");
		sb.append(", ");

		String name = contentField.getName();

		sb.append("\"name\": ");

		sb.append("\"");
		sb.append(name);
		sb.append("\"");
		sb.append(", ");

		ContentField[] nestedFields = contentField.getNestedFields();

		sb.append("\"nestedFields\": ");

		if (nestedFields == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < nestedFields.length; i++) {
				sb.append(nestedFields[i]);

				if ((i + 1) < nestedFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		Boolean repeatable = contentField.getRepeatable();

		sb.append("\"repeatable\": ");

		sb.append(repeatable);
		sb.append(", ");

		Value value = contentField.getValue();

		sb.append("\"value\": ");

		sb.append(value);

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<ContentField> contentFields) {
		if (contentFields == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (ContentField contentField : contentFields) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(contentField));
		}

		sb.append("]");

		return sb.toString();
	}

	public static ContentField toContentField(String json) {
		return null;
	}

	public static ContentField[] toContentFields(String json) {
		return null;
	}

}