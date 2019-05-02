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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainMerger;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureContext;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureDomain;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureViewpoint;
import org.eclipse.papyrus.infra.gmfdiag.common.helper.DiagramPrototype;
import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateUtils;

/**
 * Utility class to find {@link PapyrusDiagram}
 */
public class PapyrusDiagramUtils {

	/**
	 *
	 * Constructor.
	 *
	 */
	private PapyrusDiagramUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param editedElement
	 *            the edited element (an element of the DocumentStructureTemplate metamodel or one of its extension)
	 * @return
	 *         the collection of accessible {@link PapyrusDiagram} according to the semantic context of the document template
	 *         or all registered {@link PapyrusDiagram} if the context is <code>null</code>
	 */
	public static final Collection<PapyrusDiagram> getPapyrusDiagrams(final EObject editedElement) {
		final DocumentTemplate docTemplate = DocumentStructureTemplateUtils.getDocumentTemplate(editedElement);

		// 1. in this case we cross all registered contribution to AF
		if (null == docTemplate || null == docTemplate.getSemanticContext()) {
			final Set<PapyrusDiagram> diagrams = new HashSet<>();
			final ArchitectureDomainMerger m = ArchitectureDomainManager.getInstance().getMerger().clone();
			final Collection<MergedArchitectureDomain> domain = m.getDomains();
			for (MergedArchitectureDomain current : domain) {
				for (final MergedArchitectureContext context : current.getContexts()) {
					for (MergedArchitectureViewpoint v : context.getViewpoints()) {
						for (RepresentationKind repKind : v.getRepresentationKinds()) {
							if (repKind instanceof PapyrusDiagram) {
								diagrams.add((PapyrusDiagram) repKind);
							}
						}
					}
				}
			}
			return diagrams;
		}

		// 2. in this case, we provides only values available with the current AF
		final EObject semanticContext = docTemplate.getSemanticContext();
		final PolicyChecker policyChecker = PolicyChecker.getFor(semanticContext.eResource());
		final List<PapyrusDiagram> result = new ArrayList<>();
		policyChecker.getAllPrototypes().stream()
				.filter(DiagramPrototype.class::isInstance)
				.map(DiagramPrototype.class::cast)
				.forEach(proto -> result.add(proto.getRepresentationKind()));
		return result;
	}

}
