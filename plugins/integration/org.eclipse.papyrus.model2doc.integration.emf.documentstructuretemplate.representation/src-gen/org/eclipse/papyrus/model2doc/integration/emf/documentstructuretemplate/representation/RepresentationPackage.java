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
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation;

import org.eclipse.emf.ecore.EAttribute;
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
 * <!-- begin-model-doc -->
 * This package contains the elements allowing to integrate the DocumentStructureTemplate metamodel into the Papyrus ArchitectureFramework
 * <!-- end-model-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.RepresentationFactory
 * @model kind="package"
 * @generated
 */
public interface RepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "representation"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/model2doc/integration/1.0.0/emf/documentstructuretemplate/representation"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "representation"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	RepresentationPackage eINSTANCE = org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.RepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl <em>Papyrus Document Prototype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.RepresentationPackageImpl#getPapyrusDocumentPrototype()
	 * @generated
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__ID = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__NAME = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__DESCRIPTION = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__QUALIFIED_NAME = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__ICON = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__ICON;

	/**
	 * The feature id for the '<em><b>Language</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__LANGUAGE = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__CONCERNS = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__CONCERNS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__PARENT = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__PARENT;

	/**
	 * The feature id for the '<em><b>Model Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__MODEL_RULES = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__MODEL_RULES;

	/**
	 * The feature id for the '<em><b>Owning Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__OWNING_RULES = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__OWNING_RULES;

	/**
	 * The feature id for the '<em><b>Implementation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__IMPLEMENTATION_ID = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND__IMPLEMENTATION_ID;

	/**
	 * The feature id for the '<em><b>Document Template Prototype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Command Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE__CREATION_COMMAND_CLASS = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Papyrus Document Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE_FEATURE_COUNT = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Papyrus Document Prototype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAPYRUS_DOCUMENT_PROTOTYPE_OPERATION_COUNT = org.eclipse.papyrus.infra.architecture.representation.RepresentationPackage.PAPYRUS_REPRESENTATION_KIND_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype <em>Papyrus Document Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Papyrus Document Prototype</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype
	 * @generated
	 */
	EClass getPapyrusDocumentPrototype();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getDocumentTemplatePrototype <em>Document Template Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Document Template Prototype</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getDocumentTemplatePrototype()
	 * @see #getPapyrusDocumentPrototype()
	 * @generated
	 */
	EReference getPapyrusDocumentPrototype_DocumentTemplatePrototype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getCreationCommandClass <em>Creation Command Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Creation Command Class</em>'.
	 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.PapyrusDocumentPrototype#getCreationCommandClass()
	 * @see #getPapyrusDocumentPrototype()
	 * @generated
	 */
	EAttribute getPapyrusDocumentPrototype_CreationCommandClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepresentationFactory getRepresentationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl <em>Papyrus Document Prototype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.PapyrusDocumentPrototypeImpl
		 * @see org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.impl.RepresentationPackageImpl#getPapyrusDocumentPrototype()
		 * @generated
		 */
		EClass PAPYRUS_DOCUMENT_PROTOTYPE = eINSTANCE.getPapyrusDocumentPrototype();

		/**
		 * The meta object literal for the '<em><b>Document Template Prototype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PAPYRUS_DOCUMENT_PROTOTYPE__DOCUMENT_TEMPLATE_PROTOTYPE = eINSTANCE.getPapyrusDocumentPrototype_DocumentTemplatePrototype();

		/**
		 * The meta object literal for the '<em><b>Creation Command Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PAPYRUS_DOCUMENT_PROTOTYPE__CREATION_COMMAND_CLASS = eINSTANCE.getPapyrusDocumentPrototype_CreationCommandClass();

	}

} // RepresentationPackage