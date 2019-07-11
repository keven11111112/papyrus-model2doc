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
 *   CEA LIST - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.model2doc.bundles.tests.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.osgi.util.NLS;
import org.junit.Assert;
import org.osgi.framework.Bundle;

/**
 * Utility methods not yet used and probably to move into Papyrus BundleTests
 */
public class Model2DocTestsDrafts {

	public static final String REGEX_PACKAGE_WORD = "\\w(?:\\w|\\d)*";// match a //$NON-NLS-1$

	public static final String REGEX_PLUGIN = "(?:\\." + REGEX_PACKAGE_WORD + ")*";// match plugin name //$NON-NLS-1$ //$NON-NLS-2$

	public static final String REGEX_BUNDLE = "(?:;bundle-version=\"([^\"]*)\")?"; //$NON-NLS-1$

	public static final String REGEX_REEXPORT = "(?:;\\w*:=\\w*;\\w*-\\w*=\"([^\"]*)\")|"; //$NON-NLS-1$




	public void testNoReexport(Map<Bundle, List<BundleRepresentation>> mapOfDependencies) {
		Map<String, List<String>> exportExecptions = new HashMap<>();
		List<String> exceptions = new ArrayList<>();
		exceptions.add("org.apache.commons.jxpath");
		exceptions.add("org.apache.xerces");
		exceptions.add("org.apache.xml.serializer");
		exportExecptions.put("org.eclipse.papyrus.model2doc.odt.lib", exceptions);

		int nbPluginWithError = 0;
		final StringBuilder builder = new StringBuilder();
		for (Entry<Bundle, List<BundleRepresentation>> current : mapOfDependencies.entrySet()) {
			final Bundle currentBundle = current.getKey();
			String bundleName = currentBundle.getHeaders().get("Bundle-SymbolicName");
			bundleName = bundleName.replaceAll(";singleton:=true", "");
			StringBuilder intermediateBuilder = new StringBuilder();
			forloop: for (final BundleRepresentation bundleRep : current.getValue()) {
				if (bundleRep.isReexported()) {
					if (exportExecptions.containsKey(bundleName)) {
						if (exportExecptions.get(bundleName).contains(bundleRep.getSymbolicName())) {
							continue forloop;
						}
					}

					intermediateBuilder.append(bundleRep.getSymbolicName());
					intermediateBuilder.append("\n");
				}
			}
			if (intermediateBuilder.length() > 0) {
				nbPluginWithError++;
				intermediateBuilder.insert(0, NLS.bind("The bundle {0} reexport some dependencies:\n", bundleName));
				builder.append(intermediateBuilder);
				builder.append("\n");
			}
		}
		if (builder.length() > 0) {
			builder.insert(0, NLS.bind("There is {0} plugin with errors.", nbPluginWithError));
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);
	}


	protected void testPapyrusDependencies(final List<Bundle> bundle, final String partialDependencyName, final String wantedVersion, List<String> exceptions) {
		final StringBuilder builder = new StringBuilder();
		int nb = 0;
		final Version wanted = new Version(wantedVersion);
		for (final Bundle current : bundle) {
			final String value = current.getHeaders().get(BundleTestsUtils.REQUIRE_BUNDLE);
			if (value == null) {
				continue;
			}

			// Pattern pattern = Pattern.compile("(" + partialDependencyName + REGEX_PLUGIN + ")" + REGEX_DEPENDENCY); //$NON-NLS-1$ //$NON-NLS-2$
			Pattern pattern = Pattern.compile("(" + partialDependencyName + REGEX_PLUGIN + ")" + "(" + REGEX_REEXPORT + REGEX_BUNDLE + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			Matcher matcher = pattern.matcher(value);
			final StringBuilder localBuilder = new StringBuilder();
			while (matcher.find()) {
				final String pluginName = matcher.group(1);
				if (exceptions.contains(pluginName)) {
					continue;
				}
				String versionString = null;
				if (matcher.groupCount() > 1) {
					versionString = matcher.group(2);
				}
				if (versionString == null) {
					if (localBuilder.length() == 0) {
						localBuilder.append(NLS.bind("Incorrect version for {0}, got {1} and not {2} \n", new String[] { pluginName, current.getSymbolicName(), wantedVersion })); //$NON-NLS-1$
					}
					localBuilder.append(NLS.bind("No Version number for {0}\n", pluginName)); //$NON-NLS-1$
					nb++;
				} else {
					Version version = new Version(versionString);
					if (!version.inIncludedIn(wanted)) {
						if (localBuilder.length() == 0) {
							localBuilder.append(NLS.bind("{0} incorrect required bundle-version:\n", current.getSymbolicName())); //$NON-NLS-1$
						}
						localBuilder.append(NLS.bind("Bad version for {0}, got {1} and not {2} \n", new String[] { pluginName, versionString, wantedVersion })); //$NON-NLS-1$
						nb++;
					}
				}
			}
			if (localBuilder.length() != 0) {
				builder.append(localBuilder.toString());
				builder.append("\n");//$NON-NLS-1$
			}
		}
		if (builder.length() != 0)

		{
			builder.insert(0, NLS.bind("{0} problems. We want this version : {1} for the plugin {2}\n", new String[] { Integer.toString(nb), wantedVersion, partialDependencyName })); //$NON-NLS-1$
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);
	}

}
