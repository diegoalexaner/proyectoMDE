/**
 */
package abstracta.tests;

import abstracta.AbstractaFactory;
import abstracta.ModelFactoryAbstracta;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Factory Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryAbstractaTest extends TestCase {

	/**
	 * The fixture for this Model Factory Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstracta fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelFactoryAbstractaTest.class);
	}

	/**
	 * Constructs a new Model Factory Abstracta test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryAbstractaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Factory Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelFactoryAbstracta fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Factory Abstracta test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelFactoryAbstracta getFixture() {
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
		setFixture(AbstractaFactory.eINSTANCE.createModelFactoryAbstracta());
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

} //ModelFactoryAbstractaTest
