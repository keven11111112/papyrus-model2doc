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
package org.eclipse.papyrus.model2doc.emf.documentstructure.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractList;
import org.eclipse.papyrus.model2doc.core.builtintypes.AbstractTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.BasicList;
import org.eclipse.papyrus.model2doc.core.builtintypes.BasicTable;
import org.eclipse.papyrus.model2doc.core.builtintypes.Cell;
import org.eclipse.papyrus.model2doc.core.builtintypes.DefaultFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.IFileReference;
import org.eclipse.papyrus.model2doc.core.builtintypes.ListItem;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextCell;
import org.eclipse.papyrus.model2doc.core.builtintypes.TextListItem;
import org.eclipse.papyrus.model2doc.core.styles.StyledElement;
import org.eclipse.papyrus.model2doc.emf.documentstructure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.emf.documentstructure.DocumentStructurePackage
 * @generated
 */
public class DocumentStructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static DocumentStructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentStructureSwitch() {
		if (modelPackage == null) {
			modelPackage = DocumentStructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param ePackage
	 *                     the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DocumentStructurePackage.TEXT_DOCUMENT: {
			TextDocument textDocument = (TextDocument) theEObject;
			T result = caseTextDocument(textDocument);
			if (result == null) {
				result = caseDocument(textDocument);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.TEXT_DOCUMENT_PART: {
			TextDocumentPart textDocumentPart = (TextDocumentPart) theEObject;
			T result = caseTextDocumentPart(textDocumentPart);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.DOCUMENT: {
			Document document = (Document) theEObject;
			T result = caseDocument(document);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.VERSION: {
			Version version = (Version) theEObject;
			T result = caseVersion(version);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.BODY: {
			Body body = (Body) theEObject;
			T result = caseBody(body);
			if (result == null) {
				result = caseTextDocumentPart(body);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.BODY_PART: {
			BodyPart bodyPart = (BodyPart) theEObject;
			T result = caseBodyPart(bodyPart);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.DATA_SOURCE: {
			DataSource dataSource = (DataSource) theEObject;
			T result = caseDataSource(dataSource);
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.PARAGRAPH: {
			Paragraph paragraph = (Paragraph) theEObject;
			T result = caseParagraph(paragraph);
			if (result == null) {
				result = caseComposedBodyPart(paragraph);
			}
			if (result == null) {
				result = caseBodyPart(paragraph);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.COMPOSED_BODY_PART: {
			ComposedBodyPart composedBodyPart = (ComposedBodyPart) theEObject;
			T result = caseComposedBodyPart(composedBodyPart);
			if (result == null) {
				result = caseBodyPart(composedBodyPart);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.TITLE: {
			Title title = (Title) theEObject;
			T result = caseTitle(title);
			if (result == null) {
				result = caseComposedBodyPart(title);
			}
			if (result == null) {
				result = caseBodyPart(title);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null) {
				result = caseLeafBodyPart(image);
			}
			if (result == null) {
				result = caseBodyPart(image);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.LEAF_BODY_PART: {
			LeafBodyPart leafBodyPart = (LeafBodyPart) theEObject;
			T result = caseLeafBodyPart(leafBodyPart);
			if (result == null) {
				result = caseBodyPart(leafBodyPart);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.EMF_DATA_SOURCE: {
			EMFDataSource emfDataSource = (EMFDataSource) theEObject;
			T result = caseEMFDataSource(emfDataSource);
			if (result == null) {
				result = caseDataSource(emfDataSource);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.TABLE_OF_FIGURES: {
			TableOfFigures tableOfFigures = (TableOfFigures) theEObject;
			T result = caseTableOfFigures(tableOfFigures);
			if (result == null) {
				result = caseTextDocumentPart(tableOfFigures);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.TABLE_OF_CONTENTS: {
			TableOfContents tableOfContents = (TableOfContents) theEObject;
			T result = caseTableOfContents(tableOfContents);
			if (result == null) {
				result = caseTextDocumentPart(tableOfContents);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.EXTENDED_BASIC_TABLE: {
			ExtendedBasicTable extendedBasicTable = (ExtendedBasicTable) theEObject;
			T result = caseExtendedBasicTable(extendedBasicTable);
			if (result == null) {
				result = caseBasicTable(extendedBasicTable);
			}
			if (result == null) {
				result = caseLeafBodyPart(extendedBasicTable);
			}
			if (result == null) {
				result = caseAbstractTable(extendedBasicTable);
			}
			if (result == null) {
				result = caseBodyPart(extendedBasicTable);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.EXTENDED_TEXT_CELL: {
			ExtendedTextCell extendedTextCell = (ExtendedTextCell) theEObject;
			T result = caseExtendedTextCell(extendedTextCell);
			if (result == null) {
				result = caseTextCell(extendedTextCell);
			}
			if (result == null) {
				result = caseCell(extendedTextCell);
			}
			if (result == null) {
				result = caseStyledElement(extendedTextCell);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.EXTENDED_BASIC_LIST: {
			ExtendedBasicList extendedBasicList = (ExtendedBasicList) theEObject;
			T result = caseExtendedBasicList(extendedBasicList);
			if (result == null) {
				result = caseBasicList(extendedBasicList);
			}
			if (result == null) {
				result = caseLeafBodyPart(extendedBasicList);
			}
			if (result == null) {
				result = caseAbstractList(extendedBasicList);
			}
			if (result == null) {
				result = caseBodyPart(extendedBasicList);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.EXTENDED_TEXT_LIST_ITEM: {
			ExtendedTextListItem extendedTextListItem = (ExtendedTextListItem) theEObject;
			T result = caseExtendedTextListItem(extendedTextListItem);
			if (result == null) {
				result = caseTextListItem(extendedTextListItem);
			}
			if (result == null) {
				result = caseListItem(extendedTextListItem);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.STRING_VERSION: {
			StringVersion stringVersion = (StringVersion) theEObject;
			T result = caseStringVersion(stringVersion);
			if (result == null) {
				result = caseVersion(stringVersion);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.INSERTED_FILE: {
			InsertedFile insertedFile = (InsertedFile) theEObject;
			T result = caseInsertedFile(insertedFile);
			if (result == null) {
				result = caseDefaultFileReference(insertedFile);
			}
			if (result == null) {
				result = caseLeafBodyPart(insertedFile);
			}
			if (result == null) {
				result = caseIFileReference(insertedFile);
			}
			if (result == null) {
				result = caseBodyPart(insertedFile);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		case DocumentStructurePackage.NEW_LINE: {
			EmptyLine emptyLine = (EmptyLine) theEObject;
			T result = caseEmptyLine(emptyLine);
			if (result == null) {
				result = caseLeafBodyPart(emptyLine);
			}
			if (result == null) {
				result = caseBodyPart(emptyLine);
			}
			if (result == null) {
				result = defaultCase(theEObject);
			}
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDocument(TextDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Document Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Document Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextDocumentPart(TextDocumentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyPart(BodyPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Body Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Body Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedBodyPart(ComposedBodyPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Body Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Body Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafBodyPart(LeafBodyPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFDataSource(EMFDataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Figures</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Figures</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfFigures(TableOfFigures object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Of Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableOfContents(TableOfContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Basic Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Basic Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedBasicTable(ExtendedBasicTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Text Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Text Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedTextCell(ExtendedTextCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Basic List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Basic List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedBasicList(ExtendedBasicList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Text List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Text List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedTextListItem(ExtendedTextListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVersion(StringVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inserted File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inserted File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertedFile(InsertedFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyLine(EmptyLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTable(AbstractTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicTable(BasicTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Styled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyledElement(StyledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextCell(TextCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractList(AbstractList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicList(BasicList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextListItem(TextListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFile Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFile Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFileReference(IFileReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default File Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultFileReference(DefaultFileReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 *
	 * @param object
	 *                   the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // DocumentStructureSwitch
