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
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.modelexplorer.internal.commands;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.ui.menu.NameNormalizationCommand;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;

/**
 * This class provides document template name normalization command.
 *
 */
public class DocumentTemplateNameNormalizationCommand extends NameNormalizationCommand {

	/**
	 * Constructor.
	 *
	 * @param domain
	 *            the editing domain
	 * @param documentTemplate
	 *            the edited document template
	 * @param normalization
	 *            the parameter defining the kind of normalization
	 */
	public DocumentTemplateNameNormalizationCommand(final TransactionalEditingDomain domain, final EObject documentTemplate, final String normalization) {
		super(domain, documentTemplate, normalization);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doExecute() {
		if (this.source instanceof DocumentTemplate) {
			final DocumentTemplate doc = (DocumentTemplate) this.source;
			final String newName = normalizeName(doc.getName(), parameter);
			doc.setName(newName);
		}
	}

}
