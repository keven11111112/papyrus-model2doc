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

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.internal.impl;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations.BodySectionPartTemplateTitleHelper;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * Custom implementation for {@link EReferenceTableView}
 */
public class CustomEReferenceTableViewImpl extends EReferenceTableViewImpl {

	/**
	 * unique title helper for all instance of {@link EReferenceTableViewImpl}
	 */
	private static final BodySectionPartTemplateTitleHelper TITLE_HELPER = new BodySectionPartTemplateTitleHelper();


	/**
	 * The label provider used to build the label
	 */
	private static final ILabelProvider LABEL_PROVIDER = new DelegatingToEMFLabelProvider();

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#buildTitle()
	 *
	 * @return
	 */
	@Override
	public String buildTitle() {
		return TITLE_HELPER.buildTitle(this);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#getRows(org.eclipse.emf.ecore.EObject)
	 *
	 * @param context
	 * @return
	 */
	@Override
	public EList<EObject> getRows(EObject context) {
		if (null == this.eReference || false == context.eClass().getEAllReferences().contains(this.eReference)) {
			return ECollections.emptyEList();
		}
		final java.util.List<EObject> values = new java.util.ArrayList<>();
		final Object value = context.eGet(this.eReference);
		if (value instanceof Collection<?>) {
			// cast values
			values.addAll(((Collection<?>) value).stream().map(EObject.class::cast).collect(Collectors.toList()));
		} else {
			values.add((EObject) value);
		}

		return ECollections.asEList(values);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.EReferenceTableViewImpl#buildRowHeaderLabel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param rowElement
	 * @return
	 */
	@Override
	public String buildRowHeaderLabel(final EObject rowElement) {
		return LABEL_PROVIDER.getText(rowElement);
	}


}
