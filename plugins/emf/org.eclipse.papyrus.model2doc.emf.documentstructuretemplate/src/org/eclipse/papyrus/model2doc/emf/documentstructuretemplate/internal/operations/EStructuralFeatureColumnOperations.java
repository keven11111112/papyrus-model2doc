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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * This class provides the operations for {@link EStructuralFeatureColumn}
 */
public class EStructuralFeatureColumnOperations {

	/**
	 *
	 * @param column
	 *            a column element
	 * @return
	 *         the label to use for the column
	 */
	public static final String buildColumnHeaderLabel(final EStructuralFeatureColumn column) {
		final String customColumnTitle = column.getCustomColumnTitle();
		if (null != customColumnTitle && false == customColumnTitle.isEmpty()) {
			return customColumnTitle;
		}
		return column.getFeature().getName();
	}

	/**
	 *
	 * @param column
	 *            a column
	 * @param row
	 *            a row element
	 * @return
	 *         the cell value for this given column and given row
	 */
	public static final Object getCellValue(final EStructuralFeatureColumn column, final EObject row) {
		if (false == row.eClass().getEAllStructuralFeatures().contains(column.getFeature())) {
			return "N/A"; //$NON-NLS-1$
		}
		return column.getEStructuralFeatureValues(row);
	}

	/**
	 *
	 * @param column
	 *            a column
	 * @param cellValue
	 *            a cell value
	 * @return
	 *         the label to use in the cell for the given value
	 */
	public static final String buildCellLabel(final EStructuralFeatureColumn column, final Object cellValue) {
		return DelegatingToEMFLabelProvider.INSTANCE.getText(cellValue);
	}

}
