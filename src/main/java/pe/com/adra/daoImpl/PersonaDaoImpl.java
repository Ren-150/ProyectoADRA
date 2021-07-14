package pe.com.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.com.adra.config.Conexion;
import pe.com.adra.dao.PersonaDao;
import pe.com.adra.model.Persona;

public class PersonaDaoImpl implements PersonaDao{
	
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	
	public int create(Persona p) {
		int x = 0;
		String SQL = "insert into persona (id_persona, nombre, apellido_pat, apellido_mat, correo_electronico, dni) values(null, ?, ?, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getApellido_pat());
			ps.setString(3, p.getApellido_mat());
			ps.setString(4, p.getCorreo_electronico());
			ps.setString(5, p.getDni());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "update persona set nombre = ?, apellido_pat = ?, apellido_mat = ?, correo_electronico = ?, dni = ? where id_persona = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getApellido_pat());
			ps.setString(3, p.getApellido_mat());
			ps.setString(4, p.getCorreo_electronico());
			ps.setString(5, p.getDni());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public Persona read(int id) {
		// TODO Auto-generated method stub
		Persona p = new Persona();
		String SQL = "select *from persona where id_persona=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				p.setId_persona(rs.getInt("id_persona"));
				p.setNombre(rs.getString("nombre"));
				p.setApellido_pat(rs.getString("fecha_inicio"));
				p.setApellido_mat(rs.getString("fecha_cierre"));
				p.setCorreo_electronico(rs.getString("correo_electronico"));
				p.setDni(rs.getString("dni"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return p;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String SQL = "delete from persona where id_persona=?";
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
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		List<Persona> lista = new ArrayList<>();
		String SQL = "select *from persona";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Persona p = new Persona();
				p.setId_persona(rs.getInt("id_persona"));
				p.setNombre(rs.getString("nombre"));
				p.setApellido_pat(rs.getString("fecha_inicio"));
				p.setApellido_mat(rs.getString("fecha_cierre"));
				p.setCorreo_electronico(rs.getString("correo_electronico"));
				p.setDni(rs.getString("dni"));
				lista.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}
}
