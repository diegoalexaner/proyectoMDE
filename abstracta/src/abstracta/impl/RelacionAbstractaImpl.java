/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.ClaseAbstracta;
import abstracta.RelacionAbstracta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.RelacionAbstractaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.impl.RelacionAbstractaImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link abstracta.impl.RelacionAbstractaImpl#getRolA <em>Rol A</em>}</li>
 *   <li>{@link abstracta.impl.RelacionAbstractaImpl#getRolB <em>Rol B</em>}</li>
 *   <li>{@link abstracta.impl.RelacionAbstractaImpl#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link abstracta.impl.RelacionAbstractaImpl#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionAbstractaImpl extends EObjectImpl implements RelacionAbstracta {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ClaseAbstracta source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ClaseAbstracta target;

	/**
	 * The default value of the '{@link #getRolA() <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolA()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolA() <em>Rol A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolA()
	 * @generated
	 * @ordered
	 */
	protected String rolA = ROL_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolB() <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolB()
	 * @generated
	 * @ordered
	 */
	protected static final String ROL_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolB() <em>Rol B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolB()
	 * @generated
	 * @ordered
	 */
	protected String rolB = ROL_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadA() <em>Multiplicidad A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadA()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadA = MULTIPLICIDAD_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidadB() <em>Multiplicidad B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidadB()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidadB = MULTIPLICIDAD_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionAbstractaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.RELACION_ABSTRACTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseAbstracta getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ClaseAbstracta)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.RELACION_ABSTRACTA__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseAbstracta basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ClaseAbstracta newSource) {
		ClaseAbstracta oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELACION_ABSTRACTA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseAbstracta getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ClaseAbstracta)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.RELACION_ABSTRACTA__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaseAbstracta basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ClaseAbstracta newTarget) {
		ClaseAbstracta oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELACION_ABSTRACTA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRolA() {
		return rolA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolA(String newRolA) {
		String oldRolA = rolA;
		rolA = newRolA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELACION_ABSTRACTA__ROL_A, oldRolA, rolA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRolB() {
		return rolB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolB(String newRolB) {
		String oldRolB = rolB;
		rolB = newRolB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELACION_ABSTRACTA__ROL_B, oldRolB, rolB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidadA() {
		return multiplicidadA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadA(String newMultiplicidadA) {
		String oldMultiplicidadA = multiplicidadA;
		multiplicidadA = newMultiplicidadA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_A, oldMultiplicidadA, multiplicidadA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidadB() {
		return multiplicidadB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidadB(String newMultiplicidadB) {
		String oldMultiplicidadB = multiplicidadB;
		multiplicidadB = newMultiplicidadB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_B, oldMultiplicidadB, multiplicidadB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.RELACION_ABSTRACTA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AbstractaPackage.RELACION_ABSTRACTA__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_A:
				return getRolA();
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_B:
				return getRolB();
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_A:
				return getMultiplicidadA();
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_B:
				return getMultiplicidadB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractaPackage.RELACION_ABSTRACTA__SOURCE:
				setSource((ClaseAbstracta)newValue);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__TARGET:
				setTarget((ClaseAbstracta)newValue);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_A:
				setRolA((String)newValue);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_B:
				setRolB((String)newValue);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_A:
				setMultiplicidadA((String)newValue);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_B:
				setMultiplicidadB((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbstractaPackage.RELACION_ABSTRACTA__SOURCE:
				setSource((ClaseAbstracta)null);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__TARGET:
				setTarget((ClaseAbstracta)null);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_A:
				setRolA(ROL_A_EDEFAULT);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_B:
				setRolB(ROL_B_EDEFAULT);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_A:
				setMultiplicidadA(MULTIPLICIDAD_A_EDEFAULT);
				return;
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_B:
				setMultiplicidadB(MULTIPLICIDAD_B_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbstractaPackage.RELACION_ABSTRACTA__SOURCE:
				return source != null;
			case AbstractaPackage.RELACION_ABSTRACTA__TARGET:
				return target != null;
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_A:
				return ROL_A_EDEFAULT == null ? rolA != null : !ROL_A_EDEFAULT.equals(rolA);
			case AbstractaPackage.RELACION_ABSTRACTA__ROL_B:
				return ROL_B_EDEFAULT == null ? rolB != null : !ROL_B_EDEFAULT.equals(rolB);
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_A:
				return MULTIPLICIDAD_A_EDEFAULT == null ? multiplicidadA != null : !MULTIPLICIDAD_A_EDEFAULT.equals(multiplicidadA);
			case AbstractaPackage.RELACION_ABSTRACTA__MULTIPLICIDAD_B:
				return MULTIPLICIDAD_B_EDEFAULT == null ? multiplicidadB != null : !MULTIPLICIDAD_B_EDEFAULT.equals(multiplicidadB);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rolA: ");
		result.append(rolA);
		result.append(", rolB: ");
		result.append(rolB);
		result.append(", multiplicidadA: ");
		result.append(multiplicidadA);
		result.append(", multiplicidadB: ");
		result.append(multiplicidadB);
		result.append(')');
		return result.toString();
	}

} //RelacionAbstractaImpl
