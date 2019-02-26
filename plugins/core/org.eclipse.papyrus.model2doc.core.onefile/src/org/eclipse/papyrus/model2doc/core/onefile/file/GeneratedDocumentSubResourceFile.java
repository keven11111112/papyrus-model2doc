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
package org.eclipse.papyrus.model2doc.core.onefile.file;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.infra.internationalization.utils.PropertiesFilesUtils;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;

/**
 * This abstract class for dealing with generated document as sub resource file, besides others associated sub resources (di, uml, notation, etc).
 *  
 * @since 3.0
 *
 */
public abstract class GeneratedDocumentSubResourceFile implements ISubResourceFile {

	private IPapyrusFile parent;

	private final IFile subResource;

	/**
	 * Constructor.
	 *
	 * @param papyrusFile
	 * @param file
	 */
	public GeneratedDocumentSubResourceFile(IPapyrusFile papyrusFile, IFile file) {
		this.parent = papyrusFile;
		this.subResource = file;
	}

	@Override
	public IProject getProject() {
		return subResource.getProject();
	}

	@Override
	public String toString() {
		String result = subResource.getName();
		String fileExtension = subResource.getFileExtension();
		if (null != fileExtension) {
			result = fileExtension;
			if(fileExtension.equals(PropertiesFilesUtils.PROPERTIES_FILE_EXTENSION)){
				final String resourceWithoutExtension = subResource.getName().substring(0, subResource.getName().lastIndexOf('.')); //$NON-NLS-1$
				if(!resourceWithoutExtension.equals(parent.getText())){
					result = subResource.getName().substring(parent.getText().length());
				}
			}else if (isExtensionOfGeneratedDocument(fileExtension)) {
				final String resourceWithoutExtension = subResource.getName().substring(0, subResource.getName().lastIndexOf('.')); //$NON-NLS-1$
				if(!resourceWithoutExtension.equals(parent.getText())){
					result = subResource.getName().substring(parent.getText().length());
				}
			}
		}
		return result;
	}

	@Override
	public IFile getFile() {
		return subResource;
	}

	@Override
	public String getText() {
		return toString();
	}

	@Override
	public Object getAdapter(Class adapter) {
		return Platform.getAdapterManager().getAdapter(this, adapter);
	}

	@Override
	public IPapyrusFile getParent() {
		return parent;
	}

	/**
	 * Verify if extension is the same of generated document.
	 * 
	 * @param extension
	 * @return
	 */
	protected abstract boolean isExtensionOfGeneratedDocument(String extension);
}
