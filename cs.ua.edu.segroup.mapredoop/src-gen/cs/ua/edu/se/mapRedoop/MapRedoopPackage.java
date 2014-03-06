/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cs.ua.edu.se.mapRedoop.MapRedoopFactory
 * @model kind="package"
 * @generated
 */
public interface MapRedoopPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapRedoop";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ua.cs/edu/se/MapRedoop";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mapRedoop";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapRedoopPackage eINSTANCE = cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl.init();

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.MapRedoopImpl <em>Map Redoop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getMapRedoop()
   * @generated
   */
  int MAP_REDOOP = 0;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_REDOOP__DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_REDOOP__CONTENT = 1;

  /**
   * The number of structural features of the '<em>Map Redoop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_REDOOP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.ContentImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__ENTITIES = 0;

  /**
   * The feature id for the '<em><b>Mr Blocks</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__MR_BLOCKS = 1;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.ListofEntitiesImpl <em>Listof Entities</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.ListofEntitiesImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getListofEntities()
   * @generated
   */
  int LISTOF_ENTITIES = 2;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTOF_ENTITIES__ENTITIES = 0;

  /**
   * The number of structural features of the '<em>Listof Entities</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTOF_ENTITIES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.MRBlockImpl <em>MR Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.MRBlockImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getMRBlock()
   * @generated
   */
  int MR_BLOCK = 3;

  /**
   * The feature id for the '<em><b>Loop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR_BLOCK__LOOP = 0;

  /**
   * The feature id for the '<em><b>Mapper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR_BLOCK__MAPPER = 1;

  /**
   * The feature id for the '<em><b>Reducer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR_BLOCK__REDUCER = 2;

  /**
   * The number of structural features of the '<em>MR Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR_BLOCK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.DeclarationImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__SUPER_NAME = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl <em>Mapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.MapperImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getMapper()
   * @generated
   */
  int MAPPER = 5;

  /**
   * The feature id for the '<em><b>Inkey</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__INKEY = 0;

  /**
   * The feature id for the '<em><b>Invalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__INVALUE = 1;

  /**
   * The feature id for the '<em><b>Out Key Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__OUT_KEY_TYPE = 2;

  /**
   * The feature id for the '<em><b>Out Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__OUT_VALUE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER__TEXT = 4;

  /**
   * The number of structural features of the '<em>Mapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.ArgumentImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Argname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ARGNAME = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.ListofArgumentImpl <em>Listof Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.ListofArgumentImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getListofArgument()
   * @generated
   */
  int LISTOF_ARGUMENT = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTOF_ARGUMENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Argname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTOF_ARGUMENT__ARGNAME = 1;

  /**
   * The number of structural features of the '<em>Listof Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTOF_ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl <em>Reducer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.ReducerImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getReducer()
   * @generated
   */
  int REDUCER = 8;

  /**
   * The feature id for the '<em><b>Inkey</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCER__INKEY = 0;

  /**
   * The feature id for the '<em><b>Invalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCER__INVALUE = 1;

  /**
   * The feature id for the '<em><b>Out Key Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCER__OUT_KEY_TYPE = 2;

  /**
   * The feature id for the '<em><b>Out Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCER__OUT_VALUE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCER__TEXT = 4;

  /**
   * The number of structural features of the '<em>Reducer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUCER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.TypeImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getType()
   * @generated
   */
  int TYPE = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.EntityImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.FeatureImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 11;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Reador Write</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__READOR_WRITE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.ReadorWriteImpl <em>Reador Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.ReadorWriteImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getReadorWrite()
   * @generated
   */
  int READOR_WRITE = 12;

  /**
   * The feature id for the '<em><b>Token</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READOR_WRITE__TOKEN = 0;

  /**
   * The feature id for the '<em><b>Readval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READOR_WRITE__READVAL = 1;

  /**
   * The feature id for the '<em><b>Writeval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READOR_WRITE__WRITEVAL = 2;

  /**
   * The number of structural features of the '<em>Reador Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READOR_WRITE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.TypeRefImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 13;

  /**
   * The feature id for the '<em><b>Referenced</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__REFERENCED = 0;

  /**
   * The feature id for the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__MULTI = 1;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.BlockImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 14;

  /**
   * The feature id for the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__BLOCK = 0;

  /**
   * The feature id for the '<em><b>Javafunctions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__JAVAFUNCTIONS = 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cs.ua.edu.se.mapRedoop.impl.JavaFunctionImpl <em>Java Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cs.ua.edu.se.mapRedoop.impl.JavaFunctionImpl
   * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getJavaFunction()
   * @generated
   */
  int JAVA_FUNCTION = 15;

  /**
   * The feature id for the '<em><b>Timeof Call</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FUNCTION__TIMEOF_CALL = 0;

  /**
   * The feature id for the '<em><b>Paramname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FUNCTION__PARAMNAME = 1;

  /**
   * The number of structural features of the '<em>Java Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FUNCTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.MapRedoop <em>Map Redoop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Redoop</em>'.
   * @see cs.ua.edu.se.mapRedoop.MapRedoop
   * @generated
   */
  EClass getMapRedoop();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.MapRedoop#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration</em>'.
   * @see cs.ua.edu.se.mapRedoop.MapRedoop#getDeclaration()
   * @see #getMapRedoop()
   * @generated
   */
  EReference getMapRedoop_Declaration();

  /**
   * Returns the meta object for the containment reference list '{@link cs.ua.edu.se.mapRedoop.MapRedoop#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see cs.ua.edu.se.mapRedoop.MapRedoop#getContent()
   * @see #getMapRedoop()
   * @generated
   */
  EReference getMapRedoop_Content();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see cs.ua.edu.se.mapRedoop.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Content#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entities</em>'.
   * @see cs.ua.edu.se.mapRedoop.Content#getEntities()
   * @see #getContent()
   * @generated
   */
  EReference getContent_Entities();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Content#getMrBlocks <em>Mr Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mr Blocks</em>'.
   * @see cs.ua.edu.se.mapRedoop.Content#getMrBlocks()
   * @see #getContent()
   * @generated
   */
  EReference getContent_MrBlocks();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.ListofEntities <em>Listof Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Listof Entities</em>'.
   * @see cs.ua.edu.se.mapRedoop.ListofEntities
   * @generated
   */
  EClass getListofEntities();

  /**
   * Returns the meta object for the containment reference list '{@link cs.ua.edu.se.mapRedoop.ListofEntities#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see cs.ua.edu.se.mapRedoop.ListofEntities#getEntities()
   * @see #getListofEntities()
   * @generated
   */
  EReference getListofEntities_Entities();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.MRBlock <em>MR Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MR Block</em>'.
   * @see cs.ua.edu.se.mapRedoop.MRBlock
   * @generated
   */
  EClass getMRBlock();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.MRBlock#getLoop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loop</em>'.
   * @see cs.ua.edu.se.mapRedoop.MRBlock#getLoop()
   * @see #getMRBlock()
   * @generated
   */
  EAttribute getMRBlock_Loop();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.MRBlock#getMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapper</em>'.
   * @see cs.ua.edu.se.mapRedoop.MRBlock#getMapper()
   * @see #getMRBlock()
   * @generated
   */
  EReference getMRBlock_Mapper();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.MRBlock#getReducer <em>Reducer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reducer</em>'.
   * @see cs.ua.edu.se.mapRedoop.MRBlock#getReducer()
   * @see #getMRBlock()
   * @generated
   */
  EReference getMRBlock_Reducer();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see cs.ua.edu.se.mapRedoop.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cs.ua.edu.se.mapRedoop.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Declaration#getSuperName <em>Super Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super Name</em>'.
   * @see cs.ua.edu.se.mapRedoop.Declaration#getSuperName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_SuperName();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Mapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapper</em>'.
   * @see cs.ua.edu.se.mapRedoop.Mapper
   * @generated
   */
  EClass getMapper();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Mapper#getInkey <em>Inkey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inkey</em>'.
   * @see cs.ua.edu.se.mapRedoop.Mapper#getInkey()
   * @see #getMapper()
   * @generated
   */
  EReference getMapper_Inkey();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Mapper#getInvalue <em>Invalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Invalue</em>'.
   * @see cs.ua.edu.se.mapRedoop.Mapper#getInvalue()
   * @see #getMapper()
   * @generated
   */
  EReference getMapper_Invalue();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Mapper#getOutKeyType <em>Out Key Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Key Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Mapper#getOutKeyType()
   * @see #getMapper()
   * @generated
   */
  EAttribute getMapper_OutKeyType();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Mapper#getOutValueType <em>Out Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Value Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Mapper#getOutValueType()
   * @see #getMapper()
   * @generated
   */
  EAttribute getMapper_OutValueType();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Mapper#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see cs.ua.edu.se.mapRedoop.Mapper#getText()
   * @see #getMapper()
   * @generated
   */
  EReference getMapper_Text();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see cs.ua.edu.se.mapRedoop.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Argument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Argument#getType()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Type();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Argument#getArgname <em>Argname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argname</em>'.
   * @see cs.ua.edu.se.mapRedoop.Argument#getArgname()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Argname();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.ListofArgument <em>Listof Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Listof Argument</em>'.
   * @see cs.ua.edu.se.mapRedoop.ListofArgument
   * @generated
   */
  EClass getListofArgument();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.ListofArgument#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.ListofArgument#getType()
   * @see #getListofArgument()
   * @generated
   */
  EReference getListofArgument_Type();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.ListofArgument#getArgname <em>Argname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argname</em>'.
   * @see cs.ua.edu.se.mapRedoop.ListofArgument#getArgname()
   * @see #getListofArgument()
   * @generated
   */
  EAttribute getListofArgument_Argname();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Reducer <em>Reducer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reducer</em>'.
   * @see cs.ua.edu.se.mapRedoop.Reducer
   * @generated
   */
  EClass getReducer();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Reducer#getInkey <em>Inkey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inkey</em>'.
   * @see cs.ua.edu.se.mapRedoop.Reducer#getInkey()
   * @see #getReducer()
   * @generated
   */
  EAttribute getReducer_Inkey();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Reducer#getInvalue <em>Invalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Invalue</em>'.
   * @see cs.ua.edu.se.mapRedoop.Reducer#getInvalue()
   * @see #getReducer()
   * @generated
   */
  EAttribute getReducer_Invalue();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Reducer#getOutKeyType <em>Out Key Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Key Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Reducer#getOutKeyType()
   * @see #getReducer()
   * @generated
   */
  EAttribute getReducer_OutKeyType();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Reducer#getOutValueType <em>Out Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Out Value Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Reducer#getOutValueType()
   * @see #getReducer()
   * @generated
   */
  EAttribute getReducer_OutValueType();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Reducer#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text</em>'.
   * @see cs.ua.edu.se.mapRedoop.Reducer#getText()
   * @see #getReducer()
   * @generated
   */
  EReference getReducer_Text();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Type#getType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Type();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cs.ua.edu.se.mapRedoop.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see cs.ua.edu.se.mapRedoop.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cs.ua.edu.se.mapRedoop.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link cs.ua.edu.se.mapRedoop.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link cs.ua.edu.se.mapRedoop.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see cs.ua.edu.se.mapRedoop.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see cs.ua.edu.se.mapRedoop.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see cs.ua.edu.se.mapRedoop.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cs.ua.edu.se.mapRedoop.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.Feature#getReadorWrite <em>Reador Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reador Write</em>'.
   * @see cs.ua.edu.se.mapRedoop.Feature#getReadorWrite()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_ReadorWrite();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.ReadorWrite <em>Reador Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reador Write</em>'.
   * @see cs.ua.edu.se.mapRedoop.ReadorWrite
   * @generated
   */
  EClass getReadorWrite();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getToken <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Token</em>'.
   * @see cs.ua.edu.se.mapRedoop.ReadorWrite#getToken()
   * @see #getReadorWrite()
   * @generated
   */
  EAttribute getReadorWrite_Token();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getReadval <em>Readval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readval</em>'.
   * @see cs.ua.edu.se.mapRedoop.ReadorWrite#getReadval()
   * @see #getReadorWrite()
   * @generated
   */
  EAttribute getReadorWrite_Readval();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.ReadorWrite#getWriteval <em>Writeval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Writeval</em>'.
   * @see cs.ua.edu.se.mapRedoop.ReadorWrite#getWriteval()
   * @see #getReadorWrite()
   * @generated
   */
  EAttribute getReadorWrite_Writeval();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see cs.ua.edu.se.mapRedoop.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the containment reference '{@link cs.ua.edu.se.mapRedoop.TypeRef#getReferenced <em>Referenced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Referenced</em>'.
   * @see cs.ua.edu.se.mapRedoop.TypeRef#getReferenced()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Referenced();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.TypeRef#isMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi</em>'.
   * @see cs.ua.edu.se.mapRedoop.TypeRef#isMulti()
   * @see #getTypeRef()
   * @generated
   */
  EAttribute getTypeRef_Multi();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see cs.ua.edu.se.mapRedoop.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.Block#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Block</em>'.
   * @see cs.ua.edu.se.mapRedoop.Block#getBlock()
   * @see #getBlock()
   * @generated
   */
  EAttribute getBlock_Block();

  /**
   * Returns the meta object for the containment reference list '{@link cs.ua.edu.se.mapRedoop.Block#getJavafunctions <em>Javafunctions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Javafunctions</em>'.
   * @see cs.ua.edu.se.mapRedoop.Block#getJavafunctions()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Javafunctions();

  /**
   * Returns the meta object for class '{@link cs.ua.edu.se.mapRedoop.JavaFunction <em>Java Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Function</em>'.
   * @see cs.ua.edu.se.mapRedoop.JavaFunction
   * @generated
   */
  EClass getJavaFunction();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.JavaFunction#getTimeofCall <em>Timeof Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeof Call</em>'.
   * @see cs.ua.edu.se.mapRedoop.JavaFunction#getTimeofCall()
   * @see #getJavaFunction()
   * @generated
   */
  EAttribute getJavaFunction_TimeofCall();

  /**
   * Returns the meta object for the attribute '{@link cs.ua.edu.se.mapRedoop.JavaFunction#getParamname <em>Paramname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paramname</em>'.
   * @see cs.ua.edu.se.mapRedoop.JavaFunction#getParamname()
   * @see #getJavaFunction()
   * @generated
   */
  EAttribute getJavaFunction_Paramname();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MapRedoopFactory getMapRedoopFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.MapRedoopImpl <em>Map Redoop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getMapRedoop()
     * @generated
     */
    EClass MAP_REDOOP = eINSTANCE.getMapRedoop();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_REDOOP__DECLARATION = eINSTANCE.getMapRedoop_Declaration();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_REDOOP__CONTENT = eINSTANCE.getMapRedoop_Content();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.ContentImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__ENTITIES = eINSTANCE.getContent_Entities();

    /**
     * The meta object literal for the '<em><b>Mr Blocks</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__MR_BLOCKS = eINSTANCE.getContent_MrBlocks();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.ListofEntitiesImpl <em>Listof Entities</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.ListofEntitiesImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getListofEntities()
     * @generated
     */
    EClass LISTOF_ENTITIES = eINSTANCE.getListofEntities();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LISTOF_ENTITIES__ENTITIES = eINSTANCE.getListofEntities_Entities();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.MRBlockImpl <em>MR Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.MRBlockImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getMRBlock()
     * @generated
     */
    EClass MR_BLOCK = eINSTANCE.getMRBlock();

    /**
     * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MR_BLOCK__LOOP = eINSTANCE.getMRBlock_Loop();

    /**
     * The meta object literal for the '<em><b>Mapper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MR_BLOCK__MAPPER = eINSTANCE.getMRBlock_Mapper();

    /**
     * The meta object literal for the '<em><b>Reducer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MR_BLOCK__REDUCER = eINSTANCE.getMRBlock_Reducer();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.DeclarationImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Super Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__SUPER_NAME = eINSTANCE.getDeclaration_SuperName();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.MapperImpl <em>Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.MapperImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getMapper()
     * @generated
     */
    EClass MAPPER = eINSTANCE.getMapper();

    /**
     * The meta object literal for the '<em><b>Inkey</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPER__INKEY = eINSTANCE.getMapper_Inkey();

    /**
     * The meta object literal for the '<em><b>Invalue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPER__INVALUE = eINSTANCE.getMapper_Invalue();

    /**
     * The meta object literal for the '<em><b>Out Key Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPER__OUT_KEY_TYPE = eINSTANCE.getMapper_OutKeyType();

    /**
     * The meta object literal for the '<em><b>Out Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPER__OUT_VALUE_TYPE = eINSTANCE.getMapper_OutValueType();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPER__TEXT = eINSTANCE.getMapper_Text();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.ArgumentImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

    /**
     * The meta object literal for the '<em><b>Argname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__ARGNAME = eINSTANCE.getArgument_Argname();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.ListofArgumentImpl <em>Listof Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.ListofArgumentImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getListofArgument()
     * @generated
     */
    EClass LISTOF_ARGUMENT = eINSTANCE.getListofArgument();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LISTOF_ARGUMENT__TYPE = eINSTANCE.getListofArgument_Type();

    /**
     * The meta object literal for the '<em><b>Argname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LISTOF_ARGUMENT__ARGNAME = eINSTANCE.getListofArgument_Argname();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.ReducerImpl <em>Reducer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.ReducerImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getReducer()
     * @generated
     */
    EClass REDUCER = eINSTANCE.getReducer();

    /**
     * The meta object literal for the '<em><b>Inkey</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDUCER__INKEY = eINSTANCE.getReducer_Inkey();

    /**
     * The meta object literal for the '<em><b>Invalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDUCER__INVALUE = eINSTANCE.getReducer_Invalue();

    /**
     * The meta object literal for the '<em><b>Out Key Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDUCER__OUT_KEY_TYPE = eINSTANCE.getReducer_OutKeyType();

    /**
     * The meta object literal for the '<em><b>Out Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REDUCER__OUT_VALUE_TYPE = eINSTANCE.getReducer_OutValueType();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REDUCER__TEXT = eINSTANCE.getReducer_Text();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.TypeImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.EntityImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.FeatureImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Reador Write</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__READOR_WRITE = eINSTANCE.getFeature_ReadorWrite();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.ReadorWriteImpl <em>Reador Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.ReadorWriteImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getReadorWrite()
     * @generated
     */
    EClass READOR_WRITE = eINSTANCE.getReadorWrite();

    /**
     * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READOR_WRITE__TOKEN = eINSTANCE.getReadorWrite_Token();

    /**
     * The meta object literal for the '<em><b>Readval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READOR_WRITE__READVAL = eINSTANCE.getReadorWrite_Readval();

    /**
     * The meta object literal for the '<em><b>Writeval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READOR_WRITE__WRITEVAL = eINSTANCE.getReadorWrite_Writeval();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.TypeRefImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '<em><b>Referenced</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__REFERENCED = eINSTANCE.getTypeRef_Referenced();

    /**
     * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REF__MULTI = eINSTANCE.getTypeRef_Multi();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.BlockImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK__BLOCK = eINSTANCE.getBlock_Block();

    /**
     * The meta object literal for the '<em><b>Javafunctions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__JAVAFUNCTIONS = eINSTANCE.getBlock_Javafunctions();

    /**
     * The meta object literal for the '{@link cs.ua.edu.se.mapRedoop.impl.JavaFunctionImpl <em>Java Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cs.ua.edu.se.mapRedoop.impl.JavaFunctionImpl
     * @see cs.ua.edu.se.mapRedoop.impl.MapRedoopPackageImpl#getJavaFunction()
     * @generated
     */
    EClass JAVA_FUNCTION = eINSTANCE.getJavaFunction();

    /**
     * The meta object literal for the '<em><b>Timeof Call</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_FUNCTION__TIMEOF_CALL = eINSTANCE.getJavaFunction_TimeofCall();

    /**
     * The meta object literal for the '<em><b>Paramname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_FUNCTION__PARAMNAME = eINSTANCE.getJavaFunction_Paramname();

  }

} //MapRedoopPackage
