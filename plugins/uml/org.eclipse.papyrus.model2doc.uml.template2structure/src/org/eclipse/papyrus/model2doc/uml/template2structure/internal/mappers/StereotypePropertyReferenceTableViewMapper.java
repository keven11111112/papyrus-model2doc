/*****************************************************************************
 * Copyright (c) 2019-2021 CEA LIST and others.
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
 * 	Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 569249
 * 	Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Bug 570133
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.template2structure.internal.mappers;

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
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractBodyPartTemplateToStructureMapper;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

/**
 * This mapper creates a {@link BodyPart} from a {@link StereotypePropertyReferenceTableView}S
 */
public class StereotypePropertyReferenceTableViewMapper extends AbstractBodyPartTemplateToStructureMapper<StereotypePropertyReferenceTableView> {

	/**
	 *
	 * Constructor.
	 *
	 */
	public StereotypePropertyReferenceTableViewMapper() {
		super(UMLDocumentStructureTemplatePackage.eINSTANCE.getStereotypePropertyReferenceTableView(), BodyPart.class);
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.AbstractTemplateToStructureMapper#doMap(org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject,
	 *      java.lang.Class)
	 *
	 * @param <T>
	 * @param mappingService
	 * @param documentTemplateElement
	 * @param semanticModelElement
	 * @param expectedReturnedClass
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final StereotypePropertyReferenceTableView stereotypePropertyReferenceTableView, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		final List<T> returnedElements = new ArrayList<>();
		if (false == stereotypePropertyReferenceTableView.generateBranch(semanticModelElement)) {
			return Collections.emptyList();
		}

		final Collection<EObject> rows = stereotypePropertyReferenceTableView.getRows(semanticModelElement);
		final Collection<IColumn> columns = stereotypePropertyReferenceTableView.getColumns();
		if (rows.isEmpty() || columns.isEmpty()) {
			return null;
		}


		final ExtendedBasicTable table = STRUCTURE_EFACTORY.createExtendedBasicTable();

		// column header generation
		if (stereotypePropertyReferenceTableView.isGenerateColumnHeader()) {
			// we create the row for column header
			final BasicRow columnHeader = BuiltInTypesFactory.eINSTANCE.createBasicRow();
			table.getRows().add(columnHeader);
			if (stereotypePropertyReferenceTableView.isGenerateRowHeader()) {
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
			if (stereotypePropertyReferenceTableView.isGenerateRowHeader()) {
				// we create the corner cell
				final TextCell rowHeaderCell = BuiltInTypesFactory.eINSTANCE.createTextCell();
				rowHeaderCell.setLocation(CellLocation.ROW_HEADER);
				rowHeaderCell.setText(stereotypePropertyReferenceTableView.buildRowHeaderLabel(rowElement));
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
		if (!isEmptyTable(table, stereotypePropertyReferenceTableView)) {
			returnedElements.add(expectedReturnedClass.cast(table));
			returnedElements.add(expectedReturnedClass.cast(STRUCTURE_EFACTORY.createEmptyLine()));
		}

		return buildMapperResult(stereotypePropertyReferenceTableView, semanticModelElement, expectedReturnedClass, returnedElements);
	}

	/**
	 *
	 * @param table
	 *            the created table
	 * @param tableView
	 * @return
	 */
	private boolean isEmptyTable(final ExtendedBasicTable table, final ITableView tableView) {
		return table.getRowsNumber() == 0 && tableView.isGenerateColumnHeader() == false
				|| table.getRowsNumber() == 1 && tableView.isGenerateColumnHeader();
	}

}
