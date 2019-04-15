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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.gmf.gmfdocumentstructuretemplate.GMFDiagramView;
import org.eclipse.papyrus.model2doc.gmf.gmfdocumentstructuretemplate.GmfDocumentStructureTemplatePackage;

/**
 * This class does the mapping between {@link GMFDiagramViewMapper} and {@link Image}
 */
public class GMFDiagramViewMapper extends AbstractTemplateToStructureMapper<GMFDiagramView> {

	/**
	 * Constructor.
	 */
	public GMFDiagramViewMapper() {
		super(GmfDocumentStructureTemplatePackage.eINSTANCE.getGMFDiagramView(), BodyPart.class);
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
		if (false == gmfDiagramView.isGenerate()) {
			// This element can't have children, so if isGenerate() returns false, we go out!
			return Collections.emptyList();
		}
		final List<T> returnedValue = new ArrayList<>();


		final Iterator<Diagram> diagramIter = gmfDiagramView.getMatchingDiagrams(semanticModelElement).iterator();
		Title title = null;
		if (diagramIter.hasNext() && gmfDiagramView.isGenerateTitle()) {
			title = DocumentStructureFactory.eINSTANCE.createTitle();
			title.setTitle(getSectionTitle(gmfDiagramView, NotationPackage.eINSTANCE.getDiagram()));
			returnedValue.add(returnedClassType.cast(title));
		}
		while (diagramIter.hasNext()) {
			Image image = DocumentStructureFactory.eINSTANCE.createImage();
			Diagram current = diagramIter.next();
			image.setCaption(current.getName());

			// calculate the image path output //TODO : embed me in the model
			DocumentTemplate t = null;
			EObject parent = gmfDiagramView.eContainer();
			while (t == null && parent != null) {
				if (parent instanceof DocumentTemplate) {
					t = (DocumentTemplate) parent;
				} else {
					parent = parent.eContainer();
				}
			}
			final IDocumentStructureGeneratorConfiguration conf = t.getDocumentStructureGenerator();

			String imagePath = GeneratorConfigurationOperations.getImageFileLocalPath(conf, current.getName(), GMFDiagramImageUtils.SVG_EXTENSION);
			imagePath = imagePath.replaceAll("file:/", ""); //$NON-NLS-1$ //$NON-NLS-2$
			GMFDiagramImageUtils.generateImageOfDiagram(current, imagePath);
			image.setImagePath(imagePath);
			if (null == title) {
				returnedValue.add(returnedClassType.cast(image));
			} else {
				title.getSubBodyPart().add(image);
			}
		}
		return returnedValue;
	}


	// TODO : must be moved in an upper plugin
	protected String getSectionTitle(final GMFDiagramView partTemplate, EObject context) {// TODO in an upper class
		if (partTemplate.isGenerateTitle()) {
			final String customTitle = partTemplate.getCustomTitle();
			return (null == customTitle || customTitle.isEmpty()) ? getLabel(context) : customTitle;

		}

		return null;
	}

	// TODO : the label provider must be foudn using EMF Adapter
	// TODO : the label provider must be a parameter of the mapping method, to allow Papyrus internationalization
	protected String getLabel(final EObject eobject) { // TODO : factorize me
		final EClass eclass = eobject.eClass();
		final EStructuralFeature feature = eclass.getEStructuralFeature("name"); //$NON-NLS-1$
		if (feature instanceof EAttribute) {
			final Object result = eobject.eGet(feature);
			if (result instanceof String) {
				return (String) result;
			}
		}
		// Activator.log.warn(NLS.bind("No label found for {0}", eobject)); //$NON-NLS-1$
		return "No Label"; //$NON-NLS-1$

	}


}
