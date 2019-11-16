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

import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextDocument;
import com.sun.star.uno.XComponentContext;

/**
 * This resizer adapts the image to the page size.
 * The image will be scaled to fit in the page
 */
public class AdaptToPageImageResizer implements IImageResizer {

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
		return ImageUtil.resizeImage(graphicContent, imagePath, xTextDocument, xMultiComponentFactory, xComponentContext);
	}

}
