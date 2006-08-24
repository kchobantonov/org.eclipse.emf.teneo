/**
 * <copyright>
 * </copyright>
 *
 * $Id: Cascade.java,v 1.1 2006/08/24 22:12:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cascade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Cascade#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCascade()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature'"
 * @generated
 */
public interface Cascade extends HbAnnotation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.annotations.pannotation.CascadeType}.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.annotations.pannotation.CascadeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.CascadeType
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getCascade_Value()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.CascadeType"
	 * @generated
	 */
	EList getValue();

} // Cascade