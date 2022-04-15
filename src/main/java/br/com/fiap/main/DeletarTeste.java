package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CartaoCreditoDao;
import br.com.fiap.dao.CidadeDao;
import br.com.fiap.dao.CompraDao;
import br.com.fiap.dao.EnderecoDao;
import br.com.fiap.dao.EstabelecimentoDao;
import br.com.fiap.dao.TransacaoDao;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.dao.impl.CartaoCreditoDaoImpl;
import br.com.fiap.dao.impl.CidadeDaoImpl;
import br.com.fiap.dao.impl.CompraDaoImpl;
import br.com.fiap.dao.impl.EnderecoDaoImpl;
import br.com.fiap.dao.impl.EstabelecimentoDaoImpl;
import br.com.fiap.dao.impl.TransacaoDaoImpl;
import br.com.fiap.dao.impl.UsuarioDaoImpl;

import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class DeletarTeste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		CartaoCreditoDao cartaoDao = new CartaoCreditoDaoImpl(em);
		CidadeDao cidadeDao = new CidadeDaoImpl(em);
		CompraDao compraDao = new CompraDaoImpl(em);
		EnderecoDao enderecoDao = new EnderecoDaoImpl(em);
		EstabelecimentoDao estabelecimentoDao = new EstabelecimentoDaoImpl(em);
		TransacaoDao transacaoDao = new TransacaoDaoImpl(em);
		UsuarioDao usuarioDao = new UsuarioDaoImpl(em);
		
		try {
			
			cartaoDao.deletar(1);
			cartaoDao.commit();
		
			
			cidadeDao.deletar(1);
			cidadeDao.commit();
			
			compraDao.deletar(1);
			compraDao.commit();
			
			enderecoDao.deletar(1);
			enderecoDao.commit();
			
			estabelecimentoDao.deletar(1);
			estabelecimentoDao.commit();
			
			transacaoDao.deletar(1);
			transacaoDao.commit();
			
			usuarioDao.deletar(1);
			usuarioDao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();

	}

}
