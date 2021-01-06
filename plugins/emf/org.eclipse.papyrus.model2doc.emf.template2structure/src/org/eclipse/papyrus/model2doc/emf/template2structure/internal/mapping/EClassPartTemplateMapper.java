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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractBodyPartTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 *
 * This class ensures the transformation of the {@link EClassPartTemplate} into a {@link BodyPart} ({@link Title}) and delegate the mapping of the {@link EClassPartTemplate} subelements.
 */
public class EClassPartTemplateMapper extends AbstractBodyPartTemplateToStructureMapper<EClassPartTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EClassPartTemplateMapper() {
		super(DocumentStructureTemplatePackage.eINSTANCE.getEClassPartTemplate(), BodyPart.class);
	}

	/**
	 * @param semanticModelElement
	 * @param eClassPartTemplate
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, Class<T>)
	 *
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final EClassPartTemplate eClassPartTemplate, final EObject semanticModelElement, Class<T> expectedReturnedClass) {
		if (false == eClassPartTemplate.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		if (false == eClassPartTemplate.isMatchingFilterRule(semanticModelElement)) {
			return Collections.emptyList();
		}
		List<T> generatedElements = new ArrayList<>();

		final Iterator<IBodyPartTemplate> bodyPart = eClassPartTemplate.getBodyPartTemplates().iterator();
		while (bodyPart.hasNext()) {
			final IBodyPartTemplate currentFeature = bodyPart.next();
			final Collection<BodyPart> result = mappingService.map(currentFeature, semanticModelElement, BodyPart.class);
			if (result == null) {
				continue;
			}
			// ensure the cast
			result.stream().forEach(a -> generatedElements.add(expectedReturnedClass.cast(a)));
		}
		return buildMapperResult(eClassPartTemplate, semanticModelElement, expectedReturnedClass, generatedElements);
	}

}
