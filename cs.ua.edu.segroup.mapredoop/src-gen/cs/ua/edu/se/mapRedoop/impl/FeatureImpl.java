/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.Feature;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.ReadorWrite;
import cs.ua.edu.se.mapRedoop.TypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.FeatureImpl#getReadorWrite <em>Reador Write</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeRef type;

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
   * The cached value of the '{@link #getReadorWrite() <em>Reador Write</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadorWrite()
   * @generated
   * @ordered
   */
  protected ReadorWrite readorWrite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MapRedoopPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeRef newType, NotificationChain msgs)
  {
    TypeRef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.FEATURE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeRef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.FEATURE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.FEATURE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.FEATURE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.FEATURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReadorWrite getReadorWrite()
  {
    return readorWrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReadorWrite(ReadorWrite newReadorWrite, NotificationChain msgs)
  {
    ReadorWrite oldReadorWrite = readorWrite;
    readorWrite = newReadorWrite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.FEATURE__READOR_WRITE, oldReadorWrite, newReadorWrite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadorWrite(ReadorWrite newReadorWrite)
  {
    if (newReadorWrite != readorWrite)
    {
      NotificationChain msgs = null;
      if (readorWrite != null)
        msgs = ((InternalEObject)readorWrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.FEATURE__READOR_WRITE, null, msgs);
      if (newReadorWrite != null)
        msgs = ((InternalEObject)newReadorWrite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.FEATURE__READOR_WRITE, null, msgs);
      msgs = basicSetReadorWrite(newReadorWrite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.FEATURE__READOR_WRITE, newReadorWrite, newReadorWrite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MapRedoopPackage.FEATURE__TYPE:
        return basicSetType(null, msgs);
      case MapRedoopPackage.FEATURE__READOR_WRITE:
        return basicSetReadorWrite(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MapRedoopPackage.FEATURE__TYPE:
        return getType();
      case MapRedoopPackage.FEATURE__NAME:
        return getName();
      case MapRedoopPackage.FEATURE__READOR_WRITE:
        return getReadorWrite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MapRedoopPackage.FEATURE__TYPE:
        setType((TypeRef)newValue);
        return;
      case MapRedoopPackage.FEATURE__NAME:
        setName((String)newValue);
        return;
      case MapRedoopPackage.FEATURE__READOR_WRITE:
        setReadorWrite((ReadorWrite)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MapRedoopPackage.FEATURE__TYPE:
        setType((TypeRef)null);
        return;
      case MapRedoopPackage.FEATURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MapRedoopPackage.FEATURE__READOR_WRITE:
        setReadorWrite((ReadorWrite)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MapRedoopPackage.FEATURE__TYPE:
        return type != null;
      case MapRedoopPackage.FEATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MapRedoopPackage.FEATURE__READOR_WRITE:
        return readorWrite != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
