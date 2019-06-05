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

package org.eclipse.papyrus.model2doc.integration.uml.documentstructuretemplate.properties.internal;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.properties.descriptors.CustomPropertyDescriptor;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.editors.factories.StereotypePropertyTemplatePropertyNameEditorFactory;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.editors.factories.StereotypeTemplateStereotypeQualifiedNameEditorFactory;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * The {@link PropertySource} used to provide a better edition way for some properties of the DocumentStructureTemplate metamodel
 */
public class UMLDocumentTemplateStructurePropertySource extends PropertySource {

	/**
	 * Constructor.
	 *
	 * @param object
	 * @param itemPropertySource
	 */
	public UMLDocumentTemplateStructurePropertySource(final Object object, final IItemPropertySource itemPropertySource) {
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
		if (f == UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypeTemplate_StereotypeQualifiedName()) {
			return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, new StereotypeTemplateStereotypeQualifiedNameEditorFactory());
		}
		if (f == UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePropertyTemplate_PropertyName()) {
			return new CustomPropertyDescriptor(this.object, itemPropertyDescriptor, new StereotypePropertyTemplatePropertyNameEditorFactory());
		}
		return super.createPropertyDescriptor(itemPropertyDescriptor);
	}
}
