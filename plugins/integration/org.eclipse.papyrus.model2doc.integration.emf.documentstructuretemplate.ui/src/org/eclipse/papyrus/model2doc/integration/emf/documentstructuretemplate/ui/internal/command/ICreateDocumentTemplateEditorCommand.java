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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.viewpoint.PapyrusDocumentTemplateViewPrototype;



//TODO : move ?
//TODO : add validation rule in the metamodel ?
//TODO : I must not be internal...
/**
 *
 * This interface must be implemented by the creation command registered in the architecture framework, to be able to create new DocumentTemplate
 *
 */
public interface ICreateDocumentTemplateEditorCommand {

	/**
	 *
	 * @param prototype
	 *            a view prototype
	 * @param semanticContext
	 *            the semantic context
	 * @param name
	 *            the name of the new DocumentTemplate to create
	 * @return
	 * 		<code>true</code> if the creation worked fined
	 */
	public boolean execute(final PapyrusDocumentTemplateViewPrototype prototype, final EObject semanticContext, final String name);

}
