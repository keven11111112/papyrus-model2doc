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
package org.eclipse.papyrus.model2doc.odt.internal.onefile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;

import org.eclipse.papyrus.model2doc.core.onefile.file.GeneratedDocumentFileFactory;

/**
 *	Factory able to create instances of generated odt document interfaces, besides others Papyrus files and sub resources interfaces.
 *
 */
public class ODTDocumentFileFactory extends GeneratedDocumentFileFactory {

	public IPapyrusFile createIPapyrusFile(IFile file) {
		return new ODTDocumentFile(file);
	}

	public ISubResourceFile createISubResourceFile(IPapyrusFile papyrusFile, IFile file) {
		return new ODTDocumentSubResourceFile(papyrusFile, file);
	}
	
	@Override
	public boolean isDi(IResource file) {
		return DiModel.DI_FILE_EXTENSION.equals(file.getFileExtension());
	}

}
