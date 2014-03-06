/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.Block;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.Reducer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reducer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl#getInkey <em>Inkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl#getInvalue <em>Invalue</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl#getOutKeyType <em>Out Key Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl#getOutValueType <em>Out Value Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReducerImpl extends MinimalEObjectImpl.Container implements Reducer
{
  /**
   * The default value of the '{@link #getInkey() <em>Inkey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInkey()
   * @generated
   * @ordered
   */
  protected static final String INKEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInkey() <em>Inkey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInkey()
   * @generated
   * @ordered
   */
  protected String inkey = INKEY_EDEFAULT;

  /**
   * The default value of the '{@link #getInvalue() <em>Invalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvalue()
   * @generated
   * @ordered
   */
  protected static final String INVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInvalue() <em>Invalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvalue()
   * @generated
   * @ordered
   */
  protected String invalue = INVALUE_EDEFAULT;

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
  protected ReducerImpl()
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
    return MapRedoopPackage.Literals.REDUCER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInkey()
  {
    return inkey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInkey(String newInkey)
  {
    String oldInkey = inkey;
    inkey = newInkey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__INKEY, oldInkey, inkey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInvalue()
  {
    return invalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvalue(String newInvalue)
  {
    String oldInvalue = invalue;
    invalue = newInvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__INVALUE, oldInvalue, invalue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__OUT_KEY_TYPE, oldOutKeyType, outKeyType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__OUT_VALUE_TYPE, oldOutValueType, outValueType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__TEXT, oldText, newText);
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
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.REDUCER__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.REDUCER__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.REDUCER__TEXT, newText, newText));
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
      case MapRedoopPackage.REDUCER__TEXT:
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
      case MapRedoopPackage.REDUCER__INKEY:
        return getInkey();
      case MapRedoopPackage.REDUCER__INVALUE:
        return getInvalue();
      case MapRedoopPackage.REDUCER__OUT_KEY_TYPE:
        return getOutKeyType();
      case MapRedoopPackage.REDUCER__OUT_VALUE_TYPE:
        return getOutValueType();
      case MapRedoopPackage.REDUCER__TEXT:
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
      case MapRedoopPackage.REDUCER__INKEY:
        setInkey((String)newValue);
        return;
      case MapRedoopPackage.REDUCER__INVALUE:
        setInvalue((String)newValue);
        return;
      case MapRedoopPackage.REDUCER__OUT_KEY_TYPE:
        setOutKeyType((String)newValue);
        return;
      case MapRedoopPackage.REDUCER__OUT_VALUE_TYPE:
        setOutValueType((String)newValue);
        return;
      case MapRedoopPackage.REDUCER__TEXT:
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
      case MapRedoopPackage.REDUCER__INKEY:
        setInkey(INKEY_EDEFAULT);
        return;
      case MapRedoopPackage.REDUCER__INVALUE:
        setInvalue(INVALUE_EDEFAULT);
        return;
      case MapRedoopPackage.REDUCER__OUT_KEY_TYPE:
        setOutKeyType(OUT_KEY_TYPE_EDEFAULT);
        return;
      case MapRedoopPackage.REDUCER__OUT_VALUE_TYPE:
        setOutValueType(OUT_VALUE_TYPE_EDEFAULT);
        return;
      case MapRedoopPackage.REDUCER__TEXT:
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
      case MapRedoopPackage.REDUCER__INKEY:
        return INKEY_EDEFAULT == null ? inkey != null : !INKEY_EDEFAULT.equals(inkey);
      case MapRedoopPackage.REDUCER__INVALUE:
        return INVALUE_EDEFAULT == null ? invalue != null : !INVALUE_EDEFAULT.equals(invalue);
      case MapRedoopPackage.REDUCER__OUT_KEY_TYPE:
        return OUT_KEY_TYPE_EDEFAULT == null ? outKeyType != null : !OUT_KEY_TYPE_EDEFAULT.equals(outKeyType);
      case MapRedoopPackage.REDUCER__OUT_VALUE_TYPE:
        return OUT_VALUE_TYPE_EDEFAULT == null ? outValueType != null : !OUT_VALUE_TYPE_EDEFAULT.equals(outValueType);
      case MapRedoopPackage.REDUCER__TEXT:
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
    result.append(" (inkey: ");
    result.append(inkey);
    result.append(", invalue: ");
    result.append(invalue);
    result.append(", outKeyType: ");
    result.append(outKeyType);
    result.append(", outValueType: ");
    result.append(outValueType);
    result.append(')');
    return result.toString();
  }

} //ReducerImpl
