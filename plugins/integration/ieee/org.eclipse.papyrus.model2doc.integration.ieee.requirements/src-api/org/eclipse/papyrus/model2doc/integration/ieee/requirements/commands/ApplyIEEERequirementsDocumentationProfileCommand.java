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

package org.eclipse.papyrus.model2doc.integration.ieee.requirements.commands;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.utils.IEEERequirementsConstants;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;

/**
 * This command apply the IEEERequirementsProfile.
 */
public class ApplyIEEERequirementsDocumentationProfileCommand extends AbstractTransactionalCommand {

	/**
	 * the package on which we will apply the profile
	 */
	protected final Package pack;

	/**
	 * Constructor.
	 *
	 * @param domain
	 *            the editing domain
	 * @param pack
	 *            the package on which apply the profile
	 */
	public ApplyIEEERequirementsDocumentationProfileCommand(final TransactionalEditingDomain domain, final Package pack) {
		this(domain, "Apply IEEE Requirements Document Profile", pack); //$NON-NLS-1$
	}

	/**
	 * Constructor.
	 *
	 * @param domain
	 * @param label
	 * @param affectedFiles
	 */
	public ApplyIEEERequirementsDocumentationProfileCommand(final TransactionalEditingDomain domain, final String label, final Package pack) {
		super(domain, label, Collections.emptyList());
		this.pack = pack;
	}

	/**
	 * @see org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand#doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor, org.eclipse.core.runtime.IAdaptable)
	 *
	 * @param monitor
	 * @param info
	 * @return
	 * @throws ExecutionException
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (null == pack.getAppliedProfile(IEEERequirementsConstants.IEEE_PROFILE_NAME)) {
			final URI uri = URI.createURI(IEEERequirementsConstants.IEEE_PROFILE_URI);
			final Resource res = this.pack.eResource().getResourceSet().getResource(uri, true);
			// cast already checked in the canExecute
			final Profile rootProfile = (Profile) res.getContents().get(0);
			this.pack.applyProfile(rootProfile);
		}
		return CommandResult.newOKCommandResult();
	}

	/**
	 * @see org.eclipse.core.commands.operations.AbstractOperation#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		return super.canExecute() && this.pack != null && getEditingDomain() != null && isIEEEProfileAvailable();
	}

	/**
	 *
	 * @return
	 *         <code>true</code> if the profile is available
	 */
	private boolean isIEEEProfileAvailable() {
		final URI uri = URI.createURI(IEEERequirementsConstants.IEEE_PROFILE_URI);
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource res = resourceSet.getResource(uri, true);
		if (res.getContents().size() > 0) {
			final EObject rootEobject = res.getContents().get(0);
			return rootEobject instanceof Profile && ((Profile) rootEobject).getName().equals(IEEERequirementsConstants.IEEE_PROFILE_NAME);
		}
		return false;
	}
}
