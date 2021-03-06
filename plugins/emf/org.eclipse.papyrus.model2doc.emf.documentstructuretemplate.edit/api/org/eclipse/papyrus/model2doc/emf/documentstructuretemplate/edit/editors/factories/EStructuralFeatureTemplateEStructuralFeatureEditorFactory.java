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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.providers.EStructuralFeatureTreeContentProvider;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.validators.SingleEStructuralFeatureValidator;

/**
 * Factory used to edit {@link EStructuralFeatureColumn#setFeature(org.eclipse.emf.ecore.EStructuralFeature)}
 */
public class EStructuralFeatureTemplateEStructuralFeatureEditorFactory extends AbstractEcoreEReferenceDialogEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://documentstructuretemplate/EStructuralFeatureTemplate/EStructuralFeature/"); //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	public EStructuralFeatureTemplateEStructuralFeatureEditorFactory() {
		super(SELF_URI, DocumentStructureTemplatePackage.eINSTANCE.getEStructuralFeatureTemplate_Feature());
	}


	/**
	 * @param editedObject
	 * @param cellEditor
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#configureCellEditor(Object,
	 *      org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.CustomExtendedDialogCellEditor)
	 */
	@Override
	protected void configureCellEditor(final Object editedObject, final CustomExtendedDialogCellEditor cellEditor) {
		super.configureCellEditor(editedObject, cellEditor);
		cellEditor.setContentProvider(new EStructuralFeatureTreeContentProvider());
		cellEditor.setSelectionStatusValidator(new SingleEStructuralFeatureValidator());
	}

}