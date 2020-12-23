/**
 * Copyright (c) 2019 CEA LIST.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License 2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-2.0/
 *
 *  SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 */
package org.eclipse.papyrus.model2doc.emf.documentstructure.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.model2doc.emf.documentstructure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DocumentStructureFactoryImpl extends EFactoryImpl implements DocumentStructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static DocumentStructureFactory init() {
		try {
			DocumentStructureFactory theDocumentStructureFactory = (DocumentStructureFactory) EPackage.Registry.INSTANCE.getEFactory(DocumentStructurePackage.eNS_URI);
			if (theDocumentStructureFactory != null) {
				return theDocumentStructureFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocumentStructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentStructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DocumentStructurePackage.TEXT_DOCUMENT:
			return createTextDocument();
		case DocumentStructurePackage.BODY:
			return createBody();
		case DocumentStructurePackage.PARAGRAPH:
			return createParagraph();
		case DocumentStructurePackage.TITLE:
			return createTitle();
		case DocumentStructurePackage.IMAGE:
			return createImage();
		case DocumentStructurePackage.EMF_DATA_SOURCE:
			return createEMFDataSource();
		case DocumentStructurePackage.TABLE_OF_FIGURES:
			return createTableOfFigures();
		case DocumentStructurePackage.TABLE_OF_CONTENTS:
			return createTableOfContents();
		case DocumentStructurePackage.EXTENDED_BASIC_TABLE:
			return createExtendedBasicTable();
		case DocumentStructurePackage.EXTENDED_TEXT_CELL:
			return createExtendedTextCell();
		case DocumentStructurePackage.EXTENDED_BASIC_LIST:
			return createExtendedBasicList();
		case DocumentStructurePackage.EXTENDED_TEXT_LIST_ITEM:
			return createExtendedTextListItem();
		case DocumentStructurePackage.STRING_VERSION:
			return createStringVersion();
		case DocumentStructurePackage.INSERTED_FILE:
			return createInsertedFile();
		case DocumentStructurePackage.EMPTY_LINE:
			return createEmptyLine();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TextDocument createTextDocument() {
		TextDocumentImpl textDocument = new TextDocumentImpl();
		return textDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EMFDataSource createEMFDataSource() {
		EMFDataSourceImpl emfDataSource = new EMFDataSourceImpl();
		return emfDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TableOfFigures createTableOfFigures() {
		TableOfFiguresImpl tableOfFigures = new TableOfFiguresImpl();
		return tableOfFigures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TableOfContents createTableOfContents() {
		TableOfContentsImpl tableOfContents = new TableOfContentsImpl();
		return tableOfContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ExtendedBasicTable createExtendedBasicTable() {
		ExtendedBasicTableImpl extendedBasicTable = new ExtendedBasicTableImpl();
		return extendedBasicTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ExtendedTextCell createExtendedTextCell() {
		ExtendedTextCellImpl extendedTextCell = new ExtendedTextCellImpl();
		return extendedTextCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ExtendedBasicList createExtendedBasicList() {
		ExtendedBasicListImpl extendedBasicList = new ExtendedBasicListImpl();
		return extendedBasicList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ExtendedTextListItem createExtendedTextListItem() {
		ExtendedTextListItemImpl extendedTextListItem = new ExtendedTextListItemImpl();
		return extendedTextListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public StringVersion createStringVersion() {
		StringVersionImpl stringVersion = new StringVersionImpl();
		return stringVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public InsertedFile createInsertedFile() {
		InsertedFileImpl insertedFile = new InsertedFileImpl();
		return insertedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EmptyLine createEmptyLine() {
		EmptyLineImpl emptyLine = new EmptyLineImpl();
		return emptyLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentStructurePackage getDocumentStructurePackage() {
		return (DocumentStructurePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocumentStructurePackage getPackage() {
		return DocumentStructurePackage.eINSTANCE;
	}

} // DocumentStructureFactoryImpl
