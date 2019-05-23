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
 * 	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.template2structure.internal.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructure.BodyPart;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedBasicList;
import org.eclipse.papyrus.model2doc.emf.documentstructure.ExtendedTextListItem;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Title;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IComposedSubListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.IRootListItemTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.TreeListView;
import org.eclipse.papyrus.model2doc.emf.template2structure.Activator;
import org.eclipse.papyrus.model2doc.emf.template2structure.mapping.IMappingService;

/**
 * This class ensures the transformation of the {@link TreeListView} into a {@link BodyPart}
 */
public class TreeListViewMapper extends AbstractEMFTemplateToStructureMapper<TreeListView> {

	/**
	 * Constructor.
	 *
	 * @param inputEClass
	 * @param outputEClass
	 */
	public TreeListViewMapper() {
		super(TEMPLATE_EPACKAGE.getTreeListView(), BodyPart.class);
	}

	/**
	 * @param mappingService
	 * @param semanticModelElement
	 * @param treeListView
	 * @see org.eclipse.papyrus.model2doc.emf.template2structure.mapping.service.AbtractTemplateToStructureMapper#doMap(IMappingService, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, Class<T>)
	 *
	 * @return
	 */
	@Override
	protected <T> List<T> doMap(final IMappingService mappingService, final TreeListView treeListView, final EObject semanticModelElement, final Class<T> expectedReturnedClass) {
		List<T> returnedElements = new ArrayList<>();


		final Iterator<IRootListItemTemplate> itemIterator = treeListView.getRootListItemTemplates().iterator();
		final List<ExtendedTextListItem> createdListItems = new ArrayList<>();
		while (itemIterator.hasNext()) {
			final IRootListItemTemplate current = itemIterator.next();
			createdListItems.addAll(createListItems(current, semanticModelElement));
		}


		if (createdListItems.isEmpty()) {
			return null;
		}
		Title title = null;
		if (treeListView.isGenerate()) {
			if (treeListView.isGenerateTitle()) {
				title = STRUCTURE_EFACTORY.createTitle();
				title.setTitle(treeListView.buildPartTemplateTitle(semanticModelElement));
				returnedElements.add(expectedReturnedClass.cast(title));
			}
		}
		STRUCTURE_EFACTORY.createExtendedBasicList();
		final ExtendedBasicList list = STRUCTURE_EFACTORY.createExtendedBasicList();
		list.getItems().addAll(createdListItems);
		if (null != title) {
			title.getSubBodyParts().add(list);
		} else {
			returnedElements.add(expectedReturnedClass.cast(list));
		}
		return returnedElements;
	}

	/**
	 *
	 * @param itemTemplate
	 *            an {@link IListItemTemplate}
	 * @param semanticModelElement
	 *            the semantic element
	 * @return
	 *         the list of the created {@link ExtendedTextListItem}
	 */
	private List<ExtendedTextListItem> createListItems(final IListItemTemplate itemTemplate, final EObject semanticModelElement) {
		final List<ExtendedTextListItem> createdItems = new ArrayList<>();
		final List<Object> semanticItems = itemTemplate.getItems(semanticModelElement);
		final Iterator<Object> semanticItemsIterator = semanticItems.iterator();
		while (semanticItemsIterator.hasNext()) {
			final Object currentSemanticItem = semanticItemsIterator.next();
			ExtendedTextListItem textItem = null;
			if (itemTemplate.isGenerateItem()) {
				textItem = STRUCTURE_EFACTORY.createExtendedTextListItem();
				createdItems.add(textItem);
				textItem.setText(itemTemplate.buildItemLabel(currentSemanticItem));
			}

			if (currentSemanticItem instanceof EObject) {
				final Collection<? extends IListItemTemplate> subTemplates;
				if (itemTemplate instanceof IComposedListItemTemplate) {
					subTemplates = ((IComposedListItemTemplate) itemTemplate).getSubListItemTemplates();
				} else if (itemTemplate instanceof IComposedSubListItemTemplate) {
					subTemplates = ((IComposedSubListItemTemplate) itemTemplate).getListItemTemplates();
				} else {
					Activator.log.warn(NLS.bind("The item type {0} is not managed by {1}.", itemTemplate.eClass().getName(), getClass().getSimpleName())); //$NON-NLS-1$
					subTemplates = Collections.emptyList();
				}

				final Iterator<? extends IListItemTemplate> subTemplateIter = subTemplates.iterator();
				while (subTemplateIter.hasNext()) {
					final IListItemTemplate subListItem = subTemplateIter.next();
					final List<ExtendedTextListItem> createdSubItem = createListItems(subListItem, (EObject) currentSemanticItem);
					if (null != textItem) {
						textItem.getSubItems().addAll(createdSubItem);
					} else {
						createdItems.addAll(createdSubItem);
					}
				}
			}
		}



		return createdItems;
	}

}
