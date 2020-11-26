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

package org.eclipse.papyrus.model2doc.odt.emf.template2pdf.internal.handler;

import java.util.List;
import java.util.Map;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.papyrus.model2doc.core.status.GenerationStatus;
import org.eclipse.papyrus.model2doc.core.status.IGenerationStatus;
import org.eclipse.papyrus.model2doc.emf.template2document.internal.handler.GenerateStructureAndDocumentHandler;
import org.eclipse.papyrus.model2doc.odt.emf.template2pdf.Activator;
import org.eclipse.papyrus.model2doc.odt.emf.template2pdf.internal.menu.Template2PDFMenuConstants;
import org.eclipse.papyrus.model2doc.odt.internal.pdf.PDFExporter;
import org.eclipse.papyrus.model2doc.odt.internal.pdf.PDFVersion;

/**
 * This handler allows to generate the document structure and the final document
 * in one step
 */
public class GenerateStructureDocumentAndPDFHandler extends GenerateStructureAndDocumentHandler
		implements IExecutableExtension {

	/**
	 * handler parameter ID to get the PDF version (defined in the plugin.xml and
	 * initialized by Eclipse with {@link #setInitializationData(IConfigurationElement, String, Object)})
	 */
	private static final String HANDLER_PARAMETER_ID = "org.eclipse.papyrus.model2doc.odt.emf.template2pdf.pdfVersion"; //$NON-NLS-1$

	/**
	 * the version of the pdf to use for the export
	 */
	private PDFVersion pdfVersion = PDFVersion.PDF_DEFAULT;


	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2document.internal.handler.GenerateStructureAndDocumentHandler#generate()
	 *
	 * @return
	 */
	@Override
	protected IGenerationStatus generate() {
		final IGenerationStatus status = super.generate();
		if (status.isOK()) {
			final String generatedDocumentPath = status.getAdaptedResult(String.class);
			Assert.isNotNull(generatedDocumentPath);
			PDFExporter exporter = new PDFExporter();
			exporter.setPDFVersion(this.pdfVersion);
			exporter.setOpenEndDialog(false);
			try {
				final String pdfPath = exporter.exportToPDF(generatedDocumentPath);
				final IGenerationStatus newStatus = new GenerationStatus(IStatus.OK, Activator.PLUGIN_ID, "The generation of pdf file succeed"); //$NON-NLS-1$
				newStatus.setResult(pdfPath);
				return newStatus;
			} catch (Exception e) {
				Activator.log.error(e);
				return new GenerationStatus(IStatus.ERROR, Activator.PLUGIN_ID, "The PDF generation failed with an Exception", e); //$NON-NLS-1$
			}
		}
		return status;
	}

	/**
	 *
	 * @param evaluationContext
	 * @return
	 */
	@Override
	protected boolean computeEnable(Object evaluationContext) {
		boolean enable = super.computeEnable(evaluationContext);
		if (evaluationContext instanceof IEvaluationContext) {
			final IEvaluationContext iEvaluationContext = (IEvaluationContext) evaluationContext;
			iEvaluationContext.addVariable(Template2PDFMenuConstants.VARIABLE_PDF_VERSION_MENU_LABEL, this.pdfVersion.getName());
		}
		return enable;
	}

	/**
	 *
	 * @param labels
	 * @return
	 */
	@Override
	protected String createMenuLabel(final List<String> labels) {
		labels.add(this.pdfVersion.getName());
		return super.createMenuLabel(labels);
	}

	/**
	 * initialization of the pdf version to use for the export parameters for the
	 * handler is declared in the plugin.xml and this method is called by Eclipse
	 * framework
	 */
	@Override
	public void setInitializationData(final IConfigurationElement config, final String propertyName, final Object data)
			throws CoreException {
		if (data instanceof Map<?, ?> && HANDLER_PARAMETER_ID != null) {
			this.pdfVersion = PDFVersion.getPDFVersionByString((String) ((Map<?, ?>) data).get(HANDLER_PARAMETER_ID));
		}
		if (this.pdfVersion == null) {
			// should not be possible
			this.pdfVersion = PDFVersion.PDF_DEFAULT;
		}
	}

}
