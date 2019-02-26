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
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;

import org.eclipse.papyrus.model2doc.core.service.FileIOService;
import org.eclipse.papyrus.model2doc.core.service.FileIOServiceImpl;
import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceService;
import org.eclipse.papyrus.model2doc.core.service.WorkspaceResourceServiceImpl;
import org.eclipse.papyrus.model2doc.odt.Activator;

/**
 * This class contains utils methods and constants to get the libreoffice installation path
 * 
 * @author vl222926
 *
 */
public class LibreOfficeInstallationPathUtil {
	
	private static WorkspaceResourceService workspaceResourceService = new WorkspaceResourceServiceImpl();

	private static final String OS_NAME_PROPERTY = "os.name"; //$NON-NLS-1$

	private static final String ARCHITECTURE_PROPERTY = "sun.arch.data.model"; //$NON-NLS-1$
	
	private static final String MODEL2DOC_LIBREOFFICE_PROPERTIES_FILE = "model2doc_libreoffice.properties"; //$NON-NLS-1$
	
	private static final String LIBREOFFICE_PATH_PROPERTY = "libreoffice.path"; //$NON-NLS-1$

	private static final String WINDOWS_CONST = "windows"; //$NON-NLS-1$

	private static final String LINUX_CONST = "linux"; //$NON-NLS-1$

	private static final String MAC_CONST = "mac"; //$NON-NLS-1$

	private static final String LIBREOFFICE_LINUX_PATH = "/usr/bin/libreoffice"; //$NON-NLS-1$

	private static final String LIBREOFFICE_MAC_PATH = "/Applications/LibreOffice.app/Contents/MacOS/soffice"; //$NON-NLS-1$

	private static final String LIBREOFFICE_WINDOWS_32_PATH = "C:/Program Files (x86)/LibreOffice/program"; //$NON-NLS-1$

	private static final String LIBREOFFICE_WINDOWS_64_PATH = "C:/Program Files/LibreOffice/program"; //$NON-NLS-1$
	
	private static final String ARCH_64 = "64"; //$NON-NLS-1$
	
	private static final  FileIOService fileIOService = new FileIOServiceImpl(); 
	
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
	 * @param projectName 
	 * 
	 * @return a string representing the path of the LibreOffice installation
	 */
	public static final String getLibreOfficeInstallation(String projectName) {
		String libreOfficePath = null;
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		StringBuilder model2DocConfigPath = new StringBuilder();
		model2DocConfigPath.append(project.getLocation().toString());
		model2DocConfigPath.append(File.separator);
		model2DocConfigPath.append(workspaceResourceService.getModel2ConfigForder());
		File model2DocLibreOfficePropertiesFile = getModel2DocLibreOfficePropertiesFile(new Path(model2DocConfigPath.toString()));
		
		libreOfficePath = getLibreOfficePathFromPropertiesFile(model2DocLibreOfficePropertiesFile);
		
		return libreOfficePath;
	}

	/**
	 *  Dialog for setting the path of the LibreOffice installation.
	 *  
	 * @return a string representing the path of the LibreOffice installation
	 */
	private static String dialogSetLibreOfficeInstallation() {
		String libreofficePath = null;
		DirectoryDialog dirDialog = new DirectoryDialog(Display.getDefault().getActiveShell());
		
        dirDialog.setText("The LibreOffice installation path"); //$NON-NLS-1$
        dirDialog.setMessage("The LibreOffice installation folder can't be found. Please enter its path");  //$NON-NLS-1$
        
        libreofficePath = dirDialog.open();
        
        return libreofficePath;
	}
	
	/**
	 * Get path of LibreOffice Installation from "model2doc_libreoffice.properties".
	 * 
	 * @param model2DocLibreOfficePropertiesFile
	 * @return
	 */
	private static String getLibreOfficePathFromPropertiesFile(File model2DocLibreOfficePropertiesFile) {
		final String osName = System.getProperty(OS_NAME_PROPERTY);
		final String  arch = System.getProperty(ARCHITECTURE_PROPERTY);
		StringBuilder libreOfficePathProperty = new StringBuilder();
		
		libreOfficePathProperty.append(LIBREOFFICE_PATH_PROPERTY);
		libreOfficePathProperty.append("."); //$NON-NLS-1$
		
		if (osName.toLowerCase().contains(WINDOWS_CONST)) {
			// we are running on windows
			libreOfficePathProperty.append(WINDOWS_CONST);
			if (ARCH_64.equals(arch)) {
				libreOfficePathProperty.append("."); //$NON-NLS-1$
				libreOfficePathProperty.append(ARCH_64);
			}

		} else if (osName.toLowerCase().contains(LINUX_CONST)) {
			// we are running on linux
			libreOfficePathProperty.append(LINUX_CONST);
		} else if (osName.toLowerCase().contains(MAC_CONST)) {
			// we are running on Mac
			libreOfficePathProperty.append(MAC_CONST);
		} else {
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Your OS is not support.", null);
			return null;
		}
		
		String libreOfficePath = getValueOfLibreOfficePathProperty(model2DocLibreOfficePropertiesFile, libreOfficePathProperty.toString());
		
		if (libreOfficePath == null) {
			libreOfficePath = setLibreOfficePathProperty(model2DocLibreOfficePropertiesFile, libreOfficePathProperty.toString(), osName, arch, null);
		} else {
			// Verify if the path exist
			if (!new File(libreOfficePath).exists()) {
				// If NOT then open dialog for setting a new path 
				libreOfficePath = dialogSetLibreOfficeInstallation();
				setLibreOfficePathProperty(model2DocLibreOfficePropertiesFile, libreOfficePathProperty.toString(), osName, arch, libreOfficePath);
			}
		}

		return libreOfficePath;
	}

