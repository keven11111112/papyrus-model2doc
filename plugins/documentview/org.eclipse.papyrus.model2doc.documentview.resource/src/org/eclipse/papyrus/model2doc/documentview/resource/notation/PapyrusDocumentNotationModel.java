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
package org.eclipse.papyrus.model2doc.documentview.resource.notation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.resource.AbstractModelWithSharedResource;

import org.eclipse.papyrus.model2doc.documentview.Document;

/**
 * This class manages PapyrusDocument in notation model resource. 
 *
 * @since 2.0
 */
public class PapyrusDocumentNotationModel extends AbstractModelWithSharedResource<Document>{
	
	/**
	 * Document Model ID.
	 */
	public static final String DOCUMENT_MODEL_ID = "org.eclipse.papyrus.model2doc.documentview.resource.notation.DocumentModel"; //$NON-NLS-1$

	/**
	 * the file extension where document are stored.
	 */
	public static final String DOCUMENT_MODEL_FILE_EXTENSION = "notation"; //$NON-NLS-1$
	
	public PapyrusDocumentNotationModel() {
		super();
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.resource.AbstractModelWithSharedResource#isModelRoot(org.eclipse.emf.ecore.EObject)
	 *
	 * @param object
	 * @return
	 */
	@Override
	protected boolean isModelRoot(EObject object) {
		return object instanceof Document;
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.resource.AbstractBaseModel#getModelFileExtension()
	 *
	 * @return
	 */
	@Override
	protected String getModelFileExtension() {
		return DOCUMENT_MODEL_FILE_EXTENSION;
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.resource.AbstractModel#getIdentifier()
	 *
	 * @return
	 */
	@Override
	public String getIdentifier() {
		return DOCUMENT_MODEL_ID;
	}

	/**
	 * Add a new initialized document to the notation model.
	 * 
	 * @param document
	 */
	public void addDocument(Document document) {
		EObject context = document.getContext();
		if (context != null) { // we check the resource for control mode feature
			Resource targetResource;
			Resource contextResource = context.eResource();
			if (!contextResource.getURI().trimFileExtension().equals(getResource().getURI().trimFileExtension())) {
				URI uri = contextResource.getURI();
				uri = uri.trimFileExtension();
				uri = uri.appendFileExtension(getModelFileExtension());
				ResourceSet set = contextResource.getResourceSet();
				targetResource = set.getResource(uri, true);
			} else {
				targetResource = getResource();
			}
			if (targetResource != null) {
				targetResource.getContents().add(document);
			}
		}
		
	}

}
