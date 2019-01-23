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
package org.eclipse.papyrus.model2doc.modelvisitor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.model2doc.modelvisitor.ModelVisitorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ModelVisitor'"
 * @generated
 */
public interface ModelVisitorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "modelvisitor"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/1.0.0/documentstructuretemplate/modelvisitor"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "modelvisitor"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	ModelVisitorPackage eINSTANCE = org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor <em>Object Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl#getObjectVisitor()
	 * @generated
	 */
	int OBJECT_VISITOR = 0;

	/**
	 * The feature id for the '<em><b>Feature Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_VISITOR__FEATURE_VISITOR = 0;

	/**
	 * The number of structural features of the '<em>Object Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_VISITOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int OBJECT_VISITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor <em>Feature Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl#getFeatureVisitor()
	 * @generated
	 */
	int FEATURE_VISITOR = 1;

	/**
	 * The feature id for the '<em><b>Model Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_VISITOR__MODEL_VISITOR = 0;

	/**
	 * The number of structural features of the '<em>Feature Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_VISITOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int FEATURE_VISITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor <em>Start Model Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl#getStartModelVisitor()
	 * @generated
	 */
	int START_MODEL_VISITOR = 2;

	/**
	 * The feature id for the '<em><b>Feature Visitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_MODEL_VISITOR__FEATURE_VISITOR = OBJECT_VISITOR__FEATURE_VISITOR;

	/**
	 * The number of structural features of the '<em>Start Model Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_MODEL_VISITOR_FEATURE_COUNT = OBJECT_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Model Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int START_MODEL_VISITOR_OPERATION_COUNT = OBJECT_VISITOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor <em>Object Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Object Visitor</em>'.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor
	 * @generated
	 */
	EClass getObjectVisitor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor#getFeatureVisitor <em>Feature Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Feature Visitor</em>'.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor#getFeatureVisitor()
	 * @see #getObjectVisitor()
	 * @generated
	 */
	EReference getObjectVisitor_FeatureVisitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor <em>Feature Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Feature Visitor</em>'.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor
	 * @generated
	 */
	EClass getFeatureVisitor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor#getModelVisitor <em>Model Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Model Visitor</em>'.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor#getModelVisitor()
	 * @see #getFeatureVisitor()
	 * @generated
	 */
	EReference getFeatureVisitor_ModelVisitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor <em>Start Model Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Start Model Visitor</em>'.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor
	 * @generated
	 */
	EClass getStartModelVisitor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelVisitorFactory getModelVisitorFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor <em>Object Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor
		 * @see org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl#getObjectVisitor()
		 * @generated
		 */
		EClass OBJECT_VISITOR = eINSTANCE.getObjectVisitor();

		/**
		 * The meta object literal for the '<em><b>Feature Visitor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference OBJECT_VISITOR__FEATURE_VISITOR = eINSTANCE.getObjectVisitor_FeatureVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor <em>Feature Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor
		 * @see org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl#getFeatureVisitor()
		 * @generated
		 */
		EClass FEATURE_VISITOR = eINSTANCE.getFeatureVisitor();

		/**
		 * The meta object literal for the '<em><b>Model Visitor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference FEATURE_VISITOR__MODEL_VISITOR = eINSTANCE.getFeatureVisitor_ModelVisitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor <em>Start Model Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor
		 * @see org.eclipse.papyrus.model2doc.modelvisitor.impl.ModelVisitorPackageImpl#getStartModelVisitor()
		 * @generated
		 */
		EClass START_MODEL_VISITOR = eINSTANCE.getStartModelVisitor();

	}

} // ModelVisitorPackage
