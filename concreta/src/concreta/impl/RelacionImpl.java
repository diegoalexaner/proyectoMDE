/**
 */
package concreta.impl;

import concreta.Clase;
import concreta.ConcretaPackage;
import concreta.Relacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.RelacionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link concreta.impl.RelacionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link concreta.impl.RelacionImpl#getMultiplicidadA <em>Multiplicidad A</em>}</li>
 *   <li>{@link concreta.impl.RelacionImpl#getMultiplicidadB <em>Multiplicidad B</em>}</li>
 *   <li>{@link concreta.impl.RelacionImpl#getRolA <em>Rol A</em>}</li>
 *   <li>{@link concreta.impl.RelacionImpl#getRolB <em>Rol B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends EObjectImpl implements Relacion {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Clase source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Clase target;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Clase)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretaPackage.RELACION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Clase newSource) {
		Clase oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELACION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Clase)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcretaPackage.RELACION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Clase newTarget) {
		Clase oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELACION__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELACION__MULTIPLICIDAD_A, oldMultiplicidadA, multiplicidadA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELACION__MULTIPLICIDAD_B, oldMultiplicidadB, multiplicidadB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELACION__ROL_A, oldRolA, rolA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.RELACION__ROL_B, oldRolB, rolB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.RELACION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ConcretaPackage.RELACION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ConcretaPackage.RELACION__MULTIPLICIDAD_A:
				return getMultiplicidadA();
			case ConcretaPackage.RELACION__MULTIPLICIDAD_B:
				return getMultiplicidadB();
			case ConcretaPackage.RELACION__ROL_A:
				return getRolA();
			case ConcretaPackage.RELACION__ROL_B:
				return getRolB();
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
			case ConcretaPackage.RELACION__SOURCE:
				setSource((Clase)newValue);
				return;
			case ConcretaPackage.RELACION__TARGET:
				setTarget((Clase)newValue);
				return;
			case ConcretaPackage.RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA((String)newValue);
				return;
			case ConcretaPackage.RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB((String)newValue);
				return;
			case ConcretaPackage.RELACION__ROL_A:
				setRolA((String)newValue);
				return;
			case ConcretaPackage.RELACION__ROL_B:
				setRolB((String)newValue);
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
			case ConcretaPackage.RELACION__SOURCE:
				setSource((Clase)null);
				return;
			case ConcretaPackage.RELACION__TARGET:
				setTarget((Clase)null);
				return;
			case ConcretaPackage.RELACION__MULTIPLICIDAD_A:
				setMultiplicidadA(MULTIPLICIDAD_A_EDEFAULT);
				return;
			case ConcretaPackage.RELACION__MULTIPLICIDAD_B:
				setMultiplicidadB(MULTIPLICIDAD_B_EDEFAULT);
				return;
			case ConcretaPackage.RELACION__ROL_A:
				setRolA(ROL_A_EDEFAULT);
				return;
			case ConcretaPackage.RELACION__ROL_B:
				setRolB(ROL_B_EDEFAULT);
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
			case ConcretaPackage.RELACION__SOURCE:
				return source != null;
			case ConcretaPackage.RELACION__TARGET:
				return target != null;
			case ConcretaPackage.RELACION__MULTIPLICIDAD_A:
				return MULTIPLICIDAD_A_EDEFAULT == null ? multiplicidadA != null : !MULTIPLICIDAD_A_EDEFAULT.equals(multiplicidadA);
			case ConcretaPackage.RELACION__MULTIPLICIDAD_B:
				return MULTIPLICIDAD_B_EDEFAULT == null ? multiplicidadB != null : !MULTIPLICIDAD_B_EDEFAULT.equals(multiplicidadB);
			case ConcretaPackage.RELACION__ROL_A:
				return ROL_A_EDEFAULT == null ? rolA != null : !ROL_A_EDEFAULT.equals(rolA);
			case ConcretaPackage.RELACION__ROL_B:
				return ROL_B_EDEFAULT == null ? rolB != null : !ROL_B_EDEFAULT.equals(rolB);
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
		result.append(" (multiplicidadA: ");
		result.append(multiplicidadA);
		result.append(", multiplicidadB: ");
		result.append(multiplicidadB);
		result.append(", rolA: ");
		result.append(rolA);
		result.append(", rolB: ");
		result.append(rolB);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
