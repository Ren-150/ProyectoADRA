package pe.com.adra.dao;

import java.util.List;

import pe.com.adra.model.Persona;

public interface PersonaDao {

	int create(Persona p);
	int update(Persona p);
	int delete(int id);
	Persona read(int id);
	List<Persona> readAll();
}
