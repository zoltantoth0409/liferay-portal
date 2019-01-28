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

package com.liferay.rest.booster.apio.context;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author Zoltán Takács
 */
public class BaseCollection<T> {

	@XmlElement(name = "item")
	public java.util.Collection<T> getItems() {
		return _items;
	}

	@XmlElement
	public int getItemsCount() {
		return _items.size();
	}

	@XmlElement
	public int getTotalCount() {
		return _totalCount;
	}

	public void setItems(java.util.Collection<T> items) {
		_items = items;
	}

	public void setTotalCount(int totalCount) {
		_totalCount = totalCount;
	}

	private java.util.Collection<T> _items;
	private int _totalCount;

}