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

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers.UMLDelegatingToEMFLabelProvider;

/**
 * Operations for {@link StereotypePropertyColumn}
 */
public class StereotypePropertyColumnOperations {

	/**
	 *
	 * @param stereotypePropertyColumn
	 *            a stereotype property column
	 * @param cellElement
	 *            a cell element
	 * @return
	 *         the label for the cell element
	 */
	public static final String buildCellLabel(final StereotypePropertyColumn stereotypePropertyColumn, final Object cellElement) {
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(cellElement);
	}

	/**
	 *
	 * @param stereotypePropertyColumn
	 *            a stereotype property column
	 * @return
	 *         the label to use for the column
	 */
	public static final String buildColumnHeaderLabel(final StereotypePropertyColumn stereotypePropertyColumn) {
		final String customColumnTitle = stereotypePropertyColumn.getCustomColumnTitle();
		if (null != customColumnTitle && false == customColumnTitle.isEmpty()) {
			return customColumnTitle;
		}
		return stereotypePropertyColumn.getPropertyName();
	}
}
