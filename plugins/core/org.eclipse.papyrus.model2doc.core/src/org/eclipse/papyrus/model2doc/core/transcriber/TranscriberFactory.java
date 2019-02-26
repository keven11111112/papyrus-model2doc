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
package org.eclipse.papyrus.model2doc.core.transcriber;

import org.eclipse.uml2.uml.Package;

import org.eclipse.papyrus.model2doc.core.internal.transcriber.UMLTranscriber;
import org.eclipse.papyrus.model2doc.core.transcription.Transcription;

/**
 * Transcriber Factory.
 * 
 */
public class TranscriberFactory {
	
	public static final TranscriberFactory INSTANCE = new TranscriberFactory();
	
	/**
	 * Constructor.
	 *
	 */
	private TranscriberFactory() {
		// to avoid instantiation
	};

	/**
	 * Create UMLTranscriber.
	 * 
	 * @param rootPackage
	 *            the root package
	 * @param transcription
	 *            the object in charge to do the transcription
	 * @return
	 * 		UMLTranscriber
	 */
	public Transcriber createUMLTranscriber(Package rootPackage, Transcription transcription) {
		return new UMLTranscriber(rootPackage, transcription);
	}
}
