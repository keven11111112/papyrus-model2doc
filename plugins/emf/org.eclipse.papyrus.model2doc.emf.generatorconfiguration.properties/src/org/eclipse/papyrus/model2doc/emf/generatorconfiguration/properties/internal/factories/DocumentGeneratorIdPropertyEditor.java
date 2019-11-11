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
package org.eclipse.papyrus.model2doc.emf.generatorconfiguration.properties.internal.factories;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.EMFEditUIPropertyEditorFactory;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.AbstractDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentStructureGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.emf.documentstructure.Document;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.IStructure2DocumentGenerator;
import org.eclipse.papyrus.model2doc.emf.structure2document.generator.Structure2DocumentRegistry;
import org.eclipse.swt.widgets.Composite;

/**
 * The property editor used to edit {@link AbstractDocumentGeneratorConfiguration#getDocumentGeneratorId()}
 * The provided editor allows to get a combo box with the registered generator.
 * The edited field is the id of the generator, but this id is not shown by the editor.
 * We display a nice label instead of the real field value.
 */
public class DocumentGeneratorIdPropertyEditor extends EMFEditUIPropertyEditorFactory {

	/**
	 * the uri of the editor (declared in the UML model)
	 */
	private static final URI SELF_URI = URI.createURI("editor://generatorconfiguration/AbstractDocumentGeneratorConfiguration/documentGeneratorId/"); //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	public DocumentGeneratorIdPropertyEditor() {
		super(SELF_URI);
	}

	/**
	 * @see org.eclipse.emf.edit.ui.provider.EMFEditUIPropertyEditorFactory#createEditor(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertyDescriptor, org.eclipse.swt.widgets.Composite)
	 *
	 * @param object
	 * @param propertyDescriptor
	 * @param composite
	 * @return
	 */
	@Override
	public CellEditor createEditor(final Object object, final IItemPropertyDescriptor propertyDescriptor, final Composite composite) {

		List<IStructure2DocumentGenerator> generators = Collections.emptyList();
		if (object instanceof DefaultDocumentGeneratorConfiguration) {
			Document document = null;
			EObject parent = ((DefaultDocumentGeneratorConfiguration) object).eContainer();
			if (parent instanceof Document) {
				document = (Document) parent;
			}
			generators = Structure2DocumentRegistry.INSTANCE.getAvailableGenerators(document);

		} else if (object instanceof DefaultDocumentStructureGeneratorConfiguration) {
			// we are not able to make a check to know if all proposed generators will support the generated structure
			generators = Structure2DocumentRegistry.INSTANCE.getAllRegistredGenerators();
		}

		return new DocumentGeneratorExtendedComboBoxCellEditor(composite, generators, new DocumentGeneratorIdLabelProvider());
	}

	/**
	 * The cell editor to use to edit the document generator id
	 */
	private class DocumentGeneratorExtendedComboBoxCellEditor extends ExtendedComboBoxCellEditor {

		/**
		 * Constructor.
		 *
		 * @param composite
		 * @param list
		 * @param labelProvider
		 */
		public DocumentGeneratorExtendedComboBoxCellEditor(final Composite composite, final List<?> list, final ILabelProvider labelProvider) {
			super(composite, list, labelProvider);
		}

		/**
		 * @see org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor#doSetValue(java.lang.Object)
		 *
		 * @param value
		 */
		@Override
		public void doSetValue(Object value) {
			if (value instanceof String) {
				final IStructure2DocumentGenerator generator = Structure2DocumentRegistry.INSTANCE.getGenerator((String) value);
				if (generator != null) {
					super.doSetValue(generator.getEditorLabel());
				}

			}
			if (value == null) {
				super.doSetValue(""); //$NON-NLS-1$
				return;
			}
			super.doSetValue(value);
		}

		/**
		 * @see org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor#doGetValue()
		 *
		 * @return
		 */
		@Override
		public Object doGetValue() {
			Object getValue = super.doGetValue();
			if (getValue instanceof IStructure2DocumentGenerator) {
				getValue = ((IStructure2DocumentGenerator) getValue).getGeneratorId();
			}
			return getValue;
		}
	}

	/**
	 * @see org.eclipse.emf.edit.provider.PropertyEditorFactory#createLabelProvider(java.lang.Object, org.eclipse.emf.edit.provider.IItemPropertyDescriptor)
	 *
	 * @param object
	 * @param propertyDescriptor
	 * @return
	 */
	@Override
	public IItemLabelProvider createLabelProvider(Object object, IItemPropertyDescriptor propertyDescriptor) {
		return new DocumentGeneratorLabelProvider();
	}

	/**
	 * The label provider allowing to mask the real value of the edited field and allowing to display a nice label instead
	 */
	private static class DocumentGeneratorLabelProvider implements IItemLabelProvider {

		/**
		 * @see org.eclipse.emf.edit.provider.IItemLabelProvider#getText(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public String getText(Object object) {
			if (object instanceof String) {
				final IStructure2DocumentGenerator generator = Structure2DocumentRegistry.INSTANCE.getGenerator((String) object);
				if (generator != null) {
					return generator.getEditorLabel();
				}
				return (String) object;
			}
			// probably not possible
			return ""; //$NON-NLS-1$
		}

		/**
		 * @see org.eclipse.emf.edit.provider.IItemLabelProvider#getImage(java.lang.Object)
		 *
		 * @param object
		 * @return
		 */
		@Override
		public Object getImage(Object object) {
			return null;
		}
	}

	/**
	 * Label provider for {@link IStructure2DocumentGenerator}
	 */
	private class DocumentGeneratorIdLabelProvider extends LabelProvider {

		/**
		 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
		 *
		 * @param element
		 * @return
		 */
		@Override
		public String getText(Object element) {
			if (element == null) {
				return ""; //$NON-NLS-1$
			}
			if (element instanceof IStructure2DocumentGenerator) {
				return ((IStructure2DocumentGenerator) element).getEditorLabel();
			}
			// probably not possible
			return super.getText(element);
		}
	}
}
