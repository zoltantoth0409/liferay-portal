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

package com.liferay.portal.vulcan.util;

import com.liferay.petra.function.UnsafeFunction;

import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class TransformUtil {

	public static <T, R> List<R> transform(
		List<T> list, UnsafeFunction<T, R, Exception> unsafeFunction) {

		List<R> newList = new ArrayList<>(list.size());

		for (T item : list) {
			try {
				R newItem = unsafeFunction.apply(item);

				if (newItem != null) {
					newList.add(newItem);
				}
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		return newList;
	}

	public static <T, R> R[] transform(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction,
		Class<?> clazz) {

		List<R> list = transformToList(array, unsafeFunction);

		return list.toArray((R[])Array.newInstance(clazz, list.size()));
	}

	public static <T, R> R[] transformToArray(
		List<T> list, UnsafeFunction<T, R, Exception> unsafeFunction,
		Class<?> clazz) {

		List<R> newList = transform(list, unsafeFunction);

		return newList.toArray((R[])Array.newInstance(clazz, newList.size()));
	}

	public static <T, R> List<R> transformToList(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction) {

		List<R> list = new ArrayList<>(array.length);

		for (T item : array) {
			try {
				R newItem = unsafeFunction.apply(item);

				if (newItem != null) {
					list.add(newItem);
				}
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		return list;
	}

}