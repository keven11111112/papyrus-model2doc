/*****************************************************************************
 * Copyright (c) 2010, 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Camille Letavernier (CEA LIST) camille.letavernier@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - adapter for Model2Doc
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.providers;

import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * Interface duplicated to avoid dependency between Papyrus and Papyrus-Model2Doc
 *
 * A Hierarchic content provider. In some cases, we want to be able to display
 * elements as a Tree, but we are only interested in some specific elements.
 * The other ones are displayed only to show the hierarchy.
 * This interface allows the user to specify which elements he is interested
 * in.
 *
 * @author Camille Letavernier
 *
 */
public interface IHierarchicContentProvider extends ITreeContentProvider {

	/**
	 * Indicates if the given is a valid value. Only valid values can be
	 * chosen.
	 *
	 * @param element
	 *            The element to test
	 * @return
	 *         True if the element is a valid value
	 */
	public boolean isValidValue(Object element);
}
