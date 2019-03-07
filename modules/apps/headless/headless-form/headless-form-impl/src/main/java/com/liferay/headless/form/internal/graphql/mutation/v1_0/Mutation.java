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

package com.liferay.headless.form.internal.graphql.mutation.v1_0;

import com.liferay.headless.form.dto.v1_0.Form;
import com.liferay.headless.form.dto.v1_0.FormRecord;
import com.liferay.headless.form.resource.v1_0.FormDocumentResource;
import com.liferay.headless.form.resource.v1_0.FormRecordResource;
import com.liferay.headless.form.resource.v1_0.FormResource;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Mutation {

	@GraphQLField
	@GraphQLInvokeDetached
	public Form postFormEvaluateContext(
			@GraphQLName("form-id") Long formId, @GraphQLName("Form") Form form)
		throws Exception {

		FormResource formResource = _createFormResource();

		return formResource.postFormEvaluateContext(formId, form);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Form postFormUploadFile(
			@GraphQLName("form-id") Long formId, @GraphQLName("Form") Form form)
		throws Exception {

		FormResource formResource = _createFormResource();

		return formResource.postFormUploadFile(formId, form);
	}

	@GraphQLInvokeDetached
	public boolean deleteFormDocument(
			@GraphQLName("form-document-id") Long formDocumentId)
		throws Exception {

		FormDocumentResource formDocumentResource =
			_createFormDocumentResource();

		return formDocumentResource.deleteFormDocument(formDocumentId);
	}

	@GraphQLInvokeDetached
	public FormRecord putFormRecord(
			@GraphQLName("form-record-id") Long formRecordId,
			@GraphQLName("FormRecord") FormRecord formRecord)
		throws Exception {

		FormRecordResource formRecordResource = _createFormRecordResource();

		return formRecordResource.putFormRecord(formRecordId, formRecord);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public FormRecord postFormFormRecord(
			@GraphQLName("form-id") Long formId,
			@GraphQLName("FormRecord") FormRecord formRecord)
		throws Exception {

		FormRecordResource formRecordResource = _createFormRecordResource();

		return formRecordResource.postFormFormRecord(formId, formRecord);
	}

	private static FormResource _createFormResource() throws Exception {
		FormResource formResource = _formResourceServiceTracker.getService();

		formResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return formResource;
	}

	private static final ServiceTracker<FormResource, FormResource>
		_formResourceServiceTracker;

	private static FormDocumentResource _createFormDocumentResource()
		throws Exception {

		FormDocumentResource formDocumentResource =
			_formDocumentResourceServiceTracker.getService();

		formDocumentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return formDocumentResource;
	}

	private static final ServiceTracker
		<FormDocumentResource, FormDocumentResource>
			_formDocumentResourceServiceTracker;

	private static FormRecordResource _createFormRecordResource()
		throws Exception {

		FormRecordResource formRecordResource =
			_formRecordResourceServiceTracker.getService();

		formRecordResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return formRecordResource;
	}

	private static final ServiceTracker<FormRecordResource, FormRecordResource>
		_formRecordResourceServiceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(Mutation.class);

		ServiceTracker<FormResource, FormResource> formResourceServiceTracker =
			new ServiceTracker<>(
				bundle.getBundleContext(), FormResource.class, null);

		formResourceServiceTracker.open();

		_formResourceServiceTracker = formResourceServiceTracker;
		ServiceTracker<FormDocumentResource, FormDocumentResource>
			formDocumentResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), FormDocumentResource.class, null);

		formDocumentResourceServiceTracker.open();

		_formDocumentResourceServiceTracker =
			formDocumentResourceServiceTracker;
		ServiceTracker<FormRecordResource, FormRecordResource>
			formRecordResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), FormRecordResource.class, null);

		formRecordResourceServiceTracker.open();

		_formRecordResourceServiceTracker = formRecordResourceServiceTracker;
	}

}