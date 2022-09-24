/**
 */
package abstracta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Herencia Abstracta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abstracta.HerenciaAbstracta#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.HerenciaAbstracta#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see abstracta.AbstractaPackage#getHerenciaAbstracta()
 * @model
 * @generated
 */
public interface HerenciaAbstracta extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ClaseAbstracta)
	 * @see abstracta.AbstractaPackage#getHerenciaAbstracta_Source()
	 * @model
	 * @generated
	 */
	ClaseAbstracta getSource();

	/**
	 * Sets the value of the '{@link abstracta.HerenciaAbstracta#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ClaseAbstracta value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ClaseAbstracta)
	 * @see abstracta.AbstractaPackage#getHerenciaAbstracta_Target()
	 * @model
	 * @generated
	 */
	ClaseAbstracta getTarget();

	/**
	 * Sets the value of the '{@link abstracta.HerenciaAbstracta#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ClaseAbstracta value);

} // HerenciaAbstracta
