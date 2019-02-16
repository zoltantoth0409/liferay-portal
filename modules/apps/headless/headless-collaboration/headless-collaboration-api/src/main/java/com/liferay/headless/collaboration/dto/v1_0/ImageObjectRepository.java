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

package com.liferay.headless.collaboration.dto.v1_0;

import com.liferay.petra.function.UnsafeSupplier;

import java.util.Date;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public interface ImageObjectRepository {

	public Date getDateCreated();

	public void setDateCreated(Date dateCreated);

	public void setDateCreated(UnsafeSupplier<Date, Throwable> dateCreatedUnsafeSupplier);
	public Date getDateModified();

	public void setDateModified(Date dateModified);

	public void setDateModified(UnsafeSupplier<Date, Throwable> dateModifiedUnsafeSupplier);
	public Long getId();

	public void setId(Long id);

	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier);
	public ImageObject[] getImages();

	public void setImages(ImageObject[] images);

	public void setImages(UnsafeSupplier<ImageObject[], Throwable> imagesUnsafeSupplier);
	public Long[] getImagesIds();

	public void setImagesIds(Long[] imagesIds);

	public void setImagesIds(UnsafeSupplier<Long[], Throwable> imagesIdsUnsafeSupplier);
	public String getName();

	public void setName(String name);

	public void setName(UnsafeSupplier<String, Throwable> nameUnsafeSupplier);

}