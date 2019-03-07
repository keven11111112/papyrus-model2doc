/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.modelexplorer.internal.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.ui.command.AbstractCommandHandler;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;

/**
 * This abstract handler provides the method to select documents.
 *
 */
public abstract class AbstractDocumentTemplateCommandHandler extends AbstractCommandHandler {

	/**
	 * Get the list of selected documents.
	 *
	 * @return the list of selected documents
	 */
	public List<DocumentTemplate> getSelectedDocumentTemplates() {
		final List<DocumentTemplate> documents = new ArrayList<>();

		// Get first element if the selection is an IStructuredSelection
		final Iterator<?> iterator = getSelectedElements().iterator();

		while (iterator.hasNext()) {
			Object current = iterator.next();
			// Get the document template object (Facet Element) by IAdaptable mechanism
			EObject document = EMFHelper.getEObject(current);
			if (document instanceof DocumentTemplate) {
				documents.add((DocumentTemplate) document);
			}
		}

		return documents;
	}

}
