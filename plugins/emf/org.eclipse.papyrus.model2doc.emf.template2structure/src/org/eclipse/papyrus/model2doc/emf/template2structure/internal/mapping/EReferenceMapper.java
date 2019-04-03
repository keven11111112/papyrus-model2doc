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
 *   CEA LIST - Initial API and implementation
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
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.TemplateToStructureMappingService;

/**
 * @author VL222926
 *
 */
public class EReferenceMapper extends AbstractEMFTemplateToStructureMapper<EReferencePartTemplate, BodyPart> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public EReferenceMapper() {
		super(TEMPLATE_EPACKAGE.getEReferencePartTemplate(), STRUCTURE_EPACKAGE.getBodyPart());
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @param referencePartTemplate
	 * @param semanticModelElement
	 * @return
	 */
	@Override
	protected Collection<BodyPart> doMap(final EReferencePartTemplate referencePartTemplate, final EObject semanticModelElement) {
		Collection<BodyPart> returnedElements = new ArrayList<>();

		final Collection<EObject> matchingElements = getMatchingReferencedEObjects(referencePartTemplate, semanticModelElement);
		if (matchingElements.isEmpty()) {
			return null;
		}
		Title title = null;
		if (referencePartTemplate.isGenerate()) {
			if (referencePartTemplate.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(getSectionTitle(referencePartTemplate));
				returnedElements.add(title);
			}
		}
		final Iterator<EObject> iter = matchingElements.iterator();
		while (iter.hasNext()) {
			final Iterator<ISubBodyPartTemplate> subBodyPartTemplate = referencePartTemplate.getSubBodyPartTemplate().iterator();
			while (subBodyPartTemplate.hasNext()) {
				final ISubBodyPartTemplate currentObjectPartTemplate = subBodyPartTemplate.next();
				final Collection<EObject> result = TemplateToStructureMappingService.INSTANCE.map(currentObjectPartTemplate, iter.next(), STRUCTURE_EPACKAGE.getBodyPart());
				if (result == null) {
					continue;
				}
				if (title != null) {
					title.getSubBodyPart().addAll((Collection<? extends BodyPart>) result);
				} else {
					returnedElements.addAll((Collection<? extends BodyPart>) result);
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
					Activator.log.warn(NLS.bind("The object {0} doesn't provide the EReference {1}", semanticModelElement, ref));
				}
			} else {
				Activator.log.warn("The EReference is null");
			}
		}

		return elements;
	}

}
