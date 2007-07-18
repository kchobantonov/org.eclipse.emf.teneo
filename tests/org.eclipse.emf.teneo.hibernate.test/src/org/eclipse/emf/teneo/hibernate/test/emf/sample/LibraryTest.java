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
 * $Id: LibraryTest.java,v 1.6 2007/07/18 16:12:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.test.emf.sample;

import org.eclipse.emf.teneo.hibernate.test.stores.HibernateTestStore;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.mapping.strategy.impl.TeneoSQLNameStrategy;
import org.eclipse.emf.teneo.samples.emf.sample.library.Library;
import org.eclipse.emf.teneo.samples.emf.sample.library.Writer;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.sample.LibraryAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the library example of emf/xsd.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class LibraryTest extends AbstractActionTest {

	private static LibraryAction testAction = new LibraryAction() {
		@Override
		protected void checkContainerAfterLibraryRetrieve(TestStore store, Writer writ) {
		};

		@Override
		protected void checkTeneoSQLNameStrategy() {
			final TeneoSQLNameStrategy nameStrategy = new TeneoSQLNameStrategy();
			assertEquals("c_p", nameStrategy.trunc(3, "child_parent", true));
			assertEquals("c_f_m", nameStrategy.trunc(1, "child_father_mother", true));
			assertEquals("child_parent", nameStrategy.trunc(12, "child_parent", true));
			assertEquals("chi_par", nameStrategy.trunc(7, "child_parent", true));
			assertEquals("chil", nameStrategy.trunc(4, "child", true));
			assertEquals("chi_par", nameStrategy.trunc(7, "child.parent", true));
			assertEquals("child_parent", nameStrategy.trunc(-1, "child.parent", true));

			assertEquals("chi_par_id", nameStrategy.trunc(10, "child.parent.id", true));
			assertEquals("child_paren_id", nameStrategy.trunc(14, "child.parent.id", true));
		}

		@Override
		protected void checkContainerAfterWriterRetrieve(TestStore store, Writer writ) {
			assertTrue(writ.eContainer() != null);
			assertTrue(writ.eContainer() instanceof Library);
		};

		@Override
		protected boolean listValueOfCorrectType(Object value) {
			return (value instanceof PersistableEList);
		};

		/** Dump the annotated model to standard output */
		@Override
		protected void dumpPAModel(TestStore testStore) {
			final HibernateTestStore hts = (HibernateTestStore) testStore;
			System.err.println(hts.getEmfDataStore().getPaModel().toXML());
		}

	};

	public LibraryTest() {
		super(testAction);
	}
}
