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

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.editors.factories;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.CustomExtendedDialogCellEditor;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.converters.PapyrusTableViewTableKindIdDisplayConverter;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.messages.Messages;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.providers.PapyrusTableKindIdLabelProvider;

/**
 * Factory used to edit {@link PapyrusTableView#setTableKindId(String))}
 */
public class PapyrusTableViewTableKindIdEditorFactory extends AbstracPapyrusTableViewEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://papyrusnattabledocumentstructuretemplate/PapyrusTableView/tableKindId/"); //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 * @param propertyEditorFactoryURI
	 */
	public PapyrusTableViewTableKindIdEditorFactory() {
		super(SELF_URI, PapyrusNattableDocumentStructureTemplatePackage.eINSTANCE.getPapyrusTableView_TableKindId());
	}


	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#configureCellEditor(org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.CustomExtendedDialogCellEditor)
	 *
	 * @param cellEditor
	 */
	@Override
	protected void configureCellEditor(final CustomExtendedDialogCellEditor cellEditor) {
		super.configureCellEditor(cellEditor);
		cellEditor.setDialogMessage(Messages.PapyrusTableViewTableKindIdEditorFactory_SelectATableKind);
		cellEditor.setDisplayConverter(new PapyrusTableViewTableKindIdDisplayConverter());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.editors.factories.AbstractEStructuralFeatureDialogEditorFactory#getOrCreateLabelProvider()
	 *
	 * @return
	 */
	@Override
	public ILabelProvider getOrCreateLabelProvider() {
		return new PapyrusTableKindIdLabelProvider();
	}
}