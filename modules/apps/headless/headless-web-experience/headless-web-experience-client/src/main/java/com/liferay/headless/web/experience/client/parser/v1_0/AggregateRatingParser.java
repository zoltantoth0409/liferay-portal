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

import com.liferay.headless.web.experience.client.dto.v1_0.AggregateRating;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class AggregateRatingParser {

	public static String toJSON(AggregateRating aggregateRating) {
		if (aggregateRating == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		Number bestRating = aggregateRating.getBestRating();

		sb.append("\"bestRating\": ");

		sb.append(bestRating);
		sb.append(", ");

		Number ratingCount = aggregateRating.getRatingCount();

		sb.append("\"ratingCount\": ");

		sb.append(ratingCount);
		sb.append(", ");

		Number ratingValue = aggregateRating.getRatingValue();

		sb.append("\"ratingValue\": ");

		sb.append(ratingValue);
		sb.append(", ");

		Number worstRating = aggregateRating.getWorstRating();

		sb.append("\"worstRating\": ");

		sb.append(worstRating);

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<AggregateRating> aggregateRatings) {
		if (aggregateRatings == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (AggregateRating aggregateRating : aggregateRatings) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(aggregateRating));
		}

		sb.append("]");

		return sb.toString();
	}

	public static AggregateRating toAggregateRating(String json) {
		return null;
	}

	public static AggregateRating[] toAggregateRatings(String json) {
		return null;
	}

}