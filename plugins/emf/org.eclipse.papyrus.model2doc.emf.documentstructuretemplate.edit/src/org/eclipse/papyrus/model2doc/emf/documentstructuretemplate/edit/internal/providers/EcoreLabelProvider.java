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

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.messages.Messages;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * A label provider used to display Ecore name
 */
public class EcoreLabelProvider extends DelegatingToEMFLabelProvider {

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 *
	 * @param listener
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		// nothing to do
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 *
	 */
	@Override
	public void dispose() {
		// nothing to do
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 *
	 * @param element
	 * @param property
	 * @return
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		// nothing to do
		return false;
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 *
	 * @param listener
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		// nothing to do
	}

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public Image getImage(Object element) {
		if (element instanceof EObject) {
			final IItemLabelProvider lp = getSubLabelProvider((EObject) element);
			if (null != lp) {
				Object im = lp.getImage(element);
				im = ExtendedImageRegistry.INSTANCE.getImage(im);
				if (im instanceof Image) {
					return (Image) im;
				}
			}
		}
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 *
	 * @param element
	 * @return
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof EPackage) {
			final EPackage pack = (EPackage) element;
			final StringBuilder builder = new StringBuilder();
			builder.append(pack.getName());
			builder.append(FIELD_LABEL_SEPARATOR);
			builder.append(pack.getNsURI());
			return builder.toString();
		}
		if (element instanceof EStructuralFeature) {
			return NLS.bind(Messages.EcoreLabelProvider_FeatureOrigin, ((EStructuralFeature) element).getName(), ((EStructuralFeature) element).getEContainingClass().getName());
		}
		if (element instanceof ENamedElement) {
			return ((ENamedElement) element).getName();
		}
		return ""; //$NON-NLS-1$
	}

}
