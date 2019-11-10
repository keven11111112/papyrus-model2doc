/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
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

package org.eclipse.papyrus.model2doc.emf.structure2document.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.structure2document.Activator;

/**
 * Registry for DocumentGenerator classes
 */
public final class Structure2DocumentRegistry {

	/**
	 * The name of the extension point
	 */
	private final String EXTENSION_ID = "org.eclipse.papyrus.model2doc.emf.structure2document.documentgenerator"; //$NON-NLS-1$

	/**
	 * name of the generator extension point
	 */
	private static final String GENERATOR = "generator"; //$NON-NLS-1$

	/**
	 * the generator's class
	 */
	private static final String CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$

	/**
	 * the generator's id
	 */
	private static final String ID_ATTRIBUTE = "id"; //$NON-NLS-1$

	/**
	 * a map with the registered generator, by id
	 */
	private Map<String, IStructure2DocumentGenerator> generators = new HashMap<>();

	/**
	 * the singleton of this class
	 */
	public static final Structure2DocumentRegistry INSTANCE = new Structure2DocumentRegistry();

	/**
	 *
	 * Constructor.
	 *
	 */
	private Structure2DocumentRegistry() {
		// to prevent instantiation
		readContribution();
	}

	/**
	 * read the extension point contribution
	 */
	private void readContribution() {
		final IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		for (final IConfigurationElement iConfigurationElement : configElements) {
			if (GENERATOR.equals(iConfigurationElement.getName())) {
				readDocumentStructureGeneratorContribution(iConfigurationElement);
			}
		}
	}

	/**
	 * This method read the generator contributions
	 *
	 * @param iConfigurationElement
	 *            a configuration element representing a generator
	 */
	private void readDocumentStructureGeneratorContribution(final IConfigurationElement iConfigurationElement) {
		Assert.isTrue(GENERATOR.equals(iConfigurationElement.getName()));
		final String registeredId = iConfigurationElement.getAttribute(ID_ATTRIBUTE);
		IStructure2DocumentGenerator generator = null;
		try {
			generator = (IStructure2DocumentGenerator) iConfigurationElement.createExecutableExtension(CLASS_ATTRIBUTE);
		} catch (CoreException e) {
			Activator.log.error(NLS.bind("The generator {0} can't be loaded.", iConfigurationElement.getAttribute(CLASS_ATTRIBUTE)), e); //$NON-NLS-1$ }
		}
		if (null != generator) {
			if (null == registeredId || registeredId.isEmpty()) {
				Activator.log.warn(NLS.bind("The contributed generator {0} is ignored because you don't define id for it in your extension point contribution {1}", generator.toString(), EXTENSION_ID + "/" + GENERATOR)); //$NON-NLS-1$ //$NON-NLS-2$
			}
			final String expectedId = generator.getGeneratorId();
			if (false == registeredId.equals(expectedId)) {
				final List<String> messageParameters = new ArrayList<>();
				messageParameters.add(generator.toString());
				messageParameters.add(registeredId);
				messageParameters.add(expectedId);
				Activator.log.warn(NLS.bind("The generator {0} is declared with the id {1} is the extension point contribution, but it should be {2} as declared inside it. We ignore it.", messageParameters.toArray())); //$NON-NLS-1$
				return;
			}
			if (this.generators.containsKey(registeredId)) {
				final List<String> messageParameters = new ArrayList<>();
				messageParameters.add(this.generators.get(registeredId).toString());
				messageParameters.add(generator.toString());
				messageParameters.add(registeredId);
				Activator.log.warn(NLS.bind("The generators {0} and {1} are regitered with the same id {3}. We ignore the second one", messageParameters.toArray())); //$NON-NLS-1$
				return;
			}
			this.generators.put(registeredId, generator);
		}
	}



	/**
	 *
	 * @param generatorId
	 *            the id of a generator
	 * @return
	 *         the generator for this id or <code>null</code> if not found
	 */
	public final IStructure2DocumentGenerator getGenerator(final String generatorId) {
		Assert.isNotNull(generatorId);
		final IStructure2DocumentGenerator generator = this.generators.get(generatorId);
		if (null == generator) {
			Activator.log.warn(NLS.bind("The is no generator registered with the id {0}", generatorId)); //$NON-NLS-1$
		}
		return generator;
	}

	/**
	 *
	 * @param document
	 *            a document
	 * @return
	 *         the generator if found, or <code>null</code>
	 */
	public IStructure2DocumentGenerator getGenerator(final Document document) {
		Assert.isNotNull(document);
		final IDocumentGeneratorConfiguration conf = document.getDocumentGeneratorConfiguration();
		if (null != conf) {
			return getGenerator(conf.getDocumentGeneratorId());
		}
		return null;
	}

	/**
	 *
	 * @param document
	 *            a document for which are looking generators supporting it
	 * @return
	 *         the list of document generator supporting it
	 */
	public List<IStructure2DocumentGenerator> getAvailableGenerators(final Document document) {
		final List<IStructure2DocumentGenerator> generators = new ArrayList<>();
		for (IStructure2DocumentGenerator current : this.generators.values()) {
			if (current.handles(document)) {
				generators.add(current);
			}
		}
		return Collections.unmodifiableList(generators);
	}

	/**
	 * @return
	 *         all registered document generator
	 */
	public List<IStructure2DocumentGenerator> getAllRegistredGenerators() {
		return Collections.unmodifiableList(new ArrayList<>(this.generators.values()));
	}
}
