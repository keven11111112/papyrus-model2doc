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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.junit.utils.rules.ModelSetFixture;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateConstants;
import org.eclipse.papyrus.model2doc.emf.template2structure.command.Template2StructureCommandFactory;
import org.junit.Assert;
import org.junit.Rule;



/**
 * Abstract Class used to test the transformation from Template to Structure model
 */
@SuppressWarnings("nls")
public abstract class AbstractTemplateToStructureTests {

	public static final String PLUGIN_EXPECTED_RESOURCE_PATH = Activator.PLUGIN_ID + "/resources/";

	/**
	 * The editor fixture
	 */
	@Rule
	public ModelSetFixture fixture = new ModelSetFixture();

	/**
	 * Constructor.
	 *
	 */
	public AbstractTemplateToStructureTests() {
		super();
	}

	/**
	 *
	 * @return
	 *         the *.pdst resource associated to the current model
	 */
	protected final Resource getPDSTResourceForCurrentModel() {
		for (final Resource current : this.fixture.getResourceSet().getResources()) {
			if (DocumentStructureTemplateConstants.DOCUMENT_STRUCTURE_TEMPLATE_FILE_EXTENSION.equals(current.getURI().fileExtension())) {
				if (this.fixture.getModelResourceURI().trimFileExtension().equals(current.getURI().trimFileExtension())) {
					return current;
				}
			}
		}
		return null;
	}

	/**
	 *
	 * @param name
	 *            the name of the {@link TextDocumentTemplate}
	 * @return
	 */
	protected final TextDocumentTemplate getTextDocumentTemplate(String name) {
		// 1. check if the pdst resource exists in the ModelSet
		final Resource pdstResource = getPDSTResourceForCurrentModel();
		Assert.assertNotNull("The pdst resource is not in the ModelSet.", pdstResource);

		// 2. get TextDocumentTemplate
		Assert.assertNotEquals("The pdst should have at least one element", 0, pdstResource.getContents().size());

		Iterator<EObject> iter = pdstResource.getContents().iterator();
		while (iter.hasNext()) {
			EObject eObject = iter.next();
			if (eObject instanceof TextDocumentTemplate) {
				TextDocumentTemplate textDocumentTemplate = (TextDocumentTemplate) eObject;
				if (textDocumentTemplate.getName().equals(name)) {
					return textDocumentTemplate;
				}
			}
		}
		Assert.fail("The pdst does not contain " + name);
		return null;
	}

	/**
	 *
	 * @param textDocumentTemplate
	 *            a text {@link TextDocumentTemplate}
	 * @return
	 *         the result of the generation (transformation for template to structure)
	 */
	protected final Collection<?> generateDocumentStructure(TextDocumentTemplate textDocumentTemplate) {
		TransactionalEditingDomain domain = this.fixture.getEditingDomain();
		Command command = Template2StructureCommandFactory.eINSTANCE.getGenerateDocumentStructureCommand(domain, textDocumentTemplate, null);
		domain.getCommandStack().execute(command);

		return command.getResult();
	}

	/**
	 * Get the expected TextDocument from the resource
	 */
	protected final TextDocument loadExpectedDocumentStructureResource(String filePath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createPlatformPluginURI(filePath, false), true);

		Assert.assertNotNull(resource);
		Assert.assertEquals("The pds should have one element", 1, resource.getContents().size());
		Assert.assertTrue("The root element is not a TextDocumentTemplate", resource.getContents().get(0) instanceof TextDocument);

		return (TextDocument) resource.getContents().get(0);
	}


	/**
	 * This is a method which can be used for debug (in jenkins) to display the generated pds
	 *
	 * @param pathInProject
	 *            the path in the project (ex: output/customColumnTitle.pds)
	 */
	protected String debugDisplay(String pathInProject) {
		StringBuilder builder = new StringBuilder();

		String wsPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String projectName = fixture.getProject().getProject().getName();

		StringBuilder pathBuilder = new StringBuilder(wsPath);
		pathBuilder.append(File.separatorChar);
		pathBuilder.append(projectName);
		pathBuilder.append(File.separatorChar);
		pathBuilder.append(pathInProject);

		try {
			final BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(pathBuilder.toString())));
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append("\n");
			}
			reader.close();
		} catch (final Exception e) {
			e.printStackTrace();
		}

		builder.append("-----------------------------------------------------------------------------\n");

		return builder.toString();
	}
}