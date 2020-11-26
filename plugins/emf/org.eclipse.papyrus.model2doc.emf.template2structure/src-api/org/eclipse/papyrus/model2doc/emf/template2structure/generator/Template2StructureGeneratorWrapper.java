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

package org.eclipse.papyrus.model2doc.emf.template2structure.generator;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.papyrus.model2doc.core.status.GenerationStatus;
import org.eclipse.papyrus.model2doc.core.status.IGenerationStatus;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.command.Template2StructureCommandFactory;
import org.eclipse.papyrus.model2doc.emf.template2structure.helpers.DocumentStructureVersionHelper;

/**
 * This class allows to wrap the Document Structure generator with the management of the versioning
 */
public final class Template2StructureGeneratorWrapper {

	/**
	 * the document template
	 */
	private final DocumentTemplate documentTemplate;

	/**
	 * the version helper
	 */
	private final DocumentStructureVersionHelper versionHelper;

	/**
	 *
	 * Constructor.
	 *
	 * @param documentTemplate
	 *            the document template for which we want to generate a document structure
	 *
	 *            Using this constructor, the generated document structure won't have a version number
	 */
	public Template2StructureGeneratorWrapper(final DocumentTemplate documentTemplate) {
		this(documentTemplate, new DocumentStructureVersionHelper(documentTemplate));
	}

	/**
	 *
	 * Constructor.
	 *
	 * @param documentTemplate
	 *            the document template for which we want to generate a document structure
	 * @param versionhelper
	 *            this helper allows to the version of the generated document structure. This helper can open a dialog if required (depends on its implementation
	 */
	public Template2StructureGeneratorWrapper(final DocumentTemplate documentTemplate, final DocumentStructureVersionHelper versionhelper) {
		this.documentTemplate = documentTemplate;
		this.versionHelper = versionhelper;
	}


	/**
	 *
	 * @return
	 *         an IStatus representing the result of the Document generation
	 */
	public IGenerationStatus generateDocumentStructure() {
		final TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(this.documentTemplate);
		if (domain == null) {
			return new GenerationStatus(IStatus.ERROR, Activator.PLUGIN_ID, "The editing domain can't be found."); //$NON-NLS-1$
		}
		final String version = versionHelper.getDocumentVersion();
		if (version == null) {
			return new GenerationStatus(IStatus.CANCEL, Activator.PLUGIN_ID, "The creation has been cancelled."); //$NON-NLS-1$
		}
		final Command generatorCommand = Template2StructureCommandFactory.eINSTANCE.getGenerateDocumentStructureCommand(domain, this.documentTemplate, version);
		if (generatorCommand == null) {
			return new GenerationStatus(IStatus.ERROR, Activator.PLUGIN_ID, "The Template to Stucture Command has not been found."); //$NON-NLS-1$
		}
		if (!generatorCommand.canExecute()) {
			return new GenerationStatus(IStatus.ERROR, Activator.PLUGIN_ID, "The Template to Stucture Command can't be executed."); //$NON-NLS-1$
		}

		domain.getCommandStack().execute(generatorCommand);
		if (version != null && !version.isEmpty()) {
			this.versionHelper.saveLastGeneratedDocumentVersion(version);
		}

		final Collection<?> commandResult = generatorCommand.getResult();
		final Iterator<?> iter = commandResult.iterator();
		if (iter.hasNext()) {
			final Object tmp = iter.next();
			if (tmp instanceof Document) {
				final GenerationStatus result = new GenerationStatus(Status.OK, Activator.PLUGIN_ID, "The generation of the DocumentStructure is now finished."); //$NON-NLS-1$
				result.setResult(tmp);
				return result;
			}
		}

		return new GenerationStatus(IStatus.ERROR, Activator.PLUGIN_ID, "The creation of the document structure failed for an unknown reason."); //$NON-NLS-1$
	}


}
