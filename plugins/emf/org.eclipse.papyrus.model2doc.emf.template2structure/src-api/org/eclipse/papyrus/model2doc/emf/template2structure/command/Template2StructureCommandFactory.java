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
	 * The singleton instance.
	 */
	public static Template2StructureCommandFactory eINSTANCE = getInstance();

	/**
	 * Get the instance.
	 *
	 * @return The instance.
	 */
	private static Template2StructureCommandFactory getInstance() {
		if (null == eINSTANCE) {
			eINSTANCE = new Template2StructureCommandFactory();
		}
		return eINSTANCE;
	}

	/**
	 * Private constructor to avoid external initialization.
	 */
	private Template2StructureCommandFactory() {
		// Do nothing
	}

	/**
	 *
	 * @param domain
	 *            the editing domain
	 * @param docTemplate
	 *            the DocumentTemplate
	 * @param version
	 *            the version of the document structure to generate
	 * @return
	 *         the command to create a {@link Document} from a {@link DocumentTemplate}
	 */
	public final Command getGenerateDocumentStructureCommand(final TransactionalEditingDomain domain, final DocumentTemplate docTemplate, final String version) {
		return new GenerateDocumentStructureCommand(domain, docTemplate, version);
	}
}