/*****************************************************************************
 * All rights reserved. This java class is made available under the terms of
 * Creative Commons Attribution-Share Alike 4.0 International license (CC-BY-SA-4.0)
 * which is available at https://creativecommons.org/licenses/by-sa/4.0/
 *
 * This license is applied only for this java file. Other files in the plugin
 * are under the Eclipse Public License 2.0
 *
 * SPDX-License-Identifier: CC-BY-SA-4.0
 *
 * Contributors:
 *   dzikoysk - https://stackoverflow.com/users/3426515/dzikoysk - Initial API and implementation
 *   Vincent LORENZO - integrate the code, without changes, from the Stack Overflow webpage
 *   https://stackoverflow.com/questions/10633595/java-zip-how-to-unzip-folder
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.dev.tools.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * This class provides a util method to extract a zip contents
 * This code comes from https://stackoverflow.com/questions/10633595/java-zip-how-to-unzip-folder
 */
public class ZipUtils {

	private static final int BUFFER_SIZE = 4096;

	/**
	 * This method allows to extract a zip contents
	 *
	 * @param zip
	 * @param target
	 * @throws IOException
	 */
	public static void extract(ZipInputStream zip, File target) throws IOException {
		try {
			ZipEntry entry;

			while ((entry = zip.getNextEntry()) != null) {
				File file = new File(target, entry.getName());

				if (!file.toPath().normalize().startsWith(target.toPath())) {
					throw new IOException("Bad zip entry"); //$NON-NLS-1$
				}

				if (entry.isDirectory()) {
					file.mkdirs();
					continue;
				}

				byte[] buffer = new byte[BUFFER_SIZE];
				file.getParentFile().mkdirs();
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
				int count;

				while ((count = zip.read(buffer)) != -1) {
					out.write(buffer, 0, count);
				}

				out.close();
			}
		} finally {
			zip.close();
		}
	}

}
