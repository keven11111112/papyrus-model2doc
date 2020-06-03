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

package org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.internal.handler;

import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.papyrus.model2doc.emf.structure2document.internal.handlers.GenerateDocumentFileHandler;
import org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.internal.menu.Structure2PDFMenuConstants;
import org.eclipse.papyrus.model2doc.odt.internal.pdf.PDFExporter;
import org.eclipse.papyrus.model2doc.odt.internal.pdf.PDFVersion;

public class GenerateDocumentAndPDFHandler extends GenerateDocumentFileHandler implements IExecutableExtension {

	/**
	 * handler parameter ID to get the PDF version (defined in the plugin.xml and
	 * initialized by Eclipse with
	 * {@link #setInitializationData(IConfigurationElement, String, Object)})
	 */
	private static final String HANDLER_PARAMETER_ID = "org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.pdfVersion"; //$NON-NLS-1$

	/**
	 * the version of the pdf to use for the export
	 */
	private PDFVersion pdfVersion = PDFVersion.PDF_DEFAULT;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Object result = super.execute(event);
		if (result instanceof String) {
			String generatedDocumentPath = (String) result;
			PDFExporter exporter = new PDFExporter();
			exporter.setPDFVersion(this.pdfVersion);
			exporter.setOpenEndDialog(true);
			try {
				return exporter.exportToPDF(generatedDocumentPath);
			} catch (Exception e) {
				org.eclipse.papyrus.model2doc.odt.emf.structure2pdf.Activator.log.error(e);
			}
		}
		return null;
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
			iEvaluationContext.addVariable(Structure2PDFMenuConstants.VARIABLE_PDF_VERSION_MENU_LABEL,
					this.pdfVersion.getName());
		}
		return enable;
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
