/*****************************************************************************
 * Copyright (c) 2020 CEA LIST and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Pauline DEVILLE (CEA LIST) pauline.deville@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.emf.structure2document.generator.helpers;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.IDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;

/**
 * Factory used for transcription
 */
public interface ITranscriptionFactory {

	/**
	 * @param ddgc
	 * @return
	 */
	Transcription createTranscription(IDocumentGeneratorConfiguration ddgc);

	/**
	 * Create the URI of the generated file
	 *
	 * @param fileURI
	 * @return
	 */
	String createFileURI(String fileURI);

}
