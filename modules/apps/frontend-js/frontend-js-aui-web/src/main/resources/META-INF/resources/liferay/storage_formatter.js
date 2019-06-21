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

AUI.add(
	'liferay-storage-formatter',
	function(A) {
		var Lang = A.Lang;

		var STR_SPACE = ' ';

		var STR_SUFFIX_KB = 'suffixKB';

		var StorageFormatter = function() {};

		StorageFormatter.NAME = 'storageformatter';

		StorageFormatter.ATTRS = {
			addSpaceBeforeSuffix: {
				validator: Lang.isBoolean,
				value: false
			},

			decimalSeparator: {
				validator: Lang.isString,
				value: '.'
			},

			denominator: {
				validator: Lang.isNumber,
				value: 1024.0
			},

			suffixGB: {
				validator: Lang.isString,
				value: 'GB'
			},

			suffixKB: {
				validator: Lang.isString,
				value: 'KB'
			},

			suffixMB: {
				validator: Lang.isString,
				value: 'MB'
			}
		};

		StorageFormatter.prototype = {
			formatStorage: function(size) {
				var instance = this;

				var suffix = instance.get(STR_SUFFIX_KB);

				var denominator = instance.get('denominator');

				size /= denominator;

				if (size >= denominator) {
					suffix = instance.get('suffixMB');

					size /= denominator;
				}

				if (size >= denominator) {
					suffix = instance.get('suffixGB');

					size /= denominator;
				}

				return A.Number.format(size, {
					decimalPlaces: instance._getDecimalPlaces(size, suffix),
					decimalSeparator: instance.get('decimalSeparator'),
					suffix: instance.get('addSpaceBeforeSuffix')
						? STR_SPACE + suffix
						: suffix
				});
			},

			_getDecimalPlaces: function(size, suffix) {
				var instance = this;

				var decimalPlaces = 1;

				var suffixKB = instance.get(STR_SUFFIX_KB);

				if (suffix === suffixKB) {
					decimalPlaces = 0;
				}

				return decimalPlaces;
			}
		};

		Liferay.StorageFormatter = StorageFormatter;
	},
	'',
	{
		requires: ['aui-base', 'datatype-number-format']
	}
);
