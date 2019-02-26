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
package org.eclipse.papyrus.model2doc.odt.internal.listener;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IContentChangedListener;
import org.eclipse.papyrus.infra.core.sashwindows.di.DiPackage;
import org.eclipse.papyrus.infra.core.sashwindows.di.PageRef;

import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceService;
import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceServiceImpl;
import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.odt.service.ODTEditorService;
import org.eclipse.papyrus.model2doc.odt.service.ODTEditorServiceImpl;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOService;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOServiceImpl;

/**
 * This listener allows to open and close LibreOffice when the user does Open in the Papyrus ModelExplorer.
 * 
 * @since 3.0
 */
public class OpenCloseODTDocumentListener implements IContentChangedListener {

	/**
	 * @see org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IContentChangedListener#contentChanged(org.eclipse.papyrus.infra.core.sasheditor.contentprovider.IContentChangedListener.ContentEvent)
	 *
	 * @param event
	 */
	public void contentChanged(ContentEvent event) {
		if (event instanceof org.eclipse.emf.common.notify.Notification) {
			Notification notification = (Notification) event;
			Object newValue = notification.getNewValue();
			Object oldValue = notification.getOldValue();
			Object feature = notification.getFeature();
			int eventType = notification.getEventType();
			Object referencedPage = null;


			if (eventType == Notification.ADD && newValue instanceof PageRef) {
				referencedPage = ((PageRef) newValue).getEmfPageIdentifier();

				// we are opening a Document
				if (referencedPage instanceof Document && feature == DiPackage.eINSTANCE.getTabFolder_Children()) {
					openDocument((Document) referencedPage);
				}
			} else if (eventType == Notification.REMOVE && oldValue instanceof PageRef && null == newValue) {
				referencedPage = ((PageRef) oldValue).getEmfPageIdentifier();

				// we are closing a Document
				if (referencedPage instanceof Document && feature == DiPackage.eINSTANCE.getTabFolder_Children()) {
					closeDocument((Document) referencedPage);
				}
			}
		}

	}

	/**
	 * Close document.
	 * 
	 * @param document
	 */
	private void closeDocument(Document document) {
		if ((document != null) && document.getDocumentKind().matches(ODTEditorService.DOCUMENT_KIND)) {
			WorkspaceResourceService workspaceResourceService = new WorkspaceResourceServiceImpl();
			// open the document
			String projectFolder = workspaceResourceService.calculateProjectFolder(document.getContext());

			ODTEditorService odtEditorService = new ODTEditorServiceImpl();
			ODTFileIOService odtFileIOService = new ODTFileIOServiceImpl();

			String generatedDocumentPath = odtFileIOService.updatePathOfFileInWorkspace(document.getGeneratedDocumentFileURI());

			// Verify if generated document exist
			if (generatedDocumentPath != null && !generatedDocumentPath.isEmpty()) {
				// If generated document exists then close it
				odtEditorService.closeDocument(projectFolder, odtFileIOService.getODTFilePrefix() + generatedDocumentPath);
			}
		}
	}

	/**
	 * Open document.
	 * 
	 * @param document
	 */
	private void openDocument(final Document document) {
		if ((document != null) && document.getDocumentKind().matches(ODTEditorService.DOCUMENT_KIND)) {
			WorkspaceResourceService workspaceResourceService = new WorkspaceResourceServiceImpl();
			// open the document
			String projectFolder = workspaceResourceService.calculateProjectFolder(document.getContext());

			ODTEditorService odtEditorService = new ODTEditorServiceImpl();
			ODTFileIOService odtFileIOService = new ODTFileIOServiceImpl();

			String generatedDocumentPath = odtFileIOService.updatePathOfFileInWorkspace(document.getGeneratedDocumentFileURI());

			// Verify if generated document exist
			if (generatedDocumentPath != null && !generatedDocumentPath.isEmpty()) {
				// If generated document exists then open it
				odtEditorService.openDocument(projectFolder, odtFileIOService.getODTFilePrefix() + generatedDocumentPath);
			}
		}
	}

}