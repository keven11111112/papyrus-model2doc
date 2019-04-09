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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;

/**
 * Abstract class for Mappers provided by this plugin
 *
 */
public abstract class AbstractEMFTemplateToStructureMapper<INPUT extends EObject> extends AbstractTemplateToStructureMapper<INPUT> {

	protected static final DocumentStructureTemplatePackage TEMPLATE_EPACKAGE = DocumentStructureTemplatePackage.eINSTANCE;

	protected static final DocumentStructureFactory STRUCTURE_EFACTORY = DocumentStructureFactory.eINSTANCE;

	protected static final DocumentStructurePackage STRUCTURE_EPACKAGE = DocumentStructurePackage.eINSTANCE;

	/**
	 * Constructor.
	 *
	 * @param eClass
	 */
	public AbstractEMFTemplateToStructureMapper(final EClass inputEClass, final Class<?> outputClass) {
		super(inputEClass, outputClass);
		Assert.isTrue(inputEClass.getEPackage() == TEMPLATE_EPACKAGE);
	}

}
