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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.tests.basis;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("nls")
public class DocumentStructureTemplateFactoryBasisTest {

	/**
	 * we check we found a factory
	 */
	public void checkFactory() {
		DocumentStructureTemplateFactory.eINSTANCE.getClass();
	}


	/**
	 * we check methods are implemented for {@link EClassPartTemplate}, we expect default behavior
	 */
	@Test
	public void checkEClassPartTemplate() {
		final EClassPartTemplate template = DocumentStructureTemplateFactory.eINSTANCE.createEClassPartTemplate();
		Assert.assertEquals("No EClass", template.buildPartTemplateTitle(null));
		Assert.assertEquals(true, template.isMatchingFilterRule(EcoreFactory.eINSTANCE.createEObject()));
		Assert.assertEquals(false, template.isMatchingFilterRule(null));
	}

	/**
	 * we check methods are implemented for {@link EReferencePartTemplate}, we expect default behavior
	 */
	@Test
	public void checkEReferencePartTemplate() {
		final EReferencePartTemplate template = DocumentStructureTemplateFactory.eINSTANCE.createEReferencePartTemplate();
		Assert.assertEquals("No EReference", template.buildPartTemplateTitle(null));
		template.getEReferenceValues(EcoreFactory.eINSTANCE.createEObject());
		Assert.assertEquals(true, template.getEReferenceValues(null).isEmpty());
	}

	/**
	 * we check methods are implemented for {@link TextDocumentTemplate}, we expect default behavior
	 */
	public void checkTextDocumentTemplate() {
		final TextDocumentTemplate template = DocumentStructureTemplateFactory.eINSTANCE.createTextDocumentTemplate();
		Assert.assertNull(template.getType());
		Assert.assertNull(template.getIconPath());
	}


}
