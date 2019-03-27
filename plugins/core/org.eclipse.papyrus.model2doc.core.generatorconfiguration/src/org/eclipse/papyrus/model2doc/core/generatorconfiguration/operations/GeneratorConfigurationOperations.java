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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations;

import org.eclipse.emf.common.util.URI;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.Activator;

/**
 * Utility class for the operations of GeneratorConfiguration metamodel
 */
public class GeneratorConfigurationOperations {

	/**
	 *
	 * @param generatorConfiguration
	 *            a generatorConfiguration element
	 * @param uriKind
	 *            the kind of expected URI
	 * @param fileExtension
	 *            the extension file
	 * @return
	 * 		the path of the file build from the paramaters
	 */
	public static final String getDocumentStructureFileEcoreURI(final DefaultDocumentStructureGeneratorConfiguration generatorConfiguration, final String fileExtension) {
		final String folderName = generatorConfiguration.getStructureFolder();
		final String documentName = generatorConfiguration.getDocumentName();
		URI uri = URI.createURI(folderName);
		final String scheme = uri.scheme(); // Windows C: for example


		if (null != scheme && false == scheme.isEmpty()) {
			// TODO : according to the document written in the UML model, this case should not be supported
			URI newURI = URI.createFileURI(folderName);
			newURI = newURI.appendSegment(documentName).appendFileExtension(fileExtension);
			return newURI.toString();
		}

		if (false == uri.isPlatform()) {
			// we convert a local URI as platform resource URI
			final String projectName = generatorConfiguration.eResource().getURI().segment(1);
			uri = URI.createPlatformResourceURI(projectName, true).appendSegment(folderName);
		}

		if (uri.isPlatform()) {
			if (uri.isPlatformPlugin()) {
				Activator.log.warn(NLS.bind("The path {0} must not be a platform path", uri.toString())); //$NON-NLS-1$
				return null;
			}
			return uri.appendSegment(documentName).appendFileExtension(fileExtension).toString();
		}
		return null;
	}

	/**
	 * TODO : check if used!
	 *
	 * @param configuration
	 * @param fileExtension
	 * @return
	 */
	public static final String getDocumentFileOSURI(final DefaultDocumentGeneratorConfiguration configuration, final String fileExtension) {
		final String folderName = configuration.getDocumentFolder();
		final String documentName = configuration.getDocumentName();

		URI uri = URI.createURI(folderName);
		final String scheme = uri.scheme(); // Windows C: for example

		if (null != scheme && false == scheme.isEmpty()) {
			// TODO : according to the document written in the UML model, this case should not be supported
			URI newURI = URI.createFileURI(folderName);
			newURI = newURI.appendSegment(documentName).appendFileExtension(fileExtension);
			return newURI.toString();
		}

		if (false == uri.isPlatform()) {
			// we convert a local URI as platform resource URI
			final String projectName = configuration.eResource().getURI().segment(1);
			uri = URI.createPlatformResourceURI(projectName, true).appendSegment(folderName);
		}

		if (uri.isPlatform()) {
			if (uri.isPlatformPlugin()) {
				Activator.log.warn(NLS.bind("The path {0} must not be a platform path", uri.toString())); //$NON-NLS-1$
				return null;
			}
			uri = uri.appendSegment(documentName).appendFileExtension(fileExtension);
		}

		return null;
	}

}
