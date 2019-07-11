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
 *	Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *****************************************************************************/
package org.eclipse.papyrus.model2doc.bundles.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.papyrus.model2doc.bundles.tests.internal.BundleDependenciesVersionTestsUtils;
import org.eclipse.papyrus.model2doc.bundles.tests.internal.BundleRepresentation;
import org.eclipse.papyrus.model2doc.bundles.tests.internal.BundleTestsUtils;
import org.eclipse.papyrus.model2doc.bundles.tests.internal.Model2DocBundleUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.osgi.framework.Bundle;

@SuppressWarnings("nls")
public class Model2DocBundleTest {

	/**
	 * The list of the model2doc bundles
	 */
	private static List<Bundle> model2docBundles;

	/**
	 * This map contains the list of dependencies of for each analyzed bundles.
	 */
	private static Map<Bundle, List<BundleRepresentation>> mapOfDependencies;

	/**
	 * This map contains the list of dependencies of for each analyzed bundles.
	 */
	private static Map<Bundle, List<BundleRepresentation>> mapOfImportedPackages;

	/**
	 * A map with the allowed imported package for each bundle
	 */
	private static Map<String, List<String>> importedPackageExceptions;

	/**
	 * a list of imported-package always allowed
	 */
	private static List<String> packageAlwaysAllowed;

	/**
	 * a map with the allowed reexported dependencies for each bundle
	 */
	private static Map<String, List<String>> reexportedDependenciesExceptions;

	/**
	 * a list of reexported dependencies always allowed
	 */
	private static List<String> dependenciesAlwaysAllowed;

	/**
	 * the Model2Doc Bundle name prefix
	 */
	private static final String PAPYRUS_MODEL2DOC_BUNDLE_NAME_PREFIX = "Papyrus-Model2Doc -"; //$NON-NLS-1$

	@BeforeClass
	public static void initTestsClass() {
		model2docBundles = Model2DocBundleUtils.getPapyrusModel2DocBundles();
		mapOfDependencies = new HashMap<>();
		for (final Bundle bundle : model2docBundles) {
			mapOfDependencies.put(bundle, Model2DocBundleUtils.getBundleDependencies(bundle));
		}
		mapOfImportedPackages = new HashMap<>();
		for (final Bundle bundle : model2docBundles) {
			final List<BundleRepresentation> representations = Model2DocBundleUtils.getBundleImportPackage(bundle);
			if (representations != null && !representations.isEmpty()) {
				mapOfImportedPackages.put(bundle, representations);
			}
		}

		// currently, there is no exception defined by plugin
		importedPackageExceptions = new HashMap<>();
		// there is an exception always valid for osgi (due to EMF generation)
		packageAlwaysAllowed = Collections.singletonList("org.osgi.framework");

		// currently, we don't have reexported dependencies always allowed
		dependenciesAlwaysAllowed = Collections.emptyList();

		reexportedDependenciesExceptions = new HashMap<>();

		// to ease usage of LibreOffice API!
		List<String> allowedReexport = new ArrayList<>();
		allowedReexport.add("org.apache.commons.jxpath");
		allowedReexport.add("org.apache.xerces");
		allowedReexport.add("org.apache.xml.serializer");
		reexportedDependenciesExceptions.put("org.eclipse.papyrus.model2doc.odt.lib", allowedReexport);
	}



	/**
	 * This test check the bundle's name start with Model2Doc
	 */
	@Test
	public void checkBundleNameContaineModel2Doc() {
		BundleTestsUtils.checkBundleNamePrefix(model2docBundles, PAPYRUS_MODEL2DOC_BUNDLE_NAME_PREFIX);
	}


	/**
	 * Tests the java version
	 */
	@Test
	public void javaVersionTest() {
		BundleTestsUtils.testManifestProperty(model2docBundles, BundleTestsUtils.BUNDLE_REQUIREDEXECUTIONENVIRONMENT, BundleTestsUtils.JAVA_VERSION_REGEX, false, true);
	}

	/**
	 * Tests if the file about.html is included to the plugin
	 */
	@Test
	public void aboutTest() {
		BundleTestsUtils.fileTest(model2docBundles, "/about.html");
	}

