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

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations;

import java.util.Iterator;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Operations class for the interface {@link IStereotypeTemplate}
 */
public class StereotypeTemplateOperations {

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.impl.StereotypePartTemplateImpl#getFirstMatchingStereotypeApplication(org.eclipse.uml2.uml.Element)
	 *
	 * @param element
	 * @return
	 */
	public static final EObject getFirstMatchingStereotypeApplication(final StereotypeTemplate stereotypePartTemplate, final EObject element) {
		if (false == element instanceof Element) {
			return null;
		}
		final Element el = (Element) element;
		final Stereotype matchingStereotype = getFirstMatchingAppliedStereotype(stereotypePartTemplate, el);
		if (null == matchingStereotype) {
			return null;
		}
		return el.getStereotypeApplication(matchingStereotype);
	}

	/**
	 *
	 * @param element
	 *            a UML elementF
	 * @return
	 *         the first applied stereotype matching the condition
	 */
	private static final Stereotype getFirstMatchingAppliedStereotype(final StereotypeTemplate stereotypePartTemplate, final Element element) {
		Stereotype matchingStereotype = null;
		final Iterator<Stereotype> steIter = element.getAppliedStereotypes().iterator();
		while (steIter.hasNext() && matchingStereotype == null) {
			final Stereotype stereotype = steIter.next();
			final String stereotypeQualifiedName = stereotypePartTemplate.getStereotypeQualifiedName() == null ? "" : stereotypePartTemplate.getStereotypeQualifiedName(); //$NON-NLS-1$
			switch (stereotypePartTemplate.getStereotypeFilterRule()) {
			case STEREOTYPE_TYPE_OF:
				if (stereotypeQualifiedName.equals(stereotype.getQualifiedName())) {
					matchingStereotype = stereotype;
				}
				break;
			case STEREOTYPE_KIND_OF:
				if (stereotypeQualifiedName.equals(stereotype.getQualifiedName())) {
					matchingStereotype = stereotype;
				} else {
					// we get the list of the stereotypes parent
					final Optional<Stereotype> firstMatchingParent = stereotype.allParents()
							.stream()
							.filter(Stereotype.class::isInstance).map(Stereotype.class::cast)
							.filter(s -> s.getQualifiedName().equals(stereotypeQualifiedName)).findFirst();

					matchingStereotype = firstMatchingParent.orElse(null);

				}
				break;
			default:
				break;
			}
		}
		return matchingStereotype;
	}
}
