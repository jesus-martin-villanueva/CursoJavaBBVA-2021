package utils.test;

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
import utils.FiguraFileUtil;

public class FiguraFileUtilTest {
	
	ArrayList<Figura> figuras;
	String path;
	String nombreArchivo;
	FiguraFileUtil figura;

	@Before
	public void setUp() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("user.dir") + "src/utils/test/Test.json");
		path = sb.toString();
		nombreArchivo = "Test.json";
		
		figuras = new ArrayList<Figura>();
		figuras.add(new Cuadrado("cua1", 10));
		figuras.add(new Circulo("cir1", 10f));
		figuras.add(new Rectangulo("rec1", 10, 5));
		figuras.add(new Triangulo("tri1", 3f, 4f));
		figuras.add(new PoligonoRegular("pol1", 4f, 6, 5));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGenerarArchivo_Figura() {
		assertEquals(figuras, FiguraFileUtil.leerArchivo(nombreArchivo, path));
	}
	
	@Test
	public void testLeerArchivo_Figura() {
		try {
			FiguraFileUtil.generarArchivo(figuras, nombreArchivo, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}