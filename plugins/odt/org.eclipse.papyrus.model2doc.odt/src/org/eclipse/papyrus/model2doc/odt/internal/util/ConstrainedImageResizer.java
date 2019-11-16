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
 * This resizer allows to fit an image to display it in a given space.
 * The resize is done keeping the ratio width/height
 */
public class ConstrainedImageResizer implements IImageResizer {

	/**
	 * the max available width
	 */
	private final int maxWidth;

	/**
	 * the max available height
	 */
	private final int maxHeight;

	/**
	 *
	 * Constructor.
	 *
	 * @param maxWidth
	 * @param maxHeight
	 */
	public ConstrainedImageResizer(final int maxWidth, final int maxHeight) {
		this.maxWidth = maxWidth;
		this.maxHeight = maxHeight;
	}

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
	public XTextContent resizeImage(final XTextContent graphicContent, final String imagePath, final XTextDocument xTextDocument, final XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext) {
		Size realSizeImage = ImageUtil.getSize100mm(imagePath, xMultiComponentFactory, xComponentContext);

		// code for maximize in landscape
		if (this.maxHeight > 0 && this.maxWidth > 0 && realSizeImage.Width > 0 && realSizeImage.Height > 0) {
			Size resizeImage = new Size(realSizeImage.Width, realSizeImage.Height);
			Size writableSize = new Size(maxWidth, maxHeight);

			float width = ((float) realSizeImage.Width) / ((float) writableSize.Width);
			float height = ((float) realSizeImage.Height) / ((float) writableSize.Height);
			if (height < width) {
				resizeImage.Height = Math.round((resizeImage.Height) / width);
				resizeImage.Width = Math.round((resizeImage.Width) / width);

			}
			if (width < height) {
				resizeImage.Height = Math.round((resizeImage.Height) / height);
				resizeImage.Width = Math.round((resizeImage.Width) / height);
			}

			PropertySetUtil.setProperty(graphicContent, SizeConstants.WIDTH, resizeImage.Width);
			PropertySetUtil.setProperty(graphicContent, SizeConstants.HEIGHT, resizeImage.Height);

			// TODO : seem not working...
			PropertySetUtil.setProperty(graphicContent, "RelativeHeightRelation", "scale"); //$NON-NLS-1$ //$NON-NLS-2$
			PropertySetUtil.setProperty(graphicContent, "RelativeWidthRelation", "100"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		return graphicContent;
	}
}
