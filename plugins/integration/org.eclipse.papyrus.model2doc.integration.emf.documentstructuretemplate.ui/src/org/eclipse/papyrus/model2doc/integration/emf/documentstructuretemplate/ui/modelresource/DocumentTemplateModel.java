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

package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.modelresource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.papyrus.infra.core.resource.AbstractModelWithSharedResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;



/**
 * This class manages PapyrusDocument in notation model resource.
 *
 *
 */
public class DocumentTemplateModel extends AbstractModelWithSharedResource<DocumentTemplate> {

	/**
	 * Document Model ID.
	 */
	public static final String DOCUMENT_MODEL_ID = "org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.ui.DocumentTemplate"; //$NON-NLS-1$

	/**
	 * the file extension where document are stored.
	 */
	public static final String DOCUMENT_MODEL_FILE_EXTENSION = "notation";// DocumentStructureTemplateResource.FILE_EXTENSION; // $NON-NLS-1$ //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	public DocumentTemplateModel() {
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
		return object instanceof DocumentTemplate;
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
	public void addDocument(final DocumentTemplate document) {
		final EObject context = document.getSemanticContext();
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
