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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.GeneratorConfigurationPackage;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplateFactory;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassFilterBehavior;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceListView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DocumentStructureTemplatePackageImpl extends EPackageImpl implements DocumentStructureTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass documentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass documentTemplatePrototypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass textDocumentTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass documentPartEClass = null;

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
	private EClass bodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iBodyPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iBodySectionPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iComposedBodyPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iSubBodyPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iLeafBodyPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iComposedSubBodyPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iLeafSubBodyPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eClassPartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eReferencePartTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eReferenceTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iTemplatePartViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eReferenceListViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass iColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eReferenceTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass eStructuralFeatureColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum eClassFilterBehaviorEEnum = null;

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
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocumentStructureTemplatePackageImpl() {
		super(eNS_URI, DocumentStructureTemplateFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DocumentStructureTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocumentStructureTemplatePackage init() {
		if (isInited) {
			return (DocumentStructureTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(DocumentStructureTemplatePackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredDocumentStructureTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DocumentStructureTemplatePackageImpl theDocumentStructureTemplatePackage = registeredDocumentStructureTemplatePackage instanceof DocumentStructureTemplatePackageImpl ? (DocumentStructureTemplatePackageImpl) registeredDocumentStructureTemplatePackage
				: new DocumentStructureTemplatePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		GeneratorConfigurationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDocumentStructureTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theDocumentStructureTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentStructureTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentStructureTemplatePackage.eNS_URI, theDocumentStructureTemplatePackage);
		return theDocumentStructureTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDocumentTemplate() {
		return documentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocumentTemplate_SemanticContext() {
		return (EReference) documentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocumentTemplate_GraphicalContext() {
		return (EReference) documentTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocumentTemplate_DocumentTemplatePrototype() {
		return (EReference) documentTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentTemplate_Name() {
		return (EAttribute) documentTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentTemplate_Description() {
		return (EAttribute) documentTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentTemplate_KindId() {
		return (EAttribute) documentTemplateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocumentTemplate_DocumentStructureGeneratorConfiguration() {
		return (EReference) documentTemplateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getDocumentTemplate__GetType() {
		return documentTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getDocumentTemplate__GetIconPath() {
		return documentTemplateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDocumentTemplatePrototype() {
		return documentTemplatePrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentTemplatePrototype_Type() {
		return (EAttribute) documentTemplatePrototypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentTemplatePrototype_IconPath() {
		return (EAttribute) documentTemplatePrototypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getDocumentTemplatePrototype_Description() {
		return (EAttribute) documentTemplatePrototypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getDocumentTemplatePrototype_DocumentTemplate() {
		return (EReference) documentTemplatePrototypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getTextDocumentTemplate() {
		return textDocumentTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getTextDocumentTemplate_MainTitle() {
		return (EAttribute) textDocumentTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getTextDocumentTemplate_DocumentPart() {
		return (EReference) textDocumentTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getDocumentPart() {
		return documentPartEClass;
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
	public EReference getBody_BodyPartTemplate() {
		return (EReference) bodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIBodyPartTemplate() {
		return iBodyPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIBodySectionPartTemplate() {
		return iBodySectionPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIBodySectionPartTemplate_Generate() {
		return (EAttribute) iBodySectionPartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIBodySectionPartTemplate_GenerateTitle() {
		return (EAttribute) iBodySectionPartTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIBodySectionPartTemplate_CustomTitle() {
		return (EAttribute) iBodySectionPartTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIBodySectionPartTemplate__BuildPartTemplateTitle__EObject() {
		return iBodySectionPartTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIComposedBodyPartTemplate() {
		return iComposedBodyPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getIComposedBodyPartTemplate_SubBodyPartTemplate() {
		return (EReference) iComposedBodyPartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getISubBodyPartTemplate() {
		return iSubBodyPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getILeafBodyPartTemplate() {
		return iLeafBodyPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIComposedSubBodyPartTemplate() {
		return iComposedSubBodyPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getIComposedSubBodyPartTemplate_BodyPartTemplate() {
		return (EReference) iComposedSubBodyPartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getILeafSubBodyPartTemplate() {
		return iLeafSubBodyPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEClassPartTemplate() {
		return eClassPartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEClassPartTemplate_EClass() {
		return (EReference) eClassPartTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getEClassPartTemplate_FilterRule() {
		return (EAttribute) eClassPartTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getEClassPartTemplate__IsMatchingFilterRule__EObject() {
		return eClassPartTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEReferencePartTemplate() {
		return eReferencePartTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEReferenceTemplate() {
		return eReferenceTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEReferenceTemplate_EReference() {
		return (EReference) eReferenceTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getEReferenceTemplate__GetEReferenceValues__EObject() {
		return eReferenceTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getEReferenceTemplate__BuildEReferenceValueLabel__EObject() {
		return eReferenceTemplateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getITemplatePartView() {
		return iTemplatePartViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEReferenceListView() {
		return eReferenceListViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getITableView() {
		return iTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getITableView_Columns() {
		return (EReference) iTableViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getITableView_GenerateRowHeader() {
		return (EAttribute) iTableViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getITableView_GenerateColumnHeader() {
		return (EAttribute) iTableViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getITableView__GetRows__EObject() {
		return iTableViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getITableView__BuildRowHeaderLabel__EObject() {
		return iTableViewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getIColumn() {
		return iColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getIColumn_CustomColumnTitle() {
		return (EAttribute) iColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIColumn__BuildColumnHeaderLabel() {
		return iColumnEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIColumn__GetCellValue__EObject() {
		return iColumnEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EOperation getIColumn__BuildCellLabel__Object() {
		return iColumnEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEReferenceTableView() {
		return eReferenceTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getEStructuralFeatureColumn() {
		return eStructuralFeatureColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getEStructuralFeatureColumn_Feature() {
		return (EReference) eStructuralFeatureColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEnum getEClassFilterBehavior() {
		return eClassFilterBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DocumentStructureTemplateFactory getDocumentStructureTemplateFactory() {
		return (DocumentStructureTemplateFactory) getEFactoryInstance();
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
		documentTemplateEClass = createEClass(DOCUMENT_TEMPLATE);
		createEReference(documentTemplateEClass, DOCUMENT_TEMPLATE__SEMANTIC_CONTEXT);
		createEReference(documentTemplateEClass, DOCUMENT_TEMPLATE__GRAPHICAL_CONTEXT);
		createEReference(documentTemplateEClass, DOCUMENT_TEMPLATE__DOCUMENT_TEMPLATE_PROTOTYPE);
		createEAttribute(documentTemplateEClass, DOCUMENT_TEMPLATE__NAME);
		createEAttribute(documentTemplateEClass, DOCUMENT_TEMPLATE__DESCRIPTION);
		createEAttribute(documentTemplateEClass, DOCUMENT_TEMPLATE__KIND_ID);
		createEReference(documentTemplateEClass, DOCUMENT_TEMPLATE__DOCUMENT_STRUCTURE_GENERATOR_CONFIGURATION);
		createEOperation(documentTemplateEClass, DOCUMENT_TEMPLATE___GET_TYPE);
		createEOperation(documentTemplateEClass, DOCUMENT_TEMPLATE___GET_ICON_PATH);

		documentTemplatePrototypeEClass = createEClass(DOCUMENT_TEMPLATE_PROTOTYPE);
		createEAttribute(documentTemplatePrototypeEClass, DOCUMENT_TEMPLATE_PROTOTYPE__TYPE);
		createEAttribute(documentTemplatePrototypeEClass, DOCUMENT_TEMPLATE_PROTOTYPE__ICON_PATH);
		createEAttribute(documentTemplatePrototypeEClass, DOCUMENT_TEMPLATE_PROTOTYPE__DESCRIPTION);
		createEReference(documentTemplatePrototypeEClass, DOCUMENT_TEMPLATE_PROTOTYPE__DOCUMENT_TEMPLATE);

		textDocumentTemplateEClass = createEClass(TEXT_DOCUMENT_TEMPLATE);
		createEAttribute(textDocumentTemplateEClass, TEXT_DOCUMENT_TEMPLATE__MAIN_TITLE);
		createEReference(textDocumentTemplateEClass, TEXT_DOCUMENT_TEMPLATE__DOCUMENT_PART);

		documentPartEClass = createEClass(DOCUMENT_PART);

		tableOfContentsEClass = createEClass(TABLE_OF_CONTENTS);
		createEAttribute(tableOfContentsEClass, TABLE_OF_CONTENTS__TOC_TITLE);

		bodyEClass = createEClass(BODY);
		createEReference(bodyEClass, BODY__BODY_PART_TEMPLATE);

		iBodyPartTemplateEClass = createEClass(IBODY_PART_TEMPLATE);

		iBodySectionPartTemplateEClass = createEClass(IBODY_SECTION_PART_TEMPLATE);
		createEAttribute(iBodySectionPartTemplateEClass, IBODY_SECTION_PART_TEMPLATE__GENERATE);
		createEAttribute(iBodySectionPartTemplateEClass, IBODY_SECTION_PART_TEMPLATE__GENERATE_TITLE);
		createEAttribute(iBodySectionPartTemplateEClass, IBODY_SECTION_PART_TEMPLATE__CUSTOM_TITLE);
		createEOperation(iBodySectionPartTemplateEClass, IBODY_SECTION_PART_TEMPLATE___BUILD_PART_TEMPLATE_TITLE__EOBJECT);

		iComposedBodyPartTemplateEClass = createEClass(ICOMPOSED_BODY_PART_TEMPLATE);
		createEReference(iComposedBodyPartTemplateEClass, ICOMPOSED_BODY_PART_TEMPLATE__SUB_BODY_PART_TEMPLATE);

		iSubBodyPartTemplateEClass = createEClass(ISUB_BODY_PART_TEMPLATE);

		iLeafBodyPartTemplateEClass = createEClass(ILEAF_BODY_PART_TEMPLATE);

		iComposedSubBodyPartTemplateEClass = createEClass(ICOMPOSED_SUB_BODY_PART_TEMPLATE);
		createEReference(iComposedSubBodyPartTemplateEClass, ICOMPOSED_SUB_BODY_PART_TEMPLATE__BODY_PART_TEMPLATE);

		iLeafSubBodyPartTemplateEClass = createEClass(ILEAF_SUB_BODY_PART_TEMPLATE);

		eClassPartTemplateEClass = createEClass(ECLASS_PART_TEMPLATE);
		createEReference(eClassPartTemplateEClass, ECLASS_PART_TEMPLATE__ECLASS);
		createEAttribute(eClassPartTemplateEClass, ECLASS_PART_TEMPLATE__FILTER_RULE);
		createEOperation(eClassPartTemplateEClass, ECLASS_PART_TEMPLATE___IS_MATCHING_FILTER_RULE__EOBJECT);

		eReferencePartTemplateEClass = createEClass(EREFERENCE_PART_TEMPLATE);

		eReferenceTemplateEClass = createEClass(EREFERENCE_TEMPLATE);
		createEReference(eReferenceTemplateEClass, EREFERENCE_TEMPLATE__EREFERENCE);
		createEOperation(eReferenceTemplateEClass, EREFERENCE_TEMPLATE___GET_EREFERENCE_VALUES__EOBJECT);
		createEOperation(eReferenceTemplateEClass, EREFERENCE_TEMPLATE___BUILD_EREFERENCE_VALUE_LABEL__EOBJECT);

		iTemplatePartViewEClass = createEClass(ITEMPLATE_PART_VIEW);

		eReferenceListViewEClass = createEClass(EREFERENCE_LIST_VIEW);

		iTableViewEClass = createEClass(ITABLE_VIEW);
		createEReference(iTableViewEClass, ITABLE_VIEW__COLUMNS);
		createEAttribute(iTableViewEClass, ITABLE_VIEW__GENERATE_ROW_HEADER);
		createEAttribute(iTableViewEClass, ITABLE_VIEW__GENERATE_COLUMN_HEADER);
		createEOperation(iTableViewEClass, ITABLE_VIEW___GET_ROWS__EOBJECT);
		createEOperation(iTableViewEClass, ITABLE_VIEW___BUILD_ROW_HEADER_LABEL__EOBJECT);

		iColumnEClass = createEClass(ICOLUMN);
		createEAttribute(iColumnEClass, ICOLUMN__CUSTOM_COLUMN_TITLE);
		createEOperation(iColumnEClass, ICOLUMN___BUILD_COLUMN_HEADER_LABEL);
		createEOperation(iColumnEClass, ICOLUMN___GET_CELL_VALUE__EOBJECT);
		createEOperation(iColumnEClass, ICOLUMN___BUILD_CELL_LABEL__OBJECT);

		eReferenceTableViewEClass = createEClass(EREFERENCE_TABLE_VIEW);

		eStructuralFeatureColumnEClass = createEClass(ESTRUCTURAL_FEATURE_COLUMN);
		createEReference(eStructuralFeatureColumnEClass, ESTRUCTURAL_FEATURE_COLUMN__FEATURE);

		// Create enums
		eClassFilterBehaviorEEnum = createEEnum(ECLASS_FILTER_BEHAVIOR);
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
		GeneratorConfigurationPackage theGeneratorConfigurationPackage = (GeneratorConfigurationPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratorConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textDocumentTemplateEClass.getESuperTypes().add(this.getDocumentTemplate());
		tableOfContentsEClass.getESuperTypes().add(this.getDocumentPart());
		bodyEClass.getESuperTypes().add(this.getDocumentPart());
		iBodyPartTemplateEClass.getESuperTypes().add(this.getIBodySectionPartTemplate());
		iComposedBodyPartTemplateEClass.getESuperTypes().add(this.getIBodyPartTemplate());
		iSubBodyPartTemplateEClass.getESuperTypes().add(this.getIBodySectionPartTemplate());
		iLeafBodyPartTemplateEClass.getESuperTypes().add(this.getIBodyPartTemplate());
		iComposedSubBodyPartTemplateEClass.getESuperTypes().add(this.getISubBodyPartTemplate());
		iLeafSubBodyPartTemplateEClass.getESuperTypes().add(this.getISubBodyPartTemplate());
		eClassPartTemplateEClass.getESuperTypes().add(this.getIComposedSubBodyPartTemplate());
		eReferencePartTemplateEClass.getESuperTypes().add(this.getEReferenceTemplate());
		eReferencePartTemplateEClass.getESuperTypes().add(this.getIComposedBodyPartTemplate());
		eReferenceListViewEClass.getESuperTypes().add(this.getITemplatePartView());
		iTableViewEClass.getESuperTypes().add(this.getILeafBodyPartTemplate());
		iTableViewEClass.getESuperTypes().add(this.getITemplatePartView());
		eReferenceTableViewEClass.getESuperTypes().add(this.getEReferenceTemplate());
		eReferenceTableViewEClass.getESuperTypes().add(this.getITableView());
		eStructuralFeatureColumnEClass.getESuperTypes().add(this.getIColumn());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentTemplateEClass, DocumentTemplate.class, "DocumentTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDocumentTemplate_SemanticContext(), theEcorePackage.getEObject(), null, "semanticContext", null, 0, 1, DocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentTemplate_GraphicalContext(), theEcorePackage.getEObject(), null, "graphicalContext", null, 0, 1, DocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentTemplate_DocumentTemplatePrototype(), this.getDocumentTemplatePrototype(), null, "documentTemplatePrototype", null, 1, 1, DocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, //$NON-NLS-1$
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentTemplate_Name(), theEcorePackage.getEString(), "name", null, 1, 1, DocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentTemplate_Description(), theEcorePackage.getEString(), "description", null, 0, 1, DocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentTemplate_KindId(), ecorePackage.getEString(), "kindId", null, 1, 1, DocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDocumentTemplate_DocumentStructureGeneratorConfiguration(), theGeneratorConfigurationPackage.getIDocumentStructureGeneratorConfiguration(), null, "documentStructureGeneratorConfiguration", null, 1, 1, DocumentTemplate.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDocumentTemplate__GetType(), ecorePackage.getEString(), "getType", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getDocumentTemplate__GetIconPath(), ecorePackage.getEString(), "getIconPath", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(documentTemplatePrototypeEClass, DocumentTemplatePrototype.class, "DocumentTemplatePrototype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentTemplatePrototype_Type(), theEcorePackage.getEString(), "type", null, 1, 1, DocumentTemplatePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentTemplatePrototype_IconPath(), theEcorePackage.getEString(), "iconPath", null, 1, 1, DocumentTemplatePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDocumentTemplatePrototype_Description(), theEcorePackage.getEString(), "description", null, 0, 1, DocumentTemplatePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);
		initEReference(getDocumentTemplatePrototype_DocumentTemplate(), this.getDocumentTemplate(), null, "documentTemplate", null, 1, 1, DocumentTemplatePrototype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, //$NON-NLS-1$
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textDocumentTemplateEClass, TextDocumentTemplate.class, "TextDocumentTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTextDocumentTemplate_MainTitle(), ecorePackage.getEString(), "mainTitle", null, 0, 1, TextDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getTextDocumentTemplate_DocumentPart(), this.getDocumentPart(), null, "documentPart", null, 0, -1, TextDocumentTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		initEClass(documentPartEClass, DocumentPart.class, "DocumentPart", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(tableOfContentsEClass, TableOfContents.class, "TableOfContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTableOfContents_TocTitle(), theEcorePackage.getEString(), "tocTitle", "Table Of Contents", 1, 1, TableOfContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBody_BodyPartTemplate(), this.getIBodyPartTemplate(), null, "bodyPartTemplate", null, 1, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);

		initEClass(iBodyPartTemplateEClass, IBodyPartTemplate.class, "IBodyPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iBodySectionPartTemplateEClass, IBodySectionPartTemplate.class, "IBodySectionPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIBodySectionPartTemplate_Generate(), ecorePackage.getEBoolean(), "generate", "true", 1, 1, IBodySectionPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getIBodySectionPartTemplate_GenerateTitle(), ecorePackage.getEBoolean(), "generateTitle", "true", 1, 1, IBodySectionPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$ //$NON-NLS-2$
				!IS_ORDERED);
		initEAttribute(getIBodySectionPartTemplate_CustomTitle(), ecorePackage.getEString(), "customTitle", null, 0, 1, IBodySectionPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getIBodySectionPartTemplate__BuildPartTemplateTitle__EObject(), ecorePackage.getEString(), "buildPartTemplateTitle", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "context", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(iComposedBodyPartTemplateEClass, IComposedBodyPartTemplate.class, "IComposedBodyPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIComposedBodyPartTemplate_SubBodyPartTemplate(), this.getISubBodyPartTemplate(), null, "subBodyPartTemplate", null, 0, -1, IComposedBodyPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, //$NON-NLS-1$
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iSubBodyPartTemplateEClass, ISubBodyPartTemplate.class, "ISubBodyPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iLeafBodyPartTemplateEClass, ILeafBodyPartTemplate.class, "ILeafBodyPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iComposedSubBodyPartTemplateEClass, IComposedSubBodyPartTemplate.class, "IComposedSubBodyPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIComposedSubBodyPartTemplate_BodyPartTemplate(), this.getIBodyPartTemplate(), null, "bodyPartTemplate", null, 0, -1, IComposedSubBodyPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, //$NON-NLS-1$
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iLeafSubBodyPartTemplateEClass, ILeafSubBodyPartTemplate.class, "ILeafSubBodyPartTemplate", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eClassPartTemplateEClass, EClassPartTemplate.class, "EClassPartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEClassPartTemplate_EClass(), theEcorePackage.getEClass(), null, "eClass", null, 0, 1, EClassPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, //$NON-NLS-1$
				!IS_ORDERED);
		initEAttribute(getEClassPartTemplate_FilterRule(), this.getEClassFilterBehavior(), "filterRule", "TYPE_OF", 1, 1, EClassPartTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = initEOperation(getEClassPartTemplate__IsMatchingFilterRule__EObject(), ecorePackage.getEBoolean(), "isMatchingFilterRule", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "inputEObject", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eReferencePartTemplateEClass, EReferencePartTemplate.class, "EReferencePartTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eReferenceTemplateEClass, EReferenceTemplate.class, "EReferenceTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEReferenceTemplate_EReference(), theEcorePackage.getEReference(), null, "eReference", null, 1, 1, EReferenceTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, //$NON-NLS-1$
				!IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getEReferenceTemplate__GetEReferenceValues__EObject(), theEcorePackage.getEObject(), "getEReferenceValues", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "context", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getEReferenceTemplate__BuildEReferenceValueLabel__EObject(), ecorePackage.getEString(), "buildEReferenceValueLabel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(iTemplatePartViewEClass, ITemplatePartView.class, "ITemplatePartView", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eReferenceListViewEClass, EReferenceListView.class, "EReferenceListView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(iTableViewEClass, ITableView.class, "ITableView", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getITableView_Columns(), this.getIColumn(), null, "columns", null, 0, -1, ITableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getITableView_GenerateRowHeader(), ecorePackage.getEBoolean(), "generateRowHeader", "true", 1, 1, ITableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getITableView_GenerateColumnHeader(), ecorePackage.getEBoolean(), "generateColumnHeader", "true", 1, 1, ITableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = initEOperation(getITableView__GetRows__EObject(), theEcorePackage.getEObject(), "getRows", 0, -1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "context", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getITableView__BuildRowHeaderLabel__EObject(), ecorePackage.getEString(), "buildRowHeaderLabel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "rowElement", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(iColumnEClass, IColumn.class, "IColumn", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIColumn_CustomColumnTitle(), ecorePackage.getEString(), "customColumnTitle", null, 0, 1, IColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEOperation(getIColumn__BuildColumnHeaderLabel(), ecorePackage.getEString(), "buildColumnHeaderLabel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getIColumn__GetCellValue__EObject(), theEcorePackage.getEJavaObject(), "getCellValue", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEObject(), "row", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getIColumn__BuildCellLabel__Object(), ecorePackage.getEString(), "buildCellLabel", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "cellElement", 1, 1, IS_UNIQUE, !IS_ORDERED); //$NON-NLS-1$

		initEClass(eReferenceTableViewEClass, EReferenceTableView.class, "EReferenceTableView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(eStructuralFeatureColumnEClass, EStructuralFeatureColumn.class, "EStructuralFeatureColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEStructuralFeatureColumn_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, EStructuralFeatureColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, //$NON-NLS-1$
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eClassFilterBehaviorEEnum, EClassFilterBehavior.class, "EClassFilterBehavior"); //$NON-NLS-1$
		addEEnumLiteral(eClassFilterBehaviorEEnum, EClassFilterBehavior.TYPE_OF);
		addEEnumLiteral(eClassFilterBehaviorEEnum, EClassFilterBehavior.KIND_OF);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
						"originalName", "DocumentStructureTemplate" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates"; //$NON-NLS-1$
		addAnnotation(eReferenceTableViewEClass,
				source,
				new String[] {
				});
	}

} // DocumentStructureTemplatePackageImpl
