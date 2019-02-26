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
package org.eclipse.papyrus.model2doc.odt.internal.util;

import org.eclipse.papyrus.model2doc.odt.Activator;
import com.sun.star.awt.Size;
import com.sun.star.beans.PropertyValue;
import com.sun.star.beans.UnknownPropertyException;
import com.sun.star.beans.XPropertySet;
import com.sun.star.graphic.XGraphic;
import com.sun.star.graphic.XGraphicProvider;
import com.sun.star.io.IOException;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.WrappedTargetException;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.text.XTextContent;
import com.sun.star.text.XTextDocument;
import com.sun.star.uno.Exception;
import com.sun.star.uno.UnoRuntime;
import com.sun.star.uno.XComponentContext;

/**
 * Utility class for Image management.
 *
 */
public class ImageUtil {
	
	/**
	 * Constructor.
	 *
	 */
	private ImageUtil() {
		// to avoid instantiation
	}
	
	/**
	 * Resize image if it size is greater than document size.
	 * 
	 * @param graphicContent 
	 * @param imagePath
	 * @param xTextDocument 
	 * @param xMultiComponentFactory
	 * @param xComponentContext
	 * 
	 * @return
	 * 			graphicContent resized if necessary. 
	 */
	public static XTextContent resizeImage(final XTextContent graphicContent, String imagePath, XTextDocument xTextDocument, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext) {
		Size realSizeImage = getSize100mm(imagePath, xMultiComponentFactory, xComponentContext);

		if ((realSizeImage.Width > 0) && (realSizeImage.Height > 0)) {
			Size resizeImage = new Size (realSizeImage.Width, realSizeImage.Height);
			Size writableSize = PageUtil.getWritableSize(xTextDocument, StyleConstants.PAGESTYLES_FAMILY, StyleConstants.STANDARD_PROPERTYSET);
			
			if (realSizeImage.Width > writableSize.Width) {
				float resizeProportion = (float) writableSize.Width / realSizeImage.Width;
				
				resizeImage.Width = writableSize.Width;
				resizeImage.Height = (int)Math.round(resizeImage.Height * resizeProportion);
			}
			
			if (resizeImage.Height > writableSize.Height) {
				float resizeProportion = (float) writableSize.Height / resizeImage.Height;
	
				resizeImage.Height = writableSize.Height;
				resizeImage.Width = (int)Math.round(resizeImage.Width * resizeProportion);
			}
			
			PropertySetUtil.setProperty(graphicContent, SizeConstants.WIDTH, resizeImage.Width);
			PropertySetUtil.setProperty(graphicContent, SizeConstants.HEIGHT, resizeImage.Height);
			
			//TODO : seem not working...
			PropertySetUtil.setProperty(graphicContent,"RelativeHeightRelation", "scale");
			PropertySetUtil.setProperty(graphicContent,"RelativeWidthRelation", "100");
		}
		return graphicContent;
	}

	/**
	 * Get Size 100mm.
	 * 
	 * @param imagePath
	 * @param xMultiComponentFactory 
	 * @param xComponentContext 
	 * @return
	 */
	public static Size getSize100mm(String imagePath, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext) {
		XGraphic graphic = loadImageFile(imagePath, xMultiComponentFactory, xComponentContext);
	    if (graphic == null) {
	      return null;
	    }
	    XPropertySet xPropertySet = UnoRuntime.queryInterface(XPropertySet.class, graphic);
	    Size size = null;
		try {
			size = (Size) xPropertySet.getPropertyValue(SizeConstants.SIZE100TH_MM);
		} catch (UnknownPropertyException e) {
			Activator.log.error(e);
		} catch (WrappedTargetException e) {
			Activator.log.error(e);
		}
	    return size;
	}

	/**
	 * Load image file.
	 * 
	 * @param imagePath
	 * @param xMultiComponentFactory
	 * @param xComponentContext
	 * @return
	 */
	public static XGraphic loadImageFile(String imagePath, XMultiComponentFactory xMultiComponentFactory, XComponentContext xComponentContext) {
		XGraphicProvider graphicProvider = null;
		try {
			Object object =  xMultiComponentFactory.createInstanceWithContext("com.sun.star.graphic.GraphicProvider", xComponentContext); //$NON-NLS-1$
			graphicProvider = UnoRuntime.queryInterface(XGraphicProvider.class, object);
		} catch (Exception e) {
			Activator.log.error(e);
		}
		if (graphicProvider == null) {
			return null;
		}

		PropertyValue[] propertyValues = new PropertyValue[1];
		propertyValues[0] = new PropertyValue();
		propertyValues[0].Name = "URL"; //$NON-NLS-1$
		propertyValues[0].Value = imagePath;
		
		XGraphic graphic = null;
		try {
			graphic = graphicProvider.queryGraphic(propertyValues);
		} catch (IllegalArgumentException e) {
			Activator.log.error(e);
		} catch (IOException e) {
			Activator.log.error(e);
		} catch (WrappedTargetException e) {
			Activator.log.error(e);
		}
		return graphic;
	}
}
