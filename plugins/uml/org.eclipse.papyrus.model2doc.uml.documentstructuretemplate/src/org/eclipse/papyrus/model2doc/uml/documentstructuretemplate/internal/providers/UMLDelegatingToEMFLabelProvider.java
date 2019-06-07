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

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.providers;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * UML Extension to ease future override
 */
public class UMLDelegatingToEMFLabelProvider extends DelegatingToEMFLabelProvider {

	/**
	 * Stereotype marker <<
	 */
	private static final String ST_LEFT = String.valueOf("\u00AB");//$NON-NLS-1$

	/**
	 * Stereotype marker >>
	 */
	private static final String ST_RIGHT = String.valueOf("\u00BB"); //$NON-NLS-1$

	/**
	 * Singleton of this label provider class
	 */
	public static final UMLDelegatingToEMFLabelProvider UML_INSTANCE = new UMLDelegatingToEMFLabelProvider();

	/**
	 *
	 * Constructor.
	 *
	 */
	protected UMLDelegatingToEMFLabelProvider() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider#getText(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public String getText(final Object element) {
		String label = super.getText(element);
		label = removeStereotypeFromLabel(label);
		return label;
	}

	/**
	 *
	 * @param label
	 *            a label
	 * @return
	 *         the label without the stereotypes
	 */
	private String removeStereotypeFromLabel(final String label) {
		String newLabel = label;
		if (null != label && removeStereotypeFromLabel()) {
			// the uml label provider doesn't use ST_LEFT and ST_RIGHT ("\u00AB" and "\u00BB");
			newLabel = label.replaceAll("<<.*>> ", ""); //$NON-NLS-1$
		}
		return newLabel;
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if the stereotype name must be remove from the label
	 */
	protected boolean removeStereotypeFromLabel() {
		return true;
	}
}
