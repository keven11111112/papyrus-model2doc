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

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers.UMLDelegatingToEMFLabelProvider;

/**
 * Custom implementation for {@link EStructuralFeatureColumn}
 */
public class CustomEStructuralFeatureColumnImpl extends EStructuralFeatureColumnImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureTemplateImpl#buildEStructuralFeatureValueLabel(java.lang.Object)
	 *
	 * @param value
	 * @return
	 */
	@Override
	public String buildEStructuralFeatureValueLabel(Object value) { // what is this method???? TODO TODO TODO
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(value);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl#buildCellLabel(java.lang.Object)
	 *
	 * @param cellValue
	 * @return
	 */
	@Override
	public String buildCellLabel(Object cellValue) {
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(cellValue);
	}
}
