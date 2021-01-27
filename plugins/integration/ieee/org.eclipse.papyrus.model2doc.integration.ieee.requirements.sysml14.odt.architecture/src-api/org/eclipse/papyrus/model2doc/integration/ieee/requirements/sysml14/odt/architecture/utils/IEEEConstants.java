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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.utils;

/**
 * Constants declared for IEEE SysML 1.4 ODT Architecture
 */
public final class IEEEConstants {

	private IEEEConstants() {
		// to prevent instantiation
	}

	/**
	 * the declared type for the template prototype
	 */
	public static final String IEEE_ODT_SYSML_14_TEMPLATE_TYPE = "IEEE_For_Sysml14_ODT_DocumentStructureTemplateType"; //$NON-NLS-1$

	/**
	 * the id of the Eclipse command allowing to create the UML Package structure required for the provided documentation template
	 */
	public static final String CREATE_IEEE_STRUCTURE_COMMAND_ID = "org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.createIEEEStructureForSysML14"; //$NON-NLS-1$
}
