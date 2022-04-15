package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDao<T,K> {
	
	void cadastrar(T entidade);
	
	void atualizar(T entidade);
	
	T buscar (K id) throws IdNotFoundException;
	
	void deletar(K id) throws IdNotFoundException;
	
	void commit() throws CommitException;
}
