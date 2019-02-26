/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.internal.editor;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import org.eclipse.papyrus.model2doc.core.config.GeneratorConfig;
import org.eclipse.papyrus.model2doc.odt.internal.message.Messages;
import org.eclipse.papyrus.model2doc.odt.Activator;
import org.eclipse.papyrus.model2doc.odt.internal.util.ExtensionConstants;
import org.eclipse.papyrus.model2doc.odt.service.LibreOfficeInstallationService;
import org.eclipse.papyrus.model2doc.odt.service.LibreOfficeInstallationServiceImpl;
import org.eclipse.papyrus.model2doc.odt.service.ODTEditorService;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOService;
import org.eclipse.papyrus.model2doc.odt.service.ODTFileIOServiceImpl;
import com.sun.star.awt.XWindow;
import com.sun.star.beans.PropertyValue;
import com.sun.star.frame.XComponentLoader;
import com.sun.star.frame.XController;
import com.sun.star.frame.XDesktop;
import com.sun.star.frame.XModel;
import com.sun.star.frame.XStorable;
import com.sun.star.io.IOException;
import com.sun.star.lang.IllegalArgumentException;
import com.sun.star.lang.XComponent;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.system.SimpleMailClientFlags;
import com.sun.star.system.XSimpleMailClient;
import com.sun.star.system.XSimpleMailClientSupplier;
import com.sun.star.system.XSimpleMailMessage;
import com.sun.star.text.XPageCursor;
import com.sun.star.text.XTextDocument;
import com.sun.star.text.XTextViewCursorSupplier;
import com.sun.star.uno.UnoRuntime;
import com.sun.star.uno.XComponentContext;
import com.sun.star.util.CloseVetoException;
import com.sun.star.util.XCloseable;

import ooo.connector.BootstrapSocketConnector;

/**
 * ODT Editor is dedicated to management of odt files and interaction with LibreOffice Writer.
 *
 */
public class ODTEditor {

	private XComponentLoader officeLoader = null;
	private XTextDocument xTextDocument = null;
	private XDesktop xDesktop = null;
	private GeneratorConfig configuration;
	private XMultiComponentFactory xMultiComponentFactory = null;
	private XMultiServiceFactory xMultiServiceFactory = null;
	private XComponentContext xComponentContext = null;
	private String projectFolder = null;
	private ODTFileIOService fileIOService = null;

	/**
	 * Constructor.
	 * 
	 * @param projectFolder
	 * 
	 * @param generatorConfig
	 */
	public ODTEditor(String projectFolder) {
		fileIOService = new ODTFileIOServiceImpl();
		// Take LibreOffice Loader
		this.projectFolder = projectFolder;
		loadOffice(projectFolder);
	}

	/**
	 * Constructor.
	 * 
	 * @param generatorConfig
	 */
	public ODTEditor(GeneratorConfig generatorConfig) {
		this.configuration = generatorConfig;
		projectFolder = configuration.getProject();
		// Take LibreOffice Loader
		loadOffice(projectFolder);
		if (officeLoader != null) {
			// Create text document
			fileIOService = new ODTFileIOServiceImpl();
			createTextDocument(fileIOService.convertTemplatePathForLibreOffice(generatorConfig));
			xMultiServiceFactory = UnoRuntime.queryInterface(XMultiServiceFactory.class, xTextDocument);
		}
	}

	/**
	 * Get text document.
	 * 
	 * @return
	 */
	public XTextDocument getXTextDocument() {
		return xTextDocument;
	}

	/**
	 * Get XMultiComponentFactory.
	 * 
	 * @return
	 */
	public XMultiComponentFactory getXMultiComponentFactory() {
		return xMultiComponentFactory;
	}

	/**
	 * Get XMultiServiceFactory.
	 * 
	 * @return
	 */
	public XMultiServiceFactory getXMultiServiceFactory() {
		return xMultiServiceFactory;
	}

	/**
	 * Get XComponentContext.
	 * 
	 * @return
	 */
	public XComponentContext getXComponentContext() {
		return xComponentContext;
	}

	/**
	 * Get Page Cursor.
	 * 
	 * @return
	 */
	public XPageCursor getPageCursor() {
		XModel model = UnoRuntime.queryInterface(XModel.class, xTextDocument);
		XController xController = model.getCurrentController();
		XTextViewCursorSupplier supplier = UnoRuntime.queryInterface(XTextViewCursorSupplier.class, xController);
		return UnoRuntime.queryInterface(XPageCursor.class, supplier.getViewCursor());
	}

