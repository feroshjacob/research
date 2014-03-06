/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Mapper#getInkey <em>Inkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Mapper#getInvalue <em>Invalue</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Mapper#getOutKeyType <em>Out Key Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Mapper#getOutValueType <em>Out Value Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Mapper#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMapper()
 * @model
 * @generated
 */
public interface Mapper extends EObject
{
  /**
   * Returns the value of the '<em><b>Inkey</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inkey</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inkey</em>' containment reference.
   * @see #setInkey(Argument)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMapper_Inkey()
   * @model containment="true"
   * @generated
   */
  Argument getInkey();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Mapper#getInkey <em>Inkey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inkey</em>' containment reference.
   * @see #getInkey()
   * @generated
   */
  void setInkey(Argument value);

  /**
   * Returns the value of the '<em><b>Invalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invalue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invalue</em>' containment reference.
   * @see #setInvalue(Argument)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMapper_Invalue()
   * @model containment="true"
   * @generated
   */
  Argument getInvalue();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Mapper#getInvalue <em>Invalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invalue</em>' containment reference.
   * @see #getInvalue()
   * @generated
   */
  void setInvalue(Argument value);

  /**
   * Returns the value of the '<em><b>Out Key Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Key Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Key Type</em>' attribute.
   * @see #setOutKeyType(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMapper_OutKeyType()
   * @model
   * @generated
   */
  String getOutKeyType();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Mapper#getOutKeyType <em>Out Key Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Key Type</em>' attribute.
   * @see #getOutKeyType()
   * @generated
   */
  void setOutKeyType(String value);

  /**
   * Returns the value of the '<em><b>Out Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Value Type</em>' attribute.
   * @see #setOutValueType(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMapper_OutValueType()
   * @model
   * @generated
   */
  String getOutValueType();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Mapper#getOutValueType <em>Out Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Value Type</em>' attribute.
   * @see #getOutValueType()
   * @generated
   */
  void setOutValueType(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(Block)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMapper_Text()
   * @model containment="true"
   * @generated
   */
  Block getText();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Mapper#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(Block value);

} // Mapper
