/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.ReadorWrite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reador Write</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReadorWriteImpl#getToken <em>Token</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReadorWriteImpl#getReadval <em>Readval</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ReadorWriteImpl#getWriteval <em>Writeval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadorWriteImpl extends MinimalEObjectImpl.Container implements ReadorWrite
{
  /**
   * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToken()
   * @generated
   * @ordered
   */
  protected static final String TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToken()
   * @generated
   * @ordered
   */
  protected String token = TOKEN_EDEFAULT;

  /**
   * The default value of the '{@link #getReadval() <em>Readval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadval()
   * @generated
   * @ordered
   */
  protected static final String READVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReadval() <em>Readval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadval()
   * @generated
   * @ordered
   */
  protected String readval = READVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getWriteval() <em>Writeval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWriteval()
   * @generated
   * @ordered
   */
  protected static final String WRITEVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWriteval() <em>Writeval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWriteval()
   * @generated
   * @ordered
   */
  protected String writeval = WRITEVAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReadorWriteImpl()
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
    return MapRedoopPackage.Literals.READOR_WRITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToken()
  {
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToken(String newToken)
  {
    String oldToken = token;
    token = newToken;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.READOR_WRITE__TOKEN, oldToken, token));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReadval()
  {
    return readval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadval(String newReadval)
  {
    String oldReadval = readval;
    readval = newReadval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.READOR_WRITE__READVAL, oldReadval, readval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWriteval()
  {
    return writeval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWriteval(String newWriteval)
  {
    String oldWriteval = writeval;
    writeval = newWriteval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.READOR_WRITE__WRITEVAL, oldWriteval, writeval));
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
      case MapRedoopPackage.READOR_WRITE__TOKEN:
        return getToken();
      case MapRedoopPackage.READOR_WRITE__READVAL:
        return getReadval();
      case MapRedoopPackage.READOR_WRITE__WRITEVAL:
        return getWriteval();
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
      case MapRedoopPackage.READOR_WRITE__TOKEN:
        setToken((String)newValue);
        return;
      case MapRedoopPackage.READOR_WRITE__READVAL:
        setReadval((String)newValue);
        return;
      case MapRedoopPackage.READOR_WRITE__WRITEVAL:
        setWriteval((String)newValue);
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
      case MapRedoopPackage.READOR_WRITE__TOKEN:
        setToken(TOKEN_EDEFAULT);
        return;
      case MapRedoopPackage.READOR_WRITE__READVAL:
        setReadval(READVAL_EDEFAULT);
        return;
      case MapRedoopPackage.READOR_WRITE__WRITEVAL:
        setWriteval(WRITEVAL_EDEFAULT);
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
      case MapRedoopPackage.READOR_WRITE__TOKEN:
        return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
      case MapRedoopPackage.READOR_WRITE__READVAL:
        return READVAL_EDEFAULT == null ? readval != null : !READVAL_EDEFAULT.equals(readval);
      case MapRedoopPackage.READOR_WRITE__WRITEVAL:
        return WRITEVAL_EDEFAULT == null ? writeval != null : !WRITEVAL_EDEFAULT.equals(writeval);
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
    result.append(" (token: ");
    result.append(token);
    result.append(", readval: ");
    result.append(readval);
    result.append(", writeval: ");
    result.append(writeval);
    result.append(')');
    return result.toString();
  }

} //ReadorWriteImpl
