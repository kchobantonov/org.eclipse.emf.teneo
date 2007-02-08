/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeDefImpl.java,v 1.4 2007/02/08 23:13:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage;
import org.eclipse.emf.teneo.hibernate.hbannotation.Parameter;
import org.eclipse.emf.teneo.hibernate.hbannotation.TypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.TypeDefImpl#getTypeClass <em>Type Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefImpl extends EObjectImpl implements TypeDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The cached value of the '{@link #getEModelElement() <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEModelElement()
	 * @generated
	 * @ordered
	 */
	protected EModelElement eModelElement = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters = null;

	/**
	 * The default value of the '{@link #getTypeClass() <em>Type Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeClass() <em>Type Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeClass()
	 * @generated
	 * @ordered
	 */
	protected String typeClass = TYPE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbAnnotationPackage.Literals.TYPE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eModelElement != null && eModelElement.eIsProxy()) {
			InternalEObject oldEModelElement = (InternalEObject)eModelElement;
			eModelElement = (EModelElement)eResolveProxy(oldEModelElement);
			if (eModelElement != oldEModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbAnnotationPackage.TYPE_DEF__EMODEL_ELEMENT, oldEModelElement, eModelElement));
			}
		}
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetEModelElement() {
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		EModelElement oldEModelElement = eModelElement;
		eModelElement = newEModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbAnnotationPackage.TYPE_DEF__EMODEL_ELEMENT, oldEModelElement, eModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbAnnotationPackage.TYPE_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, HbAnnotationPackage.TYPE_DEF__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeClass() {
		return typeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeClass(String newTypeClass) {
		String oldTypeClass = typeClass;
		typeClass = newTypeClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbAnnotationPackage.TYPE_DEF__TYPE_CLASS, oldTypeClass, typeClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HbAnnotationPackage.TYPE_DEF__EMODEL_ELEMENT:
				if (resolve) return getEModelElement();
				return basicGetEModelElement();
			case HbAnnotationPackage.TYPE_DEF__NAME:
				return getName();
			case HbAnnotationPackage.TYPE_DEF__PARAMETERS:
				return getParameters();
			case HbAnnotationPackage.TYPE_DEF__TYPE_CLASS:
				return getTypeClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HbAnnotationPackage.TYPE_DEF__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case HbAnnotationPackage.TYPE_DEF__NAME:
				setName((String)newValue);
				return;
			case HbAnnotationPackage.TYPE_DEF__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case HbAnnotationPackage.TYPE_DEF__TYPE_CLASS:
				setTypeClass((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HbAnnotationPackage.TYPE_DEF__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case HbAnnotationPackage.TYPE_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HbAnnotationPackage.TYPE_DEF__PARAMETERS:
				getParameters().clear();
				return;
			case HbAnnotationPackage.TYPE_DEF__TYPE_CLASS:
				setTypeClass(TYPE_CLASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HbAnnotationPackage.TYPE_DEF__EMODEL_ELEMENT:
				return eModelElement != null;
			case HbAnnotationPackage.TYPE_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HbAnnotationPackage.TYPE_DEF__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case HbAnnotationPackage.TYPE_DEF__TYPE_CLASS:
				return TYPE_CLASS_EDEFAULT == null ? typeClass != null : !TYPE_CLASS_EDEFAULT.equals(typeClass);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", typeClass: ");
		result.append(typeClass);
		result.append(')');
		return result.toString();
	}

} //TypeDefImpl