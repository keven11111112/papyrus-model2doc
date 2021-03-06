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

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.InsertFileTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractBodyPartTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * Mapper for InsertFileTemplate element
 */
public class InsertFileTemplateMapper extends AbstractBodyPartTemplateToStructureMapper<org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.InsertFileTemplate> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public InsertFileTemplateMapper() {
		super(DocumentStructureTemplatePackage.eINSTANCE.getInsertFileTemplate(), BodyPart.class);
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

		List<T> returnedElements = new ArrayList<>();

		if (insertFileTemplate.isGenerate()) {
			final InsertedFile insertedFile = STRUCTURE_EFACTORY.createInsertedFile();
			// we include the file into the document structure only if we are able to find the file
			if (isFileExist(insertFileTemplate)) {
				final String path = URI.decode(insertFileTemplate.getFileAccessor().createInputFilePlatformURI().toString());
				insertedFile.setFilePath(path);
				returnedElements.add(expectedReturnedClass.cast(insertedFile));
			}
		}

		return buildMapperResult(insertFileTemplate, semanticModelElement, expectedReturnedClass, returnedElements);
	}

	/**
	 *
	 * @param insertFileTemplate
	 *            the inserted file template
	 * @return
	 *         <code>true</code> if the file exists
	 */
	protected boolean isFileExist(final InsertFileTemplate insertFileTemplate) {
		final String ecoreFilePrefix = "file:"; //$NON-NLS-1$
		final String emptyString = ""; //$NON-NLS-1$

		URL url = insertFileTemplate.getFileAccessor().createInputFileURL();
		if (url != null) {
			File file = new File(URI.decode(url.getPath()).replaceFirst(ecoreFilePrefix, emptyString));
			return file.exists();
		}
		return false;
	}

}
