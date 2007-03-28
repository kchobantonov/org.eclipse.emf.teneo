/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockValidator.java,v 1.1 2007/03/28 13:56:51 mtaal Exp $
 */
package lobj.validation;

import lobj.AccessControl;
import lobj.BlockMeta;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link lobj.Block}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BlockValidator {
	boolean validate();

	boolean validateBlockMeta(BlockMeta value);
	boolean validateExternalMetadata(EList value);
	boolean validateAccessControl(AccessControl value);
}
