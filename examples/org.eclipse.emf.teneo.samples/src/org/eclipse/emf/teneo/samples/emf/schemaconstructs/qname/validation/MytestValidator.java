/**
 * <copyright>
 * </copyright>
 *
 * $Id: MytestValidator.java,v 1.1 2007/11/15 19:56:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.validation;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.qname.Mytest}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MytestValidator {
	boolean validate();

	boolean validateDescription(String value);
	boolean validateName(QName value);

	boolean validateNames(EList<QName> value);
}
