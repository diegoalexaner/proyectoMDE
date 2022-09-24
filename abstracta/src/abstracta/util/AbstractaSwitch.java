/**
 */
package abstracta.util;

import abstracta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see abstracta.AbstractaPackage
 * @generated
 */
public class AbstractaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractaSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AbstractaPackage.MODEL_FACTORY_ABSTRACTA: {
				ModelFactoryAbstracta modelFactoryAbstracta = (ModelFactoryAbstracta)theEObject;
				T result = caseModelFactoryAbstracta(modelFactoryAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.PAQUETE_ABSTRACTA: {
				PaqueteAbstracta paqueteAbstracta = (PaqueteAbstracta)theEObject;
				T result = casePaqueteAbstracta(paqueteAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.CLASE_ABSTRACTA: {
				ClaseAbstracta claseAbstracta = (ClaseAbstracta)theEObject;
				T result = caseClaseAbstracta(claseAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.ATRIBUTO_ABSTRACTA: {
				AtributoAbstracta atributoAbstracta = (AtributoAbstracta)theEObject;
				T result = caseAtributoAbstracta(atributoAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.PARAMETRO_ABSTRACTA: {
				ParametroAbstracta parametroAbstracta = (ParametroAbstracta)theEObject;
				T result = caseParametroAbstracta(parametroAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.METODO_ABSTRACTA: {
				MetodoAbstracta metodoAbstracta = (MetodoAbstracta)theEObject;
				T result = caseMetodoAbstracta(metodoAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.RELACION_ABSTRACTA: {
				RelacionAbstracta relacionAbstracta = (RelacionAbstracta)theEObject;
				T result = caseRelacionAbstracta(relacionAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.CONTAINMENT_ABSTRACTA: {
				ContainmentAbstracta containmentAbstracta = (ContainmentAbstracta)theEObject;
				T result = caseContainmentAbstracta(containmentAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AbstractaPackage.HERENCIA_ABSTRACTA: {
				HerenciaAbstracta herenciaAbstracta = (HerenciaAbstracta)theEObject;
				T result = caseHerenciaAbstracta(herenciaAbstracta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Factory Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Factory Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelFactoryAbstracta(ModelFactoryAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paquete Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paquete Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaqueteAbstracta(PaqueteAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaseAbstracta(ClaseAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoAbstracta(AtributoAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametroAbstracta(ParametroAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metodo Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metodo Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetodoAbstracta(MetodoAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relacion Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relacion Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelacionAbstracta(RelacionAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentAbstracta(ContainmentAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Herencia Abstracta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Herencia Abstracta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHerenciaAbstracta(HerenciaAbstracta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbstractaSwitch
