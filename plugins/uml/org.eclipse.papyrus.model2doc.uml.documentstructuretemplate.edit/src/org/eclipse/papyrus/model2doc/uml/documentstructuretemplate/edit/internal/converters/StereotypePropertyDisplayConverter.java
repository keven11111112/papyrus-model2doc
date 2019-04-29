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

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.converters;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.converters.IDisplayConverter;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.edit.internal.utils.ProfileUtils;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This converter is used to convert a Stereotype into String (using its qualified name) and vice versa
 */
public class StereotypePropertyDisplayConverter implements IDisplayConverter {

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.converters.IDisplayConverter#semanticToDisplayValue(java.lang.Object, org.eclipse.emf.ecore.EObject)
	 *
	 * @param canonicalValue
	 * @param editedObject
	 * @return
	 */
	@Override
	public Object semanticToDisplayValue(final Object canonicalValue, final EObject editedObject) {
		if (canonicalValue instanceof String && ((String) canonicalValue).length() > 0) {
			if (editedObject instanceof StereotypePropertyReferencePartTemplate) {
				final StereotypePropertyReferencePartTemplate template = (StereotypePropertyReferencePartTemplate) editedObject;
				// check if the stereotype qn is set
				String steQN = template.getStereotypeQualifiedName();
				if (null == steQN || steQN.isEmpty()) {
					final EObject parent = template.eContainer();
					if (parent instanceof StereotypePartTemplate) {
						final StereotypePartTemplate steTemplate = (StereotypePartTemplate) parent;
						steQN = steTemplate.getStereotypeQualifiedName();
					}
				}

				if (null != steQN && false == steQN.isEmpty()) {
					final Stereotype stereotype = ProfileUtils.findStereotype(editedObject, steQN);
					if (null != stereotype) {
						return stereotype.getAttribute((String) canonicalValue, null);
					}
				}

				// bad case, we can't found the existing property from a StereotypeQualifiedName
				final Collection<Property> properties = ProfileUtils.findStereotypeProperty(editedObject, (String) canonicalValue);
				if (properties.size() == 1) {
					return properties.iterator().next();
				}
				return null;
			}
		}
		return null;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.converters.IDisplayConverter#displayToSemanticValue(java.lang.Object)
	 *
	 * @param displayValue
	 * @return
	 */
	@Override
	public Object displayToSemanticValue(final Object displayValue, final EObject editedObject) {
		if (displayValue instanceof Property) {
			return ((Property) displayValue).getName();
		}
		return ""; //$NON-NLS-1$
	}

}
