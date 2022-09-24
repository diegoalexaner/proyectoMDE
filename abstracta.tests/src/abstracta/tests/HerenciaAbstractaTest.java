/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.HerenciaAbstracta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Herencia Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HerenciaAbstractaTest extends TestCase {

	/**
	 * The fixture for this Herencia Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaAbstracta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HerenciaAbstractaTest.class);
	}

	/**
	 * Constructs a new Herencia Abstracta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HerenciaAbstractaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Herencia Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HerenciaAbstracta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Herencia Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaAbstracta getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AbstractaFactory.eINSTANCE.createHerenciaAbstracta());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HerenciaAbstractaTest
