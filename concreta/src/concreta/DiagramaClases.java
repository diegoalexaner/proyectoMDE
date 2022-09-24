/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.DiagramaClases#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.DiagramaClases#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link concreta.DiagramaClases#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link concreta.DiagramaClases#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link concreta.DiagramaClases#getListaRelacionesHerencia <em>Lista Relaciones Herencia</em>}</li>
 *   <li>{@link concreta.DiagramaClases#getListaRelacionesContaiment <em>Lista Relaciones Contaiment</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getDiagramaClases()
 * @model
 * @generated
 */
public interface DiagramaClases extends EObject {
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
	 * @see concreta.ConcretaPackage#getDiagramaClases_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.DiagramaClases#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Paquete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Paquetes</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramaClases_ListaPaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paquete> getListaPaquetes();

	/**
	 * Returns the value of the '<em><b>Lista Clases</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Clase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Clases</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramaClases_ListaClases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clase> getListaClases();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Relacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramaClases_ListaRelaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacion> getListaRelaciones();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones Herencia</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones Herencia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones Herencia</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramaClases_ListaRelacionesHerencia()
	 * @model containment="true"
	 * @generated
	 */
	EList<Herencia> getListaRelacionesHerencia();

	/**
	 * Returns the value of the '<em><b>Lista Relaciones Contaiment</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Containment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Relaciones Contaiment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Relaciones Contaiment</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getDiagramaClases_ListaRelacionesContaiment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Containment> getListaRelacionesContaiment();

} // DiagramaClases
