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

package com.liferay.headless.foundation.internal.dto.v1_0;

import com.liferay.headless.foundation.dto.v1_0.*;
import com.liferay.petra.function.UnsafeSupplier;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("HoursAvailable")
@XmlRootElement(name = "HoursAvailable")
public class HoursAvailableImpl implements HoursAvailable {

	public String getCloses() {
			return closes;
	}

	public void setCloses(String closes) {
			this.closes = closes;
	}

	public void setCloses(UnsafeSupplier<String, Throwable> closesUnsafeSupplier) {
			try {
				closes = closesUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String closes;
	public String getDayOfWeek() {
			return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
			this.dayOfWeek = dayOfWeek;
	}

	public void setDayOfWeek(UnsafeSupplier<String, Throwable> dayOfWeekUnsafeSupplier) {
			try {
				dayOfWeek = dayOfWeekUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String dayOfWeek;
	public Long getId() {
			return id;
	}

	public void setId(Long id) {
			this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier) {
			try {
				id = idUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Long id;
	public String getOpens() {
			return opens;
	}

	public void setOpens(String opens) {
			this.opens = opens;
	}

	public void setOpens(UnsafeSupplier<String, Throwable> opensUnsafeSupplier) {
			try {
				opens = opensUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String opens;

}