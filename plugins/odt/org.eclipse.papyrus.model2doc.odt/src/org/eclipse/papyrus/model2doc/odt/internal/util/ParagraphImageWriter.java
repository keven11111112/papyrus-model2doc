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

import org.eclipse.core.runtime.Assert;
import org.eclipse.papyrus.model2doc.odt.Activator;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOService;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOServiceImpl;

import com.sun.star.beans.XPropertySet;
import com.sun.star.container.XNameContainer;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.text.SizeType;
import com.sun.star.text.TextContentAnchorType;
import com.sun.star.text.WrapTextMode;
import com.sun.star.text.XParagraphCursor;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextCursor;
import com.sun.star.text.XTextFrame;
import com.sun.star.uno.UnoRuntime;

/**
 * This Writer is configured to insert an Image in a Paragraph
 */
public class ParagraphImageWriter {

	// TODO remove me
	private static final ODTFileIOService odtFileIOService = new ODTFileIOServiceImpl();

	/**
	 *
	 */
	private ODTEditor odtEditor;

	/**
	 * if <code>true</code>, we will generate a caption under the image
	 */
	private boolean generateCaption;

	/**
	 * if <code>true</code>, we will end the paragraph (new line) at the end of the insertion
	 */
	private boolean endParagraph;

	/**
	 * The image resize to use
	 */
	private IImageResizer imageResizer;

	/**
	 * if <code>true</code>, the image will be inserted in a TextFrame, itself inserted in the final paragraph
	 */
	private boolean wrapImageInTextFrame;

	/**
	 * The kind of anchor to use to insert the textFrame (if we create one)
	 */
	private TextContentAnchorType textFrameAnchor;

	/**
	 * The kind of anchor to use to insert the image
	 */
	private TextContentAnchorType imageAnchor;

	/**
	 * The image cropper to use
	 */
	private IImageCropper imageCropper;

