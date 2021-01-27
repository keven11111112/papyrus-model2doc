/*****************************************************************************
 * Copyright (c) 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.internal.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.ArchitectureDescriptionUtils;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureContext;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.uml2.uml.Package;

/**
 * Property tester used to check if we are in a SysML 1.4 environement
 */
public class PropertyTester extends org.eclipse.core.expressions.PropertyTester {

	/**
	 * Property used to check in which Architecture Framework we are
	 */
	private static final String IS_SYSML_14_AF = "isInsideSysML14AF"; //$NON-NLS-1$

	/**
	 * TODO : this constant is not defined in SysML 1.4
	 */
	private static final String SYSML14_ARCHITECTURE_CONTEXT_ID = "org.eclipse.papyrus.sysml.architecture.SysML14"; //$NON-NLS-1$


	public PropertyTester() {
		// nothing to do
	}

	/**
	 *
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object, java.lang.String, java.lang.Object[], java.lang.Object)
	 *
	 * @param receiver
	 * @param property
	 * @param args
	 * @param expectedValue
	 * @return
	 */
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (IS_SYSML_14_AF.equals(property) && receiver instanceof Package) {
			ArchitectureDescriptionUtils utils = new ArchitectureDescriptionUtils((ModelSet) ((EObject) receiver).eResource().getResourceSet());
			final MergedArchitectureContext architectureContext = utils.getArchitectureContext();
			return SYSML14_ARCHITECTURE_CONTEXT_ID.equals(architectureContext.getId());
		}
		return false;
	}

}
