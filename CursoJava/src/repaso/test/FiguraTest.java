package repaso.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	
	ArrayList<Figura> figuras;

	@Before
	public void setUp() throws Exception {
	    cuadrado = new Cuadrado("cua1", 10);
		circulo = new Circulo("cir1", 10f);
		triangulo = new Triangulo("tri1", 10f, 10f);
		rectangulo = new Rectangulo("rec1", 10, 10);
		//poligonoRegular = new PoligonoRegular("pol1", );
		
		figuras = new ArrayList<Figura>();
		figuras.add(new Cuadrado("cua1", 10));
		figuras.add(new Circulo("cir1", 10f));
		figuras.add(new Triangulo("tri1", 10f, 10f));
		figuras.add(new Rectangulo("rec1", 10, 10));
		//figuras.add(new PoligonoRegular("pol1", ));
	}

	@After
	public void tearDown() throws Exception {
		cuadrado = null;
		circulo = null;
		triangulo = null;
		rectangulo = null;
		//poligonoRegular = null;
		
		figuras = null;
	}

	//CUADRADO
	
	@Test
	public void testCalcularPerimetro_Cuadrado() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(40, cuadrado.calcularPerimetro(), 0.1);
	}
	
	@Test
	public void testCalcularSuperficie_Cuadrado() {
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
	
	@Test
	public void testEqualsyHashCode_Cuadrado(){
		Cuadrado cuaPrueba = new Cuadrado("cua1", 10);
		assertTrue(figuras.contains(cuaPrueba));
	}
	
	//FIN CUADRADO
	
	//CIRCULO
	
	@Test
	public void testCalcularPerimetro_Circulo() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(40, circulo.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_Circulo() {
		assertEquals(100, circulo.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_Circulo() {
		assertEquals("l=10.0", circulo.getValores());
	}
		
	@Test
	public void testGetNombre_Circulo() {
		assertEquals("cua1", circulo.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_Circulo(){
		Cuadrado cuaPrueba = new Cuadrado("cua1", 10);
		assertTrue(figuras.contains(cuaPrueba));
	}
		
	//FIN CIRCULO
		
	//RECTANGULO
		
	@Test
	public void testCalcularPerimetro_Rectangulo() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(40, rectangulo.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_Rectangulo() {
		assertEquals(100, rectangulo.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_Rectangulo() {
		assertEquals("l=10.0", rectangulo.getValores());
	}
		
	@Test
	public void testGetNombre_Rectangulo() {
		assertEquals("cua1", rectangulo.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_Rectangulo(){
		Cuadrado cuaPrueba = new Cuadrado("cua1", 10);
		assertTrue(figuras.contains(cuaPrueba));
	}
		
	//FIN RECTANGULO
		
	//TRIANGULO
		
	@Test
	public void testCalcularPerimetro_Triangulo() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(40, triangulo.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_Triangulo() {
		assertEquals(100, triangulo.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_Triangulo() {
		assertEquals("l=10.0", triangulo.getValores());
	}
		
	@Test
	public void testGetNombre_Triangulo() {
		assertEquals("cua1", triangulo.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_Triangulo(){
		Cuadrado cuaPrueba = new Cuadrado("cua1", 10);
		assertTrue(figuras.contains(cuaPrueba));
	}
		
	//FIN TRIANGULO
		
	//POLIGONO REGULAR
		
	/*@Test
	public void testCalcularPerimetro_PoligonoRegular() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(40, poligonoRegular.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_PoligonoRegular() {
		assertEquals(100, poligonoRegular.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_PoligonoRegular() {
		assertEquals("l=10.0", poligonoRegular.getValores());
	}
		
	@Test
	public void testGetNombre_PoligonoRegular() {
		assertEquals("cua1", poligonoRegular.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_PoligonoRegular(){
		PoligonoRegular polPrueba = new PoligonoRegular("cua1", 10);
		assertTrue(figuras.contains(polPrueba));
	}*/
		
	//FIN POLIGONO REGULAR
}
