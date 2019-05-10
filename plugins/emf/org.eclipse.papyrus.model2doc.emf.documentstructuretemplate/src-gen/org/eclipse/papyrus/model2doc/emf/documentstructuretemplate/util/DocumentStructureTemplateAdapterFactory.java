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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.*;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceListView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage
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
		public Adapter caseDocumentTemplatePrototype(DocumentTemplatePrototype object) {
			return createDocumentTemplatePrototypeAdapter();
		}

		@Override
		public Adapter caseTextDocumentTemplate(TextDocumentTemplate object) {
			return createTextDocumentTemplateAdapter();
		}

		@Override
		public Adapter caseDocumentPart(DocumentPart object) {
			return createDocumentPartAdapter();
		}

		@Override
		public Adapter caseTableOfContents(TableOfContents object) {
			return createTableOfContentsAdapter();
		}

		@Override
		public Adapter caseBody(Body object) {
			return createBodyAdapter();
		}

		@Override
		public Adapter caseIBodyPartTemplate(IBodyPartTemplate object) {
			return createIBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseIBodySectionPartTemplate(IBodySectionPartTemplate object) {
			return createIBodySectionPartTemplateAdapter();
		}

		@Override
		public Adapter caseIComposedBodyPartTemplate(IComposedBodyPartTemplate object) {
			return createIComposedBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseISubBodyPartTemplate(ISubBodyPartTemplate object) {
			return createISubBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseILeafBodyPartTemplate(ILeafBodyPartTemplate object) {
			return createILeafBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseIComposedSubBodyPartTemplate(IComposedSubBodyPartTemplate object) {
			return createIComposedSubBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseILeafSubBodyPartTemplate(ILeafSubBodyPartTemplate object) {
			return createILeafSubBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseEClassPartTemplate(EClassPartTemplate object) {
			return createEClassPartTemplateAdapter();
		}

		@Override
		public Adapter caseEReferencePartTemplate(EReferencePartTemplate object) {
			return createEReferencePartTemplateAdapter();
		}

		@Override
		public Adapter caseITemplatePartView(ITemplatePartView object) {
			return createITemplatePartViewAdapter();
		}

		@Override
		public Adapter caseEReferenceListView(EReferenceListView object) {
			return createEReferenceListViewAdapter();
		}

		@Override
		public Adapter caseITableView(ITableView object) {
			return createITableViewAdapter();
		}

		@Override
		public Adapter caseIColumn(IColumn object) {
			return createIColumnAdapter();
		}

		@Override
		public Adapter caseEReferenceTableView(EReferenceTableView object) {
			return createEReferenceTableViewAdapter();
		}

		@Override
		public Adapter caseEStructuralFeatureColumn(EStructuralFeatureColumn object) {
			return createEStructuralFeatureColumnAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate <em>Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate
	 * @generated
	 */
	public Adapter createDocumentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype <em>Document Template Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplatePrototype
	 * @generated
	 */
	public Adapter createDocumentTemplatePrototypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate <em>Text Document Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TextDocumentTemplate
	 * @generated
	 */
	public Adapter createTextDocumentTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart <em>Document Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentPart
	 * @generated
	 */
	public Adapter createDocumentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents <em>Table Of Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TableOfContents
	 * @generated
	 */
	public Adapter createTableOfContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate <em>IBody Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate
	 * @generated
	 */
	public Adapter createIBodyPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate <em>IBody Section Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate
	 * @generated
	 */
	public Adapter createIBodySectionPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate <em>IComposed Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate
	 * @generated
	 */
	public Adapter createIComposedBodyPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate <em>ISub Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate
	 * @generated
	 */
	public Adapter createISubBodyPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate <em>ILeaf Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate
	 * @generated
	 */
	public Adapter createILeafBodyPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate <em>IComposed Sub Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate
	 * @generated
	 */
	public Adapter createIComposedSubBodyPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate <em>ILeaf Sub Body Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafSubBodyPartTemplate
	 * @generated
	 */
	public Adapter createILeafSubBodyPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate <em>EClass Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate
	 * @generated
	 */
	public Adapter createEClassPartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate <em>EReference Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate
	 * @generated
	 */
	public Adapter createEReferencePartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView <em>ITemplate Part View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView
	 * @generated
	 */
	public Adapter createITemplatePartViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceListView <em>EReference List View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceListView
	 * @generated
	 */
	public Adapter createEReferenceListViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView <em>ITable View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView
	 * @generated
	 */
	public Adapter createITableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn <em>IColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn
	 * @generated
	 */
	public Adapter createIColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView <em>EReference Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView
	 * @generated
	 */
	public Adapter createEReferenceTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn <em>EStructural Feature Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn
	 * @generated
	 */
	public Adapter createEStructuralFeatureColumnAdapter() {
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
