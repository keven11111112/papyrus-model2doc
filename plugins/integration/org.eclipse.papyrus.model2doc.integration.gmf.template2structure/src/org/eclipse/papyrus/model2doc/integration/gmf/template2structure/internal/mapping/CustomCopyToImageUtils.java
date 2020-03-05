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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.gmf.template2structure.internal.mapping;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramGenerator;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.IMapMode;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;

/**
 * TODO : move me into Papyrus
 *
 * Allows to create diagram image defining the margin around the diagram
 */
public class CustomCopyToImageUtils extends CopyToImageUtil {

	/**
	 * equivalent to the margin defined by org.eclipse.gmf.runtime.diagram.ui.render.clipboard.DiagramGenerator.DEFAULT_IMAGE_MARGIN_PIXELS
	 */
	private static final int DEFAULT_MARGIN = 10;

	/**
	 * The size of the margin
	 */
	private int margin = 0;

	/**
	 *
	 * Constructor.
	 *
	 * @param margin
	 *            the margin to use around the image, in pixel value
	 */
	public CustomCopyToImageUtils(int margin) {
		super();
		if (this.margin >= 0) {
			this.margin = margin;
		} else {
			this.margin = DEFAULT_MARGIN;
		}

	}

	/**
	 *
	 * Constructor.
	 *
	 */
	public CustomCopyToImageUtils() {
		this(DEFAULT_MARGIN);
	}

	/**
	 * @see org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToImageUtil#getDiagramGenerator(org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart, org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat)
	 *
	 * @param diagramEP
	 * @param format
	 * @return
	 */
	@Override
	protected DiagramGenerator getDiagramGenerator(final DiagramEditPart diagramEP, final ImageFileFormat format) {
		final DiagramGenerator generator = super.getDiagramGenerator(diagramEP, format);
		final IMapMode mm = MapModeUtil.getMapMode(diagramEP.getFigure());
		generator.setImageMargin(mm.DPtoLP(this.margin));
		return generator;
	}

}
