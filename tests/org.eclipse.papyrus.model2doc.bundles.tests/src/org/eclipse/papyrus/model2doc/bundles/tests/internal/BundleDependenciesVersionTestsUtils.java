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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.osgi.util.NLS;
import org.junit.Assert;
import org.osgi.framework.Bundle;

/**
 * This class provides useful method to check the unicity of dependency version
 *
 */
public class BundleDependenciesVersionTestsUtils {

	/**
	 *
	 * This method checks all model2doc dependencies are expected with the same minor/major version
	 *
	 * @param mapOfDependencies
	 *            a map of bundles as key and their dependencies as values
	 * 
	 */
	public static void checkUnicityVersionOfDependencies(final Map<Bundle, List<BundleRepresentation>> mapOfDependencies) {
		Map<String, Set<String>> wantedMinPluginVersion = new HashMap<>();
		Map<String, Set<String>> wantedMaxPluginVersion = new HashMap<>();

		for (Entry<Bundle, List<BundleRepresentation>> current : mapOfDependencies.entrySet()) {
			final Bundle currentBundle = current.getKey();
			String bundleName = currentBundle.getHeaders().get("Bundle-SymbolicName");
			bundleName = bundleName.replaceAll(";singleton:=true", "");

			for (final BundleRepresentation bundleRep : current.getValue()) {
				final Version version = bundleRep.getVersion();
				if (null != version) {
					Set<String> minVersion = wantedMinPluginVersion.get(bundleRep.getSymbolicName());
					if (null == minVersion) {
						minVersion = new HashSet<>();
						wantedMinPluginVersion.put(bundleRep.getSymbolicName(), minVersion);
					}
					minVersion.add(version.getMinVersion());

					Set<String> maxVersion = wantedMaxPluginVersion.get(bundleRep.getSymbolicName());
					if (null == maxVersion) {
						maxVersion = new HashSet<>();
						wantedMaxPluginVersion.put(bundleRep.getSymbolicName(), maxVersion);
					}
					maxVersion.add(version.getMaxVersion());
				}
			}
		}


		// know we cross all dependencies and check the uniqueness of the required versions

		final StringBuilder minVersionbuilder = new StringBuilder();
		final StringBuilder maxVersionbuilder = new StringBuilder();
		for (Entry<String, Set<String>> current : wantedMinPluginVersion.entrySet()) {
			final String depName = current.getKey();
			Set<String> value = current.getValue();
			if (value.size() > 1) {
				minVersionbuilder.append(NLS.bind("The plugin {0} is expected with several min version number: ", depName));
				minVersionbuilder.append(value.toString());
				minVersionbuilder.append("\n");
			}
		}

		for (Entry<String, Set<String>> current : wantedMaxPluginVersion.entrySet()) {
			final String depName = current.getKey();
			Set<String> value = current.getValue();
			if (value.size() > 1) {
				maxVersionbuilder.append(NLS.bind("The plugin {0} is expected with several max version number: ", depName));
				maxVersionbuilder.append(value.toString());
				maxVersionbuilder.append("\n");

			}
		}

		if (maxVersionbuilder.length() > 0) {
			minVersionbuilder.append("\n\n");
			minVersionbuilder.append(maxVersionbuilder);
		}

		Assert.assertTrue(minVersionbuilder.toString(), minVersionbuilder.length() == 0);

	}

	/**
	 *
	 * This method checks all model2doc dependencies are declared with a minor/major version
	 *
	 * @param mapOfDependencies
	 *            a map of bundles as key and their dependencies as values
	 * 
	 */
	public static void checkDependencyVersionIsDeclared(final Map<Bundle, List<BundleRepresentation>> mapOfDependencies) {
		StringBuilder builder = new StringBuilder();
		for (Entry<Bundle, List<BundleRepresentation>> current : mapOfDependencies.entrySet()) {
			final Bundle currentBundle = current.getKey();
			String bundleName = currentBundle.getHeaders().get("Bundle-SymbolicName");
			bundleName = bundleName.replaceAll(";singleton:=true", "");

			for (final BundleRepresentation bundleRep : current.getValue()) {
				final Version version = bundleRep.getVersion();
				if (null == version) {
					builder.append(NLS.bind("The plugin {0} don't declare dependency version for {1}.\n", bundleName, bundleRep.getSymbolicName()));
				} else {
					if (version.isDefaultMinVersion()) {
						builder.append(NLS.bind("The plugin {0} don't declare min dependency version for {1}.\n", bundleName, bundleRep.getSymbolicName()));
					}
					if (version.isDefaultMaxVersion()) {
						builder.append(NLS.bind("The plugin {0} don't declare max dependency version for {1}.\n", bundleName, bundleRep.getSymbolicName()));
					}
				}
			}
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);

	}

	/**
	 *
	 * This method checks all model2doc dependencies are declared with an included minor version
	 *
	 * @param mapOfDependencies
	 *            a map of bundles as key and their dependencies as values
	 * 
	 */
	public static void checkIncludedMinorDependencyVersion(final Map<Bundle, List<BundleRepresentation>> mapOfDependencies) {
		StringBuilder builder = new StringBuilder();
		for (Entry<Bundle, List<BundleRepresentation>> current : mapOfDependencies.entrySet()) {
			final Bundle currentBundle = current.getKey();
			String bundleName = currentBundle.getHeaders().get("Bundle-SymbolicName");
			bundleName = bundleName.replaceAll(";singleton:=true", "");

			for (final BundleRepresentation bundleRep : current.getValue()) {
				final Version version = bundleRep.getVersion();
				if (null != version) {
					if (false == version.isMinIncluded()) {
						builder.append(NLS.bind("The plugin {0} don't declare the minor version as included for {1}.\n", bundleName, bundleRep.getSymbolicName()));
					}
				}
			}
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);

	}

	/**
	 *
	 * This method checks all model2doc dependencies are declared with an excluded major version
	 *
	 * @param mapOfDependencies
	 *            a map of bundles as key and their dependencies as values
	 * 
	 */
	public static void checkExludedMajorDependencyVersion(final Map<Bundle, List<BundleRepresentation>> mapOfDependencies) {
		StringBuilder builder = new StringBuilder();
		for (Entry<Bundle, List<BundleRepresentation>> current : mapOfDependencies.entrySet()) {
			final Bundle currentBundle = current.getKey();
			String bundleName = currentBundle.getHeaders().get("Bundle-SymbolicName");
			bundleName = bundleName.replaceAll(";singleton:=true", "");

			for (final BundleRepresentation bundleRep : current.getValue()) {
				final Version version = bundleRep.getVersion();
				if (null != version) {
					if (true == version.isMaxIncluded()) {
						builder.append(NLS.bind("The plugin {0} don't declare the major version as excluded for {1}.\n", bundleName, bundleRep.getSymbolicName()));

					}
				}
			}
		}
		Assert.assertTrue(builder.toString(), builder.length() == 0);
	}

}
