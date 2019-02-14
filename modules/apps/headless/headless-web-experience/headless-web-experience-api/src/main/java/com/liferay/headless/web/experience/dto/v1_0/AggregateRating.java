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

package com.liferay.headless.web.experience.dto.v1_0;

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "AggregateRating")
public class AggregateRating {

	public Number getBestRating() {
		return _bestRating;
	}

	public Long getId() {
		return _id;
	}

	public Number getRatingCount() {
		return _ratingCount;
	}

	public Number getRatingValue() {
		return _ratingValue;
	}

	public Number getWorstRating() {
		return _worstRating;
	}

	public void setBestRating(Number bestRating) {
		_bestRating = bestRating;
	}

	public void setBestRating(Supplier<Number> bestRatingSupplier) {
		_bestRating = bestRatingSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setRatingCount(Number ratingCount) {
		_ratingCount = ratingCount;
	}

	public void setRatingCount(Supplier<Number> ratingCountSupplier) {
		_ratingCount = ratingCountSupplier.get();
	}

	public void setRatingValue(Number ratingValue) {
		_ratingValue = ratingValue;
	}

	public void setRatingValue(Supplier<Number> ratingValueSupplier) {
		_ratingValue = ratingValueSupplier.get();
	}

	public void setWorstRating(Number worstRating) {
		_worstRating = worstRating;
	}

	public void setWorstRating(Supplier<Number> worstRatingSupplier) {
		_worstRating = worstRatingSupplier.get();
	}

	private Number _bestRating;
	private Long _id;
	private Number _ratingCount;
	private Number _ratingValue;
	private Number _worstRating;

}