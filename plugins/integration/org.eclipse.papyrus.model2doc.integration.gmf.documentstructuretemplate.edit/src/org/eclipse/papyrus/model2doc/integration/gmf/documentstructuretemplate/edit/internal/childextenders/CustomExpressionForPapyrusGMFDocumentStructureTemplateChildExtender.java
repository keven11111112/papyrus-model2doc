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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.childextenders;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.childextenders.CustomExpressionChildCreationExtender;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.PapyrusGMFDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.provider.PapyrusGMFDocumentStructureTemplateEditPlugin;


/**
 * This child extender is used to be able to get UML Expression command creation.
 * Without this class, we only get EMF Expression
 */
public class CustomExpressionForPapyrusGMFDocumentStructureTemplateChildExtender extends CustomExpressionChildCreationExtender {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.childextenders.CustomExpressionChildCreationExtender#getResourceLocator()
	 *
	 * @return
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PapyrusGMFDocumentStructureTemplateEditPlugin.INSTANCE;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.childextenders.CustomExpressionChildCreationExtender#getManagedEPackage()
	 *
	 * @return
	 */
	@Override
	protected EPackage getManagedEPackage() {
		return PapyrusGMFDocumentStructureTemplatePackage.eINSTANCE;
	}
}
