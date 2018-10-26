package dao;

import java.util.List;

public interface Dao<T> {
	void salvar(T entidade);
	List<T> listarTudo();
	void deletar(T entidade);
	}
