/**
 * Copyright (c) 2019 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EObject;


public class CustomEClassPartTemplateImpl extends EClassPartTemplateImpl {

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#isMatchingFilterRule(org.eclipse.emf.ecore.EObject)
	 *
	 * @param inputEObject
	 * @return
	 */
	@Override
	public boolean isMatchingFilterRule(final EObject inputEObject) {
		if (null == this.eClass) {
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
