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

import org.eclipse.papyrus.junit.utils.rules.PluginResource;
import org.eclipse.papyrus.model2doc.integration.odt.uml.architecture.internal.utils.ODT_Document_Constants;
import org.junit.Test;

/**
 *
 */
@SuppressWarnings("nls")
@PluginResource("resources/creationModel_001.di")
public class CreateEmptyDocumentTemplateTest extends AbstractDocumentTemplateCreationTest {

	@Test
	public void textGenericDocumentTemplateCreation() throws Exception {
		checkDocumentCreation(ODT_Document_Constants.ODT_EMPTY_UML_DOCUMENT_TEMPLATE_TYPE);
	}
}
