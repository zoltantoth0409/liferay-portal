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

package com.liferay.headless.web.experience.internal.graphql.mutation.v1_0;

import com.liferay.headless.web.experience.dto.v1_0.Comment;
import com.liferay.headless.web.experience.dto.v1_0.StructuredContent;
import com.liferay.headless.web.experience.resource.v1_0.CommentResource;
import com.liferay.headless.web.experience.resource.v1_0.StructuredContentResource;
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

	@GraphQLInvokeDetached
	public boolean deleteComment(@GraphQLName("comment-id") Long commentId)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		return commentResource.deleteComment(commentId);
	}

	@GraphQLInvokeDetached
	public Comment putComment(
			@GraphQLName("comment-id") Long commentId,
			@GraphQLName("Comment") Comment comment)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		return commentResource.putComment(commentId, comment);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment postCommentComment(
			@GraphQLName("comment-id") Long commentId,
			@GraphQLName("Comment") Comment comment)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		return commentResource.postCommentComment(commentId, comment);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment postStructuredContentComment(
			@GraphQLName("structured-content-id") Long structuredContentId,
			@GraphQLName("Comment") Comment comment)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		return commentResource.postStructuredContentComment(
			structuredContentId, comment);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContent postContentSpaceStructuredContent(
			@GraphQLName("content-space-id") Long contentSpaceId,
			@GraphQLName("StructuredContent") StructuredContent
				structuredContent)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		return structuredContentResource.postContentSpaceStructuredContent(
			contentSpaceId, structuredContent);
	}

	@GraphQLInvokeDetached
	public boolean deleteStructuredContent(
			@GraphQLName("structured-content-id") Long structuredContentId)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		return structuredContentResource.deleteStructuredContent(
			structuredContentId);
	}

	@GraphQLInvokeDetached
	public StructuredContent patchStructuredContent(
			@GraphQLName("structured-content-id") Long structuredContentId,
			@GraphQLName("StructuredContent") StructuredContent
				structuredContent)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		return structuredContentResource.patchStructuredContent(
			structuredContentId, structuredContent);
	}

	@GraphQLInvokeDetached
	public StructuredContent putStructuredContent(
			@GraphQLName("structured-content-id") Long structuredContentId,
			@GraphQLName("StructuredContent") StructuredContent
				structuredContent)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		return structuredContentResource.putStructuredContent(
			structuredContentId, structuredContent);
	}

	private static CommentResource _createCommentResource() throws Exception {
		CommentResource commentResource =
			_commentResourceServiceTracker.getService();

		commentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return commentResource;
	}

	private static final ServiceTracker<CommentResource, CommentResource>
		_commentResourceServiceTracker;

	private static StructuredContentResource _createStructuredContentResource()
		throws Exception {

		StructuredContentResource structuredContentResource =
			_structuredContentResourceServiceTracker.getService();

		structuredContentResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return structuredContentResource;
	}

	private static final ServiceTracker
		<StructuredContentResource, StructuredContentResource>
			_structuredContentResourceServiceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(Mutation.class);

		ServiceTracker<CommentResource, CommentResource>
			commentResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), CommentResource.class, null);

		commentResourceServiceTracker.open();

		_commentResourceServiceTracker = commentResourceServiceTracker;
		ServiceTracker<StructuredContentResource, StructuredContentResource>
			structuredContentResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), StructuredContentResource.class,
				null);

		structuredContentResourceServiceTracker.open();

		_structuredContentResourceServiceTracker =
			structuredContentResourceServiceTracker;
	}

}