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

package org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl;

import java.util.Iterator;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl;
import org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePartTemplate;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Custom implementation for {@link StereotypePartTemplate}
 */
public class CustomStereotypePartTemplateImpl extends StereotypePartTemplateImpl {


	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl#isMatchingFilterRule(org.eclipse.emf.ecore.EObject)
	 *
	 * @param inputEObject
	 * @return
	 */
	@Override
	public boolean isMatchingFilterRule(final EObject inputEObject) {
		if (false == isMatchingEClassFilterRule(inputEObject)) {
			return false;
		}
		if (null == this.stereotypeQualifiedName || this.stereotypeQualifiedName.isEmpty()) {
			return false;
		}
		if (false == inputEObject instanceof Element) {
			return false;
		}

		return null != getFirstMatchingStereotypeApplication(inputEObject);
	}


	/**
	 *
	 * @param inputEObject
	 *            the input Object
	 * @return
	 * 		<code>true</code> if the EClass match the current object
	 *
	 *         Duplicated (and renamed) method from {@link EClassPartTemplateImpl}
	 */
	private boolean isMatchingEClassFilterRule(final EObject inputEObject) {
		if (this.eClass == null) {
			return true;
		}
		switch (getFilterRule()) {
		case TYPE_OF:
			return getEClass() == inputEObject.eClass();
		case KIND_OF:
			return getEClass().isInstance(inputEObject);
		default:
			return false;
		}
	}

	/**
	 *
	 * @param element
	 *            a UML elementF
	 * @return
	 * 		the first applied stereotype matching the condition
	 */
	private Stereotype getFirstMatchingAppliedStereotype(final Element element) {
		Stereotype matchingStereotype = null;
		final Iterator<Stereotype> steIter = element.getAppliedStereotypes().iterator();
		while (steIter.hasNext() && matchingStereotype == null) {
			final Stereotype stereotype = steIter.next();
			switch (this.stereotypeFilterRule) {
			case STEREOTYPE_TYPE_OF:
				if (this.stereotypeQualifiedName.equals(stereotype.getQualifiedName())) {
					matchingStereotype = stereotype;
				}
				break;
			case STEREOTYPE_KIND_OF:
				if (this.stereotypeQualifiedName.equals(stereotype.getQualifiedName())) {
					matchingStereotype = stereotype;
				} else {
					// we get the list of the stereotypes parent
					final Optional<Stereotype> firstMatchingParent = stereotype.allParents()
							.stream()
							.filter(Stereotype.class::isInstance).map(Stereotype.class::cast)
							.filter(s -> s.getQualifiedName().equals(this.stereotypeQualifiedName)).findFirst();

					matchingStereotype = firstMatchingParent.get();

				}
				break;
			default:
				break;
			}
		}
		return matchingStereotype;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePartTemplateImpl#getFirstMatchingStereotypeApplication(org.eclipse.uml2.uml.Element)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public EObject getFirstMatchingStereotypeApplication(final EObject element) {
		if (false == element instanceof Element) {
			return null;
		}
		final Element el = (Element) element;
		final Stereotype matchingStereotype = getFirstMatchingAppliedStereotype(el);
		if (null == matchingStereotype) {
			return null;
		}
		return el.getStereotypeApplication(matchingStereotype);
	}

}
