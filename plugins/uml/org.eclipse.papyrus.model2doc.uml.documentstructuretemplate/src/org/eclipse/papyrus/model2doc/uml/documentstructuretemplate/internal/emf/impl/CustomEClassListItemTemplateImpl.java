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

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassListItemTemplateImpl;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers.UMLDelegatingToEMFLabelProvider;

/**
 * Custom implementation of {@link EClassListItemTemplateImpl}
 */
public class CustomEClassListItemTemplateImpl extends EClassListItemTemplateImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EClassListItemTemplateImpl#buildItemLabel(java.lang.Object)
	 *
	 * @param item
	 * @return
	 */
	@Override
	public String buildItemLabel(Object item) {
		final String customLabel = getCustomItemLabel();
		if (null != customLabel && false == customLabel.isEmpty()) {
			return customLabel;
		}
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(item);
	}
}
