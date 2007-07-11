/**
 * <copyright> Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * JoinColumnsAction.java,v 1.4 2007/02/01 12:35:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.annotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class JoinColumnsAction extends AbstractTestAction {
	/**
	 * Constructor
	 */
	public JoinColumnsAction() {
		super(JoincolumnsPackage.eINSTANCE);
	}

	/** Checks the version column */
	protected void checkVersion(TestStore store) {
	}

	/** Creates an item, an address and links them to a po. */
	@Override
	public void doAction(TestStore store) {
		store.disableDrop();
		final JoincolumnsFactory factory = JoincolumnsFactory.eINSTANCE;
		{
			store.beginTransaction();
			final Parent parent = factory.createParent();
			parent.setFirstName("John");
			parent.setLastName("Smith");
			final Child child1 = factory.createChild();
			child1.setFirstName("Johnny");
			child1.setLastName("Smith");
			parent.getChildren().add(child1);
			final Child child2 = factory.createChild();
			child2.setFirstName("Jane");
			child2.setLastName("Smith");
			parent.getChildren().add(child2);
			store.store(parent.getChildren());
			store.store(parent);
			store.commitTransaction();
		}

		// read again
		{
			store.beginTransaction();
			final Parent parent = store.getObject(Parent.class);
			assertEquals(2, parent.getChildren().size());
			assertEquals("Johnny", parent.getChildren().get(0).getFirstName());
			assertEquals("Jane", parent.getChildren().get(1).getFirstName());
			store.commitTransaction();
		}

		// check version column and foreign keys
		Connection conn = null;
		Statement stmt = null;
		try {
			try {
				conn = store.getConnection();
				stmt = conn.createStatement();

				checkVersion(store);

				// depending on the inheritance strategy the foreign key is stored in different
				// table
				if (store.getInheritanceType() == InheritanceType.SINGLE_TABLE) {
					final ResultSet rs = stmt.executeQuery("select myParentFirstName from person");
					assertTrue(rs.next());
				} else {
					final ResultSet rs = stmt.executeQuery("select myParentFirstName from child");
					assertTrue(rs.next());
				}
			} finally {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		} catch (final SQLException e) {
			throw new StoreTestException("Sql exception when checking db schema", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.teneo.test.AbstractTestAction#getExtraConfigurationProperties()
	 */
	@Override
	public Properties getExtraConfigurationProperties() {
		final Properties props = new Properties();
		props.setProperty(PersistenceOptions.VERSION_COLUMN_NAME, "myversion");
		return props;
	}
}