package pe.com.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.com.adra.config.Conexion;
import pe.com.adra.dao.SesionDao;
import pe.com.adra.model.Sesion;

public class SesionDaoImpl implements SesionDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	
	public int create(Sesion s) {
		int x = 0;
		String SQL = "insert into sesion (id_sesion, tema, objetivo, id_capacitacion) values(null, ?,?,?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, s.getTema());
			ps.setString(2, s.getObjetivo());
			ps.setInt(3, s.getId_capacitacion());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Sesion s) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "update sesion set tema = ?, objetivo = ?, id_capacitacion = ? where id_sesion = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, s.getTema());
			ps.setString(2, s.getObjetivo());
			ps.setInt(3, s.getId_capacitacion());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public Sesion read(int id) {
		// TODO Auto-generated method stub
		Sesion s = new Sesion();
		String SQL = "select *from sesion where id_sesion=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				s.setId_sesion(rs.getInt("id_sesion"));
				s.setTema(rs.getString("tema"));
				s.setObjetivo(rs.getString("objetivo"));
				s.setId_capacitacion(rs.getInt("cantidad"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return s;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String SQL = "delete from sesion where id_sesion=?";
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
	public List<Sesion> readAll() {
		// TODO Auto-generated method stub
		List<Sesion> lista = new ArrayList<>();
		String SQL = "select *from sesion";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Sesion s = new Sesion();
				s.setId_sesion(rs.getInt("id_sesion"));
				s.setTema(rs.getString("tema"));
				s.setObjetivo(rs.getString("objetivo"));
				s.setId_capacitacion(rs.getInt("cantidad"));
				lista.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}
}
