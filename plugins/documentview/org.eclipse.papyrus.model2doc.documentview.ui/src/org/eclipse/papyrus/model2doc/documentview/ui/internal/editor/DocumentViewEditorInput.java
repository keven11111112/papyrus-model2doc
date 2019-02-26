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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * DocumentView EditorInput.
 *
 */
public class DocumentViewEditorInput implements IEditorInput {

	/** The input for the Document widget */
	private final Document documentInstance;

	/** A textual description of what is shown in the editor */
	private final String description;

	private final TransactionalEditingDomain editingDomain;

	public DocumentViewEditorInput(final Document papyrusDocument, final TransactionalEditingDomain editingDomain) {
		this.documentInstance = papyrusDocument;
		this.description = papyrusDocument.getDescription();
		this.editingDomain = editingDomain;
	}

	public Document getPapyrusDocumentInstance() {
		return this.documentInstance;
	}

	public String getDescription() {
		return this.description;
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return "Model Document"; //$NON-NLS-1$
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return "Model Document"; //$NON-NLS-1$
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		return null;
	}

	protected TransactionalEditingDomain getEditingDomain() {
		return this.editingDomain;
	}
}
