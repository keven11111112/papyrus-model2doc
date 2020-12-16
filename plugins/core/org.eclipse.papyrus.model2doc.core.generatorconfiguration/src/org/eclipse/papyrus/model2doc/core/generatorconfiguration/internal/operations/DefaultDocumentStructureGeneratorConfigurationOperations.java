/*****************************************************************************
 * Copyright (c) 2020 CEA LIST.
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

package org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.operations;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationFactory;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.internal.Activator;

/**
 * Operations for the implementation of {@link DefaultDocumentStructureGeneratorConfiguration}
 */
public final class DefaultDocumentStructureGeneratorConfigurationOperations {

	private static final String SLASH = "/"; //$NON-NLS-1$

	private static final String UNDERSCORE = "_"; //$NON-NLS-1$

	/**
	 * @param configuration
	 *            a {@link DefaultDocumentStructureGeneratorConfiguration}
	 * @return
	 *         a created {@link IDocumentGeneratorConfiguration}
	 */
	public static IDocumentGeneratorConfiguration createDocumentGeneratorConfiguration(final IDocumentStructureGeneratorConfiguration configuration) {
		final DefaultDocumentGeneratorConfiguration newConf = GeneratorConfigurationFactory.eINSTANCE.createDefaultDocumentGeneratorConfiguration();
		final Iterator<EAttribute> iter = newConf.eClass().getEAllAttributes().iterator();
		while (iter.hasNext()) {
			final EStructuralFeature feature = iter.next();
			newConf.eSet(feature, configuration.eGet(feature));
		}
		return newConf;
	}

	/**
	 * @param defaultDocumentStructureGeneratorConfigurationImpl
	 * @param fileExtension
	 * @param version
	 * @return
	 */
	public static URI createDocumentStructureURI(final IDocumentStructureGeneratorConfiguration structureGeneratorConfiguration, final String fileExtension, final String version) {
		final String documentName = structureGeneratorConfiguration.getDocumentName();
		if (documentName == null || documentName.isEmpty()) {
			Activator.log.warn("The document name is null or empty, so we can't create the URI for the DocumentStructure"); //$NON-NLS-1$
			return null;
		}

		// 1. clean output folder name
		String folderName = structureGeneratorConfiguration.getStructureFolder() != null ? structureGeneratorConfiguration.getStructureFolder() : ""; //$NON-NLS-1$
		while (folderName.startsWith(SLASH) || folderName.endsWith(SLASH)) {
			if (folderName.startsWith(SLASH)) {
				folderName = folderName.substring(1);
			}
			if (folderName.endsWith(SLASH)) {
				folderName = folderName.substring(0, folderName.length() - 1);
			}
		}

		// 2. create output folder name URI
		final StringBuilder documentNameBuilder = new StringBuilder(documentName);
		if (null != version && false == version.isEmpty()) {
			documentNameBuilder.append(UNDERSCORE);
			documentNameBuilder.append(version);
		}
		URI uri = URI.createURI(folderName);
		final String scheme = uri.scheme(); // Windows C: for example

		if (null != scheme && false == scheme.isEmpty() && !uri.isPlatform()) {
			Activator.log.warn(NLS.bind("A such path for DocumentStructure is not supported, path= {0} ", uri.toString())); //$NON-NLS-1$
			return null;
		}

		if (false == uri.isPlatform()) {
			// we convert a local URI as platform resource URI
			final String projectName = structureGeneratorConfiguration.eResource().getURI().segment(1);
			uri = URI.createPlatformResourceURI(projectName, true);
			for (final String current : folderName.split(SLASH)) {
				if (!current.isEmpty()) {
					uri = uri.appendSegment(current);
				}
			}
		}

		if (uri.isPlatform()) {
			if (uri.isPlatformPlugin()) {
				Activator.log.warn(NLS.bind("The path {0} must not be a platform plugin path", uri.toString())); //$NON-NLS-1$
				return null;
			}
			return uri.appendSegment(documentNameBuilder.toString()).appendFileExtension(fileExtension);
		}
		return null;
	}
}
