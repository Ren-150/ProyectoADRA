package pe.com.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.com.adra.config.Conexion;
import pe.com.adra.dao.CategoriaDao;
import pe.com.adra.model.Categoria;

public class CategoriaDaoImpl implements CategoriaDao {

	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Categoria c) {
		int x = 0;
		String SQL = "insert into categoria (id_categoria, nombre) values(null, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, c.getNombre());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Categoria p) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "update categoria set nombre = ? where id_categoria = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, p.getNombre());
			ps.setInt(2, p.getId_categoria());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		Categoria c = new Categoria();
		String SQL = "select *from categoria where id_categoria=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				c.setId_categoria(rs.getInt("id_categoria"));
				c.setNombre(rs.getString("nombre"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return c;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String SQL = "delete from categoria where id_categoria=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		List<Categoria> lista = new ArrayList<>();
		String SQL = "select *from producto";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Categoria c = new Categoria();
				c.setId_categoria(rs.getInt("id_categoria"));
				c.setNombre(rs.getString("nombre"));
				lista.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}

}
