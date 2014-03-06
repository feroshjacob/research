/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MR Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.MRBlock#getLoop <em>Loop</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.MRBlock#getMapper <em>Mapper</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.MRBlock#getReducer <em>Reducer</em>}</li>
 * </ul>
 * </p>
 *
 * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMRBlock()
 * @model
 * @generated
 */
public interface MRBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Loop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' attribute.
   * @see #setLoop(String)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMRBlock_Loop()
   * @model
   * @generated
   */
  String getLoop();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.MRBlock#getLoop <em>Loop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' attribute.
   * @see #getLoop()
   * @generated
   */
  void setLoop(String value);

  /**
   * Returns the value of the '<em><b>Mapper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapper</em>' containment reference.
   * @see #setMapper(Mapper)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMRBlock_Mapper()
   * @model containment="true"
   * @generated
   */
  Mapper getMapper();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.MRBlock#getMapper <em>Mapper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapper</em>' containment reference.
   * @see #getMapper()
   * @generated
   */
  void setMapper(Mapper value);

  /**
   * Returns the value of the '<em><b>Reducer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reducer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reducer</em>' containment reference.
   * @see #setReducer(Reducer)
   * @see cs.ua.edu.se.mapRedoop.MapRedoopPackage#getMRBlock_Reducer()
   * @model containment="true"
   * @generated
   */
  Reducer getReducer();

  /**
   * Sets the value of the '{@link cs.ua.edu.se.mapRedoop.MRBlock#getReducer <em>Reducer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reducer</em>' containment reference.
   * @see #getReducer()
   * @generated
   */
  void setReducer(Reducer value);

} // MRBlock
