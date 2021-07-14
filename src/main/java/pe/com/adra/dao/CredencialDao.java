package pe.com.adra.dao;

import java.util.List;

import pe.com.adra.model.Credencial;

public interface CredencialDao {
	int create(Credencial c);
	int update(Credencial c);
	int delete(int id);
	Credencial read(int id);
	List<Credencial> readAll();
}
