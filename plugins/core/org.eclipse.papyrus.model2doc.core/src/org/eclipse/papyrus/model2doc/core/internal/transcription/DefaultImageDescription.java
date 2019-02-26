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
package org.eclipse.papyrus.model2doc.core.internal.transcription;

import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;

public class DefaultImageDescription implements ImageDescription {

	private String path;
	
	private String subtitle;
	
	/**
	 * Get Path.
	 * 
	 * @return
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Set Path.
	 * 
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Get Subtitle.
	 * 
	 * @return
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * Set Subtitle.
	 * 
	 * @param subtitle
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
}
