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

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.emf.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.operations.UMLBodySectionPartTemplateTitleHelper;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers.UMLDelegatingToEMFLabelProvider;

/**
 * Custom implementation for {@link EReferenceTableViewImpl}
 */
public class CustomEReferenceTableViewImpl extends EReferenceTableViewImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#buildPartTemplateTitle(org.eclipse.emf.ecore.EObject)
	 *
	 * @param context
	 * @return
	 */
	@Override
	public String buildPartTemplateTitle(EObject context) {
		return UMLBodySectionPartTemplateTitleHelper.UML_INSTANCE.buildPartTemplateTitle(this, context);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#buildRowHeaderLabel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param rowElement
	 * @return
	 */
	@Override
	public String buildRowHeaderLabel(EObject rowElement) {
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(rowElement);
	}
}
