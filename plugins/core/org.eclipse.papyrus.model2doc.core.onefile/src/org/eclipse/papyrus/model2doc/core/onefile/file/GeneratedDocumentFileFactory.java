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
import org.eclipse.core.resources.IResource;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusModelFactory;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;

/**
 *	Abstract factory for creating instances of generated document interfaces, besides others Papyrus files and sub resources interfaces.
 *
 */
public abstract class GeneratedDocumentFileFactory implements IPapyrusModelFactory {

	public abstract IPapyrusFile createIPapyrusFile(IFile file);

	public abstract ISubResourceFile createISubResourceFile(IPapyrusFile papyrusFile, IFile file);
	
	@Override
	public boolean isDi(IResource file) {
		return DiModel.DI_FILE_EXTENSION.equals(file.getFileExtension());
	}

}
