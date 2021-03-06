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
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.converters.StereotypeDisplayConverter;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.providers.StereotypeTreeContentProvider;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.validators.SingleStereotypeValidator;

/**
 * Editor Factory used to edit {@link StereotypeTemplate#setStereotypeQualifiedName(String)}
 */
public class StereotypeTemplateStereotypeQualifiedNameEditorFactory extends AbstractUMLElementDialogEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://umldocumentstructuretemplate/StereotypeTemplate/stereotypeQualifiedName/"); //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 * @param propertyEditorFactoryURI
	 *            the declared uri for this editor
	 * @param editedFeature
	 *            the edited feature
	 */
	public StereotypeTemplateStereotypeQualifiedNameEditorFactory() {
		super(SELF_URI, UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypeTemplate_StereotypeQualifiedName());
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
		cellEditor.setContentProvider(new StereotypeTreeContentProvider());
		cellEditor.setDisplayConverter(new StereotypeDisplayConverter());
		cellEditor.setSelectionStatusValidator(new SingleStereotypeValidator());
	}

}
