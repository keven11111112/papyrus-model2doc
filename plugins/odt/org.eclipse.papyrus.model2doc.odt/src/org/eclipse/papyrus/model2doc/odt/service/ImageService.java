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
package org.eclipse.papyrus.model2doc.odt.service;

import com.sun.star.awt.Size;
import com.sun.star.graphic.XGraphic;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextDocument;
import com.sun.star.uno.XComponentContext;

/**
 * Service interface for Image management.
 *
 * @since 3.0
 */
public interface ImageService {

	/**
	 * Resize image if it size is greater than document size.
	 * 
	 * @param graphicContent 
	 * @param imagePath
	 * @param xTextDocument 
	 * @param xMultiComponentFactory
	 * @param xComponentContext
	 * 
	 * @return
	 * 			graphicContent resized if necessary. 
	 */
	public XTextContent resizeImage(final XTextContent graphicContent, String imagePath, XTextDocument xTextDocument, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext);
	
	/**
	 * Get Size 100mm.
	 * 
	 * @param imagePath
	 * @param xMultiComponentFactory 
	 * @param xComponentContext 
	 * @return
	 */
	public Size getSize100mm(String imagePath, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext);

	/**
	 * Load image file.
	 * 
	 * @param imagePath
	 * @param xMultiComponentFactory
	 * @param xComponentContext
	 * @return
	 */
	public XGraphic loadImageFile(String imagePath, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext);

	/**
	 * Get "Height" property name;
	 * 
	 * @return "Height"
	 */
	public String getHeightPropertyName();

	/**
	 * Get "Width" property name;
	 * 
	 * @return "Width"
	 */
	public String getWidthPropertyName();
	
	/**
	 * Get "Size100thMM" property name;
	 * 
	 * @return "Size100thMM"
	 */
	public String getSize100mmPropertyName();
	
}
