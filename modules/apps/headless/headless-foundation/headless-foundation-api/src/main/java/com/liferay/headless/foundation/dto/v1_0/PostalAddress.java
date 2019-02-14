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

package com.liferay.headless.foundation.dto.v1_0;

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "PostalAddress")
public class PostalAddress {

	public String getAddressCountry() {
		return _addressCountry;
	}

	public String getAddressLocality() {
		return _addressLocality;
	}

	public String getAddressRegion() {
		return _addressRegion;
	}

	public String getAddressType() {
		return _addressType;
	}

	public Long getId() {
		return _id;
	}

	public String getPostalCode() {
		return _postalCode;
	}

	public String getStreetAddressLine1() {
		return _streetAddressLine1;
	}

	public String getStreetAddressLine2() {
		return _streetAddressLine2;
	}

	public String getStreetAddressLine3() {
		return _streetAddressLine3;
	}

	public void setAddressCountry(String addressCountry) {
		_addressCountry = addressCountry;
	}

	public void setAddressCountry(Supplier<String> addressCountrySupplier) {
		_addressCountry = addressCountrySupplier.get();
	}

	public void setAddressLocality(String addressLocality) {
		_addressLocality = addressLocality;
	}

	public void setAddressLocality(Supplier<String> addressLocalitySupplier) {
		_addressLocality = addressLocalitySupplier.get();
	}

	public void setAddressRegion(String addressRegion) {
		_addressRegion = addressRegion;
	}

	public void setAddressRegion(Supplier<String> addressRegionSupplier) {
		_addressRegion = addressRegionSupplier.get();
	}

	public void setAddressType(String addressType) {
		_addressType = addressType;
	}

	public void setAddressType(Supplier<String> addressTypeSupplier) {
		_addressType = addressTypeSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setPostalCode(String postalCode) {
		_postalCode = postalCode;
	}

	public void setPostalCode(Supplier<String> postalCodeSupplier) {
		_postalCode = postalCodeSupplier.get();
	}

	public void setStreetAddressLine1(String streetAddressLine1) {
		_streetAddressLine1 = streetAddressLine1;
	}

	public void setStreetAddressLine1(
		Supplier<String> streetAddressLine1Supplier) {

		_streetAddressLine1 = streetAddressLine1Supplier.get();
	}

	public void setStreetAddressLine2(String streetAddressLine2) {
		_streetAddressLine2 = streetAddressLine2;
	}

	public void setStreetAddressLine2(
		Supplier<String> streetAddressLine2Supplier) {

		_streetAddressLine2 = streetAddressLine2Supplier.get();
	}

	public void setStreetAddressLine3(String streetAddressLine3) {
		_streetAddressLine3 = streetAddressLine3;
	}

	public void setStreetAddressLine3(
		Supplier<String> streetAddressLine3Supplier) {

		_streetAddressLine3 = streetAddressLine3Supplier.get();
	}

	private String _addressCountry;
	private String _addressLocality;
	private String _addressRegion;
	private String _addressType;
	private Long _id;
	private String _postalCode;
	private String _streetAddressLine1;
	private String _streetAddressLine2;
	private String _streetAddressLine3;

}