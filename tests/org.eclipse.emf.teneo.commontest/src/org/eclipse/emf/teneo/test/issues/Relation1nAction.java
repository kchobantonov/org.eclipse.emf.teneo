/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: Relation1nAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.teneo.samples.issues.testrelation1n.TestA;
import org.eclipse.emf.teneo.samples.issues.testrelation1n.TestB1;
import org.eclipse.emf.teneo.samples.issues.testrelation1n.TestC1;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Is a simple test case to test how circular dependencies are handled.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */
public class Relation1nAction extends AbstractTestAction {
	/** Return the packagename of the test sample, Is needed in case of non emf test cases */
	public String getTestPackageName() {
		return TestB1.class.getPackage().getName();
	}

	/** Stores a TopModel Object */
	public void doAction(TestStore store) {
		// Create one TestA object which contains a TestB1 and a TestC1
		// Create another TestA object which contains a TestB2 and a TestC2
		try {
			store.beginTransaction();

			TestA testa1 = new TestA();
			testa1.setCode("a1");
			TestB1 testb1 = new TestB1();
			testb1.setCode("b1");
			testa1.getTestbList().add(testb1);

			TestC1 testc1 = new TestC1();
			testc1.setCode("c1");
			testa1.getTestcList().add(testc1);

			final TestA testa2 = new TestA();
			testa2.setCode("code2");
			final TestB1 testb2 = new TestB1();
			testb1.setCode("code");
			testa2.getTestbList().add(testb2);

			TestC1 testc2 = new TestC1();
			testc2.setCode("code");
			testa2.getTestcList().add(testc2);
			store.store(testa1);
			store.store(testa2);
			store.commitTransaction();
		} catch (Exception e) {
			throw new StoreTestException(e.getMessage(), e);
		} finally {
			// store.rollbackTransaction();
		}

		// do some checks
		store.checkNumber(TestA.class, 2);
		store.checkNumber(TestB1.class, 2);
		// store.checkNumber(TestB2.class, 0);
		store.checkNumber(TestC1.class, 2);

		// disabled the following test, TestB1's can be deleted because explicitly deleting
		// B1's means that you want them deleted from their parent also, this strange situation
		// is difficult to
		// Now it should not be possible to delete the TestB objects, if that is
		// case then no-foreign key constraint was created in the database.
		/*
		 * try { store.beginTransaction(); Collection c = store.getObjects(TestB1.class); Iterator it = c.iterator(); while
		 * (it.hasNext()) { TestB1 result = (TestB1)it.next(); store.deleteObject(result); }
		 * 
		 * store.commitTransaction(); assertTrue(">> It should not possible to delete a TestB1 object, there are references to it",
		 * false); } catch (Exception e) { // this is correct } finally { store.rollbackTransaction(); }
		 */

		// Now delete the A's, after that no TestC's should be present anymore.
		try {
			store.beginTransaction();
			Collection c = store.getObjects(TestA.class);
			Iterator it = c.iterator();
			while (it.hasNext()) {
				TestA result = (TestA) it.next();
				store.deleteObject(result);
			}
			store.commitTransaction();
		} catch (Exception e) {
			throw new StoreTestException(e.getMessage(), e);
		}

		// do some checks

		store.checkNumber(TestA.class, 0);
		store.checkNumber(TestB1.class, 2);
		// store.checkNumber(TestB2.class, 0);

		// In case the dependent objects were not deleted then the next two
		// lines will fail
		store.checkNumber(TestC1.class, 0);
	}
}
