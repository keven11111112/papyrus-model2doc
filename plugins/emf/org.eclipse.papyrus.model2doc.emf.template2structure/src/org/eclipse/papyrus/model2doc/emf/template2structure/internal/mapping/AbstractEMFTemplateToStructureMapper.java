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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper;

/**
 *
 *
 */
public abstract class AbstractEMFTemplateToStructureMapper<INPUT extends EObject, OUTPUT extends EObject> extends AbtractTemplateToStructureMapper<INPUT, OUTPUT> {

	protected static final DocumentStructureTemplateFactory TEMPLATE_EFACTORY = DocumentStructureTemplateFactory.eINSTANCE;

	protected static final DocumentStructureTemplatePackage TEMPLATE_EPACKAGE = DocumentStructureTemplatePackage.eINSTANCE;

	protected static final DocumentStructureFactory STRUCTURE_EFACTORY = DocumentStructureFactory.eINSTANCE;

	protected static final DocumentStructurePackage STRUCTURE_EPACKAGE = DocumentStructurePackage.eINSTANCE;

	/**
	 * Constructor.
	 *
	 * @param eClass
	 */
	public AbstractEMFTemplateToStructureMapper(final EClass inputEClass, final EClass outputEClass) {
		super(inputEClass, outputEClass);
		Assert.isTrue(inputEClass.getEPackage() == TEMPLATE_EPACKAGE);
	}

}
