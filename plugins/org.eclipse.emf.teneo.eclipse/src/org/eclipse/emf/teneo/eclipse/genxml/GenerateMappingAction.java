/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: GenerateMappingAction.java,v 1.1 2006/07/08 15:02:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.eclipse.genxml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.teneo.eclipse.StoreEclipseUtil;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Is superclass for different generate descriptor file subclasses.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public abstract class GenerateMappingAction implements IObjectActionDelegate {
	/** The logger for this class */
	private static Log log = LogFactory.getLog(GenerateMappingAction.class);

	/** The list of selected ecore files */
	private ArrayList ecoreFiles = new ArrayList();

	/**
	 * Constructor for Action1.
	 */
	public GenerateMappingAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/** Should be implemented by subclasses */
	public abstract void run(IAction action);

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action, final String targetFileName, String resultTitle1, final HashMap options, final String mainClass) {
		final StringBuffer result = new StringBuffer();

		for (int i = 0; i < ecoreFiles.size(); i++) {
			result.append(((IFile) ecoreFiles.get(i)).getLocation().toOSString());
		}

		if (ecoreFiles.size() == 0) {
			Shell shell = new Shell();
			MessageDialog.openInformation(shell, "Create EMF OR Mapping File", "Please select a ecore file.");
			return;
		}

		log.debug("Generating or descriptor file based on ecores in: " + result.toString());

		try {
			final IContainer container = ((IFile) ecoreFiles.get(0)).getParent();
			
			// get the location of the ecores
			final String[] ecoreLocations = new String[ecoreFiles.size()];
			ArrayList jprojects = new ArrayList();
			ArrayList projects = new ArrayList();
			for (int i = 0; i < ecoreFiles.size(); i++) {
				IFile ecoreFile = (IFile) ecoreFiles.get(i);
				ecoreLocations[i] = ecoreFile.getLocation().toOSString();

				IProject project = ecoreFile.getProject();
				if (project != null && !projects.contains(project)) {
					projects.add(project);
					jprojects.add(JavaCore.create(project));
				}
			}

			RunGenerateJob rgj = new RunGenerateJob(jprojects, ecoreLocations, targetFileName, mainClass, options);

			rgj.run(null);

			Shell shell = new Shell();
			MessageDialog.openInformation(shell, resultTitle1, "The " + targetFileName + " file has been created here: "
					+ container.getName());

			// is refresh a dangerous action, eclipse crashes?
			container.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (Throwable t) {
			StoreEclipseUtil.handleError(t, log);
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (!(selection instanceof IStructuredSelection)) return;

		final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		final Iterator it = structuredSelection.iterator();
		ecoreFiles = new ArrayList();
		while (it.hasNext()) {
			final Object obj = it.next();
			if (obj instanceof IFile) {
				ecoreFiles.add(obj);
			}
		}
	}
}