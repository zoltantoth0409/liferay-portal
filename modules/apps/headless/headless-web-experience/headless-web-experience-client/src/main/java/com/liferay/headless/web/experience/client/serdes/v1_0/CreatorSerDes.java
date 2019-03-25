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

import com.liferay.headless.web.experience.client.dto.v1_0.Creator;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class CreatorSerDes {

	public static String toJSON(Creator creator) {
		if (creator == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String additionalName = creator.getAdditionalName();

		sb.append("\"additionalName\": ");

		sb.append("\"");
		sb.append(additionalName);
		sb.append("\"");
		sb.append(", ");

		String familyName = creator.getFamilyName();

		sb.append("\"familyName\": ");

		sb.append("\"");
		sb.append(familyName);
		sb.append("\"");
		sb.append(", ");

		String givenName = creator.getGivenName();

		sb.append("\"givenName\": ");

		sb.append("\"");
		sb.append(givenName);
		sb.append("\"");
		sb.append(", ");

		Long id = creator.getId();

		sb.append("\"id\": ");

		sb.append(id);
		sb.append(", ");

		String image = creator.getImage();

		sb.append("\"image\": ");

		sb.append("\"");
		sb.append(image);
		sb.append("\"");
		sb.append(", ");

		String name = creator.getName();

		sb.append("\"name\": ");

		sb.append("\"");
		sb.append(name);
		sb.append("\"");
		sb.append(", ");

		String profileURL = creator.getProfileURL();

		sb.append("\"profileURL\": ");

		sb.append("\"");
		sb.append(profileURL);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<Creator> creators) {
		if (creators == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (Creator creator : creators) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(creator));
		}

		sb.append("]");

		return sb.toString();
	}

	public static Creator toCreator(String json) {
		return null;
	}

	public static Creator[] toCreators(String json) {
		return null;
	}

}