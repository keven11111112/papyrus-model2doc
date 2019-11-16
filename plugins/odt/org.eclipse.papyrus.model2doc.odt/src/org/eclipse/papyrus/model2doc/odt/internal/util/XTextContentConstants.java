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

import com.sun.star.text.GraphicCrop;
import com.sun.star.text.XTextContent;

/**
 * Constants used for {@link XTextContent}
 */
public interface XTextContentConstants {

	/**
	 * The property name to edit the crop for inserted image. The value is a {@link GraphicCrop}
	 */
	public static final String GRAPHIC_CROP = "GraphicCrop"; // $NON-NLS-1$
}
