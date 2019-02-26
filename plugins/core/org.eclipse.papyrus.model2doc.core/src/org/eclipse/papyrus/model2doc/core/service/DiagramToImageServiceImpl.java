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
package org.eclipse.papyrus.model2doc.core.service;

import java.util.List;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.uml2.uml.Element;

import org.eclipse.papyrus.model2doc.core.internal.util.DiagramToImageUtil;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;

/**
 * Implemented service class for rendering a diagram to an image file.
 * 
 * @since 3.0
 *
 */
public class DiagramToImageServiceImpl implements DiagramToImageService {

	@Override
	public List<ImageDescription> getImagesOfDiagrams(Element owner, String outputFolder) {
		return DiagramToImageUtil.getImagesOfDiagrams(owner, outputFolder);
	}

	@Override
	public List<Diagram> getAllDiagrams(Element owner) {
		return DiagramToImageUtil.getAllDiagrams(owner);
	}

	@Override
	public ImageDescription generateImageOfDiagram(Diagram diagram, String foldersPath) {
		return DiagramToImageUtil.generateImageOfDiagram(diagram, foldersPath);
	}

}
