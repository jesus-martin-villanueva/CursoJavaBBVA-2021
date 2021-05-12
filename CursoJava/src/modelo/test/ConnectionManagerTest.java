package modelo.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utils.ConnectionManager;

public class ConnectionManagerTest {

	@Test
	public void testConectar() {
		try {
			ConnectionManager.conectar();
			assertTrue(true);
		} catch (ClassNotFoundException | SQLException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
}
