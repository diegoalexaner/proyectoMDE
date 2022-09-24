/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.MetodoAbstracta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metodo Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetodoAbstractaTest extends TestCase {

	/**
	 * The fixture for this Metodo Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetodoAbstracta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetodoAbstractaTest.class);
	}

	/**
	 * Constructs a new Metodo Abstracta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetodoAbstractaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Metodo Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MetodoAbstracta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Metodo Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetodoAbstracta getFixture() {
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
		setFixture(AbstractaFactory.eINSTANCE.createMetodoAbstracta());
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

} //MetodoAbstractaTest
