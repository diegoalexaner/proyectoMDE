/**
 */
package concreta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concreta.Metodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.Metodo#getSentencia <em>Sentencia</em>}</li>
 *   <li>{@link concreta.Metodo#getValorRetorno <em>Valor Retorno</em>}</li>
 *   <li>{@link concreta.Metodo#getListaParametros <em>Lista Parametros</em>}</li>
 * </ul>
 *
 * @see concreta.ConcretaPackage#getMetodo()
 * @model annotation="gmf.node label='nombre' color='173,228,213'"
 * @generated
 */
public interface Metodo extends EObject {
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
	 * @see concreta.ConcretaPackage#getMetodo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link concreta.Metodo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Sentencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencia</em>' attribute.
	 * @see #setSentencia(String)
	 * @see concreta.ConcretaPackage#getMetodo_Sentencia()
	 * @model
	 * @generated
	 */
	String getSentencia();

	/**
	 * Sets the value of the '{@link concreta.Metodo#getSentencia <em>Sentencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentencia</em>' attribute.
	 * @see #getSentencia()
	 * @generated
	 */
	void setSentencia(String value);

	/**
	 * Returns the value of the '<em><b>Valor Retorno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Retorno</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Retorno</em>' attribute.
	 * @see #setValorRetorno(String)
	 * @see concreta.ConcretaPackage#getMetodo_ValorRetorno()
	 * @model
	 * @generated
	 */
	String getValorRetorno();

	/**
	 * Sets the value of the '{@link concreta.Metodo#getValorRetorno <em>Valor Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Retorno</em>' attribute.
	 * @see #getValorRetorno()
	 * @generated
	 */
	void setValorRetorno(String value);

	/**
	 * Returns the value of the '<em><b>Lista Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link concreta.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista Parametros</em>' containment reference list.
	 * @see concreta.ConcretaPackage#getMetodo_ListaParametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getListaParametros();

} // Metodo
