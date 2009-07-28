/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * AllTests.java,v 1.11 2007/03/29 22:14:46 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.teneo.hibernate.test.HibernateTestbed;
import org.eclipse.emf.teneo.test.conf.MultiCfgTestSuite;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.DateTimeAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.DocumentRootAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.DurationAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.EMapAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.EMapAsListAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.EcoreAttrsAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ExtensionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.GroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.ListAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.MixedAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.NestedGroupAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.QNameAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.RestrictionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SimpleTypeAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SimplefeaturemapAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SubstitutionAction;
import org.eclipse.emf.teneo.test.emf.schemaconstructs.SubstitutionzvonAction;

/**
 * All tests
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.27 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new MultiCfgTestSuite("Test for org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs",
				HibernateTestbed.instance().getConfigurations());
		suite.addTestSuite(DocumentRootAction.class);
		suite.addTestSuite(SubstitutionzvonAction.class);
		suite.addTestSuite(EMapAction.class);
		suite.addTestSuite(EMapAsListAction.class);

		suite.addTestSuite(SimpleTypeAction.class);
		suite.addTestSuite(DateTimeAction.class);

		suite.addTestSuite(DurationAction.class);

		suite.addTestSuite(QNameAction.class);

		suite.addTestSuite(EcoreAttrsAction.class);

		suite.addTestSuite(MixedAction.class);
		suite.addTestSuite(AttributesTest.class);
		suite.addTestSuite(ListAction.class);
		suite.addTestSuite(SimplefeaturemapAction.class);
		suite.addTestSuite(RestrictionAction.class);
		suite.addTestSuite(ExtensionAction.class);
		suite.addTestSuite(GroupAction.class);
		suite.addTestSuite(NestedGroupAction.class);
		suite.addTestSuite(SubstitutionAction.class);

		/*
		 * // The anytype test is not yet supported by Hibernate // suite.addTestSuite(AnyTypeAction.class); //
		 * Listunion types are not yet supported by hibernate // suite.addTestSuite(ListUnionAction.class);
		 */
		// $JUnit-END$
		return suite;
	}
}
