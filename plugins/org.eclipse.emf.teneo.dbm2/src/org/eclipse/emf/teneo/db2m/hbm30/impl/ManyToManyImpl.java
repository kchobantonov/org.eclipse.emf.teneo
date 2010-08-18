/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToManyImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect;
import org.eclipse.emf.teneo.db2m.hbm30.Filter;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.Notfound;
import org.eclipse.emf.teneo.db2m.hbm30.Outerjoin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getNotFound <em>Not Found</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getOuterJoin <em>Outer Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToManyImpl#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToManyImpl extends EObjectImpl implements ManyToMany {
	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected EList<Meta> meta;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn1() <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn1() <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1()
	 * @generated
	 * @ordered
	 */
	protected String column1 = COLUMN1_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBED_XML_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected boolean embedXml = EMBED_XML_EDEFAULT;

	/**
	 * This is true if the Embed Xml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean embedXmlESet;

	/**
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final FetchJoinSelect FETCH_EDEFAULT = FetchJoinSelect.JOIN;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected FetchJoinSelect fetch = FETCH_EDEFAULT;

	/**
	 * This is true if the Fetch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fetchESet;

	/**
	 * The default value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected String foreignKey = FOREIGN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula1() <em>Formula1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula1()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula1() <em>Formula1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula1()
	 * @generated
	 * @ordered
	 */
	protected String formula1 = FORMULA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected static final LazyFalseProxy LAZY_EDEFAULT = LazyFalseProxy.FALSE;

	/**
	 * The cached value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected LazyFalseProxy lazy = LAZY_EDEFAULT;

	/**
	 * This is true if the Lazy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lazyESet;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotFound() <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotFound()
	 * @generated
	 * @ordered
	 */
	protected static final Notfound NOT_FOUND_EDEFAULT = Notfound.EXCEPTION;

	/**
	 * The cached value of the '{@link #getNotFound() <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotFound()
	 * @generated
	 * @ordered
	 */
	protected Notfound notFound = NOT_FOUND_EDEFAULT;

	/**
	 * This is true if the Not Found attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notFoundESet;

	/**
	 * The default value of the '{@link #getOuterJoin() <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJoin()
	 * @generated
	 * @ordered
	 */
	protected static final Outerjoin OUTER_JOIN_EDEFAULT = Outerjoin.TRUE;

	/**
	 * The cached value of the '{@link #getOuterJoin() <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJoin()
	 * @generated
	 * @ordered
	 */
	protected Outerjoin outerJoin = OUTER_JOIN_EDEFAULT;

	/**
	 * This is true if the Outer Join attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outerJoinESet;

	/**
	 * The default value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String propertyRef = PROPERTY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * This is true if the Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueESet;

	/**
	 * The default value of the '{@link #getWhere() <em>Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected static final String WHERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected String where = WHERE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyToManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getManyToMany();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.MANY_TO_MANY__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.MANY_TO_MANY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		return getGroup().list(Hbm30Package.eINSTANCE.getManyToMany_Column());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		return getGroup().list(Hbm30Package.eINSTANCE.getManyToMany_Formula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this, Hbm30Package.MANY_TO_MANY__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn1() {
		return column1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn1(String newColumn1) {
		String oldColumn1 = column1;
		column1 = newColumn1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedXml() {
		return embedXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedXml(boolean newEmbedXml) {
		boolean oldEmbedXml = embedXml;
		embedXml = newEmbedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXmlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__EMBED_XML, oldEmbedXml, embedXml, !oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEmbedXml() {
		boolean oldEmbedXml = embedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXml = EMBED_XML_EDEFAULT;
		embedXmlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_MANY__EMBED_XML, oldEmbedXml, EMBED_XML_EDEFAULT, oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEmbedXml() {
		return embedXmlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__ENTITY_NAME, oldEntityName, entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchJoinSelect getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(FetchJoinSelect newFetch) {
		FetchJoinSelect oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		boolean oldFetchESet = fetchESet;
		fetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__FETCH, oldFetch, fetch, !oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFetch() {
		FetchJoinSelect oldFetch = fetch;
		boolean oldFetchESet = fetchESet;
		fetch = FETCH_EDEFAULT;
		fetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_MANY__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFetch() {
		return fetchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(String newForeignKey) {
		String oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__FOREIGN_KEY, oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula1() {
		return formula1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula1(String newFormula1) {
		String oldFormula1 = formula1;
		formula1 = newFormula1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__FORMULA1, oldFormula1, formula1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyFalseProxy getLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(LazyFalseProxy newLazy) {
		LazyFalseProxy oldLazy = lazy;
		lazy = newLazy == null ? LAZY_EDEFAULT : newLazy;
		boolean oldLazyESet = lazyESet;
		lazyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__LAZY, oldLazy, lazy, !oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLazy() {
		LazyFalseProxy oldLazy = lazy;
		boolean oldLazyESet = lazyESet;
		lazy = LAZY_EDEFAULT;
		lazyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_MANY__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLazy() {
		return lazyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notfound getNotFound() {
		return notFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotFound(Notfound newNotFound) {
		Notfound oldNotFound = notFound;
		notFound = newNotFound == null ? NOT_FOUND_EDEFAULT : newNotFound;
		boolean oldNotFoundESet = notFoundESet;
		notFoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__NOT_FOUND, oldNotFound, notFound, !oldNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotFound() {
		Notfound oldNotFound = notFound;
		boolean oldNotFoundESet = notFoundESet;
		notFound = NOT_FOUND_EDEFAULT;
		notFoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_MANY__NOT_FOUND, oldNotFound, NOT_FOUND_EDEFAULT, oldNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotFound() {
		return notFoundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outerjoin getOuterJoin() {
		return outerJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterJoin(Outerjoin newOuterJoin) {
		Outerjoin oldOuterJoin = outerJoin;
		outerJoin = newOuterJoin == null ? OUTER_JOIN_EDEFAULT : newOuterJoin;
		boolean oldOuterJoinESet = outerJoinESet;
		outerJoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__OUTER_JOIN, oldOuterJoin, outerJoin, !oldOuterJoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOuterJoin() {
		Outerjoin oldOuterJoin = outerJoin;
		boolean oldOuterJoinESet = outerJoinESet;
		outerJoin = OUTER_JOIN_EDEFAULT;
		outerJoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_MANY__OUTER_JOIN, oldOuterJoin, OUTER_JOIN_EDEFAULT, oldOuterJoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOuterJoin() {
		return outerJoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyRef() {
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRef(String newPropertyRef) {
		String oldPropertyRef = propertyRef;
		propertyRef = newPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__PROPERTY_REF, oldPropertyRef, propertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		boolean oldUniqueESet = uniqueESet;
		uniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__UNIQUE, oldUnique, unique, !oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnique() {
		boolean oldUnique = unique;
		boolean oldUniqueESet = uniqueESet;
		unique = UNIQUE_EDEFAULT;
		uniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_MANY__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnique() {
		return uniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(String newWhere) {
		String oldWhere = where;
		where = newWhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_MANY__WHERE, oldWhere, where));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.MANY_TO_MANY__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MANY_TO_MANY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MANY_TO_MANY__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MANY_TO_MANY__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.MANY_TO_MANY__META:
				return getMeta();
			case Hbm30Package.MANY_TO_MANY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.MANY_TO_MANY__COLUMN:
				return getColumn();
			case Hbm30Package.MANY_TO_MANY__FORMULA:
				return getFormula();
			case Hbm30Package.MANY_TO_MANY__FILTER:
				return getFilter();
			case Hbm30Package.MANY_TO_MANY__CLASS:
				return getClass_();
			case Hbm30Package.MANY_TO_MANY__COLUMN1:
				return getColumn1();
			case Hbm30Package.MANY_TO_MANY__EMBED_XML:
				return isEmbedXml();
			case Hbm30Package.MANY_TO_MANY__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.MANY_TO_MANY__FETCH:
				return getFetch();
			case Hbm30Package.MANY_TO_MANY__FOREIGN_KEY:
				return getForeignKey();
			case Hbm30Package.MANY_TO_MANY__FORMULA1:
				return getFormula1();
			case Hbm30Package.MANY_TO_MANY__LAZY:
				return getLazy();
			case Hbm30Package.MANY_TO_MANY__NODE:
				return getNode();
			case Hbm30Package.MANY_TO_MANY__NOT_FOUND:
				return getNotFound();
			case Hbm30Package.MANY_TO_MANY__OUTER_JOIN:
				return getOuterJoin();
			case Hbm30Package.MANY_TO_MANY__PROPERTY_REF:
				return getPropertyRef();
			case Hbm30Package.MANY_TO_MANY__UNIQUE:
				return isUnique();
			case Hbm30Package.MANY_TO_MANY__WHERE:
				return getWhere();
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
			case Hbm30Package.MANY_TO_MANY__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends Filter>)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__EMBED_XML:
				setEmbedXml((Boolean)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__FETCH:
				setFetch((FetchJoinSelect)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__FOREIGN_KEY:
				setForeignKey((String)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__FORMULA1:
				setFormula1((String)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__LAZY:
				setLazy((LazyFalseProxy)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__NOT_FOUND:
				setNotFound((Notfound)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__OUTER_JOIN:
				setOuterJoin((Outerjoin)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__PROPERTY_REF:
				setPropertyRef((String)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case Hbm30Package.MANY_TO_MANY__WHERE:
				setWhere((String)newValue);
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
			case Hbm30Package.MANY_TO_MANY__META:
				getMeta().clear();
				return;
			case Hbm30Package.MANY_TO_MANY__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.MANY_TO_MANY__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.MANY_TO_MANY__FORMULA:
				getFormula().clear();
				return;
			case Hbm30Package.MANY_TO_MANY__FILTER:
				getFilter().clear();
				return;
			case Hbm30Package.MANY_TO_MANY__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_MANY__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_MANY__EMBED_XML:
				unsetEmbedXml();
				return;
			case Hbm30Package.MANY_TO_MANY__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_MANY__FETCH:
				unsetFetch();
				return;
			case Hbm30Package.MANY_TO_MANY__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_MANY__FORMULA1:
				setFormula1(FORMULA1_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_MANY__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.MANY_TO_MANY__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_MANY__NOT_FOUND:
				unsetNotFound();
				return;
			case Hbm30Package.MANY_TO_MANY__OUTER_JOIN:
				unsetOuterJoin();
				return;
			case Hbm30Package.MANY_TO_MANY__PROPERTY_REF:
				setPropertyRef(PROPERTY_REF_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_MANY__UNIQUE:
				unsetUnique();
				return;
			case Hbm30Package.MANY_TO_MANY__WHERE:
				setWhere(WHERE_EDEFAULT);
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
			case Hbm30Package.MANY_TO_MANY__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.MANY_TO_MANY__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.MANY_TO_MANY__COLUMN:
				return !getColumn().isEmpty();
			case Hbm30Package.MANY_TO_MANY__FORMULA:
				return !getFormula().isEmpty();
			case Hbm30Package.MANY_TO_MANY__FILTER:
				return filter != null && !filter.isEmpty();
			case Hbm30Package.MANY_TO_MANY__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.MANY_TO_MANY__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.MANY_TO_MANY__EMBED_XML:
				return isSetEmbedXml();
			case Hbm30Package.MANY_TO_MANY__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.MANY_TO_MANY__FETCH:
				return isSetFetch();
			case Hbm30Package.MANY_TO_MANY__FOREIGN_KEY:
				return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
			case Hbm30Package.MANY_TO_MANY__FORMULA1:
				return FORMULA1_EDEFAULT == null ? formula1 != null : !FORMULA1_EDEFAULT.equals(formula1);
			case Hbm30Package.MANY_TO_MANY__LAZY:
				return isSetLazy();
			case Hbm30Package.MANY_TO_MANY__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.MANY_TO_MANY__NOT_FOUND:
				return isSetNotFound();
			case Hbm30Package.MANY_TO_MANY__OUTER_JOIN:
				return isSetOuterJoin();
			case Hbm30Package.MANY_TO_MANY__PROPERTY_REF:
				return PROPERTY_REF_EDEFAULT == null ? propertyRef != null : !PROPERTY_REF_EDEFAULT.equals(propertyRef);
			case Hbm30Package.MANY_TO_MANY__UNIQUE:
				return isSetUnique();
			case Hbm30Package.MANY_TO_MANY__WHERE:
				return WHERE_EDEFAULT == null ? where != null : !WHERE_EDEFAULT.equals(where);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", class: ");
		result.append(class_);
		result.append(", column1: ");
		result.append(column1);
		result.append(", embedXml: ");
		if (embedXmlESet) result.append(embedXml); else result.append("<unset>");
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", fetch: ");
		if (fetchESet) result.append(fetch); else result.append("<unset>");
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(", formula1: ");
		result.append(formula1);
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
		result.append(", node: ");
		result.append(node);
		result.append(", notFound: ");
		if (notFoundESet) result.append(notFound); else result.append("<unset>");
		result.append(", outerJoin: ");
		if (outerJoinESet) result.append(outerJoin); else result.append("<unset>");
		result.append(", propertyRef: ");
		result.append(propertyRef);
		result.append(", unique: ");
		if (uniqueESet) result.append(unique); else result.append("<unset>");
		result.append(", where: ");
		result.append(where);
		result.append(')');
		return result.toString();
	}

} //ManyToManyImpl
