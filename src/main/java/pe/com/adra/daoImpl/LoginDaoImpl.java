package pe.com.adra.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import pe.com.adra.dao.LoginDao;

public class LoginDaoImpl implements LoginDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;
	public HashMap<String, Object> validar(String user, String pass){
		String SQL;
		
		throw new UnsupportedOperationException("Not supported yet.");
	
	}

}
