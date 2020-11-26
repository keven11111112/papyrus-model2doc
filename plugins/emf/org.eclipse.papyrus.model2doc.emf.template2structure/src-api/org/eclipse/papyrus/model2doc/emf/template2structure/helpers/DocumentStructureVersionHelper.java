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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;

/**
 * Helper used to manage the Document structure version
 */
public class DocumentStructureVersionHelper {

	/**
	 * The file extension of the property file.
	 */
	private static final String PROPERTIES_FILE_EXTENSION = "versions"; //$NON-NLS-1$

	/**
	 * The name of the file used to save the version of the generated document.
	 */
	private static final String VERSION_FILE_NAME = "LastGeneratedDocumentVersion"; //$NON-NLS-1$

	/**
	 * The model2doc folder name (to be created in the preferences).
	 */
	private static final String MODEL2DOC_PREFERENCE_FOLDER_NAME = "model2doc"; //$NON-NLS-1$

	/**
	 * the DocumentTemplate for which we are creating a version of Document Structure
	 */
	private final DocumentTemplate docTemplate;

	/**
	 *
	 * Constructor.
	 *
	 * @param docTemplate
	 *            a document template
	 */
	public DocumentStructureVersionHelper(final DocumentTemplate docTemplate) {
		this.docTemplate = docTemplate;
	}

	/**
	 *
	 * @return
	 *         the version to use for the created document
	 *         a <code>null</code> must cancel the document structure generation
	 */
	public String getDocumentVersion() {
		return ""; //$NON-NLS-1$
	}

	/**
	 * Get the previous generated version.
	 *
	 * @return
	 *         The previous generated version for the current DocumentTemplate or the empty string if it is the first generation.
	 */
	protected final String getPreviousGeneratedVersion() {
		final String xmiID = getXMI_ID(this.docTemplate);
		if (null == xmiID) {
			return ""; //$NON-NLS-1$
		}
		final File f = getVersionFile();
		String lastVersion = ""; //$NON-NLS-1$
		try (InputStream input = new FileInputStream(f)) {
			Properties prop = new Properties();
			prop.load(input);
			// set the properties value
			lastVersion = prop.getProperty(xmiID);
			input.close();

		} catch (IOException io) {
			Activator.log.error(io);
		}

		return lastVersion;
	}

	/**
	 * This allows to save the version of the last generation.
	 *
	 * @param docTemplate
	 *            A document template.
	 * @param version
	 *            The version of the document for the current generation.
	 */
	public final void saveLastGeneratedDocumentVersion(final String version) {
		final String xmiID = getXMI_ID(this.docTemplate);
		if (null == xmiID) {
			return;
		}
		final File f = getVersionFile();
		try (OutputStream output = new FileOutputStream(f)) {
			Properties prop = new Properties();
			// set the properties value
			prop.setProperty(xmiID, version);

			// save properties to project root folder
			prop.store(output, null);
			output.close();
		} catch (IOException io) {
			Activator.log.error(io);
		}

	}

	/**
	 * Get the xmi:id of an EObject.
	 *
	 * @param eobject
	 *            An EObject.
	 * @return
	 *         The XMI_ID of this object.
	 */
	private static String getXMI_ID(final EObject eobject) {
		if (eobject.eResource() instanceof XMIResource) {
			return ((XMIResource) eobject.eResource()).getID(eobject);
		}
		return null;
	}

	/**
	 * Get the version of the file.
	 *
	 * @return
	 *         The file used to save the last version number of the generated document.
	 */
	private File getVersionFile() {
		IPath preferencePath = Activator.getDefault().getStateLocation();
		preferencePath.append(MODEL2DOC_PREFERENCE_FOLDER_NAME);

		// create folders if required
		final File folder = preferencePath.toFile();
		if (false == folder.exists()) {
			folder.mkdirs();
		}
		preferencePath = preferencePath.append(VERSION_FILE_NAME).addFileExtension(PROPERTIES_FILE_EXTENSION);
		final File f = preferencePath.toFile();
		if (false == f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				Activator.log.error(e);
			}
		}
		return f;
	}
}
