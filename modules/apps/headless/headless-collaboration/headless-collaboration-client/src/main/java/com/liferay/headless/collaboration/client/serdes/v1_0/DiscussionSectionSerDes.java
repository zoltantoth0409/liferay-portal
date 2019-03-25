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

import com.liferay.headless.collaboration.client.dto.v1_0.DiscussionSection;
import com.liferay.headless.collaboration.client.json.BaseJSONParser;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class DiscussionSectionSerDes {

	public static DiscussionSection toDTO(String json) {
		DiscussionSectionJSONParser discussionSectionJSONParser =
			new DiscussionSectionJSONParser();

		return discussionSectionJSONParser.parseToDTO(json);
	}

	public static DiscussionSection[] toDTOs(String json) {
		DiscussionSectionJSONParser discussionSectionJSONParser =
			new DiscussionSectionJSONParser();

		return discussionSectionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DiscussionSection discussionSection) {
		if (discussionSection == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"contentSpaceId\": ");

		sb.append(discussionSection.getContentSpaceId());
		sb.append(", ");

		sb.append("\"creator\": ");

		sb.append(discussionSection.getCreator());
		sb.append(", ");

		sb.append("\"dateCreated\": ");

		sb.append("\"");
		sb.append(discussionSection.getDateCreated());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"dateModified\": ");

		sb.append("\"");
		sb.append(discussionSection.getDateModified());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"description\": ");

		sb.append("\"");
		sb.append(discussionSection.getDescription());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"id\": ");

		sb.append(discussionSection.getId());
		sb.append(", ");

		sb.append("\"numberOfDiscussionSections\": ");

		sb.append(discussionSection.getNumberOfDiscussionSections());
		sb.append(", ");

		sb.append("\"numberOfDiscussionThreads\": ");

		sb.append(discussionSection.getNumberOfDiscussionThreads());
		sb.append(", ");

		sb.append("\"title\": ");

		sb.append("\"");
		sb.append(discussionSection.getTitle());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"viewableBy\": ");

		sb.append("\"");
		sb.append(discussionSection.getViewableBy());
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(
		Collection<DiscussionSection> discussionSections) {

		if (discussionSections == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (DiscussionSection discussionSection : discussionSections) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(discussionSection));
		}

		sb.append("]");

		return sb.toString();
	}

	private static class DiscussionSectionJSONParser
		extends BaseJSONParser<DiscussionSection> {

		protected DiscussionSection createDTO() {
			return new DiscussionSection();
		}

		protected DiscussionSection[] createDTOArray(int size) {
			return new DiscussionSection[size];
		}

		protected void setField(
			DiscussionSection discussionSection, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "contentSpaceId")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setContentSpaceId(
						(Long)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "creator")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setCreator(
						CreatorSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateCreated")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setDateCreated(
						(Date)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateModified")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setDateModified(
						(Date)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setDescription(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setId((Long)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "numberOfDiscussionSections")) {

				if (jsonParserFieldValue != null) {
					discussionSection.setNumberOfDiscussionSections(
						(Integer)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "numberOfDiscussionThreads")) {

				if (jsonParserFieldValue != null) {
					discussionSection.setNumberOfDiscussionThreads(
						(Integer)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "title")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setTitle((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "viewableBy")) {
				if (jsonParserFieldValue != null) {
					discussionSection.setViewableBy(
						DiscussionSection.ViewableBy.create(
							(String)jsonParserFieldValue));
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}