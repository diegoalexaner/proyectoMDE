/**
 */
package abstracta.impl;

import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.AtributoAbstracta;
import abstracta.ClaseAbstracta;
import abstracta.ContainmentAbstracta;
import abstracta.HerenciaAbstracta;
import abstracta.MetodoAbstracta;
import abstracta.ModelFactoryAbstracta;
import abstracta.PaqueteAbstracta;
import abstracta.ParametroAbstracta;
import abstracta.RelacionAbstracta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractaPackageImpl extends EPackageImpl implements AbstractaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paqueteAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claseAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametroAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metodoAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentAbstractaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herenciaAbstractaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see abstracta.AbstractaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractaPackageImpl() {
		super(eNS_URI, AbstractaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AbstractaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractaPackage init() {
		if (isInited) return (AbstractaPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractaPackage.eNS_URI);

		// Obtain or create and register package
		AbstractaPackageImpl theAbstractaPackage = (AbstractaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AbstractaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AbstractaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAbstractaPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractaPackage.eNS_URI, theAbstractaPackage);
		return theAbstractaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactoryAbstracta() {
		return modelFactoryAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelFactoryAbstracta_Nombre() {
		return (EAttribute)modelFactoryAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactoryAbstracta_ListaPaquetes() {
		return (EReference)modelFactoryAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaqueteAbstracta() {
		return paqueteAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaqueteAbstracta_Nombre() {
		return (EAttribute)paqueteAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaqueteAbstracta_Ruta() {
		return (EAttribute)paqueteAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaqueteAbstracta_ListaClases() {
		return (EReference)paqueteAbstractaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaqueteAbstracta_ListaPaquetes() {
		return (EReference)paqueteAbstractaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaseAbstracta() {
		return claseAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaseAbstracta_Nombre() {
		return (EAttribute)claseAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaseAbstracta_Ruta() {
		return (EAttribute)claseAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaseAbstracta_ListaAtributos() {
		return (EReference)claseAbstractaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaseAbstracta_ListaMetodos() {
		return (EReference)claseAbstractaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaseAbstracta_ListaRelaciones() {
		return (EReference)claseAbstractaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaseAbstracta_ListaRelacionesHerencia() {
		return (EReference)claseAbstractaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaseAbstracta_ListaRelacionesContaiment() {
		return (EReference)claseAbstractaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoAbstracta() {
		return atributoAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributoAbstracta_Nombre() {
		return (EAttribute)atributoAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametroAbstracta() {
		return parametroAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametroAbstracta_Nombre() {
		return (EAttribute)parametroAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetodoAbstracta() {
		return metodoAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetodoAbstracta_Nombre() {
		return (EAttribute)metodoAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetodoAbstracta_Sentencias() {
		return (EAttribute)metodoAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetodoAbstracta_ValorRetorno() {
		return (EAttribute)metodoAbstractaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodoAbstracta_ListaParametros() {
		return (EReference)metodoAbstractaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetodoAbstracta_ListaAtributos() {
		return (EReference)metodoAbstractaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacionAbstracta() {
		return relacionAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacionAbstracta_Source() {
		return (EReference)relacionAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacionAbstracta_Target() {
		return (EReference)relacionAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacionAbstracta_RolA() {
		return (EAttribute)relacionAbstractaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacionAbstracta_RolB() {
		return (EAttribute)relacionAbstractaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacionAbstracta_MultiplicidadA() {
		return (EAttribute)relacionAbstractaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacionAbstracta_MultiplicidadB() {
		return (EAttribute)relacionAbstractaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainmentAbstracta() {
		return containmentAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentAbstracta_Source() {
		return (EReference)containmentAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentAbstracta_Target() {
		return (EReference)containmentAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainmentAbstracta_MultiplicidadA() {
		return (EAttribute)containmentAbstractaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainmentAbstracta_MultiplicidadB() {
		return (EAttribute)containmentAbstractaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainmentAbstracta_RolA() {
		return (EAttribute)containmentAbstractaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainmentAbstracta_RolB() {
		return (EAttribute)containmentAbstractaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHerenciaAbstracta() {
		return herenciaAbstractaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerenciaAbstracta_Source() {
		return (EReference)herenciaAbstractaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerenciaAbstracta_Target() {
		return (EReference)herenciaAbstractaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaFactory getAbstractaFactory() {
		return (AbstractaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryAbstractaEClass = createEClass(MODEL_FACTORY_ABSTRACTA);
		createEAttribute(modelFactoryAbstractaEClass, MODEL_FACTORY_ABSTRACTA__NOMBRE);
		createEReference(modelFactoryAbstractaEClass, MODEL_FACTORY_ABSTRACTA__LISTA_PAQUETES);

		paqueteAbstractaEClass = createEClass(PAQUETE_ABSTRACTA);
		createEAttribute(paqueteAbstractaEClass, PAQUETE_ABSTRACTA__NOMBRE);
		createEAttribute(paqueteAbstractaEClass, PAQUETE_ABSTRACTA__RUTA);
		createEReference(paqueteAbstractaEClass, PAQUETE_ABSTRACTA__LISTA_CLASES);
		createEReference(paqueteAbstractaEClass, PAQUETE_ABSTRACTA__LISTA_PAQUETES);

		claseAbstractaEClass = createEClass(CLASE_ABSTRACTA);
		createEAttribute(claseAbstractaEClass, CLASE_ABSTRACTA__NOMBRE);
		createEAttribute(claseAbstractaEClass, CLASE_ABSTRACTA__RUTA);
		createEReference(claseAbstractaEClass, CLASE_ABSTRACTA__LISTA_ATRIBUTOS);
		createEReference(claseAbstractaEClass, CLASE_ABSTRACTA__LISTA_METODOS);
		createEReference(claseAbstractaEClass, CLASE_ABSTRACTA__LISTA_RELACIONES);
		createEReference(claseAbstractaEClass, CLASE_ABSTRACTA__LISTA_RELACIONES_HERENCIA);
		createEReference(claseAbstractaEClass, CLASE_ABSTRACTA__LISTA_RELACIONES_CONTAIMENT);

		atributoAbstractaEClass = createEClass(ATRIBUTO_ABSTRACTA);
		createEAttribute(atributoAbstractaEClass, ATRIBUTO_ABSTRACTA__NOMBRE);

		parametroAbstractaEClass = createEClass(PARAMETRO_ABSTRACTA);
		createEAttribute(parametroAbstractaEClass, PARAMETRO_ABSTRACTA__NOMBRE);

		metodoAbstractaEClass = createEClass(METODO_ABSTRACTA);
		createEAttribute(metodoAbstractaEClass, METODO_ABSTRACTA__NOMBRE);
		createEAttribute(metodoAbstractaEClass, METODO_ABSTRACTA__SENTENCIAS);
		createEAttribute(metodoAbstractaEClass, METODO_ABSTRACTA__VALOR_RETORNO);
		createEReference(metodoAbstractaEClass, METODO_ABSTRACTA__LISTA_PARAMETROS);
		createEReference(metodoAbstractaEClass, METODO_ABSTRACTA__LISTA_ATRIBUTOS);

		relacionAbstractaEClass = createEClass(RELACION_ABSTRACTA);
		createEReference(relacionAbstractaEClass, RELACION_ABSTRACTA__SOURCE);
		createEReference(relacionAbstractaEClass, RELACION_ABSTRACTA__TARGET);
		createEAttribute(relacionAbstractaEClass, RELACION_ABSTRACTA__ROL_A);
		createEAttribute(relacionAbstractaEClass, RELACION_ABSTRACTA__ROL_B);
		createEAttribute(relacionAbstractaEClass, RELACION_ABSTRACTA__MULTIPLICIDAD_A);
		createEAttribute(relacionAbstractaEClass, RELACION_ABSTRACTA__MULTIPLICIDAD_B);

		containmentAbstractaEClass = createEClass(CONTAINMENT_ABSTRACTA);
		createEReference(containmentAbstractaEClass, CONTAINMENT_ABSTRACTA__SOURCE);
		createEReference(containmentAbstractaEClass, CONTAINMENT_ABSTRACTA__TARGET);
		createEAttribute(containmentAbstractaEClass, CONTAINMENT_ABSTRACTA__MULTIPLICIDAD_A);
		createEAttribute(containmentAbstractaEClass, CONTAINMENT_ABSTRACTA__MULTIPLICIDAD_B);
		createEAttribute(containmentAbstractaEClass, CONTAINMENT_ABSTRACTA__ROL_A);
		createEAttribute(containmentAbstractaEClass, CONTAINMENT_ABSTRACTA__ROL_B);

		herenciaAbstractaEClass = createEClass(HERENCIA_ABSTRACTA);
		createEReference(herenciaAbstractaEClass, HERENCIA_ABSTRACTA__SOURCE);
		createEReference(herenciaAbstractaEClass, HERENCIA_ABSTRACTA__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryAbstractaEClass, ModelFactoryAbstracta.class, "ModelFactoryAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactoryAbstracta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactoryAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactoryAbstracta_ListaPaquetes(), this.getPaqueteAbstracta(), null, "listaPaquetes", null, 0, -1, ModelFactoryAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paqueteAbstractaEClass, PaqueteAbstracta.class, "PaqueteAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaqueteAbstracta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, PaqueteAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaqueteAbstracta_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, PaqueteAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaqueteAbstracta_ListaClases(), this.getClaseAbstracta(), null, "listaClases", null, 0, -1, PaqueteAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaqueteAbstracta_ListaPaquetes(), this.getPaqueteAbstracta(), null, "listaPaquetes", null, 0, -1, PaqueteAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claseAbstractaEClass, ClaseAbstracta.class, "ClaseAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaseAbstracta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ClaseAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaseAbstracta_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ClaseAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaseAbstracta_ListaAtributos(), this.getAtributoAbstracta(), null, "listaAtributos", null, 0, -1, ClaseAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaseAbstracta_ListaMetodos(), this.getMetodoAbstracta(), null, "listaMetodos", null, 0, -1, ClaseAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaseAbstracta_ListaRelaciones(), this.getRelacionAbstracta(), null, "listaRelaciones", null, 0, -1, ClaseAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaseAbstracta_ListaRelacionesHerencia(), this.getHerenciaAbstracta(), null, "listaRelacionesHerencia", null, 0, -1, ClaseAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClaseAbstracta_ListaRelacionesContaiment(), this.getContainmentAbstracta(), null, "listaRelacionesContaiment", null, 0, -1, ClaseAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoAbstractaEClass, AtributoAbstracta.class, "AtributoAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributoAbstracta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, AtributoAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametroAbstractaEClass, ParametroAbstracta.class, "ParametroAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametroAbstracta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ParametroAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metodoAbstractaEClass, MetodoAbstracta.class, "MetodoAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetodoAbstracta_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MetodoAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetodoAbstracta_Sentencias(), ecorePackage.getEString(), "sentencias", null, 0, 1, MetodoAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetodoAbstracta_ValorRetorno(), ecorePackage.getEString(), "valorRetorno", null, 0, 1, MetodoAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodoAbstracta_ListaParametros(), this.getParametroAbstracta(), null, "listaParametros", null, 0, -1, MetodoAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetodoAbstracta_ListaAtributos(), this.getAtributoAbstracta(), null, "listaAtributos", null, 0, -1, MetodoAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relacionAbstractaEClass, RelacionAbstracta.class, "RelacionAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelacionAbstracta_Source(), this.getClaseAbstracta(), null, "source", null, 0, 1, RelacionAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacionAbstracta_Target(), this.getClaseAbstracta(), null, "target", null, 0, 1, RelacionAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacionAbstracta_RolA(), ecorePackage.getEString(), "rolA", null, 0, 1, RelacionAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacionAbstracta_RolB(), ecorePackage.getEString(), "rolB", null, 0, 1, RelacionAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacionAbstracta_MultiplicidadA(), ecorePackage.getEString(), "multiplicidadA", null, 0, 1, RelacionAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelacionAbstracta_MultiplicidadB(), ecorePackage.getEString(), "multiplicidadB", null, 0, 1, RelacionAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentAbstractaEClass, ContainmentAbstracta.class, "ContainmentAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainmentAbstracta_Source(), this.getClaseAbstracta(), null, "source", null, 0, 1, ContainmentAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainmentAbstracta_Target(), this.getClaseAbstracta(), null, "target", null, 0, 1, ContainmentAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainmentAbstracta_MultiplicidadA(), ecorePackage.getEString(), "multiplicidadA", null, 0, 1, ContainmentAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainmentAbstracta_MultiplicidadB(), ecorePackage.getEString(), "multiplicidadB", null, 0, 1, ContainmentAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainmentAbstracta_RolA(), ecorePackage.getEString(), "rolA", null, 0, 1, ContainmentAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainmentAbstracta_RolB(), ecorePackage.getEString(), "rolB", null, 0, 1, ContainmentAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herenciaAbstractaEClass, HerenciaAbstracta.class, "HerenciaAbstracta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHerenciaAbstracta_Source(), this.getClaseAbstracta(), null, "source", null, 0, 1, HerenciaAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHerenciaAbstracta_Target(), this.getClaseAbstracta(), null, "target", null, 0, 1, HerenciaAbstracta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

} //AbstractaPackageImpl
