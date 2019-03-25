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

import com.liferay.headless.web.experience.client.dto.v1_0.StructuredContentLink;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class StructuredContentLinkParser {

	public static String toJSON(StructuredContentLink structuredContentLink) {
		if (structuredContentLink == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		Long id = structuredContentLink.getId();

		sb.append("\"id\": ");

		sb.append(id);
		sb.append(", ");

		String title = structuredContentLink.getTitle();

		sb.append("\"title\": ");

		sb.append("\"");
		sb.append(title);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(
		Collection<StructuredContentLink> structuredContentLinks) {

		if (structuredContentLinks == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (StructuredContentLink structuredContentLink :
				structuredContentLinks) {

			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(structuredContentLink));
		}

		sb.append("]");

		return sb.toString();
	}

	public static StructuredContentLink toStructuredContentLink(String json) {
		return null;
	}

	public static StructuredContentLink[] toStructuredContentLinks(
		String json) {

		return null;
	}

}