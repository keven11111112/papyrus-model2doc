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

import org.eclipse.papyrus.model2doc.core.transcription.CoverPage;

/**
 * This class defines cove page content. 
 *
 */
public class DefaultCoverPage implements CoverPage {
	
	private String mainTitle;
	
	private String subtitle;
	
	private String version;
	
	private String creationDate;
	
	private String lastRevisionDate;
	
	private String project;
	
	private List<String> organizations = new ArrayList<String>();
	
	private List<String> authors = new ArrayList<String>();

	/**
	 * Get Main Title.
	 * 
	 * @return
	 */
	public String getMainTitle() {
		return mainTitle;
	}

	/**
	 * Set Main Title.
	 * 
	 * @param mainTitle
	 */
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
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
	public void setSubTitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * Get Version.
	 * 
	 * @return
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Set Version.
	 * 
	 * @param version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Get Creation Date.
	 * 
	 * @return
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * Set Creation Date.
	 *  
	 * @param creationDate
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Get Last Revision Date.
	 * 
	 * @return
	 */
	public String getLastRevisionDate() {
		return lastRevisionDate;
	}

	/**
	 * Set Last Revision Date.
	 * 
	 * @param lastRevisionDate
	 */
	public void setLastRevisionDate(String lastRevisionDate) {
		this.lastRevisionDate = lastRevisionDate;
	}

	/**
	 * Get Project.
	 * @return
	 */
	public String getProject() {
		return project;
	}

	/**
	 * Set Project.
	 * 
	 * @param project
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * Get Organizations.
	 * 
	 * @return
	 */
	public List<String> getOrganizations() {
		return organizations;
	}

	/**
	 * Set Organizations.
	 * 
	 * @param organizations
	 */
	public void setOrganizations(List<String> organizations) {
		this.organizations = organizations;
	}

	/**
	 * Get Authors.
	 * 
	 * @return
	 */
	public List<String> getAuthors() {
		return authors;
	}

	/**
	 * Set Authors.
	 * 
	 * @param authors
	 */
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
}
