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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.*;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 *
 * @see org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.UMLDocumentStructureTemplatePackage
 * @generated
 */
public class UMLDocumentStructureTemplateValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final UMLDocumentStructureTemplateValidator INSTANCE = new UMLDocumentStructureTemplateValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.papyrus.model2doc.uml.documentstructuretemplate"; //$NON-NLS-1$

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public UMLDocumentStructureTemplateValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return UMLDocumentStructureTemplatePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PART_TEMPLATE:
			return validateStereotypePartTemplate((StereotypePartTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.MANDATORY_STEREOTYPE_WITH_ECLASS_TEMPLATE:
			return validateMandatoryStereotypeWithEClassTemplate((MandatoryStereotypeWithEClassTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.MANDATORY_STEREOTYPE_TEMPLATE:
			return validateMandatoryStereotypeTemplate((MandatoryStereotypeTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_TEMPLATE:
			return validateStereotypeTemplate((StereotypeTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.IUML_BODY_PART_TEMPLATE_TITLE:
			return validateIUMLBodyPartTemplateTitle((IUMLBodyPartTemplateTitle) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_PART_TEMPLATE:
			return validateStereotypePropertyReferencePartTemplate((StereotypePropertyReferencePartTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_TEMPLATE:
			return validateStereotypePropertyTemplate((StereotypePropertyTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE:
			return validateStereotypePropertyReference((StereotypePropertyReference) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.COMMENT_AS_PARAGRAPH:
			return validateCommentAsParagraph((CommentAsParagraph) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.COMMENT:
			return validateComment((Comment) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_COLUMN:
			return validateStereotypePropertyColumn((StereotypePropertyColumn) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.MANDATORY_STEREOTYPE_PROPERTY_TEMPLATE:
			return validateMandatoryStereotypePropertyTemplate((MandatoryStereotypePropertyTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_TABLE_VIEW:
			return validateStereotypePropertyReferenceTableView((StereotypePropertyReferenceTableView) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_LIST_ITEM_TEMPLATE:
			return validateStereotypeListItemTemplate((StereotypeListItemTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_REFERENCE_LIST_ITEM_TEMPLATE:
			return validateStereotypePropertyReferenceListItemTemplate((StereotypePropertyReferenceListItemTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_LIST_ITEM_TEMPLATE:
			return validateStereotypePropertyListItemTemplate((StereotypePropertyListItemTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_ATTRIBUTE_LIST_ITEM_TEMPLATE:
			return validateStereotypePropertyAttributeListItemTemplate((StereotypePropertyAttributeListItemTemplate) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_PROPERTY_ATTRIBUTE:
			return validateStereotypePropertyAttribute((StereotypePropertyAttribute) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.STEREOTYPE_FILTER_BEHAVIOR:
			return validateStereotypeFilterBehavior((StereotypeFilterBehavior) value, diagnostics, context);
		case UMLDocumentStructureTemplatePackage.COMMENT_CHOICE:
			return validateCommentChoice((CommentChoice) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePartTemplate(StereotypePartTemplate stereotypePartTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePartTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateMandatoryStereotypeWithEClassTemplate(MandatoryStereotypeWithEClassTemplate mandatoryStereotypeWithEClassTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mandatoryStereotypeWithEClassTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateMandatoryStereotypeTemplate(MandatoryStereotypeTemplate mandatoryStereotypeTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mandatoryStereotypeTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypeTemplate(StereotypeTemplate stereotypeTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypeTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateIUMLBodyPartTemplateTitle(IUMLBodyPartTemplateTitle iumlBodyPartTemplateTitle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iumlBodyPartTemplateTitle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyReferencePartTemplate(StereotypePropertyReferencePartTemplate stereotypePropertyReferencePartTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyReferencePartTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyTemplate(StereotypePropertyTemplate stereotypePropertyTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateCommentAsParagraph(CommentAsParagraph commentAsParagraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commentAsParagraph, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyColumn(StereotypePropertyColumn stereotypePropertyColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateMandatoryStereotypePropertyTemplate(MandatoryStereotypePropertyTemplate mandatoryStereotypePropertyTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mandatoryStereotypePropertyTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyReferenceTableView(StereotypePropertyReferenceTableView stereotypePropertyReferenceTableView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyReferenceTableView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyReference(StereotypePropertyReference stereotypePropertyReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypeListItemTemplate(StereotypeListItemTemplate stereotypeListItemTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypeListItemTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyReferenceListItemTemplate(StereotypePropertyReferenceListItemTemplate stereotypePropertyReferenceListItemTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyReferenceListItemTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyListItemTemplate(StereotypePropertyListItemTemplate stereotypePropertyListItemTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyListItemTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyAttributeListItemTemplate(StereotypePropertyAttributeListItemTemplate stereotypePropertyAttributeListItemTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyAttributeListItemTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypePropertyAttribute(StereotypePropertyAttribute stereotypePropertyAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stereotypePropertyAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateStereotypeFilterBehavior(StereotypeFilterBehavior stereotypeFilterBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateCommentChoice(CommentChoice commentChoice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private String getRedefinitionDetail(EClass eClass, String featureName, String key) {
		List<EClass> eClasses = new ArrayList<>();
		eClasses.add(eClass);
		eClasses.addAll(eClass.getEAllSuperTypes());
		String redefinitionDetail = null;
		for (Iterator<EClass> eClassesIterator = eClasses.iterator(); redefinitionDetail == null && eClassesIterator.hasNext();) {
			EAnnotation eAnnotation = eClassesIterator.next().getEAnnotation("duplicates"); //$NON-NLS-1$
			if (eAnnotation != null) {
				EAnnotation nestedEAnnotation = eAnnotation.getEAnnotation(featureName);
				if (nestedEAnnotation != null) {
					redefinitionDetail = nestedEAnnotation.getDetails().get(key);
				}
			}
		}
		return redefinitionDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected int getLowerBound(EObject eObject, EStructuralFeature eStructuralFeature) {
		String redefinitionDetail = getRedefinitionDetail(eObject.eClass(), eStructuralFeature.getName(), "lowerBound"); //$NON-NLS-1$
		if (redefinitionDetail != null && redefinitionDetail.length() > 0) {
			try {
				return Integer.parseInt(redefinitionDetail);
			} catch (Exception e) {
				// do nothing
			}
		}
		return eStructuralFeature.getLowerBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected int getUpperBound(EObject eObject, EStructuralFeature eStructuralFeature) {
		String redefinitionDetail = getRedefinitionDetail(eObject.eClass(), eStructuralFeature.getName(), "upperBound"); //$NON-NLS-1$
		if (redefinitionDetail != null && redefinitionDetail.length() > 0) {
			try {
				return Integer.parseInt(redefinitionDetail);
			} catch (Exception e) {
				// do nothing
			}
		}
		return eStructuralFeature.getUpperBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected boolean isEcoreString(String key) {
		return super.isEcoreString(key)
				|| "_UI_FeatureHasTooFewValues_diagnostic".equals(key) //$NON-NLS-1$
				|| "_UI_FeatureHasTooManyValues_diagnostic".equals(key) //$NON-NLS-1$
				|| "_UI_RequiredFeatureMustBeSet_diagnostic".equals(key); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected boolean validate_MultiplicityConforms(EObject eObject, EStructuralFeature eStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		if (eStructuralFeature.isMany()) {
			if (FeatureMapUtil.isFeatureMap(eStructuralFeature) && ExtendedMetaData.INSTANCE.isDocumentRoot(eObject.eClass())) {
				result = super.validate_MultiplicityConforms(eObject, eStructuralFeature, diagnostics, context);
			} else {
				int lowerBound = getLowerBound(eObject, eStructuralFeature);
				if (lowerBound > 0) {
					int size = ((List<?>) eObject.eGet(eStructuralFeature)).size();
					if (size < lowerBound) {
						result = false;
						if (diagnostics != null) {
							diagnostics.add(createDiagnostic(Diagnostic.ERROR,
									EObjectValidator.DIAGNOSTIC_SOURCE,
									EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
									"_UI_FeatureHasTooFewValues_diagnostic", //$NON-NLS-1$
									new Object[] {
											getFeatureLabel(eStructuralFeature, context),
											getObjectLabel(eObject, context),
											size,
											lowerBound
									},
									new Object[] { eObject, eStructuralFeature },
									context));
						}
					}
					int upperBound = getUpperBound(eObject, eStructuralFeature);
					if (upperBound > 0 && size > upperBound) {
						result = false;
						if (diagnostics != null) {
							diagnostics.add(createDiagnostic(Diagnostic.ERROR,
									EObjectValidator.DIAGNOSTIC_SOURCE,
									EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
									"_UI_FeatureHasTooManyValues_diagnostic", //$NON-NLS-1$
									new Object[] {
											getFeatureLabel(eStructuralFeature, context),
											getObjectLabel(eObject, context),
											size,
											upperBound
									},
									new Object[] { eObject, eStructuralFeature },
									context));
						}
					}
				} else {
					int upperBound = getUpperBound(eObject, eStructuralFeature);
					if (upperBound > 0) {
						int size = ((List<?>) eObject.eGet(eStructuralFeature)).size();
						if (size > upperBound) {
							result = false;
							if (diagnostics != null) {
								diagnostics.add(createDiagnostic(Diagnostic.ERROR,
										EObjectValidator.DIAGNOSTIC_SOURCE,
										EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
										"_UI_FeatureHasTooManyValues_diagnostic", //$NON-NLS-1$
										new Object[] {
												getFeatureLabel(eStructuralFeature, context),
												getObjectLabel(eObject, context),
												size,
												upperBound
										},
										new Object[] { eObject, eStructuralFeature },
										context));
							}
						}
					}
				}
			}
		} else if (getLowerBound(eObject, eStructuralFeature) >= 1) {
			if (eStructuralFeature.isUnsettable() ? !eObject.eIsSet(eStructuralFeature) : eObject.eGet(eStructuralFeature, false) == null) {
				result = false;
				if (diagnostics != null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR,
							EObjectValidator.DIAGNOSTIC_SOURCE,
							EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
							"_UI_RequiredFeatureMustBeSet_diagnostic", //$NON-NLS-1$
							new Object[] { getFeatureLabel(eStructuralFeature, context), getObjectLabel(eObject, context) },
							new Object[] { eObject, eStructuralFeature },
							context));
				}
			}
		}
		return result;
	}
} // UMLDocumentStructureTemplateValidator
