/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reducer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Reducer#getInkey <em>Inkey</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Reducer#getInvalue <em>Invalue</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Reducer#getOutKeyType <em>Out Key Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Reducer#getOutValueType <em>Out Value Type</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Reducer#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer()
 * @model
 * @generated
 */
public interface Reducer extends EObject
{
  /**
   * Returns the value of the '<em><b>Inkey</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inkey</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inkey</em>' attribute.
   * @see #setInkey(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer_Inkey()
   * @model
   * @generated
   */
  String getInkey();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Reducer#getInkey <em>Inkey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inkey</em>' attribute.
   * @see #getInkey()
   * @generated
   */
  void setInkey(String value);

  /**
   * Returns the value of the '<em><b>Invalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invalue</em>' attribute.
   * @see #setInvalue(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer_Invalue()
   * @model
   * @generated
   */
  String getInvalue();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Reducer#getInvalue <em>Invalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invalue</em>' attribute.
   * @see #getInvalue()
   * @generated
   */
  void setInvalue(String value);

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
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer_OutKeyType()
   * @model
   * @generated
   */
  String getOutKeyType();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Reducer#getOutKeyType <em>Out Key Type</em>}' attribute.
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
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer_OutValueType()
   * @model
   * @generated
   */
  String getOutValueType();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Reducer#getOutValueType <em>Out Value Type</em>}' attribute.
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
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getReducer_Text()
   * @model containment="true"
   * @generated
   */
  Block getText();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Reducer#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(Block value);

} // Reducer
