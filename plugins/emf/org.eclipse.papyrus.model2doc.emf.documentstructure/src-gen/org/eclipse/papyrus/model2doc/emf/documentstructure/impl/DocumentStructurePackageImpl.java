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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.emf.documentstructure.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DataSource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructureFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructure.EMFDataSource;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Image;
import org.eclipse.papyrus.model2doc.emf.documentstructure.List;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Paragraph;
import org.eclipse.papyrus.model2doc.emf.documentstructure.StringText;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Text;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocument;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextDocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.TextPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;

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
	private EClass textEClass = null;

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
	private EClass listEClass = null;

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
	private EClass textPartEClass = null;

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
	private EClass stringTextEClass = null;

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
	private EClass tableOfContentsEClass = null;

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
		EcorePackage.eINSTANCE.eClass();

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
	public EClass getText() {
		return textEClass;
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
	public EReference getTextDocument_TextDocumentPart() {
		return (EReference) textDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTextDocument_TocTitle() {
		return (EAttribute) textDocumentEClass.getEStructuralFeatures().get(1);
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
	public EReference getBodyPart_SubBodyPart() {
		return (EReference) bodyPartEClass.getEStructuralFeatures().get(1);
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
	public EClass getList() {
		return listEClass;
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
	public EClass getTextPart() {
		return textPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getTextPart_Text() {
		return (EReference) textPartEClass.getEStructuralFeatures().get(0);
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
	public EClass getStringText() {
		return stringTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getStringText_Text() {
		return (EAttribute) stringTextEClass.getEStructuralFeatures().get(0);
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
		textEClass = createEClass(TEXT);

		textDocumentEClass = createEClass(TEXT_DOCUMENT);
		createEReference(textDocumentEClass, TEXT_DOCUMENT__TEXT_DOCUMENT_PART);
		createEAttribute(textDocumentEClass, TEXT_DOCUMENT__TOC_TITLE);

		textDocumentPartEClass = createEClass(TEXT_DOCUMENT_PART);

		documentEClass = createEClass(DOCUMENT);

		bodyEClass = createEClass(BODY);
		createEReference(bodyEClass, BODY__BODY_PART);

		bodyPartEClass = createEClass(BODY_PART);
		createEReference(bodyPartEClass, BODY_PART__DATA_SOURCE);
		createEReference(bodyPartEClass, BODY_PART__SUB_BODY_PART);

		dataSourceEClass = createEClass(DATA_SOURCE);

		listEClass = createEClass(LIST);

		paragraphEClass = createEClass(PARAGRAPH);

		textPartEClass = createEClass(TEXT_PART);
		createEReference(textPartEClass, TEXT_PART__TEXT);

		titleEClass = createEClass(TITLE);

		imageEClass = createEClass(IMAGE);

		stringTextEClass = createEClass(STRING_TEXT);
		createEAttribute(stringTextEClass, STRING_TEXT__TEXT);

		emfDataSourceEClass = createEClass(EMF_DATA_SOURCE);
		createEReference(emfDataSourceEClass, EMF_DATA_SOURCE__EOBJECT);
		createEReference(emfDataSourceEClass, EMF_DATA_SOURCE__FEATURE);

		tableOfContentsEClass = createEClass(TABLE_OF_CONTENTS);
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
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textDocumentEClass.getESuperTypes().add(this.getDocument());
		bodyEClass.getESuperTypes().add(this.getTextDocumentPart());
		listEClass.getESuperTypes().add(this.getBodyPart());
		paragraphEClass.getESuperTypes().add(this.getTextPart());
		textPartEClass.getESuperTypes().add(this.getBodyPart());
		titleEClass.getESuperTypes().add(this.getTextPart());
		imageEClass.getESuperTypes().add(this.getTextPart());
		stringTextEClass.getESuperTypes().add(this.getText());
		emfDataSourceEClass.getESuperTypes().add(this.getDataSource());
		tableOfContentsEClass.getESuperTypes().add(this.getTextDocumentPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(textEClass, Text.class, "Text", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(textDocumentEClass, TextDocument.class, "TextDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTextDocument_TextDocumentPart(), this.getTextDocumentPart(), null, "textDocumentPart", null, 0, -1, TextDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextDocument_TocTitle(), ecorePackage.getEString(), "tocTitle", "Table Of Contents", 1, 1, TextDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(textDocumentPartEClass, TextDocumentPart.class, "TextDocumentPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBody_BodyPart(), this.getBodyPart(), null, "bodyPart", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(bodyPartEClass, BodyPart.class, "BodyPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBodyPart_DataSource(), this.getDataSource(), null, "dataSource", null, 0, 1, BodyPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getBodyPart_SubBodyPart(), this.getBodyPart(), null, "subBodyPart", null, 0, -1, BodyPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(textPartEClass, TextPart.class, "TextPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTextPart_Text(), this.getText(), null, "text", null, 0, 1, TextPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stringTextEClass, StringText.class, "StringText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStringText_Text(), theEcorePackage.getEString(), "text", null, 1, 1, StringText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(emfDataSourceEClass, EMFDataSource.class, "EMFDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEMFDataSource_Eobject(), theEcorePackage.getEObject(), null, "eobject", null, 1, 1, EMFDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);
		initEReference(getEMFDataSource_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, EMFDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(tableOfContentsEClass, TableOfContents.class, "TableOfContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
