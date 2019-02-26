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
package org.eclipse.papyrus.model2doc.odt.ui.share.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.ui.util.SelectionHelper;

import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceService;
import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceServiceImpl;
import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.odt.service.ODTEditorService;
import org.eclipse.papyrus.model2doc.odt.service.ODTEditorServiceImpl;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOService;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOServiceImpl;

/**
 * Abstract Share Document Handler class.
 * 
 */
public abstract class ShareDocumentHandler extends AbstractHandler {

	private WorkspaceResourceService workspaceResourceService = new WorkspaceResourceServiceImpl();
	
	private ODTEditorService odtEditorService = new ODTEditorServiceImpl();
	
	private ODTFileIOService odtFileIOService = new ODTFileIOServiceImpl();
	
	/**
	 * Get Selected document in the model explorer.
	 *
	 * @return selected element or null
	 */
	protected Document getSelection() {

		ISelection selection = SelectionHelper.getCurrentSelection();

		if (selection instanceof IStructuredSelection) {
			Object selectedobject = ((IStructuredSelection) selection).getFirstElement();

			EObject selectedElement = EMFHelper.getEObject(selectedobject);
			if (selectedElement instanceof Document) {
				Document document = (Document) selectedElement;
				return document;
			}
		}
		return null;
	}

	@Override
	public void setEnabled(Object evaluationContext) {
		super.setBaseEnabled(getSelection() instanceof Document);
	}

	/**
	 * Get WorkspaceResourceService.
	 * 
	 * @return
	 */
	public WorkspaceResourceService getWorkspaceResourceService() {
		return workspaceResourceService;
	}

	/**
	 * Get ODTEditorService.
	 * 
	 * @return 
	 */
	public ODTEditorService getODTEditorService() {
		return odtEditorService;
	}

	/**
	 * Get ODT File IO Service.
	 * 
	 * @return the odtFileIOService
	 */
	public ODTFileIOService getODTFileIOService() {
		return odtFileIOService;
	}

}
