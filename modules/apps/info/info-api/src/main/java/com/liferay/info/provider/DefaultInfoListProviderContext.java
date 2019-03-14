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

package com.liferay.info.provider;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.User;

import java.util.Optional;

/**
 * @author Jorge Ferrer
 */
public class DefaultInfoListProviderContext implements InfoListProviderContext {

	public DefaultInfoListProviderContext(Group group, User user) {
		_group = group;
		_user = user;
	}

	@Override
	public Optional<AssetEntry> getAssetEntryOptional() {
		return Optional.ofNullable(_assetEntry);
	}

	@Override
	public Group getGroup() {
		return _group;
	}

	@Override
	public Optional<Layout> getLayoutOptional() {
		return Optional.of(_layout);
	}

	@Override
	public User getUser() {
		return _user;
	}

	public void setAssetEntry(AssetEntry assetEntry) {
		_assetEntry = assetEntry;
	}

	public void setLayout(Layout layout) {
		_layout = layout;
	}

	private AssetEntry _assetEntry;
	private final Group _group;
	private Layout _layout;
	private final User _user;

}