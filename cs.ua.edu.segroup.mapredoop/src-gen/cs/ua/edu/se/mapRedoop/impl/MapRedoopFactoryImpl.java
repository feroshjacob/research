/**
 * <copyright>
 * </copyright>
 *
 */
package cs.ua.edu.se.mapRedoop.impl;

import cs.ua.edu.se.mapRedoop.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapRedoopFactoryImpl extends EFactoryImpl implements MapRedoopFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MapRedoopFactory init()
  {
    try
    {
      MapRedoopFactory theMapRedoopFactory = (MapRedoopFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ua.cs/edu/se/MapRedoop"); 
      if (theMapRedoopFactory != null)
      {
        return theMapRedoopFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MapRedoopFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapRedoopFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MapRedoopPackage.MAP_REDOOP: return createMapRedoop();
      case MapRedoopPackage.CONTENT: return createContent();
      case MapRedoopPackage.LISTOF_ENTITIES: return createListofEntities();
      case MapRedoopPackage.MR_BLOCK: return createMRBlock();
      case MapRedoopPackage.DECLARATION: return createDeclaration();
      case MapRedoopPackage.MAPPER: return createMapper();
      case MapRedoopPackage.ARGUMENT: return createArgument();
      case MapRedoopPackage.LISTOF_ARGUMENT: return createListofArgument();
      case MapRedoopPackage.REDUCER: return createReducer();
      case MapRedoopPackage.TYPE: return createType();
      case MapRedoopPackage.ENTITY: return createEntity();
      case MapRedoopPackage.FEATURE: return createFeature();
      case MapRedoopPackage.READOR_WRITE: return createReadorWrite();
      case MapRedoopPackage.TYPE_REF: return createTypeRef();
      case MapRedoopPackage.BLOCK: return createBlock();
      case MapRedoopPackage.JAVA_FUNCTION: return createJavaFunction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapRedoop createMapRedoop()
  {
    MapRedoopImpl mapRedoop = new MapRedoopImpl();
    return mapRedoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListofEntities createListofEntities()
  {
    ListofEntitiesImpl listofEntities = new ListofEntitiesImpl();
    return listofEntities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MRBlock createMRBlock()
  {
    MRBlockImpl mrBlock = new MRBlockImpl();
    return mrBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapper createMapper()
  {
    MapperImpl mapper = new MapperImpl();
    return mapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListofArgument createListofArgument()
  {
    ListofArgumentImpl listofArgument = new ListofArgumentImpl();
    return listofArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reducer createReducer()
  {
    ReducerImpl reducer = new ReducerImpl();
    return reducer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReadorWrite createReadorWrite()
  {
    ReadorWriteImpl readorWrite = new ReadorWriteImpl();
    return readorWrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaFunction createJavaFunction()
  {
    JavaFunctionImpl javaFunction = new JavaFunctionImpl();
    return javaFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapRedoopPackage getMapRedoopPackage()
  {
    return (MapRedoopPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MapRedoopPackage getPackage()
  {
    return MapRedoopPackage.eINSTANCE;
  }

} //MapRedoopFactoryImpl
