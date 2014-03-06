/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.Type;
import cs.ua.edu.se.mapRedoop.TypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.TypeRefImpl#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.TypeRefImpl#isMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRefImpl extends MinimalEObjectImpl.Container implements TypeRef
{
  /**
   * The cached value of the '{@link #getReferenced() <em>Referenced</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenced()
   * @generated
   * @ordered
   */
  protected Type referenced;

  /**
   * The default value of the '{@link #isMulti() <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMulti()
   * @generated
   * @ordered
   */
  protected static final boolean MULTI_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMulti() <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMulti()
   * @generated
   * @ordered
   */
  protected boolean multi = MULTI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeRefImpl()
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
    return MapRedoopPackage.Literals.TYPE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReferenced()
  {
    return referenced;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferenced(Type newReferenced, NotificationChain msgs)
  {
    Type oldReferenced = referenced;
    referenced = newReferenced;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.TYPE_REF__REFERENCED, oldReferenced, newReferenced);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenced(Type newReferenced)
  {
    if (newReferenced != referenced)
    {
      NotificationChain msgs = null;
      if (referenced != null)
        msgs = ((InternalEObject)referenced).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.TYPE_REF__REFERENCED, null, msgs);
      if (newReferenced != null)
        msgs = ((InternalEObject)newReferenced).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.TYPE_REF__REFERENCED, null, msgs);
      msgs = basicSetReferenced(newReferenced, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.TYPE_REF__REFERENCED, newReferenced, newReferenced));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMulti()
  {
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMulti(boolean newMulti)
  {
    boolean oldMulti = multi;
    multi = newMulti;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.TYPE_REF__MULTI, oldMulti, multi));
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
      case MapRedoopPackage.TYPE_REF__REFERENCED:
        return basicSetReferenced(null, msgs);
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
      case MapRedoopPackage.TYPE_REF__REFERENCED:
        return getReferenced();
      case MapRedoopPackage.TYPE_REF__MULTI:
        return isMulti();
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
      case MapRedoopPackage.TYPE_REF__REFERENCED:
        setReferenced((Type)newValue);
        return;
      case MapRedoopPackage.TYPE_REF__MULTI:
        setMulti((Boolean)newValue);
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
      case MapRedoopPackage.TYPE_REF__REFERENCED:
        setReferenced((Type)null);
        return;
      case MapRedoopPackage.TYPE_REF__MULTI:
        setMulti(MULTI_EDEFAULT);
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
      case MapRedoopPackage.TYPE_REF__REFERENCED:
        return referenced != null;
      case MapRedoopPackage.TYPE_REF__MULTI:
        return multi != MULTI_EDEFAULT;
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
    result.append(" (multi: ");
    result.append(multi);
    result.append(')');
    return result.toString();
  }

} //TypeRefImpl
