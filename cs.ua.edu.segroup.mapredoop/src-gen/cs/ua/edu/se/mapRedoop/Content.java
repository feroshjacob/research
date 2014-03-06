/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Content#getEntities <em>Entities</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.Content#getMrBlocks <em>Mr Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference.
   * @see #setEntities(ListofEntities)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getContent_Entities()
   * @model containment="true"
   * @generated
   */
  ListofEntities getEntities();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Content#getEntities <em>Entities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entities</em>' containment reference.
   * @see #getEntities()
   * @generated
   */
  void setEntities(ListofEntities value);

  /**
   * Returns the value of the '<em><b>Mr Blocks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mr Blocks</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mr Blocks</em>' containment reference.
   * @see #setMrBlocks(MRBlock)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getContent_MrBlocks()
   * @model containment="true"
   * @generated
   */
  MRBlock getMrBlocks();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.Content#getMrBlocks <em>Mr Blocks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mr Blocks</em>' containment reference.
   * @see #getMrBlocks()
   * @generated
   */
  void setMrBlocks(MRBlock value);

} // Content
