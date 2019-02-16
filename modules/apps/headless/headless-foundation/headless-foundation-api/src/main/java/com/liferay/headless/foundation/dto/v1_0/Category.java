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

import com.liferay.petra.function.UnsafeSupplier;

import java.util.Date;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public interface Category {

	public String[] getAvailableLanguages();

	public Category getCategory();

	public Long getCategoryId();

	public UserAccount getCreator();

	public Long getCreatorId();

	public Date getDateCreated();

	public Date getDateModified();

	public String getDescription();

	public Long getId();

	public String getName();

	public Category[] getSubcategories();

	public Vocabulary getVocabulary();

	public Long getVocabularyId();

	public void setAvailableLanguages(String[] availableLanguages);

	public void setAvailableLanguages(
		UnsafeSupplier<String[], Throwable> availableLanguagesUnsafeSupplier);

	public void setCategory(Category category);

	public void setCategory(
		UnsafeSupplier<Category, Throwable> categoryUnsafeSupplier);

	public void setCategoryId(Long categoryId);

	public void setCategoryId(
		UnsafeSupplier<Long, Throwable> categoryIdUnsafeSupplier);

	public void setCreator(
		UnsafeSupplier<UserAccount, Throwable> creatorUnsafeSupplier);

	public void setCreator(UserAccount creator);

	public void setCreatorId(Long creatorId);

	public void setCreatorId(
		UnsafeSupplier<Long, Throwable> creatorIdUnsafeSupplier);

	public void setDateCreated(Date dateCreated);

	public void setDateCreated(
		UnsafeSupplier<Date, Throwable> dateCreatedUnsafeSupplier);

	public void setDateModified(Date dateModified);

	public void setDateModified(
		UnsafeSupplier<Date, Throwable> dateModifiedUnsafeSupplier);

	public void setDescription(String description);

	public void setDescription(
		UnsafeSupplier<String, Throwable> descriptionUnsafeSupplier);

	public void setId(Long id);

	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier);

	public void setName(String name);

	public void setName(UnsafeSupplier<String, Throwable> nameUnsafeSupplier);

	public void setSubcategories(Category[] subcategories);

	public void setSubcategories(
		UnsafeSupplier<Category[], Throwable> subcategoriesUnsafeSupplier);

	public void setVocabulary(
		UnsafeSupplier<Vocabulary, Throwable> vocabularyUnsafeSupplier);

	public void setVocabulary(Vocabulary vocabulary);

	public void setVocabularyId(Long vocabularyId);

	public void setVocabularyId(
		UnsafeSupplier<Long, Throwable> vocabularyIdUnsafeSupplier);

}