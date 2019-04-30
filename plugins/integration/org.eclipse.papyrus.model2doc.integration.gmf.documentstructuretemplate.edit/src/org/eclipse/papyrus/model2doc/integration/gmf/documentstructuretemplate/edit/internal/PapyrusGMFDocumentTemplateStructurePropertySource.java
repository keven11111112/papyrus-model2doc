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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.properties.descriptors.CustomPropertyDescriptor;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.editors.factories.PapyrusGMFDiagramViewDiagramKindIdEditorFactory;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.editors.factories.PapyrusGMFDiagramViewDiagramTypeEditorFactory;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * The {@link PropertySource} used to provide a better edition way for some properties of the PapyrusGMFDocumentStructureTemplate metamodel
 */
public class PapyrusGMFDocumentTemplateStructurePropertySource extends PropertySource {

	/**
	 * Constructor.
	 *
	 * @param object
	 * @param itemPropertySource
	 */
	public PapyrusGMFDocumentTemplateStructurePropertySource(final Object object, final IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}

	/**
	 * @see org.eclipse.emf.edit.ui.provider.PropertySource#createPropertyDescriptor(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 *
	 * @param itemPropertyDescriptor
	 * @return
	 */
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(final IItemPropertyDescriptor itemPropertyDescriptor) {
		final EStructuralFeature f = (EStructuralFeature) itemPropertyDescriptor.getFeature(this.object);
		if (f == PapyrusGMFDocumentStructureTemplatePackage.eINSTANCE.getPapyrusGMFDiagramView_DiagramKindId()) {
			return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, new PapyrusGMFDiagramViewDiagramKindIdEditorFactory());
		}
		if (f == PapyrusGMFDocumentStructureTemplatePackage.eINSTANCE.getPapyrusGMFDiagramView_DiagramType()) {
			return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, new PapyrusGMFDiagramViewDiagramTypeEditorFactory());
		}
		return super.createPropertyDescriptor(itemPropertyDescriptor);
	}
}
