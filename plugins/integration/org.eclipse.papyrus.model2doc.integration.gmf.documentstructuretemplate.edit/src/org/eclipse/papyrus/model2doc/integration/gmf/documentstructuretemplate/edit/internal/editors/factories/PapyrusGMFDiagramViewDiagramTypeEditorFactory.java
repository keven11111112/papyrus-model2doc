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

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDiagramView;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.converters.PapyrusDiagramViewDiagramTypeDisplayConverter;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.messages.Messages;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.providers.PapyrusDiagramTypeLabelProvider;

/**
 * Factory used to edit {@link PapyrusGMFDiagramView#setDiagramType(String)}
 */
public class PapyrusGMFDiagramViewDiagramTypeEditorFactory extends AbstracPapyrusGMFDiagramViewEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://papyrusgmfdocumentstructuretemplate/PapyrusGMFDiagramView/diagramType"); //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 * @param propertyEditorFactoryURI
	 */
	public PapyrusGMFDiagramViewDiagramTypeEditorFactory() {
		super(SELF_URI, PapyrusGMFDocumentStructureTemplatePackage.eINSTANCE.getPapyrusGMFDiagramView_DiagramType());
	}


	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#configureCellEditor(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.CustomExtendedDialogCellEditor)
	 *
	 * @param cellEditor
	 */
	@Override
	protected void configureCellEditor(final CustomExtendedDialogCellEditor cellEditor) {
		super.configureCellEditor(cellEditor);
		cellEditor.setDialogMessage(Messages.PapyrusGMFDiagramViewDiagramTypeEditorFactory_SelectADiagramType);
		cellEditor.setDisplayConverter(new PapyrusDiagramViewDiagramTypeDisplayConverter());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#getOrCreateLabelProvider()
	 *
	 * @return
	 */
	@Override
	public ILabelProvider getOrCreateLabelProvider() {
		return new PapyrusDiagramTypeLabelProvider();
	}

}

