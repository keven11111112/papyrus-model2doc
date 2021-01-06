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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractBodyPartTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class ensures the transformation of the {@link EReferencePartTemplateMapper} into a {@link BodyPart} ({@link Title}) and delegate the mapping of the {@link EReferencePartTemplateMapper} subelements.
 */
public class EReferencePartTemplateMapper extends AbstractBodyPartTemplateToStructureMapper<EReferencePartTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EReferencePartTemplateMapper() {
		super(DocumentStructureTemplatePackage.eINSTANCE.getEReferencePartTemplate(), BodyPart.class);
	}

	/**
	 * @param mappingService
	 * @param semanticModelElement
	 * @param referencePartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, Class<T>)
	 *
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final EReferencePartTemplate referencePartTemplate, final EObject semanticModelElement, Class<T> expectedReturnedClass) {
		if (false == referencePartTemplate.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		List<T> generatedElements = new ArrayList<>();

		final Collection<EObject> matchingElements = referencePartTemplate.getEReferenceValues(semanticModelElement);
		if (matchingElements.isEmpty()) {
			return null;
		}

		// we iterate firstly on the elements of the document structure
		final Iterator<ISubBodyPartTemplate> subBodyPartTemplate = referencePartTemplate.getSubBodyPartTemplates().iterator();
		while (subBodyPartTemplate.hasNext()) {
			final ISubBodyPartTemplate currentObjectPartTemplate = subBodyPartTemplate.next();
			final Iterator<EObject> matchingEObjectIter = matchingElements.iterator();
			// then we iterate on the matching model elements
			while (matchingEObjectIter.hasNext()) {
				final EObject currentEObject = matchingEObjectIter.next();
				final Collection<BodyPart> result = mappingService.map(currentObjectPartTemplate, currentEObject, BodyPart.class);
				if (result == null) {
					continue;
				}
				result.stream().forEach(a -> generatedElements.add(expectedReturnedClass.cast(a)));
			}
		}

		return buildMapperResult(referencePartTemplate, semanticModelElement, expectedReturnedClass, generatedElements);
	}

}
