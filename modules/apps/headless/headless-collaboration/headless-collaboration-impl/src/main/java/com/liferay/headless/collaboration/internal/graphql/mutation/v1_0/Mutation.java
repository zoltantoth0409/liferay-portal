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

package com.liferay.headless.collaboration.internal.graphql.mutation.v1_0;

import com.liferay.headless.collaboration.dto.v1_0.BlogPosting;
import com.liferay.headless.collaboration.dto.v1_0.BlogPostingImage;
import com.liferay.headless.collaboration.dto.v1_0.Comment;
import com.liferay.headless.collaboration.resource.v1_0.BlogPostingImageResource;
import com.liferay.headless.collaboration.resource.v1_0.BlogPostingResource;
import com.liferay.headless.collaboration.resource.v1_0.CommentResource;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.vulcan.multipart.MultipartBody;

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
	public boolean deleteBlogPosting(
			@GraphQLName("blog-posting-id") Long blogPostingId)
		throws Exception {

		BlogPostingResource blogPostingResource = _createBlogPostingResource();

		return blogPostingResource.deleteBlogPosting(blogPostingId);
	}

	@GraphQLInvokeDetached
	public BlogPosting patchBlogPosting(
			@GraphQLName("blog-posting-id") Long blogPostingId,
			@GraphQLName("BlogPosting") BlogPosting blogPosting)
		throws Exception {

		BlogPostingResource blogPostingResource = _createBlogPostingResource();

		return blogPostingResource.patchBlogPosting(blogPostingId, blogPosting);
	}

	@GraphQLInvokeDetached
	public BlogPosting putBlogPosting(
			@GraphQLName("blog-posting-id") Long blogPostingId,
			@GraphQLName("BlogPosting") BlogPosting blogPosting)
		throws Exception {

		BlogPostingResource blogPostingResource = _createBlogPostingResource();

		return blogPostingResource.putBlogPosting(blogPostingId, blogPosting);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public BlogPosting postContentSpaceBlogPosting(
			@GraphQLName("content-space-id") Long contentSpaceId,
			@GraphQLName("BlogPosting") BlogPosting blogPosting)
		throws Exception {

		BlogPostingResource blogPostingResource = _createBlogPostingResource();

		return blogPostingResource.postContentSpaceBlogPosting(
			contentSpaceId, blogPosting);
	}

	@GraphQLInvokeDetached
	public boolean deleteBlogPostingImage(
			@GraphQLName("blog-posting-image-id") Long blogPostingImageId)
		throws Exception {

		BlogPostingImageResource blogPostingImageResource =
			_createBlogPostingImageResource();

		return blogPostingImageResource.deleteBlogPostingImage(
			blogPostingImageId);
	}

	@GraphQLInvokeDetached
	public BlogPostingImage patchBlogPostingImage(
			@GraphQLName("blog-posting-image-id") Long blogPostingImageId,
			@GraphQLName("MultipartBody") MultipartBody multipartBody)
		throws Exception {

		BlogPostingImageResource blogPostingImageResource =
			_createBlogPostingImageResource();

		return blogPostingImageResource.patchBlogPostingImage(
			blogPostingImageId, multipartBody);
	}

	@GraphQLInvokeDetached
	public BlogPostingImage putBlogPostingImage(
			@GraphQLName("blog-posting-image-id") Long blogPostingImageId,
			@GraphQLName("MultipartBody") MultipartBody multipartBody)
		throws Exception {

		BlogPostingImageResource blogPostingImageResource =
			_createBlogPostingImageResource();

		return blogPostingImageResource.putBlogPostingImage(
			blogPostingImageId, multipartBody);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public BlogPostingImage postContentSpaceBlogPostingImage(
			@GraphQLName("content-space-id") Long contentSpaceId,
			@GraphQLName("MultipartBody") MultipartBody multipartBody)
		throws Exception {

		BlogPostingImageResource blogPostingImageResource =
			_createBlogPostingImageResource();

		return blogPostingImageResource.postContentSpaceBlogPostingImage(
			contentSpaceId, multipartBody);
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Comment postBlogPostingComment(
			@GraphQLName("blog-posting-id") Long blogPostingId,
			@GraphQLName("Comment") Comment comment)
		throws Exception {

		CommentResource commentResource = _createCommentResource();

		return commentResource.postBlogPostingComment(blogPostingId, comment);
	}

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

	private static BlogPostingResource _createBlogPostingResource()
		throws Exception {

		BlogPostingResource blogPostingResource =
			_blogPostingResourceServiceTracker.getService();

		blogPostingResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return blogPostingResource;
	}

	private static final ServiceTracker
		<BlogPostingResource, BlogPostingResource>
			_blogPostingResourceServiceTracker;

	private static BlogPostingImageResource _createBlogPostingImageResource()
		throws Exception {

		BlogPostingImageResource blogPostingImageResource =
			_blogPostingImageResourceServiceTracker.getService();

		blogPostingImageResource.setContextCompany(
			CompanyLocalServiceUtil.getCompany(
				CompanyThreadLocal.getCompanyId()));

		return blogPostingImageResource;
	}

	private static final ServiceTracker
		<BlogPostingImageResource, BlogPostingImageResource>
			_blogPostingImageResourceServiceTracker;

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

	static {
		Bundle bundle = FrameworkUtil.getBundle(Mutation.class);

		ServiceTracker<BlogPostingResource, BlogPostingResource>
			blogPostingResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), BlogPostingResource.class, null);

		blogPostingResourceServiceTracker.open();

		_blogPostingResourceServiceTracker = blogPostingResourceServiceTracker;
		ServiceTracker<BlogPostingImageResource, BlogPostingImageResource>
			blogPostingImageResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), BlogPostingImageResource.class,
				null);

		blogPostingImageResourceServiceTracker.open();

		_blogPostingImageResourceServiceTracker =
			blogPostingImageResourceServiceTracker;
		ServiceTracker<CommentResource, CommentResource>
			commentResourceServiceTracker = new ServiceTracker<>(
				bundle.getBundleContext(), CommentResource.class, null);

		commentResourceServiceTracker.open();

		_commentResourceServiceTracker = commentResourceServiceTracker;
	}

}