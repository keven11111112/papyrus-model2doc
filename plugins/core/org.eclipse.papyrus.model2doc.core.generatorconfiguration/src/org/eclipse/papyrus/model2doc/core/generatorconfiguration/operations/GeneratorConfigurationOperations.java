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

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.Activator;
import org.osgi.framework.Bundle;

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
	 * 		the path of the document structure. The returned path, will be a string starting with platform:/resource/
	 */
	public static final String getDocumentStructureFileEcoreURI(final DefaultDocumentStructureGeneratorConfiguration generatorConfiguration, final String fileExtension) {
		final String folderName = generatorConfiguration.getStructureFolder();
		final String documentName = generatorConfiguration.getDocumentName();
		URI uri = URI.createURI(folderName);
		final String scheme = uri.scheme(); // Windows C: for example


		if (null != scheme && false == scheme.isEmpty()) {
			throw new UnsupportedOperationException("A such path for DocumentStructure is not supported: " + uri); //$NON-NLS-1$
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
	 *
	 * @param configuration
	 *            the document generator configuration
	 * @param fileExtension
	 *            the file extension used to create the file
	 * @return
	 * 		the file uri as local path (in C:/ for windows), prefixed with file:/
	 */
	public static final String getDocumentFileLocalPath(final DefaultDocumentGeneratorConfiguration configuration, final String fileExtension) {
		final String folderName = configuration.getDocumentFolder();
		final String documentName = configuration.getDocumentName();

		URI uri = URI.createURI(folderName);
		final String scheme = uri.scheme(); // Windows C: or platform for example

		if (false == uri.isPlatform() && null != scheme && false == scheme.isEmpty()) {
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
		final IPath res = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getLocation();
		return URI.createFileURI(res.toPortableString()).toString();// uri.toString();
	}

	/**
	 *
	 * @param configuration
	 *            the generator configuration
	 * @return
	 * 		the file uri as local path (in C:/ for windows), prefixed with file:/
	 */
	public static final String getTemplateFilePathInLocalPath(final DefaultDocumentGeneratorConfiguration configuration) {
		final String templateFile = configuration.getTemplateFile();
		if (null == templateFile || templateFile.isEmpty()) {
			return null;
		}
		URI templateURI = URI.createURI(templateFile);
		final String scheme = templateURI.scheme(); // Windows C: or platform for example
		if (false == templateURI.isPlatform() && null != scheme && false == scheme.isEmpty()) {
			return URI.createFileURI(templateFile).toString();// it add the file:/ before the path
		}
		String res = convertToLocalPath(configuration, templateFile);
		return URI.createFileURI(res).toString();
	}

	/**
	 *
	 * @param anEobject
	 *            an EObject, attached to a resource
	 * @param path
	 *            a path to convert , the path can be a platform:/plugin, and platform:/resource a just a string. In this case we build a path from the location of the EObject given in parameter
	 * @return
	 * 		<code>null</code> string if we can't resolved it, or the expected path (in C:/ for example, for windows System)
	 */
	private static final String convertToLocalPath(final EObject anEobject, final String path) {
		URI uri = URI.createURI(path, true);
		if (false == uri.isPlatform()) {
			Assert.isTrue(null != anEobject.eResource(), "The EObject argument must be attached to a Resource"); //$NON-NLS-1$
			// it is a local URI
			final URI documentURI = anEobject.eResource().getURI();
			// generation from platform:/plugin/ is not supported
			Assert.isTrue(documentURI.isPlatformResource());
			final String projectName = documentURI.segmentsList().get(1);
			URI templateURIPath = URI.createPlatformResourceURI(projectName, true);
			uri = templateURIPath.appendSegments(uri.segments());
		}

		if (uri.isPlatformPlugin()) {
			final List<String> segments = uri.segmentsList();
			final String bundleId = segments.get(1);
			final StringBuilder pathInBundle = new StringBuilder();
			for (int i = 2; i < segments.size(); i++) {
				pathInBundle.append(segments.get(i));
				if (i < segments.size() - 1) {
					pathInBundle.append("/"); //$NON-NLS-1$
				}
			}
			return getFileBundlePathToLocalPath(bundleId, pathInBundle.toString());
		} else if (uri.isPlatformResource()) {
			final IPath res = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getLocation();
			return res.toPortableString();
		}
		return null;
	}

	/**
	 *
	 * @param bundleId
	 *            the ID of a bundle
	 * @param filePathInBundle
	 *            the path in the bundle
	 * @return
	 * 		the full path of the file, conformed to the OS, or <code>null</code> if not found
	 */
	private static final String getFileBundlePathToLocalPath(final String bundleId, final String filePathInBundle) {
		final Bundle bundle = Platform.getBundle(bundleId); // $NON-NLS-1$
		if (null == bundle) {
			Activator.log.warn(NLS.bind("The bundle {0} doesn't exist", bundleId)); //$NON-NLS-1$
			return null;
		}
		final URL eclipseURL = FileLocator.find(bundle, new Path(filePathInBundle), null);
		if (null == eclipseURL) {
			Activator.log.warn(NLS.bind("The file {0} doesn't exist in the bundle {1}", filePathInBundle, bundleId)); //$NON-NLS-1$
			return null;
		}
		String templateURL = null;
		try {
			URL fileURL = FileLocator.toFileURL(eclipseURL);
			templateURL = fileURL.toString();
			templateURL = templateURL.replaceAll("file:/", ""); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (IOException e) {
			Activator.log.error(NLS.bind("The URL {0} can't be converted", eclipseURL), e); //$NON-NLS-1$
		}
		return templateURL;
	}
}
