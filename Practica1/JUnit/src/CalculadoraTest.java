import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class CalculadoraTest {

	Calculadora c;

	// Before y BeforeClass

	@Before
	public void setUp() {

		c = new Calculadora();

		System.out.println("setUp");

	}

	@BeforeClass
	public static void setUpBeforeClass() {

		System.out.println("BeforeClass");

	}

	@Test
	public void sumaTest() {

		double valorEsperado = 4.0;
		double valorReal = c.suma(2, 2); // 2+2 = 4

		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("sumarTest");
	}

	@Test
	public void restaTest() {

		double valorEsperado = 0;
		double valorReal = c.resta(2, 2); // 2-2 = 0

		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("restarTest");
	}

	@Test
	public void multiplicacionTest() {

		double valorEsperado = 9.0;
		double valorReal = c.multiplicacion(3, 3); // 3*3 = 9

		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("multiplicarTest");
	}

	@Test
	public void divisionTest() {

		double valorEsperado = 1.0;
		double valorReal = c.division(4, 4); // 4/4 = 1

		assertEquals(valorEsperado, valorReal, 0.001);
		System.out.println("dividirTest");
	}

	// After y AfterClass

	@After
	public void after() {

		c = null;

		System.out.println("After");

	}

	@AfterClass
	public static void setUpAfterClass() {
		// c=null
		System.out.println("AfterClass");

	}

}
