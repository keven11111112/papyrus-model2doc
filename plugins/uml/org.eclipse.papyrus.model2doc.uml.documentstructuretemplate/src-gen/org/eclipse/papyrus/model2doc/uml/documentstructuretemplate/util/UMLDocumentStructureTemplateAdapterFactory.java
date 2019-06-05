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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IRootListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.*;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage
 * @generated
 */
public class UMLDocumentStructureTemplateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static UMLDocumentStructureTemplatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UMLDocumentStructureTemplateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UMLDocumentStructureTemplatePackage.eINSTANCE;
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
	protected UMLDocumentStructureTemplateSwitch<Adapter> modelSwitch = new UMLDocumentStructureTemplateSwitch<Adapter>() {
		@Override
		public Adapter caseStereotypePartTemplate(StereotypePartTemplate object) {
			return createStereotypePartTemplateAdapter();
		}

		@Override
		public Adapter caseMandatoryStereotypeWithEClassTemplate(MandatoryStereotypeWithEClassTemplate object) {
			return createMandatoryStereotypeWithEClassTemplateAdapter();
		}

		@Override
		public Adapter caseMandatoryStereotypeTemplate(MandatoryStereotypeTemplate object) {
			return createMandatoryStereotypeTemplateAdapter();
		}

		@Override
		public Adapter caseStereotypeTemplate(StereotypeTemplate object) {
			return createStereotypeTemplateAdapter();
		}

		@Override
		public Adapter caseIUMLBodyPartTemplateTitle(IUMLBodyPartTemplateTitle object) {
			return createIUMLBodyPartTemplateTitleAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyReferencePartTemplate(StereotypePropertyReferencePartTemplate object) {
			return createStereotypePropertyReferencePartTemplateAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyTemplate(StereotypePropertyTemplate object) {
			return createStereotypePropertyTemplateAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyReference(StereotypePropertyReference object) {
			return createStereotypePropertyReferenceAdapter();
		}

		@Override
		public Adapter caseCommentAsParagraph(CommentAsParagraph object) {
			return createCommentAsParagraphAdapter();
		}

		@Override
		public Adapter caseComment(Comment object) {
			return createCommentAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyColumn(StereotypePropertyColumn object) {
			return createStereotypePropertyColumnAdapter();
		}

		@Override
		public Adapter caseMandatoryStereotypePropertyTemplate(MandatoryStereotypePropertyTemplate object) {
			return createMandatoryStereotypePropertyTemplateAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyReferenceTableView(StereotypePropertyReferenceTableView object) {
			return createStereotypePropertyReferenceTableViewAdapter();
		}

		@Override
		public Adapter caseStereotypeListItemTemplate(StereotypeListItemTemplate object) {
			return createStereotypeListItemTemplateAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyReferenceListItem(StereotypePropertyReferenceListItem object) {
			return createStereotypePropertyReferenceListItemAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyListItemTemplate(StereotypePropertyListItemTemplate object) {
			return createStereotypePropertyListItemTemplateAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyAttributeListItem(StereotypePropertyAttributeListItem object) {
			return createStereotypePropertyAttributeListItemAdapter();
		}

		@Override
		public Adapter caseStereotypePropertyAttribute(StereotypePropertyAttribute object) {
			return createStereotypePropertyAttributeAdapter();
		}

		@Override
		public Adapter caseEClassTemplate(EClassTemplate object) {
			return createEClassTemplateAdapter();
		}

		@Override
		public Adapter caseIBodySectionPartTemplate(IBodySectionPartTemplate object) {
			return createIBodySectionPartTemplateAdapter();
		}

		@Override
		public Adapter caseISubBodyPartTemplate(ISubBodyPartTemplate object) {
			return createISubBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseIComposedSubBodyPartTemplate(IComposedSubBodyPartTemplate object) {
			return createIComposedSubBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseIBodyPartTemplate(IBodyPartTemplate object) {
			return createIBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseIComposedBodyPartTemplate(IComposedBodyPartTemplate object) {
			return createIComposedBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseILeafBodyPartTemplate(ILeafBodyPartTemplate object) {
			return createILeafBodyPartTemplateAdapter();
		}

		@Override
		public Adapter caseITemplatePartView(ITemplatePartView object) {
			return createITemplatePartViewAdapter();
		}

		@Override
		public Adapter caseIColumn(IColumn object) {
			return createIColumnAdapter();
		}

		@Override
		public Adapter caseITableView(ITableView object) {
			return createITableViewAdapter();
		}

		@Override
		public Adapter caseIListItemTemplate(IListItemTemplate object) {
			return createIListItemTemplateAdapter();
		}

		@Override
		public Adapter caseISubListItemTemplate(ISubListItemTemplate object) {
			return createISubListItemTemplateAdapter();
		}

		@Override
		public Adapter caseIComposedSubListItemTemplate(IComposedSubListItemTemplate object) {
			return createIComposedSubListItemTemplateAdapter();
		}

		@Override
		public Adapter caseIRootListItemTemplate(IRootListItemTemplate object) {
			return createIRootListItemTemplateAdapter();
		}

		@Override
		public Adapter caseIComposedListItemTemplate(IComposedListItemTemplate object) {
			return createIComposedListItemTemplateAdapter();
		}

		@Override
		public Adapter caseILeafListItemTemplate(ILeafListItemTemplate object) {
			return createILeafListItemTemplateAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate <em>Stereotype Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePartTemplate
	 * @generated
	 */
	public Adapter createStereotypePartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeWithEClassTemplate <em>Mandatory Stereotype With EClass Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeWithEClassTemplate
	 * @generated
	 */
	public Adapter createMandatoryStereotypeWithEClassTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeTemplate <em>Mandatory Stereotype Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypeTemplate
	 * @generated
	 */
	public Adapter createMandatoryStereotypeTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate <em>Stereotype Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeTemplate
	 * @generated
	 */
	public Adapter createStereotypeTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle <em>IUML Body Part Template Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.IUMLBodyPartTemplateTitle
	 * @generated
	 */
	public Adapter createIUMLBodyPartTemplateTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate <em>Stereotype Property Reference Part Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferencePartTemplate
	 * @generated
	 */
	public Adapter createStereotypePropertyReferencePartTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate <em>Stereotype Property Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyTemplate
	 * @generated
	 */
	public Adapter createStereotypePropertyTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph <em>Comment As Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph
	 * @generated
	 */
	public Adapter createCommentAsParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn <em>Stereotype Property Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyColumn
	 * @generated
	 */
	public Adapter createStereotypePropertyColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePropertyTemplate <em>Mandatory Stereotype Property Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.MandatoryStereotypePropertyTemplate
	 * @generated
	 */
	public Adapter createMandatoryStereotypePropertyTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView <em>Stereotype Property Reference Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceTableView
	 * @generated
	 */
	public Adapter createStereotypePropertyReferenceTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference <em>Stereotype Property Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReference
	 * @generated
	 */
	public Adapter createStereotypePropertyReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate <em>Stereotype List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypeListItemTemplate
	 * @generated
	 */
	public Adapter createStereotypeListItemTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceListItem <em>Stereotype Property Reference List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyReferenceListItem
	 * @generated
	 */
	public Adapter createStereotypePropertyReferenceListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyListItemTemplate <em>Stereotype Property List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyListItemTemplate
	 * @generated
	 */
	public Adapter createStereotypePropertyListItemTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeListItem <em>Stereotype Property Attribute List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttributeListItem
	 * @generated
	 */
	public Adapter createStereotypePropertyAttributeListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute <em>Stereotype Property Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.StereotypePropertyAttribute
	 * @generated
	 */
	public Adapter createStereotypePropertyAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate <em>EClass Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassTemplate
	 * @generated
	 */
	public Adapter createEClassTemplateAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate <em>IList Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate
	 * @generated
	 */
	public Adapter createIListItemTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubListItemTemplate <em>ISub List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ISubListItemTemplate
	 * @generated
	 */
	public Adapter createISubListItemTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubListItemTemplate <em>IComposed Sub List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubListItemTemplate
	 * @generated
	 */
	public Adapter createIComposedSubListItemTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IRootListItemTemplate <em>IRoot List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IRootListItemTemplate
	 * @generated
	 */
	public Adapter createIRootListItemTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedListItemTemplate <em>IComposed List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedListItemTemplate
	 * @generated
	 */
	public Adapter createIComposedListItemTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafListItemTemplate <em>ILeaf List Item Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafListItemTemplate
	 * @generated
	 */
	public Adapter createILeafListItemTemplateAdapter() {
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

} // UMLDocumentStructureTemplateAdapterFactory
