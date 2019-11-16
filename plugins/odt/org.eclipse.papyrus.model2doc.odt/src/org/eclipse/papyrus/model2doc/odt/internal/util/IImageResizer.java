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
 * Common interface for image resizer
 */
public interface IImageResizer {

	/**
	 * This methods is used to resize inserted image. The edited properties are owned by the {@link XTextContent} and are
	 * <ul>
	 * <li>Width</li>
	 * <li>Height</li>
	 * <li>RelativeHeightRelation</li>
	 * <li>RelativeWidthRelation</li>
	 * </ul>
	 *
	 * @param graphicContent
	 * @param imagePath
	 * @param xTextDocument
	 * @param xMultiComponentFactory
	 * @param xComponentContext
	 * @return
	 */
	public XTextContent resizeImage(XTextContent graphicContent, String imagePath, XTextDocument xTextDocument, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext);
}
