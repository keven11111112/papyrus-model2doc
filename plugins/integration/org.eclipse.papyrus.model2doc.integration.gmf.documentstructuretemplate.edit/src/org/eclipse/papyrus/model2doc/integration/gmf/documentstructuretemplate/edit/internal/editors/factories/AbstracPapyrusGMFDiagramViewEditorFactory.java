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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.editors.factories;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.validators.OKSelectionStatusValidator;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.providers.PapyrusDiagramContentProvider;

/**
 * Abstract factory providing the input for the edition of {@link PapyrusGMFDiagramView}
 */
public abstract class AbstracPapyrusGMFDiagramViewEditorFactory extends AbstractEStructuralFeatureDialogEditorFactory {

	/**
	 * Constructor.
	 *
	 * @param propertyEditorFactoryURI
	 * @param editedFeature
	 */
	public AbstracPapyrusGMFDiagramViewEditorFactory(URI propertyEditorFactoryURI, EStructuralFeature editedFeature) {
		super(propertyEditorFactoryURI, editedFeature);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#configureCellEditor(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor)
	 *
	 * @param cellEditor
	 */
	@Override
	protected void configureCellEditor(CustomExtendedDialogCellEditor cellEditor) {
		super.configureCellEditor(cellEditor);
		cellEditor.setContentProvider(new PapyrusDiagramContentProvider());
		cellEditor.setSelectionStatusValidator(new OKSelectionStatusValidator());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#getDialogInput(org.eclipse.emf.ecore.EObject)
	 *
	 * @param editedElement
	 * @return
	 */
	@Override
	protected Collection<?> getDialogInput(final EObject editedElement) {
		return org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.utils.PapyrusDiagramUtils.getPapyrusDiagram(editedElement);
	}

}
