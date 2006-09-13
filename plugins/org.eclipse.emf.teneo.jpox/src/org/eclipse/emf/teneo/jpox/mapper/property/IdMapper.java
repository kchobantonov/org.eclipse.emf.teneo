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
 * $Id: IdMapper.java,v 1.3 2006/09/13 10:39:52 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.mapper.property;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.GeneratedValue;
import org.eclipse.emf.teneo.annotations.pannotation.GenerationType;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.jpox.mapper.AbstractMapper;
import org.eclipse.emf.teneo.jpox.mapper.MappingContext;
import org.eclipse.emf.teneo.simpledom.Element;

/**
 * The abstract class for different mappers.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */

public class IdMapper extends AbstractMapper {
	/** The logger for all these exceptions */
	protected static final Log log = LogFactory.getLog(IdMapper.class);

	/** Constructor */
	public IdMapper(MappingContext mappingContext) {
		super(mappingContext);
	}

	/** Process the id annotation */
	public void map(PAnnotatedEAttribute aAttribute, Element classElement) {
		log.debug("Processing id annotation:" + aAttribute.getAnnotatedElement().getName());
		Element fieldElement = classElement.addElement("field");
		fieldElement.addAttribute("name", namingHandler.correctName(mappingContext, (EStructuralFeature) aAttribute.getAnnotatedElement()))
				.addAttribute("persistence-modifier", "persistent");
		fieldElement.addAttribute("primary-key", "true");

		// handle the column
		Column overridden = mappingContext.getOverride(aAttribute);
		if (overridden != null) {
			mappingContext.getColumnMapper().map(overridden, fieldElement);
		} else if (aAttribute.getColumn() != null) {
			mappingContext.getColumnMapper().map(aAttribute.getColumn(), fieldElement);
		} else if (mappingContext.getEmbeddingFeature() != null) { //embedded at least override
			// TODO: check illegal, embedded component can not really have an id
			final PAnnotatedEReference pae = mappingContext.getEmbeddingFeature();
			final String name = pae.getAnnotatedEReference().getName() + "_" + aAttribute.getAnnotatedEAttribute().getName() + "_ID";
			fieldElement.addAttribute("column", name);
		}

		GeneratedValue gv = aAttribute.getGeneratedValue();
		if (gv != null) { // normal primary key
			switch (gv.getStrategy().getValue()) {
			case GenerationType.AUTO:
				fieldElement.addAttribute("value-strategy", "auto");
				break;
			case GenerationType.SEQUENCE:
				log.warn("The identity value-strategy of sequence is only supported for a limited set of databases");
				fieldElement.addAttribute("value-strategy", "sequence");
				break;
			case GenerationType.IDENTITY:
				fieldElement.addAttribute("value-strategy", "identity");
				break;
			case GenerationType.TABLE:
				fieldElement.addAttribute("value-strategy", "increment");
				break;
			default:
				log.error("VALUE-STRATEGY: " + gv.getStrategy().getName() + " not supported for field "
						+ aAttribute.getAnnotatedElement().getName());
			}
			fieldElement.addAttribute("indexed", "true");

			// get the sequence from the global generator
			if (gv.getGenerator() != null) {
				final SequenceGenerator sg = aAttribute.getPaModel().getSequenceGenerator(aAttribute.getAnnotatedEAttribute(),
						gv.getGenerator());
				fieldElement.addAttribute("sequence", sg.getSequenceName());
			}
		}
	}

}