	/**
	 * Set property for LibreOffice path.
	 * 
	 * @param model2DocLibreOfficePropertiesFile
	 * @param libreOfficePathProperty
	 * @param osName
	 * @param arch
	 * @return
	 */
	private static String setLibreOfficePathProperty(File model2DocLibreOfficePropertiesFile, String libreOfficePathProperty, String osName, String arch, String libreOfficePath) {
		// Build new line of LibreOffice path property with value for add or update
		StringBuilder newLibreOfficePathPropertyWithValue = new StringBuilder();
		newLibreOfficePathPropertyWithValue.append(libreOfficePathProperty);
		newLibreOfficePathPropertyWithValue.append("="); //$NON-NLS-1$
		
		if (libreOfficePath != null && !libreOfficePath.isEmpty()) {
			newLibreOfficePathPropertyWithValue.append(libreOfficePath);
		} else {
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
		}

		// Verify if the path exist
		if (!new File(libreOfficePath).exists()) {
			// If NOT then open dialog for setting a new path 
			libreOfficePath = dialogSetLibreOfficeInstallation();
		}
		
		// End to build new line of LibreOffice path property wit value (LibreOffice path)
		newLibreOfficePathPropertyWithValue.append(libreOfficePath);
		
		// Write or replace LibreOffice path property
		Stream<String> lines = null;
		try {
			lines = Files.lines(model2DocLibreOfficePropertiesFile.toPath());
			
			// Remove line with the old property value if exist
			List<String> updateContent = lines
					.filter(line -> !line.startsWith(libreOfficePathProperty))
					.collect(Collectors.toList());
			
			// Add property with current value
			updateContent.add(newLibreOfficePathPropertyWithValue.toString());
			
			// Write file with update content
			Files.write(model2DocLibreOfficePropertiesFile.toPath(),updateContent);
			
		} catch (IOException e) {
			Activator.log.error(e);
		} finally {
			if (lines != null) {
				lines.close();
			}
		}
		
		return libreOfficePath;
	}

	/**
	 * Get value of LibreOffice path property.
	 * 
	 * @param model2DocLibreOfficePropertiesFile
	 * @param libreOfficePathProperty
	 * @return
	 */
	private static String getValueOfLibreOfficePathProperty(File model2DocLibreOfficePropertiesFile, String libreOfficePathProperty) {
		String libreOfficePath = null;
		Stream<String> lines = null;
		try {
			lines = Files.lines(model2DocLibreOfficePropertiesFile.toPath());
			// Get line with the property
			List<String> selectLines = lines
					.filter(line -> line.startsWith(libreOfficePathProperty))
					.collect(Collectors.toList());
			
			if (!selectLines.isEmpty()) {
				// property=value
				String[] propertyLine = selectLines.get(0).split(Pattern.quote("=")); //$NON-NLS-1$
				
				if (propertyLine.length > 1) {
					// Get value of property
					libreOfficePath = propertyLine[1];
				}
			}
			
		} catch (IOException e) {
			Activator.log.error(e);
		} finally {
			if (lines != null) {
				lines.close();
			}
		}
		
		return libreOfficePath;
	}

	/**
	 * Get/Create Model2Doc LibreOffice properties file.
	 * 
	 * @param rootPath 
	 * 
	 * @return
	 */
	private static File getModel2DocLibreOfficePropertiesFile(IPath rootPath) {
		StringBuilder  foldersPath = new StringBuilder();
		foldersPath.append(rootPath.toString());
		foldersPath.append(File.separator);
		fileIOService.createFoldersPath(foldersPath.toString());
		StringBuilder propertiesPath = new StringBuilder();
		propertiesPath.append(foldersPath.toString());
		propertiesPath.append(MODEL2DOC_LIBREOFFICE_PROPERTIES_FILE);
		
		File model2DocLibreOfficePropertiesFile = new File(propertiesPath.toString());
		
		if (!model2DocLibreOfficePropertiesFile.exists()) {
			try {
				if (!model2DocLibreOfficePropertiesFile.createNewFile()) {
					Activator.log.debug("Immpossible to create  a new Model2Doc LibreOffice Properties File."); //$NON-NLS-1$
				}
			} catch (IOException e) {
				Activator.log.error(e);
			} 
		}
		
		return model2DocLibreOfficePropertiesFile;
	}
}
