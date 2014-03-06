/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reador Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getToken <em>Token</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getReadval <em>Readval</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getWriteval <em>Writeval</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReadorWrite()
 * @model
 * @generated
 */
public interface ReadorWrite extends EObject
{
  /**
   * Returns the value of the '<em><b>Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Token</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Token</em>' attribute.
   * @see #setToken(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReadorWrite_Token()
   * @model
   * @generated
   */
  String getToken();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getToken <em>Token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Token</em>' attribute.
   * @see #getToken()
   * @generated
   */
  void setToken(String value);

  /**
   * Returns the value of the '<em><b>Readval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Readval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Readval</em>' attribute.
   * @see #setReadval(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReadorWrite_Readval()
   * @model
   * @generated
   */
  String getReadval();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getReadval <em>Readval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Readval</em>' attribute.
   * @see #getReadval()
   * @generated
   */
  void setReadval(String value);

  /**
   * Returns the value of the '<em><b>Writeval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Writeval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writeval</em>' attribute.
   * @see #setWriteval(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReadorWrite_Writeval()
   * @model
   * @generated
   */
  String getWriteval();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getWriteval <em>Writeval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Writeval</em>' attribute.
   * @see #getWriteval()
   * @generated
   */
  void setWriteval(String value);

} // ReadorWrite
