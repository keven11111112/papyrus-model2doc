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

import com.sun.star.text.XTextContent;

/**
 * This image cropper does nothing
 */
public final class StubImageCropper implements IImageCropper {

	/**
	 * @see org.eclipse.papyrus.model2doc.odt.internal.util.IImageCropper#crop(com.sun.star.text.XTextContent)
	 *
	 * @param xTextContent
	 */
	@Override
	public void crop(XTextContent xTextContent) {
		// do nothing
	}
}
