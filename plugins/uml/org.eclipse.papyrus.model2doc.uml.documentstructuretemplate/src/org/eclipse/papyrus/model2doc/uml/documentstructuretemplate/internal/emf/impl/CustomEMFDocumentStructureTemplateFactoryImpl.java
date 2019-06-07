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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.uml.documentstructuretemplate.internal.emf.impl;

import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EClassPartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferenceTableView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EStructuralFeatureColumn;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TreeListView;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl;

/**
 * Custom factory for {@link DocumentStructureTemplateFactoryImpl}.
 *
 * This factory has been created to allow to override the calculus of the label for UML element, in order to remove the <<Stereotype>> name of the label
 */
public class CustomEMFDocumentStructureTemplateFactoryImpl extends DocumentStructureTemplateFactoryImpl {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createEClassListItemTemplate()
	 *
	 * @return
	 */
	@Override
	public EClassListItemTemplate createEClassListItemTemplate() {
		return new CustomEClassListItemTemplateImpl();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createEClassPartTemplate()
	 *
	 * @return
	 */
	@Override
	public EClassPartTemplate createEClassPartTemplate() {
		return new CustomEClassPartTemplateImpl();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createEReferencePartTemplate()
	 *
	 * @return
	 */
	@Override
	public EReferencePartTemplate createEReferencePartTemplate() {
		return new CustomEReferencePartTemplateImpl();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createEReferenceTableView()
	 *
	 * @return
	 */
	@Override
	public EReferenceTableView createEReferenceTableView() {
		return new CustomEReferenceTableViewImpl();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createEStructuralFeatureColumn()
	 *
	 * @return
	 */
	@Override
	public EStructuralFeatureColumn createEStructuralFeatureColumn() {
		return new CustomEStructuralFeatureColumnImpl();
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.impl.DocumentStructureTemplateFactoryImpl#createTreeListView()
	 *
	 * @return
	 */
	@Override
	public TreeListView createTreeListView() {
		return new CustomTreeListViewImpl();
	}

}
