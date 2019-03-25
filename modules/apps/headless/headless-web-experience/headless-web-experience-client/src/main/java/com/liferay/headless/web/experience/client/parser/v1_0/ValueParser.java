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

import com.liferay.headless.web.experience.client.dto.v1_0.ContentDocument;
import com.liferay.headless.web.experience.client.dto.v1_0.Geo;
import com.liferay.headless.web.experience.client.dto.v1_0.StructuredContentLink;
import com.liferay.headless.web.experience.client.dto.v1_0.Value;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ValueParser {

	public static String toJSON(Value value) {
		if (value == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String data = value.getData();

		sb.append("\"data\": ");

		sb.append("\"");
		sb.append(data);
		sb.append("\"");
		sb.append(", ");

		ContentDocument document = value.getDocument();

		sb.append("\"document\": ");

		sb.append(document);
		sb.append(", ");

		Long documentId = value.getDocumentId();

		sb.append("\"documentId\": ");

		sb.append(documentId);
		sb.append(", ");

		Geo geo = value.getGeo();

		sb.append("\"geo\": ");

		sb.append(geo);
		sb.append(", ");

		ContentDocument image = value.getImage();

		sb.append("\"image\": ");

		sb.append(image);
		sb.append(", ");

		String imageDescription = value.getImageDescription();

		sb.append("\"imageDescription\": ");

		sb.append("\"");
		sb.append(imageDescription);
		sb.append("\"");
		sb.append(", ");

		Long imageId = value.getImageId();

		sb.append("\"imageId\": ");

		sb.append(imageId);
		sb.append(", ");

		String link = value.getLink();

		sb.append("\"link\": ");

		sb.append("\"");
		sb.append(link);
		sb.append("\"");
		sb.append(", ");

		Long structuredContentId = value.getStructuredContentId();

		sb.append("\"structuredContentId\": ");

		sb.append(structuredContentId);
		sb.append(", ");

		StructuredContentLink structuredContentLink =
			value.getStructuredContentLink();

		sb.append("\"structuredContentLink\": ");

		sb.append(structuredContentLink);

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<Value> values) {
		if (values == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (Value value : values) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(value));
		}

		sb.append("]");

		return sb.toString();
	}

	public static Value toValue(String json) {
		return null;
	}

	public static Value[] toValues(String json) {
		return null;
	}

}