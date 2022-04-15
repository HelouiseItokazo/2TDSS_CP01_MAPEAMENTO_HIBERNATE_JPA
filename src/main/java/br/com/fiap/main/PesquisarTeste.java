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
import br.com.fiap.entity.CartaoCredito;
import br.com.fiap.entity.Cidade;
import br.com.fiap.entity.Compra;
import br.com.fiap.entity.Endereco;
import br.com.fiap.entity.Estabelecimento;
import br.com.fiap.entity.Transacao;
import br.com.fiap.entity.Usuario;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class PesquisarTeste {

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
			
			CartaoCredito cartaoCredito = cartaoDao.buscar(1);
			System.out.println(cartaoCredito.toString());
			
			Cidade cidade = cidadeDao.buscar(1);
			System.out.println(cidade.toString());
			
			Compra compra = compraDao.buscar(1);
			System.out.println(compra.toString());
			
			Endereco endereco = enderecoDao.buscar(1);
			System.out.println(endereco.toString());
			
			Estabelecimento estabelecimento = estabelecimentoDao.buscar(1);
			System.out.println(estabelecimento.toString());
			
			Transacao transacao = transacaoDao.buscar(1);
			System.out.println(transacao.toString());
			
			Usuario usuario = usuarioDao.buscar(1);
			System.out.println(usuario.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();
	}//main

}//PesquisarTeste
