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

package com.liferay.headless.document.library.dto.v1_0;

import com.liferay.petra.function.UnsafeSupplier;

import java.util.Date;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public interface Folder {

	public Date getDateCreated();

	public Date getDateModified();

	public String getDescription();

	public Document[] getDocuments();

	public Long[] getDocumentsIds();

	public Folder getDocumentsRepository();

	public Long getDocumentsRepositoryId();

	public Long getId();

	public String getName();

	public Folder[] getSubFolders();

	public void setDateCreated(Date dateCreated);

	public void setDateCreated(
		UnsafeSupplier<Date, Throwable> dateCreatedUnsafeSupplier);

	public void setDateModified(Date dateModified);

	public void setDateModified(
		UnsafeSupplier<Date, Throwable> dateModifiedUnsafeSupplier);

	public void setDescription(String description);

	public void setDescription(
		UnsafeSupplier<String, Throwable> descriptionUnsafeSupplier);

	public void setDocuments(Document[] documents);

	public void setDocuments(
		UnsafeSupplier<Document[], Throwable> documentsUnsafeSupplier);

	public void setDocumentsIds(Long[] documentsIds);

	public void setDocumentsIds(
		UnsafeSupplier<Long[], Throwable> documentsIdsUnsafeSupplier);

	public void setDocumentsRepository(Folder documentsRepository);

	public void setDocumentsRepository(
		UnsafeSupplier<Folder, Throwable> documentsRepositoryUnsafeSupplier);

	public void setDocumentsRepositoryId(Long documentsRepositoryId);

	public void setDocumentsRepositoryId(
		UnsafeSupplier<Long, Throwable> documentsRepositoryIdUnsafeSupplier);

	public void setId(Long id);

	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier);

	public void setName(String name);

	public void setName(UnsafeSupplier<String, Throwable> nameUnsafeSupplier);

	public void setSubFolders(Folder[] subFolders);

	public void setSubFolders(
		UnsafeSupplier<Folder[], Throwable> subFoldersUnsafeSupplier);

}