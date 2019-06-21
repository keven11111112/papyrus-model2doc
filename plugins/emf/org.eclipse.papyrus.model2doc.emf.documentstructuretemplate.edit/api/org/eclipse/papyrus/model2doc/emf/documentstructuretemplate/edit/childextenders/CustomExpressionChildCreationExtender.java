/*****************************************************************************
 * Copyright (c) 2019 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.childextenders;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.BooleanExpressionsFactory;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.BooleanExpressionsPackage;
import org.eclipse.papyrus.infra.emf.expressions.booleanexpressions.NotExpression;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.provider.DocumentStructureTemplateEditPlugin;


/**
 * This child extender is used to be able to get UML Expression command creation.
 * Without this class, we only get EMF Expression
 */
public class CustomExpressionChildCreationExtender implements IChildCreationExtender {

	/**
	 *
	 * Constructor.
	 *
	 */
	public CustomExpressionChildCreationExtender() {
		// nothing to do
	}

	/**
	 *
	 * @see org.eclipse.emf.edit.provider.IChildCreationExtender#getNewChildDescriptors(java.lang.Object, org.eclipse.emf.edit.domain.EditingDomain)
	 *
	 * @param object
	 * @param editingDomain
	 * @return
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		if (isProvidingChildrenFor(object)) {
			// A dummy expression allowing to get the possible children expression
			NotExpression dummyNotExpression = BooleanExpressionsFactory.eINSTANCE.createNotExpression();
			Collection<?> result = editingDomain.getNewChildDescriptors(dummyNotExpression, null);
			final Collection<CommandParameter> childDescriptors = new ArrayList<>();
			for (final Object current : result) {
				if (current instanceof CommandParameter) {
					final CommandParameter cmd = (CommandParameter) current;
					final EObject value = cmd.getEValue();
					if (null != value) {
						final EPackage ePackage = value.eClass().getEPackage();

						// by default, the children descriptor provides from the "root" metamodel (Expression) are found and not them from UML Expression
						// so we remove the expressions coming from the EMF Expression metamodel
						if (ePackage != BooleanExpressionsPackage.eINSTANCE) {
							// && ePackage != UMLDocumentStructureTemplatePackage.eINSTANCE) {
							childDescriptors.add(cmd);
						}
						// we set the final feature
						cmd.feature = DocumentStructureTemplatePackage.eINSTANCE.getIBodySectionPartTemplate_GenerateBranchCondition();
					}
				}
			}
			dummyNotExpression = null;
			return childDescriptors;
		}

		return Collections.emptyList();
	}


	private boolean isProvidingChildrenFor(final Object eobject) {
		if (eobject instanceof IBodySectionPartTemplate) {
			return ((EObject) eobject).eClass().getEPackage() == getManagedEPackage();
		}
		return false;
	}

	/**
	 *
	 * @return
	 *         the EPackage for which we provide children to its EClass
	 */
	protected EPackage getManagedEPackage() {
		return DocumentStructureTemplatePackage.eINSTANCE;
	}

	/**
	 *
	 * @see org.eclipse.emf.edit.provider.IChildCreationExtender#getResourceLocator()
	 *
	 * @return
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DocumentStructureTemplateEditPlugin.INSTANCE;
	}

}
