package hn.uth.aplicacion_simple_maven_consola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@BeforeClass
	public void configuracionInicial() {
		System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
	}
   
	@Test
	public void testSuma1() {
		assertEquals(App.sumar(5.0, 6.0), 11.0, .0001);
	}
	
	@Test
	public void testSuma2() {
		assertTrue(App.sumar(4.5, 3.8) == 8.3);
	}
	
	@AfterClass
	public void finalizacionPruebas() {
		System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
	}
}
