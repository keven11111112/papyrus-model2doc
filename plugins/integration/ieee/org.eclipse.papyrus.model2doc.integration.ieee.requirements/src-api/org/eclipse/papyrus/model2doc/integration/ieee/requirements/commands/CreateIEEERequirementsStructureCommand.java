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

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEEFunctionalRequirements;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirementCategory;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirements;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.utils.IEEERequirementsConstants;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This command allows to create the UML Structure expected by the DocumentStructuretemplate
 */
public class CreateIEEERequirementsStructureCommand extends ApplyIEEERequirementsDocumentationProfileCommand {

	/**
	 * the IEEERequirement stereotype to apply on Package
	 */
	private Stereotype IEEERequirements;

	/**
	 * the IEEE Functional Requirement stereotype to apply on Package
	 */
	private Stereotype IEEEFunctionalRequirements;

	/**
	 *
	 * Constructor.
	 *
	 * @param domain
	 *            the editing domain to use
	 * @param pack
	 *            the package in which create the structure
	 */
	public CreateIEEERequirementsStructureCommand(final TransactionalEditingDomain domain, final Package pack) {
		super(domain, "Create IEEE Structure", pack); //$NON-NLS-1$
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
		// 0. apply IEEE Requirements profile
		super.doExecuteWithResult(monitor, info);

		// 0bis. get IEEERequirements and IEEEFunctionalRequirements Profile
		final Profile profile = pack.getAppliedProfile(IEEERequirementsConstants.IEEE_PROFILE_NAME);
		this.IEEERequirements = profile.getOwnedStereotype(IEEERequirementsConstants.IEEE_REQUIREMENTS_STEREOTYPE);
		this.IEEEFunctionalRequirements = profile.getOwnedStereotype(IEEERequirementsConstants.IEEE_FUNCTIONAL_REQUIREMENTS_STEREOTYPE);


		// 1. Create structure for interfaces requirements
		if (!(hasExternalInterfacePackage() && hasExternalInterfacePackage() && hasUserInterfacePackage() && hasHWInterfacePackage() && hasCommunicationInterfacePackage() && hasSWInterfacePackage())) {

			// 1.1 create external interface requirement package
			if (!hasExternalInterfacePackage()) {
				createStereotypedIEEERequirementsPackage(this.pack, IEEERequirementsConstants.EXTERNAl_INTERFACES_PACKAGE, IEEERequirementCategory.EXTERNAL_INTERFACES_REQUIREMENTS);
			}

			final Package externalRequirementsPackage = findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.EXTERNAL_INTERFACES_REQUIREMENTS);


			// 1.2 create user interface requirement package
			if (!hasUserInterfacePackage()) {
				createStereotypedIEEERequirementsPackage(externalRequirementsPackage, IEEERequirementsConstants.USER_INTERFACES_PACKAGE, IEEERequirementCategory.USER_INTERFACES);
			}

			// 1.3 create HW interface requirement package
			if (!hasHWInterfacePackage()) {
				createStereotypedIEEERequirementsPackage(externalRequirementsPackage, IEEERequirementsConstants.HW_INTERFACES_PACKAGE, IEEERequirementCategory.HARDWARE_INTERFACES);
			}

			// 1.4 create SW interface requirement package
			if (!hasSWInterfacePackage()) {
				createStereotypedIEEERequirementsPackage(externalRequirementsPackage, IEEERequirementsConstants.SW_INTERFACES_PACKAGE, IEEERequirementCategory.SOFTWARE_INTERFACES);
			}

			// 1.5 create Communication interface requirement package
			if (!hasCommunicationInterfacePackage()) {
				createStereotypedIEEERequirementsPackage(externalRequirementsPackage, IEEERequirementsConstants.COMMUNICATION_INTERFACES_PACKAGE, IEEERequirementCategory.COMMUNICATION_INTERFACES);
			}
		}

		// 2. create structure for function requirements
		if (!(hasFunctionalRequirements_Mode1_Package() && hasFunctionalRequirements_Mode2_Package() && hasFunctionalRequirements_Mode3_Package())) {
			createStereotypedIEEERequirementsPackage(this.pack, IEEERequirementsConstants.FUNCTIONAL_REQUIREMENTS_ROOT_PACKAGE, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS);
			final Package functionalRequirementsRootPackage = findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS);

			if (!(hasFunctionalRequirements_Mode1_Package())) {
				createStereotypedIEEERequirementsPackage(functionalRequirementsRootPackage, IEEERequirementsConstants.FUNCTIONAL_REQUIREMENTS_MODE_1, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS, 1);
			}

