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

import com.liferay.headless.web.experience.client.dto.v1_0.RenderedContent;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class RenderedContentParser {

	public static String toJSON(RenderedContent renderedContent) {
		if (renderedContent == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		String renderedContentURL = renderedContent.getRenderedContentURL();

		sb.append("\"renderedContentURL\": ");

		sb.append("\"");
		sb.append(renderedContentURL);
		sb.append("\"");
		sb.append(", ");

		String templateName = renderedContent.getTemplateName();

		sb.append("\"templateName\": ");

		sb.append("\"");
		sb.append(templateName);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<RenderedContent> renderedContents) {
		if (renderedContents == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (RenderedContent renderedContent : renderedContents) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(renderedContent));
		}

		sb.append("]");

		return sb.toString();
	}

	public static RenderedContent toRenderedContent(String json) {
		return null;
	}

	public static RenderedContent[] toRenderedContents(String json) {
		return null;
	}

}