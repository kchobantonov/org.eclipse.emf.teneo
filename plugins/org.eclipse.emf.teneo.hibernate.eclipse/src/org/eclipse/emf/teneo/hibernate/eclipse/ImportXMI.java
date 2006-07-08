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
 * $Id: ImportXMI.java,v 1.1 2006/07/08 15:04:38 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.eclipse;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.teneo.eclipse.StoreEclipseException;
import org.eclipse.emf.teneo.eclipse.resourcehandler.StoreImportXML;
import org.eclipse.emf.teneo.hibernate.HbConstants;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbUtil;

/**
 * Performs the import xmi action
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class ImportXMI extends StoreImportXML {
	/** Can be overridden */
	protected boolean isXMLImport() {
		return false;
	}

	/** Imports the files into the store */
	protected void doImport(File[] files, Properties props) {
		try {
			final HbDataStore emfds = HbUtil.getCreateDataStore(props);
			for (int i = 0; i < files.length; i++) {
				final InputStream is = ((File) files[i]).getContents();
				emfds.importDataStore(is, HbConstants.EXCHANGE_FORMAT_XMI);
				is.close();
			}
		} catch (IOException i) {
			throw new StoreEclipseException("IO exception while importing xmi", i);
		} catch (CoreException c) {
			throw new StoreEclipseException("Core exception while importing xmi", c);
		}
	}
}
