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

package com.liferay.headless.collaboration.client.serdes.v1_0;

import com.liferay.headless.collaboration.client.dto.v1_0.DiscussionAttachment;
import com.liferay.headless.collaboration.client.json.BaseJSONParser;

import java.util.Collection;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class DiscussionAttachmentSerDes {

	public static DiscussionAttachment toDTO(String json) {
		DiscussionAttachmentJSONParser discussionAttachmentJSONParser =
			new DiscussionAttachmentJSONParser();

		return discussionAttachmentJSONParser.parseToDTO(json);
	}

	public static DiscussionAttachment[] toDTOs(String json) {
		DiscussionAttachmentJSONParser discussionAttachmentJSONParser =
			new DiscussionAttachmentJSONParser();

		return discussionAttachmentJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DiscussionAttachment discussionAttachment) {
		if (discussionAttachment == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"contentUrl\": ");

		sb.append("\"");
		sb.append(discussionAttachment.getContentUrl());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"encodingFormat\": ");

		sb.append("\"");
		sb.append(discussionAttachment.getEncodingFormat());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"fileExtension\": ");

		sb.append("\"");
		sb.append(discussionAttachment.getFileExtension());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"id\": ");

		sb.append(discussionAttachment.getId());
		sb.append(", ");

		sb.append("\"sizeInBytes\": ");

		sb.append(discussionAttachment.getSizeInBytes());
		sb.append(", ");

		sb.append("\"title\": ");

		sb.append("\"");
		sb.append(discussionAttachment.getTitle());
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(
		Collection<DiscussionAttachment> discussionAttachments) {

		if (discussionAttachments == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (DiscussionAttachment discussionAttachment :
				discussionAttachments) {

			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(discussionAttachment));
		}

		sb.append("]");

		return sb.toString();
	}

	private static class DiscussionAttachmentJSONParser
		extends BaseJSONParser<DiscussionAttachment> {

		protected DiscussionAttachment createDTO() {
			return new DiscussionAttachment();
		}

		protected DiscussionAttachment[] createDTOArray(int size) {
			return new DiscussionAttachment[size];
		}

		protected void setField(
			DiscussionAttachment discussionAttachment,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "contentUrl")) {
				if (jsonParserFieldValue != null) {
					discussionAttachment.setContentUrl(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "encodingFormat")) {
				if (jsonParserFieldValue != null) {
					discussionAttachment.setEncodingFormat(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "fileExtension")) {
				if (jsonParserFieldValue != null) {
					discussionAttachment.setFileExtension(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					discussionAttachment.setId((Long)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "sizeInBytes")) {
				if (jsonParserFieldValue != null) {
					discussionAttachment.setSizeInBytes(
						(Number)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					discussionAttachment.setTitle((String)jsonParserFieldValue);
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}