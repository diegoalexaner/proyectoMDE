/**
 */
package concreta.tests;

import concreta.ConcretaFactory;
import concreta.Herencia;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HerenciaTest extends TestCase {

	/**
	 * The fixture for this Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Herencia fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HerenciaTest.class);
	}

	/**
	 * Constructs a new Herencia test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HerenciaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Herencia fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Herencia test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Herencia getFixture() {
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
		setFixture(ConcretaFactory.eINSTANCE.createHerencia());
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

} //HerenciaTest