	/**
	 * Open document.
	 * 
	 * @param documentURL
	 *                        the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 */
	public void openDocument(String documentURL) {
		XComponent xComponent = getDocument(documentURL);
		if (xComponent != null) {
			XModel model = UnoRuntime.queryInterface(XModel.class, xComponent);
			XWindow xWindow = model.getCurrentController().getFrame().getContainerWindow();
			// Open or not LibreOffice Writer
			xWindow.setVisible(true);
			xWindow.setFocus();
		}

	}

	/**
	 * Save document.
	 * 
	 * @param fileName
	 */
	public void save(String fileName) {
		// Save document
		saveAs(fileName, ODTEditorService.DOCUMENT_KIND); // $NON-NLS-1$
	}

	/**
	 * Save document as "extension".
	 * 
	 * @param fileName
	 * @param extension
	 * 
	 * @return
	 * 		the full URL of exported document (LibreOffice format, ex.: file:///C:/folder/projectName/document.pdf)
	 */
	public String saveAs(String fileName, String extension) {
		// Save document
		String exportedDocumentURL = saveDocument(fileName, extension); // $NON-NLS-1$
		// Close document
		closeDocument();
		// Close LibreOffice
		closeLibreOffice();

		return exportedDocumentURL;
	}

	/**
	 * Export document.
	 * 
	 * @param fileName
	 * @param documentURL
	 *                        the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 * @param extension
	 * 
	 * @return
	 * 		the full URL of exported document (LibreOffice format, ex.: file:///C:/folder/projectName/document.pdf)
	 */
	public String exportDocument(String fileName, String documentURL, String extension) {
		XComponent xComponent = getDocument(documentURL);
		if (xComponent != null) {
			xTextDocument = UnoRuntime.queryInterface(XTextDocument.class, xComponent);
			return saveAs(fileName, extension);
		}
		return null;
	}

	/**
	 * Get format by extension.
	 * 
	 * @param extention
	 * @return
	 */
	public String getFormat(String extension) {

		switch (extension) {
		case ODTEditorService.DOCUMENT_KIND: // $NON-NLS-1$
			return "writer8"; //$NON-NLS-1$

		case ExtensionConstants.PDF: // $NON-NLS-1$
			return "writer_pdf_Export"; //$NON-NLS-1$

		default:
			return "writer8";
		}
	}

	/**
	 * Send mail with attached document.
	 * 
	 * @param subject
	 * @param documentToAttach
	 *                             the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 */
	public void sendMail(String subject, String documentToAttach) {
		System.out.println("Subject: " + subject + " DocomentURL: " + documentToAttach);

		XSimpleMailClientSupplier xSimpleMailClientSupplier = createSimpleMailClientSupplier();
		if (xSimpleMailClientSupplier != null) {
			XSimpleMailClient xSimpleMailClient = xSimpleMailClientSupplier.querySimpleMailClient();

			XSimpleMailMessage mailMessage = xSimpleMailClient.createSimpleMailMessage();
			mailMessage.setSubject(subject);

			if (documentToAttach != null) {
				String[] attachs = new String[1];
				attachs[0] = documentToAttach;
				mailMessage.setAttachement(attachs);
			}

			try {
				xSimpleMailClient.sendSimpleMailMessage(mailMessage, SimpleMailClientFlags.DEFAULTS);
			} catch (IllegalArgumentException | com.sun.star.uno.Exception e) {
				Activator.log.error(e);
			}
		} else {
			MessageDialog.openWarning(Display.getDefault().getActiveShell(), Messages.ODTEditor_SendMail, Messages.ODTEditor_MailClientWasNotFound);
		}

	}

	/**
	 * Close document.
	 * 
	 * @param documentURL
	 *                        the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 */
	public void closeDocument(String documentURL) {
		XComponent xComponent = getDocument(documentURL);
		if (xComponent != null) {
			xTextDocument = UnoRuntime.queryInterface(XTextDocument.class, xComponent);
			closeDocument();
			closeLibreOffice();
		}
	}

