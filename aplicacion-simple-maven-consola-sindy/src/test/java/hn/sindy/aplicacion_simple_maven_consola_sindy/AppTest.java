package hn.sindy.aplicacion_simple_maven_consola_sindy;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
   
	@Before
	public void configuracionInicial() {
		System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
	}
	
	@Test
	public void testSuma1() {
		assertEquals (App.sumar(5.0, 6.0),11.0, .001);
	}
	
	@Test
	public void testSuma2() {
		assertTrue(App.sumar(4.5, 3.8) == 8.3);
	}
	
	@After
	public void finalizacionPruebas() {
		System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
	}
}
