/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.integration.ieee.requirements.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.AbstractRequirements;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEEFunctionalRequirements;
import org.eclipse.papyrus.model2doc.integration.ieee.requirements.documentation.IEEERequirements;
import org.eclipse.uml2.uml.Package;

public class IEEERequirementsDocumentationProfileHelper {
	/**
	 * the package used to start the cross of the model
	 */
	private Package rootPackage;

	/**
	 * Collections and Map used to group the package by category
	 */
	private final Collection<Package> specificRequirements = new ArrayList<Package>();
	private final Collection<Package> externalInterfaceRequirements = new ArrayList<Package>();
	private final Collection<Package> userInterfaces = new ArrayList<Package>();
	private final Collection<Package> hardwaresInterfaces = new ArrayList<Package>();
	private final Collection<Package> softwareInterfaces = new ArrayList<Package>();
	private final Collection<Package> communicationInterfaces = new ArrayList<Package>();
	private final Collection<Package> functionalRequirementsWithoutMode = new ArrayList<Package>();
	private final Map<Integer, Collection<Package>> functionalRequirementsWithMode = new HashMap<Integer, Collection<Package>>();
	private final Collection<Package> performanceRequirements = new ArrayList<Package>();
	private final Collection<Package> designConstraints = new ArrayList<Package>();
	private final Collection<Package> softwareSystemAttributes = new ArrayList<Package>();
	private final Collection<Package> otherRequirements = new ArrayList<Package>();

	/**
	 * the list of package stereotyped with a stereotype extending one provided by the IEEE profile, but not provided by our profile itself
	 */
	final Collection<Package> unknownRequirements = new ArrayList<Package>();

	/**
	 * 
	 * Constructor.
	 *
	 * @param aPackage
	 *            a package of the model, generally the root one
	 */
	public IEEERequirementsDocumentationProfileHelper(final Package aPackage) {
		this.rootPackage = aPackage;
		fillCollections(this.rootPackage);
	}

	/**
	 * This method allows to fill the fields list and map of this class
	 * 
	 * TODO : warning, this algorithm won't be efficient
	 */
	protected void fillCollections(final Package pack) {
		final Iterator<Package> subPackageIterator = pack.getOwnedMembers().stream().filter(Package.class::isInstance).map(Package.class::cast).collect(Collectors.toList()).iterator();
		while (subPackageIterator.hasNext()) {
			final Package current = subPackageIterator.next();
			addToCollection(current);
			fillCollections(current);
		}
	}


	/**
	 * 
	 * 
	 * @param pack
	 *            a package
	 * 
	 *            this method add the package to one of the field lists of the classes when it is stereotyped as IEEE Requirements
	 */
	protected void addToCollection(final Package pack) {
		for (final EObject current : pack.getStereotypeApplications()) {
			if (current instanceof IEEEFunctionalRequirements) {
				final IEEEFunctionalRequirements reqSte = (IEEEFunctionalRequirements) current;
				final Integer mode = Integer.valueOf(reqSte.getMode());
				Collection<Package> packages = this.functionalRequirementsWithMode.get(mode);
				if (null == packages) {
					packages = new ArrayList<Package>();
					this.functionalRequirementsWithMode.put(mode, packages);
				}
				packages.add(pack);

			} else if (current instanceof IEEERequirements) {
				final IEEERequirements reqSte = (IEEERequirements) current;
				switch (reqSte.getCategory()) {
				case SPECIFIC_REQUIREMENTS:
					this.specificRequirements.add(pack);
					break;
				case EXTERNAL_INTERFACE_REQUIREMENTS:
					this.externalInterfaceRequirements.add(pack);
					break;
				case USER_INTERFACES:
					this.userInterfaces.add(pack);
					break;
				case HARDWARE_INTERFACES:
					this.hardwaresInterfaces.add(pack);
					break;
				case SOFTWARE_INTERFACES:
					this.softwareInterfaces.add(pack);
					break;
				case COMMUNICATION_INTERFACES:
					this.communicationInterfaces.add(pack);
					break;
				case FUNCTIONAL_REQUIREMENTS:
					this.functionalRequirementsWithoutMode.add(pack);
					break;
				case PERFORMANCE_REQUIREMENTS:
					this.performanceRequirements.add(pack);
					break;
				case DESIGN_CONSTRAINTS:
					designConstraints.add(pack);
					break;
				case SOFTWARE_SYSTEM_ATTRIBUTES:
					this.softwareSystemAttributes.add(pack);
					break;

				case OTHER_REQUIREMENTS:
					this.otherRequirements.add(pack);
					break;
				default:
					this.unknownRequirements.add(pack);
					break;

				}
			} else if (current instanceof AbstractRequirements) {
				this.unknownRequirements.add(pack);
			}
		}
	}

	/**
	 * @return this.the specificRequirements
	 */
	public final Collection<Package> getSpecificRequirements() {
		return this.specificRequirements;
	}

	/**
	 * @return this.the externalInterfaceRequirements
	 */
	public final Collection<Package> getExternalInterfaceRequirements() {
		return this.externalInterfaceRequirements;
	}

	/**
	 * @return this.the userInterfaces
	 */
	public final Collection<Package> getUserInterfaces() {
		return this.userInterfaces;
	}

	/**
	 * @return this.the hardwaresInterfaces
	 */
	public final Collection<Package> getHardwaresInterfaces() {
		return this.hardwaresInterfaces;
	}

	/**
	 * @return this.the softwareInterfaces
	 */
	public final Collection<Package> getSoftwareInterfaces() {
		return this.softwareInterfaces;
	}

	/**
	 * @return this.the communicationInterfaces
	 */
	public final Collection<Package> getCommunicationInterfaces() {
		return this.communicationInterfaces;
	}

	/**
	 * @return this.the functionalRequirementsWithoutMode
	 */
	public final Collection<Package> getFunctionalRequirementsWithoutMode() {
		return this.functionalRequirementsWithoutMode;
	}

	/**
	 * @return this.the functionalRequirementsWithMode
	 */
	public final Map<Integer, Collection<Package>> getFunctionalRequirementsWithMode() {
		return this.functionalRequirementsWithMode;
	}

	/**
	 * @return this.the performanceRequirements
	 */
	public final Collection<Package> getPerformanceRequirements() {
		return this.performanceRequirements;
	}

	/**
	 * @return this.the designConstraints
	 */
	public final Collection<Package> getDesignConstraints() {
		return this.designConstraints;
	}

	/**
	 * @return this.the softwareSystemAttributes
	 */
	public final Collection<Package> getSoftwareSystemAttributes() {
		return this.softwareSystemAttributes;
	}

	/**
	 * @return this.the otherRequirements
	 */
	public final Collection<Package> getOtherRequirements() {
		return this.otherRequirements;
	}

	/**
	 * @return this.the unknownRequirements
	 */
	public final Collection<Package> getUnknownRequirements() {
		return this.unknownRequirements;
	}
}
