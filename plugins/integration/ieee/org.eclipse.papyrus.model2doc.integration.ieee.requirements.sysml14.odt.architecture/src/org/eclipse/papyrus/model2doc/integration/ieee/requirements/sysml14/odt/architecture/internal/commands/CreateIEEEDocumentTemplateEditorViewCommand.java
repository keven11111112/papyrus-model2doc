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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture.commands.CreateDocumentTemplateEditorViewCommand;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.commands.ApplyIEEERequirementsDocumentationProfileCommand;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.Activator;
import org.eclipse.uml2.uml.Package;

/**
 * This class creates the DocumentStructureTemplate for IEEE and apply the IEEERequirements profile if required
 */
public class CreateIEEEDocumentTemplateEditorViewCommand extends CreateDocumentTemplateEditorViewCommand {

	/**
	 * Constructor.
	 *
	 * @param domain
	 * @param documentTemplatePrototype
	 * @param documentName
	 * @param documentMainTitle
	 * @param semanticContext
	 * @param openAfterCreation
	 */
	public CreateIEEEDocumentTemplateEditorViewCommand(TransactionalEditingDomain domain, DocumentTemplatePrototype documentTemplatePrototype, String documentName, String documentMainTitle, EObject semanticContext, boolean openAfterCreation) {
		super(domain, documentTemplatePrototype, documentName, documentMainTitle, semanticContext, openAfterCreation);
	}

	/**
	 * Constructor.
	 *
	 * @param domain
	 * @param documentTemplatePrototype
	 * @param documentName
	 * @param documentMainTitle
	 * @param semanticContext
	 * @param graphicalContext
	 * @param openAfterCreation
	 */
	public CreateIEEEDocumentTemplateEditorViewCommand(TransactionalEditingDomain domain, DocumentTemplatePrototype documentTemplatePrototype, String documentName, String documentMainTitle, EObject semanticContext, EObject graphicalContext,
			boolean openAfterCreation) {
		super(domain, documentTemplatePrototype, documentName, documentMainTitle, semanticContext, graphicalContext, openAfterCreation);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.architecture.commands.CreateDocumentTemplateEditorViewCommand#doExecute()
	 *
	 */
	@Override
	protected void doExecute() {
		super.doExecute();
		final Package rootPackage = getRootPackage();
		if (rootPackage != null) {
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(rootPackage);
			try {
				new ApplyIEEERequirementsDocumentationProfileCommand(domain, rootPackage).execute(new NullProgressMonitor(), null);
			} catch (ExecutionException e) {
				Activator.log.error(e);
			}
		}
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		return super.canExecute() && canApplyIEEERequirementsProfile();
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if we can apply the required profile
	 */
	private boolean canApplyIEEERequirementsProfile() {
		final Package rootPackage = getRootPackage();
		if (rootPackage != null) {
			final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(rootPackage);
			if (domain != null) {
				return new ApplyIEEERequirementsDocumentationProfileCommand(domain, rootPackage).canExecute();
			}
		}
		return false;
	}

	/**
	 *
	 * @return
	 *         the rootPackage of the model or <code>null</code>
	 */
	private Package getRootPackage() {
		EObject owner = this.semanticContext;
		while (owner.eContainer() != null) {
			owner = owner.eContainer();
		}
		return owner instanceof Package ? (Package) owner : null;
	}
}
