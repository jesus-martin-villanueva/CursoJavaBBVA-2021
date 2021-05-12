package modelo.dao.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.PoligonoRegular;
import modelo.Rectangulo;
import modelo.Triangulo;
import modelo.dao.FiguraDAO;
import utils.ConnectionManager;

public class FiguraDAOTest {

	Cuadrado cua;
	Circulo cir;
	Rectangulo rec;
	Triangulo tri;
	PoligonoRegular pol;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Genero un lote de pruebas con 4 registros
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Eliminar los 4 registros y el agregado del método agregar
		
	}

	@Before
	public void setUp() throws Exception {
		cua = new Cuadrado("CuadradoTest", 5.6f);
		cir = new Circulo("CirculoTest", 5.6f);
		rec = new Rectangulo("RectanguloTest", 6f, 3f);
		tri = new Triangulo("TrianguloTest", 4f, 5f);
		pol = new PoligonoRegular("PoligonoTest", 8f, 12, 10);
	}

	@After
	public void tearDown() throws Exception {
		cua = null;
		cir = null;
		rec = null;
		tri = null;
		pol = null;
	}

	@Test
	public void testAgregar() {
		FiguraDAO figDao = new FiguraDAO();
		try {
			figDao.agregar(cua);
			figDao.agregar(cir);
			figDao.agregar(rec);
			figDao.agregar(tri);
			figDao.agregar(pol);
			ConnectionManager.conectar();
			Connection con = ConnectionManager.getConexion();
			Statement stm = con.createStatement();
			//ResultSet rs = stm.executeQuery("SELECT fig_nombre, fig_lado FROM Figuras WHERE fig_nombre = 'CuadradoTest';");
			ResultSet rs = stm.executeQuery("SELECT fig_nombre, fig_lado FROM Figuras WHERE fig_nombre IN ('CuadradoTest', 'CirculoTest', 'RectanguloTest', 'TrianguloTest', 'PoligonoTest');");
			assertTrue(rs.next());
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
}
