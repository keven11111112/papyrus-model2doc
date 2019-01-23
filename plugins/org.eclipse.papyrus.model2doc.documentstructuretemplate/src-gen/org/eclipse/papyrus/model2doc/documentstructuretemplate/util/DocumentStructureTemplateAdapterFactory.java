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
package org.eclipse.papyrus.model2doc.documentstructuretemplate.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate;
import org.eclipse.papyrus.model2doc.documentstructuretemplate.*;

import org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor;
import org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor;
import org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentStructureTemplatePackage
 * @generated
 */
public class DocumentStructureTemplateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static DocumentStructureTemplatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentStructureTemplateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DocumentStructureTemplatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DocumentStructureTemplateSwitch<Adapter> modelSwitch = new DocumentStructureTemplateSwitch<Adapter>() {
		@Override
		public Adapter caseDocumentTemplate(DocumentTemplate object) {
			return createDocumentTemplateAdapter();
		}

		@Override
		public Adapter caseTextDocumentTemplate(TextDocumentTemplate object) {
			return createTextDocumentTemplateAdapter();
		}

		@Override
		public Adapter caseStartEObjectVisitorTemplate(StartEObjectVisitorTemplate object) {
			return createStartEObjectVisitorTemplateAdapter();
		}

		@Override
		public Adapter caseStartEClassVisitorTemplate(StartEClassVisitorTemplate object) {
			return createStartEClassVisitorTemplateAdapter();
		}

		@Override
		public Adapter caseEClassVisitorTemplate(EClassVisitorTemplate object) {
			return createEClassVisitorTemplateAdapter();
		}

		@Override
		public Adapter caseEStructuralFeatureVisitorTemplate(EStructuralFeatureVisitorTemplate object) {
			return createEStructuralFeatureVisitorTemplateAdapter();
		}

		@Override
		public Adapter caseObjectVisitor(ObjectVisitor object) {
			return createObjectVisitorAdapter();
		}

		@Override
		public Adapter caseStartModelVisitor(StartModelVisitor object) {
			return createStartModelVisitorAdapter();
		}

		@Override
		public Adapter caseDocumentPartTemplate(DocumentPartTemplate object) {
			return createDocumentPartTemplateAdapter();
		}

		@Override
		public Adapter caseEObjectDocumentPartTemplate(EObjectDocumentPartTemplate object) {
			return createEObjectDocumentPartTemplateAdapter();
		}

		@Override
		public Adapter caseEClassDocumentPartTemplate(EClassDocumentPartTemplate object) {
			return createEClassDocumentPartTemplateAdapter();
		}

		@Override
		public Adapter caseFeatureVisitor(FeatureVisitor object) {
			return createFeatureVisitorAdapter();
		}

		@Override
		public Adapter caseEStructuralFeatureDocumentPartTemplate(EStructuralFeatureDocumentPartTemplate object) {
			return createEStructuralFeatureDocumentPartTemplateAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *                   the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.DocumentTemplate
	 * @generated
	 */
	public Adapter createDocumentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate <em>Text Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.TextDocumentTemplate
	 * @generated
	 */
	public Adapter createTextDocumentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate <em>Start EObject Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEObjectVisitorTemplate
	 * @generated
	 */
	public Adapter createStartEObjectVisitorTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEClassVisitorTemplate <em>Start EClass Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.StartEClassVisitorTemplate
	 * @generated
	 */
	public Adapter createStartEClassVisitorTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate <em>EClass Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.EClassVisitorTemplate
	 * @generated
	 */
	public Adapter createEClassVisitorTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate <em>EStructural Feature Visitor Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentstructuretemplate.EStructuralFeatureVisitorTemplate
	 * @generated
	 */
	public Adapter createEStructuralFeatureVisitorTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor <em>Object Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.ObjectVisitor
	 * @generated
	 */
	public Adapter createObjectVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor <em>Start Model Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.StartModelVisitor
	 * @generated
	 */
	public Adapter createStartModelVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate <em>Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.DocumentPartTemplate
	 * @generated
	 */
	public Adapter createDocumentPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate <em>EObject Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EObjectDocumentPartTemplate
	 * @generated
	 */
	public Adapter createEObjectDocumentPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate <em>EClass Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EClassDocumentPartTemplate
	 * @generated
	 */
	public Adapter createEClassDocumentPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor <em>Feature Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.modelvisitor.FeatureVisitor
	 * @generated
	 */
	public Adapter createFeatureVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate <em>EStructural Feature Document Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.documentparttemplate.EStructuralFeatureDocumentPartTemplate
	 * @generated
	 */
	public Adapter createEStructuralFeatureDocumentPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // DocumentStructureTemplateAdapterFactory
