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

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;

/**
 * Registry for StructureGenerator and mappers classes
 */
public final class Template2StructureRegistry {

	/**
	 * The name of the extension point
	 */
	private final String EXTENSION_ID = "org.eclipse.papyrus.model2doc.emf.template2structure.structuregenerator"; //$NON-NLS-1$

	/**
	 * name of the mapper extension
	 */
	private static final String MAPPER = "mapper"; //$NON-NLS-1$

	/**
	 * name of the generator extension point
	 */
	private static final String GENERATOR = "generator"; //$NON-NLS-1$

	/**
	 * Fields of the extension
	 */
	private static final String CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$

	private static final String ID_ATTRIBUTE = "id"; //$NON-NLS-1$

	private static final String GENERATOR_ID_ATTRIBUTE = "generatorId"; //$NON-NLS-1$

	/**
	 * a map with the registered generator, by id
	 */
	private Map<String, ITemplate2StructureGenerator> generators = new HashMap<>();

	/**
	 * a map with the registered generator, by id
	 */
	private Map<String, List<AbstractTemplateToStructureMapper<?, ?>>> mappers = new HashMap<>();

	/**
	 * the singleton of this class
	 */
	public static final Template2StructureRegistry INSTANCE = new Template2StructureRegistry();

	/**
	 *
	 * Constructor.
	 *
	 */
	private Template2StructureRegistry() {
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

			if (MAPPER.equals(iConfigurationElement.getName())) {
				readMapperContribution(iConfigurationElement);
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
		ITemplate2StructureGenerator generator = null;
		try {
			generator = (ITemplate2StructureGenerator) iConfigurationElement.createExecutableExtension(CLASS_ATTRIBUTE);
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
	 * This method read the mapper contributions
	 *
	 * @param iConfigurationElement
	 *            a configuration element representing a mapper
	 */
	private void readMapperContribution(final IConfigurationElement iConfigurationElement) {
		final String contributedGenerator = iConfigurationElement.getAttribute(GENERATOR_ID_ATTRIBUTE);
		AbstractTemplateToStructureMapper<?, ?> mapper = null;
		try {
			mapper = (AbstractTemplateToStructureMapper<?, ?>) iConfigurationElement.createExecutableExtension(CLASS_ATTRIBUTE);
		} catch (CoreException e) {
			Activator.log.error(NLS.bind("The mapper {0} can't be loaded.", iConfigurationElement.getAttribute(CLASS_ATTRIBUTE)), e); //$NON-NLS-1$
		}
		if (null != mapper) {
			if (null == contributedGenerator || contributedGenerator.isEmpty()) {
				Activator.log.warn(NLS.bind("The contributed mapper {0} is ignored because you don't define id for it in your extension point contribution {1}", mapper.toString(), EXTENSION_ID + "/" + MAPPER)); //$NON-NLS-1$ //$NON-NLS-2$
			}
			List<AbstractTemplateToStructureMapper<?, ?>> list = this.mappers.get(contributedGenerator);
			if (null == list) {
				list = new ArrayList<>();
				mappers.put(contributedGenerator, list);
			}
			list.add(mapper);
		}
	}


	/**
	 *
	 * @param generatorId
	 *            the id of a generator
	 * @return
	 * 		the generator for this id or <code>null</code> if not found
	 */
	private final ITemplate2StructureGenerator getGenerator(final String generatorId) {
		Assert.isNotNull(generatorId);
		final ITemplate2StructureGenerator generator = this.generators.get(generatorId);
		if (null == generator) {
			Activator.log.warn(NLS.bind("The is no generator registered with the id {0}", generatorId)); //$NON-NLS-1$
		}
		return generator;
	}

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @return
	 * 		the generator if found, or <code>null</code>
	 */
	public ITemplate2StructureGenerator getGenerator(final DocumentTemplate docTemplate) {
		Assert.isNotNull(docTemplate);
		IDocumentStructureGeneratorConfiguration tmp = docTemplate.getDocumentStructureGenerator();
		if (null != tmp) {
			if (tmp instanceof DefaultDocumentStructureGeneratorConfiguration) {
				DefaultDocumentStructureGeneratorConfiguration conf = (DefaultDocumentStructureGeneratorConfiguration) tmp;
				return getGenerator(conf.getStructureGeneratorId());
			}
		}
		return null;
	}

	/**
	 *
	 * @param docTemplate
	 *            a document template
	 * @return
	 * 		the mappers registered for the generator declared in the document template
	 */
	public List<AbstractTemplateToStructureMapper<?, ?>> getMappers(final DocumentTemplate docTemplate) {
		final String structureGeneratorId = ((DefaultDocumentStructureGeneratorConfiguration) docTemplate.getDocumentStructureGenerator()).getStructureGeneratorId();
		if (null == structureGeneratorId || structureGeneratorId.isEmpty()) {
			Activator.log.warn(NLS.bind("The document structure generator id is not defined for {0}", docTemplate.toString())); //$NON-NLS-1$
			return Collections.emptyList();
		}
		final List<AbstractTemplateToStructureMapper<?, ?>> returnedMappers = this.mappers.get(structureGeneratorId);
		if (null == returnedMappers) {
			Activator.log.warn(NLS.bind("No mapper defined for generator id {0}", structureGeneratorId)); //$NON-NLS-1$
			return Collections.emptyList();
		}
		return new LinkedList<>(returnedMappers);
	}

}
