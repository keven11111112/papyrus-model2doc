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

package org.eclipse.papyrus.model2doc.integration.ieee.requirements.utils;

/**
 * Constants relative to the IEEE Profile
 */
public class IEEERequirementsConstants {

	private IEEERequirementsConstants() {
		// to prevent instantiation
	}

	public static final String IEEE_PROFILE_NAME = "IEEERequirementsDocumentation"; //$NON-NLS-1$

	public static final String IEEE_PROFILE_URI = "pathmap://IEEERequirementsDocumentation/IEEERequirementsDocumentation.profile.uml"; //$NON-NLS-1$

	public static final String IEEE_REQUIREMENTS_STEREOTYPE = "IEEERequirements"; //$NON-NLS-1$

	public static final String IEEE_FUNCTIONAL_REQUIREMENTS_STEREOTYPE = "IEEEFunctionalRequirements"; //$NON-NLS-1$
	/*
	 * the name of all packages structuring an IEEE Requirements models
	 */
	public static final String INTERFACES_ROOT_PACKAGE = "InterfacesRequirements"; //$NON-NLS-1$

	public static final String EXTERNAl_INTERFACES_PACKAGE = "ExternalInterfacesRequirements"; //$NON-NLS-1$

	public static final String USER_INTERFACES_PACKAGE = "UserInterfacesRequirements"; //$NON-NLS-1$

	public static final String HW_INTERFACES_PACKAGE = "HWInterfacesRequirements"; //$NON-NLS-1$

	public static final String COMMUNICATION_INTERFACES_PACKAGE = "CommunicationInterfacesRequirements"; //$NON-NLS-1$

	public static final String SW_INTERFACES_PACKAGE = "SWInterfacesRequirements"; //$NON-NLS-1$

	public static final String FUNCTIONAL_REQUIREMENTS_ROOT_PACKAGE = "FunctionalRequirements"; //$NON-NLS-1$

	public static final String FUNCTIONAL_REQUIREMENTS_MODE_1 = "FunctionalRequirements_Mode_1"; //$NON-NLS-1$

	public static final String FUNCTIONAL_REQUIREMENTS_MODE_2 = "FunctionalRequirements_Mode_2"; //$NON-NLS-1$

	public static final String FUNCTIONAL_REQUIREMENTS_MODE_3 = "FunctionalRequirements_Mode_3"; //$NON-NLS-1$

	public static final String PERFORMANCE_REQUIREMENTS_PACKAGE = "PerformanceRequirements"; //$NON-NLS-1$

	public static final String DESIGN_CONSTRAINTS_REQUIREMENTS_PACKAGE = "DesignConstraintsRequirements"; //$NON-NLS-1$

	public static final String SOFTWARE_SYSTEM_ATTRIBUTE_REQUIREMENTS_PACKAGE = "SoftwareSystemAttributeRequirements"; //$NON-NLS-1$

	public static final String OTHER_REQUIREMENTS_PACKAGE = "OtherRequirements"; //$NON-NLS-1$
}
