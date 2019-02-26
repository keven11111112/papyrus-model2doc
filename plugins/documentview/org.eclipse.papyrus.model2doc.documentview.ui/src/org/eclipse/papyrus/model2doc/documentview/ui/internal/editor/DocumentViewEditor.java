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
package org.eclipse.papyrus.model2doc.documentview.ui.internal.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.core.utils.ServiceUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.ui.Activator;

/**
 * DocumenView Editor.
 * 
 */
public class DocumentViewEditor extends EditorPart {

	/** the service registry */
	protected ServicesRegistry servicesRegistry;
	
	private Document document;
	
	public DocumentViewEditor(ServicesRegistry servicesRegistry, Document rawModel) {
		this.document = rawModel;
		this.servicesRegistry = servicesRegistry;
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	/**
	 *
	 * @see org.eclipse.emf.facet.widgets.nattable.workbench.editor.NatTableEditor#getEditingDomain()
	 *
	 * @return
	 */
	public TransactionalEditingDomain getEditingDomain() {
		try {
			return ServiceUtils.getInstance().getTransactionalEditingDomain(this.servicesRegistry);
		} catch (final ServiceException e) {
			Activator.log.error(e);
		}
		return null;
	}
	@Override
	public void doSaveAs() {
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		final DocumentViewEditorInput  documentViewEditorInput = new DocumentViewEditorInput(this.document, getEditingDomain());
		setSite(site);
		setInput(documentViewEditorInput);
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
	}

	@Override
	public void setFocus() {
	}

}
