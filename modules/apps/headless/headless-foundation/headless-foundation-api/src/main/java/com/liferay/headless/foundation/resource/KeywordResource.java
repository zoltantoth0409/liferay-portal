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

package com.liferay.headless.foundation.resource;

import com.liferay.headless.foundation.dto.Keyword;
import com.liferay.oauth2.provider.scope.RequiresScope;
import com.liferay.portal.vulcan.context.Pagination;
import com.liferay.portal.vulcan.dto.Page;

import javax.annotation.Generated;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/headless-foundation/1.0.0
 *
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@Path("/1.0.0")
public interface KeywordResource {

	@GET
	@Path("/content-space/{parent-id}/keywords")
	@Produces({"application/json"})
	@RequiresScope("headless-foundation-application.read")
	public Page<Keyword> getContentSpaceKeywordsPage(
			@PathParam("parent-id") Long parentId,
			@Context Pagination pagination)
		throws Exception;

	@GET
	@Path("/keywords/{id}")
	@Produces({"application/json"})
	@RequiresScope("headless-foundation-application.read")
	public Keyword getKeyword(@PathParam("id") Long id) throws Exception;

	@Consumes({"application/json"})
	@Path("/content-space/{parent-id}/keywords")
	@POST
	@Produces({"application/json"})
	@RequiresScope("headless-foundation-application.read")
	public Keyword postContentSpaceKeyword(
			@PathParam("parent-id") Long parentId)
		throws Exception;

	@Consumes({"application/json"})
	@Path("/content-space/{parent-id}/keywords/batch-create")
	@POST
	@Produces({"application/json"})
	@RequiresScope("headless-foundation-application.write")
	public Keyword postContentSpaceKeywordsBatchCreate(
			@PathParam("parent-id") Long parentId)
		throws Exception;

	@Consumes({"application/json"})
	@Path("/keywords/{id}")
	@Produces({"application/json"})
	@PUT
	@RequiresScope("headless-foundation-application.read")
	public Keyword putKeyword(@PathParam("id") Long id) throws Exception;

}