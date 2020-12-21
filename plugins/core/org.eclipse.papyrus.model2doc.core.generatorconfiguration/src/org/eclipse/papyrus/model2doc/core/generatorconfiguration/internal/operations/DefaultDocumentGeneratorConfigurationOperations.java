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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.operations;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.Activator;
import org.osgi.framework.Bundle;

/**
 * Operations for {@link DefaultDocumentGeneratorConfiguration}
 */
public final class DefaultDocumentGeneratorConfigurationOperations {

	/**
	 *
	 * @param configuration
	 *            an {@link IDocumentGeneratorConfiguration}
	 * @return
	 *         the URL allowing to access to an existing file used as document template for the generation
	 */
	public static final URL createTemplateFileURL(final IDocumentGeneratorConfiguration configuration) {
		final URI uri = createPlatformURIFromFilePath(configuration, configuration.getTemplateFile());
		if (uri == null) {
			return null;
		}
		if (uri.isPlatformResource() && configuration.eResource() != null && configuration.eResource().getURI().isPlatformPlugin()) {
			Activator.log.warn("We can't get a file referenced as platform:/resource from a file saved as platform:/plugin"); //$NON-NLS-1$
			return null;
		}
		return getFileURLFromPlatformURI(uri);
	}

	/**
	 *
	 * @param eobject
	 *            an eobject
	 * @param filePath
	 *            a path to convert , the path can be a platform:/plugin, and platform:/resource a just a string. In this case we build a path from the location of the EObject given in parameter
	 * @return
	 *         a platform URI
	 *
	 */
	private static final URI createPlatformURIFromFilePath(final EObject eobject, final String filePath) {
		if (null == filePath || filePath.isEmpty()) {
			return null;
		}
		URI templateURI = URI.createURI(filePath, true);
		final String scheme = templateURI.scheme(); // Windows C: or platform for example is not supported
		if (false == templateURI.isPlatform() && null != scheme && false == scheme.isEmpty()) {
			Activator.log.warn(NLS.bind("File system path like {0} are not supported", filePath)); //$NON-NLS-1$
			return null;
		}
		if (false == templateURI.isPlatform()) {
			if (eobject.eResource() == null) {
				Activator.log.warn(NLS.bind("The EObject {0} must be attached to a Resource.", eobject)); //$NON-NLS-1$
				return null;
			}
			// it is a local URI
			final URI documentURI = eobject.eResource().getURI();
			// should always be true
			Assert.isTrue(documentURI.isPlatform());
			final String projectName = documentURI.segmentsList().get(1);
			URI templateURIPath = URI.createPlatformResourceURI(projectName, true);
			templateURI = templateURIPath.appendSegments(templateURI.segments());
		}

		// should always be true;
		Assert.isTrue(templateURI.isPlatform());
		return templateURI;
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
	private static final URL getFileURLFromPlatformURI(final URI uri) {
		if (uri == null) {
			return null;
		}
		if (uri.isPlatformPlugin()) {
			final String bundleId = uri.segment(1);
			int nbSegment = uri.segmentCount();
			int index = 2;
			URI pathInBundle = null;
			while (index < nbSegment) {
				if (pathInBundle == null) {
					pathInBundle = URI.createURI(uri.segment(index));
				} else {
					pathInBundle = pathInBundle.appendSegment(uri.segment(index));
				}
				index++;
			}

			// final URI relativeURI = uri.retrimSegments(1);// (URI.createPlatformPluginURI(bundleId, true), null);
			final Bundle bundle = Platform.getBundle(bundleId); // $NON-NLS-1$
			if (null == bundle) {
				Activator.log.warn(NLS.bind("The bundle {0} doesn't exist", bundleId)); //$NON-NLS-1$
				return null;
			}
			String path = pathInBundle.toString();
			path = URI.decode(path);
			final URL eclipseURL = FileLocator.find(bundle, new Path(path), null);
			if (null == eclipseURL) {
				Activator.log.warn(NLS.bind("The file {0} doesn't exist in the bundle {1}", pathInBundle.toString(), bundleId)); //$NON-NLS-1$
				return null;
			}
			try {
				// convert the URL of the file in the compiled eclipse bundle into an URL in D:git/... in my installation (useful or not ? )
				URL url = FileLocator.toFileURL(eclipseURL);
				// here we get space that must be replace by %20
				// there is a bug with FileLocator (see bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=145096)
				if (url.toString().contains(" ")) { //$NON-NLS-1$
					url = new URL(url.toString().replace(" ", "%20")); //$NON-NLS-1$ //$NON-NLS-2$
				}
				return url;
			} catch (IOException e) {
				Activator.log.error(e);
			}

		} else if (uri.isPlatformResource()) {
			final IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
			if (f.exists()) {
				try {
					return f.getLocationURI().toURL();
				} catch (MalformedURLException e) {
					Activator.log.error(e);
				}
			}

		}
		return null;
	}
}
