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
package org.eclipse.papyrus.model2doc.core.internal.transcriber;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.papyrus.uml.internationalization.utils.utils.UMLLabelInternationalization;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import org.eclipse.papyrus.model2doc.core.service.DiagramToImageService;
import org.eclipse.papyrus.model2doc.core.service.DiagramToImageServiceImpl;
import org.eclipse.papyrus.model2doc.core.transcriber.Transcriber;
import org.eclipse.papyrus.model2doc.core.transcription.ImageDescription;
import org.eclipse.papyrus.model2doc.core.transcription.Table;
import org.eclipse.papyrus.model2doc.core.transcription.TableFactory;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;

/**
 * Default Transcriber for UML model.
 *
 */
public class UMLTranscriber implements Transcriber {

	private Package root = null;

	private Transcription transcription = null;

	private List<Class> classes = new ArrayList<Class>();

	private List<String> propertities = new ArrayList<String>();

	private UMLLabelInternationalization umlLabelInternationalization = null;

	private String outputFolder = null;

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
		outputFolder = transcription.getGeneratorConfig().getOutputFolder();
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
		List<ImageDescription> images = diagramToImageService.getImagesOfDiagrams(root, outputFolder);

		// Import images
		for (ImageDescription image : images) {
			transcription.importImage(image, image.getSubtitle());
		}

		// Transcribe classes directly owned by root package
		transcribeClasses(root);

		// Add table of list of packages and their owned classes
		Table table = TableFactory.INSTANCE.getDefaultTable();
		List<String> columnTitles = new ArrayList<>();
		columnTitles.add("Packages"); //$NON-NLS-1$
		columnTitles.add("Classes"); //$NON-NLS-1$
		table.setColumnTitles(columnTitles);
		
		//these 3 line add the rows header
		List<String> rowTitles = new ArrayList<>();
		table.setRowTitles(rowTitles);
		int nbRow = 1;
		
		for (Package nestedPackage : root.getNestedPackages()) {
			rowTitles.add(Integer.toString(nbRow));
			nbRow++;
			StringBuilder classNames = new StringBuilder();
			List<String> rowContents = new ArrayList<>();
			rowContents.add(umlLabelInternationalization.getLabel(nestedPackage));

			final Iterator<Class> classIterator = nestedPackage.getOwnedTypes().stream().filter(Class.class::isInstance).map(Class.class::cast).collect(Collectors.toList()).iterator();
			while (classIterator.hasNext()) {
				final Class current = classIterator.next();
				classNames.append(umlLabelInternationalization.getLabel(current));
				if (classIterator.hasNext()) {
					classNames.append(", "); //$NON-NLS-1$
				}
			}

			table.setRowContents(rowContents);
		}
		transcription.addTable(table, 0xE06666); //$NON-NLS-1$
		
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
		List<ImageDescription> images = diagramToImageService.getImagesOfDiagrams(owner, outputFolder);

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
			List<ImageDescription> images = diagramToImageService.getImagesOfDiagrams(clazz, outputFolder);

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
		// Get properties owned by owner class
		for (Property property : owner.getOwnedAttributes()) {
			propertities.add(umlLabelInternationalization.getLabel(property));
		}

		// Transcribe properties how list
		if (!propertities.isEmpty()) {
			transcription.writeList(propertities, false);
			propertities.clear();
		}
	}
}
