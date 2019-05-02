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

package org.eclipse.papyrus.model2doc.emf.documentstructure.internal.impl;

import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructureFactoryImpl;

/**
 * Custom Factory for {@link DocumentStructureFactoryImpl} metamodel
 */
public class CustomDocumentStructureFactory extends DocumentStructureFactoryImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.DocumentStructureFactoryImpl#createTitle()
	 *
	 * @return
	 */
	@Override
	public Title createTitle() {
		return new CustomTitleImpl();
	}

}
