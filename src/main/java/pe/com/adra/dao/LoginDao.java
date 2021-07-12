package pe.com.adra.dao;

import java.util.HashMap;

public interface LoginDao {
	public HashMap<String, Object> validar(String user, String pass);
}
