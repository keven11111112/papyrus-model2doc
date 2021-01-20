/*****************************************************************************
 * Copyright (c) 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.tests;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.junit.Assert;
import org.junit.Test;

/**
 * The goal of this class is to test TableOfContentsMapper
 */
@SuppressWarnings("nls")
@PluginResource("resources/TableOfContents/TableOfContents.pdst")
public class TableOfContentsMapperTest extends AbstractTemplateToStructureTests {

	public static final String EXPECTED_RESOURCE_PATH = PLUGIN_EXPECTED_RESOURCE_PATH + "TableOfContents/expectedOutput/";

	/**
	 * Test the default TableOfContents
	 */
	@Test
	public void defaultTableOfContentsMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("default");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "default.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/default.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

}
