/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.Argument;
import cs.ua.edu.se.mapRedoop.Block;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.Mapper;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getInkey <em>Inkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getInvalue <em>Invalue</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getOutKeyType <em>Out Key Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getOutValueType <em>Out Value Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapperImpl extends MinimalEObjectImpl.Container implements Mapper
{
  /**
   * The cached value of the '{@link #getInkey() <em>Inkey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInkey()
   * @generated
   * @ordered
   */
  protected Argument inkey;

  /**
   * The cached value of the '{@link #getInvalue() <em>Invalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvalue()
   * @generated
   * @ordered
   */
  protected Argument invalue;

  /**
   * The default value of the '{@link #getOutKeyType() <em>Out Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutKeyType()
   * @generated
   * @ordered
   */
  protected static final String OUT_KEY_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutKeyType() <em>Out Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutKeyType()
   * @generated
   * @ordered
   */
  protected String outKeyType = OUT_KEY_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getOutValueType() <em>Out Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutValueType()
   * @generated
   * @ordered
   */
  protected static final String OUT_VALUE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutValueType() <em>Out Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutValueType()
   * @generated
   * @ordered
   */
  protected String outValueType = OUT_VALUE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected Block text;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapperImpl()
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
    return MapRedoopPackage.Literals.MAPPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getInkey()
  {
    return inkey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInkey(Argument newInkey, NotificationChain msgs)
  {
    Argument oldInkey = inkey;
    inkey = newInkey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INKEY, oldInkey, newInkey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInkey(Argument newInkey)
  {
    if (newInkey != inkey)
    {
      NotificationChain msgs = null;
      if (inkey != null)
        msgs = ((InternalEObject)inkey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INKEY, null, msgs);
      if (newInkey != null)
        msgs = ((InternalEObject)newInkey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INKEY, null, msgs);
      msgs = basicSetInkey(newInkey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INKEY, newInkey, newInkey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getInvalue()
  {
    return invalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvalue(Argument newInvalue, NotificationChain msgs)
  {
    Argument oldInvalue = invalue;
    invalue = newInvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INVALUE, oldInvalue, newInvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvalue(Argument newInvalue)
  {
    if (newInvalue != invalue)
    {
      NotificationChain msgs = null;
      if (invalue != null)
        msgs = ((InternalEObject)invalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INVALUE, null, msgs);
      if (newInvalue != null)
        msgs = ((InternalEObject)newInvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__INVALUE, null, msgs);
      msgs = basicSetInvalue(newInvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__INVALUE, newInvalue, newInvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutKeyType()
  {
    return outKeyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutKeyType(String newOutKeyType)
  {
    String oldOutKeyType = outKeyType;
    outKeyType = newOutKeyType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__OUT_KEY_TYPE, oldOutKeyType, outKeyType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutValueType()
  {
    return outValueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutValueType(String newOutValueType)
  {
    String oldOutValueType = outValueType;
    outValueType = newOutValueType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__OUT_VALUE_TYPE, oldOutValueType, outValueType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(Block newText, NotificationChain msgs)
  {
    Block oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(Block newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MAPPER__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MAPPER__TEXT, newText, newText));
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
      case MapRedoopPackage.MAPPER__INKEY:
        return basicSetInkey(null, msgs);
      case MapRedoopPackage.MAPPER__INVALUE:
        return basicSetInvalue(null, msgs);
      case MapRedoopPackage.MAPPER__TEXT:
        return basicSetText(null, msgs);
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
      case MapRedoopPackage.MAPPER__INKEY:
        return getInkey();
      case MapRedoopPackage.MAPPER__INVALUE:
        return getInvalue();
      case MapRedoopPackage.MAPPER__OUT_KEY_TYPE:
        return getOutKeyType();
      case MapRedoopPackage.MAPPER__OUT_VALUE_TYPE:
        return getOutValueType();
      case MapRedoopPackage.MAPPER__TEXT:
        return getText();
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
      case MapRedoopPackage.MAPPER__INKEY:
        setInkey((Argument)newValue);
        return;
      case MapRedoopPackage.MAPPER__INVALUE:
        setInvalue((Argument)newValue);
        return;
      case MapRedoopPackage.MAPPER__OUT_KEY_TYPE:
        setOutKeyType((String)newValue);
        return;
      case MapRedoopPackage.MAPPER__OUT_VALUE_TYPE:
        setOutValueType((String)newValue);
        return;
      case MapRedoopPackage.MAPPER__TEXT:
        setText((Block)newValue);
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
      case MapRedoopPackage.MAPPER__INKEY:
        setInkey((Argument)null);
        return;
      case MapRedoopPackage.MAPPER__INVALUE:
        setInvalue((Argument)null);
        return;
      case MapRedoopPackage.MAPPER__OUT_KEY_TYPE:
        setOutKeyType(OUT_KEY_TYPE_EDEFAULT);
        return;
      case MapRedoopPackage.MAPPER__OUT_VALUE_TYPE:
        setOutValueType(OUT_VALUE_TYPE_EDEFAULT);
        return;
      case MapRedoopPackage.MAPPER__TEXT:
        setText((Block)null);
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
      case MapRedoopPackage.MAPPER__INKEY:
        return inkey != null;
      case MapRedoopPackage.MAPPER__INVALUE:
        return invalue != null;
      case MapRedoopPackage.MAPPER__OUT_KEY_TYPE:
        return OUT_KEY_TYPE_EDEFAULT == null ? outKeyType != null : !OUT_KEY_TYPE_EDEFAULT.equals(outKeyType);
      case MapRedoopPackage.MAPPER__OUT_VALUE_TYPE:
        return OUT_VALUE_TYPE_EDEFAULT == null ? outValueType != null : !OUT_VALUE_TYPE_EDEFAULT.equals(outValueType);
      case MapRedoopPackage.MAPPER__TEXT:
        return text != null;
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
    result.append(" (outKeyType: ");
    result.append(outKeyType);
    result.append(", outValueType: ");
    result.append(outValueType);
    result.append(')');
    return result.toString();
  }

} //MapperImpl
