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

package com.liferay.headless.web.experience.internal.graphql.query.v1_0;

import com.liferay.headless.web.experience.dto.v1_0.Comment;
import com.liferay.headless.web.experience.dto.v1_0.ContentStructure;
import com.liferay.headless.web.experience.dto.v1_0.StructuredContent;
import com.liferay.headless.web.experience.resource.v1_0.CommentResource;
import com.liferay.headless.web.experience.resource.v1_0.ContentStructureResource;
import com.liferay.headless.web.experience.resource.v1_0.StructuredContentResource;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import graphql.annotations.annotationTypes.GraphQLName;

import java.util.Collection;

import javax.annotation.Generated;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Query {

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment getComment(@GraphQLName("comment-id") Long commentId)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		return commentResource.getComment(commentId);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Comment> getCommentCommentsPage(
			@GraphQLName("comment-id") Long commentId,
			@GraphQLName("filter") Filter filter,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page, @GraphQLName("Sort[]") Sort[] sorts)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		Page paginationPage = commentResource.getCommentCommentsPage(
			commentId, filter, Pagination.of(pageSize, page), sorts);

		return paginationPage.getItems();
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<Comment> getStructuredContentCommentsPage(
			@GraphQLName("structured-content-id") Long structuredContentId,
			@GraphQLName("filter") Filter filter,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page, @GraphQLName("Sort[]") Sort[] sorts)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		Page paginationPage = commentResource.getStructuredContentCommentsPage(
			structuredContentId, filter, Pagination.of(pageSize, page), sorts);

		return paginationPage.getItems();
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<ContentStructure> getContentSpaceContentStructuresPage(
			@GraphQLName("content-space-id") Long contentSpaceId,
			@GraphQLName("filter") Filter filter,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page, @GraphQLName("Sort[]") Sort[] sorts)
		throws Exception {

		ContentStructureResource contentStructureResource =
			_createContentStructureResource();

		Page paginationPage =
			contentStructureResource.getContentSpaceContentStructuresPage(
				contentSpaceId, filter, Pagination.of(pageSize, page), sorts);

		return paginationPage.getItems();
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public ContentStructure getContentStructure(
			@GraphQLName("content-structure-id") Long contentStructureId)
		throws Exception {

		ContentStructureResource contentStructureResource =
			_createContentStructureResource();

		return contentStructureResource.getContentStructure(contentStructureId);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<StructuredContent> getContentSpaceStructuredContentsPage(
			@GraphQLName("content-space-id") Long contentSpaceId,
			@GraphQLName("filter") Filter filter,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page, @GraphQLName("Sort[]") Sort[] sorts)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		Page paginationPage =
			structuredContentResource.getContentSpaceStructuredContentsPage(
				contentSpaceId, filter, Pagination.of(pageSize, page), sorts);

		return paginationPage.getItems();
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Collection<StructuredContent>
			getContentStructureStructuredContentsPage(
				@GraphQLName("content-structure-id") Long contentStructureId,
				@GraphQLName("filter") Filter filter,
				@GraphQLName("pageSize") int pageSize,
				@GraphQLName("page") int page,
				@GraphQLName("Sort[]") Sort[] sorts)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		Page paginationPage =
			structuredContentResource.getContentStructureStructuredContentsPage(
				contentStructureId, filter, Pagination.of(pageSize, page),
				sorts);

		return paginationPage.getItems();
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContent getStructuredContent(
			@GraphQLName("structured-content-id") Long structuredContentId)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		return structuredContentResource.getStructuredContent(
			structuredContentId);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public String getStructuredContentRenderedContentTemplate(
			@GraphQLName("structured-content-id") Long structuredContentId,
			@GraphQLName("template-id") Long templateId)
		throws Exception {

		StructuredContentResource structuredContentResource =
			_createStructuredContentResource();

		return structuredContentResource.
			getStructuredContentRenderedContentTemplate(
				structuredContentId, templateId);
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

	private static ContentStructureResource _createContentStructureResource()
		throws Exception {

		ContentStructureResource contentStructureResource =
			_contentStructureResourceServiceTracker.getService();

		contentStructureResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return contentStructureResource;
	}

	private static final ServiceTracker
		<ContentStructureResource, ContentStructureResource>
			_contentStructureResourceServiceTracker;

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
		Bundle bundle = FrameworkUtil.getBundle(Query.class);

		ServiceTracker<CommentResource, CommentResource>
			commentResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), CommentResource.class, null);

		commentResourceServiceTracker.open();

		_commentResourceServiceTracker = commentResourceServiceTracker;
		ServiceTracker<ContentStructureResource, ContentStructureResource>
			contentStructureResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), ContentStructureResource.class,
				null);

		contentStructureResourceServiceTracker.open();

		_contentStructureResourceServiceTracker =
			contentStructureResourceServiceTracker;
		ServiceTracker<StructuredContentResource, StructuredContentResource>
			structuredContentResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), StructuredContentResource.class,
				null);

		structuredContentResourceServiceTracker.open();

		_structuredContentResourceServiceTracker =
			structuredContentResourceServiceTracker;
	}

}