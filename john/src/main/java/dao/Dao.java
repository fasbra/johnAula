package dao;

import java.util.List;

public interface Dao<T> {

	public void salvar(T entidade);
	public List<T> listarTudo();
	public void deletar(T entidade);
	
}
