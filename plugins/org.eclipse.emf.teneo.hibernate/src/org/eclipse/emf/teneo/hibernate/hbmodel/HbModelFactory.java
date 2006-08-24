/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbModelFactory.java,v 1.1 2006/08/24 22:12:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage
 * @generated
 */
public interface HbModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HbModelFactory eINSTANCE = org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hb Annotated EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hb Annotated EAttribute</em>'.
	 * @generated
	 */
	HbAnnotatedEAttribute createHbAnnotatedEAttribute();

	/**
	 * Returns a new object of class '<em>Hb Annotated EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hb Annotated EClass</em>'.
	 * @generated
	 */
	HbAnnotatedEClass createHbAnnotatedEClass();

	/**
	 * Returns a new object of class '<em>Hb Annotated EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hb Annotated EPackage</em>'.
	 * @generated
	 */
	HbAnnotatedEPackage createHbAnnotatedEPackage();

	/**
	 * Returns a new object of class '<em>Hb Annotated EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hb Annotated EReference</em>'.
	 * @generated
	 */
	HbAnnotatedEReference createHbAnnotatedEReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HbModelPackage getHbModelPackage();

} //HbModelFactory
