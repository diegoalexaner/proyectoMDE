/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase Abstracta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.ClaseAbstracta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.ClaseAbstracta#getRuta <em>Ruta</em>}</li>
 *   <li>{@link abstracta.ClaseAbstracta#getListaAtributos <em>Lista Atributos</em>}</li>
 *   <li>{@link abstracta.ClaseAbstracta#getListaMetodos <em>Lista Metodos</em>}</li>
 *   <li>{@link abstracta.ClaseAbstracta#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link abstracta.ClaseAbstracta#getListaRelacionesHerencia <em>Lista Relaciones Herencia</em>}</li>
 *   <li>{@link abstracta.ClaseAbstracta#getListaRelacionesContaiment <em>Lista Relaciones Contaiment</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getClaseAbstracta()
 * @model
 * @generated
 */
public interface ClaseAbstracta extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see abstracta.AbstractaPackage#getClaseAbstracta_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.ClaseAbstracta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruta</em>' attribute.
	 * @see #setRuta(String)
	 * @see abstracta.AbstractaPackage#getClaseAbstracta_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link abstracta.ClaseAbstracta#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.AtributoAbstracta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Atributos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClaseAbstracta_ListaAtributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoAbstracta> getListaAtributos();

	/**
	 * Returns the value of the '<em><b>Lista Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.MetodoAbstracta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Metodos</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClaseAbstracta_ListaMetodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetodoAbstracta> getListaMetodos();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.RelacionAbstracta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClaseAbstracta_ListaRelaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelacionAbstracta> getListaRelaciones();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones Herencia</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.HerenciaAbstracta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones Herencia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones Herencia</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClaseAbstracta_ListaRelacionesHerencia()
	 * @model containment="true"
	 * @generated
	 */
	EList<HerenciaAbstracta> getListaRelacionesHerencia();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones Contaiment</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.ContainmentAbstracta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones Contaiment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones Contaiment</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getClaseAbstracta_ListaRelacionesContaiment()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainmentAbstracta> getListaRelacionesContaiment();

} // ClaseAbstracta
