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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.papyrus.infra.internationalization.utils.PropertiesFilesUtils;
import org.eclipse.papyrus.infra.onefile.model.IPapyrusFile;
import org.eclipse.papyrus.infra.onefile.utils.OneFileUtils;

import org.eclipse.papyrus.model2doc.core.onefile.Activator;

/**
 * This abstract class for dealing with generated document files, besides others associated resources (di, uml, notation, etc).
 *  
 * @since 3.0
 */
public abstract class GeneratedDocumentFile implements IPapyrusFile {

	private final IFile file;
	
	/**
	 * Constructor.
	 *
	 * @param file
	 */
	public GeneratedDocumentFile(IFile file) {
		this.file = file;
	}

	@Override
	public String getText() {
		return getName().substring(0, getName().lastIndexOf('.'));
	}

	@Override
	public IProject getProject() {
		return file.getProject();
	}

	@Override
	public Object getAdapter(Class adapter) {
		return Platform.getAdapterManager().getAdapter(this, adapter);
	}

	@Override
	public IResource[] getAssociatedResources() {
		ArrayList<IResource> files = new ArrayList<IResource>();
		try {
			for (final IResource res : file.getParent().members()) {
				if (res instanceof IFile) {
					final String resourceWithoutExtension = OneFileUtils.withoutFileExtension(res);
					final String fileWithoutExtension = OneFileUtils.withoutFileExtension(file);
					if (fileWithoutExtension.equals(resourceWithoutExtension)) {
						files.add(res);
					} else if (PropertiesFilesUtils.PROPERTIES_FILE_EXTENSION.equals(res.getFileExtension()) && resourceWithoutExtension.startsWith(fileWithoutExtension)) {
						String possibleLocale = resourceWithoutExtension.substring(fileWithoutExtension.length());
						if (possibleLocale.startsWith("_")) { //$NON-NLS-1$
							possibleLocale = possibleLocale.substring(1);
							Locale localeFound = null;

							// Check about possible locale in available locales
							final Iterator<Locale> availableLocales = Arrays.asList(Locale.getAvailableLocales())
									.iterator();
							while (availableLocales.hasNext() && null == localeFound) {
								final Locale currentAvailableLocale = availableLocales.next();

								if (currentAvailableLocale.toString().equals(possibleLocale)) {
									localeFound = currentAvailableLocale;
								}
							}

							// The file contains a locale, load it
							if (null != localeFound) {
								files.add(res);
							}
						}
					} else if (resourceWithoutExtension.startsWith(fileWithoutExtension)) {
						if (isExtensionOfGeneratedDocument(res.getFileExtension())) {
							files.add(res);
						}
					}
				}
			}
		} catch (final CoreException e) {
			Activator.log.error("The file members cannot be found", e); //$NON-NLS-1$
		}
		return files.toArray(new IResource[] {});
	}
	
	@Override
	public IFile getMainFile() {
		return file;
	}

	@Override
	public IContainer getParent() {
		return file.getParent();
	}

	@Override
	public String getName() {
		return file.getName();
	}
	
	@Override
	public int hashCode() {
		return getMainFile().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof GeneratedDocumentFile) {
			GeneratedDocumentFile papyrusDocumentFile = (GeneratedDocumentFile) obj;
			return getMainFile().equals(papyrusDocumentFile.getMainFile());
		}
		return super.equals(obj);
	}
	
	/**
	 * Verify if extension is the same of generated document.
	 * 
	 * @param extension
	 * @return
	 */
	protected abstract boolean isExtensionOfGeneratedDocument(String extension);

}
