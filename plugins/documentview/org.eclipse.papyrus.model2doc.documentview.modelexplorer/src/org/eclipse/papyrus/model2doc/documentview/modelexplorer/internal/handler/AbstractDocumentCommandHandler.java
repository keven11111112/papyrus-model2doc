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
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.handler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.ui.command.AbstractCommandHandler;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * This abstract handler provides the method to select documents.
 *
 */
public abstract class AbstractDocumentCommandHandler extends AbstractCommandHandler {

	/**
	 * Get the list of selected documents.
	 *
	 * @return the list of selected documents
	 */
	public List<Document> getSelectedDocuments() {
		List<Document> documents = new ArrayList<>();
		ISelection selection = null;
		
		// Get current selection
		IWorkbenchWindow activeIWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeIWorkbenchWindow != null) {
			selection = activeIWorkbenchWindow.getSelectionService().getSelection();
			
			// Get first element if the selection is an IStructuredSelection
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection  = (IStructuredSelection) selection;
				Iterator<?> iterator = structuredSelection.iterator();
				
				while (iterator.hasNext()) {
					Object current = iterator.next();
					// Get the document object (Facet Element) by IAdaptable mechanism
					EObject document = EMFHelper.getEObject(current);
					if (document instanceof Document) {
						documents.add((Document) document);
					}
				}
			}
		}
		
		return documents;
	}

}
