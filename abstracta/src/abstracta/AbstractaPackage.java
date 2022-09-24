/**
 */
package abstracta;

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
 * @see abstracta.AbstractaFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstracta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstracta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractaPackage eINSTANCE = abstracta.impl.AbstractaPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracta.impl.ModelFactoryAbstractaImpl <em>Model Factory Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ModelFactoryAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getModelFactoryAbstracta()
	 * @generated
	 */
	int MODEL_FACTORY_ABSTRACTA = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA__LISTA_PAQUETES = 1;

	/**
	 * The number of structural features of the '<em>Model Factory Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_ABSTRACTA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracta.impl.PaqueteAbstractaImpl <em>Paquete Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.PaqueteAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getPaqueteAbstracta()
	 * @generated
	 */
	int PAQUETE_ABSTRACTA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_ABSTRACTA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_ABSTRACTA__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lista Clases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_ABSTRACTA__LISTA_CLASES = 2;

	/**
	 * The feature id for the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_ABSTRACTA__LISTA_PAQUETES = 3;

	/**
	 * The number of structural features of the '<em>Paquete Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_ABSTRACTA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracta.impl.ClaseAbstractaImpl <em>Clase Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ClaseAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getClaseAbstracta()
	 * @generated
	 */
	int CLASE_ABSTRACTA = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__LISTA_ATRIBUTOS = 2;

	/**
	 * The feature id for the '<em><b>Lista Metodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__LISTA_METODOS = 3;

	/**
	 * The feature id for the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__LISTA_RELACIONES = 4;

	/**
	 * The feature id for the '<em><b>Lista Relaciones Herencia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__LISTA_RELACIONES_HERENCIA = 5;

	/**
	 * The feature id for the '<em><b>Lista Relaciones Contaiment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__LISTA_RELACIONES_CONTAIMENT = 6;

	/**
	 * The number of structural features of the '<em>Clase Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link abstracta.impl.AtributoAbstractaImpl <em>Atributo Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.AtributoAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getAtributoAbstracta()
	 * @generated
	 */
	int ATRIBUTO_ABSTRACTA = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ABSTRACTA__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Atributo Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ABSTRACTA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta.impl.ParametroAbstractaImpl <em>Parametro Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ParametroAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getParametroAbstracta()
	 * @generated
	 */
	int PARAMETRO_ABSTRACTA = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_ABSTRACTA__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Parametro Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRO_ABSTRACTA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link abstracta.impl.MetodoAbstractaImpl <em>Metodo Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.MetodoAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getMetodoAbstracta()
	 * @generated
	 */
	int METODO_ABSTRACTA = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_ABSTRACTA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_ABSTRACTA__SENTENCIAS = 1;

	/**
	 * The feature id for the '<em><b>Valor Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_ABSTRACTA__VALOR_RETORNO = 2;

	/**
	 * The feature id for the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_ABSTRACTA__LISTA_PARAMETROS = 3;

	/**
	 * The feature id for the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_ABSTRACTA__LISTA_ATRIBUTOS = 4;

	/**
	 * The number of structural features of the '<em>Metodo Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_ABSTRACTA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracta.impl.RelacionAbstractaImpl <em>Relacion Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.RelacionAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getRelacionAbstracta()
	 * @generated
	 */
	int RELACION_ABSTRACTA = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ABSTRACTA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ABSTRACTA__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ABSTRACTA__ROL_A = 2;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ABSTRACTA__ROL_B = 3;

	/**
	 * The feature id for the '<em><b>Multiplicidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ABSTRACTA__MULTIPLICIDAD_A = 4;

	/**
	 * The feature id for the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ABSTRACTA__MULTIPLICIDAD_B = 5;

	/**
	 * The number of structural features of the '<em>Relacion Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ABSTRACTA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstracta.impl.ContainmentAbstractaImpl <em>Containment Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.ContainmentAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getContainmentAbstracta()
	 * @generated
	 */
	int CONTAINMENT_ABSTRACTA = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ABSTRACTA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ABSTRACTA__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Multiplicidad A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ABSTRACTA__MULTIPLICIDAD_A = 2;

	/**
	 * The feature id for the '<em><b>Multiplicidad B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ABSTRACTA__MULTIPLICIDAD_B = 3;

	/**
	 * The feature id for the '<em><b>Rol A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ABSTRACTA__ROL_A = 4;

	/**
	 * The feature id for the '<em><b>Rol B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ABSTRACTA__ROL_B = 5;

	/**
	 * The number of structural features of the '<em>Containment Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_ABSTRACTA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link abstracta.impl.HerenciaAbstractaImpl <em>Herencia Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracta.impl.HerenciaAbstractaImpl
	 * @see abstracta.impl.AbstractaPackageImpl#getHerenciaAbstracta()
	 * @generated
	 */
	int HERENCIA_ABSTRACTA = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_ABSTRACTA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_ABSTRACTA__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Herencia Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_ABSTRACTA_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link abstracta.ModelFactoryAbstracta <em>Model Factory Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory Abstracta</em>'.
	 * @see abstracta.ModelFactoryAbstracta
	 * @generated
	 */
	EClass getModelFactoryAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ModelFactoryAbstracta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.ModelFactoryAbstracta#getNombre()
	 * @see #getModelFactoryAbstracta()
	 * @generated
	 */
	EAttribute getModelFactoryAbstracta_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ModelFactoryAbstracta#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see abstracta.ModelFactoryAbstracta#getListaPaquetes()
	 * @see #getModelFactoryAbstracta()
	 * @generated
	 */
	EReference getModelFactoryAbstracta_ListaPaquetes();

	/**
	 * Returns the meta object for class '{@link abstracta.PaqueteAbstracta <em>Paquete Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquete Abstracta</em>'.
	 * @see abstracta.PaqueteAbstracta
	 * @generated
	 */
	EClass getPaqueteAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.PaqueteAbstracta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.PaqueteAbstracta#getNombre()
	 * @see #getPaqueteAbstracta()
	 * @generated
	 */
	EAttribute getPaqueteAbstracta_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.PaqueteAbstracta#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.PaqueteAbstracta#getRuta()
	 * @see #getPaqueteAbstracta()
	 * @generated
	 */
	EAttribute getPaqueteAbstracta_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.PaqueteAbstracta#getListaClases <em>Lista Clases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Clases</em>'.
	 * @see abstracta.PaqueteAbstracta#getListaClases()
	 * @see #getPaqueteAbstracta()
	 * @generated
	 */
	EReference getPaqueteAbstracta_ListaClases();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.PaqueteAbstracta#getListaPaquetes <em>Lista Paquetes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Paquetes</em>'.
	 * @see abstracta.PaqueteAbstracta#getListaPaquetes()
	 * @see #getPaqueteAbstracta()
	 * @generated
	 */
	EReference getPaqueteAbstracta_ListaPaquetes();

	/**
	 * Returns the meta object for class '{@link abstracta.ClaseAbstracta <em>Clase Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase Abstracta</em>'.
	 * @see abstracta.ClaseAbstracta
	 * @generated
	 */
	EClass getClaseAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ClaseAbstracta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.ClaseAbstracta#getNombre()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EAttribute getClaseAbstracta_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ClaseAbstracta#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracta.ClaseAbstracta#getRuta()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EAttribute getClaseAbstracta_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ClaseAbstracta#getListaAtributos <em>Lista Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Atributos</em>'.
	 * @see abstracta.ClaseAbstracta#getListaAtributos()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EReference getClaseAbstracta_ListaAtributos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ClaseAbstracta#getListaMetodos <em>Lista Metodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Metodos</em>'.
	 * @see abstracta.ClaseAbstracta#getListaMetodos()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EReference getClaseAbstracta_ListaMetodos();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ClaseAbstracta#getListaRelaciones <em>Lista Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones</em>'.
	 * @see abstracta.ClaseAbstracta#getListaRelaciones()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EReference getClaseAbstracta_ListaRelaciones();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ClaseAbstracta#getListaRelacionesHerencia <em>Lista Relaciones Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones Herencia</em>'.
	 * @see abstracta.ClaseAbstracta#getListaRelacionesHerencia()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EReference getClaseAbstracta_ListaRelacionesHerencia();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.ClaseAbstracta#getListaRelacionesContaiment <em>Lista Relaciones Contaiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Relaciones Contaiment</em>'.
	 * @see abstracta.ClaseAbstracta#getListaRelacionesContaiment()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EReference getClaseAbstracta_ListaRelacionesContaiment();

	/**
	 * Returns the meta object for class '{@link abstracta.AtributoAbstracta <em>Atributo Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Abstracta</em>'.
	 * @see abstracta.AtributoAbstracta
	 * @generated
	 */
	EClass getAtributoAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.AtributoAbstracta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.AtributoAbstracta#getNombre()
	 * @see #getAtributoAbstracta()
	 * @generated
	 */
	EAttribute getAtributoAbstracta_Nombre();

	/**
	 * Returns the meta object for class '{@link abstracta.ParametroAbstracta <em>Parametro Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametro Abstracta</em>'.
	 * @see abstracta.ParametroAbstracta
	 * @generated
	 */
	EClass getParametroAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ParametroAbstracta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.ParametroAbstracta#getNombre()
	 * @see #getParametroAbstracta()
	 * @generated
	 */
	EAttribute getParametroAbstracta_Nombre();

	/**
	 * Returns the meta object for class '{@link abstracta.MetodoAbstracta <em>Metodo Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metodo Abstracta</em>'.
	 * @see abstracta.MetodoAbstracta
	 * @generated
	 */
	EClass getMetodoAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MetodoAbstracta#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracta.MetodoAbstracta#getNombre()
	 * @see #getMetodoAbstracta()
	 * @generated
	 */
	EAttribute getMetodoAbstracta_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MetodoAbstracta#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentencias</em>'.
	 * @see abstracta.MetodoAbstracta#getSentencias()
	 * @see #getMetodoAbstracta()
	 * @generated
	 */
	EAttribute getMetodoAbstracta_Sentencias();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.MetodoAbstracta#getValorRetorno <em>Valor Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Retorno</em>'.
	 * @see abstracta.MetodoAbstracta#getValorRetorno()
	 * @see #getMetodoAbstracta()
	 * @generated
	 */
	EAttribute getMetodoAbstracta_ValorRetorno();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MetodoAbstracta#getListaParametros <em>Lista Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Parametros</em>'.
	 * @see abstracta.MetodoAbstracta#getListaParametros()
	 * @see #getMetodoAbstracta()
	 * @generated
	 */
	EReference getMetodoAbstracta_ListaParametros();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracta.MetodoAbstracta#getListaAtributos <em>Lista Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lista Atributos</em>'.
	 * @see abstracta.MetodoAbstracta#getListaAtributos()
	 * @see #getMetodoAbstracta()
	 * @generated
	 */
	EReference getMetodoAbstracta_ListaAtributos();

	/**
	 * Returns the meta object for class '{@link abstracta.RelacionAbstracta <em>Relacion Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion Abstracta</em>'.
	 * @see abstracta.RelacionAbstracta
	 * @generated
	 */
	EClass getRelacionAbstracta();

	/**
	 * Returns the meta object for the reference '{@link abstracta.RelacionAbstracta#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.RelacionAbstracta#getSource()
	 * @see #getRelacionAbstracta()
	 * @generated
	 */
	EReference getRelacionAbstracta_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.RelacionAbstracta#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.RelacionAbstracta#getTarget()
	 * @see #getRelacionAbstracta()
	 * @generated
	 */
	EReference getRelacionAbstracta_Target();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelacionAbstracta#getRolA <em>Rol A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol A</em>'.
	 * @see abstracta.RelacionAbstracta#getRolA()
	 * @see #getRelacionAbstracta()
	 * @generated
	 */
	EAttribute getRelacionAbstracta_RolA();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelacionAbstracta#getRolB <em>Rol B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol B</em>'.
	 * @see abstracta.RelacionAbstracta#getRolB()
	 * @see #getRelacionAbstracta()
	 * @generated
	 */
	EAttribute getRelacionAbstracta_RolB();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelacionAbstracta#getMultiplicidadA <em>Multiplicidad A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad A</em>'.
	 * @see abstracta.RelacionAbstracta#getMultiplicidadA()
	 * @see #getRelacionAbstracta()
	 * @generated
	 */
	EAttribute getRelacionAbstracta_MultiplicidadA();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.RelacionAbstracta#getMultiplicidadB <em>Multiplicidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad B</em>'.
	 * @see abstracta.RelacionAbstracta#getMultiplicidadB()
	 * @see #getRelacionAbstracta()
	 * @generated
	 */
	EAttribute getRelacionAbstracta_MultiplicidadB();

	/**
	 * Returns the meta object for class '{@link abstracta.ContainmentAbstracta <em>Containment Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Abstracta</em>'.
	 * @see abstracta.ContainmentAbstracta
	 * @generated
	 */
	EClass getContainmentAbstracta();

	/**
	 * Returns the meta object for the reference '{@link abstracta.ContainmentAbstracta#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.ContainmentAbstracta#getSource()
	 * @see #getContainmentAbstracta()
	 * @generated
	 */
	EReference getContainmentAbstracta_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.ContainmentAbstracta#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.ContainmentAbstracta#getTarget()
	 * @see #getContainmentAbstracta()
	 * @generated
	 */
	EReference getContainmentAbstracta_Target();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ContainmentAbstracta#getMultiplicidadA <em>Multiplicidad A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad A</em>'.
	 * @see abstracta.ContainmentAbstracta#getMultiplicidadA()
	 * @see #getContainmentAbstracta()
	 * @generated
	 */
	EAttribute getContainmentAbstracta_MultiplicidadA();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ContainmentAbstracta#getMultiplicidadB <em>Multiplicidad B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad B</em>'.
	 * @see abstracta.ContainmentAbstracta#getMultiplicidadB()
	 * @see #getContainmentAbstracta()
	 * @generated
	 */
	EAttribute getContainmentAbstracta_MultiplicidadB();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ContainmentAbstracta#getRolA <em>Rol A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol A</em>'.
	 * @see abstracta.ContainmentAbstracta#getRolA()
	 * @see #getContainmentAbstracta()
	 * @generated
	 */
	EAttribute getContainmentAbstracta_RolA();

	/**
	 * Returns the meta object for the attribute '{@link abstracta.ContainmentAbstracta#getRolB <em>Rol B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rol B</em>'.
	 * @see abstracta.ContainmentAbstracta#getRolB()
	 * @see #getContainmentAbstracta()
	 * @generated
	 */
	EAttribute getContainmentAbstracta_RolB();

	/**
	 * Returns the meta object for class '{@link abstracta.HerenciaAbstracta <em>Herencia Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia Abstracta</em>'.
	 * @see abstracta.HerenciaAbstracta
	 * @generated
	 */
	EClass getHerenciaAbstracta();

	/**
	 * Returns the meta object for the reference '{@link abstracta.HerenciaAbstracta#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracta.HerenciaAbstracta#getSource()
	 * @see #getHerenciaAbstracta()
	 * @generated
	 */
	EReference getHerenciaAbstracta_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracta.HerenciaAbstracta#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracta.HerenciaAbstracta#getTarget()
	 * @see #getHerenciaAbstracta()
	 * @generated
	 */
	EReference getHerenciaAbstracta_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractaFactory getAbstractaFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstracta.impl.ModelFactoryAbstractaImpl <em>Model Factory Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ModelFactoryAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getModelFactoryAbstracta()
		 * @generated
		 */
		EClass MODEL_FACTORY_ABSTRACTA = eINSTANCE.getModelFactoryAbstracta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY_ABSTRACTA__NOMBRE = eINSTANCE.getModelFactoryAbstracta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY_ABSTRACTA__LISTA_PAQUETES = eINSTANCE.getModelFactoryAbstracta_ListaPaquetes();

		/**
		 * The meta object literal for the '{@link abstracta.impl.PaqueteAbstractaImpl <em>Paquete Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.PaqueteAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getPaqueteAbstracta()
		 * @generated
		 */
		EClass PAQUETE_ABSTRACTA = eINSTANCE.getPaqueteAbstracta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE_ABSTRACTA__NOMBRE = eINSTANCE.getPaqueteAbstracta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE_ABSTRACTA__RUTA = eINSTANCE.getPaqueteAbstracta_Ruta();

		/**
		 * The meta object literal for the '<em><b>Lista Clases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE_ABSTRACTA__LISTA_CLASES = eINSTANCE.getPaqueteAbstracta_ListaClases();

		/**
		 * The meta object literal for the '<em><b>Lista Paquetes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE_ABSTRACTA__LISTA_PAQUETES = eINSTANCE.getPaqueteAbstracta_ListaPaquetes();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ClaseAbstractaImpl <em>Clase Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ClaseAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getClaseAbstracta()
		 * @generated
		 */
		EClass CLASE_ABSTRACTA = eINSTANCE.getClaseAbstracta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE_ABSTRACTA__NOMBRE = eINSTANCE.getClaseAbstracta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE_ABSTRACTA__RUTA = eINSTANCE.getClaseAbstracta_Ruta();

		/**
		 * The meta object literal for the '<em><b>Lista Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_ABSTRACTA__LISTA_ATRIBUTOS = eINSTANCE.getClaseAbstracta_ListaAtributos();

		/**
		 * The meta object literal for the '<em><b>Lista Metodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_ABSTRACTA__LISTA_METODOS = eINSTANCE.getClaseAbstracta_ListaMetodos();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_ABSTRACTA__LISTA_RELACIONES = eINSTANCE.getClaseAbstracta_ListaRelaciones();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones Herencia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_ABSTRACTA__LISTA_RELACIONES_HERENCIA = eINSTANCE.getClaseAbstracta_ListaRelacionesHerencia();

		/**
		 * The meta object literal for the '<em><b>Lista Relaciones Contaiment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_ABSTRACTA__LISTA_RELACIONES_CONTAIMENT = eINSTANCE.getClaseAbstracta_ListaRelacionesContaiment();

		/**
		 * The meta object literal for the '{@link abstracta.impl.AtributoAbstractaImpl <em>Atributo Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.AtributoAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getAtributoAbstracta()
		 * @generated
		 */
		EClass ATRIBUTO_ABSTRACTA = eINSTANCE.getAtributoAbstracta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO_ABSTRACTA__NOMBRE = eINSTANCE.getAtributoAbstracta_Nombre();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ParametroAbstractaImpl <em>Parametro Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ParametroAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getParametroAbstracta()
		 * @generated
		 */
		EClass PARAMETRO_ABSTRACTA = eINSTANCE.getParametroAbstracta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETRO_ABSTRACTA__NOMBRE = eINSTANCE.getParametroAbstracta_Nombre();

		/**
		 * The meta object literal for the '{@link abstracta.impl.MetodoAbstractaImpl <em>Metodo Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.MetodoAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getMetodoAbstracta()
		 * @generated
		 */
		EClass METODO_ABSTRACTA = eINSTANCE.getMetodoAbstracta();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METODO_ABSTRACTA__NOMBRE = eINSTANCE.getMetodoAbstracta_Nombre();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METODO_ABSTRACTA__SENTENCIAS = eINSTANCE.getMetodoAbstracta_Sentencias();

		/**
		 * The meta object literal for the '<em><b>Valor Retorno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METODO_ABSTRACTA__VALOR_RETORNO = eINSTANCE.getMetodoAbstracta_ValorRetorno();

		/**
		 * The meta object literal for the '<em><b>Lista Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODO_ABSTRACTA__LISTA_PARAMETROS = eINSTANCE.getMetodoAbstracta_ListaParametros();

		/**
		 * The meta object literal for the '<em><b>Lista Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METODO_ABSTRACTA__LISTA_ATRIBUTOS = eINSTANCE.getMetodoAbstracta_ListaAtributos();

		/**
		 * The meta object literal for the '{@link abstracta.impl.RelacionAbstractaImpl <em>Relacion Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.RelacionAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getRelacionAbstracta()
		 * @generated
		 */
		EClass RELACION_ABSTRACTA = eINSTANCE.getRelacionAbstracta();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION_ABSTRACTA__SOURCE = eINSTANCE.getRelacionAbstracta_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION_ABSTRACTA__TARGET = eINSTANCE.getRelacionAbstracta_Target();

		/**
		 * The meta object literal for the '<em><b>Rol A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION_ABSTRACTA__ROL_A = eINSTANCE.getRelacionAbstracta_RolA();

		/**
		 * The meta object literal for the '<em><b>Rol B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION_ABSTRACTA__ROL_B = eINSTANCE.getRelacionAbstracta_RolB();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION_ABSTRACTA__MULTIPLICIDAD_A = eINSTANCE.getRelacionAbstracta_MultiplicidadA();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION_ABSTRACTA__MULTIPLICIDAD_B = eINSTANCE.getRelacionAbstracta_MultiplicidadB();

		/**
		 * The meta object literal for the '{@link abstracta.impl.ContainmentAbstractaImpl <em>Containment Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.ContainmentAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getContainmentAbstracta()
		 * @generated
		 */
		EClass CONTAINMENT_ABSTRACTA = eINSTANCE.getContainmentAbstracta();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_ABSTRACTA__SOURCE = eINSTANCE.getContainmentAbstracta_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_ABSTRACTA__TARGET = eINSTANCE.getContainmentAbstracta_Target();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_ABSTRACTA__MULTIPLICIDAD_A = eINSTANCE.getContainmentAbstracta_MultiplicidadA();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_ABSTRACTA__MULTIPLICIDAD_B = eINSTANCE.getContainmentAbstracta_MultiplicidadB();

		/**
		 * The meta object literal for the '<em><b>Rol A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_ABSTRACTA__ROL_A = eINSTANCE.getContainmentAbstracta_RolA();

		/**
		 * The meta object literal for the '<em><b>Rol B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINMENT_ABSTRACTA__ROL_B = eINSTANCE.getContainmentAbstracta_RolB();

		/**
		 * The meta object literal for the '{@link abstracta.impl.HerenciaAbstractaImpl <em>Herencia Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracta.impl.HerenciaAbstractaImpl
		 * @see abstracta.impl.AbstractaPackageImpl#getHerenciaAbstracta()
		 * @generated
		 */
		EClass HERENCIA_ABSTRACTA = eINSTANCE.getHerenciaAbstracta();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA_ABSTRACTA__SOURCE = eINSTANCE.getHerenciaAbstracta_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA_ABSTRACTA__TARGET = eINSTANCE.getHerenciaAbstracta_Target();

	}

} //AbstractaPackage
