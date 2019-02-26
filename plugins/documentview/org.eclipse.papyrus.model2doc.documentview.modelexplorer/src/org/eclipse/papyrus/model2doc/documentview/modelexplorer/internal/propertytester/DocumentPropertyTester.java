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
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.propertytester;

import java.util.Iterator;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * This class provides tests for verifying if handlers should be active or not.
 *
 * Sometimes these test can be done directly in the plugin.xml in the activeWhen (with instanceof, adapt, ...),
 * but in this case, Eclipse doesn't refresh correctly the status of the command in the menu Edit or in other menu.
 *
 */
public class DocumentPropertyTester extends PropertyTester {
	
	/** 
	 * Poperty to test if the selected element is a document. 
	 */
	public static final String IS_DOCUMENT = "isDocument"; //$NON-NLS-1$

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (IS_DOCUMENT.equals(property) && receiver instanceof IStructuredSelection) {
			boolean answer = isDocument((IStructuredSelection) receiver);
			return Boolean.valueOf(answer).equals(expectedValue);
		}
		return false;
	}

	/**
	 * Test if the selection is composed only by {@link Document}.
	 *
	 * @param selection
	 * @return
	 *         <code>true</code> if the selection is composed only by {@link Document}
	 *
	 */
	private boolean isDocument(IStructuredSelection selection) {
		if (!selection.isEmpty()) {
			Iterator<?> iterator = selection.iterator();
			while (iterator.hasNext()) {
				final Object next = iterator.next();
				// Get the document object (Facet Element) by IAdaptable mechanism
				EObject object = EMFHelper.getEObject(next);
				if (!(object instanceof Document)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
