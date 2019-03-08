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

package com.liferay.digital.signature.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.petra.string.StringBundler;

import java.util.Objects;

/**
 * @author Michael C. Han
 */
@ProviderType
public class DSSessionKey {

	public DSSessionKey(long companyId, String userName, String accountKey) {
		_companyId = companyId;
		_userName = userName;
		_accountKey = accountKey;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if ((object == null) || (getClass() != object.getClass())) {
			return false;
		}

		final DSSessionKey dsSessionKey = (DSSessionKey)object;

		if (getCompanyId() != dsSessionKey.getCompanyId()) {
			return false;
		}

		if (!Objects.equals(getAccountKey(), dsSessionKey.getAccountKey())) {
			return false;
		}

		if (!Objects.equals(getUserName(), dsSessionKey.getUserName())) {
			return false;
		}

		return true;
	}

	public String getAccountKey() {
		return _accountKey;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public String getUserName() {
		return _userName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(_companyId, _accountKey, _userName);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{className=");

		Class<?> clazz = getClass();

		sb.append(clazz.getSimpleName());

		sb.append(", accountId=");
		sb.append(_accountKey);
		sb.append(", companyId=");
		sb.append(_companyId);
		sb.append(", userName=");
		sb.append(_userName);
		sb.append("}");

		return sb.toString();
	}

	private final String _accountKey;
	private final long _companyId;
	private final String _userName;

}