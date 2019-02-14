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

import java.util.Date;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "ContentStructure")
public class ContentStructure {

	public String[] getAvailableLanguages() {
		return _availableLanguages;
	}

	public Long getContentSpace() {
		return _contentSpace;
	}

	public Creator getCreator() {
		return _creator;
	}

	public Date getDateCreated() {
		return _dateCreated;
	}

	public Date getDateModified() {
		return _dateModified;
	}

	public String getDescription() {
		return _description;
	}

	public Fields[] getFields() {
		return _fields;
	}

	public Long getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
		_availableLanguages = availableLanguages;
	}

	public void setAvailableLanguages(
		Supplier<String[]> availableLanguagesSupplier) {

		_availableLanguages = availableLanguagesSupplier.get();
	}

	public void setContentSpace(Long contentSpace) {
		_contentSpace = contentSpace;
	}

	public void setContentSpace(Supplier<Long> contentSpaceSupplier) {
		_contentSpace = contentSpaceSupplier.get();
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

	public void setDescription(String description) {
		_description = description;
	}

	public void setDescription(Supplier<String> descriptionSupplier) {
		_description = descriptionSupplier.get();
	}

	public void setFields(Fields[] fields) {
		_fields = fields;
	}

	public void setFields(Supplier<Fields[]> fieldsSupplier) {
		_fields = fieldsSupplier.get();
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

	private String[] _availableLanguages;
	private Long _contentSpace;
	private Creator _creator;
	private Date _dateCreated;
	private Date _dateModified;
	private String _description;
	private Fields[] _fields;
	private Long _id;
	private String _name;

}