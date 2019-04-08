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

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class create the DocumentStructure Body for the DocumentStructureTempate Body
 *
 */
public class BodyMapper extends AbstractEMFTemplateToStructureMapper<Body, org.eclipse.papyrus.model2doc.emf.documentstructure.Body> {

	/**
	 *
	 * Constructor.
	 *
	 */
	public BodyMapper() {
		super(TEMPLATE_EPACKAGE.getBody(), STRUCTURE_EPACKAGE.getBody());
	}

	/**
	 * @param mappingService
	 * @param documentStructureElement
	 * @param modelElement
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 *
	 * @return
	 */
	@Override
	protected Collection<org.eclipse.papyrus.model2doc.emf.documentstructure.Body> doMap(final IMappingService mappingService, final Body documentStructureElement, final EObject modelElement) {
		final org.eclipse.papyrus.model2doc.emf.documentstructure.Body body = STRUCTURE_EFACTORY.createBody();
		final Iterator<IBodyPartTemplate> iter = documentStructureElement.getBodyPartTemplate().iterator();
		while (iter.hasNext()) {
			final IBodyPartTemplate currentBodyPartemplate = iter.next();
			final Collection<EObject> result = mappingService.map(currentBodyPartemplate, modelElement, STRUCTURE_EPACKAGE.getBodyPart());
			body.getBodyPart().addAll((Collection<? extends BodyPart>) result);
		}
		return Collections.singleton(body);
	}

}
