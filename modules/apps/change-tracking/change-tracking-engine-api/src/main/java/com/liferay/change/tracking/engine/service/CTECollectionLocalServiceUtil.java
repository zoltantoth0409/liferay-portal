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

package com.liferay.change.tracking.engine.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CTECollection. This utility wraps
 * {@link com.liferay.change.tracking.engine.service.impl.CTECollectionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CTECollectionLocalService
 * @see com.liferay.change.tracking.engine.service.base.CTECollectionLocalServiceBaseImpl
 * @see com.liferay.change.tracking.engine.service.impl.CTECollectionLocalServiceImpl
 * @generated
 */
@ProviderType
public class CTECollectionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.change.tracking.engine.service.impl.CTECollectionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the cte collection to the database. Also notifies the appropriate model listeners.
	*
	* @param cteCollection the cte collection
	* @return the cte collection that was added
	*/
	public static com.liferay.change.tracking.engine.model.CTECollection addCTECollection(
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		return getService().addCTECollection(cteCollection);
	}

	public static void addCTEEntryCTECollection(long cteEntryId,
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		getService().addCTEEntryCTECollection(cteEntryId, cteCollection);
	}

	public static void addCTEEntryCTECollection(long cteEntryId,
		long cteCollectionId) {
		getService().addCTEEntryCTECollection(cteEntryId, cteCollectionId);
	}

	public static void addCTEEntryCTECollections(long cteEntryId,
		java.util.List<com.liferay.change.tracking.engine.model.CTECollection> cteCollections) {
		getService().addCTEEntryCTECollections(cteEntryId, cteCollections);
	}

	public static void addCTEEntryCTECollections(long cteEntryId,
		long[] cteCollectionIds) {
		getService().addCTEEntryCTECollections(cteEntryId, cteCollectionIds);
	}

	public static void clearCTEEntryCTECollections(long cteEntryId) {
		getService().clearCTEEntryCTECollections(cteEntryId);
	}

	/**
	* Creates a new cte collection with the primary key. Does not add the cte collection to the database.
	*
	* @param cteCollectionId the primary key for the new cte collection
	* @return the new cte collection
	*/
	public static com.liferay.change.tracking.engine.model.CTECollection createCTECollection(
		long cteCollectionId) {
		return getService().createCTECollection(cteCollectionId);
	}

	/**
	* Deletes the cte collection from the database. Also notifies the appropriate model listeners.
	*
	* @param cteCollection the cte collection
	* @return the cte collection that was removed
	*/
	public static com.liferay.change.tracking.engine.model.CTECollection deleteCTECollection(
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		return getService().deleteCTECollection(cteCollection);
	}

	/**
	* Deletes the cte collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cteCollectionId the primary key of the cte collection
	* @return the cte collection that was removed
	* @throws PortalException if a cte collection with the primary key could not be found
	*/
	public static com.liferay.change.tracking.engine.model.CTECollection deleteCTECollection(
		long cteCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCTECollection(cteCollectionId);
	}

	public static void deleteCTEEntryCTECollection(long cteEntryId,
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		getService().deleteCTEEntryCTECollection(cteEntryId, cteCollection);
	}

	public static void deleteCTEEntryCTECollection(long cteEntryId,
		long cteCollectionId) {
		getService().deleteCTEEntryCTECollection(cteEntryId, cteCollectionId);
	}

	public static void deleteCTEEntryCTECollections(long cteEntryId,
		java.util.List<com.liferay.change.tracking.engine.model.CTECollection> cteCollections) {
		getService().deleteCTEEntryCTECollections(cteEntryId, cteCollections);
	}

	public static void deleteCTEEntryCTECollections(long cteEntryId,
		long[] cteCollectionIds) {
		getService().deleteCTEEntryCTECollections(cteEntryId, cteCollectionIds);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.change.tracking.engine.model.impl.CTECollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.change.tracking.engine.model.impl.CTECollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.change.tracking.engine.model.CTECollection fetchCTECollection(
		long cteCollectionId) {
		return getService().fetchCTECollection(cteCollectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the cte collection with the primary key.
	*
	* @param cteCollectionId the primary key of the cte collection
	* @return the cte collection
	* @throws PortalException if a cte collection with the primary key could not be found
	*/
	public static com.liferay.change.tracking.engine.model.CTECollection getCTECollection(
		long cteCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCTECollection(cteCollectionId);
	}

	/**
	* Returns a range of all the cte collections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.change.tracking.engine.model.impl.CTECollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cte collections
	* @param end the upper bound of the range of cte collections (not inclusive)
	* @return the range of cte collections
	*/
	public static java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTECollections(
		int start, int end) {
		return getService().getCTECollections(start, end);
	}

	/**
	* Returns the number of cte collections.
	*
	* @return the number of cte collections
	*/
	public static int getCTECollectionsCount() {
		return getService().getCTECollectionsCount();
	}

	public static java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTEEntryCTECollections(
		long cteEntryId) {
		return getService().getCTEEntryCTECollections(cteEntryId);
	}

	public static java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTEEntryCTECollections(
		long cteEntryId, int start, int end) {
		return getService().getCTEEntryCTECollections(cteEntryId, start, end);
	}

	public static java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTEEntryCTECollections(
		long cteEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.change.tracking.engine.model.CTECollection> orderByComparator) {
		return getService()
				   .getCTEEntryCTECollections(cteEntryId, start, end,
			orderByComparator);
	}

	public static int getCTEEntryCTECollectionsCount(long cteEntryId) {
		return getService().getCTEEntryCTECollectionsCount(cteEntryId);
	}

	/**
	* Returns the cteEntryIds of the cte entries associated with the cte collection.
	*
	* @param cteCollectionId the cteCollectionId of the cte collection
	* @return long[] the cteEntryIds of cte entries associated with the cte collection
	*/
	public static long[] getCTEEntryPrimaryKeys(long cteCollectionId) {
		return getService().getCTEEntryPrimaryKeys(cteCollectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static boolean hasCTEEntryCTECollection(long cteEntryId,
		long cteCollectionId) {
		return getService().hasCTEEntryCTECollection(cteEntryId, cteCollectionId);
	}

	public static boolean hasCTEEntryCTECollections(long cteEntryId) {
		return getService().hasCTEEntryCTECollections(cteEntryId);
	}

	public static void setCTEEntryCTECollections(long cteEntryId,
		long[] cteCollectionIds) {
		getService().setCTEEntryCTECollections(cteEntryId, cteCollectionIds);
	}

	/**
	* Updates the cte collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cteCollection the cte collection
	* @return the cte collection that was updated
	*/
	public static com.liferay.change.tracking.engine.model.CTECollection updateCTECollection(
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		return getService().updateCTECollection(cteCollection);
	}

	public static CTECollectionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CTECollectionLocalService, CTECollectionLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CTECollectionLocalService.class);

		ServiceTracker<CTECollectionLocalService, CTECollectionLocalService> serviceTracker =
			new ServiceTracker<CTECollectionLocalService, CTECollectionLocalService>(bundle.getBundleContext(),
				CTECollectionLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}