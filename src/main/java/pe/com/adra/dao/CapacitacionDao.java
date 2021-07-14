package pe.com.adra.dao;

import java.util.List;

import pe.com.adra.model.Capacitacion;

public interface CapacitacionDao {
	int create(Capacitacion c);
	int update(Capacitacion c);
	int delete(int id);
	Capacitacion read(int id);
	List<Capacitacion> readAll();
}
