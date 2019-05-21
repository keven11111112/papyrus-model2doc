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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.core.internal.transcriber;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.papyrus.model2doc.core.builtintypes.BasicList;
import org.eclipse.papyrus.model2doc.core.builtintypes.BasicRow;
import org.eclipse.papyrus.model2doc.core.builtintypes.BasicTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesFactory;
import org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation;
import org.eclipse.papyrus.model2doc.core.builtintypes.ListItem;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextCell;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextListItem;
import org.eclipse.papyrus.model2doc.core.service.DiagramToImageService;
import org.eclipse.papyrus.model2doc.core.service.DiagramToImageServiceImpl;
import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.uml.internationalization.utils.utils.UMLLabelInternationalization;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * Default Transcriber for UML model.
 *
 */
public class UMLTranscriber implements Transcriber {

	private Package root = null;

	private Transcription transcription = null;

	private List<Class> classes = new ArrayList<>();

	private UMLLabelInternationalization umlLabelInternationalization = null;

	private String imageOutputFolder = null;

	private DiagramToImageService diagramToImageService = new DiagramToImageServiceImpl();

	/**
	 *
	 * Constructor.
	 *
	 * @param rootPackage
	 *            the root package
	 * @param transcription
	 *            the object in charge to do the transcription
	 */
	public UMLTranscriber(Package rootPackage, Transcription transcription) {
		root = rootPackage;
		this.transcription = transcription;
		umlLabelInternationalization = UMLLabelInternationalization.getInstance();
		// in this version, we don't have an intermediate model storing images in its dedicated folder, so
		// we use the project folder
		imageOutputFolder = transcription.getGeneratorConfig().getDocumentFolder();
	}

	/**
	 * Read UML model and transcribe it.
	 */
	@Override
	public void transcribe() {
		// Transcribe label of root package how document main title
		transcription.writeDocumentMainTitle(umlLabelInternationalization.getLabel(root));

		transcription.writeTableOfContents("Table Of Contents");

		// Get images generated of diagrams
		List<ImageDescription> images = diagramToImageService.getImagesOfDiagrams(root, imageOutputFolder);

		// Import images
		for (ImageDescription image : images) {
			transcription.importImage(image, image.getSubtitle());
		}

		// Transcribe classes directly owned by root package
		transcribeClasses(root);

		// Add table of list of packages and their owned classes

		// 1. create a new table
		final BasicTable table = BuiltInTypesFactory.eINSTANCE.createBasicTable();

		// 2. create the column headers
		final BasicRow columnHeaderRow = BuiltInTypesFactory.eINSTANCE.createBasicRow();
		table.getRows().add(columnHeaderRow);
		final TextCell cornerCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
		cornerCell.setText("");// TODO add a default text value to empty string
		cornerCell.setLocation(CellLocation.CORNER);
		columnHeaderRow.getCells().add(cornerCell);

		final TextCell columnHeaderPackageCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
		columnHeaderRow.getCells().add(columnHeaderPackageCell);
		columnHeaderPackageCell.setText("Packages");// TODO add a default text value to empty string
		columnHeaderPackageCell.setLocation(CellLocation.COLUMN_HEADER);

		final TextCell columnHeaderClassedCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
		columnHeaderRow.getCells().add(columnHeaderClassedCell);
		columnHeaderClassedCell.setText("Classes");
		columnHeaderClassedCell.setLocation(CellLocation.COLUMN_HEADER);


		// 3. create row header and the body
		final Iterator<Package> packIter = root.getNestedPackages().iterator();
		int nbRow = 0;
		while (packIter.hasNext()) {
			nbRow++;
			final Package nestedPackage = packIter.next();
			final BasicRow row = BuiltInTypesFactory.eINSTANCE.createBasicRow();
			table.getRows().add(row);


			final TextCell rowHeaderCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
			row.getCells().add(rowHeaderCell);
			rowHeaderCell.setText(Integer.toString(nbRow));
			rowHeaderCell.setLocation(CellLocation.ROW_HEADER);

			final TextCell packageCellBody = BuiltInTypesFactory.eINSTANCE.createTextCell();
			row.getCells().add(packageCellBody);
			packageCellBody.setText(this.umlLabelInternationalization.getLabel(nestedPackage));
			packageCellBody.setLocation(CellLocation.BODY);

			final TextCell classesCellBody = BuiltInTypesFactory.eINSTANCE.createTextCell();
			row.getCells().add(classesCellBody);
			final StringBuilder builder = new StringBuilder();
			final Iterator<Class> classIterator = nestedPackage.getOwnedTypes().stream().filter(Class.class::isInstance).map(Class.class::cast).collect(Collectors.toList()).iterator();
			while (classIterator.hasNext()) {
				final Class current = classIterator.next();
				builder.append(umlLabelInternationalization.getLabel(current));
				if (classIterator.hasNext()) {
					builder.append(", "); //$NON-NLS-1$
				}
			}
			classesCellBody.setText(builder.toString());
			classesCellBody.setLocation(CellLocation.BODY);
		}

		transcription.writeTable(table);

		// Transcribe nested packages owned by root package
		for (Package nestedPackage : root.getNestedPackages()) {
			transcribeNestedPackages(nestedPackage, 1);

		}

		transcription.refreshTableOfContents();

		// Save transcription
		transcription.save(umlLabelInternationalization.getLabel(root));
	}

