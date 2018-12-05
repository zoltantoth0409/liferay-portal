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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CTECollectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CTECollectionLocalService
 * @generated
 */
@ProviderType
public class CTECollectionLocalServiceWrapper
	implements CTECollectionLocalService,
		ServiceWrapper<CTECollectionLocalService> {
	public CTECollectionLocalServiceWrapper(
		CTECollectionLocalService cteCollectionLocalService) {
		_cteCollectionLocalService = cteCollectionLocalService;
	}

	/**
	* Adds the cte collection to the database. Also notifies the appropriate model listeners.
	*
	* @param cteCollection the cte collection
	* @return the cte collection that was added
	*/
	@Override
	public com.liferay.change.tracking.engine.model.CTECollection addCTECollection(
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		return _cteCollectionLocalService.addCTECollection(cteCollection);
	}

	@Override
	public void addCTEEntryCTECollection(long cteEntryId,
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		_cteCollectionLocalService.addCTEEntryCTECollection(cteEntryId,
			cteCollection);
	}

	@Override
	public void addCTEEntryCTECollection(long cteEntryId, long cteCollectionId) {
		_cteCollectionLocalService.addCTEEntryCTECollection(cteEntryId,
			cteCollectionId);
	}

	@Override
	public void addCTEEntryCTECollections(long cteEntryId,
		java.util.List<com.liferay.change.tracking.engine.model.CTECollection> cteCollections) {
		_cteCollectionLocalService.addCTEEntryCTECollections(cteEntryId,
			cteCollections);
	}

	@Override
	public void addCTEEntryCTECollections(long cteEntryId,
		long[] cteCollectionIds) {
		_cteCollectionLocalService.addCTEEntryCTECollections(cteEntryId,
			cteCollectionIds);
	}

	@Override
	public void clearCTEEntryCTECollections(long cteEntryId) {
		_cteCollectionLocalService.clearCTEEntryCTECollections(cteEntryId);
	}

	/**
	* Creates a new cte collection with the primary key. Does not add the cte collection to the database.
	*
	* @param cteCollectionId the primary key for the new cte collection
	* @return the new cte collection
	*/
	@Override
	public com.liferay.change.tracking.engine.model.CTECollection createCTECollection(
		long cteCollectionId) {
		return _cteCollectionLocalService.createCTECollection(cteCollectionId);
	}

	/**
	* Deletes the cte collection from the database. Also notifies the appropriate model listeners.
	*
	* @param cteCollection the cte collection
	* @return the cte collection that was removed
	*/
	@Override
	public com.liferay.change.tracking.engine.model.CTECollection deleteCTECollection(
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		return _cteCollectionLocalService.deleteCTECollection(cteCollection);
	}

	/**
	* Deletes the cte collection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cteCollectionId the primary key of the cte collection
	* @return the cte collection that was removed
	* @throws PortalException if a cte collection with the primary key could not be found
	*/
	@Override
	public com.liferay.change.tracking.engine.model.CTECollection deleteCTECollection(
		long cteCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cteCollectionLocalService.deleteCTECollection(cteCollectionId);
	}

	@Override
	public void deleteCTEEntryCTECollection(long cteEntryId,
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		_cteCollectionLocalService.deleteCTEEntryCTECollection(cteEntryId,
			cteCollection);
	}

	@Override
	public void deleteCTEEntryCTECollection(long cteEntryId,
		long cteCollectionId) {
		_cteCollectionLocalService.deleteCTEEntryCTECollection(cteEntryId,
			cteCollectionId);
	}

	@Override
	public void deleteCTEEntryCTECollections(long cteEntryId,
		java.util.List<com.liferay.change.tracking.engine.model.CTECollection> cteCollections) {
		_cteCollectionLocalService.deleteCTEEntryCTECollections(cteEntryId,
			cteCollections);
	}

	@Override
	public void deleteCTEEntryCTECollections(long cteEntryId,
		long[] cteCollectionIds) {
		_cteCollectionLocalService.deleteCTEEntryCTECollections(cteEntryId,
			cteCollectionIds);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cteCollectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cteCollectionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _cteCollectionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _cteCollectionLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _cteCollectionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _cteCollectionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _cteCollectionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.change.tracking.engine.model.CTECollection fetchCTECollection(
		long cteCollectionId) {
		return _cteCollectionLocalService.fetchCTECollection(cteCollectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cteCollectionLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the cte collection with the primary key.
	*
	* @param cteCollectionId the primary key of the cte collection
	* @return the cte collection
	* @throws PortalException if a cte collection with the primary key could not be found
	*/
	@Override
	public com.liferay.change.tracking.engine.model.CTECollection getCTECollection(
		long cteCollectionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cteCollectionLocalService.getCTECollection(cteCollectionId);
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
	@Override
	public java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTECollections(
		int start, int end) {
		return _cteCollectionLocalService.getCTECollections(start, end);
	}

	/**
	* Returns the number of cte collections.
	*
	* @return the number of cte collections
	*/
	@Override
	public int getCTECollectionsCount() {
		return _cteCollectionLocalService.getCTECollectionsCount();
	}

	@Override
	public java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTEEntryCTECollections(
		long cteEntryId) {
		return _cteCollectionLocalService.getCTEEntryCTECollections(cteEntryId);
	}

	@Override
	public java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTEEntryCTECollections(
		long cteEntryId, int start, int end) {
		return _cteCollectionLocalService.getCTEEntryCTECollections(cteEntryId,
			start, end);
	}

	@Override
	public java.util.List<com.liferay.change.tracking.engine.model.CTECollection> getCTEEntryCTECollections(
		long cteEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.change.tracking.engine.model.CTECollection> orderByComparator) {
		return _cteCollectionLocalService.getCTEEntryCTECollections(cteEntryId,
			start, end, orderByComparator);
	}

	@Override
	public int getCTEEntryCTECollectionsCount(long cteEntryId) {
		return _cteCollectionLocalService.getCTEEntryCTECollectionsCount(cteEntryId);
	}

	/**
	* Returns the cteEntryIds of the cte entries associated with the cte collection.
	*
	* @param cteCollectionId the cteCollectionId of the cte collection
	* @return long[] the cteEntryIds of cte entries associated with the cte collection
	*/
	@Override
	public long[] getCTEEntryPrimaryKeys(long cteCollectionId) {
		return _cteCollectionLocalService.getCTEEntryPrimaryKeys(cteCollectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cteCollectionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _cteCollectionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cteCollectionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public boolean hasCTEEntryCTECollection(long cteEntryId,
		long cteCollectionId) {
		return _cteCollectionLocalService.hasCTEEntryCTECollection(cteEntryId,
			cteCollectionId);
	}

	@Override
	public boolean hasCTEEntryCTECollections(long cteEntryId) {
		return _cteCollectionLocalService.hasCTEEntryCTECollections(cteEntryId);
	}

	@Override
	public void setCTEEntryCTECollections(long cteEntryId,
		long[] cteCollectionIds) {
		_cteCollectionLocalService.setCTEEntryCTECollections(cteEntryId,
			cteCollectionIds);
	}

	/**
	* Updates the cte collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cteCollection the cte collection
	* @return the cte collection that was updated
	*/
	@Override
	public com.liferay.change.tracking.engine.model.CTECollection updateCTECollection(
		com.liferay.change.tracking.engine.model.CTECollection cteCollection) {
		return _cteCollectionLocalService.updateCTECollection(cteCollection);
	}

	@Override
	public CTECollectionLocalService getWrappedService() {
		return _cteCollectionLocalService;
	}

	@Override
	public void setWrappedService(
		CTECollectionLocalService cteCollectionLocalService) {
		_cteCollectionLocalService = cteCollectionLocalService;
	}

	private CTECollectionLocalService _cteCollectionLocalService;
}