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


package org.eclipse.papyrus.model2doc.dev.tools.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.model2doc.dev.tools.Activator;
import org.eclipse.papyrus.model2doc.dev.tools.dialog.NewDocumentPrototypeDialog;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateConstants;
import org.eclipse.swt.widgets.Display;

/**
 * This tool allows to create a new {@link DocumentTemplatePrototype} from a selected {@link DocumentTemplate}
 */
public class CreatePrototypeFromTemplateHandler extends AbstractHandler {

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final DocumentTemplate documentTemplate = getSelectedDocumentTemplate();
		if (null != documentTemplate) {
			final DocumentTemplate copy = EcoreUtil.copy(documentTemplate);
			copy.setKindId(""); //$NON-NLS-1$
			copy.setSemanticContext(null);
			copy.setGraphicalContext(null);


			final DocumentTemplatePrototype prototype = DocumentStructureTemplateFactory.eINSTANCE.createDocumentTemplatePrototype();
			prototype.setDescription(""); //$NON-NLS-1$
			prototype.setIconPath(documentTemplate.getIconPath());
			prototype.setType(""); //$NON-NLS-1$
			// prototype.setDescription(copy.getDescription());
			prototype.setDocumentTemplate(copy);
			copy.setDocumentTemplatePrototype(prototype);

			final NewDocumentPrototypeDialog d = new NewDocumentPrototypeDialog(Display.getDefault().getActiveShell(), prototype);

			if (d.open() == Dialog.OK) {

				final URI initialURI = documentTemplate.eResource().getURI();
				// we remove the file extension
				URI newURI = initialURI.trimFileExtension();

				// we remove the file name
				newURI = newURI.trimSegments(1);

				newURI = newURI.appendSegment(d.getFileName()).appendFileExtension(DocumentStructureTemplateConstants.DOCUMENT_STRUCTURE_TEMPLATE_FILE_EXTENSION);

				ResourceSetImpl newSet = new ResourceSetImpl();
				final Resource res = newSet.createResource(newURI);
				res.getContents().add(prototype);
				try {
					res.save(null);
				} catch (IOException e) {
					Activator.log.error(e);
				}
			}

		}
		return null;
	}

	/**
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		super.setBaseEnabled(getSelectedDocumentTemplate() != null);
	}

	/**
	 *
	 * @return
	 *         the selected {@link DocumentTemplate} or <code>null</code> if not found
	 */
	private static final DocumentTemplate getSelectedDocumentTemplate() {
		final IStructuredSelection selection = SelectionUtils.getCurrentStructuredSelection();
		if (selection.size() == 1) {
			final Object selectedElement = selection.getFirstElement();
			if (selectedElement instanceof DocumentTemplate) {
				return (DocumentTemplate) selectedElement;
			}

		}
		return null;
	}

}
