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
package org.eclipse.papyrus.model2doc.core.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.ui.util.SelectionHelper;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceService;
import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceServiceImpl;

/**
 * Abstract handler class for generating document file from UML model.
 */
public abstract class UML2DocHandler extends AbstractHandler implements Model2DocHandler {
	
	private WorkspaceResourceService workspaceResourceService = new WorkspaceResourceServiceImpl();
	
	/**
	 * Get Selected element in the diagram or in the model explorer.
	 *
	 * @return selected element or null
	 */
	protected Element getSelection() {

		ISelection selection = SelectionHelper.getCurrentSelection();

		if (selection instanceof IStructuredSelection) {
			Object selectedobject = ((IStructuredSelection) selection).getFirstElement();

			EObject selectedElement = EMFHelper.getEObject(selectedobject);
			if (selectedElement instanceof Element) {
				return (Element) selectedElement;
			}
		}
		return null;
	}

	@Override
	public void setEnabled(Object evaluationContext) {
		super.setBaseEnabled(getSelection() instanceof Package);
	}
	
	@Override
	public WorkspaceResourceService getWorkspaceResourceService() {
		return workspaceResourceService;
	}
	
}