			if (!(hasFunctionalRequirements_Mode2_Package())) {
				createStereotypedIEEERequirementsPackage(functionalRequirementsRootPackage, IEEERequirementsConstants.FUNCTIONAL_REQUIREMENTS_MODE_2, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS, 2);
			}

			if (!(hasFunctionalRequirements_Mode3_Package())) {
				createStereotypedIEEERequirementsPackage(functionalRequirementsRootPackage, IEEERequirementsConstants.FUNCTIONAL_REQUIREMENTS_MODE_3, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS, 3);
			}
		}

		// 3. create a package for performance requirements
		if (!hasPerformanceRequirementsPackage()) {
			createStereotypedIEEERequirementsPackage(this.pack, IEEERequirementsConstants.PERFORMANCE_REQUIREMENTS_PACKAGE, IEEERequirementCategory.PERFORMANCE_REQUIREMENTS);
		}

		// 4. create a package for design constraint requirements
		if (!hasDesignConstraintsPackage()) {
			createStereotypedIEEERequirementsPackage(this.pack, IEEERequirementsConstants.DESIGN_CONSTRAINTS_REQUIREMENTS_PACKAGE, IEEERequirementCategory.DESIGN_CONSTRAINTS);
		}

		// 5. create a package for system software attribute requirements
		if (!hasSoftwareSystemAttributeRequirementsPackage()) {
			createStereotypedIEEERequirementsPackage(this.pack, IEEERequirementsConstants.SOFTWARE_SYSTEM_ATTRIBUTE_REQUIREMENTS_PACKAGE, IEEERequirementCategory.SOFTWARE_SYSTEM_ATTRIBUTES);
		}

		// 6. create a package for other requirements
		if (!hasOtherRequirementsPackage()) {
			createStereotypedIEEERequirementsPackage(this.pack, IEEERequirementsConstants.OTHER_REQUIREMENTS_PACKAGE, IEEERequirementCategory.OTHER_REQUIREMENTS);
		}
		return CommandResult.newOKCommandResult();
	}


	private void createStereotypedIEEERequirementsPackage(final Package parentPack, final String packName, final IEEERequirementCategory category) {
		final Package newPackage = UMLFactory.eINSTANCE.createPackage();
		newPackage.setName(packName);
		parentPack.getNestedPackages().add(newPackage);

		IEEERequirements steAppl = (IEEERequirements) newPackage.applyStereotype(IEEERequirements);
		steAppl.setCategory(category);
	}

	private void createStereotypedIEEERequirementsPackage(final Package parentPack, final String packName, final IEEERequirementCategory category, final int mode) {
		final Package newPackage = UMLFactory.eINSTANCE.createPackage();
		newPackage.setName(packName);
		parentPack.getNestedPackages().add(newPackage);

		IEEEFunctionalRequirements steAppl = (IEEEFunctionalRequirements) newPackage.applyStereotype(IEEEFunctionalRequirements);
		steAppl.setCategory(category);
		steAppl.setMode(mode);
	}

	/**
	 * @see org.eclipse.core.commands.operations.AbstractOperation#canExecute()
	 *
	 * @return
	 */
	@Override
	public boolean canExecute() {
		return super.canExecute()
				&& hasMissingIEEEPackage();
	}

	/**
	 * @return
	 */
	private final boolean hasMissingIEEEPackage() {
		return !(hasExternalInterfacePackage()
				&& hasUserInterfacePackage()
				&& hasHWInterfacePackage()
				&& hasCommunicationInterfacePackage()
				&& hasSWInterfacePackage()
				&& hasFunctionalRequirements_Mode1_Package()
				&& hasFunctionalRequirements_Mode2_Package()
				&& hasFunctionalRequirements_Mode3_Package()
				&& hasPerformanceRequirementsPackage()
				&& hasDesignConstraintsPackage()
				&& hasSoftwareSystemAttributeRequirementsPackage()
				&& hasOtherRequirementsPackage());
	}

	/*--------------------Interfaces Requirements-----------------------------------------------*/
	private final boolean hasExternalInterfacePackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.EXTERNAL_INTERFACES_REQUIREMENTS) != null;
	}

	private final boolean hasUserInterfacePackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.USER_INTERFACES) != null;
	}

	private final boolean hasHWInterfacePackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.HARDWARE_INTERFACES) != null;
	}

	private final boolean hasCommunicationInterfacePackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.COMMUNICATION_INTERFACES) != null;
	}

	private final boolean hasSWInterfacePackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.SOFTWARE_INTERFACES) != null;
	}

	/*--------------------Functional Requirements-----------------------------------------------*/
	private final boolean hasFunctionalRequirements_Mode1_Package() {
		return findStereotypedIEEEFunctionalRequirementsPackage(this.pack, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS, 1) != null;
	}

	private final boolean hasFunctionalRequirements_Mode2_Package() {
		return findStereotypedIEEEFunctionalRequirementsPackage(this.pack, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS, 2) != null;
	}

	private final boolean hasFunctionalRequirements_Mode3_Package() {
		return findStereotypedIEEEFunctionalRequirementsPackage(this.pack, IEEERequirementCategory.FUNCTIONAL_REQUIREMENTS, 3) != null;
	}

	/*--------------------Performance Requirements-----------------------------------------------*/
	private final boolean hasPerformanceRequirementsPackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.PERFORMANCE_REQUIREMENTS) != null;
	}

	/*--------------------Design Constraints Requirements-----------------------------------------------*/
	private final boolean hasDesignConstraintsPackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.DESIGN_CONSTRAINTS) != null;
	}

	/*--------------------Software System Attribute Requirements-----------------------------------------------*/
	private final boolean hasSoftwareSystemAttributeRequirementsPackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.SOFTWARE_SYSTEM_ATTRIBUTES) != null;
	}

	/*--------------------Other Requirements-----------------------------------------------*/
	private final boolean hasOtherRequirementsPackage() {
		return findStereotypedIEEERequirementsPackage(this.pack, IEEERequirementCategory.OTHER_REQUIREMENTS) != null;
	}

	/**
	 *
	 * @param pack
	 *            a package
	 * @param ieeeCategory
	 *            the expected IEEERequirementCategory for the package
	 * @return
	 *         the found package or <code>null</code>
	 */
	private final Package findStereotypedIEEERequirementsPackage(final Package pack, final IEEERequirementCategory ieeeCategory) {
		if (pack == null) {
			return null;
		}
		IEEERequirements ieeeReq = UMLUtil.getStereotypeApplication(pack, IEEERequirements.class);
		if (ieeeReq != null && ieeeReq.getCategory() == ieeeCategory) {
			return pack;
		}

		final List<Package> ownedPackages = pack.getMembers().stream().filter(Package.class::isInstance).map(Package.class::cast).collect(Collectors.toList());
		Iterator<Package> iter = ownedPackages.iterator();
		Package found = null;
		while (iter.hasNext() && found == null) {
			final Package tmp = iter.next();
			ieeeReq = UMLUtil.getStereotypeApplication(tmp, IEEERequirements.class);
			if (ieeeReq != null && ieeeReq.getCategory() == ieeeCategory) {
				found = tmp;
			}
		}
		if (found == null) {
			iter = ownedPackages.iterator();
			while (iter.hasNext() && found == null) {
				found = findStereotypedIEEERequirementsPackage(iter.next(), ieeeCategory);
			}
		}

		return found;
	}

	/**
	 *
	 * @param pack
	 *            a package
	 * @param ieeeCategory
	 *            the expected IEEERequirementCategory for the package
	 * @param mode
	 *            the expected mode for the FunctionRequirement package
	 * @return
	 *         the found package or <code>null</code>
	 */
	private final Package findStereotypedIEEEFunctionalRequirementsPackage(final Package pack, final IEEERequirementCategory ieeeCategory, final int mode) {
		if (pack == null) {
			return null;
		}
		IEEEFunctionalRequirements ieeeReq = UMLUtil.getStereotypeApplication(pack, IEEEFunctionalRequirements.class);
		if (ieeeReq != null && ieeeReq.getCategory() == ieeeCategory && ieeeReq.getMode() == mode) {
			return pack;
		}

		final List<Package> ownedPackages = pack.getMembers().stream().filter(Package.class::isInstance).map(Package.class::cast).collect(Collectors.toList());
		Iterator<Package> iter = ownedPackages.iterator();
		Package found = null;
		while (iter.hasNext() && found == null) {
			final Package tmp = iter.next();
			ieeeReq = UMLUtil.getStereotypeApplication(tmp, IEEEFunctionalRequirements.class);
			if (ieeeReq != null && ieeeReq.getCategory() == ieeeCategory && ieeeReq.getMode() == mode) {
				found = tmp;
			}
		}
		if (found == null) {
			iter = ownedPackages.iterator();
			while (iter.hasNext() && found == null) {
				found = findStereotypedIEEEFunctionalRequirementsPackage(iter.next(), ieeeCategory, mode);
			}
		}

		return found;
	}

}
