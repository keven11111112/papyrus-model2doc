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

import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;

import com.sun.star.text.TextContentAnchorType;

/**
 * This Writer allows to write an image in a cell of an XTextTable
 */
public class CellImageWriter extends ParagraphImageWriter {

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

}
