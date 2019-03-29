/*****************************************************************************
 * Copyright (c) 2019 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Yupanqui Munoz (CEA LIST) yupanqui.munozjulho@cea.fr - Initial API and implementation
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.odt.transcription;

import org.eclipse.papyrus.model2doc.core.generatorconfiguration.DefaultDocumentGeneratorConfiguration;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;
import org.eclipse.papyrus.model2doc.odt.editor.StyleEditor;
import org.eclipse.papyrus.model2doc.odt.internal.transcription.ODTTranscription;

/**
 * ODT Transcription Factory.
 *
 */
public class ODTTranscriptionFactory {

	public static final ODTTranscriptionFactory INSTANCE = new ODTTranscriptionFactory();

	/**
	 * Constructor.
	 *
	 */
	private ODTTranscriptionFactory() {
		// to avoid instantiation
	}

	/**
	 * Get default ODT Transcription.
	 *
	 * @param styleEditor
	 * @param generatorConfig
	 * @return
	 */
	public Transcription getDefaultODTTranscription(StyleEditor styleEditor, DefaultDocumentGeneratorConfiguration generatorConfig) {
		return new ODTTranscription(styleEditor, generatorConfig);
	}
}
