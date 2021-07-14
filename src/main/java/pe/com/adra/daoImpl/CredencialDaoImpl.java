package pe.com.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.com.adra.config.Conexion;
import pe.com.adra.dao.CredencialDao;
import pe.com.adra.model.Credencial;

public class CredencialDaoImpl implements CredencialDao{
	
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	
	@Override
	public int create(Credencial c) {
		int x = 0;
		String SQL = "insert into credencial (id_persona, nombre_usuario, contrasenia, estado) values(null, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, c.getNombre_usuario());
			ps.setString(2, c.getContrasenia());
			ps.setString(3, c.getEstado());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}
	
	@Override
	public int update(Credencial c) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "update credencial set nombre_usuario = ?, contrasenia = ?, estado = ? where id_persona = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, c.getNombre_usuario());
			ps.setString(2, c.getContrasenia());
			ps.setString(3, c.getEstado());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public Credencial read(int id) {
		// TODO Auto-generated method stub
		Credencial c = new Credencial();
		String SQL = "select *from credencial where id_persona=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				c.setId_persona(rs.getInt("id_persona"));
				c.setNombre_usuario(rs.getString("nombre"));
				c.setContrasenia(rs.getString("contrasenia"));
				c.setEstado(rs.getString("estado"));
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
		String SQL = "delete from credencial where id_persona=?";
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
	public List<Credencial> readAll() {
		// TODO Auto-generated method stub
		List<Credencial> lista = new ArrayList<>();
		String SQL = "select *from credencial";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Credencial c = new Credencial();
				c.setId_persona(rs.getInt("id_persona"));
				c.setNombre_usuario(rs.getString("nombre"));
				c.setContrasenia(rs.getString("contrasenia"));
				c.setEstado(rs.getString("estado"));
				lista.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}
}
