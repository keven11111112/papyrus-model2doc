/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 		Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.docx.internal.poi;

import java.math.BigInteger;

import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;

/**
 * This custom implementation allow to add some missing methods in the apache api
 */
public class CustomXWPFParagraph extends XWPFParagraph {

	/**
	 * Constructor.
	 *
	 * @param prgrph
	 * @param part
	 */
	public CustomXWPFParagraph(CTP prgrph, IBody part) {
		super(prgrph, part);
	}

	/**
	 * set numIlvl of Paragraph
	 *
	 * @param itemLevel
	 *            the new value of the numIlvl
	 */
	public void setItemLevel(int itemLevel) {
		if (getCTP().getPPr() == null) {
			getCTP().addNewPPr();
		}
		if (getCTP().getPPr().getNumPr() == null) {
			getCTP().getPPr().addNewNumPr();
		}
		if (getCTP().getPPr().getNumPr().getIlvl() == null) {
			getCTP().getPPr().getNumPr().addNewIlvl();
		}
		getCTP().getPPr().getNumPr().getIlvl().setVal(BigInteger.valueOf(itemLevel));
	}

}
