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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class ensures the transformation of the {@link EReferencePartTemplateMapper} into a {@link BodyPart} ({@link Title}) and delegate the mapping of the {@link EReferencePartTemplateMapper} subelements.
 */
public class EReferencePartTemplateMapper extends AbstractEMFTemplateToStructureMapper<EReferencePartTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EReferencePartTemplateMapper() {
		super(TEMPLATE_EPACKAGE.getEReferencePartTemplate(), BodyPart.class);
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
		List<T> returnedElements = new ArrayList<>();

		final Collection<EObject> matchingElements = getMatchingReferencedEObjects(referencePartTemplate, semanticModelElement);
		if (matchingElements.isEmpty()) {
			return null;
		}
		Title title = null;
		if (referencePartTemplate.isGenerate()) {
			if (referencePartTemplate.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(getSectionTitle(referencePartTemplate));
				returnedElements.add(expectedReturnedClass.cast(title));
			}
		}
		final Iterator<EObject> iter = matchingElements.iterator();
		while (iter.hasNext()) {
			final Iterator<ISubBodyPartTemplate> subBodyPartTemplate = referencePartTemplate.getSubBodyPartTemplate().iterator();
			while (subBodyPartTemplate.hasNext()) {
				final ISubBodyPartTemplate currentObjectPartTemplate = subBodyPartTemplate.next();
				final Collection<BodyPart> result = mappingService.map(currentObjectPartTemplate, iter.next(), BodyPart.class);
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

	protected String getSectionTitle(final IBodySectionPartTemplate partTemplate) {// TODO in an upper class
		final String customTitle = partTemplate.getCustomTitle();
		return (null == customTitle || customTitle.isEmpty()) ? getPartTemplateTitle(partTemplate) : customTitle;
	}

	protected String getPartTemplateTitle(IBodySectionPartTemplate partTemplate) {// TODO factorize me somewhere?
		if (partTemplate instanceof EReferencePartTemplate) {
			return getLabel(((EReferencePartTemplate) partTemplate).getEReference());
		}
		return null;
	}

	protected String getLabel(final EObject eobject) {
		if (eobject instanceof EReference) {
			return ((EReference) eobject).getName();
		}
		return null;
	}

	protected Collection<EObject> getMatchingReferencedEObjects(final EReferencePartTemplate documentTemplateElement, final EObject semanticModelElement) {
		final List<EObject> elements = new ArrayList<>();
		final EStructuralFeature feature = documentTemplateElement.getEReference();
		if (feature.getEType() instanceof EObject) {
			final EReference ref = documentTemplateElement.getEReference();
			if (null != ref) {
				if (semanticModelElement.eClass().getEAllReferences().contains(ref)) {
					if (feature.isMany()) {
						elements.addAll((Collection<EObject>) semanticModelElement.eGet(documentTemplateElement.getEReference()));
					} else {
						elements.add((EObject) semanticModelElement.eGet(documentTemplateElement.getEReference()));
					}
				} else {
					Activator.log.warn(NLS.bind("The object {0} doesn't provide the EReference {1}", semanticModelElement, ref)); //$NON-NLS-1$
				}
			} else {
				Activator.log.warn("The EReference is null"); //$NON-NLS-1$
			}
		}

		return elements;
	}

}
