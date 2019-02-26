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

package com.liferay.headless.form.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("Grid")
@XmlRootElement(name = "Grid")
public class Grid {

	public Columns[] getColumns() {
		return columns;
	}

	public Long getId() {
		return id;
	}

	public Rows[] getRows() {
		return rows;
	}

	public void setColumns(Columns[] columns) {
		this.columns = columns;
	}

	@JsonIgnore
	public void setColumns(
		UnsafeSupplier<Columns[], Throwable> columnsUnsafeSupplier) {

		try {
			columns = columnsUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier) {
		try {
			id = idUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public void setRows(Rows[] rows) {
		this.rows = rows;
	}

	@JsonIgnore
	public void setRows(UnsafeSupplier<Rows[], Throwable> rowsUnsafeSupplier) {
		try {
			rows = rowsUnsafeSupplier.get();
		}
		catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public String toString() {
		StringBundler sb = new StringBundler(8);

		sb.append("{");

		sb.append("columns=");

		sb.append(columns);
		sb.append(", id=");

		sb.append(id);
		sb.append(", rows=");

		sb.append(rows);

		sb.append("}");

		return sb.toString();
	}

	@GraphQLField
	@JsonProperty
	protected Columns[] columns;

	@GraphQLField
	@JsonProperty
	protected Long id;

	@GraphQLField
	@JsonProperty
	protected Rows[] rows;

}