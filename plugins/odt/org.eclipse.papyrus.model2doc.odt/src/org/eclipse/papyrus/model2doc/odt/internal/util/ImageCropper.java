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

import org.eclipse.papyrus.model2doc.odt.Activator;

import com.sun.star.beans.PropertyVetoException;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.text.GraphicCrop;
import com.sun.star.text.XTextContent;
import com.sun.star.uno.UnoRuntime;

/**
 * The cropper must be called AFTER the image insertion in the document. If not the crop property is not found.
 * TODO -> we can probably bypass this behavior, creating is ourself...
 */
public class ImageCropper implements IImageCropper {

	private final int topCrop;

	private final int bottomCrop;

	private final int leftCrop;

	private final int rightCrop;

	/**
	 *
	 * Constructor.
	 *
	 * @param crop
	 *            the crop value to apply on all sides of the image
	 */
	public ImageCropper(final int crop) {
		this(crop, crop, crop, crop);
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param topCrop
	 *            the crop to apply on the top side of the image
	 * @param bottomCrop
	 *            the crop to apply on the bottom side of the image
	 * @param leftCrop
	 *            the crop to apply on the left side of the image
	 * @param rightCrop
	 *            the crop to apply on the right side of the image
	 *
	 */
	public ImageCropper(final int topCrop, final int bottomCrop, final int leftCrop, final int rightCrop) {
		this.topCrop = topCrop;
		this.bottomCrop = bottomCrop;
		this.leftCrop = leftCrop;
		this.rightCrop = rightCrop;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.odt.internal.util.IImageCropper#crop(com.sun.star.text.XTextContent)
	 *
	 * @param xTextContent
	 */
	@Override
	public void crop(final XTextContent xTextContent) {
		final XPropertySet propertySet = UnoRuntime.queryInterface(XPropertySet.class, xTextContent);
		try {
			GraphicCrop crops = (GraphicCrop) propertySet.getPropertyValue(XTextContentConstants.GRAPHIC_CROP);
			crops.Top = this.topCrop;
			crops.Bottom = this.bottomCrop;
			crops.Left = this.leftCrop;
			crops.Right = this.rightCrop;
			propertySet.setPropertyValue(XTextContentConstants.GRAPHIC_CROP, crops);
		} catch (UnknownPropertyException e) {
			Activator.log.error(e);
		} catch (WrappedTargetException e) {
			Activator.log.error(e);
		} catch (IllegalArgumentException e) {
			Activator.log.error(e);
		} catch (PropertyVetoException e) {
			Activator.log.error(e);
		}
	}

}
