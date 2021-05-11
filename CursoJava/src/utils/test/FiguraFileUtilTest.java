package utils.test;

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

public class FiguraFileUtilTest {
	
	ArrayList<Figura> figuras;

	@Before
	public void setUp() throws Exception {
		figuras = new ArrayList<Figura>();
		figuras.add(new Cuadrado("cua1", 10));
		figuras.add(new Circulo("cir1", 10f));
		figuras.add(new Triangulo("tri1", 3f, 4f));
		figuras.add(new Rectangulo("rec1", 10, 5));
		figuras.add(new PoligonoRegular("pol1", 4f, 6, 5));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalcularPerimetro_Cuadrado() {
		//Resultado a esperar, método a probar, precisión
		assertEquals(40, cuadrado.calcularPerimetro(), 0.1);
	}

}
