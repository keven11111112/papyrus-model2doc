/**
 * Copyright (c) 2019 CEA LIST.
 * 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */

package org.eclipse.papyrus.model2doc.documentstructuretemplate.resource;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.validation.EValidatorAdapter;

public class DocumentStructureTemplateResourceFactory implements Factory {

	/**
	 * boolean indicating if the custom validation for this metamodel has already been registered
	 */
	private static boolean hasRegisteredValidator = false;

	public DocumentStructureTemplateResourceFactory() {
		// we register the validation for DocumentStructureTemplate during the first call of the resource factory
		if (false == hasRegisteredValidator) {
			hasRegisteredValidator = true;
			EValidator.Registry.INSTANCE.put(DocumentStructureTemplatePackage.eINSTANCE, new EValidatorAdapter());
		}
	}

	/**
	 * 
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory#createResource(org.eclipse.emf.common.util.URI)
	 *
	 * @param uri
	 * @return
	 */
	@Override
	public Resource createResource(final URI uri) {
		return new DocumentStructureTemplateResource(uri);
	}

}
