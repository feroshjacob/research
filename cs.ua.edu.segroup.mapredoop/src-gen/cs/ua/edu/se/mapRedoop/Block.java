/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Block#getBlock <em>Block</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Block#getJavafunctions <em>Javafunctions</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' attribute.
   * @see #setBlock(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getBlock_Block()
   * @model
   * @generated
   */
  String getBlock();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Block#getBlock <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' attribute.
   * @see #getBlock()
   * @generated
   */
  void setBlock(String value);

  /**
   * Returns the value of the '<em><b>Javafunctions</b></em>' containment reference list.
   * The list contents are of type {@link cs.ua.edu.se.mapRedoop.JavaFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Javafunctions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Javafunctions</em>' containment reference list.
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getBlock_Javafunctions()
   * @model containment="true"
   * @generated
   */
  EList<JavaFunction> getJavafunctions();

} // Block
