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

package com.liferay.portal.remote.cors.internal.url.pattern.matcher;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arthur Chan
 */
public class SimpleURLPatternMatcher<T> implements URLPatternMatcher<T> {

	@Override
	public T getValue(String urlPath) {
		T value = _exactURLPatternValues.get(urlPath);

		if (value != null) {
			return value;
		}

		int lastDotIndex = 0;

		for (int i = urlPath.length(); i > 0; --i) {
			value = _wildcardURLPatternValues.get(urlPath.substring(0, i) + "*");

			if (value != null) {
				return value;
			}

			if ((lastDotIndex < 1) && (urlPath.charAt(i - 1) == '.')) {
				lastDotIndex = i - 1;
			}
		}

		return _extensionURLPatternValues.get(
			"*" + urlPath.substring(lastDotIndex));
	}

	@Override
	public void putValue(String urlPattern, T value)
		throws IllegalArgumentException {

		if (_isWildcardURLPattern(urlPattern)) {
			if (!_wildcardURLPatternValues.containsKey(urlPattern)) {
				_wildcardURLPatternValues.put(urlPattern, value);
			}

			return;
		}

		if (_isExtensionURLPattern(urlPattern)) {
			if (!_extensionURLPatternValues.containsKey(urlPattern)) {
				_extensionURLPatternValues.put(urlPattern, value);
			}

			return;
		}

		if (!_exactURLPatternValues.containsKey(urlPattern)) {
			_exactURLPatternValues.put(urlPattern, value);
		}
	}

	/**
	 *  https://download.oracle.com/otndocs/jcp/servlet-4-final-eval-spec/index.html#12.1.3
	 *  https://download.oracle.com/otndocs/jcp/servlet-4-final-eval-spec/index.html#12.2
	 *
	 * @param urlPattern the given urlPattern
	 * @return a boolean value indicating if the urlPattern an extensionURLPattern
	 */
	private boolean _isExtensionURLPattern(String urlPattern) {
		if ((urlPattern.length() < 3) || (urlPattern.charAt(0) != '*') ||
			(urlPattern.charAt(1) != '.')) {

			return false;
		}

		for (int i = 2; i < urlPattern.length(); ++i) {
			if (urlPattern.charAt(i) == '/') {
				return false;
			}

			if (urlPattern.charAt(i) == '.') {
				return false;
			}
		}

		return true;
	}

	/**
	 *  https://tools.ietf.org/html/rfc3986#section-3.3
	 *  https://download.oracle.com/otndocs/jcp/servlet-4-final-eval-spec/index.html#12.2
	 *
	 * @param urlPattern the given urlPattern
	 * @return a boolean value indicating if the urlPattern a wildCardURLPattern
	 */
	private boolean _isWildcardURLPattern(String urlPattern) {
		if ((urlPattern.length() < 2) || (urlPattern.charAt(0) != '/') ||
			(urlPattern.charAt(urlPattern.length() - 1) != '*') ||
			(urlPattern.charAt(urlPattern.length() - 2) != '/')) {

			return false;
		}

		try {
			String urlPath = urlPattern.substring(0, urlPattern.length() - 1);

			URI uri = new URI("https://test" + urlPath);

			if (!urlPath.contentEquals(uri.getPath())) {
				return false;
			}
		}
		catch (URISyntaxException uriSyntaxException) {
			return false;
		}

		return true;
	}

	private final Map<String, T> _exactURLPatternValues = new HashMap<>();
	private final Map<String, T> _extensionURLPatternValues = new HashMap<>();
	private final Map<String, T> _wildcardURLPatternValues = new HashMap<>();

}