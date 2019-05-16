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
}
