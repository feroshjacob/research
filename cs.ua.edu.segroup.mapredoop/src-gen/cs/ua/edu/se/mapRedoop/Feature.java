/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Feature#getType <em>Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Feature#getName <em>Name</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Feature#getReadorWrite <em>Reador Write</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeRef)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getFeature_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Feature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

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
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reador Write</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reador Write</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reador Write</em>' containment reference.
   * @see #setReadorWrite(ReadorWrite)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getFeature_ReadorWrite()
   * @model containment="true"
   * @generated
   */
  ReadorWrite getReadorWrite();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Feature#getReadorWrite <em>Reador Write</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reador Write</em>' containment reference.
   * @see #getReadorWrite()
   * @generated
   */
  void setReadorWrite(ReadorWrite value);

} // Feature
