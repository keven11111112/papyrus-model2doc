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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.EClassTemplateOperations;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeWithEClassTemplate;

/**
 * This class provides the operations for {@link MandatoryStereotypeWithEClassTemplate}
 */
public class MandatoryStereotypeWithEClassTemplateOperations {

	/**
	 *
	 * @param mandatoryStereotypeWithEClassTemplate
	 * @param inputObject
	 * @return
	 */
	public static boolean isMatchingFilterRule(final MandatoryStereotypeWithEClassTemplate mandatoryStereotypeWithEClassTemplate, final EObject inputObject) {
		final boolean matchingEClass = EClassTemplateOperations.isMatchingFilterRule(mandatoryStereotypeWithEClassTemplate, inputObject);
		if (false == matchingEClass) {
			return false;
		}
		final String stereotypeQualifiedName = mandatoryStereotypeWithEClassTemplate.getStereotypeQualifiedName();
		if (null == stereotypeQualifiedName || stereotypeQualifiedName.isEmpty()) {
			return false;
		}
		if (false == inputObject instanceof org.eclipse.uml2.uml.Element) {
			return false;
		}

		return null != mandatoryStereotypeWithEClassTemplate.getFirstMatchingStereotypeApplication(inputObject);
	}


}
