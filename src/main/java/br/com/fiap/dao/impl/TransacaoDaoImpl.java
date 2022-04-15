package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TransacaoDao;
import br.com.fiap.entity.Transacao;

public class TransacaoDaoImpl extends GenericDaoImpl<Transacao, Integer> implements TransacaoDao{

	public TransacaoDaoImpl(EntityManager em) {
		super(em);
	}

}
