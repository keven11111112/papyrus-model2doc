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

package org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.converters;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.infra.gmfdiag.representation.PapyrusDiagram;
import org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.converters.IDisplayConverter;
import org.eclipse.papyrus.model2doc.integration.gmf.documentstructuretemplate.edit.internal.utils.PapyrusDiagramUtils;

/**
 * This converter allows to convert a PapyrusDiagram into a String (using {@link PapyrusDiagram#getId()} and vice versa
 */
public class PapyrusDiagramViewDiagramKindIdDisplayConverter implements IDisplayConverter {

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.converters.IDisplayConverter#semanticToDisplayValue(java.lang.Object, org.eclipse.emf.ecore.EObject)
	 *
	 * @param canonicalValue
	 * @param editedObject
	 * @return
	 */
	@Override
	public Object semanticToDisplayValue(final Object canonicalValue, final EObject editedObject) {
		if (canonicalValue == null || (canonicalValue instanceof String && ((String) canonicalValue).isEmpty())) {
			return canonicalValue;
		}

		final Collection<PapyrusDiagram> diagrams = PapyrusDiagramUtils.getPapyrusDiagrams(editedObject);
		final List<PapyrusDiagram> result = diagrams
				.stream()
				.filter(d -> canonicalValue.equals(d.getId()))
				.collect(Collectors.toList());
		if (result.size() == 1) {
			return result.get(0);
		}

		return canonicalValue;
	}

	/**
	 * @see org.eclipse.papyrus.model2doc.emf.documentstructuretemplate.edit.converters.IDisplayConverter#displayToSemanticValue(java.lang.Object, org.eclipse.emf.ecore.EObject)
	 *
	 * @param displayValue
	 * @param editedObject
	 * @return
	 */
	@Override
	public Object displayToSemanticValue(final Object displayValue, final EObject editedObject) {
		if (null == displayValue) {
			return ""; //$NON-NLS-1$
		}
		if (displayValue instanceof PapyrusDiagram) {
			return ((PapyrusDiagram) displayValue).getId();
		}
		return displayValue;
	}

}
