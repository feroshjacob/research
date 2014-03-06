/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.JavaFunction#getTimeofCall <em>Timeof Call</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.JavaFunction#getParamname <em>Paramname</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getJavaFunction()
 * @model
 * @generated
 */
public interface JavaFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Timeof Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timeof Call</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeof Call</em>' attribute.
   * @see #setTimeofCall(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getJavaFunction_TimeofCall()
   * @model
   * @generated
   */
  String getTimeofCall();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.JavaFunction#getTimeofCall <em>Timeof Call</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeof Call</em>' attribute.
   * @see #getTimeofCall()
   * @generated
   */
  void setTimeofCall(String value);

  /**
   * Returns the value of the '<em><b>Paramname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramname</em>' attribute.
   * @see #setParamname(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getJavaFunction_Paramname()
   * @model
   * @generated
   */
  String getParamname();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.JavaFunction#getParamname <em>Paramname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramname</em>' attribute.
   * @see #getParamname()
   * @generated
   */
  void setParamname(String value);

} // JavaFunction
