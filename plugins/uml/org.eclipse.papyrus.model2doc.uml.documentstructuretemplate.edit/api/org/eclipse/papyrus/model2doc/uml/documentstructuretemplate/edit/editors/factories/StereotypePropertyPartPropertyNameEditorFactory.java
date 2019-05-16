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

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.editors.factories;

import org.eclipse.emf.common.util.URI;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.converters.StereotypePropertyDisplayConverter;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.providers.StereotypePropertyTreeContentProvider;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.validators.SinglePropertyReferenceValidator;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.validators.SinglePropertyValidator;

/**
 * Editor Factory used to edit the feature UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePropertyPart_PropertyName()
 */
public class StereotypePropertyPartPropertyNameEditorFactory extends AbstractUMLElementDialogEditorFactory {
	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://umldocumentstructuretemplate/StereotypePropertyPart/propertyName/"); //$NON-NLS-1$

	/**
	 * Constructor.
	 */
	public StereotypePropertyPartPropertyNameEditorFactory() {
		super(SELF_URI, UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePropertyPart_PropertyName());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#configureCellEditor(Object,
	 *      org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor)
	 *
	 * @param editedObject
	 * @param cellEditor
	 */
	@Override
	protected void configureCellEditor(final Object editedObject, final CustomExtendedDialogCellEditor cellEditor) {
		super.configureCellEditor(editedObject, cellEditor);
		cellEditor.setContentProvider(new StereotypePropertyTreeContentProvider());
		cellEditor.setDisplayConverter(new StereotypePropertyDisplayConverter());

		if (editedObject instanceof StereotypePropertyReferencePartTemplate) {
			cellEditor.setSelectionStatusValidator(new SinglePropertyReferenceValidator());
		} else {
			cellEditor.setSelectionStatusValidator(new SinglePropertyValidator());
		}
	}

}
