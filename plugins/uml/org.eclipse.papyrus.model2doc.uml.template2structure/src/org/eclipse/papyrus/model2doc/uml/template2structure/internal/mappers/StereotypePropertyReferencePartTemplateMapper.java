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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractBodyPartTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * This mapper converts the StereotypePropertyPartTemplate into BodyPart
 */
public class StereotypePropertyReferencePartTemplateMapper extends AbstractBodyPartTemplateToStructureMapper<StereotypePropertyReferencePartTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public StereotypePropertyReferencePartTemplateMapper() {
		super(UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePropertyReferencePartTemplate(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param mappingService
	 * @param documentTemplateElement
	 * @param semanticModelElement
	 * @param expectedReturnedClass
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final StereotypePropertyReferencePartTemplate stereotypePropertyPartTemplate, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		if (false == stereotypePropertyPartTemplate.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		List<T> returnedElements = new ArrayList<>();

		final Collection<EObject> matchingElements = stereotypePropertyPartTemplate.getStereotypePropertyReferenceValues(semanticModelElement);
		if (matchingElements.isEmpty()) {
			return null;
		}

		// we iterate firstly on the elements of the document structure
		final Iterator<ISubBodyPartTemplate> subBodyPartTemplate = stereotypePropertyPartTemplate.getSubBodyPartTemplates().iterator();
		while (subBodyPartTemplate.hasNext()) {
			final ISubBodyPartTemplate currentObjectPartTemplate = subBodyPartTemplate.next();
			final Iterator<EObject> matchingEObjectIter = matchingElements.iterator();

			// then we iterate on the matching model elements
			while (matchingEObjectIter.hasNext()) {
				final EObject currentEObject = matchingEObjectIter.next();

				// it could be a stereotype application
				final Element baseElement = UMLUtil.getBaseElement(currentEObject);
				final EObject subElementToMap = baseElement != null ? baseElement : currentEObject;

				final Collection<BodyPart> result = mappingService.map(currentObjectPartTemplate, subElementToMap, BodyPart.class);
				if (result == null) {
					continue;
				}
				result.stream().forEach(a -> returnedElements.add(expectedReturnedClass.cast(a)));
			}
		}

		return buildMapperResult(stereotypePropertyPartTemplate, semanticModelElement, expectedReturnedClass, returnedElements);
	}

}
