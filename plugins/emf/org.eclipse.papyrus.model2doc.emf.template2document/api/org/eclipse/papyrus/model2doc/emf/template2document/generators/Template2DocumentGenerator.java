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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2document.generators;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.core.status.GenerationStatus;
import org.eclipse.papyrus.model2doc.core.status.IGenerationStatus;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.Structure2DocumentRegistry;
import org.eclipse.papyrus.model2doc.emf.template2document.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.ITemplate2StructureGenerator;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.Template2StructureGeneratorWrapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.generator.Template2StructureRegistry;
import org.eclipse.papyrus.model2doc.emf.template2structure.helpers.DocumentStructureVersionHelper;

/**
 * This class allows to generate the final document directly from the {@link DocumentTemplate}
 */
public class Template2DocumentGenerator {

	/**
	 * The selected document template used for the generation
	 */
	private final DocumentTemplate documentTemplate;

	/**
	 * the template to structure generator
	 */
	protected ITemplate2StructureGenerator t2sGenerator;

	/**
	 * the structure to document generator
	 */
	protected IStructure2DocumentGenerator s2docGenerator;

	/**
	 * the version helper used by the template to structure generator
	 */
	private DocumentStructureVersionHelper versionHelper;

	/**
	 *
	 * Constructor.
	 *
	 * @param documentTemplate
	 *            the document template
	 */
	public Template2DocumentGenerator(final DocumentTemplate documentTemplate) {
		this.documentTemplate = documentTemplate;
		this.versionHelper = createDocumentStructureVersionHelper(this.documentTemplate);
		final String s2docId = this.documentTemplate.getDocumentStructureGeneratorConfiguration().getDocumentGeneratorId();
		this.s2docGenerator = Structure2DocumentRegistry.INSTANCE.getGenerator(s2docId);
		this.t2sGenerator = Template2StructureRegistry.INSTANCE.getGenerator(this.documentTemplate);
	}

	/**
	 *
	 * @param template
	 * @return
	 */
	protected DocumentStructureVersionHelper createDocumentStructureVersionHelper(final DocumentTemplate template) {
		return new DocumentStructureVersionHelper(template);
	}

	/**
	 *
	 * @return
	 *         a status containing the result of the generation
	 */
	public IGenerationStatus generate() {
		IGenerationStatus result = generateDocumentStructure();
		if (result.isOK()) {
			final Document generatedDocument = result.getAdaptedResult(Document.class);
			Assert.isNotNull(generatedDocument);
			result = generateDocument(generatedDocument);
			if (result.isOK()) {
				final GenerationStatus newResult = new GenerationStatus(IStatus.OK, Activator.PLUGIN_ID, "The DocumentStructure and the file have been successfully generated."); //$NON-NLS-1$
				newResult.setResult(result.getResult());
				result = newResult;
			}
		}
		return result;
	}

	/**
	 * This method generates the {@link Document} structure
	 *
	 * @return
	 *         a status containing the result of the generation
	 */
	protected IGenerationStatus generateDocumentStructure() {
		final Template2StructureGeneratorWrapper wrapper = new Template2StructureGeneratorWrapper(this.documentTemplate, this.versionHelper);
		return wrapper.generateDocumentStructure();
	}

	/**
	 *
	 * @param documentStructure
	 *            the intermediate document structure
	 * @return
	 *         a status containing the result of the generation
	 */
	protected IGenerationStatus generateDocument(final Document documentStructure) {
		final IStructure2DocumentGenerator generator = Structure2DocumentRegistry.INSTANCE.getGenerator(documentStructure);
		if (generator == null) {
			return new GenerationStatus(IStatus.ERROR, Activator.PLUGIN_ID, "We can't found the document generator."); //$NON-NLS-1$

		}
		if (!generator.handles(documentStructure)) {
			return new GenerationStatus(IStatus.ERROR, Activator.PLUGIN_ID, NLS.bind("The generator {0} doesn't handle the document structure.", generator.getGeneratorId())); //$NON-NLS-1$
		}
		GenerationStatus result = new GenerationStatus(IStatus.OK, Activator.PLUGIN_ID, "The document generation succeed."); //$NON-NLS-1$
		final Object resultGeneration = generator.generate(documentStructure);
		result.setResult(resultGeneration);
		return result;
	}



}
