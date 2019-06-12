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
import java.util.Collection;
import java.util.HashSet;
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
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.Activator;
import org.osgi.framework.Bundle;

/**
 * Utility class for the operations of GeneratorConfiguration metamodel
 */
public class GeneratorConfigurationOperations {

	private static final String SLASH = "/"; //$NON-NLS-1$

	private static final String UNDERSCORE = "_"; //$NON-NLS-1$

	/**
	 *
	 * @param generatorConfiguration
	 *            a generatorConfiguration element
	 * @param fileExtension
	 *            the extension file
	 * @param optionalVersionSuffix
	 *            a string representing the version of the generated document structure or <code>null</code>
	 * @return
	 *         the path of the document structure. The returned path, will be a string starting with platform:/resource/
	 */
	public static final URI getDocumentStructureFileEcoreURI(final IDocumentStructureGeneratorConfiguration generatorConfiguration, final String fileExtension, final String optionalVersionSuffix) {
		final String folderName = generatorConfiguration.getStructureFolder();
		final StringBuilder documentNameBuilder = new StringBuilder(generatorConfiguration.getDocumentName());
		if (null != optionalVersionSuffix && false == optionalVersionSuffix.isEmpty()) {
			documentNameBuilder.append(UNDERSCORE);
			documentNameBuilder.append(optionalVersionSuffix);
		}
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
			return uri.appendSegment(documentNameBuilder.toString()).appendFileExtension(fileExtension);
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
	 *         the file uri as local path (in C:/ for windows), prefixed with file:/
	 */
	public static final String getDocumentFileLocalPath(final IDocumentGeneratorConfiguration configuration, final String fileExtension) {
		final String projectName;
		if (null == configuration.eResource()) {
			// TODO remove this test, when first version of generation will be deleted
			projectName = null;
		} else if (null == configuration.eResource().getURI() || configuration.eResource().getURI().segmentCount() < 1) {
			throw new UnsupportedOperationException("This method doesn't work with DefaultDocumentGeneratorConfiguration which are not saved in a resource"); //$NON-NLS-1$
		} else {
			// the first segment is the Eclipse project name
			projectName = configuration.eResource().getURI().segment(1);
		}
		return buildLocalPath(projectName, configuration.getDocumentFolder(), configuration.getDocumentName(), fileExtension);
	}

	/**
	 *
	 * @param configuration
	 *            the document structure generator configuration
	 * @param imageExtension
	 *            the image extension used to create the file
	 * @return
	 *         the file uri as local path (in C:/ for windows), prefixed with file:/
	 *         if the imageName contains whitespace, these whitespace will be removed
	 */
	public static final String getImageFileLocalPath(final IDocumentStructureGeneratorConfiguration configuration, final String imageName, final String imageExtension) {
		final String projectName;
		// remove whitespace
		final String imageNameToUse = imageName.replaceAll("\\s+", ""); //$NON-NLS-1$ //$NON-NLS-2$
		if (null == configuration.eResource() || null == configuration.eResource().getURI() || configuration.eResource().getURI().segmentCount() < 1) {
			throw new UnsupportedOperationException("This method doesn't work with DefaultDocumentStructureGeneratorConfiguration which are not saved in a resource"); //$NON-NLS-1$
		} else {
			// the first segment is the Eclipse project name
			projectName = configuration.eResource().getURI().segment(1);
		}
		return buildLocalPath(projectName, configuration.getImageFolder(), imageNameToUse, imageExtension);
	}

	/**
	 *
	 * @param projectName
	 *            the name of the project in the workspace
	 * @param folderPath
	 *            the path of the target folder
	 * @param fileName
	 *            the name of the file
	 * @param fileExtension
	 *            the extension of the file
	 * @return
	 *         the file uri as local path (in C:/ for windows), prefixed with file:/
	 *
	 */
	private static final String buildLocalPath(final String projectName, final String folderPath, final String fileName, final String fileExtension) {
		URI uri = URI.createURI(folderPath);
		final String scheme = uri.scheme(); // Windows C: or platform for example

		if (false == uri.isPlatform() && null != scheme && false == scheme.isEmpty()) {
			URI newURI = URI.createFileURI(folderPath);
			newURI = newURI.appendSegment(fileName).appendFileExtension(fileExtension);
			return newURI.toString();
		}

		if (false == uri.isPlatform()) {
			// we convert a local URI as platform resource URI
			if (folderPath.contains(SLASH)) {// appendSegment doesn't work, when the string contains "/"
				uri = URI.createPlatformResourceURI(projectName, true).appendSegments(folderPath.split(SLASH));
			} else {
				uri = URI.createPlatformResourceURI(projectName, true).appendSegment(folderPath);
			}
		}

		if (uri.isPlatform()) {
			if (uri.isPlatformPlugin()) {
				Activator.log.warn(NLS.bind("The path {0} must not be a platform path", uri.toString())); //$NON-NLS-1$
				return null;
			}
			uri = uri.appendSegment(fileName).appendFileExtension(fileExtension);
		}
		final IPath res = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))).getLocation();
		return URI.createFileURI(res.toPortableString()).toString();// uri.toString();
	}

	/**
	 *
	 * @param configuration
	 *            the document structure generator configuration
	 * @return
	 *         the image folder URI or <code>null</code>
	 */
	private static final URI getImageFolderURI(final IDocumentStructureGeneratorConfiguration configuration) {
		final String projectName;
		if (null == configuration.eResource() || null == configuration.eResource().getURI() || configuration.eResource().getURI().segmentCount() < 1) {
			throw new UnsupportedOperationException("This method doesn't work with DefaultDocumentStructureGeneratorConfiguration which are not saved in a resource"); //$NON-NLS-1$
		} else {
			// the first segment is the Eclipse project name
			projectName = configuration.eResource().getURI().segment(1);
		}
		return getImageFolderURI(projectName, configuration.getImageFolder());
	}


	/**
	 *
	 * @param projectName
	 *            the project name
	 * @param folderPath
	 *            the folder path
	 * @return
	 *         the image folder URI or <code>null</code>
	 */
	private static final URI getImageFolderURI(final String projectName, final String folderPath) {
		URI uri = URI.createURI(folderPath);
		final String scheme = uri.scheme(); // Windows C: or platform for example

		if (false == uri.isPlatform() && null != scheme && false == scheme.isEmpty()) {
			return URI.createFileURI(folderPath);
		}

		if (false == uri.isPlatform()) {
			// we convert a local URI as platform resource URI
			if (folderPath.contains(SLASH)) {// appendSegment doesn't work, when the string contains "/"
				uri = URI.createPlatformResourceURI(projectName, true).appendSegments(folderPath.split(SLASH));
			} else {
				uri = URI.createPlatformResourceURI(projectName, true).appendSegment(folderPath);
			}
		}
		if (uri.isPlatform()) {
			if (uri.isPlatformPlugin()) {
				Activator.log.warn(NLS.bind("The path {0} must not be a platform path", uri.toString())); //$NON-NLS-1$
				return null;
			}
		}
		return uri;
	}

	/**
	 *
	 * @param configuration
	 *            the configuration used to generate the document structure
	 * @return
	 *         a collection of project name to refresh after the generation
	 */
	public static final Collection<String> getWorkspaceProjectToRefresh(final IDocumentStructureGeneratorConfiguration configuration) {
		final Collection<String> projectsToRefresh = new HashSet<>();

		// 1. get the project name for the pds file
		URI uri = getDocumentStructureFileEcoreURI(configuration, "dummyExtension", null); //$NON-NLS-1$
		if (null != uri) {
			// get the project output for pds
			if (uri.isPlatformResource() && uri.segmentCount() > 2) {
				projectsToRefresh.add(uri.segment(1));// 1 is the project name
			}
		}

		// 2. get the project name for the image folder
		uri = getImageFolderURI(configuration);
		if (null != uri) {
			// get the project output for pds
			if (uri.isPlatformResource() && uri.segmentCount() > 2) {
				projectsToRefresh.add(uri.segment(1));// 1 is the project name
			}
		}

		return projectsToRefresh;
	}


	/**
	 *
	 * @param configuration
	 *            the generator configuration
	 * @return
	 *         the file uri as local path (in C:/ for windows), prefixed with file:/
	 */
	public static final String getTemplateFilePathInLocalPath(final IDocumentGeneratorConfiguration configuration) {
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
	 *         <code>null</code> string if we can't resolved it, or the expected path (in C:/ for example, for windows System)
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
	 *         the full path of the file, conformed to the OS, or <code>null</code> if not found
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
