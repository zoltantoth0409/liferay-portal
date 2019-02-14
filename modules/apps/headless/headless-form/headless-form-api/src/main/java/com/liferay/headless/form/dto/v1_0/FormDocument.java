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

package com.liferay.headless.form.dto.v1_0;

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "FormDocument")
public class FormDocument {

	public String getContentUrl() {
		return _contentUrl;
	}

	public String getEncodingFormat() {
		return _encodingFormat;
	}

	public String getFileExtension() {
		return _fileExtension;
	}

	public Long getId() {
		return _id;
	}

	public Number getSizeInBytes() {
		return _sizeInBytes;
	}

	public String getTitle() {
		return _title;
	}

	public void setContentUrl(String contentUrl) {
		_contentUrl = contentUrl;
	}

	public void setContentUrl(Supplier<String> contentUrlSupplier) {
		_contentUrl = contentUrlSupplier.get();
	}

	public void setEncodingFormat(String encodingFormat) {
		_encodingFormat = encodingFormat;
	}

	public void setEncodingFormat(Supplier<String> encodingFormatSupplier) {
		_encodingFormat = encodingFormatSupplier.get();
	}

	public void setFileExtension(String fileExtension) {
		_fileExtension = fileExtension;
	}

	public void setFileExtension(Supplier<String> fileExtensionSupplier) {
		_fileExtension = fileExtensionSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setSizeInBytes(Number sizeInBytes) {
		_sizeInBytes = sizeInBytes;
	}

	public void setSizeInBytes(Supplier<Number> sizeInBytesSupplier) {
		_sizeInBytes = sizeInBytesSupplier.get();
	}

	public void setTitle(String title) {
		_title = title;
	}

	public void setTitle(Supplier<String> titleSupplier) {
		_title = titleSupplier.get();
	}

	private String _contentUrl;
	private String _encodingFormat;
	private String _fileExtension;
	private Long _id;
	private Number _sizeInBytes;
	private String _title;

}