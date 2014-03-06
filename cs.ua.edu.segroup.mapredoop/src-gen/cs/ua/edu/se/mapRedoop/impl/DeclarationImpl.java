/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.Declaration;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.DeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.DeclarationImpl#getSuperName <em>Super Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration
{
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
   * The default value of the '{@link #getSuperName() <em>Super Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperName()
   * @generated
   * @ordered
   */
  protected static final String SUPER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuperName() <em>Super Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperName()
   * @generated
   * @ordered
   */
  protected String superName = SUPER_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationImpl()
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
    return MapRedoopPackage.Literals.DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuperName()
  {
    return superName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperName(String newSuperName)
  {
    String oldSuperName = superName;
    superName = newSuperName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.DECLARATION__SUPER_NAME, oldSuperName, superName));
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
      case MapRedoopPackage.DECLARATION__NAME:
        return getName();
      case MapRedoopPackage.DECLARATION__SUPER_NAME:
        return getSuperName();
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
      case MapRedoopPackage.DECLARATION__NAME:
        setName((String)newValue);
        return;
      case MapRedoopPackage.DECLARATION__SUPER_NAME:
        setSuperName((String)newValue);
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
      case MapRedoopPackage.DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MapRedoopPackage.DECLARATION__SUPER_NAME:
        setSuperName(SUPER_NAME_EDEFAULT);
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
      case MapRedoopPackage.DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MapRedoopPackage.DECLARATION__SUPER_NAME:
        return SUPER_NAME_EDEFAULT == null ? superName != null : !SUPER_NAME_EDEFAULT.equals(superName);
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
    result.append(", superName: ");
    result.append(superName);
    result.append(')');
    return result.toString();
  }

} //DeclarationImpl
