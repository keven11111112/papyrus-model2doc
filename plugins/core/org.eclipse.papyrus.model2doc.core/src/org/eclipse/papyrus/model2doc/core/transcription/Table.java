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
package org.eclipse.papyrus.model2doc.core.transcription;

import java.util.ArrayList;
import java.util.List;

/**
 * Table interface.
 *
 */
public interface Table {
	
	/**
	 * Get Subtitle.
	 * 
	 * @return
	 */
	public String getSubtitle();

	/**
	 * Set Subtitle.
	 * 
	 * @param subtitle
	 */
	public void setSubtitle(String subtitle);
	
	/**
	 * Get Column Titles.
	 * 
	 * @return
	 */
	public List<String> getColumnTitles();

	/**
	 * Set Column Titles.
	 * 
	 * @param columnTitles
	 */
	public void setColumnTitles(List<String> columnTitles);
	
	/**
	 * Get Row Titles.
	 * 
	 * @return
	 */
	public List<String> getRowTitles();
	
	/**
	 * Set Row Titles.
	 * 
	 * @param rowTitles
	 */
	public void setRowTitles(List<String> rowTitles);
	
	/**
	 * Get All Rows.
	 * 
	 * @return
	 */
	public List<ArrayList<String>> getAllRows();
	
	/**
	 * Set Row Contents.
	 * 
	 * @param rowContents
	 */
	public void setRowContents(List<String> rowContents);
	
}
