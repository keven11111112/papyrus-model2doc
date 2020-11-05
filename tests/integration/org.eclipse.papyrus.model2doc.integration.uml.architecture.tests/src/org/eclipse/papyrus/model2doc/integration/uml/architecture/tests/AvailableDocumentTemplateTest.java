/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.uml.architecture.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.integration.odt.uml.architecture.internal.utils.ODT_Document_Constants;
import org.eclipse.uml2.uml.Package;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("nls")
@PluginResource("resources/creationModel_001.di")
public class AvailableDocumentTemplateTest extends AbstractDocumentTemplateCreationTest {

	/**
	 * the list of known document type
	 */
	private static final List<String> KNOWN_DOCUMENT_TEMPLATE_TYPES = new ArrayList<>();

	static {
		KNOWN_DOCUMENT_TEMPLATE_TYPES.add(ODT_Document_Constants.ODT_GENERIC_UML_DOCUMENT_TEMPLATE_TYPE);
		KNOWN_DOCUMENT_TEMPLATE_TYPES.add(ODT_Document_Constants.ODT_EMPTY_UML_DOCUMENT_TEMPLATE_TYPE);
	}



	/**
	 * This tests checks the elements available for the creation throw the Architecture Framework
	 */
	@Test
	public void checkCreatableDocumentTemplate() {
		final Package root = this.fixture.getModel();
		final Collection<DocumentTemplatePrototype> dtp = getCreatableDocumentTemplatePrototype(root);

		// 1. we check the number of know document template for a Package
		Assert.assertEquals("The number of creatable document template for a Package is not the expected one.", KNOWN_DOCUMENT_TEMPLATE_TYPES.size(), 2);

		// 2. we check the found type
		final Collection<String> typesToFound = new ArrayList<>();
		typesToFound.addAll(KNOWN_DOCUMENT_TEMPLATE_TYPES);

		final List<String> templatePrototypeToFound = new ArrayList<>();
		for (DocumentTemplatePrototype current : dtp) {
			templatePrototypeToFound.remove(current.getType());
		}
		Assert.assertEquals("Some DocumentTemplatePrototype have not be found by the ArchitectureFramework: " + templatePrototypeToFound.toString(), 0, templatePrototypeToFound.size());
	}

}
