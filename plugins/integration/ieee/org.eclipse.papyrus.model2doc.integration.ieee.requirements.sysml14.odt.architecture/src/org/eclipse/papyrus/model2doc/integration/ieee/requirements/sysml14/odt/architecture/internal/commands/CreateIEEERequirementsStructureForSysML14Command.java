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

package org.eclipse.papyrus.model2doc.integration.ieee.requirements.sysml14.odt.architecture.internal.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.commands.CreateIEEERequirementsStructureCommand;
import org.eclipse.uml2.uml.Package;

/**
 * This command allows to create the UML Structure expected by the DocumentStructuretemplate in a SysML 1.4 environnement
 */
public class CreateIEEERequirementsStructureForSysML14Command extends CreateIEEERequirementsStructureCommand {

	/**
	 *
	 * Constructor.
	 *
	 * @param domain
	 *            the editing domain
	 * @param pack
	 *            the UML package used to contains the created IEEE packages structures
	 */
	public CreateIEEERequirementsStructureForSysML14Command(final TransactionalEditingDomain domain, final Package pack) {
		super(domain, pack);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.integration.ieee.requirements.commands.CreateIEEERequirementsStructureCommand#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		return super.canExecute() && isSysMLProfileRequirementsApplied();
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if the SysML::Requirements profile is applied
	 */
	protected boolean isSysMLProfileRequirementsApplied() {
		return this.pack.getAppliedProfile("SysML::Requirements") != null; //$NON-NLS-1$
	}
}
