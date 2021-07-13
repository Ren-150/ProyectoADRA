package pe.com.adra.dao;

import java.util.List;
import pe.com.adra.model.Categoria;

public interface CategoriaDao {
	int create(Categoria c);
	int update(Categoria c);
	int delete(int id);
	Categoria read(int id);
	List<Categoria> readAll();
}
