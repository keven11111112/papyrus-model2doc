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

import org.eclipse.papyrus.model2doc.odt.internal.util.PageUtil;
import org.eclipse.papyrus.model2doc.odt.internal.util.SizeConstants;
import com.sun.star.awt.Size;
import com.sun.star.text.XTextDocument;

/**
 * Implemented service class for Page management.
 * 
 * @since 2.0
 *
 */
public class PageServiceImpl implements PageService {

	@Override
	public Size getWritableSize(XTextDocument xTextDocument, String familyStyleName, String propertySetName) {
		return PageUtil.getWritableSize(xTextDocument, familyStyleName, propertySetName);
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
	public String getTopMarginPropertyName() {
		return SizeConstants.TOPMARGIN;
	}

	@Override
	public String getBottomMarginPropertyName() {
		return SizeConstants.BOTTOM_MARGIN;
	}

	@Override
	public String getLeftMarginPropertyName() {
		return SizeConstants.LEFT_MARGIN;
	}

	@Override
	public String getRightMarginPropertyName() {
		return SizeConstants.RIGHT_MARGIN;
	}

}
