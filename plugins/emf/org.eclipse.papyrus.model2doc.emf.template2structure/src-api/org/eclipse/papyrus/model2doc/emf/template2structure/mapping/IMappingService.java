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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.mapping;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Interface for MappingService
 */
public interface IMappingService {

	/**
	 * @param documentTemplateElement
	 * @param semanticModelElement
	 * @param expectedReturnedEClass
	 * @param mappingServic
	 * @return
	 * 		a collection of EObject created by this mapping
	 */
	public Collection<EObject> map(final EObject documentTemplateElement, final EObject semanticModelElement, final EClass expectedReturnedEClass);
}
