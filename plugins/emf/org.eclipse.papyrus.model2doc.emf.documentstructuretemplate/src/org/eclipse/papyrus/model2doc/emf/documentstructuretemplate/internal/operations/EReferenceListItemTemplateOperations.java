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
 * 	 Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.operations;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceListItemTemplate;

/**
 * This class provides the operations for {@link EReferenceListItemTemplate}
 */
public class EReferenceListItemTemplateOperations {

	/**
	 * @param eReferenceListItemTemplate
	 * @param item
	 * @return
	 */
	public static String buildItemLabel(final EReferenceListItemTemplate eReferenceListItemTemplate, final Object item) {
		final String customLabel = eReferenceListItemTemplate.getCustomItemLabel();
		if (null != customLabel && false == customLabel.isEmpty()) {
			return customLabel;
		}
		final EReference eReference = eReferenceListItemTemplate.getEReference();
		if (null != eReference) {
			return eReference.getName();
		}
		return "No EReference"; //$NON-NLS-1$
	}

	/**
	 * @param eReferenceListItemTemplate
	 * @param context
	 * @return
	 */
	public static EList<Object> getItems(final EReferenceListItemTemplate eReferenceListItemTemplate, final EObject context) {
		return ECollections.unmodifiableEList(eReferenceListItemTemplate.getEReferenceValues(context));
	}

}