	/**
	 *
	 * Constructor.
	 *
	 * @param odtEditor
	 */
	public ParagraphImageWriter(final ODTEditor odtEditor) {
		this(odtEditor, null);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param odtEditor
	 * @param imageResizer
	 */
	public ParagraphImageWriter(final ODTEditor odtEditor, final IImageResizer imageResizer) {
		this(odtEditor, imageResizer, null);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param odtEditor
	 * @param imageResizer
	 * @param imageCropper
	 */
	public ParagraphImageWriter(final ODTEditor odtEditor, final IImageResizer imageResizer, final IImageCropper imageCropper) {
		Assert.isNotNull(odtEditor);
		this.odtEditor = odtEditor;
		this.imageResizer = imageResizer != null ? imageResizer : new AdaptToPageImageResizer();
		this.imageCropper = imageCropper != null ? imageCropper : new StubImageCropper();
		configure();
	}

	/**
	 * This method allows to apply default configuration for Parahraph to this IImageWriter
	 */
	protected void configure() {
		this.endParagraph = true;
		this.wrapImageInTextFrame = true;
		this.generateCaption = true;
		this.textFrameAnchor = TextContentAnchorType.AS_CHARACTER;
		this.imageAnchor = TextContentAnchorType.AT_CHARACTER;
	}

	/**
	 * @param textFrameAnchor
	 *            the textFrameAnchor to set
	 */
	public final void setTextFrameAnchor(final TextContentAnchorType textFrameAnchor) {
		this.textFrameAnchor = textFrameAnchor;
	}

	/**
	 * @param imageAnchor
	 *            the imageAnchor to set
	 */
	public final void setImageAnchor(final TextContentAnchorType imageAnchor) {
		this.imageAnchor = imageAnchor;
	}

	/**
	 * @param generateCaption
	 *            the generateCaption to set
	 */
	public final void setGenerateCaption(final boolean generateCaption) {
		this.generateCaption = generateCaption;
	}

	/**
	 * @param endPAragraph
	 *            if <code>true</code> we will add an empty line after the image insertion
	 */
	public final void setEndParagraph(final boolean endParagraph) {
		this.endParagraph = endParagraph;
	}

	/**
	 * @param imageResizer
	 *            the imageResizer to set
	 */
	public final void setImageResizer(final IImageResizer imageResizer) {
		this.imageResizer = imageResizer != null ? imageResizer : new AdaptToPageImageResizer();
	}

	/**
	 * @param wrapImageInTextFrame
	 *            if <code>true</code>, the image will be wrapped in a TextFrame before to be inserted in the document
	 */
	public final void setWrapImageInTextFrame(final boolean wrapImageInTextFrame) {
		this.wrapImageInTextFrame = wrapImageInTextFrame;
	}

	/**
	 *
	 * @param imageCropper
	 *            the image cropper to use during the image insertion
	 */
	public final void setImageCropper(final IImageCropper imageCropper) {
		this.imageCropper = imageCropper != null ? imageCropper : new StubImageCropper();
	}

	/**
	 *
	 * @return
	 *         the {@link XTextFrame} created to insert the image
	 */
	private XTextFrame createTextFrameForImage() {
		XTextFrame textFrame = null;
		XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();
		try {

			Object tmp = xMultiServiceFactory.createInstance("com.sun.star.text.TextFrame");//$NON-NLS-1$

			textFrame = UnoRuntime.queryInterface(XTextFrame.class, tmp);
			XPropertySet framePropertySet = UnoRuntime.queryInterface(XPropertySet.class, textFrame);
			framePropertySet.setPropertyValue("SizeType", SizeType.VARIABLE); //$NON-NLS-1$
			framePropertySet.setPropertyValue("AnchorType", this.textFrameAnchor); //$NON-NLS-1$
			framePropertySet.setPropertyValue("ZOrder", 1);// not really sure //$NON-NLS-1$
			framePropertySet.setPropertyValue("TextWrap", WrapTextMode.THROUGH); //$NON-NLS-1$

			// remove the margin around the image
			framePropertySet.setPropertyValue(BaseFramePropertiesConstants.LEFT_BORDER_DISTANCE, 0);
			framePropertySet.setPropertyValue(BaseFramePropertiesConstants.RIGHT_BORDER_DISTANCE, 0);
			framePropertySet.setPropertyValue(BaseFramePropertiesConstants.TOP_BORDER_DISTANCE, 0);
			framePropertySet.setPropertyValue(BaseFramePropertiesConstants.BOTTOM_BORDER_DISTANCE, 0);
		} catch (com.sun.star.uno.Exception e) {
			Activator.log.error(e);
		}
		return textFrame;
	}

	/**
	 *
	 * @param xTextCursor
	 *            the {@link XTextCursor}
	 * @param imageFilePath
	 *            the path of the image to insert
	 * @param caption
	 *            the caption
	 */
	public void writeImage(final XTextCursor xTextCursor, String imageFilePath, final String caption) {
		if (false == imageFilePath.startsWith(odtFileIOService.getODTFilePrefix())) {
			imageFilePath = odtFileIOService.getODTFilePrefix() + imageFilePath;
		}

		try {
			XMultiServiceFactory xMultiServiceFactory = odtEditor.getXMultiServiceFactory();

			// Creating the service GraphicObject
			Object graphicObject = xMultiServiceFactory.createInstance("com.sun.star.text.TextGraphicObject"); //$NON-NLS-1$

			// Creating TextContent for GraphicObject
			XTextContent graphicContent = UnoRuntime.queryInterface(XTextContent.class, graphicObject);

			// Creating bitmap container service
			XNameContainer bitmapContainer = UnoRuntime.queryInterface(XNameContainer.class, xMultiServiceFactory.createInstance("com.sun.star.drawing.BitmapTable")); //$NON-NLS-1$

			// Inserting image to the container
			bitmapContainer.insertByName(imageFilePath, imageFilePath);

			PropertySetUtil.setProperty(graphicContent, "AnchorType", this.imageAnchor); //$NON-NLS-1$
			PropertySetUtil.setProperty(graphicContent, "GraphicURL", bitmapContainer.getByName(imageFilePath)); //$NON-NLS-1$

			graphicContent = imageResizer.resizeImage(graphicContent, imageFilePath, odtEditor.getXTextDocument(), odtEditor.getXMultiComponentFactory(), odtEditor.getXComponentContext());


			XTextCursor localCursor = xTextCursor;
			if (this.wrapImageInTextFrame) {
				final XTextFrame textFrame = createTextFrameForImage();
				XPropertySet framePropertySet = UnoRuntime.queryInterface(XPropertySet.class, textFrame);
				XPropertySet graphicPropSet = UnoRuntime.queryInterface(XPropertySet.class, graphicContent);
				Object heightValue = graphicPropSet.getPropertyValue("Height"); //$NON-NLS-1$
				Object widthValue = graphicPropSet.getPropertyValue("Width"); //$NON-NLS-1$

				framePropertySet.setPropertyValue("Height", heightValue);// TODO don't work, and should be on the next level... //$NON-NLS-1$
				framePropertySet.setPropertyValue("Width", widthValue); //$NON-NLS-1$
				xTextCursor.getText().insertTextContent(xTextCursor, textFrame, false);
				localCursor = textFrame.getText().createTextCursor();
			}

			XParagraphCursor paragraphCursor = UnoRuntime.queryInterface(XParagraphCursor.class, localCursor);
			XPropertySet paraSet = UnoRuntime.queryInterface(XPropertySet.class, paragraphCursor);

			paraSet.setPropertyValue("ParaStyleName", "Figure");// it works!!! in fact we can't push style which have not been declared and which don't exist by default //$NON-NLS-1$ //$NON-NLS-2$

			localCursor.getText().insertTextContent(localCursor, graphicContent, false);
			localCursor.gotoEnd(true);

			this.imageCropper.crop(graphicContent);

			if (this.generateCaption) {
				addCaption(localCursor, caption);
			}

			if (this.endParagraph) {
				WriteUtil.endParagraph(xTextCursor);
			}
		} catch (Exception e) {
			Activator.log.error(e);
		}
	}

	/**
	 *
	 * @param xTextCursor
	 *            the xTextCursor
	 * @param caption
	 *            the caption to insert
	 */
	protected void addCaption(final XTextCursor xTextCursor, final String caption) {
		if (!this.generateCaption) {
			return;
		}
		CaptionUtils.writeFigureCaption(xTextCursor, caption, this.odtEditor);
	}


}
