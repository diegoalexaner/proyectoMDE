/**
 */
package abstracta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Abstracta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.ModelFactoryAbstracta#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.ModelFactoryAbstracta#getListaPaquetes <em>Lista Paquetes</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getModelFactoryAbstracta()
 * @model
 * @generated
 */
public interface ModelFactoryAbstracta extends EObject {
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
	 * @see abstracta.AbstractaPackage#getModelFactoryAbstracta_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link abstracta.ModelFactoryAbstracta#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Lista Paquetes</b></em>' containment reference list.
	 * The list contents are of type {@link abstracta.PaqueteAbstracta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Paquetes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Paquetes</em>' containment reference list.
	 * @see abstracta.AbstractaPackage#getModelFactoryAbstracta_ListaPaquetes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PaqueteAbstracta> getListaPaquetes();

} // ModelFactoryAbstracta
