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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.InsertFileTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * Mapper for InsertFileTemplate element
 */
public class InsertFileTemplateMapper extends AbstractEMFTemplateToStructureMapper<org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.InsertFileTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public InsertFileTemplateMapper() {
		super(TEMPLATE_EPACKAGE.getInsertFileTemplate(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param <T>
	 * @param mappingService
	 * @param documentTemplateElement
	 * @param semanticModelElement
	 * @param expectedReturnedClass
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final InsertFileTemplate insertFileTemplate, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		if (false == insertFileTemplate.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		Title title = null;
		List<T> returnedElements = new ArrayList<>();
		if (insertFileTemplate.isGenerate()) {
			if (insertFileTemplate.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(insertFileTemplate.buildPartTemplateTitle(semanticModelElement));
				returnedElements.add(expectedReturnedClass.cast(title));
			}
		}

		final InsertedFile insertedFile = STRUCTURE_EFACTORY.createInsertedFile();
		final String path = GeneratorConfigurationOperations.getFilePathInLocalPath(insertFileTemplate, insertFileTemplate.getFilePath());
		insertedFile.setFilePath(path);

		if (null != title) {
			title.getSubBodyParts().add(insertedFile);
		} else {
			returnedElements.add(expectedReturnedClass.cast(insertedFile));
		}
		return returnedElements;
	}

}
