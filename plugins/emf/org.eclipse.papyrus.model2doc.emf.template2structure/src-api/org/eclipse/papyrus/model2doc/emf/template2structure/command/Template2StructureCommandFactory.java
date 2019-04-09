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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.internal.command.GenerateDocumentStructureCommand;

/**
 * This class provides the command used to create the documentstructure
 */
public class Template2StructureCommandFactory {

	/**
	 *
	 * @param domain
	 *            the editing domain
	 * @param docTemplate
	 *            the DocumentTemplate
	 * @return
	 * 		the command to create a {@link Document} from a {@link DocumentTemplate}
	 */
	public static final Command getGenerateDocumentStructureCommand(final TransactionalEditingDomain domain, final DocumentTemplate docTemplate) {
		return new GenerateDocumentStructureCommand(domain, docTemplate);
	}
}