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
package org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.properties;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.EMFEditUIPropertyEditorFactory;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentStructureTemplatePackage;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.EReferencePartTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.internal.messages.Messages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;

/**
 * Factory used to edit {@link EReferencePartTemplate#setEReference(EReference)}
 */
public class EReferencePartTemplateEReferenceEditorFactory extends EMFEditUIPropertyEditorFactory {

	/**
	 * This editor is registered with this URI with the extension point org.eclipse.emf.edit.propertyEditorFactories.
	 * This editor is also registered with this URI in an EAnnotation in the ecore model
	 */
	private static final URI SELF_URI = URI.createURI("editor://documentstructuretemplate/EReferencePartTemplate/EReference/"); //$NON-NLS-1$

	/**
	 *
	 * Constructor.
	 *
	 */
	public EReferencePartTemplateEReferenceEditorFactory() {
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
	public CellEditor createEditor(Object object, IItemPropertyDescriptor itemPropertyDescriptor, Composite composite) {
		if (!itemPropertyDescriptor.canSetProperty(object)) {
			return null;
		}
		Assert.isTrue(itemPropertyDescriptor.getFeature(object) == DocumentStructureTemplatePackage.eINSTANCE.getEReferencePartTemplate_EReference());
		final EReference editedFeature = (EReference) itemPropertyDescriptor.getFeature(object);
		final ILabelProvider labelProvider = new EcoreLabelProvider();

		final Collection<EPackage> input = getDialogInput(object);
		final CellEditor result = new ExtendedDialogCellEditor(composite, labelProvider) {
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				final ITreeContentProvider contentProvider = new EReferenceTreeContentProvider();
				final ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(Display.getDefault().getActiveShell(), labelProvider, contentProvider);
				Object initialSelection = ((EObject) object).eGet(editedFeature);
				Object[] selectedValue = { initialSelection };

				dialog.setInput(input);
				dialog.setValidator(new SingleEReferenceValidator());
				dialog.setComparator(new ViewerComparator());
				dialog.setAllowMultiple(false);
				dialog.setInitialSelections(selectedValue);
				dialog.setTitle(NLS.bind(Messages.EReferencePartTemplateEReferenceEditorFactory_DialogTitle, editedFeature.getName()));
				dialog.setMessage(NLS.bind(Messages.EReferencePartTemplateEReferenceEditorFactory_DialogMessage, editedFeature.getEType().getName()));

				int userResponse = dialog.open();
				Object toReturn = null;
				if (userResponse == Window.OK) {
					toReturn = dialog.getResult()[0];
					if (toReturn == null) {
						toReturn = itemPropertyDescriptor.getPropertyValue(null);
					}
				} else {
					toReturn = itemPropertyDescriptor.getPropertyValue(object);
				}
				return toReturn;
			}
		};
		return result;
	}

	/**
	 *
	 * @param object
	 *            an object
	 * @return
	 *         the input to use for the dialog
	 */
	private Collection<EPackage> getDialogInput(final Object object) {
		if (false == object instanceof EObject) {
			return Collections.emptyList();
		}

		final EObject editedObject = (EObject) object;
		final Collection<EPackage> input = new HashSet<>();

		// currently, we consider Ecore is not required by default
		// input.add(EcorePackage.eINSTANCE);

		EObject parent = editedObject;
		DocumentTemplate template = null;
		// we are looking for the document template
		while (parent != null && template == null) {
			if (parent instanceof DocumentTemplate) {
				template = (DocumentTemplate) parent;
			} else {
				parent = parent.eContainer();
			}
		}

		// we check if the document template has a context
		// (there is no context editing a DocumentTemplatePrototype)
		if (null != template && null != template.getSemanticContext()) {
			EObject documentContext = template.getSemanticContext();
			input.add(documentContext.eClass().getEPackage());
		} else {
			// in this case we cross the loaded resource to find EPackage in others resource
			final ResourceSet set = editedObject.eResource().getResourceSet();
			Iterator<Resource> iter = set.getResources().iterator();
			while (iter.hasNext()) {
				final Resource res = iter.next();
				for (EObject eobject : res.getContents()) {
					if (eobject instanceof EPackage) {
						input.add((EPackage) eobject);
					} else {
						final EClass eClass = eobject.eClass();
						if (null != eClass && null != eClass.getEPackage()) {
							input.add(eClass.getEPackage());
						}
					}
				}
			}
		}

		return input;
	}


}
