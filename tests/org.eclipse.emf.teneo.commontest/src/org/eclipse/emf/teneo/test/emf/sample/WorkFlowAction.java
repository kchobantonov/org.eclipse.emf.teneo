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
 * $Id: WorkFlowAction.java,v 1.2 2007/02/01 12:35:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.emf.sample;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Tests the workflow example. 
 *  
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $ 
*/
public class WorkFlowAction extends AbstractTestAction 
{
	public WorkFlowAction() 
	{
		super(WorkflowPackage.eINSTANCE);
	}

	/** Test */
	public void doAction(TestStore store)
	{
	}
}
