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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.gmf.template2structure.internal.mapping;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.model2doc.core.builtintypes.ImageFormat;
import org.eclipse.papyrus.model2doc.integration.gmf.template2structure.Activator;


/**
 * Utils class to manipulate Image of GMF Diagrams (Duplicated code from org.eclipse.papyrus.model2doc.gmf.template2structure to avoid code dependency)
 */
public class GMFDiagramImageUtils {

	/**
	 * Generate image of diagram.
	 *
	 * @param diagram
	 * @param pathRoot
	 * @param margin
	 * @param format
	 * @return
	 */
	public static void generateImageOfDiagram(final Diagram diagram, final String pathRoot, final int margin, ImageFormat format) {
		final Path imagePath = new Path(pathRoot.toString());

		// we check all folders tree already exists, and we create them if not
		if (imagePath.segmentCount() > 1) {
			final IPath folderPath = imagePath.removeLastSegments(1);
			final File folder = folderPath.toFile();
			if (false == folder.exists()) {
				folder.mkdirs();
			}
		}

		final CopyToImageUtil copyImageUtil = new CustomCopyToImageUtils(margin);


		try {
			// Dimension d = new Dimension(1402, 757).scale(0.70);
			// copyImageUtil.copyToConstrainedImage(diagram, imagePath, ImageFileFormat.SVG, d.width, d.height, new NullProgressMonitor(),
			// PreferencesHint.USE_DEFAULTS, false);
			copyImageUtil.copyToImage(diagram, imagePath, getFileFormat(format), new NullProgressMonitor(),
					PreferencesHint.USE_DEFAULTS);
		} catch (CoreException e) {
			Activator.log.error(e);
		}
		if (true) {
			return;
		}

	}

	/**
	 * @param format
	 * @return
	 */
	private static ImageFileFormat getFileFormat(ImageFormat format) {
		switch (format) {
		case PNG:
			return ImageFileFormat.PNG;
		case SVG:
		default:
			return ImageFileFormat.SVG;
		}
	}
}
