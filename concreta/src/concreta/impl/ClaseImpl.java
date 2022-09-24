/**
 */
package concreta.impl;

import concreta.Atributo;
import concreta.Clase;
import concreta.ConcretaPackage;
import concreta.Metodo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.ClaseImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.ClaseImpl#getRuta <em>Ruta</em>}</li>
 *   <li>{@link concreta.impl.ClaseImpl#getListaAtributos <em>Lista Atributos</em>}</li>
 *   <li>{@link concreta.impl.ClaseImpl#getListaMetodos <em>Lista Metodos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseImpl extends EObjectImpl implements Clase {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected static final String RUTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuta() <em>Ruta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuta()
	 * @generated
	 * @ordered
	 */
	protected String ruta = RUTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaAtributos() <em>Lista Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> listaAtributos;

	/**
	 * The cached value of the '{@link #getListaMetodos() <em>Lista Metodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaMetodos()
	 * @generated
	 * @ordered
	 */
	protected EList<Metodo> listaMetodos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.CLASE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuta(String newRuta) {
		String oldRuta = ruta;
		ruta = newRuta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.CLASE__RUTA, oldRuta, ruta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getListaAtributos() {
		if (listaAtributos == null) {
			listaAtributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, ConcretaPackage.CLASE__LISTA_ATRIBUTOS);
		}
		return listaAtributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metodo> getListaMetodos() {
		if (listaMetodos == null) {
			listaMetodos = new EObjectContainmentEList<Metodo>(Metodo.class, this, ConcretaPackage.CLASE__LISTA_METODOS);
		}
		return listaMetodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.CLASE__LISTA_ATRIBUTOS:
				return ((InternalEList<?>)getListaAtributos()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.CLASE__LISTA_METODOS:
				return ((InternalEList<?>)getListaMetodos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConcretaPackage.CLASE__NOMBRE:
				return getNombre();
			case ConcretaPackage.CLASE__RUTA:
				return getRuta();
			case ConcretaPackage.CLASE__LISTA_ATRIBUTOS:
				return getListaAtributos();
			case ConcretaPackage.CLASE__LISTA_METODOS:
				return getListaMetodos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConcretaPackage.CLASE__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.CLASE__RUTA:
				setRuta((String)newValue);
				return;
			case ConcretaPackage.CLASE__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
				getListaAtributos().addAll((Collection<? extends Atributo>)newValue);
				return;
			case ConcretaPackage.CLASE__LISTA_METODOS:
				getListaMetodos().clear();
				getListaMetodos().addAll((Collection<? extends Metodo>)newValue);
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
			case ConcretaPackage.CLASE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.CLASE__RUTA:
				setRuta(RUTA_EDEFAULT);
				return;
			case ConcretaPackage.CLASE__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
				return;
			case ConcretaPackage.CLASE__LISTA_METODOS:
				getListaMetodos().clear();
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
			case ConcretaPackage.CLASE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.CLASE__RUTA:
				return RUTA_EDEFAULT == null ? ruta != null : !RUTA_EDEFAULT.equals(ruta);
			case ConcretaPackage.CLASE__LISTA_ATRIBUTOS:
				return listaAtributos != null && !listaAtributos.isEmpty();
			case ConcretaPackage.CLASE__LISTA_METODOS:
				return listaMetodos != null && !listaMetodos.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", ruta: ");
		result.append(ruta);
		result.append(')');
		return result.toString();
	}

} //ClaseImpl
