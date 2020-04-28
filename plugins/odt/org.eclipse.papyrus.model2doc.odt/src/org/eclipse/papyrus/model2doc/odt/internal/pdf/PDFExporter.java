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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.odt.internal.pdf;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.odt.Activator;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTFilterName;
import org.eclipse.papyrus.model2doc.odt.internal.editor.ODTEditor;
import org.eclipse.papyrus.model2doc.odt.internal.editor.StorePropertiesConstants;
import org.eclipse.papyrus.model2doc.odt.internal.message.Messages;
import org.eclipse.swt.widgets.Display;

import com.sun.star.beans.PropertyValue;

/**
 * look https://forum.openoffice.org/en/forum/viewtopic.php?f=44&t=1804&start=0 for more example about the export to PDF
 */
public final class PDFExporter {

	/**
	 * the pdf version to use to do the save
	 */
	private PDFVersion pdfVersion = PDFVersion.PDF_DEFAULT;

	/**
	 * boolean indicating if we must override an existing file during the save or not
	 */
	private boolean overwrite = true;

	private static final String DOT = "."; //$NON-NLS-1$

	private static final String PDF_EXTENSION = "pdf"; //$NON-NLS-1$

	private boolean openEndDialog = false;

	/**
	 *
	 * Constructor.
	 *
	 */
	public PDFExporter() {
		// nothing to do
	}

	/**
	 *
	 * @param inputFileURI
	 *            the uri of the file to export. The uri must starts with file:/// or file:/
	 * @return
	 *         the uri of the generated file or <code>null</code>. The returned URI will start with file:///
	 * @throws Exception
	 */
	public String exportToPDF(final String inputFileURI) throws Exception {
		int lastDot = inputFileURI.lastIndexOf(DOT);
		final String filePathWithoutExtension = inputFileURI.substring(0, lastDot);
		final StringBuilder outputFilePathBuilder = new StringBuilder(filePathWithoutExtension);
		outputFilePathBuilder.append(DOT);
		outputFilePathBuilder.append(PDF_EXTENSION);

		return saveFile(inputFileURI, outputFilePathBuilder.toString());
	}

	/**
	 *
	 * @param inputFileURI
	 * @param outputFolderURI
	 * @return
	 */
	public String exportToPDF(final String inputFileURI, final String outputFolderURI) throws Exception {
		final int lastSeparator = inputFileURI.lastIndexOf(ODTEditor.LIBREOFFICE_FILE_SEPARATOR);
		final String outputFileName = inputFileURI.substring(lastSeparator + 1, inputFileURI.lastIndexOf(DOT));
		final StringBuffer outputFilePathBuilder = new StringBuffer(outputFolderURI);
		if (!outputFolderURI.endsWith(ODTEditor.LIBREOFFICE_FILE_SEPARATOR)) {
			outputFilePathBuilder.append(ODTEditor.LIBREOFFICE_FILE_SEPARATOR);
		}
		outputFilePathBuilder.append(outputFileName);
		outputFilePathBuilder.append(DOT);
		outputFilePathBuilder.append(PDF_EXTENSION);

		return saveFile(inputFileURI, outputFilePathBuilder.toString());
	}



	public String exportToPDF(final String inputFileURI, final String outputFolderURI, final String outputFileName) throws Exception {
		if (outputFileName.contains(DOT)) {
			throw new Exception("The fileURI is not conform to the expected one"); //$NON-NLS-1$
		}
		final StringBuffer outputFilePathBuilder = new StringBuffer(outputFolderURI);
		if (!outputFolderURI.endsWith(ODTEditor.LIBREOFFICE_FILE_SEPARATOR)) {
			outputFilePathBuilder.append(ODTEditor.LIBREOFFICE_FILE_SEPARATOR);
		}
		outputFilePathBuilder.append(outputFileName);
		outputFilePathBuilder.append(DOT);
		outputFilePathBuilder.append(PDF_EXTENSION);

		return saveFile(inputFileURI, outputFilePathBuilder.toString());

	}

	protected final String saveFile(final String inputFileURI, final String outputFileURI) {
		final ODTEditor odtEditor = new ODTEditor();
		final PropertyValue[] storeProperties = createStoreProperties();
		String savedFilePath = null;
		try {
			savedFilePath = odtEditor.saveAs(inputFileURI, outputFileURI, storeProperties);
			if (this.openEndDialog) {
				openEndDialog(savedFilePath.replaceAll(ODTEditor.LIBREOFFICE_FILE_PREFIX, "")); //$NON-NLS-1$
			}
			return savedFilePath;
		} catch (Exception e) {
			Activator.log.error(e);
		}
		return null;
	}

	private void openEndDialog(final String generatedFilePath) {
		MessageDialog.openInformation(Display.getDefault().getActiveShell(), Messages.PDFExporter_GeneratePDF, NLS.bind(Messages.PDFExporter_PDFHasBeenGenerated, generatedFilePath));
	}


	/**
	 * @param pdfVersion
	 *            the pdfVersion to set
	 */
	public void setPDFVersion(PDFVersion pdfVersion) {
		this.pdfVersion = pdfVersion;
	}

	/**
	 * @param overwrite
	 *            the overwrite to set
	 */
	public void setOverwrite(boolean overwrite) {
		this.overwrite = overwrite;
	}

	/**
	 * @param openEndDialog
	 *            the openEndDialog to set
	 */
	public void setOpenEndDialog(boolean openEndDialog) {
		this.openEndDialog = openEndDialog;
	}

	private final PropertyValue[] createStoreProperties() {
		final List<PropertyValue> values = doCreateStoreProperties();
		return values.toArray(new PropertyValue[values.size()]);
	}

	protected List<PropertyValue> doCreateStoreProperties() {
		final List<PropertyValue> values = new ArrayList<>();
		PropertyValue storeProps = new PropertyValue();
		values.add(storeProps);
		storeProps = new PropertyValue();
		storeProps.Name = StorePropertiesConstants.OVERWRITE;
		storeProps.Value = this.overwrite;

		storeProps = new PropertyValue();
		values.add(storeProps);
		storeProps.Name = StorePropertiesConstants.FILTER_NAME; // $NON-NLS-1$
		storeProps.Value = ODTFilterName.WRITER_PDF_EXPORT.getFilterName();

		storeProps = new PropertyValue();
		values.add(storeProps);
		storeProps.Name = StorePropertiesConstants.FILTER_DATA;
		storeProps.Value = createFilterData();
		return values;
	}

	private final PropertyValue[] createFilterData() {
		final List<PropertyValue> values = doCreateFilterData();
		return values.toArray(new PropertyValue[values.size()]);
	}

	protected List<PropertyValue> doCreateFilterData() {
		final List<PropertyValue> values = new ArrayList<>();
		PropertyValue storeProps = new PropertyValue();
		values.add(storeProps);
		storeProps.Name = PDFFilterDataConstants.SELECT_PDF_VERSION;
		storeProps.Value = this.pdfVersion.getCode();
		return values;
	}


}
