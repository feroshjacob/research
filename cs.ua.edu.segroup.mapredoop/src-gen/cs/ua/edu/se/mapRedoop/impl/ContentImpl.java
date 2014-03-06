/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.Content;
import cs.ua.edu.se.mapRedoop.ListofEntities;
import cs.ua.edu.se.mapRedoop.MRBlock;
import cs.ua.edu.se.mapRedoop.MapRedoopPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ContentImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link cs.ua.edu.se.mapRedoop.impl.ContentImpl#getMrBlocks <em>Mr Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content
{
  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected ListofEntities entities;

  /**
   * The cached value of the '{@link #getMrBlocks() <em>Mr Blocks</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMrBlocks()
   * @generated
   * @ordered
   */
  protected MRBlock mrBlocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentImpl()
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
    return MapRedoopPackage.Literals.CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListofEntities getEntities()
  {
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntities(ListofEntities newEntities, NotificationChain msgs)
  {
    ListofEntities oldEntities = entities;
    entities = newEntities;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.CONTENT__ENTITIES, oldEntities, newEntities);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntities(ListofEntities newEntities)
  {
    if (newEntities != entities)
    {
      NotificationChain msgs = null;
      if (entities != null)
        msgs = ((InternalEObject)entities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.CONTENT__ENTITIES, null, msgs);
      if (newEntities != null)
        msgs = ((InternalEObject)newEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.CONTENT__ENTITIES, null, msgs);
      msgs = basicSetEntities(newEntities, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.CONTENT__ENTITIES, newEntities, newEntities));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MRBlock getMrBlocks()
  {
    return mrBlocks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMrBlocks(MRBlock newMrBlocks, NotificationChain msgs)
  {
    MRBlock oldMrBlocks = mrBlocks;
    mrBlocks = newMrBlocks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapRedoopPackage.CONTENT__MR_BLOCKS, oldMrBlocks, newMrBlocks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMrBlocks(MRBlock newMrBlocks)
  {
    if (newMrBlocks != mrBlocks)
    {
      NotificationChain msgs = null;
      if (mrBlocks != null)
        msgs = ((InternalEObject)mrBlocks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.CONTENT__MR_BLOCKS, null, msgs);
      if (newMrBlocks != null)
        msgs = ((InternalEObject)newMrBlocks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapRedoopPackage.CONTENT__MR_BLOCKS, null, msgs);
      msgs = basicSetMrBlocks(newMrBlocks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapRedoopPackage.CONTENT__MR_BLOCKS, newMrBlocks, newMrBlocks));
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
      case MapRedoopPackage.CONTENT__ENTITIES:
        return basicSetEntities(null, msgs);
      case MapRedoopPackage.CONTENT__MR_BLOCKS:
        return basicSetMrBlocks(null, msgs);
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
      case MapRedoopPackage.CONTENT__ENTITIES:
        return getEntities();
      case MapRedoopPackage.CONTENT__MR_BLOCKS:
        return getMrBlocks();
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
      case MapRedoopPackage.CONTENT__ENTITIES:
        setEntities((ListofEntities)newValue);
        return;
      case MapRedoopPackage.CONTENT__MR_BLOCKS:
        setMrBlocks((MRBlock)newValue);
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
      case MapRedoopPackage.CONTENT__ENTITIES:
        setEntities((ListofEntities)null);
        return;
      case MapRedoopPackage.CONTENT__MR_BLOCKS:
        setMrBlocks((MRBlock)null);
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
      case MapRedoopPackage.CONTENT__ENTITIES:
        return entities != null;
      case MapRedoopPackage.CONTENT__MR_BLOCKS:
        return mrBlocks != null;
    }
    return super.eIsSet(featureID);
  }

} //ContentImpl
