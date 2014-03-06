/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Declaration#getName <em>Name</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Declaration#getSuperName <em>Super Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Name</em>' attribute.
   * @see #setSuperName(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getDeclaration_SuperName()
   * @model
   * @generated
   */
  String getSuperName();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Declaration#getSuperName <em>Super Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Name</em>' attribute.
   * @see #getSuperName()
   * @generated
   */
  void setSuperName(String value);

} // Declaration
