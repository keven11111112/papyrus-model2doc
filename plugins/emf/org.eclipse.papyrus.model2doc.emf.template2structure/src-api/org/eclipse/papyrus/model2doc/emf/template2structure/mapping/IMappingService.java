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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for MappingService
 */
public interface IMappingService {

	/**
	 * @param <T>
	 *            the return type of the list
	 * @param documentTemplateElement
	 *            a documentTemplateElement for which we want make a mapping
	 * @param semanticModelElement
	 *            an element of the user model
	 * @param expectedReturnedClass
	 *            the return type of the mapping method
	 * @return
	 * 		a collection of EObject created by this mapping
	 */
	public <T> List<T> map(final EObject documentTemplateElement, final EObject semanticModelElement, final Class<T> expectedReturnedClass);
}
