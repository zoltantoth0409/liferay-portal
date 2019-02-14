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

import java.util.Date;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "FormRecord")
public class FormRecord {

	public Creator getCreator() {
		return _creator;
	}

	public Date getDateCreated() {
		return _dateCreated;
	}

	public Date getDateModified() {
		return _dateModified;
	}

	public Date getDatePublished() {
		return _datePublished;
	}

	public Boolean getDraft() {
		return _draft;
	}

	public FieldValues[] getFieldValues() {
		return _fieldValues;
	}

	public Form getForm() {
		return _form;
	}

	public Long getFormId() {
		return _formId;
	}

	public Long getId() {
		return _id;
	}

	public void setCreator(Creator creator) {
		_creator = creator;
	}

	public void setCreator(Supplier<Creator> creatorSupplier) {
		_creator = creatorSupplier.get();
	}

	public void setDateCreated(Date dateCreated) {
		_dateCreated = dateCreated;
	}

	public void setDateCreated(Supplier<Date> dateCreatedSupplier) {
		_dateCreated = dateCreatedSupplier.get();
	}

	public void setDateModified(Date dateModified) {
		_dateModified = dateModified;
	}

	public void setDateModified(Supplier<Date> dateModifiedSupplier) {
		_dateModified = dateModifiedSupplier.get();
	}

	public void setDatePublished(Date datePublished) {
		_datePublished = datePublished;
	}

	public void setDatePublished(Supplier<Date> datePublishedSupplier) {
		_datePublished = datePublishedSupplier.get();
	}

	public void setDraft(Boolean draft) {
		_draft = draft;
	}

	public void setDraft(Supplier<Boolean> draftSupplier) {
		_draft = draftSupplier.get();
	}

	public void setFieldValues(FieldValues[] fieldValues) {
		_fieldValues = fieldValues;
	}

	public void setFieldValues(Supplier<FieldValues[]> fieldValuesSupplier) {
		_fieldValues = fieldValuesSupplier.get();
	}

	public void setForm(Form form) {
		_form = form;
	}

	public void setForm(Supplier<Form> formSupplier) {
		_form = formSupplier.get();
	}

	public void setFormId(Long formId) {
		_formId = formId;
	}

	public void setFormId(Supplier<Long> formIdSupplier) {
		_formId = formIdSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	private Creator _creator;
	private Date _dateCreated;
	private Date _dateModified;
	private Date _datePublished;
	private Boolean _draft;
	private FieldValues[] _fieldValues;
	private Form _form;
	private Long _formId;
	private Long _id;

}