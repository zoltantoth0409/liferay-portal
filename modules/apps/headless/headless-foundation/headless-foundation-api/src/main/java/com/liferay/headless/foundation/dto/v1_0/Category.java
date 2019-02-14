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

package com.liferay.headless.foundation.dto.v1_0;

import java.util.Date;
import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "Category")
public class Category {

	public String[] getAvailableLanguages() {
		return _availableLanguages;
	}

	public Category getCategory() {
		return _category;
	}

	public Long getCategoryId() {
		return _categoryId;
	}

	public UserAccount getCreator() {
		return _creator;
	}

	public Long getCreatorId() {
		return _creatorId;
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

	public Long getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public Category[] getSubcategories() {
		return _subcategories;
	}

	public Vocabulary getVocabulary() {
		return _vocabulary;
	}

	public Long getVocabularyId() {
		return _vocabularyId;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
		_availableLanguages = availableLanguages;
	}

	public void setAvailableLanguages(
		Supplier<String[]> availableLanguagesSupplier) {

		_availableLanguages = availableLanguagesSupplier.get();
	}

	public void setCategory(Category category) {
		_category = category;
	}

	public void setCategory(Supplier<Category> categorySupplier) {
		_category = categorySupplier.get();
	}

	public void setCategoryId(Long categoryId) {
		_categoryId = categoryId;
	}

	public void setCategoryId(Supplier<Long> categoryIdSupplier) {
		_categoryId = categoryIdSupplier.get();
	}

	public void setCreator(Supplier<UserAccount> creatorSupplier) {
		_creator = creatorSupplier.get();
	}

	public void setCreator(UserAccount creator) {
		_creator = creator;
	}

	public void setCreatorId(Long creatorId) {
		_creatorId = creatorId;
	}

	public void setCreatorId(Supplier<Long> creatorIdSupplier) {
		_creatorId = creatorIdSupplier.get();
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

	public void setSubcategories(Category[] subcategories) {
		_subcategories = subcategories;
	}

	public void setSubcategories(Supplier<Category[]> subcategoriesSupplier) {
		_subcategories = subcategoriesSupplier.get();
	}

	public void setVocabulary(Supplier<Vocabulary> vocabularySupplier) {
		_vocabulary = vocabularySupplier.get();
	}

	public void setVocabulary(Vocabulary vocabulary) {
		_vocabulary = vocabulary;
	}

	public void setVocabularyId(Long vocabularyId) {
		_vocabularyId = vocabularyId;
	}

	public void setVocabularyId(Supplier<Long> vocabularyIdSupplier) {
		_vocabularyId = vocabularyIdSupplier.get();
	}

	private String[] _availableLanguages;
	private Category _category;
	private Long _categoryId;
	private UserAccount _creator;
	private Long _creatorId;
	private Date _dateCreated;
	private Date _dateModified;
	private String _description;
	private Long _id;
	private String _name;
	private Category[] _subcategories;
	private Vocabulary _vocabulary;
	private Long _vocabularyId;

}