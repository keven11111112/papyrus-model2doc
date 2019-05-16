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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.StereotypePartTemplateImpl;

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
		if (false == inputEObject instanceof org.eclipse.uml2.uml.Element) {
			return false;
		}

		return null != getFirstMatchingStereotypeApplication(inputEObject);
	}


	/**
	 *
	 * @param inputEObject
	 *            the input Object
	 * @return
	 *         <code>true</code> if the EClass match the current object
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

}
