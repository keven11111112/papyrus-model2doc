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
package org.eclipse.papyrus.model2doc.documentstructuretemplate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplateFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentStructureTemplate'"
 * @generated
 */
public interface DocumentStructureTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/1.0.0/documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	DocumentStructureTemplatePackage eINSTANCE = org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentTemplate()
	 * @generated
	 */
	int DOCUMENT_TEMPLATE = 0;

	/**
	 * The number of structural features of the '<em>Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.TextDocumentTemplateImpl <em>Text Document Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.TextDocumentTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getTextDocumentTemplate()
	 * @generated
	 */
	int TEXT_DOCUMENT_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Start Model Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR = DOCUMENT_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE_FEATURE_COUNT = DOCUMENT_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Document Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_TEMPLATE_OPERATION_COUNT = DOCUMENT_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEObjectVisitorTemplateImpl <em>Start EObject Visitor Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEObjectVisitorTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getStartEObjectVisitorTemplate()
	 * @generated
	 */
	int START_EOBJECT_VISITOR_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Feature Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE__FEATURE_VISITOR = ModelVisitorPackage.START_MODEL_VISITOR__FEATURE_VISITOR;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE__GENERATE = ModelVisitorPackage.START_MODEL_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE__GENERATE_TITLE = ModelVisitorPackage.START_MODEL_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE__DEFAULT_TITLE = ModelVisitorPackage.START_MODEL_VISITOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE__CUSTOM_TITLE = ModelVisitorPackage.START_MODEL_VISITOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eobject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE__EOBJECT = ModelVisitorPackage.START_MODEL_VISITOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Start EObject Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE_FEATURE_COUNT = ModelVisitorPackage.START_MODEL_VISITOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Start EObject Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_EOBJECT_VISITOR_TEMPLATE_OPERATION_COUNT = ModelVisitorPackage.START_MODEL_VISITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EClassVisitorTemplateImpl <em>EClass Visitor Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EClassVisitorTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassVisitorTemplate()
	 * @generated
	 */
	int ECLASS_VISITOR_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Feature Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE__FEATURE_VISITOR = ModelVisitorPackage.OBJECT_VISITOR__FEATURE_VISITOR;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE__GENERATE = ModelVisitorPackage.OBJECT_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE__GENERATE_TITLE = ModelVisitorPackage.OBJECT_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE__DEFAULT_TITLE = ModelVisitorPackage.OBJECT_VISITOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE__CUSTOM_TITLE = ModelVisitorPackage.OBJECT_VISITOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE__ECLASS = ModelVisitorPackage.OBJECT_VISITOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EClass Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE_FEATURE_COUNT = ModelVisitorPackage.OBJECT_VISITOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>EClass Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ECLASS_VISITOR_TEMPLATE_OPERATION_COUNT = ModelVisitorPackage.OBJECT_VISITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEClassVisitorTemplateImpl <em>Start EClass Visitor Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEClassVisitorTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getStartEClassVisitorTemplate()
	 * @generated
	 */
	int START_ECLASS_VISITOR_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Feature Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE__FEATURE_VISITOR = ECLASS_VISITOR_TEMPLATE__FEATURE_VISITOR;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE__GENERATE = ECLASS_VISITOR_TEMPLATE__GENERATE;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE__GENERATE_TITLE = ECLASS_VISITOR_TEMPLATE__GENERATE_TITLE;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE__DEFAULT_TITLE = ECLASS_VISITOR_TEMPLATE__DEFAULT_TITLE;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE__CUSTOM_TITLE = ECLASS_VISITOR_TEMPLATE__CUSTOM_TITLE;

	/**
	 * The feature id for the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE__ECLASS = ECLASS_VISITOR_TEMPLATE__ECLASS;

	/**
	 * The number of structural features of the '<em>Start EClass Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE_FEATURE_COUNT = ECLASS_VISITOR_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start EClass Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_ECLASS_VISITOR_TEMPLATE_OPERATION_COUNT = ECLASS_VISITOR_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl <em>EStructural Feature Visitor Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEStructuralFeatureVisitorTemplate()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE = 5;

	/**
	 * The feature id for the '<em><b>Model Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__MODEL_VISITOR = ModelVisitorPackage.FEATURE_VISITOR__MODEL_VISITOR;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE = ModelVisitorPackage.FEATURE_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__GENERATE_TITLE = ModelVisitorPackage.FEATURE_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__DEFAULT_TITLE = ModelVisitorPackage.FEATURE_VISITOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custom Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__CUSTOM_TITLE = ModelVisitorPackage.FEATURE_VISITOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE = ModelVisitorPackage.FEATURE_VISITOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EStructural Feature Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE_FEATURE_COUNT = ModelVisitorPackage.FEATURE_VISITOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>EStructural Feature Visitor Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE_OPERATION_COUNT = ModelVisitorPackage.FEATURE_VISITOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Document Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate
	 * @generated
	 */
	EClass getDocumentTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate <em>Text Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Text Document Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate
	 * @generated
	 */
	EClass getTextDocumentTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate#getStartModelVisitor <em>Start Model Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Start Model Visitor</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate#getStartModelVisitor()
	 * @see #getTextDocumentTemplate()
	 * @generated
	 */
	EReference getTextDocumentTemplate_StartModelVisitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate <em>Start EObject Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Start EObject Visitor Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate
	 * @generated
	 */
	EClass getStartEObjectVisitorTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate#getEobject <em>Eobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Eobject</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate#getEobject()
	 * @see #getStartEObjectVisitorTemplate()
	 * @generated
	 */
	EReference getStartEObjectVisitorTemplate_Eobject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEClassVisitorTemplate <em>Start EClass Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Start EClass Visitor Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEClassVisitorTemplate
	 * @generated
	 */
	EClass getStartEClassVisitorTemplate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate <em>EClass Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EClass Visitor Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate
	 * @generated
	 */
	EClass getEClassVisitorTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate#getEclass <em>Eclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Eclass</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate#getEclass()
	 * @see #getEClassVisitorTemplate()
	 * @generated
	 */
	EReference getEClassVisitorTemplate_Eclass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate <em>EStructural Feature Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EStructural Feature Visitor Template</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate
	 * @generated
	 */
	EClass getEStructuralFeatureVisitorTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate#getFeature()
	 * @see #getEStructuralFeatureVisitorTemplate()
	 * @generated
	 */
	EReference getEStructuralFeatureVisitorTemplate_Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentStructureTemplateFactory getDocumentStructureTemplateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getDocumentTemplate()
		 * @generated
		 */
		EClass DOCUMENT_TEMPLATE = eINSTANCE.getDocumentTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.TextDocumentTemplateImpl <em>Text Document Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.TextDocumentTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getTextDocumentTemplate()
		 * @generated
		 */
		EClass TEXT_DOCUMENT_TEMPLATE = eINSTANCE.getTextDocumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Start Model Visitor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TEXT_DOCUMENT_TEMPLATE__START_MODEL_VISITOR = eINSTANCE.getTextDocumentTemplate_StartModelVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEObjectVisitorTemplateImpl <em>Start EObject Visitor Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEObjectVisitorTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getStartEObjectVisitorTemplate()
		 * @generated
		 */
		EClass START_EOBJECT_VISITOR_TEMPLATE = eINSTANCE.getStartEObjectVisitorTemplate();

		/**
		 * The meta object literal for the '<em><b>Eobject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference START_EOBJECT_VISITOR_TEMPLATE__EOBJECT = eINSTANCE.getStartEObjectVisitorTemplate_Eobject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEClassVisitorTemplateImpl <em>Start EClass Visitor Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.StartEClassVisitorTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getStartEClassVisitorTemplate()
		 * @generated
		 */
		EClass START_ECLASS_VISITOR_TEMPLATE = eINSTANCE.getStartEClassVisitorTemplate();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EClassVisitorTemplateImpl <em>EClass Visitor Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EClassVisitorTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEClassVisitorTemplate()
		 * @generated
		 */
		EClass ECLASS_VISITOR_TEMPLATE = eINSTANCE.getEClassVisitorTemplate();

		/**
		 * The meta object literal for the '<em><b>Eclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ECLASS_VISITOR_TEMPLATE__ECLASS = eINSTANCE.getEClassVisitorTemplate_Eclass();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl <em>EStructural Feature Visitor Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.EStructuralFeatureVisitorTemplateImpl
		 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.impl.DocumentStructureTemplatePackageImpl#getEStructuralFeatureVisitorTemplate()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE = eINSTANCE.getEStructuralFeatureVisitorTemplate();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE_VISITOR_TEMPLATE__FEATURE = eINSTANCE.getEStructuralFeatureVisitorTemplate_Feature();

	}

} // DocumentStructureTemplatePackage
