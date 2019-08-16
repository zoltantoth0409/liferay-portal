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

package com.liferay.account.admin.web.internal.display;

import com.liferay.account.model.AccountEntry;
import com.liferay.account.service.AccountEntryLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Website;
import com.liferay.portal.kernel.service.WebsiteLocalServiceUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.util.List;

/**
 * @author Pei-Jung Lan
 */
public class AccountDisplay {

	public static AccountDisplay of(AccountEntry accountEntry) {
		AccountDisplay.Builder builder = new AccountDisplay.Builder();

		return builder.accountId(
			accountEntry.getAccountEntryId()
		).description(
			accountEntry.getDescription()
		).name(
			accountEntry.getName()
		).parentAccountName(
			_getParentAccountName(accountEntry)
		).statusLabel(
			_getStatusLabel(accountEntry)
		).website(
			_getWebsite(accountEntry)
		).build();
	}

	public long getAccountId() {
		return _builder._accountId;
	}

	public String getAccountOwner() {
		return _builder._accountOwner;
	}

	public String getDescription() {
		return _builder._description;
	}

	public String getName() {
		return _builder._name;
	}

	public String getParentAccountName() {
		return _builder._parentAccountName;
	}

	public String getStatusLabel() {
		return _builder._statusLabel;
	}

	public String getWebsite() {
		return _builder._website;
	}

	public static class Builder {

		public Builder accountId(long accountId) {
			_accountId = accountId;

			return this;
		}

		public Builder accountOwner(String accountOwner) {
			_accountOwner = accountOwner;

			return this;
		}

		public AccountDisplay build() {
			return new AccountDisplay(this);
		}

		public Builder description(String description) {
			_description = description;

			return this;
		}

		public Builder name(String name) {
			_name = name;

			return this;
		}

		public Builder parentAccountName(String parentAccountName) {
			_parentAccountName = parentAccountName;

			return this;
		}

		public Builder statusLabel(String statusLabel) {
			_statusLabel = statusLabel;

			return this;
		}

		public Builder website(String website) {
			_website = website;

			return this;
		}

		private long _accountId;
		private String _accountOwner = StringPool.BLANK;
		private String _description = StringPool.BLANK;
		private String _name = StringPool.BLANK;
		private String _parentAccountName = StringPool.BLANK;
		private String _statusLabel = StringPool.BLANK;
		private String _website = StringPool.BLANK;

	}

	private static String _getParentAccountName(AccountEntry accountEntry) {
		long parentAccountEntryId = accountEntry.getParentAccountEntryId();

		if (parentAccountEntryId == 0) {
			return StringPool.BLANK;
		}

		AccountEntry parentAccountEntry =
			AccountEntryLocalServiceUtil.fetchAccountEntry(
				parentAccountEntryId);

		if (parentAccountEntry != null) {
			return parentAccountEntry.getName();
		}

		return StringPool.BLANK;
	}

	private static String _getStatusLabel(AccountEntry accountEntry) {
		int status = accountEntry.getStatus();

		if (status == WorkflowConstants.STATUS_APPROVED) {
			return "active";
		}

		if (status == WorkflowConstants.STATUS_INACTIVE) {
			return "inactive";
		}

		return StringPool.BLANK;
	}

	private static String _getWebsite(AccountEntry accountEntry) {
		List<Website> websites = WebsiteLocalServiceUtil.getWebsites(
			accountEntry.getCompanyId(), AccountEntry.class.getName(),
			accountEntry.getAccountEntryId());

		if (websites.isEmpty()) {
			return StringPool.BLANK;
		}

		Website website = websites.get(0);

		return website.getUrl();
	}

	private AccountDisplay(Builder builder) {
		_builder = builder;
	}

	private final Builder _builder;

}