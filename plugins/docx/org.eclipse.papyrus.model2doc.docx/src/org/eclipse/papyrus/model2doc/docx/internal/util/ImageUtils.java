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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.docx.internal.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.eclipse.papyrus.model2doc.docx.Activator;

/**
 *
 */
public class ImageUtils {

	// FIXME we should get the size from the document
	private static final int PAGE_WIDTH = 450;

	private static final int PAGE_HEIGHT = 700;

	/**
	 *
	 * @param imagePath
	 * @param document
	 * @return
	 */
	public static final int[] getImageSize(String imagePath, XWPFDocument document) {
		int[] result = new int[2];

		File f = new File(imagePath);
		BufferedImage image;
		try {
			image = ImageIO.read(f);

			int imageWidth = image.getWidth();
			int imageHeight = image.getHeight();

			if (imageWidth <= PAGE_WIDTH && imageWidth <= PAGE_HEIGHT) {
				result[0] = imageWidth;
				result[1] = imageHeight;
			} else if (imageWidth >= PAGE_WIDTH) {
				// align the size of the picture on the width of the page
				result[0] = PAGE_WIDTH;
				result[1] = (PAGE_WIDTH * imageHeight) / imageWidth;
				if (result[1] > PAGE_HEIGHT) {
					// if the picture is still to big we align the size of the picture on the height of the page
					imageWidth = result[0];
					imageHeight = result[1];
					result[0] = (PAGE_HEIGHT * imageWidth) / imageHeight;
					result[1] = PAGE_HEIGHT;
				}
			} else if (imageHeight >= PAGE_HEIGHT) {
				// align the size of the picture on the height of the page
				result[0] = (PAGE_HEIGHT * imageWidth) / imageHeight;
				result[1] = PAGE_HEIGHT;
				if (result[0] > PAGE_WIDTH) {
					// if the picture is still to big we align the size of the picture on the width of the page
					imageWidth = result[0];
					imageHeight = result[1];
					result[0] = (PAGE_HEIGHT * imageWidth) / imageHeight;
					result[1] = PAGE_HEIGHT;
				}
			}
			result[0] = Units.toEMU(result[0]);
			result[1] = Units.toEMU(result[1]);
			// CTSectPr sect = document.getDocument().getBody().getSectPr();
		} catch (IOException e) {
			Activator.log.error(e);
		}
		return result;
	}

}
