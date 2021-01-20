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
 * The goal of this class is to test InsertFileTemplateMapper
 */
@SuppressWarnings("nls")
@PluginResource("resources/InsertFileTemplate/InsertFileTemplate.pdst")
public class InsertFileTemplateMapperTest extends AbstractTemplateToStructureTests {

	public static final String EXPECTED_RESOURCE_PATH = PLUGIN_EXPECTED_RESOURCE_PATH + "InsertFileTemplate/expectedOutput/";

	/**
	 * Test the default InsertFileTemplate
	 */
	@Test
	public void defaultInsertFileTemplateMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("default");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "default.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/default.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default InsertFileTemplate with a custom title
	 */
	@Test
	public void customTitleInsertFileTemplateMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("customTitle");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "customTitle.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/customTitle.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default InsertFileTemplate with the generate property set to false
	 */
	@Test
	public void doNotGenerateInsertFileTemplateMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("doNotGenerate");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "doNotGenerate.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/doNotGenerate.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default InsertFileTemplate with the generateTitle property set to false
	 */
	@Test
	public void doNotGenerateTitleInsertFileTemplateMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("doNotGenerateTitle");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "doNotGenerateTitle.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/doNotGenerateTitle.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default InsertFileTemplate with empty result (the file does not exist)
	 */
	@Test
	public void emptyInsertFileTemplateMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("empty");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "empty.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/empty.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default InsertFileTemplate with the generateIfEmpty property set to true
	 */
	@Test
	public void generateIfEmptyInsertFileTemplateMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("generateIfEmpty");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "generateIfEmpty.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/generateIfEmpty.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default InsertFileTemplate with a False Expression
	 */
	@Test
	public void withExpressionInsertFileTemplateMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("withExpression");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "withExpression.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/withExpression.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

}
