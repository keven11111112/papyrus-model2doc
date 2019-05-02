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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl;

/**
 * Custom {@link Title} implementation
 */
public class CustomTitleImpl extends TitleImpl {

	private static final int DEFAULT_LEVEL = 1;

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.impl.TitleImpl#getLevel()
	 *
	 * @return
	 */
	@Override
	public int getLevel() {
		int level = DEFAULT_LEVEL;
		EObject container = eContainer();
		while (container != null) {
			if (container instanceof Title) {
				level++;
			}
			container = container.eContainer();
		}
		return level;
	}
}
