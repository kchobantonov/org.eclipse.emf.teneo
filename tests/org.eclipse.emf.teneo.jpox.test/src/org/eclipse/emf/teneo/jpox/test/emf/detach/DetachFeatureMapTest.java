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
 * $Id: DetachFeatureMapTest.java,v 1.5 2008/02/28 07:07:34 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.test.emf.detach;

import org.eclipse.emf.teneo.jpox.resource.JPOXResource;
import org.eclipse.emf.teneo.test.AbstractActionTest;
import org.eclipse.emf.teneo.test.emf.detach.DetachFeatureMapAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Specific detach feature map test
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class DetachFeatureMapTest extends AbstractActionTest {

	/** Creates a hibernate specific version of the action */
	final static DetachFeatureMapAction testAction = new DetachFeatureMapAction() {
		/** Returns the resource uri, jdo is default (for now) */
		public String getResourceUri(TestStore store) {
			return "jpoxdao://?" + JPOXResource.DS_NAME_PARAM + "=" + store.getDatabaseAdapter().getDbName();
		}
	};

	public DetachFeatureMapTest() {
		super(testAction);
	}
}