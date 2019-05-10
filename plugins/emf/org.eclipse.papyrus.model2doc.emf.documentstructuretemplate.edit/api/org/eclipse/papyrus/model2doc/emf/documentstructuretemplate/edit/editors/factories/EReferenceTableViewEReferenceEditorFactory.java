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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.providers.EReferenceTreeContentProvider;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.validators.SingleEReferenceValidator;

/**
 * Factory used to edit {@link EReferenceTableView#setEReference(EReference)}
 */
public class EReferenceTableViewEReferenceEditorFactory extends AbstractEcoreEReferenceDialogEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://documentstructuretemplate/EReferenceTableView/EReference/"); //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	public EReferenceTableViewEReferenceEditorFactory() {
		super(SELF_URI, DocumentStructureTemplatePackage.eINSTANCE.getEReferenceTableView_EReference());
	}


	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#configureCellEditor(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.CustomExtendedDialogCellEditor)
	 *
	 * @param cellEditor
	 */
	@Override
	protected void configureCellEditor(final CustomExtendedDialogCellEditor cellEditor) {
		super.configureCellEditor(cellEditor);
		cellEditor.setContentProvider(new EReferenceTreeContentProvider());
		cellEditor.setSelectionStatusValidator(new SingleEReferenceValidator());
	}

}