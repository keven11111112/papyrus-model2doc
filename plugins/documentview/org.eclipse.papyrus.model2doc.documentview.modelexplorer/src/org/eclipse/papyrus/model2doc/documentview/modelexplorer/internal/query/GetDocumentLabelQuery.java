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
package org.eclipse.papyrus.model2doc.documentview.modelexplorer.internal.query;

import org.eclipse.papyrus.emf.facet.efacet.core.IFacetManager;
import org.eclipse.papyrus.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.papyrus.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.papyrus.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.papyrus.infra.internationalization.utils.utils.LabelInternationalizationPreferencesUtils;
import org.eclipse.papyrus.infra.internationalization.utils.utils.LabelInternationalizationUtils;

import org.eclipse.papyrus.model2doc.documentview.Document;
import org.eclipse.papyrus.model2doc.documentview.provider.DocumentViewEditPlugin;

/**
 * Query to retrieve the label of the corresponding document.
 * 
 */
public class GetDocumentLabelQuery implements IJavaQuery2<Document, String> {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String evaluate(final Document context, final IParameterValueList2 parameterValues, final IFacetManager facetManager) throws DerivedTypedElementException {
		String label = context.getName();
		
		if (null != context.eResource() && LabelInternationalizationPreferencesUtils.getInternationalizationPreference(context)) {
			label = LabelInternationalizationUtils.getLabelWithoutSubstract(context, true);
			label = null != label ? label : context.getName();
		}
		return label == null || label.length() == 0 ? DocumentViewEditPlugin.INSTANCE.getString("_UI_Document_type") : label; //$NON-NLS-1$
	}
}
