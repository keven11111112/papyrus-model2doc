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

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.properties.internal;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

/**
 * The {@link PropertySource} used to provide a better edition way for some properties of the DocumentStructureTemplate metamodel
 */
public class DocumentTemplateStructurePropertySource extends PropertySource {

	/**
	 * Constructor.
	 *
	 * @param object
	 * @param itemPropertySource
	 */
	public DocumentTemplateStructurePropertySource(Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}

	/**
	 * @see org.eclipse.emf.edit.ui.provider.PropertySource#createPropertyDescriptor(org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 *
	 * @param itemPropertyDescriptor
	 * @return
	 */
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		final EStructuralFeature f = (EStructuralFeature) itemPropertyDescriptor.getFeature(object);
		if (f != DocumentStructureTemplatePackage.eINSTANCE.getEReferencePartTemplate_EReference()) {
			return super.createPropertyDescriptor(itemPropertyDescriptor);
		}
		return new EReferencePartTemplatePropertyDescriptor(object, itemPropertyDescriptor);
	}
}
