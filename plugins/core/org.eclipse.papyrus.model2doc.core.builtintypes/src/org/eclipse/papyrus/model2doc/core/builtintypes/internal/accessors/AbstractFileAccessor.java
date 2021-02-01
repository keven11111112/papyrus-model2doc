/*****************************************************************************
 * Copyright (c) 2020, 2021 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - bug 570803
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.builtintypes.internal.accessors;

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
import org.eclipse.papyrus.model2doc.core.builtintypes.Activator;
import org.osgi.framework.Bundle;

/**
 * Abstract class used to create File
 * TODO: try to put this file in model2doc.core directly, to avoid that generatorconfiguration get a dependency on this plugin
 */
public class AbstractFileAccessor<T extends EObject> {

	/**
	 * the space char
	 */
	protected static final String SPACE = " "; //$NON-NLS-1$

	/**
	 * the encoded space char
	 */
	protected static final String ENCODED_SPACE = "%20"; //$NON-NLS-1$

	/**
	 * the file prefix
	 */
	private static final String FILE_PREFIX = "file:/";//$NON-NLS-1$

	/**
	 * the {@link EObject} referencing a file
	 */
	private final T eobject;

	/**
	 *
	 * Constructor.
	 *
	 * @param eobject
	 *            the {@link EObject} referencing a file
	 */
	public AbstractFileAccessor(final T eobject) {
		this.eobject = eobject;
		Assert.isNotNull(this.eobject);
	}

	/**
	 *
	 * @return
	 *         the eobject
	 */
	protected T getEObject() {
		return this.eobject;
	}


	/**
	 *
	 * @param eobject
	 *            an eobject used to create URI if required
	 * @param path
	 *            a path to convert, the path can be a platform:/plugin or platform:/resource or just a string. In this case we build a path from the location of the EObject given in parameter
	 * @return
	 *         a platform URI
	 *
	 */
	protected URI createPlatformURIFromPath(final EObject eobject, String path) {
		if (path == null) {
			path = ""; // $NON-NLS-1 //$NON-NLS-1$
		}

		URI pathAsURI = URI.createURI(path, true);
		final String scheme = pathAsURI.scheme(); // Windows C: or platform for example is not supported
		if (false == pathAsURI.isPlatform() && null != scheme && false == scheme.isEmpty()) {
			Activator.log.warn(NLS.bind("File system path like {0} are not supported", path)); //$NON-NLS-1$
			return null;
		}
		if (false == pathAsURI.isPlatform()) {
			if (eobject.eResource() == null) {
				Activator.log.warn(NLS.bind("The EObject {0} must be attached to a Resource.", eobject)); //$NON-NLS-1$
				return null;
			}
			// it is a local URI
			final URI documentURI = eobject.eResource().getURI();
			// should always be true
			Assert.isTrue(documentURI.isPlatform());
			final String projectName = documentURI.segmentsList().get(1);
			URI fileURIPath = URI.createPlatformResourceURI(projectName, false);
			pathAsURI = fileURIPath.appendSegments(pathAsURI.segments());
		}

		// should always be true;
		Assert.isTrue(pathAsURI.isPlatform());
		return pathAsURI;
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
	protected final URL getFileURLFromPlatformURI(final URI uri) {
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
				// see bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=145096
				if (url.toString().contains(SPACE)) {
					url = new URL(url.toString().replace(SPACE, ENCODED_SPACE));
				}
				return url;
			} catch (IOException e) {
				Activator.log.error(e);
			}

		} else if (uri.isPlatformResource()) {
			final IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
			return createURLFromFile(f);
		}
		return null;
	}

	/**
	 *
	 * @param file
	 *            a file
	 * @return
	 *         the URL for the file
	 */
	protected URL createURLFromFile(final IFile file) {
		try {
			return file.getLocationURI().toURL();
		} catch (MalformedURLException e) {
			Activator.log.error(e);
		}
		return null;
	}

	/**
	 * This method converts the URL into string, removing the prefix "file:" and decoding the path if required
	 *
	 * @param url
	 *            the url
	 * @param decode
	 *            if <code>true</code>, we replace the %20 by the space char
	 * @return
	 *         the path string corresponding to the URL
	 */
	public String urlToPathString(final URL url, final boolean decode) {
		String path = url.toString().replaceFirst(FILE_PREFIX, ""); //$NON-NLS-1$
		if (decode) {
			path = path.replace(ENCODED_SPACE, SPACE);
		}
		return path;
	}
}
