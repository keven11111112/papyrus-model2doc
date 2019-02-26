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
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.action;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.ui.menu.AbstractEMFParametricOnSelectedElementsAction;
import org.eclipse.papyrus.infra.ui.menu.NameNormalizationCommand;

import org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.command.DocumentNameNormalizationCommand;

/**
 * This class provides document quick format action.
 *
 */
public class DocumentQuickFormatAction extends AbstractEMFParametricOnSelectedElementsAction {
	
	/**
	 * Constructor.
	 *
	 * @param parameter
	 * @param selectedEditPart
	 */
	public DocumentQuickFormatAction(String parameter, List<EObject> selectedEditPart) {
		super(parameter, selectedEditPart);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Command getBuildedCommand() {
		CompoundCommand cc = new CompoundCommand(NameNormalizationCommand.NAME_ACTION);
		for(EObject igEP : getSelection()){
			final TransactionalEditingDomain domain = getEditingDomain();
			DocumentNameNormalizationCommand myCmd = new DocumentNameNormalizationCommand(domain, igEP, parameter);
			cc.append(myCmd);
		}
		
		if (!cc.isEmpty() && cc.canExecute()) {
			return cc;
		}
		return UnexecutableCommand.INSTANCE;
	}
}
