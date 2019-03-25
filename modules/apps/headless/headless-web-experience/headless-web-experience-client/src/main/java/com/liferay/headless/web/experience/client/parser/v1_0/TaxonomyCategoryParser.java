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

import com.liferay.headless.web.experience.client.dto.v1_0.TaxonomyCategory;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class TaxonomyCategoryParser {

	public static String toJSON(TaxonomyCategory taxonomyCategory) {
		if (taxonomyCategory == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		Long taxonomyCategoryId = taxonomyCategory.getTaxonomyCategoryId();

		sb.append("\"taxonomyCategoryId\": ");

		sb.append(taxonomyCategoryId);
		sb.append(", ");

		String taxonomyCategoryName =
			taxonomyCategory.getTaxonomyCategoryName();

		sb.append("\"taxonomyCategoryName\": ");

		sb.append("\"");
		sb.append(taxonomyCategoryName);
		sb.append("\"");

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(
		Collection<TaxonomyCategory> taxonomyCategories) {

		if (taxonomyCategories == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (TaxonomyCategory taxonomyCategory : taxonomyCategories) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(taxonomyCategory));
		}

		sb.append("]");

		return sb.toString();
	}

	public static TaxonomyCategory toTaxonomyCategory(String json) {
		return null;
	}

	public static TaxonomyCategory[] toTaxonomyCategories(String json) {
		return null;
	}

}