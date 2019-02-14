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
@XmlRootElement(name = "Form")
public class Form {

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

	public Date getDatePublished() {
		return _datePublished;
	}

	public String getDefaultLanguage() {
		return _defaultLanguage;
	}

	public String getDescription() {
		return _description;
	}

	public FormRecord[] getFormRecords() {
		return _formRecords;
	}

	public Long[] getFormRecordsIds() {
		return _formRecordsIds;
	}

	public Long getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public FormStructure getStructure() {
		return _structure;
	}

	public Long getStructureId() {
		return _structureId;
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

	public void setDatePublished(Date datePublished) {
		_datePublished = datePublished;
	}

	public void setDatePublished(Supplier<Date> datePublishedSupplier) {
		_datePublished = datePublishedSupplier.get();
	}

	public void setDefaultLanguage(String defaultLanguage) {
		_defaultLanguage = defaultLanguage;
	}

	public void setDefaultLanguage(Supplier<String> defaultLanguageSupplier) {
		_defaultLanguage = defaultLanguageSupplier.get();
	}

	public void setDescription(String description) {
		_description = description;
	}

	public void setDescription(Supplier<String> descriptionSupplier) {
		_description = descriptionSupplier.get();
	}

	public void setFormRecords(FormRecord[] formRecords) {
		_formRecords = formRecords;
	}

	public void setFormRecords(Supplier<FormRecord[]> formRecordsSupplier) {
		_formRecords = formRecordsSupplier.get();
	}

	public void setFormRecordsIds(Long[] formRecordsIds) {
		_formRecordsIds = formRecordsIds;
	}

	public void setFormRecordsIds(Supplier<Long[]> formRecordsIdsSupplier) {
		_formRecordsIds = formRecordsIdsSupplier.get();
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

	public void setStructure(FormStructure structure) {
		_structure = structure;
	}

	public void setStructure(Supplier<FormStructure> structureSupplier) {
		_structure = structureSupplier.get();
	}

	public void setStructureId(Long structureId) {
		_structureId = structureId;
	}

	public void setStructureId(Supplier<Long> structureIdSupplier) {
		_structureId = structureIdSupplier.get();
	}

	private String[] _availableLanguages;
	private Long _contentSpace;
	private Creator _creator;
	private Date _dateCreated;
	private Date _dateModified;
	private Date _datePublished;
	private String _defaultLanguage;
	private String _description;
	private FormRecord[] _formRecords;
	private Long[] _formRecordsIds;
	private Long _id;
	private String _name;
	private FormStructure _structure;
	private Long _structureId;

}