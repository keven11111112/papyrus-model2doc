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
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.command;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.ui.menu.NameNormalizationCommand;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * This class provides document name normalization command.
 *
 */
public class DocumentNameNormalizationCommand extends NameNormalizationCommand {

	/**
	 * Constructor.
	 *
	 * @param domain
	 * @param source
	 * @param normalization
	 */
	public DocumentNameNormalizationCommand(TransactionalEditingDomain domain, EObject source, String normalization) {
		super(domain, source, normalization);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doExecute() {
		if(source instanceof Document){
			String name = ((Document)source).getName();
			String newName = normalizeName(name,parameter);
			((Document)source).setName(newName);
		}
	}

}
