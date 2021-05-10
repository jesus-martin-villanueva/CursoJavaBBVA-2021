package repaso.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import repaso.Circulo;
import repaso.Cuadrado;
import repaso.Figura;
import repaso.PoligonoRegular;
import repaso.Rectangulo;
import repaso.Triangulo;

public class FiguraTest {
	
	/*Pasos para trabajar con objetos: Definición - Creación - Asignación*/
	
	Figura cuadrado;
	Figura circulo;
	Figura triangulo;
	Figura rectangulo;
	Figura poligonoRegular;

	@Before
	public void setUp() throws Exception {
		cuadrado = new Cuadrado("cua1", 10);
		circulo = new Circulo("cir1", 10f);
		triangulo = new Triangulo("tri1", 10f, 10f);
		rectangulo = new Rectangulo("rec1", 10, 10);
		//poligonoRegular = new PoligonoRegular("pol1", );
	}

	@After
	public void tearDown() throws Exception {
		cuadrado = null;
		circulo = null;
		triangulo = null;
		rectangulo = null;
		//poligonoRegular = null;
	}

	//CUADRADO
	
	@Test
	public void testCalcularPerimetro_Cuadrado() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(40, cuadrado.calcularPerimetro(), 0.1);
	}
	
	@Test
	public void testCalcularSuperficie_Circulo() {
		assertEquals(100, cuadrado.calcularSuperficie(), 0.1);
	}
	
	@Test
	public void testGetValores_Cuadrado() {
		assertEquals("l=10.0", cuadrado.getValores());
	}
	
	@Test
	public void testGetNombre_Cuadrado() {
		assertEquals("cua1", cuadrado.getNombre());
	}
	
	//FIN CUADRADO
}
