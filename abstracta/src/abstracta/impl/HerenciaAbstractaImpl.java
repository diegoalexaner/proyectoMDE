/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.ClaseAbstracta;
import abstracta.HerenciaAbstracta;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Herencia Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.HerenciaAbstractaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link abstracta.impl.HerenciaAbstractaImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HerenciaAbstractaImpl extends EObjectImpl implements HerenciaAbstracta {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaAbstractaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.HERENCIA_ABSTRACTA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.HERENCIA_ABSTRACTA__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.HERENCIA_ABSTRACTA__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractaPackage.HERENCIA_ABSTRACTA__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.HERENCIA_ABSTRACTA__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractaPackage.HERENCIA_ABSTRACTA__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AbstractaPackage.HERENCIA_ABSTRACTA__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case AbstractaPackage.HERENCIA_ABSTRACTA__SOURCE:
				setSource((ClaseAbstracta)newValue);
				return;
			case AbstractaPackage.HERENCIA_ABSTRACTA__TARGET:
				setTarget((ClaseAbstracta)newValue);
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
			case AbstractaPackage.HERENCIA_ABSTRACTA__SOURCE:
				setSource((ClaseAbstracta)null);
				return;
			case AbstractaPackage.HERENCIA_ABSTRACTA__TARGET:
				setTarget((ClaseAbstracta)null);
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
			case AbstractaPackage.HERENCIA_ABSTRACTA__SOURCE:
				return source != null;
			case AbstractaPackage.HERENCIA_ABSTRACTA__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //HerenciaAbstractaImpl
