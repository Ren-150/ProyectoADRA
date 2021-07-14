package pe.com.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.com.adra.config.Conexion;
import pe.com.adra.dao.CapacitacionDao;
import pe.com.adra.model.Capacitacion;

public class CapacitacionDaoImpl implements CapacitacionDao {

	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Capacitacion c) {
		int x = 0;
		String SQL = "insert into capacitacion (id_capacitacion, nombre, fecha_inicio, fecha_cierre, cantidad_horas, id_categoria) values(null, ?, ?, ?, ?, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getFecha_inicio());
			ps.setString(3, c.getFecha_cierre());
			ps.setInt(4, c.getCantidad_horas());
			ps.setInt(5, c.getId_categoria());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Capacitacion c) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "update capacitacion set nombre = ?, fecha_inicio = ?, fecha_cierre = ?, cantidad_horas = ?, id_categoria = ? where id_capacitacion = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, c.getNombre());
			ps.setString(2, c.getFecha_inicio());
			ps.setString(3, c.getFecha_cierre());
			ps.setInt(4, c.getCantidad_horas());
			ps.setInt(5, c.getId_categoria());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public Capacitacion read(int id) {
		// TODO Auto-generated method stub
		Capacitacion c = new Capacitacion();
		String SQL = "select *from capacitacion where id_capacitacion=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				c.setId_capacitacion(rs.getInt("id_capacitacion"));
				c.setNombre(rs.getString("nombre"));
				c.setFecha_inicio(rs.getString("fecha_inicio"));
				c.setFecha_cierre(rs.getString("fecha_cierre"));
				c.setCantidad_horas(rs.getInt("cantidad_horas"));
				c.setId_categoria(rs.getInt("id_categoria"));

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
		String SQL = "delete from capacitacion where id_capacitacion=?";
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
	public List<Capacitacion> readAll() {
		// TODO Auto-generated method stub
		List<Capacitacion> lista = new ArrayList<>();
		String SQL = "select *from producto";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Capacitacion c = new Capacitacion();
				c.setId_capacitacion(rs.getInt("id_capacitacion"));
				c.setNombre(rs.getString("nombre"));
				c.setFecha_inicio(rs.getString("fecha_inicio"));
				c.setFecha_cierre(rs.getString("fecha_cierre"));
				c.setCantidad_horas(rs.getInt("cantidad_horas"));
				c.setId_categoria(rs.getInt("id_categoria"));
				lista.add(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}

}

