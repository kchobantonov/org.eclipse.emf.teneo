/**
 * <copyright>
 * </copyright>
 *
 * $Id: TWriterValidator.java,v 1.2 2010/02/06 20:50:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TBook;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TWriter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TWriterValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateBook(TBook value);

	boolean validateBook(EObject value);
}
