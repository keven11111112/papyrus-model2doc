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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.dev.tools.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.dev.tools.Activator;

/**
 * TODO : move me into papyrus ? class SyncManifestAndPOMVersions.java in papyrus has also an XML formatter
 */
public class XMLFormatter {

	private XMLFormatter() {
		// to prevent instanciation
	}

	// previsouly it was this formatter (used my the Eclipse XML Editor
	// public static final void format(final IFile file) {
	// final org.eclipse.wst.xml.core.internal.formatter.XMLFormatterFormatProcessor processor = new XMLFormatterFormatProcessor();
	// if (null != file) {
	// try {
	// processor.formatFile(file);
	// Activator.log.info(NLS.bind("XML file {0} is now formatted", file.getFullPath())); //$NON-NLS-1$
	// } catch (IOException ex) {
	// Activator.log.error(NLS.bind("IOException formating the XML file from {0}", file.getFullPath()), ex); //$NON-NLS-1$
	// } catch (CoreException ex) {
	// Activator.log.error(NLS.bind("Exception during the formatting of {0}", file.getFullPath()), ex); //$NON-NLS-1$
	// }
	// }
	// }
	public static final void format(final IFile xmlFile) {
		try {
			InputStream input = xmlFile.getContents();
			Source xmlInput = new StreamSource(input);
			StringWriter stringWriter = new StringWriter();
			StreamResult xmlOutput = new StreamResult(stringWriter);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			transformerFactory.setAttribute("indent-number", 4); //$NON-NLS-1$
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //$NON-NLS-1$
			transformer.transform(xmlInput, xmlOutput);
			InputStream in = new ByteArrayInputStream(stringWriter.toString().getBytes());
			xmlFile.setContents(in, IResource.FORCE, new NullProgressMonitor());
		} catch (CoreException ex) {
			Activator.log.error(NLS.bind("Exception during the formatting of {0}", xmlFile.getFullPath()), ex); //$NON-NLS-1$
		} catch (TransformerConfigurationException e) {
			Activator.log.error(NLS.bind("Exception during the formatting of {0}", xmlFile.getFullPath()), e); //$NON-NLS-1$
		} catch (TransformerException e) {
			Activator.log.error(NLS.bind("Exception during the formatting of {0}", xmlFile.getFullPath()), e); //$NON-NLS-1$
		}
	}
}