	/**
	 * This test checks EMF is written in upper case in the bundle name
	 */
	@Test
	public void checkBundleNameEMFSpelling() {
		BundleTestsUtils.checkBundleNameCaseSentivity(model2docBundles, "EMF");
	}

	/**
	 * This test checks GMF is written in upper case in the bundle name
	 */
	@Test
	public void checkBundleNameGMFSpelling() {
		BundleTestsUtils.checkBundleNameCaseSentivity(model2docBundles, "GMF");
	}

	/**
	 * This test checks NatTable is written with a N and a T in upper case in the bundle name
	 */
	@Test
	public void checkBundleNameNatTableSpelling() {
		BundleTestsUtils.checkBundleNameCaseSentivity(model2docBundles, "NatTable");
	}

	/**
	 * This test checks there is no double space in the bundle name
	 */
	@Test
	public void checkNoDoubleSpaceInBundleName() {
		BundleTestsUtils.checkBundleNameDontContainsDoubleSpace(model2docBundles);
	}

	/**
	 * This tests checks there is no imported packages (with some exceptions)
	 */
	@Test
	public void checkImportPackage() {
		BundleTestsUtils.checkImportedPackages(mapOfImportedPackages, importedPackageExceptions, packageAlwaysAllowed);
	}

	/**
	 * This tests checks there is no reexported dependencies (with some exceptions)
	 */
	@Test
	public void checkReexportedDependencies() {
		// temporary intermediate map creation , to avoid to clean deprecated plugins for running this JUnit test
		Map<Bundle, List<BundleRepresentation>> newMap = new HashMap<>();
		for (Bundle bundle : mapOfDependencies.keySet()) {
			if (false == bundle.getSymbolicName().contains("org.eclipse.papyrus.model2doc.documentview")) {
				newMap.put(bundle, mapOfDependencies.get(bundle));
			}
		}
		BundleTestsUtils.checkReexportedDependencies(newMap, reexportedDependenciesExceptions, dependenciesAlwaysAllowed);
	}

	/**
	 * Tests the provider name (should be Eclipse Modeling Project)
	 */
	@Test
	public void vendorTest() {
		BundleTestsUtils.testManifestProperty(model2docBundles, BundleTestsUtils.BUNDLE_VENDOR, BundleTestsUtils.VENDOR_NAME, false, false);
	}

	/**
	 * Check if the bundles contains the incubation word
	 */
	@Test
	public void checkBundleNameContainsIncubationTest() {
		BundleTestsUtils.checkBundleNameContainsIncubationTest(model2docBundles, true);
	}

	/**
	 * This tests checks all plugins depends on the same version of others ones
	 */
	@Test
	public void checkUnicityVersionOfDependencies() {
		// temporary intermediate map creation , to avoid to clean deprecated plugins for running this JUnit test
		Map<Bundle, List<BundleRepresentation>> newMap = new HashMap<>();
		for (Bundle bundle : mapOfDependencies.keySet()) {
			if (false == bundle.getSymbolicName().contains("org.eclipse.papyrus.model2doc.documentview")) {
				newMap.put(bundle, mapOfDependencies.get(bundle));
			}
		}
		BundleDependenciesVersionTestsUtils.checkUnicityVersionOfDependencies(newMap);
	}

	/**
	 * This test checks a minor/major version is defined for each dependency
	 */
	@Test
	public void checkDependenciesVersionAreDefined() {
		BundleDependenciesVersionTestsUtils.checkDependencyVersionIsDeclared(mapOfDependencies);
	}

	/**
	 * This test checks the minor version is always declared as included
	 */
	@Test
	public void checkMinDependenciesVersionAreIncluded() {
		BundleDependenciesVersionTestsUtils.checkIncludedMinorDependencyVersion(mapOfDependencies);
	}

	/**
	 * This test checks the minor version is always declared as excluded
	 */
	@Test
	public void checkMaxDependenciesVersionAreExcluded() {
		BundleDependenciesVersionTestsUtils.checkDependencyVersionIsDeclared(mapOfDependencies);
	}
}
