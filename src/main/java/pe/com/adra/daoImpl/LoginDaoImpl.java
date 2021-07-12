package pe.com.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import pe.com.adra.config.Conexion;
import pe.com.adra.dao.LoginDao;

public class LoginDaoImpl implements LoginDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	
	
	public HashMap<String, Object> validar(String user, String pass){
		String SQL = "SELECT c.id_persona, c.Nombre_usuario, p.Nombre, r.Nombre AS ROL FROM CREDENCIAL c "
					+ "INNER JOIN PERSONA p ON c.id_persona = p.id_persona "
					+ "INNER JOIN CUENTA_ROL cr ON c.id_persona = cr.id_persona"
					+ "INNER JOIN ROL r ON cr.id_rol = r.id_rol " +
					"WHERE c.Nombre_usuario = '?' AND c.Contrasenia = '?' ";
		HashMap<String, Object> datos = new HashMap<>();
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while(rs.next()) {
				datos.put("id_persona",rs.getInt("idusuario"));
				datos.put("Nombre_usuario",rs.getString("Nombre_usuario"));
				datos.put("Nombre",rs.getString("Nombre"));
				datos.put("Rol", rs.getString("Nombre"));
			}
		} catch (SQLException e) {
			
		}
		return datos;
	}

}
