/**
 */
package abstracta.impl;

import abstracta.AbstractaPackage;
import abstracta.AtributoAbstracta;
import abstracta.MetodoAbstracta;
import abstracta.ParametroAbstracta;

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
 * An implementation of the model object '<em><b>Metodo Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abstracta.impl.MetodoAbstractaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link abstracta.impl.MetodoAbstractaImpl#getSentencias <em>Sentencias</em>}</li>
 *   <li>{@link abstracta.impl.MetodoAbstractaImpl#getValorRetorno <em>Valor Retorno</em>}</li>
 *   <li>{@link abstracta.impl.MetodoAbstractaImpl#getListaParametros <em>Lista Parametros</em>}</li>
 *   <li>{@link abstracta.impl.MetodoAbstractaImpl#getListaAtributos <em>Lista Atributos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetodoAbstractaImpl extends EObjectImpl implements MetodoAbstracta {
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
	 * The default value of the '{@link #getSentencias() <em>Sentencias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencias()
	 * @generated
	 * @ordered
	 */
	protected static final String SENTENCIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSentencias() <em>Sentencias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencias()
	 * @generated
	 * @ordered
	 */
	protected String sentencias = SENTENCIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorRetorno() <em>Valor Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorRetorno()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_RETORNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValorRetorno() <em>Valor Retorno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorRetorno()
	 * @generated
	 * @ordered
	 */
	protected String valorRetorno = VALOR_RETORNO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListaParametros() <em>Lista Parametros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaParametros()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametroAbstracta> listaParametros;

	/**
	 * The cached value of the '{@link #getListaAtributos() <em>Lista Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListaAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoAbstracta> listaAtributos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetodoAbstractaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractaPackage.Literals.METODO_ABSTRACTA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.METODO_ABSTRACTA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSentencias() {
		return sentencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSentencias(String newSentencias) {
		String oldSentencias = sentencias;
		sentencias = newSentencias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.METODO_ABSTRACTA__SENTENCIAS, oldSentencias, sentencias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValorRetorno() {
		return valorRetorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorRetorno(String newValorRetorno) {
		String oldValorRetorno = valorRetorno;
		valorRetorno = newValorRetorno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractaPackage.METODO_ABSTRACTA__VALOR_RETORNO, oldValorRetorno, valorRetorno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParametroAbstracta> getListaParametros() {
		if (listaParametros == null) {
			listaParametros = new EObjectContainmentEList<ParametroAbstracta>(ParametroAbstracta.class, this, AbstractaPackage.METODO_ABSTRACTA__LISTA_PARAMETROS);
		}
		return listaParametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoAbstracta> getListaAtributos() {
		if (listaAtributos == null) {
			listaAtributos = new EObjectContainmentEList<AtributoAbstracta>(AtributoAbstracta.class, this, AbstractaPackage.METODO_ABSTRACTA__LISTA_ATRIBUTOS);
		}
		return listaAtributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_PARAMETROS:
				return ((InternalEList<?>)getListaParametros()).basicRemove(otherEnd, msgs);
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_ATRIBUTOS:
				return ((InternalEList<?>)getListaAtributos()).basicRemove(otherEnd, msgs);
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
			case AbstractaPackage.METODO_ABSTRACTA__NOMBRE:
				return getNombre();
			case AbstractaPackage.METODO_ABSTRACTA__SENTENCIAS:
				return getSentencias();
			case AbstractaPackage.METODO_ABSTRACTA__VALOR_RETORNO:
				return getValorRetorno();
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_PARAMETROS:
				return getListaParametros();
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_ATRIBUTOS:
				return getListaAtributos();
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
			case AbstractaPackage.METODO_ABSTRACTA__NOMBRE:
				setNombre((String)newValue);
				return;
			case AbstractaPackage.METODO_ABSTRACTA__SENTENCIAS:
				setSentencias((String)newValue);
				return;
			case AbstractaPackage.METODO_ABSTRACTA__VALOR_RETORNO:
				setValorRetorno((String)newValue);
				return;
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_PARAMETROS:
				getListaParametros().clear();
				getListaParametros().addAll((Collection<? extends ParametroAbstracta>)newValue);
				return;
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
				getListaAtributos().addAll((Collection<? extends AtributoAbstracta>)newValue);
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
			case AbstractaPackage.METODO_ABSTRACTA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case AbstractaPackage.METODO_ABSTRACTA__SENTENCIAS:
				setSentencias(SENTENCIAS_EDEFAULT);
				return;
			case AbstractaPackage.METODO_ABSTRACTA__VALOR_RETORNO:
				setValorRetorno(VALOR_RETORNO_EDEFAULT);
				return;
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_PARAMETROS:
				getListaParametros().clear();
				return;
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_ATRIBUTOS:
				getListaAtributos().clear();
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
			case AbstractaPackage.METODO_ABSTRACTA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case AbstractaPackage.METODO_ABSTRACTA__SENTENCIAS:
				return SENTENCIAS_EDEFAULT == null ? sentencias != null : !SENTENCIAS_EDEFAULT.equals(sentencias);
			case AbstractaPackage.METODO_ABSTRACTA__VALOR_RETORNO:
				return VALOR_RETORNO_EDEFAULT == null ? valorRetorno != null : !VALOR_RETORNO_EDEFAULT.equals(valorRetorno);
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_PARAMETROS:
				return listaParametros != null && !listaParametros.isEmpty();
			case AbstractaPackage.METODO_ABSTRACTA__LISTA_ATRIBUTOS:
				return listaAtributos != null && !listaAtributos.isEmpty();
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
		result.append(", sentencias: ");
		result.append(sentencias);
		result.append(", valorRetorno: ");
		result.append(valorRetorno);
		result.append(')');
		return result.toString();
	}

} //MetodoAbstractaImpl
