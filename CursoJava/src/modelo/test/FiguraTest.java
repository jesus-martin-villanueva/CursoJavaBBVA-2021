package modelo.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Figura;
import modelo.PoligonoRegular;
import modelo.Rectangulo;
import modelo.Triangulo;

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
		triangulo = new Triangulo("tri1", 3f, 4f);
		rectangulo = new Rectangulo("rec1", 10, 5);
		poligonoRegular = new PoligonoRegular("pol1", 4f, 6, 5);
		
		figuras = new ArrayList<Figura>();
		figuras.add(new Cuadrado("cua1", 10));
		figuras.add(new Circulo("cir1", 10f));
		figuras.add(new Triangulo("tri1", 3f, 4f));
		figuras.add(new Rectangulo("rec1", 10, 5));
		figuras.add(new PoligonoRegular("pol1", 4f, 6, 5));
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
		assertEquals(62.83185307, circulo.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_Circulo() {
		assertEquals(314.1592654, circulo.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_Circulo() {
		assertEquals("Nombre: cir1, Radio: 10.0", circulo.getValores());
	}
		
	@Test
	public void testGetNombre_Circulo() {
		assertEquals("cir1", circulo.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_Circulo(){
		Circulo cirPrueba = new Circulo("cir1", 10f);
		assertTrue(figuras.contains(cirPrueba));
	}
		
	//FIN CIRCULO
		
	//RECTANGULO
		
	@Test
	public void testCalcularPerimetro_Rectangulo() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(30, rectangulo.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_Rectangulo() {
		assertEquals(50, rectangulo.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_Rectangulo() {
		assertEquals("h=10.0, b=5.0", rectangulo.getValores());
	}
		
	@Test
	public void testGetNombre_Rectangulo() {
		assertEquals("rec1", rectangulo.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_Rectangulo(){
		Rectangulo recPrueba = new Rectangulo("rec1", 10, 5);
		assertTrue(figuras.contains(recPrueba));
	}
		
	//FIN RECTANGULO
		
	//TRIANGULO
		
	@Test
	public void testCalcularPerimetro_Triangulo() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(12, triangulo.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_Triangulo() {
		assertEquals(6, triangulo.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_Triangulo() {
		assertEquals("Nombre: tri1, Altura: 3.0, Base: 4.0", triangulo.getValores());
	}
		
	@Test
	public void testGetNombre_Triangulo() {
		assertEquals("tri1", triangulo.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_Triangulo(){
		Triangulo triPrueba = new Triangulo("tri1", 3f, 4f);
		assertTrue(figuras.contains(triPrueba));
	}
		
	//FIN TRIANGULO
		
	//POLIGONO REGULAR
		
	@Test
	public void testCalcularPerimetro_PoligonoRegular() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(30, poligonoRegular.calcularPerimetro(), 0.1);
	}
		
	@Test
	public void testCalcularSuperficie_PoligonoRegular() {
		assertEquals(60, poligonoRegular.calcularSuperficie(), 0.1);
	}
		
	@Test
	public void testGetValores_PoligonoRegular() {
		assertEquals("Apotema=4.0, l=6,CantL=5", poligonoRegular.getValores());
	}
		
	@Test
	public void testGetNombre_PoligonoRegular() {
		assertEquals("pol1", poligonoRegular.getNombre());
	}
	
	@Test
	public void testEqualsyHashCode_PoligonoRegular(){
		PoligonoRegular polPrueba = new PoligonoRegular("pol1", 4f, 6, 5);
		assertTrue(figuras.contains(polPrueba));
	}
		
	//FIN POLIGONO REGULAR
}
