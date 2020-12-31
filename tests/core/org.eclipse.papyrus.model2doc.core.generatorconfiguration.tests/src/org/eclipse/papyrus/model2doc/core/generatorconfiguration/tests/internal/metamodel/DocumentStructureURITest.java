/*****************************************************************************
 * Copyright (c) 2020 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.internal.metamodel;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.tests.Activator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class checks the creation of the DocumentStructure URI
 */
public class DocumentStructureURITest extends AbstractGeneratorConfigurationTests {

	/**
	 * the name of the project created in the workspace
	 */
	private static final String PROJECT_NAME = "org.eclipse.papyrus.model2doc.uri.tests"; //$NON-NLS-1$

	/**
	 * the name of the project in the workspace the GeneratorConfiguration file
	 */
	private static final String GENERATOR_CONFIGURATION_FOLDER_NAME = "resources"; //$NON-NLS-1$

	/**
	 * the name of the GeneratorConfiguration file
	 */
	private static final String GENERATOR_FILE_NAME = "generatorTest"; //$NON-NLS-1$


	/**
	 * the file extension of the GeneratorFile
	 */
	private static final String GENERATOR_CONFIFURATION_FILE_EXTENSION = "generatorConfiguration"; //$NON-NLS-1$

	/**
	 * the created project used to run the tests
	 */
	private IProject projectForTest;

	/**
	 * the resource set used by the tests
	 */
	private ResourceSet resourceSet;

	// TODO check calling the method to an object not yet attache to a resource

	/**
	 * init the test
	 */
	@Before
	public void setUp() {
		this.projectForTest = createProject(PROJECT_NAME);
		Assert.assertNotNull(this.projectForTest);
		resourceSet = new ResourceSetImpl();
	}

	/**
	 * clean the test environment
	 */
	@After
	public void tearDown() {
		destroyProject(this.projectForTest);
		resourceSet = null;
	}

	/**
	 * standard case
	 */
	@Test
	public void structureURITest1() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/output/NewDocument_v1.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "output"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * same as test 1, but with a / starting the path of the output folder
	 */
	@Test
	public void structureURITest2() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/output/NewDocument_v1.pds"; //$NON-NLS-1$
		final String documentStructureOutputFolder = "/output"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * same as test 1, but with a / ending the path of the output folder
	 */
	@Test
	public void structureURITest3() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/output/NewDocument_v1.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "output/"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * same as test 1, but with / starting and ending the path of the output folder
	 */
	@Test
	public void structureURITest4() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/output/NewDocument_v1.pds"; //$NON-NLS-1$
		final String documentStructureOutputFolder = "/output/"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * space in the name of the output folder
	 */
	@Test
	public void structureURITest5() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/output with spaces/NewDocument_v1.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "output with spaces"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * accentuated char in the path of output folder
	 */
	@Test
	public void structureURITest6() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/strangeoutputéâî/NewDocument_v1.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "strangeoutputéâî"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output folder is a project declared platform:/resource
	 */
	@Test
	public void structureURITest7() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests2/output/NewDocument_v1.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests2/output"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output folder is project declared as platform:/resource and ends with a /
	 */
	@Test
	public void structureURITest8() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests2/output/NewDocument_v1.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests2/output/"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output folder field is empty
	 */
	@Test
	public void structureURITest9() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument_v1.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = ""; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output folder field is null
	 */
	@Test
	public void structureURITest10() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument_v1.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = null;
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * version is empty
	 */
	@Test
	public void structureURITest11() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/output/NewDocument.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = "output"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = ""; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * version is null
	 */
	@Test
	public void structureURITest12() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/output/NewDocument.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = "output"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * version and output are empty
	 */
	@Test
	public void structureURITest13() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = ""; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = ""; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * version and output are null
	 */
	@Test
	public void structureURITest14() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = null;
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * version is null
	 * output is empty
	 */
	@Test
	public void structureURITest15() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = ""; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * version is empty
	 * output is null
	 */
	@Test
	public void structureURITest16() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument.pds"; //$NON-NLS-1$

