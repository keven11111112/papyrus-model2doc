/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.internal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl;

/**
 * Custom implementation for {@link PapyrusTableView}
 */
public class CustomPapyrusTableViewImpl extends PapyrusTableViewImpl {

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.impl.PapyrusTableViewImpl#getMatchingTables(org.eclipse.emf.ecore.EObject)
	 *
	 * @param expectedTableContext
	 * @return
	 */
	@Override
	public EList<Table> getMatchingTables(final EObject expectedTableContext) {
		final List<Table> filteredTables = new ArrayList<>();
		ECrossReferenceAdapter crossRef = ECrossReferenceAdapter.getCrossReferenceAdapter(expectedTableContext);
		final Collection<Setting> crossReference = crossRef.getNonNavigableInverseReferences(expectedTableContext, true);
		for (final Setting set : crossReference) {
			final EObject eobject = set.getEObject();
			switch (this.contextFilterRule) {
			case SEMANTIC_CONTEXT:
				if (false == isSemanticContext(eobject, expectedTableContext)) {
					continue;
				}
				break;

			case GRAPHICAL_CONTEXT:
				if (false == isGraphicalContext(eobject, expectedTableContext)) {
					continue;
				}
				break;

			case BOTH:
				if (false == (isSemanticContext(eobject, expectedTableContext) || isGraphicalContext(eobject, expectedTableContext))) {
					continue;
				}
				break;
			default:
				// nothing to do
			}

			final Table table;
			if (eobject instanceof Table) {
				table = (Table) eobject;
			} else {
				// not possible
				continue;
			}

			// we take all tables when tableType and table kind are not defined
			// otherwise, we check
			if (false == filteredTables.contains(table) && matchTableKind(table) && matchTableType(table)) {
				filteredTables.add(table);
			}
		}

		return ECollections.unmodifiableEList(filteredTables);

	}

	/**
	 *
	 * @param eobjec
	 *            an eobject, probably a {@link Table}
	 * @param expectedSemanticContext
	 *            the eobject for which we are looking a {@link Table}
	 * @return
	 *         <code>true</code> if the eobject is used as semantic context for the table
	 */
	private boolean isSemanticContext(final EObject eobject, final EObject expectedSemanticContext) {
		if (eobject instanceof Table) {
			return expectedSemanticContext == ((Table) eobject).getContext();
		}
		return false;
	}

	/**
	 *
	 * @param eobject
	 *            an eobject, probably a {@link Table}
	 * @param expectedDiagramContext
	 *            the eobject for which we are looking a {@link Table}
	 * @return
	 *         <code>true</code> if eobject is used as graphical owner for the table
	 */
	private boolean isGraphicalContext(final EObject eobject, final EObject expectedGraphicalContext) {
		if (eobject instanceof Table) {
			return expectedGraphicalContext.equals(((Table) eobject).getOwner());
		}
		return false;
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         <code>true</code> when:
	 *         <ul>
	 *         <li>the field tableType is not defined (<code>null</code> or empty)</li>
	 *         <li>the type of the table is equals to the expected one</li>
	 *         </ul>
	 */
	private boolean matchTableType(final Table table) {
		return this.tableType == null || this.tableType.isEmpty() || this.tableType.equals(table.getTableConfiguration().getType());
	}

	/**
	 *
	 * @param table
	 *            a table
	 * @return
	 *         <code>true</code> when the table has:
	 *         <ul>
	 *         <li>the field tableKindId is <code>null</code> or empty</li>
	 *         <li>the kind of the table is equals to the expected one</li>
	 *         </ul>
	 */
	private boolean matchTableKind(final Table table) {
		return this.tableKindId == null || this.tableKindId.isEmpty() || this.tableKindId.equals(table.getTableKindId());
	}


	/**
	 * @see org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.impl.PapyrusGMFDiagramViewImpl#buildPartTemplateTitle()
	 *
	 * @return
	 */
	@Override
	public String buildPartTemplateTitle(final EObject tableContext) {
		if (hasTableKindId() && false == hasTableType()) {
			return NLS.bind("{0} tables", this.tableKindId); //$NON-NLS-1$
		} else if (hasTableType() && false == hasTableKindId()) {
			return NLS.bind("{0} tables", this.hasTableType()); //$NON-NLS-1$
		} else if (hasTableKindId() && hasTableType()) {
			return NLS.bind("Tables of type {0} and kind {1}", this.tableType, this.tableKindId); //$NON-NLS-1$
		}
		return "All owned tables"; //$NON-NLS-1$
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if a tableKindId is defined
	 */
	private boolean hasTableKindId() {
		return null != this.tableKindId && false == this.tableKindId.isEmpty();
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if a tableType is defined
	 */
	private boolean hasTableType() {
		return null != this.tableType && false == this.tableType.isEmpty();
	}

}