	/**
	 * Get nested packages and transcribe them.
	 *
	 * @param owner
	 *            owner package
	 * @param level
	 *            nested package level
	 */
	private void transcribeNestedPackages(Package owner, int level) {
		// Transcribe label of owner package how section title
		transcription.writeSectionTitle(umlLabelInternationalization.getLabel(owner), level);

		// Get images generated of diagrams
		List<ImageDescription> images = diagramToImageService.getImagesOfDiagrams(owner, imageOutputFolder);

		// Import images
		for (ImageDescription image : images) {
			transcription.importImage(image, image.getSubtitle());
		}

		// Transcribe classes directly owned by owner package
		transcribeClasses(owner);

		for (Package nestedPackage : owner.getNestedPackages()) {
			// Transcribe nested packages owned by owner package
			transcribeNestedPackages(nestedPackage, level + 1);
		}
	}

	/**
	 * Get classes and transcribe them.
	 *
	 * @param owner
	 *            owner package
	 */
	private void transcribeClasses(Package owner) {
		// Get classes owned by owner package
		for (Type type : owner.getOwnedTypes()) {
			if (type instanceof Class) {
				classes.add((Class) type);
			}
		}

		// Transcribe classes
		for (Class clazz : classes) {
			// Transcribe label of class how paragraph
			transcription.writeParagraph(umlLabelInternationalization.getLabel(clazz), false);
			// Transcribe properties of each class
			transcribeProperties(clazz);

			// Get images generated of diagrams
			List<ImageDescription> images = diagramToImageService.getImagesOfDiagrams(clazz, imageOutputFolder);

			// Import images
			for (ImageDescription image : images) {
				transcription.importImage(image, image.getSubtitle());
			}
		}
		classes.clear();
	}

	/**
	 * Get properties and transcribe them.
	 *
	 * @param owner
	 *            owner class
	 */
	private void transcribeProperties(Class owner) {
		final List<ListItem> items = new ArrayList<>();
		// Get properties owned by owner class
		for (Property property : owner.getOwnedAttributes()) {
			final TextListItem item = BuiltInTypesFactory.eINSTANCE.createTextListItem();
			item.setText(umlLabelInternationalization.getLabel(property));
			items.add(item);
		}

		if (items.size() > 0) {
			final BasicList list = BuiltInTypesFactory.eINSTANCE.createBasicList();
			list.getItems().addAll(items);
			transcription.writeList(list, false);
		}
	}
}
