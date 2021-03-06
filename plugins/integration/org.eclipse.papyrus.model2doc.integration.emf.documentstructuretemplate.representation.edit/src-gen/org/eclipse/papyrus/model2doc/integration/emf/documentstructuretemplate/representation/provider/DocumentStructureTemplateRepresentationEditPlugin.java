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
package org.eclipse.papyrus.model2doc.integration.emf.documentstructuretemplate.representation.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

import org.eclipse.papyrus.infra.architecture.representation.provider.RepresentationEditPlugin;

import org.eclipse.papyrus.infra.constraints.provider.ConstraintsEditPlugin;

import org.eclipse.papyrus.infra.core.architecture.provider.ArchitectureEditPlugin;

import org.eclipse.papyrus.infra.emf.expressions.provider.ExpressionsEditPlugin;
import org.eclipse.papyrus.infra.types.provider.TypesConfigurationsEditPlugin;

import org.eclipse.papyrus.model2doc.core.author.provider.AuthorEditPlugin;
import org.eclipse.papyrus.model2doc.core.builtintypes.provider.BuiltInTypesEditPlugin;
import org.eclipse.papyrus.model2doc.core.generatorconfiguration.provider.GeneratorconfigurationEditPlugin;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.provider.DocumentStructureTemplateEditPlugin;

import org.osgi.framework.BundleActivator;

/**
 * This is the central singleton for the DocumentStructureTemplateRepresentation edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public final class DocumentStructureTemplateRepresentationEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final DocumentStructureTemplateRepresentationEditPlugin INSTANCE = new DocumentStructureTemplateRepresentationEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public DocumentStructureTemplateRepresentationEditPlugin() {
		super(new ResourceLocator[] {
				ArchitectureEditPlugin.INSTANCE,
				ConstraintsEditPlugin.INSTANCE,
				DocumentStructureTemplateEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE,
				TypesConfigurationsEditPlugin.INSTANCE,
				RepresentationEditPlugin.INSTANCE,
				GeneratorconfigurationEditPlugin.INSTANCE,
				AuthorEditPlugin.INSTANCE,
				ExpressionsEditPlugin.INSTANCE,
				BuiltInTypesEditPlugin.INSTANCE,
		});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}

		/**
		 * The actual implementation of the purely OSGi-compatible <b>Bundle Activator</b>.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		public static final class Activator extends EMFPlugin.OSGiDelegatingBundleActivator {
			@Override
			protected BundleActivator createBundle() {
				return new Implementation();
			}
		}
	}

}
