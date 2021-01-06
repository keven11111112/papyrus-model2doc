/*****************************************************************************
 * Copyright (c) 2019, 2021 CEA LIST and others.
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
 * 	Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 570133
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractBodyPartTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;
import org.eclipse.uml2.uml.Element;

/**
 * This mapper converts the {@link StereotypePartTemplate} into {@link BodyPart}
 */
public class StereotypePartTemplateMapper extends AbstractBodyPartTemplateToStructureMapper<StereotypePartTemplate> {

	/**
	 *
	 * Constructor.
	 *
	 */
	public StereotypePartTemplateMapper() {
		super(UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePartTemplate(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param mappingService
	 * @param stereotypePartTemplate
	 * @param semanticModelElement
	 * @param expectedReturnedClass
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final StereotypePartTemplate stereotypePartTemplate, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		if (false == stereotypePartTemplate.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		if (false == semanticModelElement instanceof Element || false == stereotypePartTemplate.isMatchingFilterRule(semanticModelElement)) {
			return Collections.emptyList();
		}
		List<T> returnedElements = new ArrayList<>();

		final EObject stereotypeApplication = stereotypePartTemplate.getFirstMatchingStereotypeApplication(semanticModelElement);

		final Iterator<IBodyPartTemplate> bodyPart = stereotypePartTemplate.getBodyPartTemplates().iterator();
		while (bodyPart.hasNext()) {
			final IBodyPartTemplate currentFeature = bodyPart.next();
			final Collection<BodyPart> result;
			if (currentFeature instanceof StereotypePropertyReferencePartTemplate) {
				if (null == stereotypeApplication) {
					result = Collections.emptyList();
				} else {
					result = mappingService.map(currentFeature, stereotypeApplication, BodyPart.class);
				}
			} else {
				result = mappingService.map(currentFeature, semanticModelElement, BodyPart.class);
			}
			if (result == null) {
				continue;
			}
			// ensure the cast
			result.stream().forEach(a -> returnedElements.add(expectedReturnedClass.cast(a)));
		}
		return buildMapperResult(stereotypePartTemplate, semanticModelElement, expectedReturnedClass, returnedElements);
	}

}
