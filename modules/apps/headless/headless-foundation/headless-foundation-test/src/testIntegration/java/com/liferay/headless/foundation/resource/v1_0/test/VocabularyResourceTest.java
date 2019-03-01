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

package com.liferay.headless.foundation.resource.v1_0.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.headless.foundation.dto.v1_0.Vocabulary;
import com.liferay.portal.kernel.test.util.RandomTestUtil;

import java.util.Objects;

import org.junit.Assert;
import org.junit.runner.RunWith;

/**
 * @author Javier Gamarra
 */
@RunWith(Arquillian.class)
public class VocabularyResourceTest extends BaseVocabularyResourceTestCase {

	protected void assertValid(Vocabulary vocabulary) {
		boolean valid = false;

		if (Objects.equals(
				vocabulary.getContentSpace(), testGroup.getGroupId()) &&
			(vocabulary.getDateCreated() != null) &&
			(vocabulary.getDateModified() != null) &&
			(vocabulary.getId() != null)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	@Override
	protected boolean equals(Vocabulary vocabulary1, Vocabulary vocabulary2) {
		if (Objects.equals(
				vocabulary1.getDescription(), vocabulary2.getDescription()) &&
			Objects.equals(vocabulary1.getName(), vocabulary2.getName())) {

			return true;
		}

		return false;
	}

	@Override
	protected Vocabulary randomVocabulary() {
		return new Vocabulary() {
			{
				contentSpace = testGroup.getGroupId();
				description = RandomTestUtil.randomString();
				name = RandomTestUtil.randomString();
			}
		};
	}

	@Override
	protected Vocabulary testDeleteVocabulary_addVocabulary() throws Exception {
		return invokePostContentSpaceVocabulary(
			testGroup.getGroupId(), randomVocabulary());
	}

	@Override
	protected Vocabulary testGetContentSpaceVocabulariesPage_addVocabulary(
			Long contentSpaceId, Vocabulary vocabulary)
		throws Exception {

		return invokePostContentSpaceVocabulary(contentSpaceId, vocabulary);
	}

	@Override
	protected Vocabulary testGetVocabulary_addVocabulary() throws Exception {
		return invokePostContentSpaceVocabulary(
			testGroup.getGroupId(), randomVocabulary());
	}

	@Override
	protected Vocabulary testPostContentSpaceVocabulary_addVocabulary(
			Vocabulary vocabulary)
		throws Exception {

		return invokePostContentSpaceVocabulary(
			testGroup.getGroupId(), vocabulary);
	}

	@Override
	protected Vocabulary testPutVocabulary_addVocabulary() throws Exception {
		return invokePostContentSpaceVocabulary(
			testGroup.getGroupId(), randomVocabulary());
	}

}