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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.core.builtintypes.internal.accessors;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.core.builtintypes.Activator;
import org.eclipse.papyrus.model2doc.core.builtintypes.accessors.IInputFileAccessor;

/**
 * This class is used to resolved files referenced by string in the models
 */
public abstract class AbstractInputFileAccessor<T extends EObject> extends AbstractFileAccessor<T> implements IInputFileAccessor {

	/**
	 *
	 * Constructor.
	 *
	 * @param eobject
	 *            the {@link EObject} referencing a file
	 */
	public AbstractInputFileAccessor(final T eobject) {
		super(eobject);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.helpers.IInputFileAccessor#createInputFileURL()
	 *
	 * @return
	 */
	@Override
	public URL createInputFileURL() {
		final URI uri = createInputFilePlatformURI();
		if (uri == null) {
			return null;
		}
		if (uri.isPlatformResource() && getEObject().eResource() != null && getEObject().eResource().getURI().isPlatformPlugin()) {
			Activator.log.warn("We can't get a file referenced as platform:/resource from a file saved as platform:/plugin"); //$NON-NLS-1$
			return null;
		}
		return getFileURLFromPlatformURI(uri);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.accessors.IInputFileAccessor#createInputFilePlatformURI()
	 *
	 * @return
	 */
	@Override
	public URI createInputFilePlatformURI() {
		return createPlatformURIFromPath(getEObject(), getFilePathIn(getEObject()));
	}

	/**
	 * @param T
	 *            the eobject from which extract the registered file path
	 * @return
	 *         the file path registered in the eobject
	 */
	protected abstract String getFilePathIn(final T eobject);


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
	@Override
	protected URI createPlatformURIFromPath(final EObject eobject, final String filePath) {
		if (null == filePath || filePath.isEmpty()) {
			return null;
		}
		return super.createPlatformURIFromPath(eobject, filePath);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.core.builtintypes.internal.accessors.AbstractFileAccessor#createURLFromFile(org.eclipse.core.resources.IFile)
	 *
	 * @param file
	 * @return the URL of the file, only if the file exists
	 */
	@Override
	protected URL createURLFromFile(final IFile file) {
		if (file.exists()) {
			return super.createURLFromFile(file);
		}
		return null;
	}

}
