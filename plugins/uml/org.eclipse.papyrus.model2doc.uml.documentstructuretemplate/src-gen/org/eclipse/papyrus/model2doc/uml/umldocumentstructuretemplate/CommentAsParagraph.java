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
package org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ILeafBodyPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.ITemplatePartView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment As Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PartTemplate used to create paragraphs from UML Comments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentAsParagraph#getCommentChoice <em>Comment Choice</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.UMLDocumentStructureTemplatePackage#getCommentAsParagraph()
 * @model
 * @generated
 */
public interface CommentAsParagraph extends ILeafBodyPartTemplate, ITemplatePartView {
	/**
	 * Returns the value of the '<em><b>Comment Choice</b></em>' attribute.
	 * The default value is <code>"FIRST_OWNED_COMMENT"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allow to define if we use only the first owned comments or all owned comment.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Comment Choice</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice
	 * @see #setCommentChoice(CommentChoice)
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.UMLDocumentStructureTemplatePackage#getCommentAsParagraph_CommentChoice()
	 * @model default="FIRST_OWNED_COMMENT" required="true" ordered="false"
	 * @generated
	 */
	CommentChoice getCommentChoice();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentAsParagraph#getCommentChoice <em>Comment Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *                  the new value of the '<em>Comment Choice</em>' attribute.
	 * @see org.eclipse.papyrus.model2doc.uml.umldocumentstructuretemplate.CommentChoice
	 * @see #getCommentChoice()
	 * @generated
	 */
	void setCommentChoice(CommentChoice value);

} // CommentAsParagraph
