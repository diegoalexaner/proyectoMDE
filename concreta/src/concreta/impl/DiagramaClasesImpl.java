/**
 */
package concreta.impl;

import concreta.Clase;
import concreta.ConcretaPackage;
import concreta.Containment;
import concreta.DiagramaClases;
import concreta.Herencia;
import concreta.Paquete;
import concreta.Relacion;

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
 * An implementation of the model object '<em><b>Diagrama Clases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link concreta.impl.DiagramaClasesImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link concreta.impl.DiagramaClasesImpl#getListaPaquetes <em>Lista Paquetes</em>}</li>
 *   <li>{@link concreta.impl.DiagramaClasesImpl#getListaClases <em>Lista Clases</em>}</li>
 *   <li>{@link concreta.impl.DiagramaClasesImpl#getListaRelaciones <em>Lista Relaciones</em>}</li>
 *   <li>{@link concreta.impl.DiagramaClasesImpl#getListaRelacionesHerencia <em>Lista Relaciones Herencia</em>}</li>
 *   <li>{@link concreta.impl.DiagramaClasesImpl#getListaRelacionesContaiment <em>Lista Relaciones Contaiment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaClasesImpl extends EObjectImpl implements DiagramaClases {
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
	 * The cached value of the '{@link #getListaPaquetes() <em>Lista Paquetes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaPaquetes()
	 * @generated
	 * @ordered
	 */
	protected EList<Paquete> listaPaquetes;

	/**
	 * The cached value of the '{@link #getListaClases() <em>Lista Clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaClases()
	 * @generated
	 * @ordered
	 */
	protected EList<Clase> listaClases;

	/**
	 * The cached value of the '{@link #getListaRelaciones() <em>Lista Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> listaRelaciones;

	/**
	 * The cached value of the '{@link #getListaRelacionesHerencia() <em>Lista Relaciones Herencia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRelacionesHerencia()
	 * @generated
	 * @ordered
	 */
	protected EList<Herencia> listaRelacionesHerencia;

	/**
	 * The cached value of the '{@link #getListaRelacionesContaiment() <em>Lista Relaciones Contaiment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaRelacionesContaiment()
	 * @generated
	 * @ordered
	 */
	protected EList<Containment> listaRelacionesContaiment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaClasesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConcretaPackage.Literals.DIAGRAMA_CLASES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConcretaPackage.DIAGRAMA_CLASES__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paquete> getListaPaquetes() {
		if (listaPaquetes == null) {
			listaPaquetes = new EObjectContainmentEList<Paquete>(Paquete.class, this, ConcretaPackage.DIAGRAMA_CLASES__LISTA_PAQUETES);
		}
		return listaPaquetes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clase> getListaClases() {
		if (listaClases == null) {
			listaClases = new EObjectContainmentEList<Clase>(Clase.class, this, ConcretaPackage.DIAGRAMA_CLASES__LISTA_CLASES);
		}
		return listaClases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getListaRelaciones() {
		if (listaRelaciones == null) {
			listaRelaciones = new EObjectContainmentEList<Relacion>(Relacion.class, this, ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES);
		}
		return listaRelaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Herencia> getListaRelacionesHerencia() {
		if (listaRelacionesHerencia == null) {
			listaRelacionesHerencia = new EObjectContainmentEList<Herencia>(Herencia.class, this, ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_HERENCIA);
		}
		return listaRelacionesHerencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Containment> getListaRelacionesContaiment() {
		if (listaRelacionesContaiment == null) {
			listaRelacionesContaiment = new EObjectContainmentEList<Containment>(Containment.class, this, ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_CONTAIMENT);
		}
		return listaRelacionesContaiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_PAQUETES:
				return ((InternalEList<?>)getListaPaquetes()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_CLASES:
				return ((InternalEList<?>)getListaClases()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES:
				return ((InternalEList<?>)getListaRelaciones()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_HERENCIA:
				return ((InternalEList<?>)getListaRelacionesHerencia()).basicRemove(otherEnd, msgs);
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_CONTAIMENT:
				return ((InternalEList<?>)getListaRelacionesContaiment()).basicRemove(otherEnd, msgs);
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
			case ConcretaPackage.DIAGRAMA_CLASES__NOMBRE:
				return getNombre();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_PAQUETES:
				return getListaPaquetes();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_CLASES:
				return getListaClases();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES:
				return getListaRelaciones();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_HERENCIA:
				return getListaRelacionesHerencia();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_CONTAIMENT:
				return getListaRelacionesContaiment();
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
			case ConcretaPackage.DIAGRAMA_CLASES__NOMBRE:
				setNombre((String)newValue);
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
				getListaPaquetes().addAll((Collection<? extends Paquete>)newValue);
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				getListaClases().addAll((Collection<? extends Clase>)newValue);
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				getListaRelaciones().addAll((Collection<? extends Relacion>)newValue);
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_HERENCIA:
				getListaRelacionesHerencia().clear();
				getListaRelacionesHerencia().addAll((Collection<? extends Herencia>)newValue);
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_CONTAIMENT:
				getListaRelacionesContaiment().clear();
				getListaRelacionesContaiment().addAll((Collection<? extends Containment>)newValue);
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
			case ConcretaPackage.DIAGRAMA_CLASES__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_PAQUETES:
				getListaPaquetes().clear();
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_CLASES:
				getListaClases().clear();
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES:
				getListaRelaciones().clear();
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_HERENCIA:
				getListaRelacionesHerencia().clear();
				return;
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_CONTAIMENT:
				getListaRelacionesContaiment().clear();
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
			case ConcretaPackage.DIAGRAMA_CLASES__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_PAQUETES:
				return listaPaquetes != null && !listaPaquetes.isEmpty();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_CLASES:
				return listaClases != null && !listaClases.isEmpty();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES:
				return listaRelaciones != null && !listaRelaciones.isEmpty();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_HERENCIA:
				return listaRelacionesHerencia != null && !listaRelacionesHerencia.isEmpty();
			case ConcretaPackage.DIAGRAMA_CLASES__LISTA_RELACIONES_CONTAIMENT:
				return listaRelacionesContaiment != null && !listaRelacionesContaiment.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DiagramaClasesImpl