	/**
	 * Get document object.
	 * 
	 * @param documentURL
	 *                        the full URL of document (LibreOffice format, ex.: file:///C:/folder/projectName/document.odt)
	 * @return
	 */
	public XComponent getDocument(String documentURL) {
		XComponent xComponent = null;
		if (officeLoader != null) {
			PropertyValue[] props = new PropertyValue[2];
			props[0] = new PropertyValue();
			props[0].Name = "Hidden"; //$NON-NLS-1$
			props[0].Value = true;

			try {
				xComponent = officeLoader.loadComponentFromURL(documentURL, "_blank", 0, props);
			} catch (IllegalArgumentException | IOException e) {
				Activator.log.error("Unable to get document object from" + documentURL + " : ", e); //$NON-NLS-1$
			}
		}

		return xComponent;
	}

	/**
	 * This method does the UNO bootstrapping, gets the remote service manager and
	 * the loader object.
	 * 
	 * @param projectFolder
	 */
	private void loadOffice(String projectFolder) {
		LibreOfficeInstallationService libreOfficeInstallationService = new LibreOfficeInstallationServiceImpl();
		String oooExeFolder = libreOfficeInstallationService.getLibreOfficeInstallation(projectFolder);
		if (null != oooExeFolder && !oooExeFolder.isEmpty()) {
			try {
				// Get the remote LibreOffice component context
				xComponentContext = BootstrapSocketConnector.bootstrap(oooExeFolder);

				// Get the remote LibreOffice service manager
				xMultiComponentFactory = xComponentContext.getServiceManager();
				if (xMultiComponentFactory != null) {
					Object oDesktop = xMultiComponentFactory.createInstanceWithContext("com.sun.star.frame.Desktop", xComponentContext); //$NON-NLS-1$
					xDesktop = UnoRuntime.queryInterface(XDesktop.class, oDesktop);

					officeLoader = UnoRuntime.queryInterface(XComponentLoader.class, xDesktop);
				}
			} catch (Exception e) {
				Activator.log.error(e);
			} finally {
				// If it is not possible load LibreOffice.
				if (officeLoader == null) {
					MessageDialog msgDialog = new MessageDialog(Display.getDefault().getActiveShell(),
							"Warning - The generator does not work", //$NON-NLS-1$
							null, "Please verify that LibreOffice version 6 is installed.", //$NON-NLS-1$
							MessageDialog.WARNING, new String[] { "OK" }, 0); //$NON-NLS-1$
					msgDialog.open();
				}
			}
		} else {
			// TODO : do something
		}
	}

	/**
	 * Create text document.
	 * 
	 * @param templateURL
	 * @return
	 */
	private XTextDocument createTextDocument(String templateURL) {
		try {
			XComponent xComponent = null;

			if (templateURL != null && !templateURL.isEmpty()) {
				xComponent = createNewDocumentFromTemplate(templateURL);
			} else {
				xComponent = createNewDocument();
			}

			XModel model = UnoRuntime.queryInterface(XModel.class, xComponent);
			XWindow xWindow = model.getCurrentController().getFrame().getContainerWindow();
			// Open or not LibreOffice Writer
			xWindow.setVisible(false);
			xWindow.setFocus();

			xTextDocument = UnoRuntime.queryInterface(XTextDocument.class, xComponent);
		} catch (Exception e) {
			Activator.log.error(e);
		}

		return xTextDocument;
	}

	/**
	 * Create new document without template.
	 * 
	 * @return
	 */
	private XComponent createNewDocument() {
		String sURL = "private:factory/swriter"; //$NON-NLS-1$

		XComponent xComponent = null;
		PropertyValue[] xEmptyArgs = new PropertyValue[0];

		try {
			xComponent = officeLoader.loadComponentFromURL(sURL, "_blank", 0, xEmptyArgs); //$NON-NLS-1$

		} catch (Exception e) {
			Activator.log.error(e);
		}

		return xComponent;
	}

	/**
	 * Create new document from template.
	 * 
	 * @param templateURL
	 * @return
	 */
	private XComponent createNewDocumentFromTemplate(String templateURL) {

		XComponent xComponent = null;
		try {
			officeLoader = UnoRuntime.queryInterface(XComponentLoader.class, officeLoader);
			PropertyValue[] props = new PropertyValue[2];
			props[0] = new PropertyValue();
			props[0].Name = "Hidden"; //$NON-NLS-1$
			props[0].Value = true;

			props[1] = new PropertyValue();
			props[1].Name = "AsTemplate"; //$NON-NLS-1$
			props[1].Value = true;

			xComponent = officeLoader.loadComponentFromURL(templateURL, "_blank", 0, props); //$NON-NLS-1$
		} catch (Exception e) {
			Activator.log.error(e);
		}

		if (xComponent == null) {
			xComponent = createNewDocument();
		}
		return xComponent;
	}

