/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.ContainmentAbstracta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Containment Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainmentAbstractaTest extends TestCase {

	/**
	 * The fixture for this Containment Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentAbstracta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainmentAbstractaTest.class);
	}

	/**
	 * Constructs a new Containment Abstracta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentAbstractaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Containment Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ContainmentAbstracta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Containment Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentAbstracta getFixture() {
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
		setFixture(AbstractaFactory.eINSTANCE.createContainmentAbstracta());
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

} //ContainmentAbstractaTest
