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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.emf.structure2document.internal.handler;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.command.CreateDocumentCommand;
import org.eclipse.papyrus.model2doc.odt.emf.structure2document.Activator;

/**
 *
 */
// TODO : rename me
public class CreateODTFileFromTextDocumentTemplateHelper extends CreateODTFileFromTextDocumentHelper {

	private TextDocumentTemplate textDocumentTemplate;

	public CreateODTFileFromTextDocumentTemplateHelper(final TextDocumentTemplate textDocumentTemplate) {
		this.textDocumentTemplate = textDocumentTemplate;
	}


	@Override
	public void generate() {
		// 1. create the TextDocument from the TextDocumentTemplate
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this.textDocumentTemplate);
		final Command cmd = new CreateDocumentCommand(this.textDocumentTemplate, domain);
		if (false == cmd.canExecute()) {
			Activator.log.warn(NLS.bind("The command {0} is not executable.", cmd.getClass().getName()));
		}
		domain.getCommandStack().execute(cmd);
		setTextDocument((TextDocument) cmd.getResult().iterator().next());
		super.generate();
	}
}
