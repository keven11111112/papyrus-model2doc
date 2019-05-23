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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.providers;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

/**
 * This contents provider allows to navigate until to find EAttribute (and inherited EAttribute) owned by EClass
 * Others kind of elements are not displayed
 */
public class EAttributeTreeContentProvider extends EClassTreeContentProvider {

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 *
	 * @param parentElement
	 * @return
	 */
	@Override
	public Object[] getChildren(final Object parentElement) {
		if (parentElement instanceof EClass) {
			return ((EClass) parentElement).getEAllAttributes().toArray();
		}
		return super.getChildren(parentElement);
	}


	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public boolean hasChildren(final Object element) {
		if (element instanceof EPackage) {
			return hasEAttributeInHierarchy((EPackage) element);
		}
		if (element instanceof EClass) {
			return hasEAttributeInHierarchy((EClass) element);
		}
		return super.hasChildren(element);
	}

	/**
	 *
	 * @param eClass
	 * @return
	 *         <code>true</code> if the EClass contains EReference
	 */
	protected final boolean hasEAttributeInHierarchy(final EClass eClass) {
		return eClass.getEAllReferences().size() > 0;
	}

	/**
	 *
	 * @param ePackage
	 * @return
	 *         <code>true</code> if the EPackage contains EClass containing EReference
	 */
	protected final boolean hasEAttributeInHierarchy(final EPackage ePackage) {
		final Iterator<EClassifier> eClassIter = ePackage.getEClassifiers().iterator();
		boolean isValidValue = false;
		while (eClassIter.hasNext() && false == isValidValue) {
			final EClassifier tmp = eClassIter.next();
			isValidValue = isValidValue(tmp);
		}

		final Iterator<EPackage> packIter = ePackage.getESubpackages().iterator();
		while (packIter.hasNext() && false == isValidValue) {
			isValidValue = isValidValue(packIter.next());
		}
		return isValidValue;
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2²doc.emf.documentstructuretemplate.edit.providers.EClassTreeContentProvider#isValidValue(java.lang.Object)
	 *
	 * @param object
	 * @return
	 */
	@Override
	public boolean isValidValue(final Object object) {
		if (object instanceof EAttribute) {
			return true;
		}
		if (object instanceof EClass) {
			return hasEAttributeInHierarchy((EClass) object);
		}
		if (object instanceof EPackage) {
			return hasEAttributeInHierarchy((EPackage) object);
		}
		return super.isValidValue(object);

	}
}
