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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.operations.UMLBodySectionPartTemplateTitleHelper;

/**
 * Custom implementation for {@link StereotypePropertyReferencePartTemplate}
 */
public class CustomStereotypePropertyReferencePartTemplateImpl extends StereotypePropertyReferencePartTemplateImpl {

	/**
	 * unique title helper for all instance of {@link StereotypePropertyReferencePartTemplate}
	 */
	private static final UMLBodySectionPartTemplateTitleHelper UML_TITLE_HELPER = new UMLBodySectionPartTemplateTitleHelper();

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#getMatchingReferencedEObjects(org.eclipse.emf.ecore.EObject)
	 *
	 * @param eobject
	 * @return
	 */
	@Override
	public EList<EObject> getMatchingReferencedEObjects(final EObject eobject) {
		if (null == this.propertyName || this.propertyName.isEmpty()) {
			return ECollections.emptyEList();
		}

		final EStructuralFeature feature = eobject.eClass().getEStructuralFeature(this.propertyName);
		if (null == feature) {
			return ECollections.emptyEList();
		}
		if (false == feature.getEType() instanceof EObject || false == feature instanceof EReference) {
			// EAttribute are not managed here
			return ECollections.emptyEList();
		}
		final List<EObject> elements = new ArrayList<>();

		if (feature.isMany()) {
			final Collection<?> value = (Collection<?>) eobject.eGet(feature, true);
			if (null != value && false == value.isEmpty()) {
				value.stream().forEach(v -> elements.add((EObject) v));
			}
		} else {
			elements.add((EObject) eobject.eGet(feature, true));
		}
		return ECollections.unmodifiableEList(elements);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePropertyReferencePartTemplateImpl#buildTitle()
	 *
	 * @return
	 */
	@Override
	public String buildTitle() {
		return UML_TITLE_HELPER.buildTitle(this);
	}
}
