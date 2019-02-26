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
package org.eclipse.papyrus.model2doc.ieee.requirements.odt.transcriber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.papyrus.sysml14.requirements.Requirement;
import org.eclipse.papyrus.uml.internationalization.utils.utils.UMLLabelInternationalization;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLUtil;

import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.ieee.requirements.utils.IEEERequirementsDocumentationProfileHelper;

/**
 * IEEE Requirements Transcriber is based on "A1. Template of SRS Section 3 organized by mode: Version 1" of
 * "IEEE Recommended Practice for Software Requirements SpeciÞcations" (IEEE Std 830-1998).
 */
public class IEEERequirementsTranscriber {

	private Package root = null;

	private Transcription transcription = null;

	private UMLLabelInternationalization umlLabelInternationalization = null;

	private List<Requirement> requirements = new ArrayList<Requirement>();

	/**
	 *
	 * Constructor.
	 *
	 * @param rootPackage
	 *            the root package
	 * @param transcription
	 *            the object in charge to do the transcription
	 */
	public IEEERequirementsTranscriber(Package rootPackage, Transcription transcription) {
		root = rootPackage;
		this.transcription = transcription;
		umlLabelInternationalization = UMLLabelInternationalization.getInstance();
	}

	public void transcribe() {
		if (transcription.canExecute()) {
			transcription.writeCoverPage(null);

			IEEERequirementsDocumentationProfileHelper ieeReqProfileHelper = new IEEERequirementsDocumentationProfileHelper(root);

			// Set "Specific Requirements" section
			transcription.writeSectionTitle("Specific Requirements", 1); //$NON-NLS-1$

			// Transcribe "External Interface Requirements" section
			transcribeExternalInterfaceRequirements(ieeReqProfileHelper);

			Map<Integer, Collection<Package>> functionalRequirements = ieeReqProfileHelper.getFunctionalRequirementsWithMode();
			if (!functionalRequirements.isEmpty()) {
				// Set "Functional Requirements" section
				transcription.writeSectionTitle("Functional Requirements", 2); //$NON-NLS-1$
				Iterator<Integer> modeIt = functionalRequirements.keySet().iterator();
				while (modeIt.hasNext()) {
					Integer mode = modeIt.next();
					transcription.writeSectionTitle("Mode " + mode, 3); //$NON-NLS-1$
					transcribeRequirements(functionalRequirements.get(mode), 4);
				}
			}

			Collection<Package> performanceRequirements = ieeReqProfileHelper.getPerformanceRequirements();
			if (!performanceRequirements.isEmpty()) {
				// Set "Performance Requirements" section
				transcription.writeSectionTitle("Performance Requirements", 2); //$NON-NLS-1$
				transcribeRequirements(performanceRequirements, 3);

			}

			Collection<Package> designConstraints = ieeReqProfileHelper.getDesignConstraints();
			if (!designConstraints.isEmpty()) {
				// Set "Design Constraints" section
				transcription.writeSectionTitle("Design Constraints", 2); //$NON-NLS-1$
				transcribeRequirements(designConstraints, 3);

			}

			Collection<Package> softwareSystemAttributes = ieeReqProfileHelper.getSoftwareSystemAttributes();
			if (!softwareSystemAttributes.isEmpty()) {
				// Set "Software System Attributes" section
				transcription.writeSectionTitle("Software System Attributes", 2); //$NON-NLS-1$
				transcribeRequirements(softwareSystemAttributes, 3);
			}

			Collection<Package> otherRequirements = ieeReqProfileHelper.getOtherRequirements();
			if (!softwareSystemAttributes.isEmpty()) {
				// Set "Other Requirements" section
				transcription.writeSectionTitle("Other Requirements", 2); //$NON-NLS-1$
				transcribeRequirements(otherRequirements, 3);
			}

			transcription.save(umlLabelInternationalization.getLabel(root));
		}
	}

	/**
	 * Transcribe "External Interface Requirements" section.
	 * 
	 * @param ieeReqProfileHelper
	 */
	private void transcribeExternalInterfaceRequirements(IEEERequirementsDocumentationProfileHelper ieeReqProfileHelper) {
		Collection<Package> userInterfaces = ieeReqProfileHelper.getUserInterfaces();
		Collection<Package> hardwaresInterfaces = ieeReqProfileHelper.getHardwaresInterfaces();
		Collection<Package> softwareInterfaces = ieeReqProfileHelper.getSoftwareInterfaces();
		Collection<Package> communicationInterfaces = ieeReqProfileHelper.getCommunicationInterfaces();
		if (!userInterfaces.isEmpty() || !hardwaresInterfaces.isEmpty() || !softwareInterfaces.isEmpty() || !communicationInterfaces.isEmpty()) {
			transcription.writeSectionTitle("External Interface Requirements", 2); //$NON-NLS-1$
			if (!userInterfaces.isEmpty()) {
				// Set "User Interfaces" section
				transcription.writeSectionTitle("User Interfaces", 3); //$NON-NLS-1$
				transcribeRequirements(userInterfaces, 4);
			}

			if (!hardwaresInterfaces.isEmpty()) {
				// Set "Hardwares Interfaces" section
				transcription.writeSectionTitle("Hardwares Interfaces", 3); //$NON-NLS-1$
				transcribeRequirements(hardwaresInterfaces, 4);
			}

			if (!softwareInterfaces.isEmpty()) {
				// Set "Software Interfaces" section
				transcription.writeSectionTitle("Software Interfaces", 3); //$NON-NLS-1$
				transcribeRequirements(softwareInterfaces, 4);
			}

			if (!communicationInterfaces.isEmpty()) {
				// Set "Communication Interfaces" section
				transcription.writeSectionTitle("Communication Interfaces", 3); //$NON-NLS-1$
				transcribeRequirements(communicationInterfaces, 4);
			}
		}

	}

	/**
	 * Get requirements and transcribe them.
	 * 
	 * @param packages
	 * @param level
	 */
	private void transcribeRequirements(Collection<Package> packages, int level) {

		for (Package pack : packages) {
			// Get requirements owned by owner package
			for (Type type : pack.getOwnedTypes()) {
				if (UMLUtil.getStereotypeApplication(type, Requirement.class) != null) {
					requirements.add(UMLUtil.getStereotypeApplication(type, Requirement.class));
				}
			}

			// Transcribe requirements
			for (Requirement requirement : requirements) {
				transcription.writeSectionTitle(umlLabelInternationalization.getLabel(requirement.getBase_Class()), level);
				transcription.writeParagraph(requirement.getText(), false);
			}
		}

		requirements.clear();
	}
}
