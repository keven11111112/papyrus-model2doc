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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalCommandStackImpl;

/**
 * This class does the same stuff that its parent, but with a {@link TransactionalEditingDomain} (so and with a {@link TransactionalCommandStackImpl}
 */
public class TransactionalDocumentStructureTemplateEditor extends CustomDocumentStructureTemplateEditor {


	/**
	 * Constructor.
	 *
	 */
	public TransactionalDocumentStructureTemplateEditor() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.CustomDocumentStructureTemplateEditor#initializeEditingDomain()
	 *
	 */
	@Override
	protected void initializeEditingDomain() {
		super.initializeEditingDomain();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.CustomDocumentStructureTemplateEditor#initEditingDomain(org.eclipse.emf.common.command.BasicCommandStack)
	 *
	 * @param commandStack
	 */
	@Override
	protected void initDomainAndStack() {
		this.editingDomain = (AdapterFactoryEditingDomain) TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
		addCommandStackListener(this.editingDomain.getCommandStack());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.presentation.DocumentStructureTemplateEditor#getEditingDomain()
	 *
	 * @return
	 */
	@Override
	public TransactionalEditingDomain getEditingDomain() {
		if (this.editingDomain instanceof TransactionalEditingDomain) {
			return (TransactionalEditingDomain) this.editingDomain;
		}
		return null;
	}
}
