/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) <vincent.lorenzo@cea.fr> - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.author.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.papyrus.model2doc.core.author.Author;
import org.eclipse.papyrus.model2doc.core.author.AuthorFactory;
import org.eclipse.papyrus.model2doc.core.author.IAuthor;
import org.junit.Assert;
import org.junit.Test;

public class AuthorTest {

	private static final String HOMER = "Homer"; //$NON-NLS-1$

	private static final String BART = "Bart"; //$NON-NLS-1$

	private static final String SIMPSON = "Simpson"; //$NON-NLS-1$

	private static final String NED = "Ned"; //$NON-NLS-1$

	private static final String FLANDERS = "Flanders"; //$NON-NLS-1$

	@Test
	public void singleAuthorLabelTest_1() {
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		author.setLastName(SIMPSON);
		final String label = author.buildAuthorLabel();
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + " " + SIMPSON, label); //$NON-NLS-1$
	}

	@Test
	public void singleAuthorLabelTest_2() {
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setLastName(SIMPSON);
		final String label = author.buildAuthorLabel();
		Assert.assertNotNull(label);
		Assert.assertEquals(SIMPSON, label);
	}

	@Test
	public void singleAuthorLabelTest_3() {
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		final String label = author.buildAuthorLabel();
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER, label);
	}

	@Test
	public void singleAuthorLabelTest_4() {
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		final String label = author.buildAuthorLabel();
		Assert.assertNotNull(label);
		Assert.assertEquals("", label); //$NON-NLS-1$
	}

	@Test
	public void multiAuthorLabelTest_1() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		author.setLastName(SIMPSON);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		author2.setFirstName(BART);
		author2.setLastName(SIMPSON);
		authors.add(author2);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + " " + SIMPSON + "; " + BART + " " + SIMPSON, label); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Test
	public void multiAuthorLabelTest_2() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		author2.setFirstName(BART);
		author2.setLastName(SIMPSON);
		authors.add(author2);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(BART + " " + SIMPSON, label); //$NON-NLS-1$
	}

	@Test
	public void multiAuthorLabelTest_3() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		author.setLastName(SIMPSON);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		authors.add(author2);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + " " + SIMPSON, label); //$NON-NLS-1$
	}

	@Test
	public void multiAuthorLabelTest_4() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		author2.setFirstName(BART);
		authors.add(author2);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + "; " + BART, label); //$NON-NLS-1$
	}

	@Test
	public void multiAuthorLabelTest_5() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setLastName(SIMPSON);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		author2.setLastName(SIMPSON);
		authors.add(author2);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(SIMPSON + "; " + SIMPSON, label); //$NON-NLS-1$
	}

	@Test
	public void multiAuthorLabelTest_6() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		author2.setLastName(SIMPSON);
		authors.add(author2);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + "; " + SIMPSON, label); //$NON-NLS-1$
	}

	@Test
	public void multiAuthorLabelTest_7() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setLastName(SIMPSON);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		author2.setFirstName(BART);
		authors.add(author2);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(SIMPSON + "; " + BART, label); //$NON-NLS-1$
	}

	@Test
	public void multiAuthorLabelTest_8() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		author.setLastName(SIMPSON);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		author2.setFirstName(NED);
		author2.setLastName(FLANDERS);
		authors.add(author2);
		final Author author3 = AuthorFactory.eINSTANCE.createAuthor();
		author3.setFirstName(BART);
		author3.setLastName(SIMPSON);
		authors.add(author3);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + " " + SIMPSON + "; " + NED + " " + FLANDERS + "; " + BART + " " + SIMPSON, label); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
	}

	@Test
	public void multiAuthorLabelTest_9() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		author.setLastName(SIMPSON);
		authors.add(author);
		final Author author2 = AuthorFactory.eINSTANCE.createAuthor();
		authors.add(author2);
		final Author author3 = AuthorFactory.eINSTANCE.createAuthor();
		author3.setFirstName(NED);
		author3.setLastName(FLANDERS);
		authors.add(author3);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + " " + SIMPSON + "; " + NED + " " + FLANDERS, label); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Test
	public void multiAuthorLabelTest_10() {
		List<IAuthor> authors = new ArrayList<>();
		final Author author = AuthorFactory.eINSTANCE.createAuthor();
		author.setFirstName(HOMER);
		author.setLastName(SIMPSON);
		authors.add(author);
		final Author author2 = null;
		authors.add(author2);
		final Author author3 = AuthorFactory.eINSTANCE.createAuthor();
		author3.setFirstName(NED);
		author3.setLastName(FLANDERS);
		authors.add(author3);
		final String label = author.buildMultiAuthorLabel(ECollections.asEList(authors));
		Assert.assertNotNull(label);
		Assert.assertEquals(HOMER + " " + SIMPSON + "; " + NED + " " + FLANDERS, label); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
}
