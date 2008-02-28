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
 * $Id: AllTests.java,v 1.5 2008/02/28 07:07:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.relation;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.jpox.test.JPOXTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.relation.Relation1to1Action;
import org.eclipse.emf.teneo.test.emf.relation.Relation1tonAction;
import org.eclipse.emf.teneo.test.emf.relation.RelationntomAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite =
				new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.relation", JPOXTestbed
					.instance().getConfigurations());

		suite.addTestSuite(Relation1to1Action.class);
		suite.addTestSuite(Relation1tonAction.class);
		suite.addTestSuite(RelationntomAction.class);

		return suite;
	}

}
