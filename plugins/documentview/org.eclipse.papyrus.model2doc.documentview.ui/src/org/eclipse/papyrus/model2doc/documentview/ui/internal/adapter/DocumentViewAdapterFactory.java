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
package org.eclipse.papyrus.model2doc.documentview.ui.internal.adapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.IOpenable;
import org.eclipse.papyrus.infra.core.sasheditor.di.contentprovider.IOpenableWithContainer;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * Adapter factory converting Document to IOpenable.
 * 
 */
public class DocumentViewAdapterFactory implements IAdapterFactory {

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IOpenable.class) {
			if (adaptableObject instanceof Document) {
				Document document = (Document) adaptableObject;
				return new IOpenableWithContainer.Openable(adaptableObject, document.getContext());
			}
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[] { IOpenable.class };
	}

}
