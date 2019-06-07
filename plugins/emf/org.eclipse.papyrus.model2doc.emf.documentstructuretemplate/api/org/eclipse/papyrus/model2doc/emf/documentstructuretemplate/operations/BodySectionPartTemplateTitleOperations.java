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
 * 	 Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.operations;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IBodySectionPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TreeListView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.providers.DelegatingToEMFLabelProvider;

/**
 * This class provides the method to build the title for {@link IBodySectionPartTemplate}
 * This class must be extended to manage new PartTemplate element, or override the provided title
 */
public class BodySectionPartTemplateTitleOperations {

	/**
	 * Singleton of this class
	 */
	public static final BodySectionPartTemplateTitleOperations INSTANCE = new BodySectionPartTemplateTitleOperations();

	/**
	 *
	 * Constructor.
	 * protected to allow to extend this class if required
	 */
	protected BodySectionPartTemplateTitleOperations() {
		// nothing to do
	}

	/**
	 *
	 * @param partTemplate
	 *            a part template
	 * @param parameter
	 *            a parameter to use to build the title. This parameter can be <code>null</code>
	 * @return
	 *         the built title, if the method {@link IBodySectionPartTemplate#isGenerateTitle()} returns <code>true</code>
	 */
	public final String buildPartTemplateTitle(final IBodySectionPartTemplate partTemplate, final EObject parameter) {
		if (false == partTemplate.isGenerateTitle()) {
			return null;
		}
		final String customTitle = partTemplate.getCustomTitle();
		if (null != customTitle && false == customTitle.isEmpty()) {
			return customTitle;
		}
		return internalBuildPartTemplateTitle(partTemplate, parameter);
	}

	/**
	 *
	 * @param partTemplate
	 *            a part template
	 * @param parameter
	 *            a parameter to use to build the title. This parameter can be <code>null</code>
	 *
	 * @return
	 *         the built title for the part template or an empty string if the {@link IBodySectionPartTemplate} is not managed
	 */
	protected String internalBuildPartTemplateTitle(final IBodySectionPartTemplate partTemplate, final EObject parameter) {
		if (partTemplate instanceof EReferencePartTemplate) {
			return buildEReferencePartTemplateTitle((EReferencePartTemplate) partTemplate, null);
		}
		if (partTemplate instanceof EClassPartTemplate) {
			return buildEClassPartTemplateTitle((EClassPartTemplate) partTemplate, parameter);
		}
		if (partTemplate instanceof EReferenceTableView) {
			return buildEReferenceTableViewTitle((EReferenceTableView) partTemplate, null);
		}
		if (partTemplate instanceof TreeListView) {
			return buildTreeListViewTitle((TreeListView) partTemplate, parameter);
		}
		return ""; //$NON-NLS-1$
	}


	/**
	 * @param partTemplate
	 * @param object
	 * @return
	 */
	private String buildTreeListViewTitle(final TreeListView partTemplate, final EObject object) {
		final String contextLabel = DelegatingToEMFLabelProvider.INSTANCE.getText(object);
		return NLS.bind("A List of sub elements for {0}", contextLabel); //$NON-NLS-1$
	}

	/**
	 *
	 * @param partTemplate
	 *            an {@link EReferencePartTemplate}
	 * @param parameter
	 *            a parameter to use to build the title. This parameter can be <code>null</code>
	 * @return
	 *         the built title for the EReferencePartTemplate or a default value if the EReference is <code>null</code>
	 *
	 *
	 */
	protected final String buildEReferencePartTemplateTitle(final EReferencePartTemplate partTemplate, final EObject parameter) {
		if (null != partTemplate.getEReference()) {
			return partTemplate.getEReference().getName();
		}
		return "No EReference"; //$NON-NLS-1$
	}

	/**
	 *
	 * @param partTemplate
	 *            an {@link EReferenceTableView}
	 * @param parameter
	 *            a parameter to use to build the title. This parameter can be <code>null</code>
	 *
	 * @return
	 *         the built title for the EReferenceTableView or a default value if the EReference is <code>null</code>
	 *
	 *
	 */
	protected final String buildEReferenceTableViewTitle(final EReferenceTableView partTemplate, final EObject parameter) {
		if (null != partTemplate.getEReference()) {
			return partTemplate.getEReference().getName();
		}
		return "No EReference"; //$NON-NLS-1$
	}

	/**
	 *
	 * @param partTemplate
	 *            an {@link EClassPartTemplate}
	 * @param parameter
	 *            a parameter to use to build the title. This parameter can be <code>null</code>
	 *
	 * @return
	 *         the built title for the EReferencePartTemplate or a default value if the {@link EClass} is <code>null</code>
	 *
	 */
	protected final String buildEClassPartTemplateTitle(final EClassPartTemplate eClassPartTemplate, final EObject parameter) {
		final EClass eClass = eClassPartTemplate.getEClass();
		if (null != parameter) {
			return getLabel(parameter);
		}
		if (null == parameter && eClass != null) {
			return eClass.getName();
		}
		return "No EClass"; //$NON-NLS-1$
	}


	/**
	 * This method can be overridden to change the label to return
	 *
	 * @param eobject
	 *            an EObject
	 * @return
	 *         the label to use for this EObject
	 */
	protected String getLabel(final EObject eobject) {
		return DelegatingToEMFLabelProvider.INSTANCE.getText(eobject);
	}


}
