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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.utils.PapyrusTableUtils;

/**
 * Content Provider for Papyrus Diagram
 */
public class PapyrusTableContentProvider implements ITreeContentProvider {

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 *
	 * @param inputElement
	 * @return
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			final List<Object> values = new ArrayList<>();
			values.add(PapyrusTableUtils.UNDEFINED);
			values.addAll((Collection<?>) inputElement);
			return values.toArray();
		}
		return new Object[0];
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 *
	 * @param parentElement
	 * @return
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		return new Object[0];
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public Object getParent(Object element) {
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public boolean hasChildren(Object element) {
		return false;
	}

}
