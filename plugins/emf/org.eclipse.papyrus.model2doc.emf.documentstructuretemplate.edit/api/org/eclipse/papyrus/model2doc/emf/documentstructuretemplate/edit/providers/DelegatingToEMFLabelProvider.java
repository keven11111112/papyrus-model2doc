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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.providers;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * This label provider delegated the text and the image calculus to the Ecore IItemLabelProvider of the EObject when we found it.
 */
public class DelegatingToEMFLabelProvider implements ILabelProvider {

	/**
	 * the separator between field of the label
	 */
	protected static final String FIELD_LABEL_SEPARATOR = " - "; //$NON-NLS-1$

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 *
	 * @param listener
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		// useless
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 *
	 */
	@Override
	public void dispose() {
		// useless
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
		// useless
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
	public String getText(final Object element) {
		if (element instanceof String) {
			return (String) element;
		}
		if (element instanceof EObject) {
			final EObject eobject = (EObject) element;
			final IItemLabelProvider subProvider = getSubLabelProvider(eobject);
			if (null != subProvider) {
				return subProvider.getText(eobject);
			}
		}

		return ""; //$NON-NLS-1$
	}

	/**
	 *
	 * @param eobject
	 *            an eobejct
	 * @return
	 *         the IITemLabelProvider declared for this EObject
	 */
	protected final IItemLabelProvider getSubLabelProvider(final EObject eobject) {
		final Registry registry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
		final Collection<Object> types = new ArrayList<>();
		types.add(eobject.eClass().getEPackage());
		types.add(IItemLabelProvider.class);
		final Descriptor descriptor = registry.getDescriptor(types);
		final AdapterFactory adapterFactory = descriptor.createAdapterFactory();
		final Adapter adapt = adapterFactory.adapt(eobject, IItemLabelProvider.class);
		if (adapt instanceof IItemLabelProvider) {
			return (IItemLabelProvider) adapt;
		}
		return null;
	}

}
