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
 * The goal of this class is to test EReferenceTableViewMapper
 */
@SuppressWarnings("nls")
@PluginResource("resources/EReferenceTableView/EReferenceTableView.pdst")
public class EReferenceTableViewMapperTest extends AbstractTemplateToStructureTests {

	public static final String EXPECTED_RESOURCE_PATH = PLUGIN_EXPECTED_RESOURCE_PATH + "EReferenceTableView/expectedOutput/";

	/**
	 * Test the default EReferenceTableView
	 */
	@Test
	public void defaultEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("default");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "default.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/default.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default EReferenceTableView with a custom title
	 */
	@Test
	public void customTitleEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("customTitle");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "customTitle.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/customTitle.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));

	}

	/**
	 * Test the default EReferenceTableView with the generate property set to false
	 */
	@Test
	public void doNotGenerateEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("doNotGenerate");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "doNotGenerate.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/doNotGenerate.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default EReferenceTableView with the generateRowHeader property set to false
	 */
	@Test
	public void doNotGenerateRowHeaderEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("doNotGenerateRowHeader");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "doNotGenerateRowHeader.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/doNotGenerateRowHeader.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default EReferenceTableView with the generateColumnHeader property set to false
	 */
	@Test
	public void doNotGenerateColumnHeaderEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("doNotGenerateColumnHeader");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "doNotGenerateColumnHeader.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/doNotGenerateColumnHeader.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default EReferenceTableView with the generateTitle property set to false
	 */
	@Test
	public void doNotGenerateTitleEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("doNotGenerateTitle");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);


		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "doNotGenerateTitle.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/doNotGenerateTitle.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));

	}

	/**
	 * Test the default EReferenceTableView with empty result
	 */
	@Test
	public void emptyEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("empty");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "empty.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/empty.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default EReferenceTableView with the generateIfEmpty property set to true
	 */
	@Test
	public void generateIfEmptyEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("generateIfEmpty");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "generateIfEmpty.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/generateIfEmpty.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default EReferenceTableView with a False Expression
	 */
	@Test
	public void withExpressionEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("withExpression");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "withExpression.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/withExpression.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));
	}

	/**
	 * Test the default EReferenceTableView with a custom column title for the EStructuralFeatureColumn
	 */
	@Test
	public void customColumnTitleEReferenceTableViewMapperTest() {
		TextDocumentTemplate textDocumentTemplate = getTextDocumentTemplate("customColumnTitle");
		Collection<?> commandResult = generateDocumentStructure(textDocumentTemplate);

		// Test the generated file is the same as the expected one
		EObject expectedTextDocument = loadExpectedDocumentStructureResource(EXPECTED_RESOURCE_PATH + "customColumnTitle.pds");
		Assert.assertTrue("The generated DocumentStructure does not match with the expected one, the generated file is: "
				+ debugDisplay("output/customColumnTitle.pds"),
				EcoreUtil.equals(expectedTextDocument, (EObject) commandResult.iterator().next()));

	}

}
