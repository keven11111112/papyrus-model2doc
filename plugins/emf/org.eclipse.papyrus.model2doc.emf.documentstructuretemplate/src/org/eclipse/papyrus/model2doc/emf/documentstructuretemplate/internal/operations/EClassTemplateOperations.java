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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate;

/**
 * This class provides the operations for {@link EClassTemplate}
 */
public class EClassTemplateOperations {

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#isMatchingFilterRule(org.eclipse.emf.ecore.EObject)
	 *
	 * @param inputEObject
	 * @return
	 */
	public static boolean isMatchingFilterRule(final EClassTemplate eClassTemplate, final EObject inputEObject) {
		if (null == inputEObject) {
			return false;
		}
		if (null == eClassTemplate.getEClass()) {
			return true;
		}
		switch (eClassTemplate.getFilterRule()) {
		case TYPE_OF:
			return eClassTemplate.getEClass() == inputEObject.eClass();
		case KIND_OF:
			return eClassTemplate.getEClass().isInstance(inputEObject);
		default:
			return false;
		}
	}
}
