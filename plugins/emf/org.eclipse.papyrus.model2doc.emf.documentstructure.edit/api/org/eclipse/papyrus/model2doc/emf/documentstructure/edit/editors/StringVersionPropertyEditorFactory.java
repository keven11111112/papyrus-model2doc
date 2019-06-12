/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructure.edit.editors;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.EMFEditUIPropertyEditorFactory;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.papyrus.model2doc.emf.documentstructure.edit.validators.StringVersionValidator;
import org.eclipse.swt.widgets.Composite;

public class StringVersionPropertyEditorFactory extends EMFEditUIPropertyEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://documentstructure/StringVersion/version"); //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	public StringVersionPropertyEditorFactory() {
		super(SELF_URI);
	}

	/**
	 * @see org.eclipse.emf.edit.ui.provider.EMFEditUIPropertyEditorFactory#createEditor(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertyDescriptor, org.eclipse.swt.widgets.Composite)
	 *
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @return
	 */
	@Override
	public CellEditor createEditor(final Object object, final IItemPropertyDescriptor propertyDescriptor, final Composite composite) {
		final CellEditor editor = createDefaultEditor(object, propertyDescriptor, composite);
		editor.setValidator(new StringVersionValidator());
		return editor;
	}


}
