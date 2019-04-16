/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
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
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.StereotypePropertyReferencePartTemplate;

/**
 * This mapper converts the StereotypePropertyPartTemplate into BodyPart
 */
public class StereotypePropertyReferencePartTemplateMapper extends AbstractUMLTemplateToStructureMapper<StereotypePropertyReferencePartTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public StereotypePropertyReferencePartTemplateMapper() {
		super(TEMPLATE_EPACKAGE.getStereotypePropertyReferencePartTemplate(), BodyPart.class);
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
		List<T> returnedElements = new ArrayList<>();

		final Collection<EObject> matchingElements = stereotypePropertyPartTemplate.getMatchingReferencedEObjects(semanticModelElement);
		if (matchingElements.isEmpty()) {
			return null;
		}
		Title title = null;
		if (stereotypePropertyPartTemplate.isGenerate()) {
			if (stereotypePropertyPartTemplate.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(getSectionTitle(stereotypePropertyPartTemplate));
				returnedElements.add(expectedReturnedClass.cast(title));
			}
		}
		final Iterator<EObject> matchingEObjectIter = matchingElements.iterator();
		while (matchingEObjectIter.hasNext()) {
			final EObject currentEObject = matchingEObjectIter.next();
			final Iterator<ISubBodyPartTemplate> subBodyPartTemplate = stereotypePropertyPartTemplate.getSubBodyPartTemplate().iterator();
			while (subBodyPartTemplate.hasNext()) {
				final ISubBodyPartTemplate currentObjectPartTemplate = subBodyPartTemplate.next();

				final Collection<BodyPart> result = mappingService.map(currentObjectPartTemplate, currentEObject, BodyPart.class);
				if (result == null) {
					continue;
				}
				if (title != null) {
					title.getSubBodyPart().addAll(result);
				} else {
					result.stream().forEach(a -> returnedElements.add(expectedReturnedClass.cast(a)));
				}
			}
		}

		return returnedElements;
	}


	// TODO : all the next method must be moved in another class
	protected String getSectionTitle(final IBodySectionPartTemplate partTemplate) {// TODO in an upper class
		final String customTitle = partTemplate.getCustomTitle();
		return (null == customTitle || customTitle.isEmpty()) ? getPartTemplateTitle(partTemplate) : customTitle;
	}

	// TODO : all the next method must be moved in another class
	protected String getPartTemplateTitle(IBodySectionPartTemplate partTemplate) {// TODO factorize me somewhere?
		if (partTemplate instanceof StereotypePropertyReferencePartTemplate) {
			return ((StereotypePropertyReferencePartTemplate) partTemplate).getPropertyName();
		}
		if (partTemplate instanceof EReferencePartTemplate) {
			return getLabel(((EReferencePartTemplate) partTemplate).getEReference());
		}
		return null;
	}

	// TODO : all the next method must be moved in another class
	protected String getLabel(final EObject eobject) {
		if (eobject instanceof EReference) {
			return ((EReference) eobject).getName();
		}
		return null;
	}

}
