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
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.editor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.messages.Messages;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * DocumentView EditorInput.
 *
 */
public class DocumentStructureTemplateEditorInput implements IEditorInput {

	/** The input for the Document widget */
	private final DocumentTemplate documentInstance;

	/**
	 *
	 * Constructor.
	 *
	 * @param documentTemplate
	 *            the document template to edit
	 */
	public DocumentStructureTemplateEditorInput(final DocumentTemplate documentTemplate) {
		this.documentInstance = documentTemplate;
	}

	/**
	 *
	 * @return
	 * 		the document template for which we are opening an editor
	 */
	public DocumentTemplate getDocumentTemplate() {
		return this.documentInstance;
	}

	/**
	 *
	 * @see org.eclipse.ui.IEditorInput#exists()
	 *
	 * @return
	 */
	@Override
	public boolean exists() {
		return false;// not required in a Papyrus context
	}

	/**
	 *
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 *
	 * @return
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return null; // not required in a Papyrus context
	}

	/**
	 *
	 * @see org.eclipse.ui.IEditorInput#getName()
	 *
	 * @return
	 */
	@Override
	public String getName() {
		final String name = this.documentInstance.getName();
		return name == null || name.isEmpty() ? Messages.DocumentViewEditorInput_0 : name;
	}

	/**
	 *
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 *
	 * @return
	 */
	@Override
	public IPersistableElement getPersistable() {
		return null;// not required in a Papyrus context
	}

	/**
	 *
	 * @return
	 * 		the description
	 */
	private String getDescription() {
		final String description = this.documentInstance.getDescription();
		return description == null || description.isEmpty() ? Messages.DocumentViewEditorInput_1 : description;
	}

	/**
	 *
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 *
	 * @return
	 */
	@Override
	public String getToolTipText() {
		return NLS.bind(Messages.DocumentViewEditorInput_2, getName(), getDescription());
	}

	/**
	 *
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 *
	 * @param adapter
	 *            the only supported type is {@link URI}
	 * @return
	 * 		the uri of the file containing the {@link DocumentTemplate} to edit
	 */
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		if (adapter == URI.class) {
			return this.documentInstance.eResource().getURI();
		}
		return null;
	}
}
