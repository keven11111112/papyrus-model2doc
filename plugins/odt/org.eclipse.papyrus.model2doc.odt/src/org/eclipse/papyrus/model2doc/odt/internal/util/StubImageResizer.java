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
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.internal.util;

import com.sun.star.awt.Size;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextDocument;
import com.sun.star.uno.XComponentContext;

/**
 * This image resizer doesn't resize the image
 */
public class StubImageResizer implements IImageResizer {

	/**
	 * @see org.eclipse.papyrus.model2doc.odt.internal.util.IImageResizer#resizeImage(com.sun.star.text.XTextContent, java.lang.String, com.sun.star.text.XTextDocument, com.sun.star.lang.XMultiComponentFactory, com.sun.star.uno.XComponentContext)
	 *
	 * @param graphicContent
	 * @param imagePath
	 * @param xTextDocument
	 * @param xMultiComponentFactory
	 * @param xComponentContext
	 * @return
	 */
	@Override
	public XTextContent resizeImage(XTextContent graphicContent, String imagePath, XTextDocument xTextDocument, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext) {
		Size realSizeImage = ImageUtil.getSize100mm(imagePath, xMultiComponentFactory, xComponentContext);

		PropertySetUtil.setProperty(graphicContent, SizeConstants.WIDTH, realSizeImage.Width);
		PropertySetUtil.setProperty(graphicContent, SizeConstants.HEIGHT, realSizeImage.Height);

		// TODO : seem not working...
		PropertySetUtil.setProperty(graphicContent, "RelativeHeightRelation", "100"); //$NON-NLS-1$ //$NON-NLS-2$
		PropertySetUtil.setProperty(graphicContent, "RelativeWidthRelation", "100"); //$NON-NLS-1$ //$NON-NLS-2$
		return graphicContent;
	}

}
