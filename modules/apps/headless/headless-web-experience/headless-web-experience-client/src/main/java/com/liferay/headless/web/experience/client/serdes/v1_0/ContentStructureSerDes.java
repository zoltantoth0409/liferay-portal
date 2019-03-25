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

import com.liferay.headless.web.experience.client.dto.v1_0.ContentStructure;
import com.liferay.headless.web.experience.client.dto.v1_0.ContentStructureField;
import com.liferay.headless.web.experience.client.dto.v1_0.Creator;

import java.util.Collection;
import java.util.Date;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentStructureSerDes {

	public static String toJSON(ContentStructure contentStructure) {
		if (contentStructure == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String[] availableLanguages = contentStructure.getAvailableLanguages();

		sb.append("\"availableLanguages\": ");

		if (availableLanguages == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < availableLanguages.length; i++) {
				sb.append("\"");
				sb.append(availableLanguages[i]);
				sb.append("\"");

				if ((i + 1) < availableLanguages.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		Long contentSpaceId = contentStructure.getContentSpaceId();

		sb.append("\"contentSpaceId\": ");

		sb.append(contentSpaceId);
		sb.append(", ");

		ContentStructureField[] contentStructureFields =
			contentStructure.getContentStructureFields();

		sb.append("\"contentStructureFields\": ");

		if (contentStructureFields == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contentStructureFields.length; i++) {
				sb.append(contentStructureFields[i]);

				if ((i + 1) < contentStructureFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		Creator creator = contentStructure.getCreator();

		sb.append("\"creator\": ");

		sb.append(creator);
		sb.append(", ");

		Date dateCreated = contentStructure.getDateCreated();

		sb.append("\"dateCreated\": ");

		sb.append("\"");
		sb.append(dateCreated);
		sb.append("\"");
		sb.append(", ");

		Date dateModified = contentStructure.getDateModified();

		sb.append("\"dateModified\": ");

		sb.append("\"");
		sb.append(dateModified);
		sb.append("\"");
		sb.append(", ");

		String description = contentStructure.getDescription();

		sb.append("\"description\": ");

		sb.append("\"");
		sb.append(description);
		sb.append("\"");
		sb.append(", ");

		Long id = contentStructure.getId();

		sb.append("\"id\": ");

		sb.append(id);
		sb.append(", ");

		String name = contentStructure.getName();

		sb.append("\"name\": ");

		sb.append("\"");
		sb.append(name);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(
		Collection<ContentStructure> contentStructures) {

		if (contentStructures == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (ContentStructure contentStructure : contentStructures) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(contentStructure));
		}

		sb.append("]");

		return sb.toString();
	}

	public static ContentStructure toContentStructure(String json) {
		return null;
	}

	public static ContentStructure[] toContentStructures(String json) {
		return null;
	}

}