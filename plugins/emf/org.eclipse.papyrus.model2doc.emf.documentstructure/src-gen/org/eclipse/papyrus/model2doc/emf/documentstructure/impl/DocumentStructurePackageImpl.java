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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.core.author.AuthorPackage;

import org.eclipse.papyrus.model2doc.core.builtintypes.BuiltInTypesPackage;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

import org.eclipse.papyrus.model2doc.core.styles.StylesPackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ComposedBodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicList;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicTable;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedFileReferenceCell;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextCell;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem;
import org.eclipse.papyrus.model2doc.emf.documentstructure.IGeneratedFile;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedFile;
import org.eclipse.papyrus.model2doc.emf.documentstructure.InsertedGeneratedFile;
import org.eclipse.papyrus.model2doc.emf.documentstructure.LeafBodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.EmptyLine;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.documentstructure.StringVersion;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfFigures;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DocumentStructurePackageImpl extends EPackageImpl implements DocumentStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass textDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass textDocumentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass bodyPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass composedBodyPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass leafBodyPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iGeneratedFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass emfDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass tableOfFiguresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass tableOfContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass extendedBasicTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass extendedTextCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass extendedBasicListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass extendedTextListItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass stringVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass insertedFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass emptyLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass extendedFileReferenceCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass insertedGeneratedFileEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocumentStructurePackageImpl() {
		super(eNS_URI, DocumentStructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link DocumentStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocumentStructurePackage init() {
		if (isInited) {
			return (DocumentStructurePackage) EPackage.Registry.INSTANCE.getEPackage(DocumentStructurePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredDocumentStructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DocumentStructurePackageImpl theDocumentStructurePackage = registeredDocumentStructurePackage instanceof DocumentStructurePackageImpl ? (DocumentStructurePackageImpl) registeredDocumentStructurePackage : new DocumentStructurePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AuthorPackage.eINSTANCE.eClass();
		BuiltInTypesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		GeneratorConfigurationPackage.eINSTANCE.eClass();
		StylesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDocumentStructurePackage.createPackageContents();

		// Initialize created meta-data
		theDocumentStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentStructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentStructurePackage.eNS_URI, theDocumentStructurePackage);
		return theDocumentStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTextDocument() {
		return textDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTextDocument_MainTitle() {
		return (EAttribute) textDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getTextDocument_TextDocumentPart() {
		return (EReference) textDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTextDocumentPart() {
		return textDocumentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocument_DocumentGeneratorConfiguration() {
		return (EReference) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocument_Author() {
		return (EReference) documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocument_Version() {
		return (EReference) documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getVersion__GetVersion() {
		return versionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBody() {
		return bodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBody_BodyPart() {
		return (EReference) bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getBodyPart() {
		return bodyPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getBodyPart_DataSource() {
		return (EReference) bodyPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getParagraph_Text() {
		return (EAttribute) paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getComposedBodyPart() {
		return composedBodyPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getComposedBodyPart_SubBodyPart() {
		return (EReference) composedBodyPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTitle_Title() {
		return (EAttribute) titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getTitle__GetLevel() {
		return titleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getImage_Caption() {
		return (EAttribute) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getLeafBodyPart() {
		return leafBodyPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIGeneratedFile() {
		return iGeneratedFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEMFDataSource() {
		return emfDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEMFDataSource_Eobject() {
		return (EReference) emfDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEMFDataSource_Feature() {
		return (EReference) emfDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTableOfFigures() {
		return tableOfFiguresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTableOfFigures_TofTitle() {
		return (EAttribute) tableOfFiguresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTableOfContents() {
		return tableOfContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTableOfContents_TocTitle() {
		return (EAttribute) tableOfContentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getExtendedBasicTable() {
		return extendedBasicTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getExtendedTextCell() {
		return extendedTextCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getExtendedTextCell_DataSource() {
		return (EReference) extendedTextCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getExtendedBasicList() {
		return extendedBasicListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getExtendedTextListItem() {
		return extendedTextListItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getExtendedTextListItem_Datasource() {
		return (EReference) extendedTextListItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getStringVersion() {
		return stringVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStringVersion_Version() {
		return (EAttribute) stringVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getInsertedFile() {
		return insertedFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEmptyLine() {
		return emptyLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getExtendedFileReferenceCell() {
		return extendedFileReferenceCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getExtendedFileReferenceCell_Datasource() {
		return (EReference) extendedFileReferenceCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getInsertedGeneratedFile() {
		return insertedGeneratedFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentStructureFactory getDocumentStructureFactory() {
		return (DocumentStructureFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		textDocumentEClass = createEClass(TEXT_DOCUMENT);
		createEAttribute(textDocumentEClass, TEXT_DOCUMENT__MAIN_TITLE);
		createEReference(textDocumentEClass, TEXT_DOCUMENT__TEXT_DOCUMENT_PART);

		textDocumentPartEClass = createEClass(TEXT_DOCUMENT_PART);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__DOCUMENT_GENERATOR_CONFIGURATION);
		createEReference(documentEClass, DOCUMENT__AUTHOR);
		createEReference(documentEClass, DOCUMENT__VERSION);

		versionEClass = createEClass(VERSION);
		createEOperation(versionEClass, VERSION___GET_VERSION);

		bodyEClass = createEClass(BODY);
		createEReference(bodyEClass, BODY__BODY_PART);

		bodyPartEClass = createEClass(BODY_PART);
		createEReference(bodyPartEClass, BODY_PART__DATA_SOURCE);

		dataSourceEClass = createEClass(DATA_SOURCE);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__TEXT);

		composedBodyPartEClass = createEClass(COMPOSED_BODY_PART);
		createEReference(composedBodyPartEClass, COMPOSED_BODY_PART__SUB_BODY_PART);

		titleEClass = createEClass(TITLE);
		createEAttribute(titleEClass, TITLE__TITLE);
		createEOperation(titleEClass, TITLE___GET_LEVEL);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__CAPTION);

		leafBodyPartEClass = createEClass(LEAF_BODY_PART);

		iGeneratedFileEClass = createEClass(IGENERATED_FILE);

		emfDataSourceEClass = createEClass(EMF_DATA_SOURCE);
		createEReference(emfDataSourceEClass, EMF_DATA_SOURCE__EOBJECT);
		createEReference(emfDataSourceEClass, EMF_DATA_SOURCE__FEATURE);

		tableOfFiguresEClass = createEClass(TABLE_OF_FIGURES);
		createEAttribute(tableOfFiguresEClass, TABLE_OF_FIGURES__TOF_TITLE);

		tableOfContentsEClass = createEClass(TABLE_OF_CONTENTS);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__TOC_TITLE);

		extendedBasicTableEClass = createEClass(EXTENDED_BASIC_TABLE);

		extendedTextCellEClass = createEClass(EXTENDED_TEXT_CELL);
		createEReference(extendedTextCellEClass, EXTENDED_TEXT_CELL__DATA_SOURCE);

		extendedBasicListEClass = createEClass(EXTENDED_BASIC_LIST);

		extendedTextListItemEClass = createEClass(EXTENDED_TEXT_LIST_ITEM);
		createEReference(extendedTextListItemEClass, EXTENDED_TEXT_LIST_ITEM__DATASOURCE);

		stringVersionEClass = createEClass(STRING_VERSION);
		createEAttribute(stringVersionEClass, STRING_VERSION__VERSION);

		insertedFileEClass = createEClass(INSERTED_FILE);

		emptyLineEClass = createEClass(EMPTY_LINE);

		extendedFileReferenceCellEClass = createEClass(EXTENDED_FILE_REFERENCE_CELL);
		createEReference(extendedFileReferenceCellEClass, EXTENDED_FILE_REFERENCE_CELL__DATASOURCE);

		insertedGeneratedFileEClass = createEClass(INSERTED_GENERATED_FILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeneratorConfigurationPackage theGeneratorConfigurationPackage = (GeneratorConfigurationPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratorConfigurationPackage.eNS_URI);
		AuthorPackage theAuthorPackage = (AuthorPackage) EPackage.Registry.INSTANCE.getEPackage(AuthorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		BuiltInTypesPackage theBuiltInTypesPackage = (BuiltInTypesPackage) EPackage.Registry.INSTANCE.getEPackage(BuiltInTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textDocumentEClass.getESuperTypes().add(this.getDocument());
		bodyEClass.getESuperTypes().add(this.getTextDocumentPart());
		paragraphEClass.getESuperTypes().add(this.getComposedBodyPart());
		composedBodyPartEClass.getESuperTypes().add(this.getBodyPart());
		titleEClass.getESuperTypes().add(this.getComposedBodyPart());
		imageEClass.getESuperTypes().add(theBuiltInTypesPackage.getDefaultFileReference());
		imageEClass.getESuperTypes().add(this.getLeafBodyPart());
		imageEClass.getESuperTypes().add(this.getIGeneratedFile());
		leafBodyPartEClass.getESuperTypes().add(this.getBodyPart());
		iGeneratedFileEClass.getESuperTypes().add(theBuiltInTypesPackage.getIFileReference());
		emfDataSourceEClass.getESuperTypes().add(this.getDataSource());
		tableOfFiguresEClass.getESuperTypes().add(this.getTextDocumentPart());
		tableOfContentsEClass.getESuperTypes().add(this.getTextDocumentPart());
		extendedBasicTableEClass.getESuperTypes().add(theBuiltInTypesPackage.getBasicTable());
		extendedBasicTableEClass.getESuperTypes().add(this.getLeafBodyPart());
		extendedTextCellEClass.getESuperTypes().add(theBuiltInTypesPackage.getTextCell());
		extendedBasicListEClass.getESuperTypes().add(theBuiltInTypesPackage.getBasicList());
		extendedBasicListEClass.getESuperTypes().add(this.getLeafBodyPart());
		extendedTextListItemEClass.getESuperTypes().add(theBuiltInTypesPackage.getTextListItem());
		stringVersionEClass.getESuperTypes().add(this.getVersion());
		insertedFileEClass.getESuperTypes().add(theBuiltInTypesPackage.getDefaultFileReference());
		insertedFileEClass.getESuperTypes().add(this.getLeafBodyPart());
		emptyLineEClass.getESuperTypes().add(this.getLeafBodyPart());
		extendedFileReferenceCellEClass.getESuperTypes().add(theBuiltInTypesPackage.getFileReferenceCell());
		insertedGeneratedFileEClass.getESuperTypes().add(this.getInsertedFile());
		insertedGeneratedFileEClass.getESuperTypes().add(this.getIGeneratedFile());

		// Initialize classes, features, and operations; add parameters
		initEClass(textDocumentEClass, TextDocument.class, "TextDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTextDocument_MainTitle(), ecorePackage.getEString(), "mainTitle", null, 0, 1, TextDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTextDocument_TextDocumentPart(), this.getTextDocumentPart(), null, "textDocumentPart", null, 0, -1, TextDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(textDocumentPartEClass, TextDocumentPart.class, "TextDocumentPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDocument_DocumentGeneratorConfiguration(), theGeneratorConfigurationPackage.getIDocumentGeneratorConfiguration(), null, "documentGeneratorConfiguration", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_Author(), theAuthorPackage.getIAuthor(), null, "author", null, 1, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocument_Version(), this.getVersion(), null, "version", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(versionEClass, Version.class, "Version", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEOperation(getVersion__GetVersion(), ecorePackage.getEString(), "getVersion", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBody_BodyPart(), this.getBodyPart(), null, "bodyPart", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(bodyPartEClass, BodyPart.class, "BodyPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBodyPart_DataSource(), this.getDataSource(), null, "dataSource", null, 0, 1, BodyPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getParagraph_Text(), ecorePackage.getEString(), "text", null, 1, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(composedBodyPartEClass, ComposedBodyPart.class, "ComposedBodyPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getComposedBodyPart_SubBodyPart(), this.getBodyPart(), null, "subBodyPart", null, 0, -1, ComposedBodyPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTitle_Title(), ecorePackage.getEString(), "title", null, 1, 1, Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getTitle__GetLevel(), theEcorePackage.getEInt(), "getLevel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getImage_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(leafBodyPartEClass, LeafBodyPart.class, "LeafBodyPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iGeneratedFileEClass, IGeneratedFile.class, "IGeneratedFile", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(emfDataSourceEClass, EMFDataSource.class, "EMFDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEMFDataSource_Eobject(), theEcorePackage.getEObject(), null, "eobject", null, 1, 1, EMFDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);
		initEReference(getEMFDataSource_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, EMFDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(tableOfFiguresEClass, TableOfFigures.class, "TableOfFigures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTableOfFigures_TofTitle(), ecorePackage.getEString(), "tofTitle", "Table Of Figures", 1, 1, TableOfFigures.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(tableOfContentsEClass, TableOfContents.class, "TableOfContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTableOfContents_TocTitle(), ecorePackage.getEString(), "tocTitle", "Table Of Contents", 1, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(extendedBasicTableEClass, ExtendedBasicTable.class, "ExtendedBasicTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(extendedTextCellEClass, ExtendedTextCell.class, "ExtendedTextCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExtendedTextCell_DataSource(), this.getDataSource(), null, "dataSource", null, 0, 1, ExtendedTextCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(extendedBasicListEClass, ExtendedBasicList.class, "ExtendedBasicList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(extendedTextListItemEClass, ExtendedTextListItem.class, "ExtendedTextListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExtendedTextListItem_Datasource(), this.getDataSource(), null, "datasource", null, 0, 1, ExtendedTextListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(stringVersionEClass, StringVersion.class, "StringVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStringVersion_Version(), ecorePackage.getEString(), "version", null, 1, 1, StringVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(insertedFileEClass, InsertedFile.class, "InsertedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(emptyLineEClass, EmptyLine.class, "EmptyLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(extendedFileReferenceCellEClass, ExtendedFileReferenceCell.class, "ExtendedFileReferenceCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExtendedFileReferenceCell_Datasource(), this.getDataSource(), null, "datasource", null, 0, 1, ExtendedFileReferenceCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(insertedGeneratedFileEClass, InsertedGeneratedFile.class, "InsertedGeneratedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML"; //$NON-NLS-1$
		addAnnotation(this,
				source,
				new String[] {
						"originalName", "DocumentStructure" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} // DocumentStructurePackageImpl
