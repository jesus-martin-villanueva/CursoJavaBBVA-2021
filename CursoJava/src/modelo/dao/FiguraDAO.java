package modelo.dao;

import java.sql.SQLException;
import java.util.List;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.PoligonoRegular;
import modelo.Rectangulo;
import modelo.Triangulo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utils.ConnectionManager;

public class FiguraDAO implements DAO {

	@Override
	public void agregar(Object obj) throws ClassNotFoundException, SQLException {
		PreparedStatement stm = null;
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConexion();
		StringBuilder inserts = new StringBuilder("INSERT INTO Figuras(fig_nombre, fig_tipo, ");
		if(obj instanceof Cuadrado) {
			Cuadrado cuadrado = (Cuadrado) obj;
			inserts.append("fig_lado) VALUES (?, ?, ?)");
			stm = con.prepareStatement(inserts.toString());
			stm.setString(1, cuadrado.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, cuadrado.getLado());
		}
		if(obj instanceof Circulo) {
			Circulo circulo = (Circulo) obj;
			inserts.append("fig_radio) VALUES (?, ?, ?)");
			stm = con.prepareStatement(inserts.toString());
			stm.setString(1, circulo.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, circulo.getRadio());
		}
		if(obj instanceof Rectangulo) {
			Rectangulo rectangulo = (Rectangulo) obj;
			inserts.append("fig_altura, fig_base) VALUES (?, ?, ?, ?)");
			stm = con.prepareStatement(inserts.toString());
			stm.setString(1, rectangulo.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, rectangulo.getAltura());
			stm.setFloat(4, rectangulo.getBase());
		}
		if(obj instanceof Triangulo) {
			Triangulo triangulo = (Triangulo) obj;
			inserts.append("fig_altura, fig_base) VALUES (?, ?, ?, ?)");
			stm = con.prepareStatement(inserts.toString());
			stm.setString(1, triangulo.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, triangulo.getAltura());
			stm.setFloat(4, triangulo.getBase());
		}
		if(obj instanceof PoligonoRegular) {
			PoligonoRegular poligono = (PoligonoRegular) obj;
			inserts.append("fig_lado, fig_apotema, fig_numlados) VALUES (?, ?, ?, ?, ?)");
			stm = con.prepareStatement(inserts.toString());
			stm.setString(1, poligono.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, poligono.getLado());
			stm.setFloat(4, poligono.getApotema());
			stm.setFloat(5, poligono.getCantidadDeLados());
		}
		stm.execute();
		stm.close();
		con.close();
	}

	@Override
	public void eliminar(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List leer(Object obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
