/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AllGenerateTests.java,v 1.5 2008/02/28 07:07:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all jpox generates of the mapping files tests.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class AllGenerateTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("All tests for jpox");
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.annotations.AllGenerateTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.detach.AllGenerateTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.elist.AllGenerateTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.relation.AllGenerateTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.sample.AllGenerateTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs.AllGenerateTests.suite());
		suite.addTest(org.eclipse.emf.teneo.jpox.test.issues.AllGenerateTests.suite());

		return suite;
	}

}
