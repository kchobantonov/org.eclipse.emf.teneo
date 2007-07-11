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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ExtensionManagerAware.java,v 1.1 2007/07/11 14:41:06 mtaal Exp $
 */

package org.eclipse.emf.teneo.extension;


/**
 * An extension implementing this interface will be able to 'receive' an instance of the
 * ExtensionManager which created it.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public interface ExtensionManagerAware {
	/** Set the extensionManager */
	void setExtensionManager(ExtensionManager extensionManager);
}