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

package org.eclipse.papyrus.model2doc.gmf.template2structure.internal.mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateUtils;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDiagramView;
import org.eclipse.papyrus.model2doc.gmf.documentstructuretemplate.GMFDocumentStructureTemplatePackage;

/**
 * This class does the mapping between {@link GMFDiagramViewMapper} and {@link Image}
 */
public class GMFDiagramViewMapper extends AbstractTemplateToStructureMapper<GMFDiagramView> {

	/**
	 * Constructor.
	 */
	public GMFDiagramViewMapper() {
		super(GMFDocumentStructureTemplatePackage.eINSTANCE.getGMFDiagramView(), BodyPart.class);
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
	protected <T> List<T> doMap(final IMappingService mappingService, final GMFDiagramView gmfDiagramView, final EObject semanticModelElement, final Class<T> returnedClassType) {
		if (false == gmfDiagramView.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}
		if (false == gmfDiagramView.isGenerate()) {
			// This element can't have children, so if isGenerate() returns false, we go out!
			return Collections.emptyList();
		}
		final List<T> returnedValue = new ArrayList<>();


		final Iterator<Diagram> diagramIter = gmfDiagramView.getMatchingDiagrams(semanticModelElement).iterator();
		Title title = null;
		if (diagramIter.hasNext() && gmfDiagramView.isGenerateTitle()) {
			title = DocumentStructureFactory.eINSTANCE.createTitle();
			title.setTitle(gmfDiagramView.buildPartTemplateTitle(semanticModelElement));
			returnedValue.add(returnedClassType.cast(title));
		}
		while (diagramIter.hasNext()) {
			Image image = DocumentStructureFactory.eINSTANCE.createImage();
			Diagram current = diagramIter.next();
			image.setCaption(current.getName());

			// calculate the image path output //TODO : embed me in the model
			final DocumentTemplate t = DocumentStructureTemplateUtils.getDocumentTemplate(gmfDiagramView);
			final IDocumentStructureGeneratorConfiguration conf = t.getDocumentStructureGeneratorConfiguration();

			// we remove the whitespace in the name of the diagram
			final StringBuilder imageNameBuilder = new StringBuilder(current.getName().replaceAll("\\s+", "")); //$NON-NLS-1$ //$NON-NLS-2$
			if (current.eResource() instanceof XMIResource) {
				final String XMI_ID = ((XMIResource) current.eResource()).getID(current);
				if (null != XMI_ID && false == XMI_ID.isEmpty()) {
					imageNameBuilder.append("_"); //$NON-NLS-1$
					imageNameBuilder.append(XMI_ID);
				}
			}

			String imagePath = GeneratorConfigurationOperations.getImageFileLocalPath(conf, imageNameBuilder.toString(), GMFDiagramImageUtils.SVG_EXTENSION);
			imagePath = imagePath.replaceAll("file:/", ""); //$NON-NLS-1$ //$NON-NLS-2$
			GMFDiagramImageUtils.generateImageOfDiagram(current, imagePath);
			image.setImagePath(imagePath);
			if (null == title) {
				returnedValue.add(returnedClassType.cast(image));
			} else {
				title.getSubBodyParts().add(image);
			}
		}
		return returnedValue;
	}

}
