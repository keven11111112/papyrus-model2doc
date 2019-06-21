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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.core.builtintypes.BasicRow;
import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesFactory;
import org.eclipse.papyrus.model2doc.core.builtintypes.Cell;
import org.eclipse.papyrus.model2doc.core.builtintypes.CellLocation;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextCell;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicTable;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class ensures the transformation of the {@link EReferenceTableView} into an {@link ExtendedBasicTable}
 */
public class EReferenceTableViewMapper extends AbstractEMFTemplateToStructureMapper<EReferenceTableView> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputClass
	 */
	public EReferenceTableViewMapper() {
		super(TEMPLATE_EPACKAGE.getEReferenceTableView(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param <T>
	 * @param mappingService
	 * @param eReferenceTableView
	 * @param semanticModelElement
	 * @param expectedReturnedClass
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final EReferenceTableView eReferenceTableView, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		if (false == eReferenceTableView.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}

		List<T> returnedElements = new ArrayList<>();

		final Collection<EObject> rows = eReferenceTableView.getRows(semanticModelElement);
		final Collection<IColumn> columns = eReferenceTableView.getColumns();
		if (rows.isEmpty() || columns.isEmpty()) {
			return null;
		}
		Title title = null;
		if (eReferenceTableView.isGenerate()) {
			if (eReferenceTableView.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(eReferenceTableView.buildPartTemplateTitle(null));
				returnedElements.add(expectedReturnedClass.cast(title));
			}
		}


		final ExtendedBasicTable table = STRUCTURE_EFACTORY.createExtendedBasicTable();

		if (title != null) {
			title.getSubBodyParts().add(table);
		} else {
			returnedElements.add(expectedReturnedClass.cast(table));
		}

		// column header generation
		if (eReferenceTableView.isGenerateColumnHeader()) {
			// we create the row for column header
			final BasicRow columnHeader = BuiltInTypesFactory.eINSTANCE.createBasicRow();
			table.getRows().add(columnHeader);
			if (eReferenceTableView.isGenerateRowHeader()) {
				// we create the corner cell
				final Cell cornerCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
				cornerCell.setLocation(CellLocation.CORNER);
				columnHeader.getCells().add(cornerCell);
			}

			// we create the column
			final Iterator<IColumn> colIter = columns.iterator();
			while (colIter.hasNext()) {
				final IColumn column = colIter.next();
				final TextCell colHeaderCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
				colHeaderCell.setLocation(CellLocation.COLUMN_HEADER);
				colHeaderCell.setText(column.buildColumnHeaderLabel());
				columnHeader.getCells().add(colHeaderCell);
			}
		}


		// row header and body generation
		final Iterator<EObject> rowsIterator = rows.iterator();
		while (rowsIterator.hasNext()) {
			final EObject rowElement = rowsIterator.next();
			final BasicRow bodyRow = BuiltInTypesFactory.eINSTANCE.createBasicRow();
			table.getRows().add(bodyRow);

			// row header creation
			if (eReferenceTableView.isGenerateRowHeader()) {
				// we create the corner cell
				final TextCell rowHeaderCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
				rowHeaderCell.setLocation(CellLocation.ROW_HEADER);
				rowHeaderCell.setText(eReferenceTableView.buildRowHeaderLabel(rowElement));
				bodyRow.getCells().add(rowHeaderCell);
			}

			// body creation
			// we create the column
			final Iterator<IColumn> colIter = columns.iterator();
			while (colIter.hasNext()) {
				final IColumn column = colIter.next();
				final TextCell bodyCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
				bodyCell.setLocation(CellLocation.BODY);
				bodyCell.setText(column.buildCellLabel(column.getCellValue(rowElement)));
				bodyRow.getCells().add(bodyCell);
			}
		}

		return returnedElements;
	}

}
