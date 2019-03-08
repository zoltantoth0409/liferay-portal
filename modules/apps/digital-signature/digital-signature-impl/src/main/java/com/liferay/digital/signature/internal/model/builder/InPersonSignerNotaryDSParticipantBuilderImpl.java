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

package com.liferay.digital.signature.internal.model.builder;

import com.liferay.digital.signature.internal.model.DSNotaryInfoImpl;
import com.liferay.digital.signature.internal.model.InPersonSignerNotaryDSParticipantImpl;
import com.liferay.digital.signature.internal.model.SignerDSParticipantImpl;
import com.liferay.digital.signature.model.InPersonSignerNotaryDSParticipant;
import com.liferay.digital.signature.model.builder.InPersonSignerNotaryDSParticipantBuilder;

/**
 * @author Michael C. Han
 */
public class InPersonSignerNotaryDSParticipantBuilderImpl
	extends BaseSigningDSParticipantBuilder<InPersonSignerNotaryDSParticipant>
	implements InPersonSignerNotaryDSParticipantBuilder {

	public InPersonSignerNotaryDSParticipantBuilderImpl(
		String name, String emailAddress, int routingOrder, String notaryParticipantKey,
		String notaryName, String notaryEmailAddress) {

		super(name, emailAddress, routingOrder);

		_notaryParticipantKey = notaryParticipantKey;
		_notaryName = notaryName;
		_notaryEmailAddress = notaryEmailAddress;
	}

	@Override
	protected SignerDSParticipantImpl createDSSignerParticipantImpl() {
		DSNotaryInfoImpl dsNotaryInfoImpl = new DSNotaryInfoImpl(
			_notaryParticipantKey, _notaryName, _notaryEmailAddress);

		return new InPersonSignerNotaryDSParticipantImpl(
			getName(), getEmailAddress(), getRoutingOrder(), dsNotaryInfoImpl);
	}

	private final String _notaryEmailAddress;
	private final String _notaryName;
	private final String _notaryParticipantKey;

}