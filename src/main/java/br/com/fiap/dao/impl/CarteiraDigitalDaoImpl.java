package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CarteiraDigitalDao;
import br.com.fiap.entity.CarteiraDigital;

public class CarteiraDigitalDaoImpl extends GenericDaoImpl<CarteiraDigital, Integer> implements CarteiraDigitalDao{

	public CarteiraDigitalDaoImpl(EntityManager em) {
		super(em);
	}

}
