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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.internal.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.services.labelprovider.service.IFilteredLabelProvider;
import org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototypeLabelProvider;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.Activator;
import org.eclipse.swt.graphics.Image;

/**
 * Label provider for the document template
 */
public class DocumentTemplateLabelProvider extends ViewPrototypeLabelProvider implements IFilteredLabelProvider {

	@Override
	public boolean accept(Object object) {
		if (object instanceof IStructuredSelection) {
			return accept((IStructuredSelection) object);
		}
		return EMFHelper.getEObject(object) instanceof DocumentTemplate;
	}

	/**
	 *
	 * @param selection
	 *            a selection
	 * @return
	 * 		<code>true</code> if all elements in the selection are accepted
	 */
	protected boolean accept(final IStructuredSelection selection) {
		for (final Object current : selection.toList()) {
			if (!accept(current)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.papyrus.infra.viewpoints.policy.ViewPrototypeLabelProvider#getName(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getName(final EObject object) {
		String value = null;
		if (object instanceof DocumentTemplate) {
			value = ((DocumentTemplate) object).getName(); // TODO internationalization to manage here
		}
		return null != value ? value : super.getName(object);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.infra.ui.emf.providers.EMFLabelProvider#getNonCommonIcon(java.lang.Object)
	 *
	 * @param commonObject
	 * @return
	 */
	@Override
	protected Image getNonCommonIcon(final Object commonObject) {
		return org.eclipse.papyrus.infra.widgets.Activator.getDefault().getImage(Activator.PLUGIN_ID, "/icons/PapyrusDocument.gif"); //$NON-NLS-1$
	}



}

