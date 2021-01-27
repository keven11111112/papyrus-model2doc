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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.internal.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture.CreatePapyrusDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture.commands.CreateDocumentTemplateEditorViewCommand;

/**
 * Create the TemplateEditor and apply the IEEE Requirements profile if required
 */
public class CreateIEEEDocumentTemplateEditorCommand extends CreatePapyrusDocumentTemplateEditorCommand {

	/**
	 *
	 * @param editingDomain
	 *            the editing domain to use for the command
	 * @param documentPrototype
	 *            * the document template prototype used to create the {@link DocumentTemplate}
	 * @param documentName
	 *            the name of the created document
	 * @param documentMainTitle
	 *            the main title of the document
	 * @param semanticContext
	 *            the semantic context used for the creation of the {@link DocumentTemplate}
	 * @param graphicalContext
	 *            the graphical context used for the creation of the {@link DocumentTemplate}
	 * @param openAfterCreation
	 *            if <code>true</code> the editor will be opened after the creation
	 * @return
	 *         the created {@link DocumentTemplate}
	 */
	@Override
	public CreateDocumentTemplateEditorViewCommand createDocumentTemplateEditorCreationCommand(final TransactionalEditingDomain editingDomain,
			final DocumentTemplatePrototype documentPrototype,
			final String documentName,
			final String documentMainTitle,
			final EObject semanticContext,
			final EObject graphicalContext,
			final boolean openAfterCreation) {
		return new CreateIEEEDocumentTemplateEditorViewCommand(editingDomain, documentPrototype, documentName, documentMainTitle, semanticContext, graphicalContext, openAfterCreation);
	}

	/**
	 *
	 * @param editingDomain
	 *            the editing domain to use for the command
	 * @param documentPrototype
	 *            * the document template prototype used to create the {@link DocumentTemplate}
	 * @param documentName
	 *            the name of the created document
	 * @param documentMainTitle
	 *            the main title of the document
	 * @param semanticContext
	 *            the semantic context used for the creation of the {@link DocumentTemplate}
	 * @param openAfterCreation
	 *            if <code>true</code> the editor will be opened after the creation
	 * @return
	 *         the created {@link DocumentTemplate}
	 */
	@Override
	public CreateDocumentTemplateEditorViewCommand createDocumentTemplateEditorCreationCommand(final TransactionalEditingDomain editingDomain,
			final DocumentTemplatePrototype documentPrototype,
			final String documentName,
			final String documentMainTitle,
			final EObject semanticContext,
			final boolean openAfterCreation) {
		return new CreateIEEEDocumentTemplateEditorViewCommand(editingDomain, documentPrototype, documentName, documentMainTitle, semanticContext, openAfterCreation);
	}

}
