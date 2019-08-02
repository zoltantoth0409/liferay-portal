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

package com.liferay.calendar.service.permission;

import com.liferay.calendar.constants.CalendarPortletKeys;
import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.service.CalendarBookingLocalServiceUtil;
import com.liferay.exportimport.kernel.staging.permission.StagingPermissionUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

/**
 * @author Jonathan McCann
 */
public class CalendarBookingPermission {

	public static void check(
			PermissionChecker permissionChecker,
			CalendarBooking calendarBooking, String actionId)
		throws PortalException {

		if (!contains(permissionChecker, calendarBooking, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
			PermissionChecker permissionChecker, long calendarBookingId,
			String actionId)
		throws PortalException {

		if (!contains(permissionChecker, calendarBookingId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(
		PermissionChecker permissionChecker, CalendarBooking calendarBooking,
		String actionId) {

		Boolean hasPermission = StagingPermissionUtil.hasPermission(
			permissionChecker, calendarBooking.getGroupId(),
			CalendarBooking.class.getName(),
			calendarBooking.getCalendarBookingId(),
			CalendarPortletKeys.CALENDAR, actionId);

		if (hasPermission != null) {
			return hasPermission.booleanValue();
		}

		if (permissionChecker.hasOwnerPermission(
				calendarBooking.getCompanyId(), CalendarBooking.class.getName(),
				calendarBooking.getCalendarBookingId(),
				calendarBooking.getUserId(), actionId)) {

			return true;
		}

		return permissionChecker.hasPermission(
			calendarBooking.getGroupId(), CalendarBooking.class.getName(),
			calendarBooking.getCalendarBookingId(), actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, long calendarBookingId,
			String actionId)
		throws PortalException {

		CalendarBooking calendarBooking =
			CalendarBookingLocalServiceUtil.getCalendarBooking(
				calendarBookingId);

		return contains(permissionChecker, calendarBooking, actionId);
	}

}