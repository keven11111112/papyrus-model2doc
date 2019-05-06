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
 *    Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.integration.gmf.template2structure.internal.mapping;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.style.DisplayMode;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.infra.core.sashwindows.di.service.IPageManager;
import org.eclipse.papyrus.infra.core.services.ServiceException;
import org.eclipse.papyrus.infra.core.services.ServicesRegistry;
import org.eclipse.papyrus.infra.emf.utils.ServiceUtilsForEObject;
import org.eclipse.papyrus.infra.nattable.export.image.ImageFormat;
import org.eclipse.papyrus.infra.nattable.manager.table.INattableModelManager;
import org.eclipse.papyrus.infra.nattable.manager.table.TreeNattableModelManager;
import org.eclipse.papyrus.infra.nattable.model.nattable.Table;
import org.eclipse.papyrus.infra.nattable.style.configattribute.PapyrusExportConfigAttributes;
import org.eclipse.papyrus.infra.nattable.tree.CollapseAndExpandActionsEnum;
import org.eclipse.papyrus.infra.ui.editor.IMultiDiagramEditor;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.operations.GeneratorConfigurationOperations;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateUtils;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusNattableDocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.PapyrusTableView;
import org.eclipse.papyrus_model2doc.integration.nattable.template2structure.Activator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

/**
 * This class create the DocumentStructure {@link Image} or Table from a {@link PapyrusTableView}
 */
