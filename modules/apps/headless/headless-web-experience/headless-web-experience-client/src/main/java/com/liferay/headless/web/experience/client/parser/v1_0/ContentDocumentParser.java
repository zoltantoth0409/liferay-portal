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

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class ContentDocumentParser {

	public static String toJSON(ContentDocument contentDocument) {
		if (contentDocument == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String contentUrl = contentDocument.getContentUrl();

		sb.append("\"contentUrl\": ");

		sb.append("\"");
		sb.append(contentUrl);
		sb.append("\"");
		sb.append(", ");

		String description = contentDocument.getDescription();

		sb.append("\"description\": ");

		sb.append("\"");
		sb.append(description);
		sb.append("\"");
		sb.append(", ");

		String encodingFormat = contentDocument.getEncodingFormat();

		sb.append("\"encodingFormat\": ");

		sb.append("\"");
		sb.append(encodingFormat);
		sb.append("\"");
		sb.append(", ");

		String fileExtension = contentDocument.getFileExtension();

		sb.append("\"fileExtension\": ");

		sb.append("\"");
		sb.append(fileExtension);
		sb.append("\"");
		sb.append(", ");

		Long id = contentDocument.getId();

		sb.append("\"id\": ");

		sb.append(id);
		sb.append(", ");

		Number sizeInBytes = contentDocument.getSizeInBytes();

		sb.append("\"sizeInBytes\": ");

		sb.append(sizeInBytes);
		sb.append(", ");

		String title = contentDocument.getTitle();

		sb.append("\"title\": ");

		sb.append("\"");
		sb.append(title);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<ContentDocument> contentDocuments) {
		if (contentDocuments == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (ContentDocument contentDocument : contentDocuments) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(contentDocument));
		}

		sb.append("]");

		return sb.toString();
	}

	public static ContentDocument toContentDocument(String json) {
		return null;
	}

	public static ContentDocument[] toContentDocuments(String json) {
		return null;
	}

}