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
 * 	 Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EAttributeTemplate;

/**
 * This class provides operations for the elements {@link EAttributeTemplate}
 */
public class EAttributeTemplateOperations {


	/**
	 *
	 * @param eAttributeTemplate
	 *            an {@link EAttributeTemplate}
	 * @param context
	 *            the context used to evaluate the value of the {@link EAttribute}
	 * @return
	 *         a list owning the values for the referenced {@link EAttribute}
	 */
	public static final EList<Object> getEAttributeValues(final EAttributeTemplate eAttributeTemplate, final EObject context) {
		final List<Object> elements = new ArrayList<>();
		final EAttribute eAttribute = eAttributeTemplate.getEAttribute();
		if (null != eAttribute) {
			if (context.eClass().getEAllAttributes().contains(eAttribute)) {
				if (eAttribute.isMany()) {
					elements.addAll(((Collection<?>) context.eGet(eAttribute)));
				} else {
					elements.add(context.eGet(eAttribute));
				}
			}
		}
		return ECollections.unmodifiableEList(elements);
	}

	/**
	 *
	 * @param eAttributeTemplate
	 *            an {@link EAttributeTemplate}
	 * @param value
	 *            a value of the {@link EAttribute} referenced by the {@link EAttributeTemplate}
	 * @return
	 *         the string to use to represent this value
	 */
	public static final String buildEAttributeValueLabel(final EAttributeTemplate eAttributeTemplate, final Object value) {
		final EAttribute eAttribute = eAttributeTemplate.getEAttribute();
		if (null != eAttribute) {
			return eAttribute.getName();
		}
		return "No EAttribute"; //$NON-NLS-1$
	}
}