		// same than previous, with without the last /
		final String documentStructureOutputFolder = null;
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = ""; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}


	/**
	 * document name is empty
	 */
	@Test
	public void structureURITest17() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = "output"; //$NON-NLS-1$
		final String documentName = ""; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * document name is null
	 */
	@Test
	public void structureURITest18() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = "output"; //$NON-NLS-1$
		final String documentName = null;
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * document name is null
	 * output is null
	 */
	@Test
	public void structureURITest19() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = null;
		final String documentName = null;
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * document name is null
	 * output is null
	 * version is null
	 */
	@Test
	public void structureURITest20() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = null;
		final String documentName = null;
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * document name is null
	 * output is empty
	 * version is null
	 */
	@Test
	public void structureURITest21() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = ""; //$NON-NLS-1$
		final String documentName = null;
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * document name is null
	 * output is null
	 * version is empty
	 */
	@Test
	public void structureURITest22() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = null;
		final String documentName = null;
		final String documentVersion = ""; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * document name is null
	 * output is empty
	 * version is empty
	 */
	@Test
	public void structureURITest23() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = ""; //$NON-NLS-1$
		final String documentName = null;
		final String documentVersion = ""; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output is platform:/plugin
	 */
	@Test
	public void structureURITest24() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = "platform:/plugin/org.eclipse.papyrus.model2doc.uri.tests/output"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output is windows format: C:\
	 */
	@Test
	public void structureURITest25() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = "C:\\DummyFolder"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output is windows format: C:/
	 */
	@Test
	public void structureURITest26() {
		final String expectedResult = null;

		final String documentStructureOutputFolder = "C:/DummyFolder"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = "v1"; //$NON-NLS-1$

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output is just set as /
	 */
	@Test
	public void structureURITest27() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "/"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output is just set as //
	 */
	@Test
	public void structureURITest28() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/NewDocument.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "//"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output is just set as /a
	 */
	@Test
	public void structureURITest29() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/a/NewDocument.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "/a"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}

	/**
	 * output is just set as /a/
	 */
	@Test
	public void structureURITest30() {
		final String expectedResult = "platform:/resource/org.eclipse.papyrus.model2doc.uri.tests/a/NewDocument.pds"; //$NON-NLS-1$

		final String documentStructureOutputFolder = "/a/"; //$NON-NLS-1$
		final String documentName = "NewDocument"; //$NON-NLS-1$
		final String documentVersion = null;

		checkDocumentStructureURI(expectedResult, documentName, documentStructureOutputFolder, documentVersion);
	}


	/**
	 *
	 * This method checks that we get the expected URI
	 *
	 * @param expectedResult
	 *            the expected tests result
	 * @param documentName
	 *            the name of the document to create
	 * @param documentStructureOutputFolder
	 *            the output folder where the created document structure will be stored
	 * @param documentVersion
	 *            the version of the created document structure
	 */
	private void checkDocumentStructureURI(final String expectedResult, final String documentName, final String documentStructureOutputFolder, final String documentVersion) {
		final DefaultDocumentStructureGeneratorConfiguration conf = createDocumentStructureGeneratorConfiguration();
		conf.setStructureFolder(documentStructureOutputFolder);
		conf.setDocumentName(documentName);
		org.junit.Assert.assertTrue("The save of the tested GeneratorConfiguration failed", saveConfiguration(conf)); //$NON-NLS-1$

		final URI newURi = conf.createDocumentStructureOutputAccessor().createOutputFileURI(conf.getDocumentName(), "pds", documentVersion); //$NON-NLS-1$
		Assert.assertEquals(expectedResult, newURi == null ? newURi : newURi.toString());
	}

	/**
	 * @param conf
	 *            the configuration to save in the resource set
	 * @return
	 *         <code>true</code> if the save action succeeds
	 */
	private boolean saveConfiguration(final DefaultDocumentStructureGeneratorConfiguration conf) {
		URI uri = URI.createPlatformResourceURI(PROJECT_NAME, true);
		uri = uri.appendSegment(GENERATOR_CONFIGURATION_FOLDER_NAME);
		uri = uri.appendSegment(GENERATOR_FILE_NAME);
		uri = uri.appendFileExtension(GENERATOR_CONFIFURATION_FILE_EXTENSION);

		final Resource res = this.resourceSet.createResource(uri);
		res.getContents().add(conf);
		try {
			res.save(null);
			return true;
		} catch (IOException e) {
			Activator.log.error(e);
		}
		return false;

	}

}
