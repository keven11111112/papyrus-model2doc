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
package org.eclipse.papyrus.model2doc.odt.internal.util;


import java.io.File;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.odt.Activator;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;

/**
 * This class contains utils methods and constants to get the libreoffice installation path
 *
 * @author vl222926
 *
 */
public class LibreOfficeInstallationPathUtil {

	private static final String OS_NAME_PROPERTY = "os.name"; //$NON-NLS-1$

	private static final String ARCHITECTURE_PROPERTY = "sun.arch.data.model"; //$NON-NLS-1$

	private static final String LIBREOFFICE_PATH_PROPERTY = "libreoffice.path"; //$NON-NLS-1$

	private static final String WINDOWS_CONST = "windows"; //$NON-NLS-1$

	private static final String LINUX_CONST = "linux"; //$NON-NLS-1$

	private static final String MAC_CONST = "mac"; //$NON-NLS-1$

	private static final String LIBREOFFICE_LINUX_PATH = "/usr/bin/libreoffice"; //$NON-NLS-1$

	private static final String LIBREOFFICE_MAC_PATH = "/Applications/LibreOffice.app/Contents/MacOS/soffice"; //$NON-NLS-1$

	private static final String LIBREOFFICE_WINDOWS_32_PATH = "C:/Program Files (x86)/LibreOffice/program"; //$NON-NLS-1$

	private static final String LIBREOFFICE_WINDOWS_64_PATH = "C:/Program Files/LibreOffice/program"; //$NON-NLS-1$

	private static final String ARCH_64 = "64"; //$NON-NLS-1$


	/**
	 * Constructor.
	 *
	 */
	private LibreOfficeInstallationPathUtil() {
		// to avoid instantiation
	}

	/**
	 * Get path of LibreOffice Installation.
	 *
	 * @return a string representing the path of the LibreOffice installation
	 */
	public static final String getLibreOfficeInstallationPath() {
		String libreOfficePath = Activator.getDefault().getPreferenceStore().getString(LIBREOFFICE_PATH_PROPERTY);
		if (null == libreOfficePath || libreOfficePath.isEmpty()) {
			final String osName = System.getProperty(OS_NAME_PROPERTY);
			final String arch = System.getProperty(ARCHITECTURE_PROPERTY);
			// Get default LibreOffice installation path concerned by OS and architecture
			if (osName.toLowerCase().contains(WINDOWS_CONST)) {
				// we are running on windows
				if (ARCH_64.equals(arch)) {
					libreOfficePath = LIBREOFFICE_WINDOWS_64_PATH;
				} else {
					libreOfficePath = LIBREOFFICE_WINDOWS_32_PATH;// not tested
				}

			} else if (osName.toLowerCase().contains(LINUX_CONST)) {
				// we are running on linux
				libreOfficePath = LIBREOFFICE_LINUX_PATH;
			} else if (osName.toLowerCase().contains(MAC_CONST)) {
				// we are running on Mac
				libreOfficePath = LIBREOFFICE_MAC_PATH;
			}
			// Verify if the path exist
			if (!new File(libreOfficePath).exists()) {
				// If NOT then open dialog for setting a new path
				libreOfficePath = dialogSetLibreOfficeInstallation(libreOfficePath);
			}
			Activator.getDefault().getPreferenceStore().setValue(LIBREOFFICE_PATH_PROPERTY, libreOfficePath);
		}

		return libreOfficePath;
	}

	/**
	 * This method allows to reset the value of the LibreOffice path installation
	 */
	public static final void eraseLibreOfficeInstallationPath() {
		Activator.getDefault().getPreferenceStore().setValue(LIBREOFFICE_PATH_PROPERTY, "");
	}


	/**
	 * Dialog for setting the path of the LibreOffice installation.
	 *
	 * @return a string representing the path of the LibreOffice installation
	 */
	private static String dialogSetLibreOfficeInstallation(final String expectdLibreOfficePath) {
		MessageDialog.openInformation(Display.getDefault().getActiveShell(), "LibreOffice not found!",
				NLS.bind("We are looking for the LibreOffice installation folder and we didn't found it.\nPlease select LibreOffice installation path in the next dialog.\n Usually, it should be something like {0}.", expectdLibreOfficePath));

		String libreofficePath = null;
		DirectoryDialog dirDialog = new DirectoryDialog(Display.getDefault().getActiveShell());
		dirDialog.setFilterPath(null);

		dirDialog.setText("Select LibreOffice installation path.");
		dirDialog.setMessage("We are looking for your LibreOffice installation folder path and we can't found it.\n Please indicate us its installation path.");


		libreofficePath = dirDialog.open();

		return libreofficePath;
	}


}
