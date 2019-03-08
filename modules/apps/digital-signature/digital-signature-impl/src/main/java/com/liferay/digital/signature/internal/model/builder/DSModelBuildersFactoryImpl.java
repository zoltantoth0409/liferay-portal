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

import com.liferay.digital.signature.model.builder.AgentDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.CarbonCopyDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.CertifiedDeliveryDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.DSDocumentBuilder;
import com.liferay.digital.signature.model.builder.DSEmailNotificationBuilder;
import com.liferay.digital.signature.model.builder.DSModelBuildersFactory;
import com.liferay.digital.signature.model.builder.DSSignaturePackageBuilder;
import com.liferay.digital.signature.model.builder.EditorDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.InPersonSignerDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.InPersonSignerNotaryDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.IntermediaryDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.SealDSParticipantBuilder;
import com.liferay.digital.signature.model.builder.SignerDSParticipantBuilder;
import com.liferay.portal.kernel.uuid.PortalUUID;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Michael C. Han
 */
@Component(service = DSModelBuildersFactory.class)
public class DSModelBuildersFactoryImpl implements DSModelBuildersFactory {

	@Override
	public AgentDSParticipantBuilder createAgentDSParticipantBuilder(
		String name, String emailAddress, int routingOrder) {

		return new AgentDSParticipantBuilderImpl(name, emailAddress, routingOrder);
	}

	@Override
	public CarbonCopyDSParticipantBuilder createCarbonCopyDSParticipantBuilder(
		String name, String emailAddress, int routingOrder) {

		return new CarbonCopyDSParticipantBuilderImpl(
			name, emailAddress, routingOrder);
	}

	@Override
	public CertifiedDeliveryDSParticipantBuilder
		createCertifiedDeliveryDSParticipantBuilder(
			String name, String emailAddress, int routingOrder) {

		return new CertifiedDeliveryDSParticipantBuilderImpl(
			name, emailAddress, routingOrder);
	}

	@Override
	public DSDocumentBuilder createDSDocumentBuilder(
		String documentKey, String name) {

		return new DSDocumentBuilderImpl(documentKey, name);
	}

	@Override
	public DSEmailNotificationBuilder createDSEmailNotificationBuilder(
		String subject, String message) {

		return new DSEmailNotificationBuilderImpl(subject, message);
	}

	@Override
	public DSSignaturePackageBuilder createDSSignatureRequestBuilder() {
		return new DSSignaturePackageBuilderImpl(_portalUUID);
	}

	@Override
	public EditorDSParticipantBuilder createEditorDSParticipantBuilder(
		String name, String emailAddress, int routingOrder) {

		return new EditorDSParticipantBuilderImpl(name, emailAddress, routingOrder);
	}

	@Override
	public InPersonSignerDSParticipantBuilder
		createInPersonSignerDSParticipantBuilder(
			String hostName, String hostEmailAddress, String signerName,
			String signerEmailAddress, int routingOrder) {

		return new InPersonSignerDSParticipantBuilderImpl(
			hostName, hostEmailAddress, signerName, signerEmailAddress, routingOrder);
	}

	@Override
	public InPersonSignerNotaryDSParticipantBuilder
		createInPersonSignerNotaryDSParticipantBuilder(
			String name, String emailAddress, int routingOrder,
			String notaryParticipantKey, String notaryName, String notaryEmailAddress) {

		return new InPersonSignerNotaryDSParticipantBuilderImpl(
			name, emailAddress, routingOrder, notaryParticipantKey, notaryName,
			notaryEmailAddress);
	}

	@Override
	public IntermediaryDSParticipantBuilder
		createIntermediaryDSParticipantBuilder(
			String name, String emailAddress, int routingOrder) {

		return new IntermediaryDSParticipantBuilderImpl(
			name, emailAddress, routingOrder);
	}

	@Override
	public SealDSParticipantBuilder createSealDSParticipantBuilder(
		String participantId, String name, String emailAddress, int routingOrder) {

		return new SealDSParticipantBuilderImpl(
			participantId, name, emailAddress, routingOrder);
	}

	@Override
	public SignerDSParticipantBuilder createSignerDSParticipantBuilder(
		String name, String emailAddress, int routingOrder) {

		return new SignerDSParticipantBuilderImpl(name, emailAddress, routingOrder);
	}

	protected void setPortalUUID(PortalUUID portalUUID) {
		_portalUUID = portalUUID;
	}

	@Reference
	private PortalUUID _portalUUID;

}