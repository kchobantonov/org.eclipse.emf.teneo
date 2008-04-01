/**
 * <copyright>
 * </copyright>
 *
 * $Id: MindmapXMLProcessor.java,v 1.1 2008/03/16 21:20:25 mtaal Exp $
 */
package org.eclipse.gmf.examples.mindmap.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.gmf.examples.mindmap.MindmapPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MindmapXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindmapXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		MindmapPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the MindmapResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new MindmapResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MindmapResourceFactoryImpl());
		}
		return registrations;
	}

} //MindmapXMLProcessor