	/**
	 * Create Simple Mail Client Supplier.
	 * 
	 * @return
	 */
	private XSimpleMailClientSupplier createSimpleMailClientSupplier() {
		XSimpleMailClientSupplier xSimpleMailClientSupplier = null;

		Object oSimpleMailClientSupplier = null;
		try {
			oSimpleMailClientSupplier = xMultiComponentFactory.createInstanceWithContext("com.sun.star.system.SimpleSystemMail", xComponentContext);
			// If user uses Windows, the result is not null
			if (oSimpleMailClientSupplier != null) {
				xSimpleMailClientSupplier = UnoRuntime.queryInterface(XSimpleMailClientSupplier.class, oSimpleMailClientSupplier);
			} else {
				oSimpleMailClientSupplier = xMultiComponentFactory.createInstanceWithContext("com.sun.star.system.SimpleCommandMail", xComponentContext);
				// If user uses Linux or Mac, the result is not null
				if (oSimpleMailClientSupplier != null) {
					xSimpleMailClientSupplier = UnoRuntime.queryInterface(XSimpleMailClientSupplier.class, oSimpleMailClientSupplier);
				}
			}
		} catch (com.sun.star.uno.Exception e) {
			Activator.log.error(e);
		}

		return xSimpleMailClientSupplier;
	}

	/**
	 * Save document.
	 * 
	 * @param fileName
	 * @param extension
	 * 
	 * @return
	 * 		the full URL of exported document (LibreOffice format, ex.: file:///C:/folder/projectName/document.pdf)
	 */
	private String saveDocument(String fileName, String extension) {
		StringBuilder fileNameWithExtension = new StringBuilder();
		fileNameWithExtension.append(fileName);
		fileNameWithExtension.append("."); //$NON-NLS-1$
		fileNameWithExtension.append(extension);

		XStorable store = UnoRuntime.queryInterface(XStorable.class, xTextDocument);
		String saveFileURL = fileIOService.fileNameToURL(fileNameWithExtension.toString(), projectFolder);

		if (saveFileURL == null) {// not possible with the current implementation
			return null;
		}
		PropertyValue[] storeProps = new PropertyValue[2];
		storeProps[0] = new PropertyValue();
		storeProps[0].Name = "Overwrite"; //$NON-NLS-1$
		storeProps[0].Value = true;

		storeProps[1] = new PropertyValue();
		storeProps[1].Name = "FilterName"; //$NON-NLS-1$
		storeProps[1].Value = getFormat(extension);

		try {
			store.storeToURL(saveFileURL, storeProps);
		} catch (com.sun.star.io.IOException e) {
			Activator.log.error(fileName + " have not been saved: ", e); //$NON-NLS-1$
		}

		return saveFileURL;
	}

	/**
	 * Close document.
	 * 
	 */
	private void closeDocument() {
		XCloseable closeable = UnoRuntime.queryInterface(XCloseable.class, xTextDocument);
		if (closeable == null) {
			return;
		}

		try {
			closeable.close(false);
		} catch (com.sun.star.lang.DisposedException e) {
			Activator.log.warn("Document close failed since LibreOffice link disposed."); //$NON-NLS-1$
		} catch (CloseVetoException e) {
			Activator.log.error("Close was vetoed: ", e); //$NON-NLS-1$
		}
	}

	/**
	 * Close LibreOffice.
	 * 
	 */
	private void closeLibreOffice() {
		if (xDesktop == null) {
			return;
		}

		try {
			boolean isOfficeTerminated = xDesktop.terminate();

			if (isOfficeTerminated) {
				Activator.log.info("LibreOffice terminated."); //$NON-NLS-1$
			} else {
				Activator.log.warn("LibreOffice failed to terminate."); //$NON-NLS-1$
			}
		} catch (com.sun.star.lang.DisposedException e) {
			Activator.log.warn("LibreOffice link disposed."); //$NON-NLS-1$
		} catch (java.lang.Exception e) {
			Activator.log.error("Termination exception: ", e); //$NON-NLS-1$
		}

	}


}
