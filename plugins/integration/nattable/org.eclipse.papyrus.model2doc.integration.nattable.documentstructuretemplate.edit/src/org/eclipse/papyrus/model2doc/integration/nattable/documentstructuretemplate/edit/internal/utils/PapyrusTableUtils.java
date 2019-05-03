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

package org.eclipse.papyrus.model2doc.integration.nattable.documentstructuretemplate.edit.internal.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainManager;
import org.eclipse.papyrus.infra.architecture.ArchitectureDomainMerger;
import org.eclipse.papyrus.infra.core.architecture.RepresentationKind;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureContext;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureDomain;
import org.eclipse.papyrus.infra.core.architecture.merged.MergedArchitectureViewpoint;
import org.eclipse.papyrus.infra.nattable.common.helper.TableViewPrototype;
import org.eclipse.papyrus.infra.nattable.representation.PapyrusTable;
import org.eclipse.papyrus.infra.viewpoints.policy.PolicyChecker;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.DocumentTemplate;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.utils.DocumentStructureTemplateUtils;

/**
 * Utility class to find {@link PapyrusTable}
 */
public class PapyrusTableUtils {

	/**
	 *
	 * Constructor.
	 *
	 */
	private PapyrusTableUtils() {
		// to prevent instanciation
	}

	/**
	 *
	 * @param editedElement
	 *            the edited element (an element of the DocumentStructureTemplate metamodel or one of its extension)
	 * @return
	 *         the collection of accessible {@link PapyrusTable} according to the semantic context of the document template
	 */
	public static final Collection<PapyrusTable> getPapyrusTables(final EObject editedElement) {
		final DocumentTemplate docTemplate = DocumentStructureTemplateUtils.getDocumentTemplate(editedElement);

		final Set<PapyrusTable> tables = new HashSet<>();

		// 1. in this case we cross all registered contribution to AF
		if (null == docTemplate || null == docTemplate.getSemanticContext()) {
			final ArchitectureDomainMerger m = ArchitectureDomainManager.getInstance().getMerger().clone();
			final Collection<MergedArchitectureDomain> domain = m.getDomains();
			for (MergedArchitectureDomain current : domain) {
				for (final MergedArchitectureContext context : current.getContexts()) {
					for (MergedArchitectureViewpoint v : context.getViewpoints()) {
						for (RepresentationKind repKind : v.getRepresentationKinds()) {
							if (repKind instanceof PapyrusTable) {
								tables.add((PapyrusTable) repKind);
							}
						}
					}
				}
			}
			return tables;
		}

		// // 2. in this case, we provides only values available with the current AF
		final EObject semanticContext = docTemplate.getSemanticContext();
		final PolicyChecker policyChecker = PolicyChecker.getFor(semanticContext.eResource());

		policyChecker.getAllPrototypes().stream()
				.filter(TableViewPrototype.class::isInstance)
				.map(TableViewPrototype.class::cast)
				.filter(proto -> proto.getRepresentationKind() instanceof PapyrusTable)
				.forEach(proto -> tables.add((PapyrusTable) proto.getRepresentationKind()));
		return tables;
	}

}
