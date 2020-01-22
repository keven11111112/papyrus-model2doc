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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.tests.basis;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.resource.DocumentStructureTemplateResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateConstants;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test we get the expected resource for the element, in order to be sure to get the good save options
 */
@SuppressWarnings("nls")
public class DocumentStructureTemplateResourceTest {


	/**
	 * Check we get the expected resource to get the expected save option
	 */
	@Test
	public void checkResource() {
		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createFileURI("dummyFile").appendFileExtension(DocumentStructureTemplateConstants.DOCUMENT_STRUCTURE_TEMPLATE_FILE_EXTENSION);
		final Resource res = set.createResource(uri);
		Assert.assertTrue("The resource is not the good one", res instanceof DocumentStructureTemplateResource);
	}
}
