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

package org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * abstract class for UML mapping element
 *
 */
public abstract class AbstractUMLTemplateToStructureMapper<INPUT extends EObject> extends AbstractTemplateToStructureMapper<INPUT> {

	protected static final UMLDocumentStructureTemplatePackage TEMPLATE_EPACKAGE = UMLDocumentStructureTemplatePackage.eINSTANCE;

	protected static final DocumentStructureFactory STRUCTURE_EFACTORY = DocumentStructureFactory.eINSTANCE;

	protected static final DocumentStructurePackage STRUCTURE_EPACKAGE = DocumentStructurePackage.eINSTANCE;

	/**
	 * Constructor.
	 *
	 * @param eClass
	 */
	public <T> AbstractUMLTemplateToStructureMapper(final EClass inputEClass, final Class<T> outputClass) {
		super(inputEClass, outputClass);
		Assert.isTrue(inputEClass.getEPackage() == TEMPLATE_EPACKAGE);
	}

}
