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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.papyrus.model2doc.core.transcription.Table;

/**
 * Default Table implementation.  
 *
 */
public class DefaultTable implements Table {

	private String subtitle;
	
	private List<String> columnTitles;

	private List<String> rowTitles;
	
	private List<ArrayList<String>> rows;

	/**
	 * Constructor.
	 * 
	 */
	public DefaultTable() {
		columnTitles = new ArrayList<String>();
		rowTitles = new ArrayList<String>();
		rows = new ArrayList<ArrayList<String>>();
	}

	@Override
	public String getSubtitle() {
		return subtitle;
	}

	@Override
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	@Override
	public List<String> getColumnTitles() {
		return columnTitles;
	}

	@Override
	public void setColumnTitles(List<String> columnTitles) {
		this.columnTitles = columnTitles;

	}
	
	@Override
	public List<ArrayList<String>> getAllRows() {
		return rows;
	}

	@Override
	public void setRowContents(List<String> rowContents) {
		this.rows.add((ArrayList<String>)rowContents);

	}

	@Override
	public List<String> getRowTitles() {
		return rowTitles;
	}

	@Override
	public void setRowTitles(List<String> rowTitles) {
		this.rowTitles = rowTitles;
	}

}
