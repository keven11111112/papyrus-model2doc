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

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.internal.operations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleOperations;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView;


/**
 * This class provides the operation for title calculus of elements for the PapyrusNattableDocumentStructureTemplate metamodel
 */
public class PapyrusNattableBodySectionPartTemplateTitleOperations extends BodySectionPartTemplateTitleOperations {

	/**
	 * Singleton of this class
	 */
	public static final PapyrusNattableBodySectionPartTemplateTitleOperations PAPYRUS_NATTABLE_INSTANCE = new PapyrusNattableBodySectionPartTemplateTitleOperations();

	/**
	 *
	 * Constructor.
	 * protected to allow to extend this class if required
	 */
	protected PapyrusNattableBodySectionPartTemplateTitleOperations() {
		// nothing to do
	}


	public String buildPartTemplateTitle(final PapyrusTableView tableView, final EObject tableContext) {
		final String customTitle = tableView.getCustomTitle();
		if (null != customTitle && false == customTitle.isEmpty()) {
			return customTitle;
		}
		final String tableKindId = tableView.getTableKindId();
		final String tableType = tableView.getTableType();
		if (hasTableKindId(tableView) && false == hasTableType(tableView)) {
			return NLS.bind("{0} tables", tableKindId); //$NON-NLS-1$
		} else if (hasTableType(tableView) && false == hasTableKindId(tableView)) {
			return NLS.bind("{0} tables", tableType); //$NON-NLS-1$
		} else if (hasTableKindId(tableView) && hasTableType(tableView)) {
			return NLS.bind("Tables of type {0} and kind {1}", tableType, tableKindId); //$NON-NLS-1$
		}
		return "All owned tables"; //$NON-NLS-1$
	}

	/**
	 * @param tableView
	 *            a table view
	 * @return
	 *         <code>true</code> if a tableKindId is defined
	 */
	private static final boolean hasTableKindId(final PapyrusTableView tableView) {
		final String tableKindId = tableView.getTableKindId();
		return null != tableKindId && false == tableKindId.isEmpty();
	}

	/**
	 * @param tableView
	 *            a table view
	 *
	 * @return
	 *         <code>true</code> if a tableType is defined
	 */
	private static final boolean hasTableType(final PapyrusTableView tableView) {
		final String diagramKindId = tableView.getTableKindId();
		return null != diagramKindId && false == diagramKindId.isEmpty();
	}
}
