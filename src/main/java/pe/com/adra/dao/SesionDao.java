package pe.com.adra.dao;

import java.util.List;

import pe.com.adra.model.Sesion;

public interface SesionDao {
	
	int create(Sesion s);
	int update(Sesion s);
	int delete(int id);
	Sesion read(int id);
	List<Sesion> readAll();
}
