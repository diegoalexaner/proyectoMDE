/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.RelacionAbstracta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relacion Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelacionAbstractaTest extends TestCase {

	/**
	 * The fixture for this Relacion Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionAbstracta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelacionAbstractaTest.class);
	}

	/**
	 * Constructs a new Relacion Abstracta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionAbstractaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relacion Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelacionAbstracta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relacion Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionAbstracta getFixture() {
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
		setFixture(AbstractaFactory.eINSTANCE.createRelacionAbstracta());
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

} //RelacionAbstractaTest
