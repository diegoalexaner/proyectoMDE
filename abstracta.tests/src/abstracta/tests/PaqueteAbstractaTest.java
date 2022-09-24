/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.PaqueteAbstracta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paquete Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaqueteAbstractaTest extends TestCase {

	/**
	 * The fixture for this Paquete Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteAbstracta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaqueteAbstractaTest.class);
	}

	/**
	 * Constructs a new Paquete Abstracta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaqueteAbstractaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Paquete Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PaqueteAbstracta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Paquete Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteAbstracta getFixture() {
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
		setFixture(AbstractaFactory.eINSTANCE.createPaqueteAbstracta());
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

} //PaqueteAbstractaTest
