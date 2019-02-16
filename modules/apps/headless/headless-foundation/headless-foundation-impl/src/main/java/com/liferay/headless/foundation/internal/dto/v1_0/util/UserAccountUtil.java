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

package com.liferay.headless.foundation.internal.dto.v1_0.util;

import com.liferay.headless.foundation.dto.v1_0.UserAccount;
import com.liferay.headless.foundation.internal.dto.v1_0.UserAccountImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;

/**
 * @author Javier Gamarra
 */
public class UserAccountUtil {

	public static UserAccount toUserAccount(User user) throws PortalException {
		if (user == null) {
			return null;
		}

		return new UserAccountImpl() {
			{
				setAdditionalName(user.getMiddleName());
				setAlternateName(user.getScreenName());
				setBirthDate(user.getBirthday());
				setEmail(user.getEmailAddress());
				setFamilyName(user.getLastName());
				setGivenName(user.getFirstName());
				setId(user.getUserId());
				setJobTitle(user.getJobTitle());
				setName(user.getFullName());
			}
		};
	}

}