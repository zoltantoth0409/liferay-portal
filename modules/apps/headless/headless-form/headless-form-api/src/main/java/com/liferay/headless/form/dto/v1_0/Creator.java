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

import com.liferay.petra.function.UnsafeSupplier;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public interface Creator {

	public String getAdditionalName();

	public void setAdditionalName(String additionalName);

	public void setAdditionalName(UnsafeSupplier<String, Throwable> additionalNameUnsafeSupplier);
	public String getAlternateName();

	public void setAlternateName(String alternateName);

	public void setAlternateName(UnsafeSupplier<String, Throwable> alternateNameUnsafeSupplier);
	public String getEmail();

	public void setEmail(String email);

	public void setEmail(UnsafeSupplier<String, Throwable> emailUnsafeSupplier);
	public String getFamilyName();

	public void setFamilyName(String familyName);

	public void setFamilyName(UnsafeSupplier<String, Throwable> familyNameUnsafeSupplier);
	public String getGivenName();

	public void setGivenName(String givenName);

	public void setGivenName(UnsafeSupplier<String, Throwable> givenNameUnsafeSupplier);
	public Long getId();

	public void setId(Long id);

	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier);
	public String getImage();

	public void setImage(String image);

	public void setImage(UnsafeSupplier<String, Throwable> imageUnsafeSupplier);
	public String getJobTitle();

	public void setJobTitle(String jobTitle);

	public void setJobTitle(UnsafeSupplier<String, Throwable> jobTitleUnsafeSupplier);
	public String getName();

	public void setName(String name);

	public void setName(UnsafeSupplier<String, Throwable> nameUnsafeSupplier);
	public String getProfileURL();

	public void setProfileURL(String profileURL);

	public void setProfileURL(UnsafeSupplier<String, Throwable> profileURLUnsafeSupplier);

}