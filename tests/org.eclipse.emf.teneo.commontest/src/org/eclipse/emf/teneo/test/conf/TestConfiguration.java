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
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: TestConfiguration.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.conf;

import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.test.stores.TestDatabaseAdapter;

/**
 * Contains the parameters which define how the test should be run, for example inheritance mapping.
 * 
 * @author Davide Marchignoli
 * @author Martin Taal
 * @version $Revision: 1.2 $
 */
public class TestConfiguration {

	private final String name;

	private final TestDatabaseAdapter dbAdapter;

	private final InheritanceType mappingStrategy;

	private final boolean optimistic;

	/** Constructor */
	public TestConfiguration(String name, TestDatabaseAdapter dbAdapter, InheritanceType mappingStrategy, boolean optimistic) {
		this.name = name;
		this.dbAdapter = dbAdapter;
		this.mappingStrategy = mappingStrategy;
		this.optimistic = optimistic;
	}

	/** ToString for logging */
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("HibernateTestConfiguration(name=").append(getName()).append(", dbAdapter=").append(getDbAdapter()).append(", ")
				.append("mappingStrategy= ").append(getMappingStrategy().toString()).append(", ").append("optimistic= ").append(
						isOptimistic());
		return s.toString();
	}

	/** Hashcode computed on the basis of the contents of the configuration */
	public int hashCode() {
		return getDbAdapter().hashCode() + getMappingStrategy().hashCode() + (isOptimistic() ? 1 : 0);
	}

	/** Equal configuration */
	public boolean equals(Object other) {
		if (other instanceof TestConfiguration) {
			TestConfiguration otherCfg = (TestConfiguration) other;
			return otherCfg.getDbAdapter() == getDbAdapter() && otherCfg.getMappingStrategy() == getMappingStrategy()
					&& otherCfg.isOptimistic() == isOptimistic();
		}
		;
		return false;
	}

	/** The configuration name */
	public String getName() {
		return name;
	}

	/** Returns the test databaseadapter */
	public TestDatabaseAdapter getDbAdapter() {
		return dbAdapter;
	}

	/** Returns the current inheritance mapping */
	public InheritanceType getMappingStrategy() {
		return mappingStrategy;
	}

	/** Test optimistic locking */
	public boolean isOptimistic() {
		return optimistic;
	}

}
