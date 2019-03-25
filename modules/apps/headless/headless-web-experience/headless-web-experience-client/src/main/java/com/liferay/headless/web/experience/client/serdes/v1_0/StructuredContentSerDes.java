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

import com.liferay.headless.web.experience.client.dto.v1_0.AggregateRating;
import com.liferay.headless.web.experience.client.dto.v1_0.ContentField;
import com.liferay.headless.web.experience.client.dto.v1_0.Creator;
import com.liferay.headless.web.experience.client.dto.v1_0.RenderedContent;
import com.liferay.headless.web.experience.client.dto.v1_0.StructuredContent;
import com.liferay.headless.web.experience.client.dto.v1_0.TaxonomyCategory;

import java.util.Collection;
import java.util.Date;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class StructuredContentSerDes {

	public static String toJSON(StructuredContent structuredContent) {
		if (structuredContent == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		AggregateRating aggregateRating =
			structuredContent.getAggregateRating();

		sb.append("\"aggregateRating\": ");

		sb.append(aggregateRating);
		sb.append(", ");

		String[] availableLanguages = structuredContent.getAvailableLanguages();

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

		ContentField[] contentFields = structuredContent.getContentFields();

		sb.append("\"contentFields\": ");

		if (contentFields == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < contentFields.length; i++) {
				sb.append(contentFields[i]);

				if ((i + 1) < contentFields.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		Long contentSpaceId = structuredContent.getContentSpaceId();

		sb.append("\"contentSpaceId\": ");

		sb.append(contentSpaceId);
		sb.append(", ");

		Long contentStructureId = structuredContent.getContentStructureId();

		sb.append("\"contentStructureId\": ");

		sb.append(contentStructureId);
		sb.append(", ");

		Creator creator = structuredContent.getCreator();

		sb.append("\"creator\": ");

		sb.append(creator);
		sb.append(", ");

		Date dateCreated = structuredContent.getDateCreated();

		sb.append("\"dateCreated\": ");

		sb.append("\"");
		sb.append(dateCreated);
		sb.append("\"");
		sb.append(", ");

		Date dateModified = structuredContent.getDateModified();

		sb.append("\"dateModified\": ");

		sb.append("\"");
		sb.append(dateModified);
		sb.append("\"");
		sb.append(", ");

		Date datePublished = structuredContent.getDatePublished();

		sb.append("\"datePublished\": ");

		sb.append("\"");
		sb.append(datePublished);
		sb.append("\"");
		sb.append(", ");

		String description = structuredContent.getDescription();

		sb.append("\"description\": ");

		sb.append("\"");
		sb.append(description);
		sb.append("\"");
		sb.append(", ");

		Long id = structuredContent.getId();

		sb.append("\"id\": ");

		sb.append(id);
		sb.append(", ");

		String[] keywords = structuredContent.getKeywords();

		sb.append("\"keywords\": ");

		if (keywords == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < keywords.length; i++) {
				sb.append("\"");
				sb.append(keywords[i]);
				sb.append("\"");

				if ((i + 1) < keywords.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		Date lastReviewed = structuredContent.getLastReviewed();

		sb.append("\"lastReviewed\": ");

		sb.append("\"");
		sb.append(lastReviewed);
		sb.append("\"");
		sb.append(", ");

		Number numberOfComments = structuredContent.getNumberOfComments();

		sb.append("\"numberOfComments\": ");

		sb.append(numberOfComments);
		sb.append(", ");

		RenderedContent[] renderedContents =
			structuredContent.getRenderedContents();

		sb.append("\"renderedContents\": ");

		if (renderedContents == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < renderedContents.length; i++) {
				sb.append(renderedContents[i]);

				if ((i + 1) < renderedContents.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		TaxonomyCategory[] taxonomyCategories =
			structuredContent.getTaxonomyCategories();

		sb.append("\"taxonomyCategories\": ");

		if (taxonomyCategories == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < taxonomyCategories.length; i++) {
				sb.append(taxonomyCategories[i]);

				if ((i + 1) < taxonomyCategories.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		Long[] taxonomyCategoryIds = structuredContent.getTaxonomyCategoryIds();

		sb.append("\"taxonomyCategoryIds\": ");

		if (taxonomyCategoryIds == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < taxonomyCategoryIds.length; i++) {
				sb.append(taxonomyCategoryIds[i]);

				if ((i + 1) < taxonomyCategoryIds.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append(", ");

		String title = structuredContent.getTitle();

		sb.append("\"title\": ");

		sb.append("\"");
		sb.append(title);
		sb.append("\"");
		sb.append(", ");

		StructuredContent.ViewableBy viewableBy =
			structuredContent.getViewableBy();

		sb.append("\"viewableBy\": ");

		sb.append("\"");
		sb.append(viewableBy);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(
		Collection<StructuredContent> structuredContents) {

		if (structuredContents == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (StructuredContent structuredContent : structuredContents) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(structuredContent));
		}

		sb.append("]");

		return sb.toString();
	}

	public static StructuredContent toStructuredContent(String json) {
		return null;
	}

	public static StructuredContent[] toStructuredContents(String json) {
		return null;
	}

}