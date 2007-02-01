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
 * $Id: TableMapper.java,v 1.3 2007/02/01 12:36:36 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.UniqueConstraint;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.jpox.mapper.MappingContext;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * Maps the table annotation (and its subannotations) to a jpox representation.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class TableMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(TableMapper.class);

	/** Constructor */
	public TableMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/** Handles a tabke object */
	public void map(Table table, Element classElement) {
		log.debug("Adding table element " + table.getName());
		classElement.addAttribute("table", table.getName());

		if (table.getUniqueConstraints().size() > 0) {
			log.debug("Adding unique constraints " + table.getUniqueConstraints().size());
			for (Iterator it = table.getUniqueConstraints().iterator(); it.hasNext();) {
				UniqueConstraint uc = (UniqueConstraint) it.next();
				Element unique = classElement.addElement("unique");
				for (Iterator colNames = uc.getColumnNames().iterator(); colNames.hasNext();) {
					unique.addElement("column").addAttribute("name", (String) colNames.next());
				}
			}
		}
	}
}