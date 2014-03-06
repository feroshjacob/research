/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.JavaFunction;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.JavaFunctionImpl#getTimeofCall <em>Timeof Call</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.JavaFunctionImpl#getParamname <em>Paramname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaFunctionImpl extends MinimalEObjectImpl.Container implements JavaFunction
{
  /**
   * The default value of the '{@link #getTimeofCall() <em>Timeof Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeofCall()
   * @generated
   * @ordered
   */
  protected static final String TIMEOF_CALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeofCall() <em>Timeof Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeofCall()
   * @generated
   * @ordered
   */
  protected String timeofCall = TIMEOF_CALL_EDEFAULT;

  /**
   * The default value of the '{@link #getParamname() <em>Paramname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamname()
   * @generated
   * @ordered
   */
  protected static final String PARAMNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParamname() <em>Paramname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamname()
   * @generated
   * @ordered
   */
  protected String paramname = PARAMNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavaFunctionImpl()
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
    return MapRedoopPackage.Literals.JAVA_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimeofCall()
  {
    return timeofCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeofCall(String newTimeofCall)
  {
    String oldTimeofCall = timeofCall;
    timeofCall = newTimeofCall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.JAVA_FUNCTION__TIMEOF_CALL, oldTimeofCall, timeofCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParamname()
  {
    return paramname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamname(String newParamname)
  {
    String oldParamname = paramname;
    paramname = newParamname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.JAVA_FUNCTION__PARAMNAME, oldParamname, paramname));
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
      case MapRedoopPackage.JAVA_FUNCTION__TIMEOF_CALL:
        return getTimeofCall();
      case MapRedoopPackage.JAVA_FUNCTION__PARAMNAME:
        return getParamname();
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
      case MapRedoopPackage.JAVA_FUNCTION__TIMEOF_CALL:
        setTimeofCall((String)newValue);
        return;
      case MapRedoopPackage.JAVA_FUNCTION__PARAMNAME:
        setParamname((String)newValue);
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
      case MapRedoopPackage.JAVA_FUNCTION__TIMEOF_CALL:
        setTimeofCall(TIMEOF_CALL_EDEFAULT);
        return;
      case MapRedoopPackage.JAVA_FUNCTION__PARAMNAME:
        setParamname(PARAMNAME_EDEFAULT);
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
      case MapRedoopPackage.JAVA_FUNCTION__TIMEOF_CALL:
        return TIMEOF_CALL_EDEFAULT == null ? timeofCall != null : !TIMEOF_CALL_EDEFAULT.equals(timeofCall);
      case MapRedoopPackage.JAVA_FUNCTION__PARAMNAME:
        return PARAMNAME_EDEFAULT == null ? paramname != null : !PARAMNAME_EDEFAULT.equals(paramname);
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
    result.append(" (timeofCall: ");
    result.append(timeofCall);
    result.append(", paramname: ");
    result.append(paramname);
    result.append(')');
    return result.toString();
  }

} //JavaFunctionImpl
