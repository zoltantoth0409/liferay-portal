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

package com.liferay.arquillian.extension.junit.bridge.remote.manager;

import com.liferay.arquillian.extension.junit.bridge.event.Event;
import com.liferay.arquillian.extension.junit.bridge.listener.ClientExecutorEventListener;
import com.liferay.arquillian.extension.junit.bridge.listener.EventListener;
import com.liferay.arquillian.extension.junit.bridge.listener.ServerExecutorEventListener;

import java.net.URL;

/**
 * @author Matthew Tambara
 */
public class Manager {

	public static boolean isRemote() {
		return _remote;
	}

	public Manager() {
		if (_remote) {
			_eventListener = new ServerExecutorEventListener(_registry);
		}
		else {
			_eventListener = new ClientExecutorEventListener(_registry);
		}
	}

	public void fire(Event event) throws Throwable {
		_eventListener.handleEvent(event);
	}

	public Registry getRegistry() {
		return _registry;
	}

	private static final boolean _remote;

	static {
		URL url = Manager.class.getResource("/arquillian.remote.marker");

		if (url == null) {
			_remote = false;
		}
		else {
			_remote = true;
		}
	}

	private final EventListener _eventListener;
	private final Registry _registry = new Registry();

}