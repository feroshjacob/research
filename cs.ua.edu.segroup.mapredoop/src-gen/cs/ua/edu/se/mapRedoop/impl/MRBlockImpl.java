/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.MRBlock;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;
import cs.ua.edu.se.mapRedoop.Mapper;
import cs.ua.edu.se.mapRedoop.Reducer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MR Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MRBlockImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MRBlockImpl#getMapper <em>Mapper</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.MRBlockImpl#getReducer <em>Reducer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MRBlockImpl extends MinimalEObjectImpl.Container implements MRBlock
{
  /**
   * The default value of the '{@link #getLoop() <em>Loop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected static final String LOOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected String loop = LOOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getMapper() <em>Mapper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapper()
   * @generated
   * @ordered
   */
  protected Mapper mapper;

  /**
   * The cached value of the '{@link #getReducer() <em>Reducer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReducer()
   * @generated
   * @ordered
   */
  protected Reducer reducer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MRBlockImpl()
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
    return MapRedoopPackage.Literals.MR_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoop(String newLoop)
  {
    String oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MR_BLOCK__LOOP, oldLoop, loop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapper getMapper()
  {
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapper(Mapper newMapper, NotificationChain msgs)
  {
    Mapper oldMapper = mapper;
    mapper = newMapper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MR_BLOCK__MAPPER, oldMapper, newMapper);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapper(Mapper newMapper)
  {
    if (newMapper != mapper)
    {
      NotificationChain msgs = null;
      if (mapper != null)
        msgs = ((InternalEObject)mapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MR_BLOCK__MAPPER, null, msgs);
      if (newMapper != null)
        msgs = ((InternalEObject)newMapper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MR_BLOCK__MAPPER, null, msgs);
      msgs = basicSetMapper(newMapper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MR_BLOCK__MAPPER, newMapper, newMapper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reducer getReducer()
  {
    return reducer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReducer(Reducer newReducer, NotificationChain msgs)
  {
    Reducer oldReducer = reducer;
    reducer = newReducer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MR_BLOCK__REDUCER, oldReducer, newReducer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReducer(Reducer newReducer)
  {
    if (newReducer != reducer)
    {
      NotificationChain msgs = null;
      if (reducer != null)
        msgs = ((InternalEObject)reducer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MR_BLOCK__REDUCER, null, msgs);
      if (newReducer != null)
        msgs = ((InternalEObject)newReducer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.MR_BLOCK__REDUCER, null, msgs);
      msgs = basicSetReducer(newReducer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.MR_BLOCK__REDUCER, newReducer, newReducer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MapRedoopPackage.MR_BLOCK__MAPPER:
        return basicSetMapper(null, msgs);
      case MapRedoopPackage.MR_BLOCK__REDUCER:
        return basicSetReducer(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MapRedoopPackage.MR_BLOCK__LOOP:
        return getLoop();
      case MapRedoopPackage.MR_BLOCK__MAPPER:
        return getMapper();
      case MapRedoopPackage.MR_BLOCK__REDUCER:
        return getReducer();
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
      case MapRedoopPackage.MR_BLOCK__LOOP:
        setLoop((String)newValue);
        return;
      case MapRedoopPackage.MR_BLOCK__MAPPER:
        setMapper((Mapper)newValue);
        return;
      case MapRedoopPackage.MR_BLOCK__REDUCER:
        setReducer((Reducer)newValue);
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
      case MapRedoopPackage.MR_BLOCK__LOOP:
        setLoop(LOOP_EDEFAULT);
        return;
      case MapRedoopPackage.MR_BLOCK__MAPPER:
        setMapper((Mapper)null);
        return;
      case MapRedoopPackage.MR_BLOCK__REDUCER:
        setReducer((Reducer)null);
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
      case MapRedoopPackage.MR_BLOCK__LOOP:
        return LOOP_EDEFAULT == null ? loop != null : !LOOP_EDEFAULT.equals(loop);
      case MapRedoopPackage.MR_BLOCK__MAPPER:
        return mapper != null;
      case MapRedoopPackage.MR_BLOCK__REDUCER:
        return reducer != null;
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
    result.append(" (loop: ");
    result.append(loop);
    result.append(')');
    return result.toString();
  }

} //MRBlockImpl
