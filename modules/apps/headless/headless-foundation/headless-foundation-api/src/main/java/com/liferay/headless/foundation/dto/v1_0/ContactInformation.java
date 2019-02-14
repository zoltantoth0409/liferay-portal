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
@XmlRootElement(name = "ContactInformation")
public class ContactInformation {

	public PostalAddress[] getAddress() {
		return _address;
	}

	public Long[] getAddressIds() {
		return _addressIds;
	}

	public Email[] getEmail() {
		return _email;
	}

	public Long[] getEmailIds() {
		return _emailIds;
	}

	public String getFacebook() {
		return _facebook;
	}

	public Long getId() {
		return _id;
	}

	public String getJabber() {
		return _jabber;
	}

	public String getSkype() {
		return _skype;
	}

	public String getSms() {
		return _sms;
	}

	public Phone[] getTelephone() {
		return _telephone;
	}

	public Long[] getTelephoneIds() {
		return _telephoneIds;
	}

	public String getTwitter() {
		return _twitter;
	}

	public WebUrl[] getWebUrl() {
		return _webUrl;
	}

	public Long[] getWebUrlIds() {
		return _webUrlIds;
	}

	public void setAddress(PostalAddress[] address) {
		_address = address;
	}

	public void setAddress(Supplier<PostalAddress[]> addressSupplier) {
		_address = addressSupplier.get();
	}

	public void setAddressIds(Long[] addressIds) {
		_addressIds = addressIds;
	}

	public void setAddressIds(Supplier<Long[]> addressIdsSupplier) {
		_addressIds = addressIdsSupplier.get();
	}

	public void setEmail(Email[] email) {
		_email = email;
	}

	public void setEmail(Supplier<Email[]> emailSupplier) {
		_email = emailSupplier.get();
	}

	public void setEmailIds(Long[] emailIds) {
		_emailIds = emailIds;
	}

	public void setEmailIds(Supplier<Long[]> emailIdsSupplier) {
		_emailIds = emailIdsSupplier.get();
	}

	public void setFacebook(String facebook) {
		_facebook = facebook;
	}

	public void setFacebook(Supplier<String> facebookSupplier) {
		_facebook = facebookSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setJabber(String jabber) {
		_jabber = jabber;
	}

	public void setJabber(Supplier<String> jabberSupplier) {
		_jabber = jabberSupplier.get();
	}

	public void setSkype(String skype) {
		_skype = skype;
	}

	public void setSkype(Supplier<String> skypeSupplier) {
		_skype = skypeSupplier.get();
	}

	public void setSms(String sms) {
		_sms = sms;
	}

	public void setSms(Supplier<String> smsSupplier) {
		_sms = smsSupplier.get();
	}

	public void setTelephone(Phone[] telephone) {
		_telephone = telephone;
	}

	public void setTelephone(Supplier<Phone[]> telephoneSupplier) {
		_telephone = telephoneSupplier.get();
	}

	public void setTelephoneIds(Long[] telephoneIds) {
		_telephoneIds = telephoneIds;
	}

	public void setTelephoneIds(Supplier<Long[]> telephoneIdsSupplier) {
		_telephoneIds = telephoneIdsSupplier.get();
	}

	public void setTwitter(String twitter) {
		_twitter = twitter;
	}

	public void setTwitter(Supplier<String> twitterSupplier) {
		_twitter = twitterSupplier.get();
	}

	public void setWebUrl(Supplier<WebUrl[]> webUrlSupplier) {
		_webUrl = webUrlSupplier.get();
	}

	public void setWebUrl(WebUrl[] webUrl) {
		_webUrl = webUrl;
	}

	public void setWebUrlIds(Long[] webUrlIds) {
		_webUrlIds = webUrlIds;
	}

	public void setWebUrlIds(Supplier<Long[]> webUrlIdsSupplier) {
		_webUrlIds = webUrlIdsSupplier.get();
	}

	private PostalAddress[] _address;
	private Long[] _addressIds;
	private Email[] _email;
	private Long[] _emailIds;
	private String _facebook;
	private Long _id;
	private String _jabber;
	private String _skype;
	private String _sms;
	private Phone[] _telephone;
	private Long[] _telephoneIds;
	private String _twitter;
	private WebUrl[] _webUrl;
	private Long[] _webUrlIds;

}