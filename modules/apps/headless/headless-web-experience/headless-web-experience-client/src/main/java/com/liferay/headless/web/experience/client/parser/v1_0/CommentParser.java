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

import com.liferay.headless.web.experience.client.dto.v1_0.Comment;
import com.liferay.headless.web.experience.client.dto.v1_0.Creator;

import java.util.Collection;
import java.util.Date;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class CommentParser {

	public static String toJSON(Comment comment) {
		if (comment == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		Creator creator = comment.getCreator();

		sb.append("\"creator\": ");

		sb.append(creator);
		sb.append(", ");

		Date dateCreated = comment.getDateCreated();

		sb.append("\"dateCreated\": ");

		sb.append("\"");
		sb.append(dateCreated);
		sb.append("\"");
		sb.append(", ");

		Date dateModified = comment.getDateModified();

		sb.append("\"dateModified\": ");

		sb.append("\"");
		sb.append(dateModified);
		sb.append("\"");
		sb.append(", ");

		Long id = comment.getId();

		sb.append("\"id\": ");

		sb.append(id);
		sb.append(", ");

		Number numberOfComments = comment.getNumberOfComments();

		sb.append("\"numberOfComments\": ");

		sb.append(numberOfComments);
		sb.append(", ");

		String text = comment.getText();

		sb.append("\"text\": ");

		sb.append("\"");
		sb.append(text);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<Comment> comments) {
		if (comments == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (Comment comment : comments) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(comment));
		}

		sb.append("]");

		return sb.toString();
	}

	public static Comment toComment(String json) {
		return null;
	}

	public static Comment[] toComments(String json) {
		return null;
	}

}