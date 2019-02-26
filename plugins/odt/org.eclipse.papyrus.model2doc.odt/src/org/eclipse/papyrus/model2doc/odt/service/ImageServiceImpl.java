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

import org.eclipse.papyrus.model2doc.odt.internal.util.ImageUtil;
import org.eclipse.papyrus.model2doc.odt.internal.util.SizeConstants;
import com.sun.star.awt.Size;
import com.sun.star.graphic.XGraphic;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextDocument;
import com.sun.star.uno.XComponentContext;

/**
 * Implemented service class for Image management.
 * 
 * @since 3.0
 *
 */
public class ImageServiceImpl implements ImageService {

	@Override
	public XTextContent resizeImage(final XTextContent graphicContent, String imagePath, XTextDocument xTextDocument,
			XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext) {
		return ImageUtil.resizeImage(graphicContent, imagePath, xTextDocument, xMultiComponentFactory, xComponentContext);
	}

	@Override
	public Size getSize100mm(String imagePath, XMultiComponentFactory xMultiComponentFactory,
			XComponentContext xComponentContext) {
		return ImageUtil.getSize100mm(imagePath, xMultiComponentFactory, xComponentContext);
	}
	
	@Override
	public XGraphic loadImageFile(String imagePath, XMultiComponentFactory xMultiComponentFactory,
			XComponentContext xComponentContext) {
		return ImageUtil.loadImageFile(imagePath, xMultiComponentFactory, xComponentContext);
	}

	@Override
	public String getHeightPropertyName() {
		return SizeConstants.HEIGHT;
	}

	@Override
	public String getWidthPropertyName() {
		return SizeConstants.WIDTH;
	}

	@Override
	public String getSize100mmPropertyName() {
		return SizeConstants.SIZE100TH_MM;
	}

}
