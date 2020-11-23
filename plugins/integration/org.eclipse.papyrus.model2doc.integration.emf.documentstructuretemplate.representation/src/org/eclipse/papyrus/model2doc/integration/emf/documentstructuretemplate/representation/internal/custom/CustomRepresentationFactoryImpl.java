/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
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

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.internal.custom;

import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.RepresentationFactoryImpl;

/**
 * Custom factory for to manipulate the representation model
 */
public class CustomRepresentationFactoryImpl extends RepresentationFactoryImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.RepresentationFactoryImpl#createPapyrusDocumentPrototype()
	 *
	 * @return
	 */
	@Override
	public PapyrusDocumentPrototype createPapyrusDocumentPrototype() {
		return new CustomPapyrusDocumentPrototypeImpl();
	}

}