public class PapyrusTableViewMapper extends AbstractTemplateToStructureMapper<PapyrusTableView> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public PapyrusTableViewMapper() {
		super(PapyrusNattableDocumentStructureTemplatePackage.eINSTANCE.getPapyrusTableView(), BodyPart.class);
	}

	/**
	 *
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param <T>
	 * @param mappingService
	 * @param papyrusTableView
	 * @param semanticModelElement
	 * @param returnedClassType
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final PapyrusTableView papyrusTableView, final EObject semanticModelElement, final Class<T> returnedClassType) {
		if (false == papyrusTableView.isGenerate()) {
			// This element can't have children, so if isGenerate() returns false, we go out!
			return Collections.emptyList();
		}
		final List<T> returnedValue = new ArrayList<>();


		final Iterator<Table> tableIter = papyrusTableView.getMatchingTables(semanticModelElement).iterator();
		Title title = null;
		if (tableIter.hasNext() && papyrusTableView.isGenerateTitle()) {
			title = DocumentStructureFactory.eINSTANCE.createTitle();
			title.setTitle(papyrusTableView.buildTitle(semanticModelElement));
			returnedValue.add(returnedClassType.cast(title));
		}
		while (tableIter.hasNext()) {
			Table current = tableIter.next();

			// the table mapping
			// we log info, because it can take times
			Activator.log.info(NLS.bind("Start the export of the table {0}.", current.getName())); //$NON-NLS-1$
			final BodyPart mapResult = mapTable(papyrusTableView, current);
			Activator.log.info(NLS.bind("End the export of the table {0}.", current.getName())); //$NON-NLS-1$


			if (null == mapResult) {
				Activator.log.warn(NLS.bind("We fail to import the table {0}.", current.getName())); //$NON-NLS-1$
			}
			if (null == title) {
				returnedValue.add(returnedClassType.cast(mapResult));
			} else {
				title.getSubBodyPart().add(mapResult);
			}
		}
		return returnedValue;
	}


	/**
	 *
	 * @param papyrusTableView
	 *            the view to map
	 * @param table
	 *            a table to import in the document
	 * @return
	 *         a body part representing the table, or <code>null</code> in case of failure
	 */
	private BodyPart mapTable(final PapyrusTableView papyrusTableView, final Table table) {

		switch (papyrusTableView.getImportMethod()) {
		case IMAGE:
			return mapTableAsImage(papyrusTableView, table);
		case TABLE: // this is the default case
		default:
			// return mapTableAsTable(papyrusTableView, table);
		}

		return null;
	}

	/**
	 *
	 * @param papyrusTableView
	 *            the {@link PapyrusTableView}
	 * @param table
	 *            a {@link Table} found for the {@link PapyrusTableView}
	 * @return
	 *         the table as Image
	 */
	private Image mapTableAsImage(final PapyrusTableView papyrusTableView, final Table table) {
		// 1. get the page manager
		final IPageManager pageManager = getIPageManager(table);
		if (null == pageManager) {
			return null;
		}

		// 2. open the table
		boolean closePage = false;
		if (pageManager.isOpen(table)) {
			pageManager.selectPage(table);
		} else {
			pageManager.openPage(table);
			closePage = true;
		}


		// 3. wait for the table opening
		flushEventLoop();


		// 4. get the table manager
		final INattableModelManager manager = getINattableModelManager(table);

		// 5. expand all the tables in case of TreeTable
		if (manager instanceof TreeNattableModelManager) {
			((TreeNattableModelManager) manager).doCollapseExpandAction(CollapseAndExpandActionsEnum.EXPAND_ALL, Collections.emptyList());
			flushEventLoop();
		}

		// 6. calculate the image path output
		final DocumentTemplate t = DocumentStructureTemplateUtils.getDocumentTemplate(papyrusTableView);
		final IDocumentStructureGeneratorConfiguration conf = t.getDocumentStructureGeneratorConfiguration();

		String imagePath = GeneratorConfigurationOperations.getImageFileLocalPath(conf, table.getName(), ImageFormat.PNG.getImageExtension());
		imagePath = imagePath.replaceAll("file:/", ""); //$NON-NLS-1$ //$NON-NLS-2$

		// 7. configure the image generation, changing some values in the ConfigRegistry of the NatTable instance
		generateAllIntermediateFolders(imagePath);
		final NatTable natTable = manager.getAdapter(NatTable.class);
		if (null == natTable) {
			Activator.log.warn("The NatTable widget can't be found"); //$NON-NLS-1$
		}
		final Object[] previousValues = configureTableForExport(natTable, false, false, imagePath, org.eclipse.papyrus.infra.nattable.export.image.ImageFormat.PNG);

		// 8. do the export itself
		manager.exportToImage();

		// 9. wait for the end of imag creation process
		flushEventLoop();


		// 10. we reset the previous values in the NatTable instance
		configureTableForExport(natTable, (boolean) previousValues[0], (boolean) previousValues[1], (String) previousValues[2], (ImageFormat) previousValues[3]);

		// 11. close the table if required and reset the current documenttemplate as focus editor
		if (closePage) {
			pageManager.closePage(table);
		}

		// 12. we reset the current page (which was the documenttemplate!
		pageManager.selectPage(DocumentStructureTemplateUtils.getDocumentTemplate(papyrusTableView));
		flushEventLoop();

		// 13. we create and return the image
		final Image image = DocumentStructureFactory.eINSTANCE.createImage();
		image.setCaption(table.getName());
		image.setImagePath(imagePath);

		return image;
	}


	/**
	 *
	 * This method allows to configure the export in a NatTable instance. This method returns an array with the previous values.
	 * The order of the element in the array are the same than the order of the parameters of this method.
	 *
	 * @param natTable
	 *            a {@link NatTable} instance
	 * @param useExportDialog
	 *            value defining a dialog must be displayed to export the table (<code>true</code>, there is a dialog, <code>false</code> there is no dialog)
	 * @param openExportResult
	 *            value defining if the exported image must be open after the export (<code>true</code>) or not (<code>false</code>)
	 * @param outputFile
	 *            the name of the output file
	 * @param imageFormat
	 *            the format of the image to create
	 * @return
	 *         the list of the previous value for these parameters in the NatTable instance
	 */
	private Object[] configureTableForExport(final NatTable natTable, final boolean useExportDialog, boolean openExportResult, final String outputFile, final ImageFormat imageFormat) {
		final IConfigRegistry configRegistry = natTable.getConfigRegistry();
		boolean previousUseExportDialog = configRegistry.getConfigAttribute(PapyrusExportConfigAttributes.EXPORT_IMAGE_USE_PAPYRUS_EXPORT_TABLE_DIALOG, DisplayMode.NORMAL);
		boolean previousOpenResult = configRegistry.getConfigAttribute(PapyrusExportConfigAttributes.OPEN_RESULT_AFTER_EXPORT, DisplayMode.NORMAL);
		final String previousOutputfile = configRegistry.getConfigAttribute(PapyrusExportConfigAttributes.EXPORT_IMAGE_FILENAME, DisplayMode.NORMAL);
		final ImageFormat previouImageFormat = configRegistry.getConfigAttribute(PapyrusExportConfigAttributes.EXPORT_IMAGE_FORMAT, DisplayMode.NORMAL);

		configRegistry.registerConfigAttribute(PapyrusExportConfigAttributes.EXPORT_IMAGE_USE_PAPYRUS_EXPORT_TABLE_DIALOG, Boolean.valueOf(useExportDialog));
		configRegistry.registerConfigAttribute(PapyrusExportConfigAttributes.OPEN_RESULT_AFTER_EXPORT, Boolean.valueOf(openExportResult));
		configRegistry.registerConfigAttribute(PapyrusExportConfigAttributes.EXPORT_IMAGE_FILENAME, outputFile);
		configRegistry.registerConfigAttribute(PapyrusExportConfigAttributes.EXPORT_IMAGE_FORMAT, imageFormat);


		return new Object[] { previousUseExportDialog, previousOpenResult, previousOutputfile, previouImageFormat };
	}



	/**
	 *
	 * @param table
	 *            a {@link Table}
	 * @return
	 *         the page manager of the current Papyrus editor, or <code>null</code> if not found
	 */
	private IPageManager getIPageManager(final Table table) {
		try {
			return ServiceUtilsForEObject.getInstance().getIPageManager(table);
		} catch (final ServiceException e) {
			Activator.log.error("The page manager can't be found", e); //$NON-NLS-1$
		}
		return null;
	}

	/**
	 *
	 * @param table
	 *            a {@link Table}
	 * @return
	 *         the {@link INattableModelManager} associated to this table or <code>null</code> if not found
	 */
	private final INattableModelManager getINattableModelManager(final Table table) {
		IMultiDiagramEditor multiDiagramEditor = getIMultiDiagramEditor(table);
		final IEditorPart editor = multiDiagramEditor.getActiveEditor();
		if (null == editor) {
			Activator.log.warn(NLS.bind("The editor for the Table {0} has not been open.", table.getName())); //$NON-NLS-1$
		}
		final INattableModelManager manager = editor.getAdapter(INattableModelManager.class);
		if (null == manager || manager.getTable() != table) {
			Activator.log.warn(NLS.bind("The editor for the Table {0} can't be open.", table.getName())); //$NON-NLS-1$
		}

		return manager;

	}


	/**
	 *
	 * @param table
	 *            a {@link Table}
	 * @return
	 *         the {@link IMultiDiagramEditor} associated to this table, or <code>null</code> if not found
	 */
	private final IMultiDiagramEditor getIMultiDiagramEditor(final Table table) {
		ServicesRegistry reg = null;
		try {
			reg = ServiceUtilsForEObject.getInstance().getServiceRegistry(table);
		} catch (final ServiceException e) {
			Activator.log.error("ServiceRegistry not found.", e); //$NON-NLS-1$
		}

		if (null == reg) {
			return null;
		}
		IMultiDiagramEditor multiDiagramEditor = null;
		try {
			multiDiagramEditor = reg.getService(IMultiDiagramEditor.class);
		} catch (ServiceException e) {
			Activator.log.error("IMultiDiagramEditor not found.", e); //$NON-NLS-1$
		}
		return multiDiagramEditor;
	}

	/**
	 * This method creates all required intermediates folders
	 *
	 * @param pathRoot
	 *            the full path of the image to create
	 */
	private final void generateAllIntermediateFolders(final String pathRoot) {
		final Path imagePath = new Path(pathRoot.toString());

		// we check all folders tree already exists, and we create them if not
		if (imagePath.segmentCount() > 1) {
			final IPath folderPath = imagePath.removeLastSegments(1);
			final File folder = folderPath.toFile();
			if (false == folder.exists()) {
				folder.mkdirs();
			}
		}
	}

	/**
	 * Processes all events waiting in the Display's event loop and then returns.
	 */
	private static final void flushEventLoop() {
		final Display display = Display.getDefault();
		display.syncExec(new Runnable() {

			@Override
			public void run() {
				try {
					while (display.readAndDispatch()) {
						// nothing
					}
				} catch (Exception ex) {
					Activator.log.error("Exceptions occured during the opening of the Table", ex); //$NON-NLS-1$
				}
			}
		});
	}


}
