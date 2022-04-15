package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CompraDao;
import br.com.fiap.entity.Compra;

public class CompraDaoImpl extends GenericDaoImpl<Compra, Integer> implements CompraDao{

	public CompraDaoImpl(EntityManager em) {
		super(em);
	}

}
