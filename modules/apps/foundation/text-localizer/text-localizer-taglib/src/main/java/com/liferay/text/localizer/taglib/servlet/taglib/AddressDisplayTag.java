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

package com.liferay.text.localizer.taglib.servlet.taglib;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Address;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.util.ParamAndPropertyAncestorTagImpl;
import com.liferay.text.localizer.taglib.internal.address.util.AddressUtil;

import java.io.IOException;

import java.util.Optional;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTag;

/**
 * @author Pei-Jung Lan
 */
public class AddressDisplayTag extends ParamAndPropertyAncestorTagImpl {

	@Override
	public int doEndTag() throws JspException {
		JspWriter writer = pageContext.getOut();

		try {
			writer.write(
				StringUtil.replace(
					_getFormattedAddress(), CharPool.NEW_LINE, "<br />"));
		}
		catch (IOException ioe) {
			throw new JspException(ioe);
		}

		return BodyTag.EVAL_BODY_BUFFERED;
	}

	public void setAddress(Address address) {
		_address = address;
	}

	private String _getFormattedAddress() {
		StringBundler sb = new StringBundler(13);

		Address escapedAddress = _address.toEscapedModel();

		String street1 = escapedAddress.getStreet1();

		if (Validator.isNotNull(street1)) {
			sb.append(street1);
		}

		String street2 = escapedAddress.getStreet2();

		if (Validator.isNotNull(street2)) {
			sb.append(StringPool.NEW_LINE);
			sb.append(street2);
		}

		String street3 = escapedAddress.getStreet3();

		if (Validator.isNotNull(street3)) {
			sb.append(StringPool.NEW_LINE);
			sb.append(street3);
		}

		String city = escapedAddress.getCity();

		boolean hasCity = Validator.isNotNull(city);

		Optional<String> regionNameOptional = AddressUtil.getRegionNameOptional(
			_address);

		boolean hasRegionName = regionNameOptional.isPresent();

		String zip = escapedAddress.getZip();

		boolean hasZip = Validator.isNotNull(zip);

		if (hasCity || hasRegionName || hasZip) {
			sb.append(StringPool.NEW_LINE);
		}

		if (hasCity) {
			sb.append(city);

			if (hasRegionName || hasZip) {
				sb.append(StringPool.COMMA_AND_SPACE);
			}
		}

		regionNameOptional.ifPresent(
			regionName -> sb.append(HtmlUtil.escape(regionName)));

		if (hasZip) {
			if (hasRegionName) {
				sb.append(StringPool.SPACE);
			}

			sb.append(zip);
		}

		Optional<String> countryNameOptional =
			AddressUtil.getCountryNameOptional(_address);

		countryNameOptional.ifPresent(
			countryName -> {
				sb.append(StringPool.NEW_LINE);
				sb.append(HtmlUtil.escape(countryName));
			});

		String s = sb.toString();

		return s.trim();
	}

	private Address _address;

}