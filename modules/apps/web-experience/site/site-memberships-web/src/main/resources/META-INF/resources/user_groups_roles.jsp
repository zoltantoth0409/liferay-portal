<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
String displayStyle = portalPreferences.getValue(SiteMembershipsPortletKeys.SITE_MEMBERSHIPS_ADMIN, "display-style", "icon");
String eventName = ParamUtil.getString(request, "eventName", liferayPortletResponse.getNamespace() + "selectUserGroupsRoles");

PortletURL portletURL = renderResponse.createRenderURL();

portletURL.setParameter("mvcPath", "/user_groups_roles.jsp");

long userGroupId = siteMembershipsDisplayContext.getUserGroupId();

portletURL.setParameter("userGroupId", String.valueOf(userGroupId));

boolean assignRoles = ParamUtil.getBoolean(request, "assignRoles", true);

portletURL.setParameter("assignRoles", String.valueOf(assignRoles));

RoleSearch roleSearch = new RoleSearch(renderRequest, PortletURLUtil.clone(portletURL, renderResponse));

String orderByCol = ParamUtil.getString(request, "orderByCol", "title");

roleSearch.setOrderByCol(orderByCol);

String orderByType = ParamUtil.getString(renderRequest, "orderByType", "asc");

boolean orderByAsc = false;

if (Objects.equals(orderByType, "asc")) {
	orderByAsc = true;
}

OrderByComparator<Role> orderByComparator = new RoleNameComparator(orderByAsc);

roleSearch.setOrderByComparator(orderByComparator);

roleSearch.setOrderByType(orderByType);

RoleSearchTerms searchTerms = (RoleSearchTerms)roleSearch.getSearchTerms();

List<Role> roles = RoleLocalServiceUtil.search(company.getCompanyId(), searchTerms.getKeywords(), new Integer[] {RoleConstants.TYPE_SITE}, QueryUtil.ALL_POS, QueryUtil.ALL_POS, orderByComparator);

long groupId = siteMembershipsDisplayContext.getGroupId();

List<UserGroupGroupRole> userGroupGroupRoles = UserGroupGroupRoleLocalServiceUtil.getUserGroupGroupRoles(userGroupId, groupId);

Stream<UserGroupGroupRole> userGroupGroupRoleStream = userGroupGroupRoles.stream();

List<Role> selectedRoles = userGroupGroupRoleStream.map(userGroupGroupRole -> RoleLocalServiceUtil.fetchRole(userGroupGroupRole.getRoleId())).collect(Collectors.toList());

Stream<Role> roleStream = roles.stream();

roles = roleStream.filter(
	role -> {
		if ((assignRoles && !selectedRoles.contains(role)) || (!assignRoles && selectedRoles.contains(role))) {
				return true;
			}

			return false;
		}
	).collect(Collectors.toList());

roles = UsersAdminUtil.filterGroupRoles(permissionChecker, siteMembershipsDisplayContext.getGroupId(), roles);

int rolesCount = roles.size();

roleSearch.setTotal(rolesCount);

roles = ListUtil.subList(roles, roleSearch.getStart(), roleSearch.getEnd());

roleSearch.setResults(roles);
%>

<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
	<aui:nav cssClass="navbar-nav">
		<aui:nav-item label="site-roles" selected="<%= true %>" />
	</aui:nav>

	<c:if test="<%= (rolesCount > 0) || searchTerms.isSearch() %>">
		<aui:nav-bar-search>
			<aui:form action="<%= portletURL.toString() %>" name="searchFm">
				<liferay-ui:input-search
					autoFocus="<%= windowState.equals(WindowState.MAXIMIZED) %>"
					markupView="lexicon"
				/>
			</aui:form>
		</aui:nav-bar-search>
	</c:if>
</aui:nav-bar>

<liferay-frontend:management-bar
	disabled="<%= (rolesCount <= 0) && !searchTerms.isSearch() %>"
	includeCheckBox="<%= true %>"
	searchContainerId="userGroupGroupRoleRole"
>
	<liferay-frontend:management-bar-filters>
		<liferay-frontend:management-bar-navigation
			navigationKeys='<%= new String[] {"all"} %>'
			portletURL="<%= PortletURLUtil.clone(portletURL, renderResponse) %>"
		/>

		<liferay-frontend:management-bar-sort
			orderByCol="<%= roleSearch.getOrderByCol() %>"
			orderByType="<%= roleSearch.getOrderByType() %>"
			orderColumns='<%= new String[] {"title"} %>'
			portletURL="<%= PortletURLUtil.clone(portletURL, renderResponse) %>"
		/>
	</liferay-frontend:management-bar-filters>

	<liferay-frontend:management-bar-buttons>
		<liferay-portlet:actionURL name="changeDisplayStyle" varImpl="changeDisplayStyleURL">
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</liferay-portlet:actionURL>

		<liferay-frontend:management-bar-display-buttons
			displayViews='<%= new String[] {"icon", "descriptive", "list"} %>'
			portletURL="<%= changeDisplayStyleURL %>"
			selectedDisplayStyle="<%= displayStyle %>"
		/>
	</liferay-frontend:management-bar-buttons>
</liferay-frontend:management-bar>

<aui:form cssClass="container-fluid-1280 portlet-site-memberships-assign-site-roles" name="fm">
	<liferay-ui:search-container
		id="userGroupGroupRoleRole"
		rowChecker="<%= new EmptyOnClickRowChecker(renderResponse) %>"
		searchContainer="<%= roleSearch %>"
	>
		<liferay-ui:search-container-row
			className="com.liferay.portal.kernel.model.Role"
			keyProperty="roleId"
			modelVar="role"
		>
			<%@ include file="/role_columns.jspf" %>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator
			displayStyle="<%= displayStyle %>"
			markupView="lexicon"
		/>
	</liferay-ui:search-container>
</aui:form>

<aui:script use="liferay-search-container">
	var searchContainer = Liferay.SearchContainer.get('<portlet:namespace />userGroupGroupRoleRole');

	searchContainer.on(
		'rowToggled',
		function(event) {
			Liferay.Util.getOpener().Liferay.fire(
				'<%= HtmlUtil.escapeJS(eventName) %>',
				{
					data: event.elements.allSelectedElements.getDOMNodes()
				}
			);
		}
	);
</aui:script>