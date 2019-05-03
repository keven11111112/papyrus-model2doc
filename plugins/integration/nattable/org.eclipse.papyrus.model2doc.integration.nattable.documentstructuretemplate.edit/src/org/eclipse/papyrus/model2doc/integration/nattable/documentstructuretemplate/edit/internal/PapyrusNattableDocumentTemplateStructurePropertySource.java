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

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.properties.descriptors.CustomPropertyDescriptor;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.editors.factories.PapyrusTableViewTableKindIdEditorFactory;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.editors.factories.PapyrusTableViewTableTypeEditorFactory;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * The {@link PropertySource} used to provide a better edition way for some properties of the PapyrusNattableDocumentStructureTemplate metamodel
 */
public class PapyrusNattableDocumentTemplateStructurePropertySource extends PropertySource {

	/**
	 * Constructor.
	 *
	 * @param object
	 * @param itemPropertySource
	 */
	public PapyrusNattableDocumentTemplateStructurePropertySource(final Object object, final IItemPropertySource itemPropertySource) {
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
		if (f == PapyrusNattableDocumentStructureTemplatePackage.eINSTANCE.getPapyrusTableView_TableKindId()) {
			return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, new PapyrusTableViewTableKindIdEditorFactory());
		}
		if (f == PapyrusNattableDocumentStructureTemplatePackage.eINSTANCE.getPapyrusTableView_TableType()) {
			return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, new PapyrusTableViewTableTypeEditorFactory());
		}
		return super.createPropertyDescriptor(itemPropertyDescriptor);
	}
}
