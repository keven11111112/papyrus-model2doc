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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers.UMLDelegatingToEMFLabelProvider;

/**
 * Operations for the class {@link StereotypePropertyReferenceTableView}
 */
public class StereotypePropertyReferenceTableViewOperations {

	/**
	 *
	 * @param table
	 *            a table view
	 * @param rowElement
	 *            the row element for which we want the header label
	 * @return
	 */
	public static final String buildRowHeaderLabel(final StereotypePropertyReferenceTableView table, final EObject rowElement) {
		return UMLDelegatingToEMFLabelProvider.UML_INSTANCE.getText(rowElement);
	}
}
