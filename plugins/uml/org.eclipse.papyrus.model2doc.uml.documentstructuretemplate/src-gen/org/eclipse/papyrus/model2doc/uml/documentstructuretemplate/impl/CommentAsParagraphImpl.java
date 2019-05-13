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
package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentAsParagraph;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.CommentChoice;
import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment As Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl#isGenerate <em>Generate</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl#isGenerateTitle <em>Generate Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl#getCustomTitle <em>Custom Title</em>}</li>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.impl.CommentAsParagraphImpl#getCommentChoice <em>Comment Choice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentAsParagraphImpl extends MinimalEObjectImpl.Container implements CommentAsParagraph {
	/**
	 * The default value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean generate = GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TITLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateTitle() <em>Generate Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isGenerateTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTitle = GENERATE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomTitle() <em>Custom Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCustomTitle()
	 * @generated
	 * @ordered
	 */
	protected String customTitle = CUSTOM_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommentChoice() <em>Comment Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCommentChoice()
	 * @generated
	 * @ordered
	 */
	protected static final CommentChoice COMMENT_CHOICE_EDEFAULT = CommentChoice.FIRST_OWNED_COMMENT;

	/**
	 * The cached value of the '{@link #getCommentChoice() <em>Comment Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getCommentChoice()
	 * @generated
	 * @ordered
	 */
	protected CommentChoice commentChoice = COMMENT_CHOICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected CommentAsParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLDocumentStructureTemplatePackage.Literals.COMMENT_AS_PARAGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerate() {
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerate(boolean newGenerate) {
		boolean oldGenerate = generate;
		generate = newGenerate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE, oldGenerate, generate));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isGenerateTitle() {
		return generateTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setGenerateTitle(boolean newGenerateTitle) {
		boolean oldGenerateTitle = generateTitle;
		generateTitle = newGenerateTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE_TITLE, oldGenerateTitle, generateTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCustomTitle() {
		return customTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCustomTitle(String newCustomTitle) {
		String oldCustomTitle = customTitle;
		customTitle = newCustomTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__CUSTOM_TITLE, oldCustomTitle, customTitle));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public CommentChoice getCommentChoice() {
		return commentChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCommentChoice(CommentChoice newCommentChoice) {
		CommentChoice oldCommentChoice = commentChoice;
		commentChoice = newCommentChoice == null ? COMMENT_CHOICE_EDEFAULT : newCommentChoice;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__COMMENT_CHOICE, oldCommentChoice, commentChoice));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String buildPartTemplateTitle(EObject context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Comment> getMatchingComments(EObject element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE:
			return isGenerate();
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE_TITLE:
			return isGenerateTitle();
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__CUSTOM_TITLE:
			return getCustomTitle();
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__COMMENT_CHOICE:
			return getCommentChoice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE:
			setGenerate((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE_TITLE:
			setGenerateTitle((Boolean) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__CUSTOM_TITLE:
			setCustomTitle((String) newValue);
			return;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__COMMENT_CHOICE:
			setCommentChoice((CommentChoice) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE:
			setGenerate(GENERATE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE_TITLE:
			setGenerateTitle(GENERATE_TITLE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__CUSTOM_TITLE:
			setCustomTitle(CUSTOM_TITLE_EDEFAULT);
			return;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__COMMENT_CHOICE:
			setCommentChoice(COMMENT_CHOICE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE:
			return generate != GENERATE_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__GENERATE_TITLE:
			return generateTitle != GENERATE_TITLE_EDEFAULT;
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__CUSTOM_TITLE:
			return CUSTOM_TITLE_EDEFAULT == null ? customTitle != null : !CUSTOM_TITLE_EDEFAULT.equals(customTitle);
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH__COMMENT_CHOICE:
			return commentChoice != COMMENT_CHOICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH___BUILD_PART_TEMPLATE_TITLE__EOBJECT:
			return buildPartTemplateTitle((EObject) arguments.get(0));
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH___GET_MATCHING_COMMENTS__EOBJECT:
			return getMatchingComments((EObject) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (generate: "); //$NON-NLS-1$
		result.append(generate);
		result.append(", generateTitle: "); //$NON-NLS-1$
		result.append(generateTitle);
		result.append(", customTitle: "); //$NON-NLS-1$
		result.append(customTitle);
		result.append(", commentChoice: "); //$NON-NLS-1$
		result.append(commentChoice);
		result.append(')');
		return result.toString();
	}

} // CommentAsParagraphImpl
