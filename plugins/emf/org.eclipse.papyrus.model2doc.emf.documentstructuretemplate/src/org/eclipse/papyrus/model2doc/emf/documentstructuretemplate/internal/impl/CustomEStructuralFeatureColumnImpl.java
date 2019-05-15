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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * Custom implementation for {@link EStructuralFeatureColumnImpl}
 */
public class CustomEStructuralFeatureColumnImpl extends EStructuralFeatureColumnImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl#buildColumnHeaderLabel()
	 *
	 * @return
	 */
	@Override
	public String buildColumnHeaderLabel() {
		return DelegatingToEMFLabelProvider.INSTANCE.getText(this.feature);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl#getCellValue(org.eclipse.emf.ecore.EObject)
	 *
	 * @param row
	 * @return
	 */
	@Override
	public Object getCellValue(final EObject row) {
		if (false == row.eClass().getEAllStructuralFeatures().contains(this.feature)) {
			return "N/A"; //$NON-NLS-1$
		}
		return row.eGet(this.feature);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EStructuralFeatureColumnImpl#buildCellLabel(java.lang.Object)
	 *
	 * @param cellElement
	 * @return
	 */
	@Override
	public String buildCellLabel(Object cellElement) {
		if (null != this.customColumnTitle && false == this.customColumnTitle.isEmpty()) {
			return this.customColumnTitle;
		}
		return DelegatingToEMFLabelProvider.INSTANCE.getText(cellElement);
	}

}
