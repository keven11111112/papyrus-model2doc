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

package org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.internal.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.internal.commands.CreateIEEERequirementsStructureForSysML14Command;
import org.eclipse.uml2.uml.Package;

/**
 * Handler creating the expected model structure
 */
public class CreateIEEERequirementsStructureHandler extends AbstractHandler {

	/**
	 * the command creating the structure
	 */
	private CreateIEEERequirementsStructureForSysML14Command cmd;

	/**
	 * the editing domain
	 */
	private TransactionalEditingDomain domain;

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 *
	 * @param event
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (cmd != null && domain != null) {
			domain.getCommandStack().execute(new GMFtoEMFCommandWrapper(cmd));
		}

		return null;
	}


	/**
	 * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
	 *
	 * @param evaluationContext
	 */
	@Override
	public void setEnabled(Object evaluationContext) {
		boolean enabled = false;
		this.cmd = null;
		this.domain = null;
		if (evaluationContext instanceof IEvaluationContext) {
			final IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
			final Object tmp = iEvaluationContext.getVariable("selection"); //$NON-NLS-1$
			if (tmp instanceof IStructuredSelection) {
				final Object selectedElement = ((IStructuredSelection) tmp).getFirstElement();
				final EObject eobject = EMFHelper.getEObject(selectedElement);
				if (eobject instanceof Package) {
					this.domain = TransactionUtil.getEditingDomain(eobject);
					this.cmd = new CreateIEEERequirementsStructureForSysML14Command(domain, (Package) eobject);
					enabled = this.cmd.canExecute();
				}

			}
		}
		setBaseEnabled(enabled);
	}


}
