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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleHelper;

/**
 * Custom implementation for {@link EClassPartTemplate}
 */
public class CustomEClassPartTemplateImpl extends EClassPartTemplateImpl {

	/**
	 * unique title helper for all instance of {@link EClassPartTemplate}
	 */
	private static final BodySectionPartTemplateTitleHelper TITLE_HELPER = new BodySectionPartTemplateTitleHelper();

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassDocumentPartTemplateImpl#isMatchingFilterRule(org.eclipse.emf.ecore.EObject)
	 *
	 * @param inputEObject
	 * @return
	 */
	@Override
	public boolean isMatchingFilterRule(final EObject inputEObject) {
		if (null == inputEObject) {
			return false;
		}
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

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassPartTemplateImpl#buildPartTitle(org.eclipse.emf.ecore.EObject)
	 *
	 * @param titleContext
	 * @return
	 */
	@Override
	public String buildTitle(final EObject titleContext) {
		return TITLE_HELPER.buildTitle(this, titleContext);
	}
}