/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.Clase#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.Clase#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.Clase#getListaAtributos <em>Lista Atributos</em>}</li>
 *   <li>{@link concreta.Clase#getListaMetodos <em>Lista Metodos</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getClase()
 * @model annotation="gmf.node label='nombre' color='173,228,213' label.color='37,66,86' border.color='37,66,86'"
 * @generated
 */
public interface Clase extends EObject {
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
	 * @see concreta.ConcretaPackage#getClase_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.Clase#getNombre <em>Nombre</em>}' attribute.
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
	 * @see concreta.ConcretaPackage#getClase_Ruta()
	 * @model
	 * @generated
	 */
	String getRuta();

	/**
	 * Sets the value of the '{@link concreta.Clase#getRuta <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruta</em>' attribute.
	 * @see #getRuta()
	 * @generated
	 */
	void setRuta(String value);

	/**
	 * Returns the value of the '<em><b>Lista Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Atributos</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getClase_ListaAtributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getListaAtributos();

	/**
	 * Returns the value of the '<em><b>Lista Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Metodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Metodos</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getClase_ListaMetodos()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	EList<Metodo> getListaMetodos();

} // Clase
