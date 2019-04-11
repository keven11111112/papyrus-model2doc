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

package org.eclipse.papyrus.model2doc.gmf.template2structure.internal.mapping;

import java.io.File;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.papyrus.model2doc.gmf.template2structure.Activator;


/**
 * Utils class to manipulate Image of GMF DIagrams
 */
public class GMFDiagramImageUtils {

	/**
	 * the svg file extension
	 */
	public static final String SVG_EXTENSION = "svg"; //$NON-NLS-1$

	/**
	 * Generate image of diagram.
	 *
	 * @param diagram
	 * @param pathRoot
	 * @return
	 */
	public static void generateImageOfDiagram(final Diagram diagram, final String pathRoot) {
		// to be sure, but currently, we only propose svg, so, it should be ok.
		Assert.isTrue(pathRoot.endsWith(SVG_EXTENSION));

		final Path imagePath = new Path(pathRoot.toString());

		// we check all folders tree already exists, and we create them if not
		if (imagePath.segmentCount() > 1) {
			final IPath folderPath = imagePath.removeLastSegments(1);
			final File folder = folderPath.toFile();
			if (false == folder.exists()) {
				folder.mkdirs();
			}
		}

		final CopyToImageUtil copyImageUtil = new CopyToImageUtil();

		try {
			copyImageUtil.copyToImage(diagram, imagePath, ImageFileFormat.SVG, new NullProgressMonitor(),
					PreferencesHint.USE_DEFAULTS);
		} catch (CoreException e) {
			Activator.log.error(e);
		}
	}

}
