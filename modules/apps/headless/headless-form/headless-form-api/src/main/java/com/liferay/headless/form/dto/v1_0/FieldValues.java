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

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "FieldValues")
public class FieldValues {

	public FormDocument getDocument() {
		return _document;
	}

	public Long getDocumentId() {
		return _documentId;
	}

	public Long getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public String getValue() {
		return _value;
	}

	public void setDocument(FormDocument document) {
		_document = document;
	}

	public void setDocument(Supplier<FormDocument> documentSupplier) {
		_document = documentSupplier.get();
	}

	public void setDocumentId(Long documentId) {
		_documentId = documentId;
	}

	public void setDocumentId(Supplier<Long> documentIdSupplier) {
		_documentId = documentIdSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setName(String name) {
		_name = name;
	}

	public void setName(Supplier<String> nameSupplier) {
		_name = nameSupplier.get();
	}

	public void setValue(String value) {
		_value = value;
	}

	public void setValue(Supplier<String> valueSupplier) {
		_value = valueSupplier.get();
	}

	private FormDocument _document;
	private Long _documentId;
	private Long _id;
	private String _name;
	private String _value;

}