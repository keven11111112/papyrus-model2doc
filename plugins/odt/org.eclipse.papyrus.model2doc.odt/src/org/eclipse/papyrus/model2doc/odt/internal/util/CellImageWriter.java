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

import org.eclipse.papyrus.model2doc.odt.internal.constants.ParagraphPropertiesConstants;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;

import com.sun.star.text.TextContentAnchorType;
import com.sun.star.text.XTextCursor;

/**
 * This Writer allows to write an image in a cell of an XTextTable
 */
public class CellImageWriter extends ParagraphImageWriter {

	/**
	 * for the usage of the space in the cell (particularly the space before and after the the inserted image, the default value is <code>false</code>
	 */
	private boolean useAllCellSpace = false;

	/**
	 * Constructor.
	 *
	 * @param odtEditor
	 */
	public CellImageWriter(final ODTEditor odtEditor) {
		super(odtEditor);
	}

	/**
	 * Constructor.
	 *
	 * @param odtEditor
	 * @param imageResizer
	 */
	public CellImageWriter(final ODTEditor odtEditor, final IImageResizer imageResizer) {
		super(odtEditor, imageResizer);
	}



	/**
	 * Constructor.
	 *
	 * @param odtEditor
	 * @param imageResizer
	 * @param imageCropper
	 */
	public CellImageWriter(final ODTEditor odtEditor, final IImageResizer imageResizer, final IImageCropper imageCropper) {
		super(odtEditor, imageResizer, imageCropper);
	}

	/**
	 *
	 * @param useAllCellSpace
	 *            if <code>true</code>, we will remove the space before and after the inserted image
	 */
	public void setUseAllSpace(final boolean useAllCellSpace) {
		this.useAllCellSpace = useAllCellSpace;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.odt.internal.util.ParagraphImageWriter#configure()
	 *
	 */
	@Override
	protected void configure() {
		super.configure();
		setGenerateCaption(false);
		setEndParagraph(false);
		setWrapImageInTextFrame(false);
		setImageAnchor(TextContentAnchorType.AS_CHARACTER);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.odt.internal.util.ParagraphImageWriter#writeImage(com.sun.star.text.XTextCursor, java.lang.String, java.lang.String)
	 *
	 * @param xTextCursor
	 * @param imageFilePath
	 * @param caption
	 */
	@Override
	public void writeImage(final XTextCursor xTextCursor, final String imageFilePath, final String caption) {
		super.writeImage(xTextCursor, imageFilePath, caption);
		if (this.useAllCellSpace) {
			PropertySetUtil.setProperty(xTextCursor, ParagraphPropertiesConstants.PARA_TOP_MARGIN, 0);
			PropertySetUtil.setProperty(xTextCursor, ParagraphPropertiesConstants.PARA_BOTTOM_MARGIN, 0);
		}
	}

}
