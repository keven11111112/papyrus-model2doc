/*****************************************************************************
 * Copyright (c) 2019, 2020 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Bug 569246, 569460
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.representation.PapyrusRepresentationKind;
import org.eclipse.papyrus.infra.core.utils.EditorNameInitializer;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.integration.architecture.internal.messages.Messages;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.command.ICreateDocumentTemplateEditorCommand;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype;

/**
 * This class allows to create new DocumentTemplate instance and open the papyrus editor for it
 */
public class CreatePapyrusDocumentTemplateEditorCommand extends AbstractCreateDocumentTemplateEditorCommand implements ICreateDocumentTemplateEditorCommand {

	/**
	 * Prompts the user the future document's name
	 *
	 * @return The name, or <code>null</code> if the user cancelled the creation
	 */
	private String askName(final ViewPrototype prototype, final EObject semanticContext) {
		final String defaultName = getDefaultName(prototype, semanticContext);
		return askDocumentName(Messages.CreatePapyrusDocumentTemplateEditorCommand_CreateDocumentTemplateDialogTitle, defaultName);
	}

	/**
	 *
	 * @param prototype
	 *            the ViewPrototype
	 * @param semanticContext
	 *            the semantic context for the created DocumentTemplate
	 * @return
	 *         the default name to use
	 */
	private String getDefaultName(final ViewPrototype prototype, final EObject semanticContext) {
		final StringBuilder nameBuilder = new StringBuilder("New"); //$NON-NLS-1$
		nameBuilder.append(prototype.getLabel().replaceAll(" ", "")); //$NON-NLS-1$ //$NON-NLS-2$
		final String nameWithIncrement = EditorNameInitializer.getNameWithIncrement(DocumentStructureTemplatePackage.eINSTANCE.getTextDocumentTemplate(), DocumentStructureTemplatePackage.eINSTANCE.getDocumentTemplate_Name(), nameBuilder.toString(),
				semanticContext);
		return nameWithIncrement;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.command.ICreateDocumentTemplateEditorCommand#execute(org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype,
	 *      org.eclipse.emf.ecore.EObject, java.lang.String)
	 *
	 * @param prototype
	 * @param name
	 * @param semanticContext
	 * @param openAfterCreation
	 * @return
	 */
	@Override
	public DocumentTemplate execute(final ViewPrototype prototype, final String name, final EObject semanticContext, final boolean openAfterCreation) {
		return execute(prototype, name, semanticContext, semanticContext, openAfterCreation);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.command.ICreateDocumentTemplateEditorCommand#execute(org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototype, java.lang.String,
	 *      org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, boolean)
	 *
	 * @param prototype
	 * @param name
	 * @param semanticContext
	 * @param graphicalContext
	 * @param openAfterCreation
	 * @return
	 */
	@Override
	public DocumentTemplate execute(final ViewPrototype prototype, final String name, final EObject semanticContext, final EObject graphicalContext, boolean openAfterCreation) {
		if (prototype instanceof PapyrusDocumentTemplateViewPrototype) {
			final PapyrusRepresentationKind representation = prototype.getRepresentationKind();
			Assert.isTrue(representation instanceof PapyrusDocumentPrototype, "The representation associated to the PapyrusDocumentTemplateViewPrototype must be an instanceof PapyrusDocumentPrototype."); //$NON-NLS-1$
			PapyrusDocumentPrototype docProto = (PapyrusDocumentPrototype) representation;
			final DocumentTemplatePrototype docTemplateProto = docProto.getDocumentTemplatePrototype();
			final String documentName = (name == null || name.isEmpty()) ? askName(prototype, semanticContext) : name;
			if (null == documentName) {
				return null; // the creation is cancelled
			}

			return super.execute(docTemplateProto, documentName, graphicalContext, semanticContext, openAfterCreation);
		}
		return null;
	};

}
