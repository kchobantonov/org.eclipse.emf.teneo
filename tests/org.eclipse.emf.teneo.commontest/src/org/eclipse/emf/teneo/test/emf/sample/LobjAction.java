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
 * $Id: LobjAction.java,v 1.3 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import lobj.LobjFactory;
import lobj.LobjPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the capa, detach and update
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class LobjAction extends AbstractTestAction {

	/**
	 * Constructor for ClassHierarchyParsing.
	 * 
	 * @param arg0
	 */
	public LobjAction() {
		super(LobjPackage.eINSTANCE);
	}

	/** Creates an item, an address and links them to a po. */
	public void doAction(TestStore store) {
		final LobjFactory factory = LobjFactory.eINSTANCE;
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("learningobjects", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		try {
			{
				store.beginTransaction();
//				loadResource(rs, "TestLU.learningobjects");
//				loadResource(rs, "TestBlock.learningobjects");
				loadResource(rs, "Lang_de.learningobjects");
				for (Iterator resources = rs.getResources().iterator(); resources.hasNext();) {
					final Resource res = (Resource) resources.next();
					for (Iterator it = res.getContents().iterator(); it.hasNext();) {
						Object obj = it.next();
						store.store(obj);
					}
				}
				store.commitTransaction();
			}
			store.refresh();
			rs = new ResourceSetImpl();
			{
				store.beginTransaction();
//				loadResource(rs, "TestLU.learningobjects");
//				loadResource(rs, "TestBlock.learningobjects");
				loadResource(rs, "Lang_de.learningobjects");
				for (Iterator resources = rs.getResources().iterator(); resources.hasNext();) {
					final Resource res = (Resource) resources.next();
					for (Iterator it = res.getContents().iterator(); it.hasNext();) {
						Object obj = it.next();
						store.store(obj);
					}
				}
				store.commitTransaction();
			}
		} catch (IOException e) {
			throw new StoreTestException("Exception", e);
		}
	}

	/** Loads a resource */
	private void loadResource(ResourceSet rs, String name) throws IOException {
		final URI uri = URI.createFileURI("/home/mtaal/mytmp/" + name);
		Resource res = rs.getResource(uri, false);
		if (res == null) {
			res = rs.createResource(uri);
			res.load(Collections.EMPTY_MAP);
		}
	}
}
