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
package org.eclipse.papyrus.model2doc.core.onefile.file.diviewfilter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.papyrus.infra.core.resource.sasheditor.DiModel;
import org.eclipse.papyrus.infra.internationalization.utils.PropertiesFilesUtils;
import org.eclipse.papyrus.infra.onefile.model.IDiViewFilter;

/**
 * Filter hiding di files and associated generated documents.
 * 
 * @since 3.0
 *
 */
public abstract class GeneratedDocumentDiViewFilter implements IDiViewFilter {

	/**
	 * The dot static char.
	 */
	private static final char DOT = '.'; //$NON-NLS-1$

	/**
	 * The underscore static String.
	 */
	private static final String UNDERSCORE = "_"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.papyrus.infra.onefile.model.IDiViewFilter#getFileNameForDi(java.lang.String, org.eclipse.core.resources.IContainer)
	 */
	public String getFileNameForDi(final String fileName, final IContainer parent) {
//		System.out.println("FILE NAME " + fileName);
		String result = fileName;
		if (fileName.indexOf(DOT) > 0) {
			// Manage the properties files which contains languages
			final String extension = fileName.substring(fileName.lastIndexOf(DOT) + 1);
			String fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf(DOT));

			// For the properties file with underscore in name, we need to check if a locale is available in the name
			// If this is true, the file name is the name without the locale name
			// Example: projectName_en_US.properties must return projectName
			if (extension.equals(PropertiesFilesUtils.PROPERTIES_FILE_EXTENSION) && fileNameWithoutExtension.contains(UNDERSCORE)) {
				boolean localeFound = false;
				// Get the available locales
				final List<Locale> availableLocales = Arrays.asList(Locale.getAvailableLocales());
				String substring = fileNameWithoutExtension;

				// Loop until no underscore in the name or if a locale is found
				while (substring.contains(UNDERSCORE) && !localeFound) {
					// Remove the first part of the name to check the possible locale
					substring = substring.substring(substring.indexOf(UNDERSCORE) + 1); 

					final Iterator<Locale> localesIterator = availableLocales.iterator();

					// Loop on available locales
					while (localesIterator.hasNext() && !localeFound) {
						final Locale currentAvailableLocale = localesIterator.next();

						// The available locale is corresponding to the substring of the file name
						if (currentAvailableLocale.toString().equals(substring)) {
							localeFound = true;
							// Get the initial name without the locale as string
							fileNameWithoutExtension = fileNameWithoutExtension.substring(0, fileNameWithoutExtension.length() - substring.length() - 1);
						}
					}
				}
			} else if (fileNameWithoutExtension.contains(UNDERSCORE)) {
				if (isExtensionOfGeneratedDocument(extension)) {
					fileNameWithoutExtension = getDiFileFromODTFile(fileNameWithoutExtension, parent);
				}
			}

			result = fileNameWithoutExtension;
		}
//		System.out.println("Returned Value " + result);
		return result;
	}

	private String getDiFileFromODTFile(final String fileName, final IContainer parent) {
		final String[] splitted = fileName.split(UNDERSCORE);
		String currentName = splitted[0];
		int index = 1;

		if (null != parent) {
			if (isFileExists(currentName, parent)) {
				return currentName;
			} else {
				while (index < splitted.length) {
					currentName += splitted[index];

					if (isFileExists(currentName, parent)) {
						return currentName;
					}
				}
			}
		}

		return "";

	}

	private boolean isFileExists(final String fileName, final IContainer parent) {
		IFile file = parent.getFile(new Path(fileName + DOT + DiModel.DI_FILE_EXTENSION));
		return file.exists();
	}

	/**
	 * Verify if extension is the same of generated document.
	 * 
	 * @param extension
	 * @return
	 */
	protected abstract boolean isExtensionOfGeneratedDocument(String extension);

}
