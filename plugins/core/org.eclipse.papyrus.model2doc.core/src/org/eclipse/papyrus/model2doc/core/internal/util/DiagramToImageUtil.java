/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.internal.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.infra.gmfdiag.common.model.NotationUtils;
import org.eclipse.papyrus.infra.gmfdiag.common.utils.DiagramUtils;
import org.eclipse.uml2.uml.Element;

import org.eclipse.papyrus.model2doc.core.Activator;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescriptionFactory;

/**
 * Utility class to render a diagram to an image file.
 *
 */
public class DiagramToImageUtil {

	private static final String SPACE = " "; //$NON-NLS-1$

	private static final String UNDERLINE = "_"; //$NON-NLS-1$

	private static final String SVG_EXTENSION = ".svg"; //$NON-NLS-1$

	/**
	 * Constructor.
	 *
	 */
	private DiagramToImageUtil() {
		// to avoid instantiation
	}

	/**
	 * Get images generated of diagrams directly owned by owner (an UML Element).
	 * 
	 * @param owner
	 *            the UML Element
	 * @param outputFolder
	 * @return
	 */
	public static List<ImageDescription> getImagesOfDiagrams(Element owner, String outputFolder) {
		List<ImageDescription> images = new ArrayList<ImageDescription>();
		String pathRoot = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		// Retrieve all diagrams directly owned by owner
		List<Diagram> diagrams = getAllDiagrams(owner);

		if (!diagrams.isEmpty()) {
			// Generate image for each diagram
			Iterator<Diagram> iteratorDiagrams = diagrams.iterator();
			while (iteratorDiagrams.hasNext()) {
				images.add(generateImageOfDiagram(iteratorDiagrams.next(), pathRoot));
			}
		}

		return images;
	}

	/**
	 * Get diagrams directly owned by owner (an UML Element).
	 * 
	 * @param owner
	 *            the UML Element
	 * @return
	 */
	public static List<Diagram> getAllDiagrams(Element owner) {
		List<Diagram> diagrams = new ArrayList<Diagram>();
		Iterable<EObject> roots = NotationUtils.getAllNotations((owner).eResource().getResourceSet());

		for (EObject root : roots) {
			if ((root instanceof Diagram) && (EcoreUtil.equals(DiagramUtils.getOwner((Diagram) root), owner))) {
				diagrams.add((Diagram) root);
			}
		}
		return diagrams;
	}

	/**
	 * Generate image of diagram.
	 * 
	 * @param diagram
	 * @param pathRoot
	 * @return
	 */
	public static ImageDescription generateImageOfDiagram(Diagram diagram, String pathRoot) {
		ImageDescription image = ImageDescriptionFactory.INSTANCE.getDefaultImageDescription();
		StringBuilder fullPath = new StringBuilder();
		fullPath.append(pathRoot);
		fullPath.append(File.separator);
		fullPath.append(generateImageFileName(diagram));
		
		Path imagePath = new Path(fullPath.toString());

		if (!new File(imagePath.toString()).exists()) {
			CopyToImageUtil copyImageUtil = new CopyToImageUtil();

			try {
				copyImageUtil.copyToImage(diagram, imagePath, ImageFileFormat.SVG, new NullProgressMonitor(),
						PreferencesHint.USE_DEFAULTS);
			} catch (CoreException e) {
				Activator.log.error(e);
			}
		}

		image.setPath(imagePath.toString());
		image.setSubtitle(diagram.getName());

		return image;
	}

	/**
	 * Generate file name of image.
	 * 
	 * @param diagram
	 * @return
	 */
	private static String generateImageFileName(Diagram diagram) {
		StringBuilder imageFileNameBuilder = new StringBuilder();
		String fileName = diagram.getName().replaceAll(SPACE, UNDERLINE);
		imageFileNameBuilder.append(fileName);
		imageFileNameBuilder.append(new Date().getTime());
		imageFileNameBuilder.append(SVG_EXTENSION);

		return imageFileNameBuilder.toString();
	}
}
