package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CartaoCreditoDao;
import br.com.fiap.entity.CartaoCredito;

public class CartaoCreditoDaoImpl extends GenericDaoImpl<CartaoCredito, Integer> implements CartaoCreditoDao{

	public CartaoCreditoDaoImpl(EntityManager em) {
		super(em);
	}

}
